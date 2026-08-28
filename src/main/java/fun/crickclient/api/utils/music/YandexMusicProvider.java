package fun.crickclient.api.utils.music;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import fun.crickclient.api.utils.music.LrcLoader.LyricLine;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Base64;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/**
 * Яндекс Музыка: чтение состояния воспроизведения + тексты песен.
 *
 * <p>Состояние «сейчас играет» берётся из ynison (WebSocket-протокол синхронизации
 * состояния между устройствами Yandex Music): клиент регистрируется как устройство
 * «CrickClient» и получает player_state от активной сессии пользователя
 * (браузер/десктоп/телефон — любое). Управление (пауза/seek) через ynison из
 * внешнего устройства не поддерживается — для этого остаётся приложение YM.
 *
 * <p>Всё сетевое — в фоновом потоке; tryPoll() читает только volatile-снимок
 * и не блокирует игровой тред.
 *
 * <p>Портировано из single-header ym_api.hpp (LGPL-3, credits: Yandex, MarshalX,
 * uwukson4800) — только части, нужные клиенту: REST + ynison + lyrics.
 */
public class YandexMusicProvider {

    private static final String BASE_URL = "https://api.music.yandex.net";
    private static final String REDIRECT_HOST = "ynison.music.yandex.ru";
    private static final String REDIRECT_PATH = "/redirector.YnisonRedirectService/GetRedirectToYnison";
    private static final String STATE_PATH = "/ynison_state.YnisonStateService/PutYnisonState";
    private static final String CLIENT_HEADER = "YandexMusicAndroid/23020251";
    private static final String LYRICS_SECRET = "p93jhgh689SBReK6ghtw62";
    private static final long NEGATIVE_CACHE_MS = 30_000L;

    private final MusicSettings settings;
    private final HttpClient http;
    /** Цикл подключения ynison (занимает поток надолго — отдельно от сетевых задач). */
    private final ExecutorService loopExec;
    /** REST-запросы (мета треков, тексты). */
    private final ExecutorService io;
    private final String deviceId = UUID.randomUUID().toString();

    // --- последнее известное состояние (пишет WS-поток, читает игровой тред) ---
    private volatile String curTrackId = "";    // playable_id вида "track:1234567"
    private volatile long curProgressMs;
    private volatile long curDurationMs;
    private volatile boolean curPaused = true;
    private volatile boolean socketAlive;
    private volatile boolean running;
    private volatile long generation;
    private volatile YnisonWs stateSocket;

    // --- кэши ---
    private final Map<String, Meta> metaCache = new ConcurrentHashMap<>();
    private final Map<String, Boolean> metaInflight = new ConcurrentHashMap<>();
    private final Map<String, List<LyricLine>> lyricsCache = new ConcurrentHashMap<>();
    private final Map<String, Long> lyricsNegative = new ConcurrentHashMap<>();
    private final Map<String, Boolean> lyricsInflight = new ConcurrentHashMap<>();

    public YandexMusicProvider(MusicSettings settings) {
        this.settings = settings;
        this.http = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(10))
                .followRedirects(HttpClient.Redirect.NORMAL)
                .build();
        this.loopExec = Executors.newSingleThreadExecutor(r -> {
            Thread t = new Thread(r, "ym-loop");
            t.setDaemon(true);
            return t;
        });
        this.io = Executors.newCachedThreadPool(r -> {
            Thread t = new Thread(r, "ym-io");
            t.setDaemon(true);
            return t;
        });
    }

    // ===================== Жизненный цикл =====================

    public synchronized void ensureStarted() {
        if (running) return;
        running = true;
        socketAlive = false;
        long gen = ++generation;
        loopExec.submit(() -> loop(gen));
    }

    public synchronized void stop() {
        running = false;
        generation++;
        socketAlive = false;
        curTrackId = "";
        YnisonWs ws = stateSocket;
        stateSocket = null;
        if (ws != null) ws.close();
    }

    /** Смена токена — переподключение с нуля. */
    public synchronized void restart() {
        stop();
        ensureStarted();
    }

    public boolean isConnected() {
        return running && socketAlive;
    }

    private void loop(long gen) {
        while (running && generation == gen) {
            String token = settings.yandexToken();
            if (token == null || token.isEmpty()) {
                sleep(5000);
                continue;
            }
            if (!validateToken(token)) {
                sleep(10000);
                continue;
            }
            runSocketSession(token, gen);
            if (running && generation == gen) sleep(5000);
        }
    }

    private boolean validateToken(String token) {
        try {
            String resp = httpGet(BASE_URL + "/account/status", token);
            JsonObject j = JsonParser.parseString(resp).getAsJsonObject();
            return j.has("result");
        } catch (Exception e) {
            return false;
        }
    }

    // ===================== ynison =====================

    private void runSocketSession(String token, long gen) {
        String host;
        String ticket;
        try {
            String[] redirect = openRedirect(token);
            if (redirect == null) return;
            host = redirect[0];
            ticket = redirect[1];
        } catch (Exception e) {
            return;
        }

        int port = 443;
        int colon = host.lastIndexOf(':');
        if (colon > 0) {
            try {
                port = Integer.parseInt(host.substring(colon + 1));
                host = host.substring(0, colon);
            } catch (NumberFormatException ignored) {
            }
        }

        YnisonWs ws = null;
        try {
            ws = YnisonWs.connect(host, port, STATE_PATH, wsHeaders(token, deviceProtocolJson(ticket)), 15000, 30000);
            stateSocket = ws;
            socketAlive = false;
            ws.sendText(initialStateMessage());
            while (running && generation == gen) {
                try {
                    String raw = ws.readText();
                    if (raw == null) break; // сервер закрыл сессию
                    handleStateMessage(raw);
                } catch (SocketTimeoutException ignored) {
                    // тишина — соединение живо, ждём дальше
                } catch (IOException e) {
                    break;
                }
            }
        } catch (Exception ignored) {
        } finally {
            if (stateSocket == ws) stateSocket = null;
            socketAlive = false;
            if (ws != null) ws.close();
        }
    }

    /** Стадия 1: запрос redirect (host + ticket) у redirector-сервиса. */
    private String[] openRedirect(String token) {
        YnisonWs ws = null;
        try {
            ws = YnisonWs.connect(REDIRECT_HOST, 443, REDIRECT_PATH,
                    wsHeaders(token, deviceProtocolJson(null)), 15000, 15000);
            String raw = ws.readText();
            if (raw == null) return null;
            JsonObject j = JsonParser.parseString(raw).getAsJsonObject();
            String host = j.has("host") && j.get("host").isJsonPrimitive() ? j.get("host").getAsString() : null;
            String ticket = j.has("redirect_ticket") && j.get("redirect_ticket").isJsonPrimitive()
                    ? j.get("redirect_ticket").getAsString() : null;
            if (host == null || ticket == null) return null;
            return new String[]{host, ticket};
        } catch (Exception e) {
            return null;
        } finally {
            if (ws != null) ws.close();
        }
    }

    /** Доп. заголовки handshake (subprotocol с JSON устройства — см. YnisonWs). */
    private Map<String, String> wsHeaders(String token, String deviceProtocol) {
        Map<String, String> h = new LinkedHashMap<>();
        h.put("Sec-WebSocket-Protocol", "Bearer, v2, " + deviceProtocol);
        h.put("Authorization", "OAuth " + token);
        h.put("Origin", "http://music.yandex.ru");
        h.put("User-Agent", "CrickClient/1.0");
        return h;
    }

    private String deviceProtocolJson(String redirectTicket) {
        JsonObject o = new JsonObject();
        o.addProperty("Ynison-Device-Id", deviceId);
        o.addProperty("Ynison-Device-Info", "{\"app_name\":\"CrickClient\",\"type\":1}");
        if (redirectTicket != null) o.addProperty("Ynison-Redirect-Ticket", redirectTicket);
        return o.toString();
    }

    /** Первичное сообщение устройства (по форме ym_api.hpp). */
    private String initialStateMessage() {
        long ts = System.currentTimeMillis();

        JsonObject version = new JsonObject();
        version.addProperty("device_id", deviceId);
        version.addProperty("version", ts);
        version.addProperty("timestamp_ms", ts);

        JsonObject options = new JsonObject();
        options.addProperty("repeat_mode", "NONE");

        JsonObject queue = new JsonObject();
        queue.addProperty("current_playable_index", -1);
        queue.addProperty("entity_id", "");
        queue.addProperty("entity_type", "VARIOUS");
        queue.add("playable_list", new JsonArray());
        queue.add("options", options);
        queue.addProperty("entity_context", "BASED_ON_ENTITY_BY_DEFAULT");
        queue.add("version", version);

        JsonObject status = new JsonObject();
        status.addProperty("duration_ms", 0);
        status.addProperty("paused", true);
        status.addProperty("playback_speed", 1.0);
        status.addProperty("progress_ms", 0);
        status.add("version", version);

        JsonObject playerState = new JsonObject();
        playerState.add("player_queue", queue);
        playerState.add("status", status);

        JsonObject caps = new JsonObject();
        caps.addProperty("can_be_player", true);
        caps.addProperty("can_be_remote_controller", false);
        caps.addProperty("volume_granularity", 16);
        JsonObject info = new JsonObject();
        info.addProperty("device_id", deviceId);
        info.addProperty("type", "WEB");
        info.addProperty("title", "CrickClient");
        info.addProperty("app_name", "CrickClient");
        JsonObject vol = new JsonObject();
        vol.addProperty("volume", 50);

        JsonObject device = new JsonObject();
        device.add("capabilities", caps);
        device.add("info", info);
        device.add("volume_info", vol);
        device.addProperty("is_shadow", false);

        JsonObject fullState = new JsonObject();
        fullState.add("player_state", playerState);
        fullState.add("device", device);
        fullState.addProperty("is_currently_active", true);

        JsonObject msg = new JsonObject();
        msg.add("update_full_state", fullState);
        msg.addProperty("rid", UUID.randomUUID().toString());
        msg.addProperty("player_action_timestamp_ms", ts);
        msg.addProperty("activity_interception_type", "DO_NOT_INTERCEPT_BY_DEFAULT");
        return msg.toString();
    }

    private void handleStateMessage(String raw) {
        try {
            JsonObject j = JsonParser.parseString(raw).getAsJsonObject();
            JsonObject ps = j.getAsJsonObject("player_state");
            if (ps == null) return;
            JsonObject status = ps.getAsJsonObject("status");
            JsonObject queue = ps.getAsJsonObject("player_queue");
            if (status == null || queue == null) return;

            long progress = jsonLong(status, "progress_ms");
            long duration = jsonLong(status, "duration_ms");
            boolean paused = status.has("paused") && status.get("paused").getAsBoolean();

            String playableId = "";
            int idx = (int) jsonLong(queue, "current_playable_index");
            JsonArray list = queue.getAsJsonArray("playable_list");
            if (idx >= 0 && list != null && idx < list.size()) {
                JsonObject item = list.get(idx).getAsJsonObject();
                if (item.has("playable_id")) playableId = item.get("playable_id").getAsString();
            }

            this.curProgressMs = progress;
            this.curDurationMs = duration;
            this.curPaused = paused;
            this.socketAlive = true;

            if (!playableId.equals(curTrackId)) {
                curTrackId = playableId;
                scheduleMetaFetch();
            }
        } catch (Exception ignored) {
        }
    }

    // ===================== Публичное API =====================

    /** @return true, если известен текущий трек (списывается в {@code out}). */
    public boolean tryPoll(TrackState out) {
        String pid = curTrackId;
        if (pid == null || !pid.startsWith("track:")) return false;
        Meta m = metaCache.get(pid.substring("track:".length()));
        if (m == null) return false;

        long duration = Math.max(m.durationMs, curDurationMs);
        out.provider = "Яндекс Музыка";
        out.trackId = m.id;
        out.title = m.title;
        out.artist = m.artist;
        out.album = m.album;
        out.durationMs = duration;
        out.positionMs = Math.max(0L, Math.min(curProgressMs, duration));
        out.paused = curPaused;
        out.live = false;
        return true;
    }

    /**
     * Асинхронная загрузка текстов: сначала синхронизированный LRC из API,
     * fallback — обычный текст (строки с startMs = -1, TextMusic распределит их
     * равномерно). {@code onDone} вызывается в фоновом потоке; повторный вызов
     * до завершения — мгновенно с null (загрузка уже идёт).
     */
    public void loadLyricsAsync(String trackId, Consumer<List<LyricLine>> onDone) {
        if (trackId == null || trackId.isEmpty()) {
            onDone.accept(null);
            return;
        }
        List<LyricLine> cached = lyricsCache.get(trackId);
        if (cached != null) {
            onDone.accept(cached);
            return;
        }
        Long negative = lyricsNegative.get(trackId);
        if (negative != null && System.currentTimeMillis() - negative < NEGATIVE_CACHE_MS) {
            onDone.accept(null);
            return;
        }
        if (lyricsInflight.putIfAbsent(trackId, Boolean.TRUE) != null) {
            onDone.accept(null);
            return;
        }
        io.submit(() -> {
            try {
                List<LyricLine> lines = fetchSyncedLyrics(trackId);
                if (lines == null) lines = fetchPlainLyrics(trackId);
                if (lines == null || lines.isEmpty()) {
                    lyricsNegative.put(trackId, System.currentTimeMillis());
                } else {
                    lyricsCache.put(trackId, lines);
                }
            } finally {
                lyricsInflight.remove(trackId);
            }
            onDone.accept(lyricsCache.get(trackId));
        });
    }

    // ===================== Тексты =====================

    private List<LyricLine> fetchSyncedLyrics(String trackId) {
        try {
            long ts = System.currentTimeMillis() / 1000L;
            String sign = hmacSha256Base64(LYRICS_SECRET, trackId + ts);
            String url = BASE_URL + "/tracks/" + trackId + "/lyrics?format=LRC&timeStamp=" + ts
                    + "&sign=" + URLEncoder.encode(sign, StandardCharsets.UTF_8);
            JsonObject j = JsonParser.parseString(httpGet(url, settings.yandexToken())).getAsJsonObject();
            if (!j.has("result")) return null;
            JsonObject result = j.getAsJsonObject("result");
            if (result == null || !result.has("downloadUrl")) return null;
            String raw = httpGet(result.get("downloadUrl").getAsString(), null);
            List<LyricLine> lines = LrcLoader.parseLrc(raw);
            return lines.isEmpty() ? null : lines;
        } catch (Exception e) {
            return null;
        }
    }

    private List<LyricLine> fetchPlainLyrics(String trackId) {
        try {
            JsonObject j = JsonParser.parseString(
                    httpGet(BASE_URL + "/tracks/" + trackId + "/supplement", settings.yandexToken())).getAsJsonObject();
            if (!j.has("result")) return null;
            JsonObject result = j.getAsJsonObject("result");
            if (result == null || !result.has("lyrics")) return null;
            JsonObject lyrics = result.getAsJsonObject("lyrics");
            if (lyrics == null) return null;

            String text = null;
            for (String key : new String[]{"fullLyrics", "text"}) {
                JsonElement e = lyrics.get(key);
                if (e != null && e.isJsonPrimitive() && e.getAsJsonPrimitive().isString()) {
                    text = e.getAsString();
                    break;
                }
            }
            if (text == null || text.trim().isEmpty()) return null;

            List<LyricLine> lines = new ArrayList<>();
            for (String line : text.split("\n")) {
                String l = line.trim();
                if (!l.isEmpty()) lines.add(new LyricLine(-1L, l));
            }
            return lines.isEmpty() ? null : lines;
        } catch (Exception e) {
            return null;
        }
    }

    // ===================== Метаданные треков =====================

    private static final class Meta {
        final String id;
        final String title;
        final String artist;
        final String album;
        final long durationMs;

        Meta(String id, String title, String artist, String album, long durationMs) {
            this.id = id;
            this.title = title;
            this.artist = artist;
            this.album = album;
            this.durationMs = durationMs;
        }
    }

    private void scheduleMetaFetch() {
        String pid = curTrackId;
        if (pid == null || !pid.startsWith("track:")) return;
        String id = pid.substring("track:".length());
        if (id.isEmpty() || metaCache.containsKey(id)) return;
        if (metaInflight.putIfAbsent(id, Boolean.TRUE) != null) return;
        io.submit(() -> {
            try {
                String resp = httpGet(BASE_URL + "/tracks/" + id, settings.yandexToken());
                Meta meta = parseTrack(resp);
                if (meta != null) metaCache.put(id, meta);
            } catch (Exception ignored) {
            } finally {
                metaInflight.remove(id);
            }
        });
    }

    private static Meta parseTrack(String resp) {
        try {
            JsonObject j = JsonParser.parseString(resp).getAsJsonObject();
            String id = jsonId(j.get("id"));
            String title = j.has("title") && j.get("title").isJsonPrimitive() ? j.get("title").getAsString() : "";
            String artist = "";
            String album = "";
            if (j.has("artists")) {
                JsonArray arr = j.getAsJsonArray("artists");
                if (arr.size() > 0) {
                    JsonObject a = arr.get(0).getAsJsonObject();
                    if (a.has("name")) artist = a.get("name").getAsString();
                }
            }
            if (j.has("albums")) {
                JsonArray arr = j.getAsJsonArray("albums");
                if (arr.size() > 0) {
                    JsonObject a = arr.get(0).getAsJsonObject();
                    if (a.has("title")) album = a.get("title").getAsString();
                }
            }
            if (id.isEmpty() || title.isEmpty()) return null;
            return new Meta(id, title, artist, album, jsonLong(j, "durationMs"));
        } catch (Exception e) {
            return null;
        }
    }

    // ===================== HTTP / утилиты =====================

    private String httpGet(String url, String token) throws Exception {
        HttpRequest.Builder b = HttpRequest.newBuilder(URI.create(url))
                .header("Accept", "application/json")
                .header("X-Yandex-Music-Client", CLIENT_HEADER)
                .timeout(Duration.ofSeconds(15));
        if (token != null && !token.isEmpty()) {
            b.header("Authorization", "OAuth " + token);
        }
        HttpResponse<String> resp = http.send(b.GET().build(), HttpResponse.BodyHandlers.ofString());
        return resp.body() == null ? "" : resp.body();
    }

    private static String hmacSha256Base64(String key, String data) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(key.getBytes(StandardCharsets.UTF_8), "HmacSHA256"));
            return Base64.getEncoder().encodeToString(mac.doFinal(data.getBytes(StandardCharsets.UTF_8)));
        } catch (Exception e) {
            return "";
        }
    }

    private static long jsonLong(JsonObject o, String key) {
        JsonElement e = o.get(key);
        if (e == null || e.isJsonNull()) return 0L;
        if (e.isJsonPrimitive()) {
            if (e.getAsJsonPrimitive().isNumber()) return e.getAsLong();
            try {
                return Long.parseLong(e.getAsString());
            } catch (NumberFormatException nfe) {
                return 0L;
            }
        }
        return 0L;
    }

    private static String jsonId(JsonElement e) {
        if (e == null || e.isJsonNull()) return "";
        if (e.isJsonPrimitive()) {
            if (e.getAsJsonPrimitive().isNumber()) return Long.toString(e.getAsLong());
            return e.getAsString();
        }
        return "";
    }

    private static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

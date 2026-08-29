package fun.crickclient.api.utils.music;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sun.jna.ptr.IntByReference;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/**
 * Чтение/управление локальным Spotify через его именованный пайп
 * ({@code \\.\pipe\spotipc-<uid>}). Без токенов и OAuth: команды
 * {@code np} (now playing), {@code pp} (play/pause), {@code ss<ms>} (seek),
 * {@code pn}/{@code nn} (пред./след. трек).
 *
 * <p>Работает только на Windows и только когда запущен десктопный Spotify
 * (обычно пропатченный SpotX или аналог, который и создаёт пайп spotipc-*).
 * Все методы безопасны: при отсутствии Spotify возвращают {@code false}/{@code null}.
 */
public class SpotifyPipeProvider {

    private static final int READ_BUFFER = 16384;

    /** @return true, если удалось прочитать активный трек в {@code out}. */
    public boolean tryPoll(TrackState out) {
        String response = transact("np", READ_BUFFER);
        if (response == null || response.isEmpty()) {
            return false;
        }

        try {
            // Иногда в буфере мусор/нулевые байты — чистим
            response = response.trim();
            int jsonStart = response.indexOf('{');
            int jsonEnd = response.lastIndexOf('}');
            if (jsonStart >= 0 && jsonEnd > jsonStart) {
                response = response.substring(jsonStart, jsonEnd + 1);
            }

            JsonObject root = JsonParser.parseString(response).getAsJsonObject();
            JsonObject data = root.has("data") && root.get("data").isJsonObject()
                    ? root.getAsJsonObject("data")
                    : root;

            if (data == null) return false;

            // Тип может быть: song, track, episode, liveRadio и т.д.
            // Раньше проверялось строго song/liveRadio — из-за этого HUD не появлялся.
            String type = "";
            if (data.has("type") && data.get("type").isJsonPrimitive()) {
                type = data.get("type").getAsString().toLowerCase(Locale.ROOT);
            }

            // Отсекаем рекламу
            if (type.contains("ad") || type.contains("advert")) {
                return false;
            }

            String title = data.has("title") && data.get("title").isJsonPrimitive()
                    ? data.get("title").getAsString() : "";
            String artist = data.has("artist") && data.get("artist").isJsonPrimitive()
                    ? data.get("artist").getAsString() : "";
            String album = data.has("album") && data.get("album").isJsonPrimitive()
                    ? data.get("album").getAsString() : "";

            // Иногда поля называются иначе (например, name вместо title)
            if (title.isEmpty() && data.has("name") && data.get("name").isJsonPrimitive()) {
                title = data.get("name").getAsString();
            }

            if (title.isEmpty() && artist.isEmpty()) {
                // Пустой ответ — трека нет
                return false;
            }

            long duration = 0;
            long position = 0;
            boolean paused = false;
            boolean live = false;

            if (data.has("duration") && data.get("duration").isJsonPrimitive()) {
                try { duration = data.get("duration").getAsLong(); } catch (Exception ignored) {}
            }
            if (data.has("position") && data.get("position").isJsonPrimitive()) {
                try { position = data.get("position").getAsLong(); } catch (Exception ignored) {}
            }
            if (data.has("paused") && data.get("paused").isJsonPrimitive()) {
                try { paused = data.get("paused").getAsBoolean(); } catch (Exception ignored) {}
            }
            if (data.has("isPlaying") && data.get("isPlaying").isJsonPrimitive()) {
                try { paused = !data.get("isPlaying").getAsBoolean(); } catch (Exception ignored) {}
            }
            if ("liveRadio".equals(type) || (data.has("isLive") && data.get("isLive").isJsonPrimitive() && data.get("isLive").getAsBoolean())) {
                live = true;
            }

            out.provider = "Spotify";
            out.title = title;
            out.artist = artist;
            out.album = album;
            out.durationMs = duration;
            out.positionMs = position;
            out.paused = paused;
            out.live = live;

            // trackId для совместимости с TextMusic (может быть пустым для Spotify — ключ строится по artist+title)
            if (data.has("id") && data.get("id").isJsonPrimitive()) {
                out.trackId = data.get("id").getAsString();
            } else if (data.has("trackId") && data.get("trackId").isJsonPrimitive()) {
                out.trackId = data.get("trackId").getAsString();
            } else {
                out.trackId = (artist + "||" + title).toLowerCase(Locale.ROOT);
            }

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void togglePlayPause() {
        transact("pp", 0);
    }

    public void seekTo(long ms) {
        transact("ss" + Math.max(0L, ms), 0);
    }

    public void previousTrack() {
        transact("pn", 0);
    }

    public void nextTrack() {
        transact("nn", 0);
    }

    /** Ищет первый доступный пайп Spotify (JNA + fallback через File.list). */
    private String findPipe() {
        // 1) JNA — основной способ
        if (Kernel32Api.INSTANCE != null) {
            try {
                Kernel32Api.FindDataW data = new Kernel32Api.FindDataW();
                long find = Kernel32Api.INSTANCE.FindFirstFileW("\\\\.\\pipe\\spotipc-*", data);
                if (find != Kernel32Api.INVALID_HANDLE_VALUE) {
                    try {
                        // Перебираем все совпадения, возвращаем первое валидное
                        do {
                            String cur = data.getFileName();
                            if (cur != null && !cur.isEmpty() && cur.toLowerCase(Locale.ROOT).startsWith("spotipc-")) {
                                return "\\\\.\\pipe\\" + cur;
                            }
                        } while (Kernel32Api.INSTANCE.FindNextFileW(find, data));
                    } finally {
                        Kernel32Api.INSTANCE.FindClose(find);
                    }
                }
            } catch (Throwable ignored) {
            }
        }

        // 2) Fallback: листинг директории пайпов через java.io.File (работает на Windows)
        try {
            File dir = new File("\\\\.\\pipe\\");
            String[] list = dir.list();
            if (list != null) {
                for (String n : list) {
                    if (n != null && n.toLowerCase(Locale.ROOT).startsWith("spotipc-")) {
                        return "\\\\.\\pipe\\" + n;
                    }
                }
            }
        } catch (Throwable ignored) {
        }

        return null;
    }

    /** Открывает пайп, шлёт команду, читает ответ, закрывает. */
    private String transact(String command, int readSize) {
        String pipe = findPipe();
        if (pipe == null) return null;

        // Попытка через JNA (быстрее и надёжнее)
        String viaJna = transactJna(pipe, command, readSize);
        if (viaJna != null) return viaJna;

        // Fallback через RandomAccessFile
        return transactJavaIo(pipe, command, readSize);
    }

    private String transactJna(String pipe, String command, int readSize) {
        if (Kernel32Api.INSTANCE == null) return null;
        long handle = Kernel32Api.INVALID_HANDLE_VALUE;
        try {
            handle = Kernel32Api.INSTANCE.CreateFileW(
                    pipe,
                    Kernel32Api.PIPE_ACCESS_DUPLEX,
                    Kernel32Api.FILE_SHARE_READ | Kernel32Api.FILE_SHARE_WRITE,
                    null,
                    Kernel32Api.OPEN_EXISTING,
                    0,
                    null);
            if (handle == Kernel32Api.INVALID_HANDLE_VALUE) return null;

            byte[] commandBytes = (command + "\n").getBytes(StandardCharsets.UTF_8);
            IntByReference written = new IntByReference(0);
            if (!Kernel32Api.INSTANCE.WriteFile(handle, commandBytes, commandBytes.length, written, null)) {
                return null;
            }

            if (readSize <= 0) {
                return "";
            }

            byte[] buffer = new byte[readSize];
            IntByReference read = new IntByReference(0);
            if (!Kernel32Api.INSTANCE.ReadFile(handle, buffer, buffer.length, read, null)) {
                return null;
            }

            int count = Math.max(0, read.getValue());
            if (count == 0) return null;
            return new String(buffer, 0, count, StandardCharsets.UTF_8);
        } catch (Throwable t) {
            return null;
        } finally {
            if (handle != Kernel32Api.INVALID_HANDLE_VALUE) {
                try {
                    Kernel32Api.INSTANCE.CloseHandle(handle);
                } catch (Throwable ignored) {}
            }
        }
    }

    private String transactJavaIo(String pipe, String command, int readSize) {
        try (RandomAccessFile raf = new RandomAccessFile(pipe, "rw")) {
            raf.write((command + "\n").getBytes(StandardCharsets.UTF_8));
            if (readSize <= 0) return "";
            // Небольшая задержка, чтобы Spotify успел ответить
            try { Thread.sleep(40); } catch (InterruptedException ignored) {}
            byte[] buf = new byte[readSize];
            int read = raf.read(buf);
            if (read <= 0) return null;
            return new String(buf, 0, read, StandardCharsets.UTF_8);
        } catch (Throwable ignored) {
            return null;
        }
    }

    /** Ключ для поиска файла с текстом песни: «artist-title». */
    public static String lyricsKey(TrackState state) {
        String artist = state.artist == null ? "" : state.artist.trim();
        String title = state.title == null ? "" : state.title.trim();
        return (artist + "-" + title).toLowerCase(Locale.ROOT).replace(' ', '_');
    }
}

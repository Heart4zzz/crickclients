package fun.crickclient.api.utils.music;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sun.jna.ptr.IntByReference;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

/**
 * Чтение/управление локальным Spotify через его именованный пайп
 * ({@code \\.\pipe\spotipc-<uid>}). Без токенов и OAuth: команды
 * {@code np} (now playing), {@code pp} (play/pause), {@code ss<ms>} (seek),
 * {@code pn}/{@code nn} (пред./след. трек).
 *
 * <p>Работает только на Windows и только когда запущен десктопный Spotify.
 * Все методы безопасны: при отсутствии Spotify возвращают {@code false}/{@code null}.
 */
public class SpotifyPipeProvider {

    private static final int READ_BUFFER = 8192;

    /** @return true, если удалось прочитать активный трек в {@code out}. */
    public boolean tryPoll(TrackState out) {
        String response = transact("np", READ_BUFFER);
        if (response == null || response.isEmpty()) {
            return false;
        }

        try {
            JsonObject root = JsonParser.parseString(response).getAsJsonObject();
            JsonObject data = root.getAsJsonObject("data");
            if (data == null) return false;

            String type = data.has("type") ? data.get("type").getAsString() : "";
            if (!"song".equals(type) && !"liveRadio".equals(type)) return false;

            out.provider = "Spotify";
            out.title = data.has("title") ? data.get("title").getAsString() : "";
            out.artist = data.has("artist") ? data.get("artist").getAsString() : "";
            out.album = data.has("album") ? data.get("album").getAsString() : "";
            out.durationMs = data.has("duration") ? data.get("duration").getAsLong() : 0;
            out.positionMs = data.has("position") ? data.get("position").getAsLong() : 0;
            out.paused = data.has("paused") && data.get("paused").getAsBoolean();
            out.live = "liveRadio".equals(type) || (data.has("isLive") && data.get("isLive").getAsBoolean());
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

    /** Ищет первый доступный пайп Spotify. */
    private String findPipe() {
        if (Kernel32Api.INSTANCE == null) return null;
        Kernel32Api.FindDataW data = new Kernel32Api.FindDataW();
        long find = Kernel32Api.INSTANCE.FindFirstFileW("\\\\.\\pipe\\spotipc-*", data);
        if (find == Kernel32Api.INVALID_HANDLE_VALUE) return null;
        try {
            String name = data.cFileName == null ? null : data.cFileName.toString();
            if (name == null || name.isEmpty()) return null;
            return "\\\\.\\pipe\\" + name;
        } finally {
            Kernel32Api.INSTANCE.FindClose(find);
        }
    }

    /** Открывает пайп, шлёт команду, читает ответ, закрывает. */
    private String transact(String command, int readSize) {
        String pipe = findPipe();
        if (pipe == null) return null;

        long handle = Kernel32Api.INSTANCE.CreateFileW(
                pipe,
                Kernel32Api.PIPE_ACCESS_DUPLEX,
                Kernel32Api.FILE_SHARE_READ | Kernel32Api.FILE_SHARE_WRITE,
                null,
                Kernel32Api.OPEN_EXISTING,
                0,
                null);
        if (handle == Kernel32Api.INVALID_HANDLE_VALUE) return null;

        try {
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
            return new String(buffer, 0, count, StandardCharsets.UTF_8);
        } finally {
            Kernel32Api.INSTANCE.CloseHandle(handle);
        }
    }

    /** Ключ для поиска файла с текстом песни: «artist-title». */
    public static String lyricsKey(TrackState state) {
        String artist = state.artist == null ? "" : state.artist.trim();
        String title = state.title == null ? "" : state.title.trim();
        return (artist + "-" + title).toLowerCase(Locale.ROOT).replace(' ', '_');
    }
}

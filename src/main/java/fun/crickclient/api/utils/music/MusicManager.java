package fun.crickclient.api.utils.music;

import net.minecraft.text.Text;
import fun.crickclient.api.QClient;
import fun.crickclient.api.events.EventInvoker;
import fun.crickclient.api.events.EventLink;
import fun.crickclient.api.events.implement.EventUpdate;

import java.util.List;
import java.util.function.Consumer;

/**
 * Единая точка доступа к состоянию музыки для HUD-элемента «Музыка»
 * и модуля TextMusic. Активный провайдер выбирается в MusicSettings
 * (зеркало — тумблер «Яндекс музыка» в настройках HUD-элемента):
 *
 * <ul>
 *   <li><b>Spotify</b> — десктопный Spotify через локальный пайп:
 *       состояние + управление (пауза, перемотка, треки).</li>
 *   <li><b>Яндекс Музыка</b> — через ynison/REST: состояние текущей
 *       сессии и тексты песен; управление остаётся в приложении YM.</li>
 * </ul>
 */
public class MusicManager implements QClient {

    public static MusicManager instance;

    private static final int POLL_INTERVAL_TICKS = 4; // ~200 мс

    private final SpotifyPipeProvider spotify = new SpotifyPipeProvider();
    private final YandexMusicProvider yandex;
    private final MusicSettings settings;
    private final TrackState state = new TrackState();

    private boolean hasTrack;
    private int pollTicks;
    private long lastNoTokenWarn;

    public MusicManager() {
        instance = this;
        this.settings = MusicSettings.instance() != null ? MusicSettings.instance() : new MusicSettings();
        this.yandex = new YandexMusicProvider(settings);
        if (settings.isYandex() && !settings.yandexToken().isEmpty()) {
            yandex.ensureStarted();
        }
        EventInvoker.register(this);
    }

    @EventLink
    public void onTick(EventUpdate event) {
        // Тумблер «Яндекс музыка» в HUD-настройках — источник смены провайдера
        if (settings.uiToggle() != null && settings.uiToggle().isState() != settings.isYandex()) {
            settings.setProvider(settings.uiToggle().isState());
        }

        if (mc.player == null || mc.world == null) {
            hasTrack = false;
            return;
        }

        if (pollTicks > 0) {
            pollTicks--;
            return;
        }
        pollTicks = POLL_INTERVAL_TICKS;

        if (settings.isYandex()) {
            if (settings.yandexToken().isEmpty()) {
                // Токен не задан — пробуем Spotify как fallback, чтобы HUD не пропадал
                yandex.stop();
                hasTrack = spotify.tryPoll(state);
                if (!hasTrack) {
                    long now = System.currentTimeMillis();
                    if (now - lastNoTokenWarn > 30_000L) {
                        lastNoTokenWarn = now;
                        mc.player.sendMessage(Text.literal("§cЯндекс Музыка: не задан токен — §f.music ym <токен>"), true);
                    }
                }
                return;
            }
            yandex.ensureStarted();
            hasTrack = yandex.tryPoll(state);
            if (!hasTrack) {
                // Если YM не играет — показываем Spotify, чтобы HUD не исчезал
                hasTrack = spotify.tryPoll(state);
            }
        } else {
            yandex.stop();
            hasTrack = spotify.tryPoll(state);
        }
    }

    public boolean isMusicActive() {
        if (!hasTrack) return false;
        boolean hasTitle = state.title != null && !state.title.isEmpty();
        boolean hasArtist = state.artist != null && !state.artist.isEmpty();
        return hasTitle || hasArtist;
    }

    public TrackState state() {
        return state;
    }

    public boolean isYandex() {
        return settings.isYandex();
    }

    /** Управление (пауза/seek/треки) доступно только для Spotify. */
    public boolean supportsControl() {
        return !settings.isYandex();
    }

    public void togglePlayPause() {
        if (supportsControl() && hasTrack) spotify.togglePlayPause();
    }

    public void seek(long ms) {
        if (supportsControl() && hasTrack) spotify.seekTo(ms);
    }

    public void nextTrack() {
        if (supportsControl() && hasTrack) spotify.nextTrack();
    }

    public void previousTrack() {
        if (supportsControl() && hasTrack) spotify.previousTrack();
    }

    /**
     * Тексты трека из API Яндекса (асинхронно; callback — фоновый поток).
     * Для Spotify тексты — локальные LRC-файлы, их читает LrcLoader напрямую.
     */
    public void loadLyricsAsync(String trackId, Consumer<List<LrcLoader.LyricLine>> onDone) {
        yandex.loadLyricsAsync(trackId, onDone);
    }

    /** Смена провайдера из команды .music: стартует/останавливает YM.
     *  Для YM — всегда restart: если токен сменился, старая сессия мертва. */
    public void applyProviderChange() {
        if (settings.isYandex() && !settings.yandexToken().isEmpty()) {
            yandex.restart();
        } else {
            yandex.stop();
        }
    }

    public MusicSettings settings() {
        return settings;
    }
}

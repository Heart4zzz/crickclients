package fun.crickclient.api.utils.music;

import fun.crickclient.api.QClient;
import fun.crickclient.api.events.EventInvoker;
import fun.crickclient.api.events.EventLink;
import fun.crickclient.api.events.implement.EventUpdate;

/**
 * Единая точка доступа к состоянию музыки для HUD-элемента «Музыка»
 * и модуля TextMusic. Опрашивает провайдеров ~4 раза в секунду,
 * когда игрок в мире.
 */
public class MusicManager implements QClient {

    public static MusicManager instance;

    private static final int POLL_INTERVAL_TICKS = 4; // ~200 мс

    private final SpotifyPipeProvider spotify = new SpotifyPipeProvider();
    private final TrackState state = new TrackState();

    private boolean hasTrack;
    private int pollTicks;

    public MusicManager() {
        instance = this;
        EventInvoker.register(this);
    }

    @EventLink
    public void onTick(EventUpdate event) {
        if (mc.player == null || mc.world == null) {
            hasTrack = false;
            return;
        }

        if (pollTicks > 0) {
            pollTicks--;
            return;
        }
        pollTicks = POLL_INTERVAL_TICKS;

        if (!spotify.tryPoll(state)) {
            hasTrack = false;
        } else {
            hasTrack = true;
        }
    }

    public boolean isMusicActive() {
        return hasTrack && state.title != null && !state.title.isEmpty();
    }

    public TrackState state() {
        return state;
    }

    public void togglePlayPause() {
        if (hasTrack) spotify.togglePlayPause();
    }

    public void seek(long ms) {
        if (hasTrack) spotify.seekTo(ms);
    }

    public void nextTrack() {
        if (hasTrack) spotify.nextTrack();
    }

    public void previousTrack() {
        if (hasTrack) spotify.previousTrack();
    }
}

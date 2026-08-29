package fun.crickclient.api.utils.music;

/** Снимок состояния воспроизведения (заполняется MusicManager). */
public class TrackState {
    public String provider = "";
    public String trackId = "";
    public String title = "";
    public String artist = "";
    public String album = "";
    public long durationMs;
    public long positionMs;
    public boolean paused;
    public boolean live;

    public void clear() {
        provider = "";
        trackId = "";
        title = "";
        artist = "";
        album = "";
        durationMs = 0;
        positionMs = 0;
        paused = false;
        live = false;
    }
}

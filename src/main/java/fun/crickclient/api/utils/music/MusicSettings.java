package fun.crickclient.api.utils.music;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import fun.crickclient.CrickClient;
import fun.crickclient.client.modules.settings.implement.BooleanSetting;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

/**
 * Настройки музыкальной интеграции: выбранный провайдер и токен Яндекс Музыки.
 * Хранится в {@code C:\CrickClient\crickclient\music\music.json}.
 *
 * <p>{@code uiToggle} — «зеркало» в настройках HUD-элемента «Музыка»
 * (BooleanSetting модуля Interface), чтобы выбор провайдера был виден
 * и менялся в попупе. MusicManager синхронизирует состояния каждый тик.
 */
public class MusicSettings {

    public static MusicSettings instance;

    public static final String PROVIDER_SPOTIFY = "spotify";
    public static final String PROVIDER_YANDEX = "yandex";

    /** volatile: пишет игровой тред, читает фоновый ym-loop */
    private volatile String provider = PROVIDER_SPOTIFY;
    private volatile String yandexToken = "";
    private BooleanSetting uiToggle;

    private final File file;
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public MusicSettings() {
        instance = this;
        File base = CrickClient.INSTANCE != null
                ? CrickClient.INSTANCE.globalsDir
                : new File("C:\\CrickClient", "crickclient");
        this.file = new File(base, "music" + File.separator + "music.json");
        load();
    }

    public boolean isYandex() {
        return PROVIDER_YANDEX.equals(provider);
    }

    /** @param yandex true = Яндекс Музыка, false = Spotify */
    public synchronized void setProvider(boolean yandex) {
        provider = yandex ? PROVIDER_YANDEX : PROVIDER_SPOTIFY;
        save();
    }

    public String yandexToken() {
        return yandexToken;
    }

    public synchronized void setYandexToken(String token) {
        yandexToken = token == null ? "" : token.trim();
        save();
    }

    /** Зеркало выбора провайдера в HUD (BooleanSetting «Яндекс музыка»). */
    public void setUiToggle(BooleanSetting toggle) {
        this.uiToggle = toggle;
    }

    public BooleanSetting uiToggle() {
        return uiToggle;
    }

    private void load() {
        if (!file.exists() || !file.isFile()) return;
        try {
            String json = new String(Files.readAllBytes(file.toPath()), StandardCharsets.UTF_8);
            JsonObject json = JsonParser.parseString(json).getAsJsonObject();
            if (json.has("provider")) {
                String p = json.get("provider").getAsString();
                if (PROVIDER_YANDEX.equals(p) || PROVIDER_SPOTIFY.equals(p)) provider = p;
            }
            if (json.has("yandexToken")) {
                yandexToken = json.get("yandexToken").getAsString();
            }
        } catch (Exception ignored) {
            // битый файл — начинаем с дефолтов
        }
    }

    private synchronized void save() {
        try {
            File parent = file.getParentFile();
            if (parent != null && !parent.exists() && !parent.mkdirs()) return;

            JsonObject json = new JsonObject();
            json.addProperty("provider", provider);
            json.addProperty("yandexToken", yandexToken);
            Files.write(file.toPath(), gson.toJson(json).getBytes(StandardCharsets.UTF_8));
        } catch (IOException ignored) {
        }
    }
}

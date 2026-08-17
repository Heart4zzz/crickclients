package fun.crickclient.client.modules.impl.misc;

import fun.crickclient.api.storages.implement.helpertstorages.enumvar.ModuleClass;
import fun.crickclient.api.utils.client.ClientSoundPlayer;
import fun.crickclient.client.modules.Module;
import fun.crickclient.client.modules.settings.implement.BooleanSetting;
import fun.crickclient.client.modules.settings.implement.FloatSetting;
import fun.crickclient.client.modules.settings.implement.ModeSetting;

import java.util.LinkedHashMap;
import java.util.Map;

public class ClientSounds extends Module {

    public static ClientSounds INSTANCE = new ClientSounds();

    /** Задержка после запуска игры, пока звуки модулей не проигрываются. */
    private static final long STARTUP_MUTE_MS = 4000L;
    private static final long INIT_TIME_MS = System.currentTimeMillis();

    /**
     * Имена звуковых файлов латиницей: кириллические имена ресурсов внутри jar
     * читаются не на всех системах, поэтому режим -> файл маппится вручную.
     */
    private static final Map<String, String> SOUND_FILES = new LinkedHashMap<>();

    static {
        SOUND_FILES.put("Первый", "sound1.wav");
        SOUND_FILES.put("Второй", "sound2.wav");
        SOUND_FILES.put("Третий", "sound3.wav");
        SOUND_FILES.put("Четвертый", "sound4.wav");
        SOUND_FILES.put("Пятый", "sound5.wav");
        SOUND_FILES.put("Шестой", "sound6.wav");
    }

    public final ModeSetting stateSounds = new ModeSetting("Режим", "Первый",
            "Нет", "Первый", "Второй", "Третий", "Четвертый", "Пятый", "Шестой");
    public final FloatSetting volume = new FloatSetting("Громкость", 50.0f, 1.0f, 100.0f, 0.5f);
    public final BooleanSetting toggleSounds = new BooleanSetting("Звук вкл/выкл модулей", true);
    public final BooleanSetting bindSounds = new BooleanSetting("Звук функций по бинду", true);

    public ClientSounds() {
        super("ClientSounds", "Добавляет звуки клиента", ModuleCategory.MISC);
        addSettings(stateSounds, volume, toggleSounds, bindSounds);
    }

    /** Звук включения/выключения модуля (в клик гуи и по бинду). */
    public static void playToggleSound(boolean enabled) {
        ClientSounds module = active();
        if (module == null || !module.toggleSounds.isState()) return;
        play(module, enabled ? 1.0f : 0.95f);
    }

    /** Звук срабатывания функции, привязанной к биндe (AutoTrap, EcOpen, ElytraSwap и т.д.). */
    public static void playBindSound() {
        ClientSounds module = active();
        if (module == null || !module.bindSounds.isState()) return;
        play(module, 1.0f);
    }

    /**
     * Активный (зарегистрированный) экземпляр модуля.
     * Берём его из списка модулей, чтобы звук не «пропадал», если где-то остался
     * второй экземпляр класса.
     */
    private static ClientSounds active() {
        if (System.currentTimeMillis() - INIT_TIME_MS < STARTUP_MUTE_MS) {
            return null;
        }

        ClientSounds module = INSTANCE;
        try {
            for (Module registered : ModuleClass.INSTANCE.getObject()) {
                if (registered instanceof ClientSounds clientSounds) {
                    module = clientSounds;
                    break;
                }
            }
        } catch (Throwable ignored) {
        }

        return module != null && module.isEnable() ? module : null;
    }

    private static void play(ClientSounds module, float pitch) {
        String mode = module.stateSounds.getCurrent();
        if (mode == null || "Нет".equals(mode)) return;

        String file = SOUND_FILES.get(mode);
        if (file == null) return;

        float max = module.volume.getMax();
        double volume = max <= 0f ? 0.5 : module.volume.get() / max;
        ClientSoundPlayer.playSound(file, volume, pitch);
    }
}

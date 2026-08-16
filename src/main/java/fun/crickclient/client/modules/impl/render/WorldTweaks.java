package fun.crickclient.client.modules.impl.render;

import fun.crickclient.CrickClient;
import fun.crickclient.api.utils.color.ColorUtils;
import fun.crickclient.client.modules.Module;
import fun.crickclient.client.modules.settings.implement.BooleanSetting;
import fun.crickclient.client.modules.settings.implement.FloatSetting;
import fun.crickclient.client.modules.settings.implement.ListSetting;

public class WorldTweaks extends Module {

    public static WorldTweaks INSTANCE = new WorldTweaks();

    private final ListSetting worldSettings = new ListSetting("Настройки мира",
            new BooleanSetting("Время", true),
            new BooleanSetting("Фог", true)
    );

    private final FloatSetting timeSetting = new FloatSetting("Время", 12f, 0f, 24f, 1f)
            .visible(() -> worldSettings.is("Время"));

    private final FloatSetting fogDistanceSetting = new FloatSetting("Дистанция фога", 100f, 20f, 200f, 1f)
            .visible(() -> worldSettings.is("Фог"));

    public WorldTweaks() {
        super("CustomWorld", "Настройки мира", ModuleCategory.RENDER);
        addSettings(worldSettings, timeSetting, fogDistanceSetting);
    }

    public boolean isTimeEnabled() {
        return isEnable() && worldSettings.is("Время");
    }

    public boolean isFogEnabled() {
        return isEnable() && worldSettings.is("Фог");
    }

    public long getForcedTime() {
        return ((long) timeSetting.get()) * 1000L;
    }

    public float getFogDistance() {
        return fogDistanceSetting.get();
    }

    public int getFogColor() {
        if (!CrickClient.INSTANCE.themeStorage.getThemes().getTheme().getName().equals("Rainbow")) {
            return CrickClient.INSTANCE.themeStorage.getThemes().getTheme().color[0];
        }
        return ColorUtils.getThemeColor();
    }
}


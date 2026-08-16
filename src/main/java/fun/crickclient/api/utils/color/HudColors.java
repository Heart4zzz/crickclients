package fun.crickclient.api.utils.color;

/**
 * Палитра HUD-элементов. Все цвета завязаны на текущую тему клиента,
 * поэтому HUD автоматически перекрашивается вместе с ClickGui.
 */
public final class HudColors {

    private HudColors() {
    }

    public static int rgba(int r, int g, int b, int a) {
        return ColorUtils.rgba(clamp(r), clamp(g), clamp(b), clamp(a));
    }

    /**
     * Меняет альфу у готового цвета.
     */
    public static int setAlpha(int color, int alpha) {
        return (color & 0x00FFFFFF) | (clamp(alpha) << 24);
    }

    public static int interpolateColor(int first, int second, float progress) {
        return ColorUtils.interpolateColor(first, second, Math.max(0f, Math.min(1f, progress)));
    }

    /**
     * Основной акцент клиента (цвет темы).
     */
    public static int getColorClient() {
        return ColorUtils.getThemeColor();
    }

    /**
     * Фон панелей HUD (тёмное стекло).
     */
    public static int getColorInterfaceBg() {
        return rgba(0, 0, 0, 255);
    }

    public static int getColorIcons() {
        return ColorUtils.getThemeColor();
    }

    public static int getColorIndicator() {
        return ColorUtils.getThemeColor();
    }

    public static int getColorInactiveIndicator() {
        return rgba(58, 58, 64, 255);
    }

    public static int getColorInactiveText() {
        return rgba(150, 150, 155, 255);
    }

    public static int getColorSlider() {
        return ColorUtils.getThemeColor();
    }

    public static int getColorSliderWindow() {
        return rgba(48, 48, 54, 255);
    }

    public static int getColorSliderCircle() {
        return rgba(255, 255, 255, 255);
    }

    private static int clamp(int value) {
        return Math.max(0, Math.min(255, value));
    }
}

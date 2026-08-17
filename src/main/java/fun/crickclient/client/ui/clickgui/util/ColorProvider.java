package fun.crickclient.client.ui.clickgui.util;

import fun.crickclient.api.utils.color.ColorUtils;
import net.minecraft.util.math.MathHelper;

import java.awt.Color;

/**
 * Палитра клик гуи. В старом клиенте цвета брались из {@code ThemeManager},
 * здесь акцент берётся из темы этого клиента ({@link ColorUtils#getThemeColor()}),
 * а остальная палитра — фиксированная тёмная схема из старого гуи.
 */
public final class ColorProvider {

    private ColorProvider() {
    }

    public static int red(int c) {
        return c >> 16 & 0xFF;
    }

    public static int green(int c) {
        return c >> 8 & 0xFF;
    }

    public static int blue(int c) {
        return c & 0xFF;
    }

    public static int alpha(int c) {
        return c >> 24 & 0xFF;
    }

    /** Акцент клиента (цвет выбранной темы, у Rainbow — переливается). */
    public static int getColorClient() {
        return ColorUtils.getThemeColor();
    }

    public static int getThemeColor() {
        return getColorClient();
    }

    public static int getThemeColorTwo() {
        return ColorUtils.darken(getColorClient(), 0.35f);
    }

    public static int getColorMain() {
        return getColorClient();
    }

    public static int getColorVisualModules() {
        return getColorClient();
    }

    public static int getColorText() {
        return rgba(232, 232, 236, 255);
    }

    public static int getColorInactiveText() {
        return rgba(150, 150, 158, 255);
    }

    public static int getColorHeaderBg() {
        return rgba(20, 22, 30, 255);
    }

    public static int getColorHeaderText() {
        return getColorClient();
    }

    public static int getColorSlider() {
        return getColorClient();
    }

    public static int getColorSliderCircle() {
        return rgba(255, 255, 255, 255);
    }

    public static int getColorSliderWindow() {
        return rgba(42, 44, 54, 255);
    }

    public static int getColorIndicator() {
        return getColorClient();
    }

    public static int getColorInactiveIndicator() {
        return rgba(42, 44, 54, 255);
    }

    public static int getColorButton() {
        return getColorClient();
    }

    public static int getColorInactiveButton() {
        return rgba(42, 44, 54, 255);
    }

    public static int getColorSeparator() {
        return rgba(255, 255, 255, 16);
    }

    public static int getColorField() {
        return rgba(22, 24, 32, 255);
    }

    public static int getColorInactiveField() {
        return rgba(30, 32, 42, 255);
    }

    public static int getColorTooltipText() {
        return getColorText();
    }

    public static int getColorWindowBg() {
        return rgba(16, 18, 26, 255);
    }

    public static int getColorIcons() {
        return getColorClient();
    }

    public static int getColorClickGui() {
        return rgba(16, 18, 26, 255);
    }

    public static int getColorInterfaceBg() {
        return rgba(12, 14, 20, 255);
    }

    public static int[] getOrbitalRect(int c1, int c2, double speed, int alpha) {
        int[] colors = new int[4];
        double time = System.currentTimeMillis() / speed;
        for (int i = 0; i < 4; i++) {
            double phase = i * (Math.PI / 2.0);
            int color = interpolateColor(c1, c2, (float) (Math.sin(time + phase) * 0.5 + 0.5));
            colors[i] = setAlpha(color, alpha);
        }
        return colors;
    }

    public static int gradient(final int speed, final int index, final int... colors) {
        int angle = (int) ((System.currentTimeMillis() / speed + index) % 360L);
        angle = ((angle > 180) ? (360 - angle) : angle) + 180;
        int colorIndex = (int) (angle / 360.0f * colors.length);
        if (colorIndex == colors.length) {
            --colorIndex;
        }
        final int color1 = colors[colorIndex];
        final int color2 = colors[(colorIndex == colors.length - 1) ? 0 : (colorIndex + 1)];
        return interpolateColor(color1, color2, angle / 360.0f * colors.length - colorIndex);
    }

    /**
     * Смешивает два цвета: при {@code amount = 0} возвращает {@code from},
     * при {@code amount = 1} — {@code to}.
     */
    public static int interpolateColor(int from, int to, float amount) {
        amount = Math.min(1.0f, Math.max(0.0f, amount));
        int r = interpolate(red(from), red(to), amount);
        int g = interpolate(green(from), green(to), amount);
        int b = interpolate(blue(from), blue(to), amount);
        int a = interpolate(alpha(from), alpha(to), amount);
        return a << 24 | r << 16 | g << 8 | b;
    }

    /** Осветляет цвет в сторону белого на {@code amount} (0..1). */
    public static int lighten(int color, float amount) {
        return interpolateColor(color, rgba(255, 255, 255, alpha(color)), amount);
    }

    /** Затемняет цвет в сторону чёрного на {@code amount} (0..1). */
    public static int darken(int color, float amount) {
        return interpolateColor(color, rgba(0, 0, 0, alpha(color)), amount);
    }

    /** Умножает альфу цвета на множитель (0..1). */
    public static int mulAlpha(int color, float factor) {
        return setAlpha(color, (int) (alpha(color) * Math.max(0f, Math.min(1f, factor))));
    }

    private static int interpolate(int oldValue, int newValue, float amount) {
        return (int) (oldValue + (newValue - oldValue) * amount);
    }

    public static float[] rgba(final int color) {
        return new float[]{
                (color >> 16 & 0xFF) / 255f,
                (color >> 8 & 0xFF) / 255f,
                (color & 0xFF) / 255f,
                (color >> 24 & 0xFF) / 255f
        };
    }

    public static int rgba(int r, int g, int b, int a) {
        return clamp(a) << 24 | clamp(r) << 16 | clamp(g) << 8 | clamp(b);
    }

    public static int rgba(int r, int g, int b, double a) {
        return rgba(r, g, b, (int) a);
    }

    public static int rgba(int r, int g, int b, float a) {
        return rgba(r, g, b, (int) a);
    }

    public static int rgb(int r, int g, int b) {
        return rgba(r, g, b, 255);
    }

    public static int setAlpha(int color, int alpha) {
        return (MathHelper.clamp(alpha, 0, 255) << 24) | (color & 0xFFFFFF);
    }

    public static int setAlpha(int color, double alpha) {
        return setAlpha(color, (int) alpha);
    }

    public static int setAlpha(int color, float alpha) {
        return setAlpha(color, (int) alpha);
    }

    public static int brighter(int color, float factor) {
        return rgba(Math.min(255, (int) (red(color) * factor)),
                Math.min(255, (int) (green(color) * factor)),
                Math.min(255, (int) (blue(color) * factor)),
                alpha(color));
    }

    public static int pack(int red, int green, int blue, int alpha) {
        return ((alpha & 0xFF) << 24) | ((red & 0xFF) << 16) | ((green & 0xFF) << 8) | (blue & 0xFF);
    }

    public static int[] unpack(int color) {
        return new int[]{red(color), green(color), blue(color), alpha(color)};
    }

    public static float[] normalize(Color color) {
        return new float[]{color.getRed() / 255.0f, color.getGreen() / 255.0f, color.getBlue() / 255.0f, color.getAlpha() / 255.0f};
    }

    public static float[] normalize(int color) {
        int[] components = unpack(color);
        return new float[]{components[0] / 255.0f, components[1] / 255.0f, components[2] / 255.0f, components[3] / 255.0f};
    }

    private static int clamp(int value) {
        return Math.max(0, Math.min(255, value));
    }
}

package fun.crickclient.client.ui.clickgui;

import fun.crickclient.client.ui.clickgui.util.ColorProvider;
import fun.crickclient.client.ui.clickgui.util.DrawUtil;

public final class ClickGuiBackdrop {
    private ClickGuiBackdrop() {
    }

    public static void render(int width, int height, float alpha) {
        // Full-screen dark overlay with subtle gradient
        DrawUtil.drawRound(0, 0, width, height, 0,
                ColorProvider.rgba(4, 6, 12, (int) (210 * alpha)),
                ColorProvider.rgba(6, 8, 16, (int) (210 * alpha)),
                ColorProvider.rgba(3, 5, 10, (int) (220 * alpha)),
                ColorProvider.rgba(8, 10, 18, (int) (220 * alpha)));

        // Wide accent glow behind the GUI window
        int accent = ColorProvider.getColorClient();
        float cx = width / 2f;
        float cy = height / 2f;
        DrawUtil.drawRoundBlur(cx - 320f, cy - 220f, 640f, 440f, 160f,
                ColorProvider.setAlpha(accent, (int) (14 * alpha)), 60f);

        // Vignette overlay for depth
        DrawUtil.drawRound(0, 0, width, height, 0,
                ColorProvider.rgba(0, 0, 0, (int) (40 * alpha)),
                ColorProvider.rgba(0, 0, 0, (int) (70 * alpha)),
                ColorProvider.rgba(0, 0, 0, (int) (90 * alpha)),
                ColorProvider.rgba(0, 0, 0, (int) (70 * alpha)));
    }
}

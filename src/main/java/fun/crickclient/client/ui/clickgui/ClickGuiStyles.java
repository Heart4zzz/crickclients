package fun.crickclient.client.ui.clickgui;

import org.joml.Vector4f;
import fun.crickclient.client.ui.clickgui.util.GuiFonts;
import fun.crickclient.api.utils.render.fonts.msdf.MsdfFont;
import fun.crickclient.client.ui.clickgui.util.ColorProvider;
import fun.crickclient.client.ui.clickgui.util.DrawUtil;

public final class ClickGuiStyles {
    public static final float SHELL_WIDTH = 520f;
    public static final float SHELL_HEIGHT = 268f;
    public static final float SHELL_RADIUS = 8f;
    public static final float SIDEBAR_WIDTH = 112f;
    public static final float CONTENT_HEADER = 28f;
    public static final float FOOTER_HEIGHT = 28f;

    public static final int MODULE_COLUMNS = 2;
    public static final float MODULE_COLUMN_GAP = 6f;
    public static final float MODULE_RADIUS = 7f;
    public static final float MODULE_GAP = 6f;

    public static final float MODULE_HEADER_NO_DESC = 30f;
    public static final float MODULE_HEADER_WITH_DESC = 42f;

    public static final float TOGGLE_W = 22f;
    public static final float TOGGLE_H = 11f;

    public static float moduleHeaderHeight(String desc) {
        return desc != null && !desc.isEmpty() ? MODULE_HEADER_WITH_DESC : MODULE_HEADER_NO_DESC;
    }

    public static float moduleCardWidth(float contentW) {
        return (contentW - MODULE_COLUMN_GAP) / MODULE_COLUMNS;
    }

    private ClickGuiStyles() {
    }

    public static void drawBackdrop(int width, int height, float alpha) {
        ClickGuiBackdrop.render(width, height, alpha);
    }

    /** Shader radius order: top-left, top-right, bottom-right, bottom-left (see common.glsl). */
    public static final Vector4f SHELL_CORNERS = new Vector4f(SHELL_RADIUS, SHELL_RADIUS, SHELL_RADIUS, SHELL_RADIUS);
    public static final Vector4f SIDEBAR_CORNERS = new Vector4f(0f, 0f, SHELL_RADIUS, SHELL_RADIUS);

    public static void drawShellWindow(float x, float y, float w, float h, float alpha) {
        // Outer shadow
        DrawUtil.drawRoundBlur(x - 4f, y - 4f, w + 8f, h + 8f, SHELL_RADIUS + 4f,
                ColorProvider.rgba(0, 0, 0, (int) (80 * alpha)), 20f);
        // Main window background
        DrawUtil.drawRound(x, y, w, h, SHELL_CORNERS, ColorProvider.rgba(16, 18, 26, (int) (248 * alpha)));
        // Subtle accent border around the window
        int accent = ColorProvider.getColorClient();
        DrawUtil.drawRound(x - 0.5f, y - 0.5f, w + 1f, h + 1f, SHELL_CORNERS,
                ColorProvider.setAlpha(accent, (int) (18 * alpha)));
        // Sidebar separator
        DrawUtil.drawRound(x + SIDEBAR_WIDTH, y + 8f, 0.5f, h - 16f, 0.25f,
                ColorProvider.rgba(255, 255, 255, (int) (10 * alpha)));
    }

    public static void drawCenteredGuiTitle(String text, float boxX, float boxY, float boxW, float boxH, float alpha, float size) {
        MsdfFont font = GuiFonts.GUI_TITLE.get();
        float tw = font.getWidth(text, size);
        float ty = boxY + (boxH - size) / 2f - 1f;
        DrawUtil.drawText(font, text, boxX + (boxW - tw) / 2f, ty,
                ColorProvider.setAlpha(ColorProvider.getColorText(), (int) (255 * alpha)), size);
    }

    public static void drawCenteredButtonText(String text, float boxX, float boxY, float boxW, float boxH,
                                              float alpha, float size, int color) {
        MsdfFont font = GuiFonts.GUI_BODY.get();
        float tw = font.getWidth(text, size);
        float ty = boxY + (boxH - size) / 2f - 2f;
        DrawUtil.drawText(font, text, boxX + (boxW - tw) / 2f, ty,
                ColorProvider.setAlpha(color, (int) (255 * alpha)), size);
    }

    public static void drawScrollFade(float x, float y, float w, float h, float headerH, float alpha) {
        // Top fade
        DrawUtil.drawRound(x, y, w, 14f, 0,
                ColorProvider.rgba(16, 18, 26, (int) (120 * alpha)),
                ColorProvider.rgba(16, 18, 26, (int) (120 * alpha)),
                ColorProvider.rgba(16, 18, 26, 0),
                ColorProvider.rgba(16, 18, 26, 0));
        // Bottom fade
        DrawUtil.drawRound(x, y + h - 16f, w, 16f, 0,
                ColorProvider.rgba(16, 18, 26, 0),
                ColorProvider.rgba(16, 18, 26, 0),
                ColorProvider.rgba(16, 18, 26, (int) (140 * alpha)),
                ColorProvider.rgba(16, 18, 26, (int) (140 * alpha)));
    }

    public static void drawScrollbar(float trackX, float trackY, float trackH, float thumbY, float thumbH, float alpha) {
        DrawUtil.drawRound(trackX, trackY, 2f, trackH, 1f, ColorProvider.rgba(255, 255, 255, (int) (6 * alpha)));
        DrawUtil.drawRound(trackX - 0.5f, thumbY, 3f, thumbH, 1.5f,
                ColorProvider.setAlpha(ColorProvider.getColorClient(), (int) (150 * alpha)));
    }

    public static void drawModuleCard(float x, float y, float w, float h, float headerH, float alpha, float enabled, float hover, boolean open) {
        int accent = ColorProvider.getColorClient();
        int bg = ColorProvider.rgba(22, 24, 32, (int) (240 * alpha));
        if (hover > 0.01f) {
            bg = ColorProvider.interpolateColor(bg, ColorProvider.rgba(28, 30, 42, (int) (240 * alpha)), hover * 0.65f);
        }
        DrawUtil.drawRound(x, y, w, h, MODULE_RADIUS, bg);

        // Left accent bar for enabled modules
        if (enabled > 0.05f) {
            int accentAlpha = (int) ((80 + enabled * 175) * alpha);
            DrawUtil.drawRound(x + 0.5f, y + 1f, 2.5f, Math.min(h - 2f, headerH - 1f), 1.25f,
                    ColorProvider.setAlpha(accent, accentAlpha));
        }

        // Subtle inner glow on hover
        if (hover > 0.1f) {
            DrawUtil.drawRound(x + 0.5f, y + 0.5f, w - 1f, headerH, MODULE_RADIUS,
                    ColorProvider.rgba(255, 255, 255, (int) (3 * hover * alpha)));
        }

        // Settings area background
        if (open && h > headerH + 2f) {
            DrawUtil.drawRound(x + 1f, y + headerH, w - 2f, h - headerH, 0,
                    ColorProvider.rgba(0, 0, 0, (int) (18 * alpha)));
        }
    }

    public static void drawActiveBar(float x, float y, float rowH, float alpha, float enabled) {
    }

    public static void drawToggle(float x, float y, float alpha, float enabled) {
        int accent = ColorProvider.getColorClient();
        int off = ColorProvider.rgba(38, 40, 50, (int) (255 * alpha));
        int on = ColorProvider.interpolateColor(off, ColorProvider.setAlpha(accent, (int) (255 * alpha)), enabled);
        DrawUtil.drawRound(x, y, TOGGLE_W, TOGGLE_H, TOGGLE_H / 2f, on);
        // Subtle glow when enabled
        if (enabled > 0.1f) {
            DrawUtil.drawRound(x, y, TOGGLE_W, TOGGLE_H, TOGGLE_H / 2f,
                    ColorProvider.setAlpha(accent, (int) (20 * enabled * alpha)));
        }
        float knob = TOGGLE_H - 2.6f;
        float knobX = x + 1.3f + (TOGGLE_W - knob - 2.6f) * enabled;
        DrawUtil.drawRound(knobX, y + 1.3f, knob, knob, knob / 2f,
                ColorProvider.rgba(255, 255, 255, (int) (255 * alpha)));
    }

    public static void drawModuleTitle(String name, float x, float y, float maxW, float alpha, float enabled) {
        int text = ColorProvider.interpolateColor(
                ColorProvider.setAlpha(ColorProvider.getColorInactiveText(), (int) (255 * alpha)),
                ColorProvider.setAlpha(ColorProvider.getColorText(), (int) (255 * alpha)),
                enabled);
        DrawUtil.drawText(GuiFonts.GUI_TITLE.get(), name, x, y, text, 7.2f, 0.4f, 1f, maxW);
    }

    public static void drawModuleDesc(String desc, float x, float y, float maxW, float alpha) {
        if (desc == null || desc.isEmpty()) return;
        DrawUtil.drawText(GuiFonts.GUI_BODY.get(), desc, x, y,
                ColorProvider.setAlpha(ColorProvider.getColorInactiveText(), (int) (150 * alpha)),
                5.5f);
    }

    public static void drawGuiTitle(String text, float x, float y, float alpha, float size) {
        DrawUtil.drawText(GuiFonts.GUI_TITLE.get(), text, x, y,
                ColorProvider.setAlpha(ColorProvider.getColorText(), (int) (255 * alpha)), size);
    }

    public static void drawGuiBody(String text, float x, float y, float alpha, float size) {
        DrawUtil.drawText(GuiFonts.GUI_BODY.get(), text, x, y,
                ColorProvider.setAlpha(ColorProvider.getColorInactiveText(), (int) (220 * alpha)), size);
    }

    public static void drawTooltip(float x, float y, float w, float h, float alpha) {
        DrawUtil.drawRound(x, y, w, h, 5f, ColorProvider.rgba(24, 26, 34, (int) (245 * alpha)));
    }
}

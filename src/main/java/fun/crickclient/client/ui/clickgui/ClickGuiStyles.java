package fun.crickclient.client.ui.clickgui;

import org.joml.Vector4f;
import fun.crickclient.client.ui.clickgui.util.GuiFonts;
import fun.crickclient.api.utils.render.fonts.msdf.MsdfFont;
import fun.crickclient.client.ui.clickgui.util.ColorProvider;
import fun.crickclient.client.ui.clickgui.util.DrawUtil;

public final class ClickGuiStyles {
    public static final float SHELL_WIDTH = 520f;
    public static final float SHELL_HEIGHT = 268f;
    public static final float SHELL_RADIUS = 10f;
    public static final float SIDEBAR_WIDTH = 116f;
    public static final float CONTENT_HEADER = 30f;
    public static final float FOOTER_HEIGHT = 28f;

    public static final int MODULE_COLUMNS = 2;
    public static final float MODULE_COLUMN_GAP = 6f;
    public static final float MODULE_RADIUS = 8f;
    public static final float MODULE_GAP = 6f;

    public static final float MODULE_HEADER_NO_DESC = 30f;
    public static final float MODULE_HEADER_WITH_DESC = 42f;

    public static final float TOGGLE_W = 22f;
    public static final float TOGGLE_H = 11f;

    // ===================== Палитра окна =====================

    /** Базовый фон контентной части. */
    public static final int BG_TOP = ColorProvider.rgb(21, 23, 31);
    public static final int BG_BOTTOM = ColorProvider.rgb(15, 16, 23);
    /** Фон боковой панели — чуть глубже основного. */
    public static final int SIDEBAR_TOP = ColorProvider.rgb(15, 17, 24);
    public static final int SIDEBAR_BOTTOM = ColorProvider.rgb(11, 12, 18);
    /** Фон карточки модуля. */
    public static final int CARD_TOP = ColorProvider.rgb(27, 29, 39);
    public static final int CARD_BOTTOM = ColorProvider.rgb(23, 25, 33);

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

    /**
     * Порядок радиусов в шейдере: верхний левый, верхний правый, нижний правый, нижний левый
     * (см. {@code common.glsl}).
     */
    public static final Vector4f SHELL_CORNERS =
            new Vector4f(SHELL_RADIUS, SHELL_RADIUS, SHELL_RADIUS, SHELL_RADIUS);
    /** Боковая панель скруглена только слева: верхний левый и нижний левый углы. */
    public static final Vector4f SIDEBAR_CORNERS =
            new Vector4f(SHELL_RADIUS, 0f, 0f, SHELL_RADIUS);

    public static void drawShellWindow(float x, float y, float w, float h, float alpha) {
        // Тень: два слоя — плотное ядро под окном и широкий мягкий ореол.
        DrawUtil.drawRoundBlur(x + 1f, y + 5f, w - 2f, h, SHELL_RADIUS + 4f,
                ColorProvider.rgba(0, 0, 0, (int) (110 * alpha)), 26f);
        DrawUtil.drawRoundBlur(x - 6f, y - 2f, w + 12f, h + 12f, SHELL_RADIUS + 8f,
                ColorProvider.rgba(0, 0, 0, (int) (60 * alpha)), 44f);

        // Корпус окна.
        DrawUtil.drawRound(x, y, w, h, SHELL_CORNERS,
                ColorProvider.setAlpha(BG_TOP, (int) (252 * alpha)),
                ColorProvider.setAlpha(BG_TOP, (int) (252 * alpha)),
                ColorProvider.setAlpha(BG_BOTTOM, (int) (252 * alpha)),
                ColorProvider.setAlpha(BG_BOTTOM, (int) (252 * alpha)));

        // Тонкая светлая обводка по периметру — аккуратно подчёркивает скруглённый край.
        DrawUtil.drawRoundOutline(x, y, w, h, SHELL_RADIUS, 1f,
                ColorProvider.rgba(255, 255, 255, (int) (20 * alpha)),
                ColorProvider.rgba(255, 255, 255, (int) (8 * alpha)));

        // Разделитель между сайдбаром и контентом.
        float sepX = x + SIDEBAR_WIDTH;
        DrawUtil.drawRound(sepX, y + 10f, 0.8f, h - 20f, 0.4f,
                ColorProvider.rgba(255, 255, 255, (int) (13 * alpha)));
    }

    /** Фон боковой панели с собственным градиентом и скруглением только слева. */
    public static void drawSidebarBackground(float x, float y, float w, float h, float alpha) {
        DrawUtil.drawRound(x, y, w, h, SIDEBAR_CORNERS,
                ColorProvider.setAlpha(SIDEBAR_TOP, (int) (255 * alpha)),
                ColorProvider.setAlpha(SIDEBAR_TOP, (int) (255 * alpha)),
                ColorProvider.setAlpha(SIDEBAR_BOTTOM, (int) (255 * alpha)),
                ColorProvider.setAlpha(SIDEBAR_BOTTOM, (int) (255 * alpha)));
    }

    /** Пилюля выбранного пункта сайдбара. {@code selected} — прогресс анимации выбора (0..1). */
    public static void drawSidebarItemBackground(float x, float y, float w, float h,
                                                 float alpha, float selected, float hover) {
        int accent = ColorProvider.getColorClient();

        // Лёгкая светлая подложка при наведении (гаснет, когда пункт выбран).
        int hoverA = (int) (12 * hover * alpha * (1f - selected * 0.6f));
        if (hoverA > 0) {
            DrawUtil.drawRound(x, y, w, h, 6f, ColorProvider.rgba(255, 255, 255, hoverA));
        }

        if (selected > 0.01f) {
            // Ровная полупрозрачная заливка акцентом + индикатор у левого края.
            DrawUtil.drawRound(x, y, w, h, 6f,
                    ColorProvider.setAlpha(accent, (int) (30 * selected * alpha)));

            float barH = h * 0.5f;
            float barY = y + (h - barH) / 2f;
            DrawUtil.drawRound(x + 1.5f, barY, 2.2f, barH, 1.1f,
                    ColorProvider.setAlpha(accent, (int) (255 * selected * alpha)));
        }
    }

    public static void drawCenteredGuiTitle(String text, float boxX, float boxY, float boxW, float boxH,
                                            float alpha, float size) {
        DrawUtil.drawTextCentered(GuiFonts.GUI_TITLE.get(), text, boxX, boxY, boxW, boxH,
                ColorProvider.setAlpha(ColorProvider.getColorText(), (int) (255 * alpha)), size);
    }

    public static void drawCenteredButtonText(String text, float boxX, float boxY, float boxW, float boxH,
                                              float alpha, float size, int color) {
        DrawUtil.drawTextCentered(GuiFonts.GUI_BODY.get(), text, boxX, boxY, boxW, boxH,
                ColorProvider.setAlpha(color, (int) (255 * alpha)), size);
    }

    /**
     * Мягкое затухание списка у верхней и нижней кромки.
     *
     * @param topFade    сила верхнего фейда (0..1) — 0, когда список в самом верху,
     *                   чтобы не затемнять первый ряд карточек
     * @param bottomFade сила нижнего фейда (0..1)
     */
    public static void drawScrollFade(float x, float y, float w, float h,
                                      float alpha, float topFade, float bottomFade) {
        if (topFade > 0.02f) {
            int top = ColorProvider.setAlpha(BG_TOP, (int) (235 * alpha * topFade));
            int clear = ColorProvider.setAlpha(BG_TOP, 0);
            DrawUtil.drawRound(x, y - 1f, w, 10f, 0f, top, top, clear, clear);
        }
        if (bottomFade > 0.02f) {
            int bottom = ColorProvider.setAlpha(BG_BOTTOM, (int) (235 * alpha * bottomFade));
            int clear = ColorProvider.setAlpha(BG_BOTTOM, 0);
            DrawUtil.drawRound(x, y + h - 9f, w, 10f, 0f, clear, clear, bottom, bottom);
        }
    }

    public static void drawScrollbar(float trackX, float trackY, float trackH, float thumbY, float thumbH, float alpha) {
        int accent = ColorProvider.getColorClient();
        DrawUtil.drawRound(trackX, trackY, 2f, trackH, 1f,
                ColorProvider.rgba(255, 255, 255, (int) (10 * alpha)));
        DrawUtil.drawRoundBlur(trackX - 0.6f, thumbY, 3.2f, thumbH, 1.6f,
                ColorProvider.setAlpha(accent, (int) (60 * alpha)), 5f);
        DrawUtil.drawRound(trackX - 0.6f, thumbY, 3.2f, thumbH, 1.6f,
                ColorProvider.setAlpha(accent, (int) (200 * alpha)),
                ColorProvider.setAlpha(accent, (int) (200 * alpha)),
                ColorProvider.setAlpha(ColorProvider.darken(accent, 0.25f), (int) (200 * alpha)),
                ColorProvider.setAlpha(ColorProvider.darken(accent, 0.25f), (int) (200 * alpha)));
    }

    public static void drawModuleCard(float x, float y, float w, float h, float headerH,
                                      float alpha, float enabled, float hover, boolean open) {
        int accent = ColorProvider.getColorClient();
        int a = (int) (255 * alpha);

        // Приподнимаем карточку тенью при наведении — даёт ощущение отклика.
        if (hover > 0.02f) {
            DrawUtil.drawRoundBlur(x + 1f, y + 2f, w - 2f, h, MODULE_RADIUS,
                    ColorProvider.rgba(0, 0, 0, (int) (60 * hover * alpha)), 10f);
        }

        // Свечение акцентом под включённой карточкой.
        if (enabled > 0.02f) {
            DrawUtil.drawRoundBlur(x, y, w, h, MODULE_RADIUS,
                    ColorProvider.setAlpha(accent, (int) (34 * enabled * alpha)), 12f);
        }

        // Тело карточки: при включении подмешиваем акцент в фон.
        int top = ColorProvider.interpolateColor(CARD_TOP,
                ColorProvider.interpolateColor(CARD_TOP, accent, 0.14f), enabled);
        int bottom = ColorProvider.interpolateColor(CARD_BOTTOM,
                ColorProvider.interpolateColor(CARD_BOTTOM, accent, 0.07f), enabled);
        if (hover > 0.01f) {
            top = ColorProvider.lighten(top, 0.05f * hover);
            bottom = ColorProvider.lighten(bottom, 0.04f * hover);
        }
        DrawUtil.drawRound(x, y, w, h, MODULE_RADIUS,
                ColorProvider.setAlpha(top, a), ColorProvider.setAlpha(top, a),
                ColorProvider.setAlpha(bottom, a), ColorProvider.setAlpha(bottom, a));

        // Обводка: белая на выключенной карточке, акцентная — на включённой.
        int outlineOff = ColorProvider.rgba(255, 255, 255, (int) ((12 + 12 * hover) * alpha));
        int outlineOn = ColorProvider.setAlpha(accent, (int) ((70 + 40 * hover) * alpha));
        DrawUtil.drawRoundOutline(x, y, w, h, MODULE_RADIUS, 1f,
                ColorProvider.interpolateColor(outlineOff, outlineOn, enabled));

        // Подложка под раскрытым блоком настроек.
        if (open && h > headerH + 2f) {
            DrawUtil.drawRound(x + 1f, y + headerH, w - 2f, h - headerH - 1f,
                    new Vector4f(0f, 0f, MODULE_RADIUS - 1f, MODULE_RADIUS - 1f),
                    ColorProvider.rgba(0, 0, 0, (int) (46 * alpha)));
        }
    }

    public static void drawActiveBar(float x, float y, float rowH, float alpha, float enabled) {
    }

    public static void drawToggle(float x, float y, float alpha, float enabled) {
        int accent = ColorProvider.getColorClient();
        int off = ColorProvider.rgba(46, 49, 61, (int) (255 * alpha));
        int on = ColorProvider.interpolateColor(off, ColorProvider.setAlpha(accent, (int) (255 * alpha)), enabled);

        // Свечение включённого тумблера.
        if (enabled > 0.02f) {
            DrawUtil.drawRoundBlur(x, y, TOGGLE_W, TOGGLE_H, TOGGLE_H / 2f,
                    ColorProvider.setAlpha(accent, (int) (85 * enabled * alpha)), 7f);
        }

        DrawUtil.drawRound(x, y, TOGGLE_W, TOGGLE_H, TOGGLE_H / 2f, on);
        DrawUtil.drawRoundOutline(x, y, TOGGLE_W, TOGGLE_H, TOGGLE_H / 2f, 0.8f,
                ColorProvider.rgba(255, 255, 255, (int) ((18 + 22 * enabled) * alpha)));

        float knob = TOGGLE_H - 2.6f;
        float knobX = x + 1.3f + (TOGGLE_W - knob - 2.6f) * enabled;
        DrawUtil.drawRoundBlur(knobX, y + 1.8f, knob, knob, knob / 2f,
                ColorProvider.rgba(0, 0, 0, (int) (70 * alpha)), 3f);
        DrawUtil.drawRound(knobX, y + 1.3f, knob, knob, knob / 2f,
                ColorProvider.rgba(255, 255, 255, (int) (255 * alpha)),
                ColorProvider.rgba(255, 255, 255, (int) (255 * alpha)),
                ColorProvider.rgba(226, 228, 236, (int) (255 * alpha)),
                ColorProvider.rgba(226, 228, 236, (int) (255 * alpha)));
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
                ColorProvider.setAlpha(ColorProvider.getColorInactiveText(), (int) (175 * alpha)),
                5.8f, 0.4f, 1f, maxW);
    }

    public static void drawGuiTitle(String text, float x, float y, float alpha, float size) {
        DrawUtil.drawText(GuiFonts.GUI_TITLE.get(), text, x, y,
                ColorProvider.setAlpha(ColorProvider.getColorText(), (int) (255 * alpha)), size);
    }

    public static void drawGuiBody(String text, float x, float y, float alpha, float size) {
        DrawUtil.drawText(GuiFonts.GUI_BODY.get(), text, x, y,
                ColorProvider.setAlpha(ColorProvider.getColorInactiveText(), (int) (220 * alpha)), size);
    }

    /**
     * Кнопка-«чип» для выбора режима/опции. Возвращаемого значения нет — это чистая отрисовка,
     * логика попадания курсора остаётся в компоненте.
     *
     * @param selected прогресс выбора (0..1)
     * @param hover    прогресс наведения (0..1)
     */
    public static void drawChip(String text, float x, float y, float w, float h,
                                float alpha, float selected, float hover, float fontSize) {
        int accent = ColorProvider.getColorClient();
        int a = (int) (255 * alpha);
        float radius = Math.min(h / 2f, 5f);

        int idleBg = ColorProvider.rgba(38, 41, 52, (int) (215 * alpha));
        if (hover > 0.01f) {
            idleBg = ColorProvider.interpolateColor(idleBg,
                    ColorProvider.rgba(51, 55, 68, (int) (230 * alpha)), hover);
        }

        if (selected > 0.02f) {
            DrawUtil.drawRoundBlur(x, y, w, h, radius,
                    ColorProvider.setAlpha(accent, (int) (75 * selected * alpha)), 6f);
        }

        int selTop = ColorProvider.setAlpha(accent, a);
        int selBottom = ColorProvider.setAlpha(ColorProvider.darken(accent, 0.22f), a);
        DrawUtil.drawRound(x, y, w, h, radius,
                ColorProvider.interpolateColor(idleBg, selTop, selected),
                ColorProvider.interpolateColor(idleBg, selTop, selected),
                ColorProvider.interpolateColor(idleBg, selBottom, selected),
                ColorProvider.interpolateColor(idleBg, selBottom, selected));

        DrawUtil.drawRoundOutline(x, y, w, h, radius, 0.8f,
                ColorProvider.interpolateColor(
                        ColorProvider.rgba(255, 255, 255, (int) ((14 + 14 * hover) * alpha)),
                        ColorProvider.rgba(255, 255, 255, (int) (60 * alpha)),
                        selected));

        // Текст выбранного чипа — белый, невыбранного — приглушённый.
        int textColor = ColorProvider.interpolateColor(
                ColorProvider.setAlpha(ColorProvider.getColorInactiveText(), a),
                ColorProvider.rgba(255, 255, 255, a),
                selected);
        DrawUtil.drawTextCentered(GuiFonts.GUI_BODY.get(), text, x, y, w, h, textColor, fontSize);
    }

    /** Заголовок группы настроек внутри карточки модуля. */
    public static void drawSettingLabel(String text, float x, float boxY, float boxH, float alpha, float size) {
        DrawUtil.drawTextVCentered(GuiFonts.GUI_BODY.get(), text, x, boxY, boxH,
                ColorProvider.setAlpha(ColorProvider.getColorText(), (int) (240 * alpha)), size);
    }

    public static void drawTooltip(float x, float y, float w, float h, float alpha) {
        DrawUtil.drawRoundBlur(x, y + 2f, w, h, 6f, ColorProvider.rgba(0, 0, 0, (int) (90 * alpha)), 10f);
        DrawUtil.drawRound(x, y, w, h, 6f, ColorProvider.rgba(26, 28, 37, (int) (250 * alpha)));
        DrawUtil.drawRoundOutline(x, y, w, h, 6f, 1f, ColorProvider.rgba(255, 255, 255, (int) (18 * alpha)));
    }

    /** Ширина строки основным шрифтом гуи. */
    public static float bodyWidth(String text, float size) {
        MsdfFont font = GuiFonts.GUI_BODY.get();
        return font == null || text == null ? 0f : font.getWidth(text, size);
    }
}

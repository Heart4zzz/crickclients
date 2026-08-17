package fun.crickclient.client.ui.clickgui.util;

import fun.crickclient.api.utils.render.RenderUtils;
import fun.crickclient.api.utils.render.fonts.msdf.Font;
import fun.crickclient.api.utils.render.fonts.msdf.MsdfFont;
import net.minecraft.client.util.math.MatrixStack;
import org.joml.Vector4f;

/**
 * Отрисовка примитивов клик гуи. Повторяет API {@code DrawUtil} старого клиента,
 * но рисует через {@link RenderUtils} этого клиента.
 * <p>
 * Порядок радиусов и цветов: top-left, top-right, bottom-right, bottom-left.
 */
public final class DrawUtil {

    /** Матрица кадра. Клик гуи масштабируется через ModelViewStack, поэтому здесь единичная. */
    private static final MatrixStack MATRICES = new MatrixStack();

    private DrawUtil() {
    }

    public static MatrixStack matrices() {
        return MATRICES;
    }

    // ===================== Защита от «нулевой» альфы =====================
    //
    // Шейдерные методы RenderUtils трактуют альфу 0 как 255 (полностью непрозрачный
    // цвет). Клик гуи постоянно анимирует альфу до нуля, поэтому без защиты элементы
    // на последних кадрах анимации вспыхивали сплошным белым/чёрным. Здесь полностью
    // прозрачные цвета либо не рисуются вовсе, либо (в градиентах, где прозрачным
    // должен быть только один угол) заменяются на почти невидимую альфу 1.

    private static boolean invisible(int color) {
        return (color >>> 24) == 0;
    }

    private static int safe(int color) {
        return invisible(color) ? (color & 0xFFFFFF) | 0x01000000 : color;
    }

    // ===================== Прямоугольники =====================

    public static void drawRound(float x, float y, float width, float height, float radius, int color) {
        if (invisible(color)) return;
        RenderUtils.drawRoundedRect(MATRICES, x, y, width, height, radius, color);
    }

    public static void drawRound(float x, float y, float width, float height, float radius, int color, int color2) {
        drawRound(x, y, width, height, radius, color, color, color2, color2);
    }

    public static void drawRound(float x, float y, float width, float height, float radius,
                                 int color, int color2, int color3, int color4) {
        if (invisible(color) && invisible(color2) && invisible(color3) && invisible(color4)) return;
        RenderUtils.drawGradientRect(MATRICES, x, y, width, height, radius, radius, radius, radius,
                safe(color), safe(color2), safe(color4), safe(color3));
    }

    public static void drawRound(float x, float y, float width, float height, float radius, float smoothness, int color) {
        drawRound(x, y, width, height, radius, color);
    }

    public static void drawRound(float x, float y, float width, float height, float radius, float smoothness,
                                 int color, int color2) {
        drawRound(x, y, width, height, radius, color, color2);
    }

    public static void drawRound(float x, float y, float width, float height, float radius, float smoothness,
                                 int color, int color2, int color3, int color4) {
        drawRound(x, y, width, height, radius, color, color2, color3, color4);
    }

    public static void drawRound(float x, float y, float width, float height, Vector4f radius, int color) {
        if (invisible(color)) return;
        RenderUtils.drawRoundedRect(MATRICES, x, y, width, height, radius.x, radius.y, radius.z, radius.w, color);
    }

    public static void drawRound(float x, float y, float width, float height, Vector4f radius, int color, int color2) {
        drawRound(x, y, width, height, radius, color, color, color2, color2);
    }

    public static void drawRound(float x, float y, float width, float height, Vector4f radius,
                                 int color, int color2, int color3, int color4) {
        if (invisible(color) && invisible(color2) && invisible(color3) && invisible(color4)) return;
        RenderUtils.drawGradientRect(MATRICES, x, y, width, height, radius.x, radius.y, radius.z, radius.w,
                safe(color), safe(color2), safe(color4), safe(color3));
    }

    public static void drawRound(float x, float y, float width, float height, Vector4f radius, float smoothness, int color) {
        drawRound(x, y, width, height, radius, color);
    }

    // ===================== Мягкая тень / свечение =====================

    public static void drawRoundBlur(float x, float y, float width, float height, float radius, int color,
                                     float blurIntensivity) {
        if (invisible(color)) return;
        RenderUtils.drawShadow(MATRICES, x, y, width, height, radius, Math.max(1f, blurIntensivity), color);
    }

    public static void drawRoundBlur(float x, float y, float width, float height, float radius, int color, int color2,
                                     float blurIntensivity) {
        if (invisible(color) && invisible(color2)) return;
        RenderUtils.drawShadow(MATRICES, x, y, width, height, radius, Math.max(1f, blurIntensivity),
                safe(color), safe(color2));
    }

    public static void drawRoundBlur(float x, float y, float width, float height, Vector4f radius, int color,
                                     float blurIntensivity) {
        if (invisible(color)) return;
        RenderUtils.drawShadow(MATRICES, x, y, width, height, Math.max(radius.x, radius.y),
                Math.max(1f, blurIntensivity), color);
    }

    // ===================== Обводка =====================

    public static void drawRoundOutline(float x, float y, float width, float height, float radius,
                                        float thickness, int color) {
        if (invisible(color)) return;
        RenderUtils.drawRoundedRectOutline(MATRICES, x, y, width, height, radius, radius, radius, radius,
                thickness, color);
    }

    public static void drawRoundOutline(float x, float y, float width, float height, Vector4f radius,
                                        float thickness, int color) {
        if (invisible(color)) return;
        RenderUtils.drawRoundedRectOutline(MATRICES, x, y, width, height, radius.x, radius.y, radius.z, radius.w,
                thickness, color);
    }

    public static void drawRoundOutline(float x, float y, float width, float height, float radius,
                                        float thickness, int topColor, int bottomColor) {
        if (invisible(topColor) && invisible(bottomColor)) return;
        RenderUtils.drawRoundedRectOutline(MATRICES, x, y, width, height, radius, radius, radius, radius,
                thickness, safe(topColor), safe(topColor), safe(bottomColor), safe(bottomColor));
    }

    // ===================== Круги =====================

    public static void drawCircle(float centerX, float centerY, float radius, int color) {
        if (invisible(color)) return;
        RenderUtils.drawRoundedRect(MATRICES, centerX - radius, centerY - radius, radius * 2f, radius * 2f, radius, color);
    }

    public static void drawRingArc(float centerX, float centerY, float radius, float thickness,
                                   float startDeg, float endDeg, int color) {
        if (invisible(color)) return;
        RenderUtils.drawRingArc(MATRICES, centerX - radius, centerY - radius, radius * 2f, thickness,
                startDeg, endDeg, color);
    }

    // ===================== Текст =====================

    public static void drawText(MsdfFont font, String text, float x, float y, int color, float size) {
        if (invisible(color)) return;
        Font sized = GuiFonts.sized(font, size);
        if (sized == null || text == null) return;
        sized.drawStringNoOffset(MATRICES, text, x, y + 2f, color);
    }

    public static void drawText(MsdfFont font, String text, float x, float y, int color, float size,
                                float fadeoutStart, float fadeoutEnd, float maxWidth) {
        if (invisible(color)) return;
        Font sized = GuiFonts.sized(font, size);
        if (sized == null || text == null) return;
        if (maxWidth > 0f && sized.getStringWidth(text) > maxWidth) {
            sized.drawStringWithFade(MATRICES, text, x, y + 2f, maxWidth, color);
            return;
        }
        sized.drawStringNoOffset(MATRICES, text, x, y + 2f, color);
    }

    public static float width(MsdfFont font, String text, float size) {
        return font == null || text == null ? 0f : font.getWidth(text, size);
    }

    // ===================== Центрирование текста =====================

    /**
     * Смещение от координаты Y, переданной в {@link #drawText}, до оптической середины строки,
     * в долях размера шрифта.
     * <p>
     * Базовая линия msdf-шрифта находится на {@code y + 2 + baselineHeight * size}. У текстового
     * атласа (suisse) высота заглавной буквы — {@code 0.805em}, значит середина капители лежит на
     * {@code y + 2 + (0.963 - 0.805 / 2) * size}. У шрифта иконок глифы отцентрованы относительно
     * {@code 0.4375em} над базовой линией, т.е. середина — {@code y + 2 + 0.5 * size}.
     */
    private static final float TEXT_CENTER_RATIO = 0.5607f;
    private static final float ICON_CENTER_RATIO = 0.5f;
    /** Константа {@code +2f}, которую {@link #drawText} добавляет к Y перед отрисовкой. */
    private static final float TEXT_BASE_OFFSET = 2f;

    private static float centerRatio(MsdfFont font) {
        return GuiFonts.ICONS_ATLAS.equals(GuiFonts.nameOf(font)) ? ICON_CENTER_RATIO : TEXT_CENTER_RATIO;
    }

    /** Y для {@link #drawText}, при котором строка окажется по центру бокса по вертикали. */
    public static float centeredTextY(MsdfFont font, float boxY, float boxH, float size) {
        return boxY + boxH / 2f - centerRatio(font) * size - TEXT_BASE_OFFSET;
    }

    /** Рисует текст, отцентрованный по вертикали внутри бокса. */
    public static void drawTextVCentered(MsdfFont font, String text, float x, float boxY, float boxH,
                                         int color, float size) {
        drawText(font, text, x, centeredTextY(font, boxY, boxH, size), color, size);
    }

    /** Рисует текст, отцентрованный и по горизонтали, и по вертикали внутри бокса. */
    public static void drawTextCentered(MsdfFont font, String text, float boxX, float boxY,
                                        float boxW, float boxH, int color, float size) {
        float tw = width(font, text, size);
        drawText(font, text, boxX + (boxW - tw) / 2f, centeredTextY(font, boxY, boxH, size), color, size);
    }

    /** Рисует текст по правому краю бокса с вертикальным центрированием. */
    public static void drawTextRight(MsdfFont font, String text, float rightX, float boxY, float boxH,
                                     int color, float size) {
        drawText(font, text, rightX - width(font, text, size),
                centeredTextY(font, boxY, boxH, size), color, size);
    }

    // ===================== Голова игрока =====================

    public static void drawPlayerHead(String username, float x, float y, float size, float radius, float alpha) {
        RenderUtils.drawPlayerHead(MATRICES, username, x, y, size, radius, alpha, 0f);
    }
}

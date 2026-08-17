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

    // ===================== Прямоугольники =====================

    public static void drawRound(float x, float y, float width, float height, float radius, int color) {
        RenderUtils.drawRoundedRect(MATRICES, x, y, width, height, radius, color);
    }

    public static void drawRound(float x, float y, float width, float height, float radius, int color, int color2) {
        drawRound(x, y, width, height, radius, color, color, color2, color2);
    }

    public static void drawRound(float x, float y, float width, float height, float radius,
                                 int color, int color2, int color3, int color4) {
        RenderUtils.drawGradientRect(MATRICES, x, y, width, height, radius, radius, radius, radius,
                color, color2, color4, color3);
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
        RenderUtils.drawRoundedRect(MATRICES, x, y, width, height, radius.x, radius.y, radius.z, radius.w, color);
    }

    public static void drawRound(float x, float y, float width, float height, Vector4f radius, int color, int color2) {
        drawRound(x, y, width, height, radius, color, color, color2, color2);
    }

    public static void drawRound(float x, float y, float width, float height, Vector4f radius,
                                 int color, int color2, int color3, int color4) {
        RenderUtils.drawGradientRect(MATRICES, x, y, width, height, radius.x, radius.y, radius.z, radius.w,
                color, color2, color4, color3);
    }

    public static void drawRound(float x, float y, float width, float height, Vector4f radius, float smoothness, int color) {
        drawRound(x, y, width, height, radius, color);
    }

    // ===================== Мягкая тень / свечение =====================

    public static void drawRoundBlur(float x, float y, float width, float height, float radius, int color,
                                     float blurIntensivity) {
        RenderUtils.drawShadow(MATRICES, x, y, width, height, radius, Math.max(1f, blurIntensivity), color);
    }

    public static void drawRoundBlur(float x, float y, float width, float height, float radius, int color, int color2,
                                     float blurIntensivity) {
        RenderUtils.drawShadow(MATRICES, x, y, width, height, radius, Math.max(1f, blurIntensivity), color, color2);
    }

    public static void drawRoundBlur(float x, float y, float width, float height, Vector4f radius, int color,
                                     float blurIntensivity) {
        RenderUtils.drawShadow(MATRICES, x, y, width, height, Math.max(radius.x, radius.y),
                Math.max(1f, blurIntensivity), color);
    }

    // ===================== Круги =====================

    public static void drawCircle(float centerX, float centerY, float radius, int color) {
        RenderUtils.drawRoundedRect(MATRICES, centerX - radius, centerY - radius, radius * 2f, radius * 2f, radius, color);
    }

    public static void drawRingArc(float centerX, float centerY, float radius, float thickness,
                                   float startDeg, float endDeg, int color) {
        RenderUtils.drawRingArc(MATRICES, centerX - radius, centerY - radius, radius * 2f, thickness,
                startDeg, endDeg, color);
    }

    // ===================== Текст =====================

    public static void drawText(MsdfFont font, String text, float x, float y, int color, float size) {
        Font sized = GuiFonts.sized(font, size);
        if (sized == null || text == null) return;
        sized.drawStringNoOffset(MATRICES, text, x, y + 2f, color);
    }

    public static void drawText(MsdfFont font, String text, float x, float y, int color, float size,
                                float fadeoutStart, float fadeoutEnd, float maxWidth) {
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
}

package fun.crickclient.client.ui.menu;

import fun.crickclient.api.utils.color.ColorUtils;
import fun.crickclient.api.utils.render.RenderUtils;
import fun.crickclient.api.utils.render.blur.BlurProgram;
import fun.crickclient.api.utils.render.fonts.msdf.Font;
import fun.crickclient.api.utils.render.fonts.msdf.Fonts;
import fun.crickclient.client.ui.clickgui.util.DrawUtil;
import fun.crickclient.client.ui.clickgui.util.GuiFonts;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;

/**
 * Дизайн-система Main Menu / Alt Manager.
 * <p>
 * Один акцент (blue-violet), одна гарнитура (suisse), единые материалы и отступы.
 * Никакого rainbow, никаких ярких белых рамок — глубина собирается из слоёв:
 * фон → размытый фон → полупрозрачный материал → лёгкий свет → контент.
 */
public final class MenuDesign {

    // ===================== Бренд-палитра =====================

    /** Единственный акцент клиента — blue-violet. */
    public static final int ACCENT = 0xFF6C7BFF;
    public static final int ACCENT_BRIGHT = 0xFF93A0FF;
    public static final int ACCENT_DEEP = 0xFF4A57D8;

    public static final int TEXT = 0xFFEDEFF6;
    public static final int TEXT_2 = 0xFF9AA1B5;
    public static final int TEXT_3 = 0xFF5F6678;

    /** Семантический цвет только для деструктивного действия (Remove). */
    public static final int DANGER = 0xFFE5484D;

    /** Атлас msdf-шрифта для основного текста. */
    public static final String FONT = "suisse";
    /** Атлас с глифами-символами (стрелки, треугольники). */
    public static final String FONT_GLYPH = "sf_regular";

    /** Матрица кадра — единичная, как в клик гуи. */
    private static final MatrixStack MATRICES = new MatrixStack();

    // ===================== Фон =====================

    private static final Identifier PANORAMA_FRONT = Identifier.of("minecraft", "textures/gui/title/background/panorama_0");
    private static boolean backgroundChecked;
    private static boolean backgroundAvailable;

    private MenuDesign() {
    }

    public static MatrixStack matrices() {
        return MATRICES;
    }

    /**
     * Масштаб композиции под размер окна. На маленьких окнах интерфейс сжимается,
     * но не до микроскопических размеров и без наложений.
     */
    public static float scale(float width, float height) {
        return MathHelper.clamp(Math.min(width / 1200f, height / 700f), 0.8f, 1.0f);
    }

    /** Компактный режим: скрываем второстепенные подписи, чтобы всё влезало. */
    public static boolean compact(float scale) {
        return scale < 0.94f;
    }

    // ===================== Кинематографичный фон =====================

    /**
     * Живой кинематографичный фон: реальная Minecraft-панорама с очень медленным
     * движением камеры (ken burns + drift) и лёгким параллаксом от курсора.
     * Поверх — тёмный cinematic grade, виньетка и едва заметный цветовой тон.
     * Без кубов, без частиц, без абстрактных фигур.
     */
    public static void renderBackground(MatrixStack matrices, float width, float height,
                                        float timeSeconds, float mouseX, float mouseY, float alpha) {
        if (!backgroundChecked) {
            backgroundChecked = true;
            try {
                backgroundAvailable = MinecraftClient.getInstance().getResourceManager()
                        .getResource(PANORAMA_FRONT).isPresent();
            } catch (Exception ignored) {
                backgroundAvailable = false;
            }
        }

        if (backgroundAvailable && alpha > 0.001f) {
            float zoom = 1.05f + 0.028f * (float) Math.sin(timeSeconds * 0.047);
            float cover = Math.max(width / 1024f, height / 1024f) * zoom;
            float imageWidth = 1024f * cover;
            float imageHeight = 1024f * cover;

            // Очень медленный drift камеры.
            float driftX = 16f * (float) Math.sin(timeSeconds * 0.0105);
            float driftY = 10f * (float) Math.cos(timeSeconds * 0.0135);
            // Едва заметный параллакс от курсора.
            float parallaxX = (mouseX / width - 0.5f) * 24f;
            float parallaxY = (mouseY / height - 0.5f) * 14f;

            float x = (width - imageWidth) / 2f + driftX + parallaxX;
            float y = (height - imageHeight) / 2f + driftY + parallaxY;
            RenderUtils.drawImage(matrices, PANORAMA_FRONT, x, y, imageWidth, imageHeight, 0xFFFFFFFF);
        } else {
            // Резервный градиент, если ресурс панорамы недоступен.
            RenderUtils.drawGradientRect(matrices, 0, 0, width, height, 0,
                    ColorUtils.rgba(10, 12, 20, 255), ColorUtils.rgba(6, 8, 14, 255));
        }

        // Тёмный cinematic grade.
        RenderUtils.drawGradientRect(matrices, 0, 0, width, height, 0,
                ColorUtils.rgba(9, 11, 20, (int) (150 * alpha)),
                ColorUtils.rgba(4, 5, 9, (int) (196 * alpha)));

        // Виньетка по краям.
        float vw = width * 0.24f;
        float vh = height * 0.30f;
        RenderUtils.drawGradientRect(matrices, 0, 0, vw, height, 0,
                ColorUtils.rgba(0, 0, 0, (int) (108 * alpha)), ColorUtils.rgba(0, 0, 0, 2), true);
        RenderUtils.drawGradientRect(matrices, width - vw, 0, vw, height, 0,
                ColorUtils.rgba(0, 0, 0, 2), ColorUtils.rgba(0, 0, 0, (int) (108 * alpha)), true);
        RenderUtils.drawGradientRect(matrices, 0, 0, width, vh, 0,
                ColorUtils.rgba(0, 0, 0, (int) (86 * alpha)), ColorUtils.rgba(0, 0, 0, 2), false);
        RenderUtils.drawGradientRect(matrices, 0, height - vh, width, vh, 0,
                ColorUtils.rgba(0, 0, 0, 2), ColorUtils.rgba(0, 0, 0, (int) (86 * alpha)), false);

        // Очень лёгкий фирменный тон (blue-violet).
        RenderUtils.drawGradientRect(matrices, 0, 0, width, height, 0,
                ColorUtils.rgba(0x6C, 0x7B, 0xFF, (int) (13 * alpha)),
                ColorUtils.rgba(0x4A, 0x57, 0xD8, (int) (18 * alpha)));

        // Мягкое движение света — два едва заметных пятна.
        float light1X = width * (0.24f + 0.10f * (float) Math.sin(timeSeconds * 0.016));
        float light1Y = height * (0.20f + 0.08f * (float) Math.cos(timeSeconds * 0.019));
        float light2X = width * (0.78f + 0.09f * (float) Math.cos(timeSeconds * 0.013));
        float light2Y = height * (0.66f + 0.10f * (float) Math.sin(timeSeconds * 0.017));
        drawSoftLight(matrices, light1X, light1Y, 340f * scale(width, height), ACCENT, (int) (15 * alpha));
        drawSoftLight(matrices, light2X, light2Y, 460f * scale(width, height), ACCENT_DEEP, (int) (17 * alpha));
    }

    private static void drawSoftLight(MatrixStack matrices, float x, float y, float diameter, int color, int alpha) {
        if (alpha <= 0) {
            return;
        }
        float radius = diameter / 2f;
        DrawUtil.drawRoundBlur(x - radius, y - radius, diameter, diameter, radius,
                ColorUtils.rgba(ColorUtils.red(color), ColorUtils.green(color), ColorUtils.blue(color), alpha), 26f);
    }

    // ===================== Материал (стекло с глубиной) =====================

    /**
     * Стеклянная поверхность в несколько слоёв:
     * размытый фон → полупрозрачный тёмный материал → светлая верхняя кромка →
     * почти незаметная рамка. Рамка не белая и не яркая.
     */
    public static void drawPanel(MatrixStack matrices, float x, float y, float width, float height,
                                 float radius, float alpha) {
        if (alpha <= 0.01f || width <= 0f || height <= 0f) {
            return;
        }

        // Слой 1: размытый фон (если blur-буфер ещё не готов — просто тёмная подложка).
        if (BlurProgram.getBuffer2() != null) {
            RenderUtils.drawBlur(matrices, x, y, width, height, radius, 1.0f,
                    ColorUtils.rgba(255, 255, 255, (int) (150 * alpha)));
        } else {
            RenderUtils.drawGradientRect(matrices, x, y, width, height, radius,
                    ColorUtils.rgba(15, 17, 26, (int) (205 * alpha)),
                    ColorUtils.rgba(15, 17, 26, (int) (205 * alpha)));
        }

        // Слой 2: полупрозрачный материал с вертикальным градиентом (глубина).
        RenderUtils.drawGradientRect(matrices, x, y, width, height, radius,
                ColorUtils.rgba(13, 15, 24, (int) (118 * alpha)),
                ColorUtils.rgba(19, 22, 33, (int) (168 * alpha)));

        // Слой 3: мягкий свет сверху.
        RenderUtils.drawGradientRect(matrices, x + 2f, y + 1f, width - 4f, 1.4f, 0.7f,
                ColorUtils.rgba(255, 255, 255, (int) (24 * alpha)),
                ColorUtils.rgba(255, 255, 255, 2));

        // Слой 4: почти незаметная рамка.
        DrawUtil.drawRoundOutline(x, y, width, height, radius, 1f,
                ColorUtils.rgba(255, 255, 255, (int) (12 * alpha)));
    }

    // ===================== Текст =====================

    public static void text(String value, float x, float y, int color, float size) {
        DrawUtil.drawText(GuiFonts.GUI_TITLE.get(), value, x, y, color, size);
    }

    public static void textCentered(String value, float boxX, float boxY, float boxW, float boxH,
                                    int color, float size) {
        DrawUtil.drawTextCentered(GuiFonts.GUI_TITLE.get(), value, boxX, boxY, boxW, boxH, color, size);
    }

    public static void textRight(String value, float rightX, float boxY, float boxH, int color, float size) {
        DrawUtil.drawTextRight(GuiFonts.GUI_TITLE.get(), value, rightX, boxY, boxH, color, size);
    }

    public static float textWidth(String value, float size) {
        return DrawUtil.width(GuiFonts.GUI_TITLE.get(), value, size);
    }

    /** Y для {@link #text}, при котором строка окажется по центру бокса по вертикали. */
    public static float textCenteredY(float size, float boxHeight) {
        return DrawUtil.centeredTextY(GuiFonts.GUI_TITLE.get(), 0f, boxHeight, size);
    }

    /** Глиф из символьного атласа (стрелки, треугольник play и т.п.). */
    public static void glyph(String atlas, String value, float x, float y, int color, float size) {
        Font font = Fonts.getFont(atlas, size * 2f);
        if (font != null) {
            font.drawString(MATRICES, value, x, y, color);
        }
    }

    public static float glyphWidth(String atlas, String value, float size) {
        Font font = Fonts.getFont(atlas, size * 2f);
        return font == null ? 0f : font.getStringWidth(value);
    }

    // ===================== Иконки (минималистичные, из примитивов) =====================

    /** Треугольник Play в круге. {@code size} — диаметр круга. */
    public static void iconPlay(MatrixStack matrices, float cx, float cy, float size, int circleColor, int glyphColor) {
        DrawUtil.drawCircle(cx, cy, size / 2f, circleColor);
        float glyphSize = size * 0.42f;
        glyph(FONT_GLYPH, "▶", cx - glyphWidth(FONT_GLYPH, "▶", glyphSize) / 2f, cy - glyphSize * 0.78f, glyphColor, glyphSize);
    }

    /** Серверы: два яруса с точками индикации. {@code x, y} — верхний левый угол бокса. */
    public static void iconServers(MatrixStack matrices, float x, float y, float box, int color) {
        float w = box * 0.82f;
        float h = box * 0.30f;
        float gap = box * 0.14f;
        float radius = h * 0.38f;
        float topY = y + box * 0.10f;
        float bottomY = topY + h + gap;

        DrawUtil.drawRound(x, topY, w, h, radius, color);
        DrawUtil.drawRound(x, bottomY, w, h, radius, color);
        float dotR = h * 0.16f;
        float dotY = topY + h / 2f;
        DrawUtil.drawCircle(x + w - h * 0.72f, dotY, dotR, color);
        DrawUtil.drawCircle(x + w - h * 0.72f, bottomY + h / 2f, dotR, color);
    }

    /** Профиль: голова + плечи. {@code x, y} — верхний левый угол бокса. */
    public static void iconAccount(MatrixStack matrices, float x, float y, float box, int color) {
        float headDiameter = box * 0.36f;
        float headCX = x + box / 2f;
        float headCY = y + box * 0.30f;
        DrawUtil.drawCircle(headCX, headCY, headDiameter / 2f, color);

        float shouldersSize = box * 0.72f;
        float shouldersCX = x + box / 2f;
        float shouldersCY = y + box * 0.55f;
        DrawUtil.drawRingArc(shouldersCX, shouldersCY, shouldersSize / 2f, box * 0.14f, 195f, 345f, color);
    }

    /** Настройки: кольцо с четырьмя спицами. {@code x, y} — верхний левый угол бокса. */
    public static void iconSettings(MatrixStack matrices, float x, float y, float box, int color) {
        float size = box * 0.74f;
        float cx = x + box / 2f;
        float cy = y + box / 2f;
        DrawUtil.drawRingArc(cx, cy, size / 2f, box * 0.13f, 0f, 360f, color);

        float spoke = box * 0.13f;
        float off = size / 2f;
        DrawUtil.drawCircle(cx - off, cy, spoke / 2f, color);
        DrawUtil.drawCircle(cx + off, cy, spoke / 2f, color);
        DrawUtil.drawCircle(cx, cy - off, spoke / 2f, color);
        DrawUtil.drawCircle(cx, cy + off, spoke / 2f, color);
    }

    /** Питание: разомкнутое кольцо с чертой. {@code x, y} — верхний левый угол бокса. */
    public static void iconPower(MatrixStack matrices, float x, float y, float box, int color) {
        float size = box * 0.62f;
        float cx = x + box / 2f;
        float cy = y + box / 2f;
        DrawUtil.drawRingArc(cx, cy, size / 2f, box * 0.13f, 225f, 315f, color);
        float barW = box * 0.10f;
        float barH = box * 0.34f;
        DrawUtil.drawRound(cx - barW / 2f, y + box * 0.16f, barW, barH, barW / 2f, color);
    }

    /** Плюс. {@code x, y} — центр. */
    public static void iconPlus(MatrixStack matrices, float cx, float cy, float box, int color) {
        float bar = box * 0.16f;
        DrawUtil.drawRound(cx - box / 2f, cy - bar / 2f, box, bar, bar / 2f, color);
        DrawUtil.drawRound(cx - bar / 2f, cy - box / 2f, bar, box, bar / 2f, color);
    }

    /** Шеврон вправо. {@code x, y} — центр. */
    public static void iconChevron(MatrixStack matrices, float cx, float cy, float box, int color) {
        float t = box * 0.24f;
        DrawUtil.drawRound(cx - t * 0.35f, cy - t, t * 0.7f, t * 2f, t * 0.35f, color);
        DrawUtil.drawRound(cx + t * 0.35f, cy - t, t * 0.7f, t * 2f, t * 0.35f, color);
    }

    // ===================== Утилиты =====================

    public static int withAlpha(int color, int alpha) {
        return ColorUtils.applyAlpha(color, MathHelper.clamp(alpha / 255f, 0f, 1f));
    }

    public static int accent(float alpha) {
        return ColorUtils.rgba(0x6C, 0x7B, 0xFF, (int) (255 * MathHelper.clamp(alpha, 0f, 1f)));
    }

    public static int accentBright(float alpha) {
        return ColorUtils.rgba(0x93, 0xA0, 0xFF, (int) (255 * MathHelper.clamp(alpha, 0f, 1f)));
    }

    /** Сброс GL-состояния после кастомных шейдеров (на всякий случай). */
    public static void restoreGlState() {
        RenderUtils.restoreHudGlState();
    }
}

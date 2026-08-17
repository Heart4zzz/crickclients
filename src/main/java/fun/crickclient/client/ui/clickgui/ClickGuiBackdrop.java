package fun.crickclient.client.ui.clickgui;

import fun.crickclient.client.ui.clickgui.util.ColorProvider;
import fun.crickclient.client.ui.clickgui.util.DrawUtil;

/**
 * Затемнение игрового мира за окном клик гуи.
 * <p>
 * Рисуется в НЕ масштабированных координатах экрана (см. {@code ClickGuiFrame}), поэтому
 * всегда покрывает экран целиком. Прямоугольники намеренно выходят за границы экрана на
 * {@link #OVERSCAN}, чтобы сглаживание краёв SDF-шейдера не оставляло светлую полоску по
 * периметру.
 */
public final class ClickGuiBackdrop {

    /** Запас за краями экрана, чтобы антиалиасинг скруглённого прямоугольника не «съел» кромку. */
    private static final float OVERSCAN = 8f;

    private ClickGuiBackdrop() {
    }

    public static void render(int width, int height, float alpha) {
        float a = Math.max(0f, Math.min(alpha, 1f));
        if (a < 0.01f) return;

        float x = -OVERSCAN;
        float y = -OVERSCAN;
        float w = width + OVERSCAN * 2f;
        float h = height + OVERSCAN * 2f;

        // Основная заливка: чуть светлее сверху, глубже к низу.
        DrawUtil.drawRound(x, y, w, h, 0f,
                ColorProvider.rgba(9, 10, 16, (int) (208 * a)),
                ColorProvider.rgba(9, 10, 16, (int) (208 * a)),
                ColorProvider.rgba(4, 5, 9, (int) (232 * a)),
                ColorProvider.rgba(4, 5, 9, (int) (232 * a)));

        // Мягкое свечение акцентом за окном — даёт объём и «подсвечивает» центр.
        int accent = ColorProvider.getColorClient();
        float cx = width / 2f;
        float cy = height / 2f;
        DrawUtil.drawRoundBlur(cx - 260f, cy - 170f, 520f, 340f, 140f,
                ColorProvider.setAlpha(accent, (int) (16 * a)), 90f);
        DrawUtil.drawRoundBlur(cx - 150f, cy - 100f, 300f, 200f, 100f,
                ColorProvider.setAlpha(accent, (int) (10 * a)), 60f);

        // Виньетка: затемняет углы, взгляд собирается в центре.
        renderVignette(width, height, a);
    }

    private static void renderVignette(int width, int height, float alpha) {
        int edge = ColorProvider.rgba(0, 0, 0, (int) (105 * alpha));
        int clear = ColorProvider.rgba(0, 0, 0, 0);
        float bandX = Math.min(width * 0.32f, 260f);
        float bandY = Math.min(height * 0.34f, 190f);

        // левая / правая
        DrawUtil.drawRound(-OVERSCAN, -OVERSCAN, bandX + OVERSCAN, height + OVERSCAN * 2f, 0f,
                edge, clear, edge, clear);
        DrawUtil.drawRound(width - bandX, -OVERSCAN, bandX + OVERSCAN, height + OVERSCAN * 2f, 0f,
                clear, edge, clear, edge);
        // верх / низ
        DrawUtil.drawRound(-OVERSCAN, -OVERSCAN, width + OVERSCAN * 2f, bandY + OVERSCAN, 0f,
                edge, edge, clear, clear);
        DrawUtil.drawRound(-OVERSCAN, height - bandY, width + OVERSCAN * 2f, bandY + OVERSCAN, 0f,
                clear, clear, edge, edge);
    }
}

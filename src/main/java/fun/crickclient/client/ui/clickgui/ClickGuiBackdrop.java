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

        // Ровная тёмная заливка: чуть светлее сверху, глубже к низу.
        // Никаких дополнительных прямоугольников-виньеток — они оставляли
        // видимые «квадраты» на фоне.
        DrawUtil.drawRound(x, y, w, h, 0f,
                ColorProvider.rgba(8, 9, 14, (int) (216 * a)),
                ColorProvider.rgba(8, 9, 14, (int) (216 * a)),
                ColorProvider.rgba(4, 5, 9, (int) (236 * a)),
                ColorProvider.rgba(4, 5, 9, (int) (236 * a)));
    }
}

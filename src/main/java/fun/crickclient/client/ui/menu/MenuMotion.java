package fun.crickclient.client.ui.menu;

import fun.crickclient.client.ui.clickgui.util.Animation;
import fun.crickclient.client.ui.clickgui.util.Easing;
import net.minecraft.util.math.MathHelper;

/**
 * Единый motion-язык Main Menu / Alt Manager.
 * <p>
 * Все экраны используют одинаковые длительности и easing'и:
 * <ul>
 *   <li>вход экрана — fade + translate (8px), QUINTIC_OUT, 340ms;</li>
 *   <li>выход экрана — fade + translate (-8px), QUINTIC_IN, 220ms;</li>
 *   <li>hover — 140ms, CUBIC_OUT;</li>
 *   <li>выбор/выделение — 200ms;</li>
 *   <li>модальное окно — fade + scale 0.98 → 1.0, 240ms.</li>
 * </ul>
 * Никаких bounce/elastic/overshoot — только спокойные OS-подобные анимации.
 */
public final class MenuMotion {

    public static final long SCREEN_ENTER_MS = 340L;
    public static final long SCREEN_EXIT_MS = 220L;
    public static final long HOVER_MS = 140L;
    public static final long SELECT_MS = 200L;
    public static final long MODAL_MS = 240L;

    public static final float SCREEN_SHIFT = 8.0f;

    public static final Easing ENTER_EASING = Easing.QUINTIC_OUT;
    public static final Easing EXIT_EASING = Easing.QUINTIC_IN;
    public static final Easing HOVER_EASING = Easing.CUBIC_OUT;
    public static final Easing SELECT_EASING = Easing.CUBIC_OUT;
    public static final Easing MODAL_EASING = Easing.QUINTIC_OUT;

    private MenuMotion() {
    }

    public static float clamp01(float value) {
        return MathHelper.clamp(value, 0.0f, 1.0f);
    }

    /** Прогресс (0..1) от начала анимации с clamp. */
    public static float progress(long startMs, long durationMs) {
        long elapsed = System.currentTimeMillis() - startMs;
        if (elapsed <= 0) {
            return 0.0f;
        }
        if (elapsed >= durationMs) {
            return 1.0f;
        }
        return (float) elapsed / (float) durationMs;
    }

    /** Новый Animation с дефолтным hover-таймингом. */
    public static Animation hover() {
        return new Animation(HOVER_EASING, HOVER_MS);
    }

    /** Новый Animation с дефолтным selection-таймингом. */
    public static Animation select() {
        return new Animation(SELECT_EASING, SELECT_MS);
    }
}

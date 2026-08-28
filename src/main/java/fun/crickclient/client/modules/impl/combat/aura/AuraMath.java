package fun.crickclient.client.modules.impl.combat.aura;

import java.util.concurrent.ThreadLocalRandom;

import net.minecraft.util.math.MathHelper;

/**
 * Math helpers of the ported AttackAura.
 * <p>
 * Ported from {@code rw.core.C1183} (random) and the hyperbolic smoothing used by
 * {@code rw.core.C0767} ("ft") / {@code rw.core.C0760} ("noise").
 */
public final class AuraMath {

    private AuraMath() {
    }

    /** {@code rw.core.C1183#m12000} — gaussian noise with the given amplitude. */
    public static float gaussian(float amplitude) {
        return (float) ThreadLocalRandom.current().nextGaussian() * amplitude;
    }

    /** {@code rw.core.C1183#m18000} — uniform value in [min, max]. */
    public static float random(float min, float max) {
        return min + (max - min) * ThreadLocalRandom.current().nextFloat();
    }

    /** {@code rw.core.C1183#m24000} — uniform integer in [min, max]. */
    public static int randomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(max - min + 1) + min;
    }

    /** {@code v * tanh(delta / v)} — the smoothing curve of the "ft" and "noise" rotations. */
    public static float tanh(float delta, float radius) {
        if (radius <= 0.0f) {
            return 0.0f;
        }
        return (float) (radius * Math.tanh(delta / radius));
    }

    public static float wrap(float angle) {
        return MathHelper.wrapDegrees(angle);
    }

    public static float clamp(float value, float min, float max) {
        return MathHelper.clamp(value, min, max);
    }

    public static double clamp(double value, double min, double max) {
        return MathHelper.clamp(value, min, max);
    }
}

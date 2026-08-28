package fun.crickclient.client.modules.impl.combat.aura;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Vec3d;

import fun.crickclient.api.utils.rotate.Rotation;

/**
 * "noise" rotation of the ported AttackAura.
 * <p>
 * Ported from {@code rw.core.C0760}: the same hyperbolic smoothing as "ft" but with fixed radii and
 * a gaussian noise added to every idle tick.
 */
public final class NoiseMode extends AuraMode {

    /** {@code f1000} — constants of the original mode. */
    private static final float YAW_RADIUS = 45.0F;
    private static final float PITCH_RADIUS = 5.0F;
    private static final float YAW_NOISE = 5.0F;
    private static final float PITCH_NOISE = 1.0F;

    public NoiseMode(Aura aura) {
        super(aura);
    }

    @Override
    public String name() {
        return "noise";
    }

    /** {@code rw.core.C0760#m12000} */
    @Override
    public Vec3d aimPoint(LivingEntity target, double range) {
        return AuraPoints.aimPoint(target, AuraPoints.playerRotation(), range);
    }

    /** {@code rw.core.C0760#m8000} */
    @Override
    public Rotation rotation(LivingEntity target, boolean attack, double range) {
        Rotation player = playerRotation();
        if (AuraCrits.attackTicks() == 1) {
            return player;
        }

        Rotation delta = delta(aimPoint(target, range));

        float yaw = AuraMath.tanh(delta.getYaw(), YAW_RADIUS) + (attack ? 0.0F : AuraMath.gaussian(YAW_NOISE));
        float pitch = AuraMath.tanh(delta.getPitch(), PITCH_RADIUS) + (attack ? 0.0F : AuraMath.gaussian(PITCH_NOISE));

        return offset(player, yaw, pitch);
    }
}

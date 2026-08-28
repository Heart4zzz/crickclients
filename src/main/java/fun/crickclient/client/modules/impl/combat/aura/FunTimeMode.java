package fun.crickclient.client.modules.impl.combat.aura;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

import fun.crickclient.api.utils.rotate.Rotation;

/**
 * "ft" rotation of the ported AttackAura.
 * <p>
 * Ported from {@code rw.core.C0767}: a hyperbolic (tanh) smoothing with a random radius per tick
 * plus a sinusoidal wobble, and an exact aim (with gaussian noise) on the attack tick.
 */
public final class FunTimeMode extends AuraMode {

    /** {@code f1000} — constants of the original mode. */
    private static final float ATTACK_NOISE = 2.0F;
    private static final float RADIUS_MIN = 40.0F;
    private static final float RADIUS_MAX = 60.0F;
    private static final float SWING_YAW = 10.0F;
    private static final float YAW_NOISE = 2.5F;
    private static final float PITCH_RADIUS = 8.0F;
    private static final float SWING_PITCH = 4.0F;
    private static final float PITCH_NOISE = 1.0F;

    public FunTimeMode(Aura aura) {
        super(aura);
    }

    @Override
    public String name() {
        return "ft";
    }

    /** {@code rw.core.C0767#m10000} */
    @Override
    public Vec3d aimPoint(LivingEntity target, double range) {
        return AuraPoints.aimPoint(target, AuraPoints.playerRotation(), range);
    }

    /** {@code rw.core.C0767#m12000} */
    @Override
    public Rotation rotation(LivingEntity target, boolean attack, double range) {
        Rotation player = playerRotation();
        if (AuraCrits.attackTicks() == 1) {
            return player;
        }

        Rotation delta = delta(aimPoint(target, range));
        int age = mc.player.age;

        float yaw = attack
                ? delta.getYaw() + AuraMath.gaussian(ATTACK_NOISE)
                : AuraMath.tanh(delta.getYaw(), AuraMath.random(RADIUS_MIN, RADIUS_MAX))
                + (MathHelper.sin(age) * SWING_YAW + AuraMath.gaussian(YAW_NOISE));

        float pitch = AuraMath.tanh(delta.getPitch(), PITCH_RADIUS)
                + (MathHelper.cos(age) * SWING_PITCH + AuraMath.gaussian(PITCH_NOISE));

        return offset(player, yaw, pitch);
    }
}

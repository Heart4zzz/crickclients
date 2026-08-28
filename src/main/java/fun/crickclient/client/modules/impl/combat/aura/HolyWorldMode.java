package fun.crickclient.client.modules.impl.combat.aura;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

import fun.crickclient.api.utils.rotate.Rotation;

/**
 * "hw" rotation of the ported AttackAura.
 * <p>
 * Ported from {@code rw.core.C0771}: the mode only rotates during the two ticks around an attack,
 * moves proportionally to the yaw/pitch delta (so both axes arrive at the same time) and adds a
 * small gaussian noise. The aim point is the grid sampler of {@link AuraPoints}.
 */
public final class HolyWorldMode extends AuraMode {

    /** {@code f2000} — constants of the original mode. */
    private static final float MAX_SPEED = 360.0F;
    private static final float YAW_NOISE = 0.6F;
    private static final float PITCH_NOISE = 0.3F;
    /** {@code f1000[0]} — the rotation is kept for two ticks after an attack. */
    private static final int ACTIVE_TICKS = 2;

    private int timer;

    public HolyWorldMode(Aura aura) {
        super(aura);
    }

    @Override
    public String name() {
        return "hw";
    }

    /** {@code rw.core.C0771#m12000} */
    @Override
    public Vec3d aimPoint(LivingEntity target, double range) {
        return AuraPoints.gridPoint(target, AuraPoints.playerRotation(), true, aura.attackRange());
    }

    /** {@code rw.core.C0771#m14000} */
    @Override
    public Rotation rotation(LivingEntity target, boolean attack, double range) {
        if (timer > 0) {
            timer--;
        }

        if (attack) {
            timer = ACTIVE_TICKS;
        }

        if (timer == 0) {
            return currentRotation();
        }

        Rotation player = playerRotation();
        Rotation delta = delta(aimPoint(target, range));

        float length = (float) Math.hypot(Math.abs(delta.getYaw()), Math.abs(delta.getPitch()));
        if (length <= 0.0F) {
            return player;
        }

        float maxYaw = Math.abs(delta.getYaw() / length) * MAX_SPEED;
        float maxPitch = Math.abs(delta.getPitch() / length) * MAX_SPEED;

        float yaw = player.getYaw()
                + MathHelper.clamp(delta.getYaw(), -maxYaw, maxYaw)
                + AuraMath.gaussian(YAW_NOISE);
        float pitch = player.getPitch()
                + MathHelper.clamp(delta.getPitch(), -maxPitch, maxPitch)
                + AuraMath.gaussian(PITCH_NOISE);

        return new Rotation(yaw, MathHelper.clamp(pitch, -90.0F, 90.0F));
    }

    @Override
    public void reset() {
        super.reset();
        timer = 0;
    }
}

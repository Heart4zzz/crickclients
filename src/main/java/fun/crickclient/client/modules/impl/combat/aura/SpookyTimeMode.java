package fun.crickclient.client.modules.impl.combat.aura;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

import fun.crickclient.api.utils.rotate.Rotation;

/**
 * "spooky-time" rotation of the ported AttackAura.
 * <p>
 * Ported from {@code rw.core.HlPo} + {@code rw.core.OlkrOkjjj} (the aim/rotation pipeline of that
 * mode). The pipeline of the source client is:
 * <ol>
 *     <li>sample the target hitbox (predicted by its velocity),</li>
 *     <li>keep the crosshair still while the target is already under it (the "spooky" part),</li>
 *     <li>move towards the point with a speed that depends on the distance to the target
 *     ({@code 7 + distance * 1.6}, clamped to {@code [8, 15.5]} degrees per tick),</li>
 *     <li>fall back to a yaw-only movement when the pitch cannot be reached in time.</li>
 * </ol>
 * The numeric constants are taken from {@code rw.core.OlkrOkjjj}.
 */
public final class SpookyTimeMode extends AuraMode {

    /** {@code f4000} — deltas below these values keep the crosshair still. */
    private static final float HOLD_YAW = 2.4F;
    private static final float HOLD_PITCH = 1.15F;
    /** {@code f4000[4]} / {@code f4000[5]} / {@code f7000[0]} — speed of the movement. */
    private static final float SPEED_BASE = 7.0F;
    private static final float SPEED_PER_BLOCK = 1.6F;
    private static final float SPEED_MIN = 8.0F;
    private static final float SPEED_MAX = 15.5F;
    /** {@code f7000[5]} / {@code f7000[6]} — gaussian noise of the movement. */
    private static final float YAW_NOISE = 0.38F;
    private static final float PITCH_NOISE = 0.28F;
    /** {@code f7000[3]} — pitch delta that switches the mode to a yaw only movement. */
    private static final float YAW_ONLY_PITCH = 4.5F;
    /** Ratio between the pitch speed and the yaw speed. */
    private static final float PITCH_RATIO = 0.6F;
    /** Velocity prediction of the sampled hitbox. */
    private static final double PREDICTION = 2.0;

    public SpookyTimeMode(Aura aura) {
        super(aura);
    }

    @Override
    public String name() {
        return "spooky-time";
    }

    /** The aim point is sampled from the hitbox predicted by the target velocity. */
    @Override
    public Vec3d aimPoint(LivingEntity target, double range) {
        Vec3d velocity = new Vec3d(target.getX() - target.prevX, target.getY() - target.prevY,
                target.getZ() - target.prevZ).multiply(PREDICTION);
        return AuraPoints.aimPoint(target.getBoundingBox().offset(velocity), playerRotation(), range);
    }

    @Override
    public Rotation rotation(LivingEntity target, boolean attack, double range) {
        Rotation player = playerRotation();
        Vec3d point = aimPoint(target, range);
        Rotation toPoint = AuraPoints.toRotation(point);

        float yawDelta = MathHelper.wrapDegrees(toPoint.getYaw() - player.getYaw());
        float pitchDelta = toPoint.getPitch() - player.getPitch();

        if (hits(player, target, range)
                && Math.abs(yawDelta) <= HOLD_YAW
                && Math.abs(pitchDelta) <= HOLD_PITCH) {
            return player;
        }

        double distance = mc.player.getEyePos().distanceTo(point);
        float speed = MathHelper.clamp(SPEED_BASE + (float) distance * SPEED_PER_BLOCK, SPEED_MIN, SPEED_MAX);

        float yaw = MathHelper.clamp(yawDelta, -speed, speed) + AuraMath.gaussian(YAW_NOISE);
        float pitch = MathHelper.clamp(pitchDelta, -speed * PITCH_RATIO, speed * PITCH_RATIO)
                + AuraMath.gaussian(PITCH_NOISE);

        Rotation candidate = offset(player, yaw, pitch);
        if (Math.abs(pitchDelta) > YAW_ONLY_PITCH && !hits(offset(player, yaw, 0.0F), target, range)) {
            candidate = offset(player, yaw, 0.0F);
        }

        return candidate;
    }

    /** {@code rw.core.C0768#m36000} — the target is under the given rotation. */
    private boolean hits(Rotation rotation, LivingEntity target, double range) {
        EntityHitResult hit = AuraRaycast.entityRaycast(mc.player, rotation, range, true, entity -> entity == target);
        return hit != null && hit.getType() == HitResult.Type.ENTITY && hit.getEntity() == target;
    }
}

package fun.crickclient.client.modules.impl.combat.aura;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Vec3d;

import fun.crickclient.api.utils.rotate.Rotation;

/**
 * "grim" rotation of the ported AttackAura.
 * <p>
 * Ported from {@code rw.core.C0776}: the crosshair stays where it is while the swing cooldown runs
 * and only snaps on the target at the attack tick (with a small random drift afterwards) — the
 * classic bypass for the Grim rotation checks.
 */
public final class GrimMode extends AuraMode {

    /** {@code f2000} — constants of the original mode. */
    private static final float DRIFT_MIN = 7.0F;
    private static final float DRIFT_MAX = 13.0F;

    /** {@code f1000[0]} — the rotation has to drift on the next idle tick. */
    private boolean drift;

    public GrimMode(Aura aura) {
        super(aura);
    }

    @Override
    public String name() {
        return "grim";
    }

    /** {@code rw.core.C0776#m10000} */
    @Override
    public Vec3d aimPoint(LivingEntity target, double range) {
        return AuraPoints.aimPoint(target, AuraPoints.playerRotation(), range);
    }

    /** {@code rw.core.C0776#m12000} */
    @Override
    public Rotation rotation(LivingEntity target, boolean attack, double range) {
        if (AuraCrits.attackTicks() > 1 && !attack) {
            drift = true;
            return currentRotation();
        }

        if (attack) {
            EntityHitResult hit = AuraRaycast.entityRaycast(mc.player, currentRotation(), range, true,
                    entity -> entity == target);
            if (hit != null && hit.getType() == HitResult.Type.ENTITY) {
                drift = false;
                return currentRotation();
            }
        }

        Rotation delta = delta(aimPoint(target, range));
        float amount = drift ? AuraMath.random(DRIFT_MIN, DRIFT_MAX) : 0.0F;

        float yaw = attack ? delta.getYaw() : amount;
        float pitch = attack ? delta.getPitch() : (mc.player.getPitch() > 0.0F ? -amount : amount);

        return offset(playerRotation(), yaw, pitch);
    }

    @Override
    public void reset() {
        super.reset();
        drift = false;
    }
}

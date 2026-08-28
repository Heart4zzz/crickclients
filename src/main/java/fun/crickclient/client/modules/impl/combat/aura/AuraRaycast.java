package fun.crickclient.client.modules.impl.combat.aura;

import java.util.Optional;
import java.util.function.Predicate;

import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.ProjectileUtil;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;

import fun.crickclient.api.QClient;
import fun.crickclient.api.utils.rotate.Rotation;
import fun.crickclient.api.utils.rotate.RotationUtils;

/**
 * Ray-cast helpers of the ported AttackAura.
 * <p>
 * Ported from {@code rw.core.C1176}.
 */
public final class AuraRaycast implements QClient {

    private AuraRaycast() {
    }

    private static Box hitbox(Entity entity) {
        return entity.getBoundingBox().expand(entity.getTargetingMargin());
    }

    /** {@code rw.core.C1176#m14000} — first point of {@code entity} hit by the [from, to] segment. */
    public static Optional<Vec3d> boxRaycast(Vec3d from, Vec3d to, Entity entity) {
        Box box = hitbox(entity);
        return box.contains(from) ? Optional.of(from) : box.raycast(from, to);
    }

    /** {@code rw.core.C1176#m26000} — true when the segment does NOT touch the box. */
    public static boolean missesBox(Vec3d from, Vec3d to, Box box) {
        return box.contains(from) ? false : box.raycast(from, to).isEmpty();
    }

    /** {@code rw.core.C1176#m54000} — true when the segment does NOT touch the entity. */
    public static boolean missesEntity(Vec3d from, Vec3d to, Entity entity) {
        return missesBox(from, to, hitbox(entity));
    }

    /** {@code rw.core.C1176#m60000} — true when the entity is under the given rotation. */
    public static boolean missesEntity(Rotation rotation, double range, Entity entity) {
        Vec3d eye = mc.player.getEyePos();
        Vec3d direction = RotationUtils.getRotationVector(rotation.getPitch(), rotation.getYaw()).multiply(range);
        return missesEntity(eye, eye.add(direction), entity);
    }

    /** {@code rw.core.C1176#m28000} — block ray-cast used for the visibility checks. */
    public static BlockHitResult blockRaycast(Vec3d from, Vec3d to) {
        return mc.world.raycast(new RaycastContext(from, to, RaycastContext.ShapeType.OUTLINE,
                RaycastContext.FluidHandling.NONE, mc.player));
    }

    /** {@code rw.core.C1176#m46000} — true when no block blocks the [from, to] segment. */
    public static boolean noBlocksBetween(Vec3d from, Vec3d to) {
        return blockRaycast(from, to).getType() == HitResult.Type.MISS;
    }

    /** {@code rw.core.C1176#m50000} — same, starting from the player eye. */
    public static boolean noBlocksTo(Vec3d to) {
        return noBlocksBetween(mc.player.getEyePos(), to);
    }

    /**
     * {@code rw.gui.AttackAura#m142000} — true when a wall stands between the player eye and
     * {@code point} (the entity has to be closer than the block hit to count as visible).
     */
    public static boolean isBlocked(Vec3d point, Entity entity) {
        Vec3d eye = mc.player.getEyePos();
        BlockHitResult blockHit = blockRaycast(eye, point);
        if (blockHit.getType() == HitResult.Type.MISS) {
            return false;
        }
        return boxRaycast(eye, point, entity)
                .map(hit -> hit.distanceTo(eye) > blockHit.getPos().distanceTo(eye))
                .orElse(true);
    }

    /** Convenience: true when the point can be seen from the player eye. */
    public static boolean isVisible(Vec3d point, Entity entity) {
        return !isBlocked(point, entity);
    }

    /** {@code rw.core.C1176#m68000} / {@code m52000} — entity ray-cast along a rotation. */
    public static EntityHitResult entityRaycast(Entity origin, Rotation rotation, double range, boolean strict,
                                                Predicate<Entity> filter) {
        Vec3d eye = origin.getEyePos();
        Vec3d direction = RotationUtils.getRotationVector(rotation.getPitch(), rotation.getYaw());
        Vec3d end = eye.add(direction.multiply(range));

        if (strict) {
            EntityHitResult vanilla = origin.raycast(range, 1.0F, false);
            if (vanilla == null) {
                return null;
            }
            double vanillaDistance = vanilla.getPos().distanceTo(eye);
            EntityHitResult filtered = ProjectileUtil.raycast(origin, eye, end,
                    origin.getBoundingBox().expand(range), filter, range * range);
            if (filtered == null || filtered.getPos().distanceTo(eye) < vanillaDistance) {
                return vanilla;
            }
            return filtered;
        }

        return ProjectileUtil.raycast(origin, eye, end, origin.getBoundingBox().expand(range), filter, range * range);
    }

    /** {@code rw.core.C1176#m32000} — entity ray-cast along the entity look vector. */
    public static EntityHitResult entityRaycast(Entity origin, double range, Predicate<Entity> filter) {
        Vec3d eye = origin.getEyePos();
        Vec3d end = eye.add(origin.getRotationVec(1.0F).multiply(range));
        return ProjectileUtil.raycast(origin, eye, end, origin.getBoundingBox().expand(range), filter, range * range);
    }
}

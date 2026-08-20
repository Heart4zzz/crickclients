package fun.crickclient.client.modules.impl.combat.components.rotations;

import lombok.experimental.UtilityClass;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.MaceItem;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.World;

import fun.crickclient.api.QClient;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * Вспомогательные методы ротации «ФанТайм ФОВ» — порт {@code AuraUtil} из
 * референс-клиента 1:1 (мультипоинт-точка прицела, FOV-рейкасты, плавный поворот
 * с GCD-патчем, проверки падения/движения).
 */
@UtilityClass
public class FunTimeUtil implements QClient {

    /** Аналог {@code MaceUtil.a()} референса: в руке булава и она не на перезарядке. */
    public static boolean isMaceActive() {
        return mc.player != null
                && mc.player.getMainHandStack().getItem() instanceof MaceItem
                && !mc.player.getItemCooldownManager().isCoolingDown(mc.player.getMainHandStack());
    }

    /** Попадает ли цель в дистанцию (AuraUtil.a(entity, maxReach) в референсе). */
    public static boolean isEntityInRange(Entity entity, double maxReach) {
        if (mc.player == null || entity == null) {
            return false;
        }
        Vec3d eye = mc.player.getEyePos();
        Box box = entity.getBoundingBox();
        double cx = MathHelper.clamp(eye.x, box.minX, box.maxX);
        double cy = MathHelper.clamp(eye.y, box.minY, box.maxY);
        double cz = MathHelper.clamp(eye.z, box.minZ, box.maxZ);
        double dx = cx - eye.x;
        double dy = cy - eye.y;
        double dz = cz - eye.z;
        return (dx * dx + dy * dy + dz * dz) <= maxReach * maxReach;
    }

    /** Попадает ли направление взгляда в хитбокс цели (AuraUtil.a(yaw, pitch, dist, entity, throwalls)). */
    public static boolean isEntityInFov(float yaw, float pitch, double distance, Entity entity, boolean throughWalls) {
        if (mc.player == null || mc.world == null || entity == null) {
            return false;
        }
        return isEntityInFov(mc.player.getEyePos(), yaw, pitch, distance, entity, throughWalls);
    }

    public static boolean isEntityInFov(Vec3d rayOrigin, float yaw, float pitch, double distance, Entity entity, boolean throughWalls) {
        if (mc.player == null || mc.world == null || entity == null) {
            return false;
        }
        Vec3d dir = Vec3d.fromPolar(pitch, yaw).multiply(distance);
        Optional<Vec3d> hit = entity.getBoundingBox().contains(rayOrigin)
                ? Optional.of(rayOrigin)
                : entity.getBoundingBox().raycast(rayOrigin, rayOrigin.add(dir));
        if (hit.isEmpty()) {
            return false;
        }
        if (!throughWalls && mc.world.raycast(new RaycastContext(
                rayOrigin, hit.get(), RaycastContext.ShapeType.OUTLINE,
                RaycastContext.FluidHandling.NONE, mc.player
        )).getType() != HitResult.Type.MISS) {
            return false;
        }
        return true;
    }

    /** Плавный поворот с GCD-патчем (AuraUtil.a(start, end, amount) в референсе). */
    public static float smoothAngle(float start, float end, float amount) {
        float a = MathHelper.clamp(amount, 0.0f, 1.0f);
        float d = MathHelper.wrapDegrees(end - start);
        if (Math.abs(d) < 0.5f) {
            return end;
        }
        float stepped = MathHelper.wrapDegrees(start + (d * a));
        float patched = patchAngle(start, stepped);
        float remaining = MathHelper.wrapDegrees(end - patched);
        return Math.abs(remaining) < 0.5f ? end : patched;
    }

    /** GCD-патч угла (аналог RotationProcessor.a в референсе). */
    private static float patchAngle(float start, float target) {
        double s = mc.options.getMouseSensitivity().getValue() * 0.6 + 0.2;
        float gcd = (float) (s * s * s * 1.2);
        float delta = MathHelper.wrapDegrees(target - start);
        return start + Math.round(delta / gcd) * gcd;
    }

    /**
     * Точка прицела по мультипоинту с рейкастами (AuraUtil.a(eye, target, reach, throughWalls)).
     * Возвращает направление от глаза игрока до лучшей точки хитбокса цели.
     */
    public static Vec3d computeAimPoint(Vec3d eye, LivingEntity target, double reach, boolean throughWalls) {
        if (mc.player == null || mc.world == null || target == null) {
            return Vec3d.ZERO;
        }
        Box bb = target.getBoundingBox();
        boolean mace = isMaceActive();
        Vec3d aimEye = (!mace || mc.player == null) ? eye : eye.add(mc.player.getVelocity());
        double mx = (bb.minX + bb.maxX) * 0.5d;
        double mz = (bb.minZ + bb.maxZ) * 0.5d;
        Vec3d targetEye = target.getPos().add(0.0d, target.getStandingEyeHeight(), 0.0d);
        double distToTargetEye = aimEye.distanceTo(targetEye);
        Vec3d aimOrigin = aimEye;
        if (mace && distToTargetEye > 3.0d) {
            aimOrigin = new Vec3d(aimEye.x, targetEye.y, aimEye.z);
        }
        double blendDist = mace ? Math.min(distToTargetEye, 3.0d) : distToTargetEye;
        double aimHeight = aimEye.y;
        if (mace && distToTargetEye > 3.0d) {
            aimHeight = targetEye.y;
        }
        double ay = MathHelper.lerp(MathHelper.clamp(blendDist / 3.0d, 0.0d, 1.0d),
                bb.minY, MathHelper.clamp(aimHeight, bb.minY, bb.maxY));
        Vec3d ideal = new Vec3d(mx, ay, mz);

        List<Vec3d> pts = new ArrayList<>();
        pts.add(ideal);
        double[] t = {0.0d, 0.125d, 0.25d, 0.375d, 0.5d, 0.625d, 0.75d, 0.875d, 1.0d};
        int last = t.length - 1;
        for (int a = 0; a < t.length; a++) {
            for (int b = 0; b < t.length; b++) {
                for (int c = 0; c < t.length; c++) {
                    if (a == 0 || a == last || b == 0 || b == last || c == 0 || c == last) {
                        pts.add(new Vec3d(
                                MathHelper.lerp(t[a], bb.minX, bb.maxX),
                                MathHelper.lerp(t[b], bb.minY, bb.maxY),
                                MathHelper.lerp(t[c], bb.minZ, bb.maxZ)));
                    }
                }
            }
        }

        for (double pad : new double[]{0.0d, 0.20000001551382535d}) {
            List<Vec3d> visible = new ArrayList<>();
            for (Vec3d p : pts) {
                Vec3d d = p.subtract(aimOrigin);
                double len = d.length();
                double limit = reach + pad;
                if (mace || len <= limit) {
                    float traceDist = (float) (mace ? len + pad + 0.010000001417203743d : limit);
                    if (isEntityInFov(aimOrigin,
                            (float) MathHelper.wrapDegrees(Math.toDegrees(Math.atan2(d.z, d.x)) - 90.0d),
                            (float) (-Math.toDegrees(Math.atan2(d.y, Math.hypot(d.x, d.z)))),
                            traceDist, target, false)) {
                        visible.add(p);
                    }
                }
            }
            if (!visible.isEmpty()) {
                Vec3d centroid = visible.stream().reduce(Vec3d.ZERO, (v0, v1) -> v0.add(v1))
                        .multiply(1.0d / visible.size());
                return visible.stream()
                        .min(Comparator.comparingDouble(pt -> pt.squaredDistanceTo(centroid)))
                        .get()
                        .subtract(aimOrigin);
            }
            if (throughWalls) {
                List<Vec3d> through = new ArrayList<>();
                for (Vec3d p2 : pts) {
                    Vec3d d2 = p2.subtract(aimOrigin);
                    double len2 = d2.length();
                    double limit2 = reach + pad;
                    if (mace || len2 <= limit2) {
                        float traceDist2 = (float) (mace ? len2 + pad + 0.010000001417203743d : limit2);
                        if (isEntityInFov(aimOrigin,
                                (float) MathHelper.wrapDegrees(Math.toDegrees(Math.atan2(d2.z, d2.x)) - 90.0d),
                                (float) (-Math.toDegrees(Math.atan2(d2.y, Math.hypot(d2.x, d2.z)))),
                                traceDist2, target, true)) {
                            through.add(p2);
                        }
                    }
                }
                if (!through.isEmpty()) {
                    Vec3d centroid2 = through.stream().reduce(Vec3d.ZERO, (v0, v1) -> v0.add(v1))
                            .multiply(1.0d / through.size());
                    return through.stream()
                            .min(Comparator.comparingDouble(pt -> pt.squaredDistanceTo(centroid2)))
                            .get()
                            .subtract(aimOrigin);
                }
            }
        }
        return Vec3d.ZERO;
    }

    /** Можно ли свободно двигаться (AuraUtil.b() в референсе). */
    public static boolean canMove() {
        if (mc.player == null || mc.player.getWorld() == null) {
            return false;
        }
        World world = mc.player.getWorld();
        BlockPos eye = BlockPos.ofFloored(mc.player.getEyePos());
        FluidState fluid = world.getFluidState(eye);
        return !(mc.player.hasStatusEffect(StatusEffects.LEVITATION)
                || mc.player.hasStatusEffect(StatusEffects.BLINDNESS)
                || fluid.isIn(FluidTags.WATER)
                || fluid.isIn(FluidTags.LAVA)
                || mc.player.getAbilities().flying
                || mc.player.isGliding()
                || mc.player.isClimbing()
                || mc.player.hasVehicle());
    }

    /** Падение (AuraUtil.c() в референсе). */
    public static boolean isFalling() {
        return mc.player != null && canMove() && mc.player.fallDistance > 0.0f && !mc.player.isOnGround();
    }

    /** Пусто ли под ногами при падении (AuraUtil.a() в референсе). */
    public static boolean isFallingEmpty() {
        if (mc.player == null || mc.world == null) {
            return false;
        }
        double dy = (mc.player.getVelocity().y - 0.08000000049877275d) * 0.9799995837206814d;
        if (dy >= 0.0d) {
            return false;
        }
        Box moved = mc.player.getBoundingBox().offset(0.0d, dy, 0.0d);
        Box feet = new Box(moved.minX, moved.minY - 0.010000001417203743d, moved.minZ,
                moved.maxX, moved.minY, moved.maxZ);
        return mc.world.isBlockSpaceEmpty(mc.player, feet);
    }

    /** Автоудар в падении (AuraUtil.a(ticks, target, checks) в референсе). */
    public static boolean isFallingCritReady(int ticks, LivingEntity target, boolean checks) {
        if (mc.player == null) {
            return false;
        }
        return !checks && ticks >= 7 && isEntityInRange(target, 3.0d)
                && mc.player.getAttackCooldownProgress(0.5f) > 0.7f && isFallingEmpty();
    }
}

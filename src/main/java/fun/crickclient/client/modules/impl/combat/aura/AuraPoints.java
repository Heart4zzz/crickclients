package fun.crickclient.client.modules.impl.combat.aura;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

import fun.crickclient.api.QClient;
import fun.crickclient.api.utils.rotate.Rotation;
import fun.crickclient.api.utils.rotate.RotationUtils;

/**
 * Aim point (multi-point) sampler of the ported AttackAura.
 * <p>
 * Ported from {@code rw.core.C1177}:
 * <ul>
 *     <li>{@code m52000} / {@code m80000} — the point of the hitbox closest to the player eye,</li>
 *     <li>{@code m44000} — grid sampler (10x10x10 over the hitbox shell, used by "hw"),</li>
 *     <li>{@code m56000} / {@code m70000} — precise sampler (face intersection + golden section search
 *     over the face edges, used by "ft", "grim", "noise" and "spooky-time").</li>
 * </ul>
 */
public final class AuraPoints implements QClient {

    /** Grid resolution of {@code rw.core.C1177}. */
    private static final int GRID = 10;
    /** Hitbox inset used by every sampler. */
    private static final double SHRINK = 0.01;
    /** Maximum inset of {@code m54000}. */
    private static final double MAX_INSET = 0.1;
    /** Epsilon of the ray/plane intersection. */
    private static final double EPSILON = 1.0E-6;
    /** Golden ratio used by the edge search. */
    private static final double GOLDEN = 0.618034;
    /** Iterations of the golden section search. */
    private static final int SEARCH_ITERATIONS = 8;
    /** Range tolerance of the precise sampler. */
    private static final double RANGE_TOLERANCE = 0.05;

    private AuraPoints() {
    }

    // ---------------------------------------------------------------------------------------------
    // Public API
    // ---------------------------------------------------------------------------------------------

    /** {@code rw.core.C1177#m80000} — the hitbox point closest to the player eye. */
    public static Vec3d nearestPoint(Entity entity) {
        return nearestPoint(entity.getBoundingBox().shrink(SHRINK));
    }

    /** {@code rw.core.C1177#m52000} */
    public static Vec3d nearestPoint(Box box) {
        Vec3d eye = mc.player.getEyePos();
        return new Vec3d(MathHelper.clamp(eye.x, box.minX, box.maxX),
                MathHelper.clamp(eye.y, box.minY, box.maxY),
                MathHelper.clamp(eye.z, box.minZ, box.maxZ));
    }

    /** {@code rw.core.C1177#m64000} — grid sampled aim point (mode "hw"). */
    public static Vec3d gridPoint(Entity entity, Rotation rotation, boolean checkWalls, double range) {
        return gridPoint(entity.getBoundingBox().shrink(SHRINK), entity, rotation, checkWalls, range);
    }

    /** {@code rw.core.C1177#m74000} — precise aim point (modes "ft", "grim", "noise", "spooky-time"). */
    public static Vec3d aimPoint(Entity entity, Rotation rotation, double range) {
        return precisePoint(entity.getBoundingBox().shrink(SHRINK), rotation, range);
    }

    /** {@code rw.core.C1177#m56000} — precise aim point of an arbitrary box (predicted hitboxes). */
    public static Vec3d aimPoint(Box box, Rotation rotation, double range) {
        return precisePoint(box.shrink(SHRINK), rotation, range);
    }

    /** {@code rw.core.C1177#m48000} — precise aim point built from the real player rotation. */
    public static Vec3d samplePoint(Entity entity, double range) {
        return precisePoint(entity.getBoundingBox().shrink(SHRINK), playerRotation(), range);
    }

    /** {@code rw.core.C1177#m30000} — grid aim point built from the real player rotation. */
    public static Vec3d precisePoint(Entity entity, double range) {
        return gridPoint(entity.getBoundingBox().shrink(SHRINK), entity, playerRotation(), false, range);
    }

    public static Rotation playerRotation() {
        return new Rotation(mc.player.getYaw(), mc.player.getPitch());
    }

    /** {@code rw.core.C1177#m32000} — squared rotation distance between a rotation and a point. */
    public static double rotationDistance(Rotation rotation, Vec3d point) {
        Rotation target = toRotation(point);
        float yaw = MathHelper.wrapDegrees(target.getYaw() - rotation.getYaw());
        float pitch = target.getPitch() - rotation.getPitch();
        return yaw * yaw + pitch * pitch;
    }

    /** {@code rw.core.C1177#m32000} — euclidean version used by the samplers. */
    public static double angleTo(Rotation rotation, Vec3d point) {
        Rotation target = toRotation(point);
        return Math.hypot(MathHelper.wrapDegrees(target.getYaw() - rotation.getYaw()),
                target.getPitch() - rotation.getPitch());
    }

    /** {@code rw.core.C0989#m30000} — rotation looking at a point. */
    public static Rotation toRotation(Vec3d point) {
        return RotationUtils.fromVec3d(point.subtract(mc.player.getEyePos()));
    }

    // ---------------------------------------------------------------------------------------------
    // Grid sampler — rw.core.C1177#m44000
    // ---------------------------------------------------------------------------------------------

    private static Vec3d gridPoint(Box box, Entity entity, Rotation rotation, boolean checkWalls, double range) {
        List<Vec3d> points = new ArrayList<>();

        double stepX = box.getLengthX() / GRID;
        double stepY = box.getLengthY() / GRID;
        double stepZ = box.getLengthZ() / GRID;

        Vec3d eye = mc.player.getEyePos();
        boolean inside = eye.x >= box.minX && eye.x < box.maxX && eye.z >= box.minZ && eye.z < box.maxZ;

        boolean maxX = !inside && eye.x <= box.maxX;
        boolean minX = !inside && eye.x >= box.minX;
        boolean maxZ = !inside && eye.z <= box.maxZ;
        boolean minZ = !inside && eye.z >= box.minZ;
        boolean maxY = !inside && eye.y <= box.maxY;
        boolean minY = !inside && eye.y >= box.minY;

        for (int i = 0; i <= GRID; i++) {
            double y = box.minY + i * stepY;

            addHittable(points, entity, new Vec3d(entity.getX(), y, entity.getZ()), range);

            for (int j = 0; j <= GRID; j++) {
                double x = box.minX + j * stepX;
                if (maxZ) addHittable(points, entity, new Vec3d(x, y, box.maxZ), range);
                if (minZ) addHittable(points, entity, new Vec3d(x, y, box.minZ), range);
            }

            for (int k = 0; k <= GRID; k++) {
                double z = box.minZ + k * stepZ;
                if (maxX) addHittable(points, entity, new Vec3d(box.maxX, y, z), range);
                if (minX) addHittable(points, entity, new Vec3d(box.minX, y, z), range);
            }
        }

        for (int k = 0; k <= GRID; k++) {
            double z = box.minZ + k * stepZ;
            for (int j = 0; j <= GRID; j++) {
                double x = box.minX + j * stepX;
                if (minY) addHittable(points, entity, new Vec3d(x, box.minY, z), range);
                if (maxY) addHittable(points, entity, new Vec3d(x, box.maxY, z), range);
            }
        }

        return bestPoint(points, rotation, eye, checkWalls);
    }

    /** {@code rw.core.C1177#m38000} — keeps the point only when the ray towards it reaches the entity. */
    private static void addHittable(List<Vec3d> points, Entity entity, Vec3d point, double range) {
        Vec3d eye = mc.player.getEyePos();
        Vec3d direction = RotationUtils.getRotationVector(
                toRotation(point).getPitch(), toRotation(point).getYaw()).multiply(range);
        if (!AuraRaycast.missesEntity(eye, eye.add(direction), entity)) {
            points.add(point);
        }
    }

    /** {@code rw.core.C1177#m72000} — closest (horizontally) then closest to the current rotation. */
    private static Vec3d bestPoint(List<Vec3d> points, Rotation rotation, Vec3d eye, boolean checkWalls) {
        return points.stream()
                .filter(point -> !checkWalls || AuraRaycast.noBlocksTo(point))
                .min((first, second) -> {
                    int distance = Double.compare(horizontalDistance(first, eye), horizontalDistance(second, eye));
                    if (distance != 0) {
                        return distance;
                    }
                    return Double.compare(angleTo(rotation, first), angleTo(rotation, second));
                })
                .orElse(eye);
    }

    private static double horizontalDistance(Vec3d point, Vec3d eye) {
        double dx = point.x - eye.x;
        double dz = point.z - eye.z;
        return dx * dx + dz * dz;
    }

    // ---------------------------------------------------------------------------------------------
    // Precise sampler — rw.core.C1177#m56000
    // ---------------------------------------------------------------------------------------------

    private static Vec3d precisePoint(Box box, Rotation rotation, double range) {
        Vec3d eye = mc.player.getEyePos();
        boolean inside = eye.x >= box.minX && eye.x < box.maxX && eye.z >= box.minZ && eye.z < box.maxZ;

        boolean maxX = !inside && eye.x <= box.maxX;
        boolean minX = !inside && eye.x >= box.minX;
        boolean maxY = !inside && eye.y <= box.maxY;
        boolean minY = !inside && eye.y >= box.minY;
        boolean maxZ = !inside && eye.z <= box.maxZ;
        boolean minZ = !inside && eye.z >= box.minZ;

        List<Vec3d> points = new ArrayList<>();
        if (maxX) addFacePoint(points, box, rotation, eye, Axis.X, box.maxX, range);
        if (minX) addFacePoint(points, box, rotation, eye, Axis.X, box.minX, range);
        if (maxY) addFacePoint(points, box, rotation, eye, Axis.Y, box.maxY, range);
        if (minY) addFacePoint(points, box, rotation, eye, Axis.Y, box.minY, range);
        if (maxZ) addFacePoint(points, box, rotation, eye, Axis.Z, box.maxZ, range);
        if (minZ) addFacePoint(points, box, rotation, eye, Axis.Z, box.minZ, range);

        double limit = (range - RANGE_TOLERANCE) * (range - RANGE_TOLERANCE);
        return points.stream()
                .min((first, second) -> {
                    int inRange = Integer.compare(first.squaredDistanceTo(eye) <= limit ? 0 : 1,
                            second.squaredDistanceTo(eye) <= limit ? 0 : 1);
                    if (inRange != 0) {
                        return inRange;
                    }
                    return Double.compare(angleTo(rotation, first), angleTo(rotation, second));
                })
                .orElseGet(() -> nearestPoint(box));
    }

    /** {@code rw.core.C1177#m60000} — the point of a face hit by the current rotation. */
    private static void addFacePoint(List<Vec3d> points, Box box, Rotation rotation, Vec3d eye,
                                     Axis axis, double plane, double range) {
        double[] first = axis.primaryBounds(box);
        double[] second = axis.secondaryBounds(box);
        Vec3d point = facePoint(rotation, eye, axis, plane, first, second);
        points.add(clampToRange(point, eye, axis, plane, first, second, range));
    }

    /** {@code rw.core.C1177#m70000} */
    private static Vec3d facePoint(Rotation rotation, Vec3d eye, Axis axis, double plane,
                                   double[] first, double[] second) {
        Vec3d direction = RotationUtils.getRotationVector(rotation.getPitch(), rotation.getYaw());
        double component = axis.component(direction);

        if (Math.abs(component) > EPSILON) {
            double distance = (plane - axis.component(eye)) / component;
            if (distance >= 0.0) {
                Vec3d hit = eye.add(direction.multiply(distance));
                if (axis.isInside(hit, first, second)) {
                    return hit;
                }
            }
        }

        return searchEdges(rotation, axis, plane, first, second);
    }

    /** {@code rw.core.C1177#m42000} — corner based search over the four edges of a face. */
    private static Vec3d searchEdges(Rotation rotation, Axis axis, double plane, double[] first, double[] second) {
        Vec3d cornerA = axis.point(plane, first[0], second[0]);
        Vec3d cornerB = axis.point(plane, first[1], second[0]);
        Vec3d cornerC = axis.point(plane, first[1], second[1]);
        Vec3d cornerD = axis.point(plane, first[0], second[1]);

        Vec3d best = cornerA;
        double bestDistance = Double.MAX_VALUE;

        Vec3d[][] edges = {{cornerA, cornerB}, {cornerB, cornerC}, {cornerC, cornerD}, {cornerD, cornerA}};
        for (Vec3d[] edge : edges) {
            Vec3d candidate = searchEdge(rotation, edge[0], edge[1]);
            double distance = angleTo(rotation, candidate);
            if (distance < bestDistance) {
                bestDistance = distance;
                best = candidate;
            }
        }

        return best;
    }

    /** {@code rw.core.C1177#m50000} — golden section search of the best point of a face edge. */
    private static Vec3d searchEdge(Rotation rotation, Vec3d from, Vec3d to) {
        Vec3d delta = to.subtract(from);
        double high = 1.0;
        double low = 0.0;
        double x1 = low + GOLDEN * (high - low);
        double x2 = high - GOLDEN * (high - low);
        double d1 = angleTo(rotation, from.add(delta.multiply(x1)));
        double d2 = angleTo(rotation, from.add(delta.multiply(x2)));

        for (int i = 0; i < SEARCH_ITERATIONS; i++) {
            if (d1 < d2) {
                high = x2;
                x2 = x1;
                d2 = d1;
                x1 = low + GOLDEN * (high - low);
                d1 = angleTo(rotation, from.add(delta.multiply(x1)));
            } else {
                low = x1;
                x1 = x2;
                d1 = d2;
                x2 = high - GOLDEN * (high - low);
                d2 = angleTo(rotation, from.add(delta.multiply(x2)));
            }
        }

        Vec3d point = from.add(delta.multiply((low + high) * 0.5));
        double distance = angleTo(rotation, point);

        if (angleTo(rotation, from) < distance) {
            point = from;
            distance = angleTo(rotation, from);
        }

        if (angleTo(rotation, to) < distance) {
            point = to;
        }

        return point;
    }

    /** {@code rw.core.C1177#m66000} — keeps the sampled point inside the attack range. */
    private static Vec3d clampToRange(Vec3d point, Vec3d eye, Axis axis, double plane,
                                      double[] first, double[] second, double range) {
        double limit = range - RANGE_TOLERANCE;
        double delta = plane - axis.component(eye);
        double pointFirst = axis.primary(point);
        double pointSecond = axis.secondary(point);

        Vec3d target = axis.point(plane, pointFirst, pointSecond);
        Vec3d clamped = axis.point(plane,
                MathHelper.clamp(pointFirst, first[0], first[1]),
                MathHelper.clamp(pointSecond, second[0], second[1]));

        double remaining = limit * limit - delta * delta;
        if (remaining <= 0.0) {
            return clamped;
        }

        if (point.squaredDistanceTo(eye) <= remaining) {
            return point;
        }

        if (clamped.squaredDistanceTo(target) > remaining) {
            return clamped;
        }

        return sphere(point, clamped, target, Math.sqrt(remaining));
    }

    /** {@code rw.core.C1177#m36000} — intersection of the [from, to] segment with a sphere. */
    private static Vec3d sphere(Vec3d from, Vec3d to, Vec3d center, double radius) {
        Vec3d delta = to.subtract(from);
        double length = delta.dotProduct(delta);
        if (length < EPSILON) {
            return from;
        }

        Vec3d offset = from.subtract(center);
        double projection = 2.0 * delta.dotProduct(offset);
        double constant = offset.dotProduct(offset) - radius * radius;
        double discriminant = projection * projection - 4.0 * length * constant;
        if (discriminant < 0.0) {
            return from;
        }

        double t = (-projection - Math.sqrt(discriminant)) / (2.0 * length);
        return from.add(delta.multiply(MathHelper.clamp(t, 0.0, 1.0)));
    }

    // ---------------------------------------------------------------------------------------------
    // Axis helper (the {@code var3} switch of rw.core.C1177)
    // ---------------------------------------------------------------------------------------------

    private enum Axis {
        X {
            @Override
            double component(Vec3d vec) {
                return vec.x;
            }

            @Override
            Vec3d point(double plane, double first, double second) {
                return new Vec3d(plane, first, second);
            }

            @Override
            double[] primaryBounds(Box box) {
                return inset(box.minY, box.maxY);
            }

            @Override
            double[] secondaryBounds(Box box) {
                return inset(box.minZ, box.maxZ);
            }

            @Override
            double primary(Vec3d point) {
                return point.y;
            }

            @Override
            double secondary(Vec3d point) {
                return point.z;
            }
        },
        Y {
            @Override
            double component(Vec3d vec) {
                return vec.y;
            }

            @Override
            Vec3d point(double plane, double first, double second) {
                return new Vec3d(first, plane, second);
            }

            @Override
            double[] primaryBounds(Box box) {
                return inset(box.minX, box.maxX);
            }

            @Override
            double[] secondaryBounds(Box box) {
                return inset(box.minZ, box.maxZ);
            }

            @Override
            double primary(Vec3d point) {
                return point.x;
            }

            @Override
            double secondary(Vec3d point) {
                return point.z;
            }
        },
        Z {
            @Override
            double component(Vec3d vec) {
                return vec.z;
            }

            @Override
            Vec3d point(double plane, double first, double second) {
                return new Vec3d(first, second, plane);
            }

            @Override
            double[] primaryBounds(Box box) {
                return inset(box.minX, box.maxX);
            }

            @Override
            double[] secondaryBounds(Box box) {
                return inset(box.minY, box.maxY);
            }

            @Override
            double primary(Vec3d point) {
                return point.x;
            }

            @Override
            double secondary(Vec3d point) {
                return point.y;
            }
        };

        abstract double component(Vec3d vec);

        abstract Vec3d point(double plane, double first, double second);

        abstract double[] primaryBounds(Box box);

        abstract double[] secondaryBounds(Box box);

        abstract double primary(Vec3d point);

        abstract double secondary(Vec3d point);

        boolean isInside(Vec3d point, double[] first, double[] second) {
            double a = primary(point);
            double b = secondary(point);
            return a >= first[0] && a <= first[1] && b >= second[0] && b <= second[1];
        }
    }

    private static double[] inset(double min, double max) {
        double inset = Math.min(MAX_INSET, (max - min) / 2.0);
        return new double[]{min + inset, max - inset};
    }
}

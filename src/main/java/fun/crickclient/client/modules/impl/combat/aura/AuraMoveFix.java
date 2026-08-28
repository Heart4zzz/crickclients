package fun.crickclient.client.modules.impl.combat.aura;

import net.minecraft.util.math.MathHelper;

import fun.crickclient.api.QClient;
import fun.crickclient.api.events.implement.EventKeyboardInput;
import fun.crickclient.api.events.implement.EventMoveInput;
import fun.crickclient.api.utils.rotate.Rotation;

/**
 * Movement correction of the ported AttackAura.
 * <p>
 * Ported from {@code rw.setting.C0784} / {@code rw.core.C0059} ("target-follow"),
 * {@code rw.core.C0066} ("strong" / "lite") and {@code rw.core.C1181#m52000}
 * (translation of a world direction into movement input).
 */
public final class AuraMoveFix implements QClient {

    private AuraMoveFix() {
    }

    /** {@code rw.core.C1181#m28000} — clears every movement flag. */
    public static void reset(EventMoveInput event) {
        event.setForward(0.0F);
        event.setStrafe(0.0F);
    }

    /** {@code rw.core.C1181#m52000} — moves towards {@code yaw} keeping the input strength. */
    public static void follow(EventMoveInput event, float yaw) {
        float forward = event.getForward();
        float strafe = event.getStrafe();
        if (forward == 0.0F && strafe == 0.0F) {
            return;
        }

        double angle = MathHelper.wrapDegrees(Math.toDegrees(direction(mc.player.getYaw(), forward, strafe)));

        float bestForward = 0.0F;
        float bestStrafe = 0.0F;
        double bestDifference = Float.MAX_VALUE;

        for (int predictedForward = -1; predictedForward <= 1; predictedForward++) {
            for (int predictedStrafe = -1; predictedStrafe <= 1; predictedStrafe++) {
                if (predictedForward == 0 && predictedStrafe == 0) {
                    continue;
                }

                double predictedAngle = MathHelper.wrapDegrees(Math.toDegrees(
                        direction(yaw, predictedForward, predictedStrafe)));
                double difference = Math.abs(angle - predictedAngle);

                if (difference < bestDifference) {
                    bestDifference = difference;
                    bestForward = predictedForward;
                    bestStrafe = predictedStrafe;
                }
            }
        }

        event.setForward(bestForward);
        event.setStrafe(bestStrafe);
    }

    /** {@code rw.core.C1181#m40000} — world direction of a yaw + input pair. */
    public static double direction(float yaw, float forward, float strafe) {
        if (forward < 0.0F) {
            yaw += 180.0F;
        }

        float scale = forward > 0.0F ? 0.5F : (forward < 0.0F ? -0.5F : 1.0F);
        if (strafe > 0.0F) {
            yaw -= 90.0F * scale;
        }
        if (strafe < 0.0F) {
            yaw += 90.0F * scale;
        }

        return Math.toRadians(yaw);
    }

    /** {@code rw.core.C0059#m12000} — "target-follow": always push towards the target. */
    public static void applyTargetFollow(EventMoveInput event, Rotation rotation) {
        if (rotation == null) {
            return;
        }

        if (event.getForward() == 0.0F && event.getStrafe() == 0.0F) {
            event.setForward(1.0F);
        }

        follow(event, rotation.getYaw());
    }

    /** {@code rw.core.C0066} — "strong": the input is corrected by the aura rotation. */
    public static void applyStrong(EventKeyboardInput event, Rotation rotation) {
        if (rotation == null) {
            return;
        }

        float forward = event.getMovementForward();
        float sideways = event.getMovementSideways();
        if (forward == 0.0F && sideways == 0.0F) {
            return;
        }

        double angle = MathHelper.wrapDegrees(Math.toDegrees(direction(mc.player.getYaw(), forward, sideways)));

        float bestForward = 0.0F;
        float bestSideways = 0.0F;
        double bestDifference = Float.MAX_VALUE;

        for (int predictedForward = -1; predictedForward <= 1; predictedForward++) {
            for (int predictedSideways = -1; predictedSideways <= 1; predictedSideways++) {
                if (predictedForward == 0 && predictedSideways == 0) {
                    continue;
                }

                double predictedAngle = MathHelper.wrapDegrees(Math.toDegrees(
                        direction(rotation.getYaw(), predictedForward, predictedSideways)));
                double difference = Math.abs(angle - predictedAngle);

                if (difference < bestDifference) {
                    bestDifference = difference;
                    bestForward = predictedForward;
                    bestSideways = predictedSideways;
                }
            }
        }

        event.setMovementForward(bestForward);
        event.setMovementSideways(bestSideways);
    }
}

package fun.crickclient.client.modules.impl.combat.components.rotations;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;
import fun.crickclient.api.QClient;
import fun.crickclient.api.storages.implement.RotationStorage;
import fun.crickclient.api.utils.rotate.Rotation;
import fun.crickclient.client.modules.impl.combat.Aura;
import fun.crickclient.client.modules.impl.combat.components.RotationsSystem;

import java.util.Random;

public class FunTimeRotation extends RotationsSystem implements QClient {

    private LivingEntity trackedTarget;

    private float currentYaw;
    private float currentPitch;

    private float velocityYaw;
    private float velocityPitch;

    private double aimPointX;
    private double aimPointY;
    private double aimPointZ;

    private float noiseWalkYaw = 0.0F;
    private float noiseWalkPitch = 0.0F;

    private int hitPhase;
    private int hitTimer;
    private float pitchBeforeHit;

    private long firstSeenTime;
    private int reactionMs;
    private boolean reactionComplete;

    private float lastSentYaw;
    private float lastSentPitch;

    private float smoothYaw;
    private float smoothPitch;

    private final Random rand = new Random();

    public void reset() {
        this.trackedTarget = null;
        this.velocityYaw = this.velocityPitch = 0.0F;
        this.aimPointX = this.aimPointY = this.aimPointZ = 0.0;
        this.noiseWalkYaw = this.noiseWalkPitch = 0.0F;
        this.hitPhase = this.hitTimer = 0;
        this.firstSeenTime = 0L;
        this.reactionComplete = false;
        this.reactionMs = 0;

        if (mc.player != null) {
            this.currentYaw = mc.player.getYaw();
            this.currentPitch = mc.player.getPitch();
            this.lastSentYaw = this.currentYaw;
            this.lastSentPitch = this.currentPitch;
            this.smoothYaw = this.currentYaw;
            this.smoothPitch = this.currentPitch;
        } else {
            this.currentYaw = this.currentPitch = 0.0F;
            this.lastSentYaw = this.lastSentPitch = 0.0F;
            this.smoothYaw = this.smoothPitch = 0.0F;
        }
    }

    private float calcGcd() {
        double s = mc.options.getMouseSensitivity().getValue() * 0.6 + 0.2;
        return (float) (s * s * s * 1.2);
    }

    private void pickAimPoint(LivingEntity e) {
        Box bb = e.getBoundingBox();
        double w = bb.maxX - bb.minX;
        double h = bb.maxY - bb.minY;
        double d = bb.maxZ - bb.minZ;

        this.aimPointX = MathHelper.clamp(rand.nextGaussian() * 0.15, -0.5, 0.5) * w * 0.4;
        this.aimPointY = MathHelper.clamp(rand.nextGaussian() * 0.15, -0.5, 0.5) * h * 0.4;
        this.aimPointZ = MathHelper.clamp(rand.nextGaussian() * 0.15, -0.5, 0.5) * d * 0.4;
    }

    public void onAttack() {
        this.hitPhase = 1;
        this.hitTimer = 0;
        this.pitchBeforeHit = this.currentPitch;
    }

    private float measureAngle(LivingEntity e) {
        if (mc.player == null) return 0.0F;

        Vec3d eyes = mc.player.getEyePos();
        Vec3d mid = e.getBoundingBox().getCenter();
        Vec3d delta = mid.subtract(eyes);

        float needYaw = (float) Math.toDegrees(Math.atan2(delta.z, delta.x)) - 90.0F;
        float needPitch = (float) (-Math.toDegrees(Math.atan2(delta.y, delta.horizontalLength())));

        float dYaw = Math.abs(MathHelper.wrapDegrees(needYaw - mc.player.getYaw()));
        float dPitch = Math.abs(needPitch - mc.player.getPitch());

        return dYaw + dPitch;
    }

    private int computeReaction(float angle) {
        int baseDelay = angle > 130.0F ? 140 : (angle > 70.0F ? 90 : (angle > 30.0F ? 45 : 12));
        int variance = angle > 130.0F ? 30 : (angle > 70.0F ? 20 : (angle > 30.0F ? 15 : 5));
        return Math.max(10, baseDelay + (int) (rand.nextGaussian() * variance));
    }

    private boolean isMovingForward() {
        return mc.player != null && mc.options.forwardKey.isPressed();
    }

    private boolean isOvertakingTarget(LivingEntity target) {
        if (mc.player != null && target != null) {
            Vec3d playerPos = mc.player.getPos();
            Vec3d targetPos = target.getPos();

            Vec3d playerVel = new Vec3d(
                    mc.player.getX() - mc.player.prevX,
                    mc.player.getY() - mc.player.prevY,
                    mc.player.getZ() - mc.player.prevZ
            );

            Vec3d targetVel = new Vec3d(
                    target.getX() - target.prevX,
                    target.getY() - target.prevY,
                    target.getZ() - target.prevZ
            );

            Vec3d toTarget = targetPos.subtract(playerPos).normalize();

            double playerSpeedToTarget = playerVel.dotProduct(toTarget);
            double targetSpeedToPlayer = targetVel.dotProduct(toTarget.multiply(-1.0));
            double relativeSpeed = playerSpeedToTarget + targetSpeedToPlayer;

            double distance = Math.sqrt(
                    Math.pow(playerPos.x - targetPos.x, 2.0) + Math.pow(playerPos.z - targetPos.z, 2.0)
            );

            return relativeSpeed > 0.05 && distance < 4.0;
        }

        return false;
    }

    private float[] generateNoise(float dist) {
        float scale = MathHelper.clamp(dist / 4.5F, 0.25F, 1.0F);

        noiseWalkYaw += (float) (rand.nextGaussian() * 0.4 * scale);
        noiseWalkPitch += (float) (rand.nextGaussian() * 0.3 * scale);

        noiseWalkYaw *= 0.85F;
        noiseWalkPitch *= 0.85F;

        return new float[]{noiseWalkYaw, noiseWalkPitch};
    }

    private float smoothStep(float x) {
        x = MathHelper.clamp(x, 0.0F, 1.0F);
        return x * x * (3.0F - 2.0F * x);
    }

    private float accelCurve(float x) {
        x = MathHelper.clamp(x, 0.0F, 1.0F);
        return 1.0F - (1.0F - x) * (1.0F - x);
    }

    private float springInterp(float current, float target, float vel, float stiffness, float damping, boolean allowOvershoot) {
        float diff = MathHelper.wrapDegrees(target - current);
        if (allowOvershoot && Math.abs(diff) > 45.0F) {
            stiffness *= 1.2F;
            damping *= 0.8F;
        }
        float acc = diff * stiffness - vel * damping;
        return vel + acc;
    }

    private float smoothLerp(float from, float to, float alpha) {
        alpha = MathHelper.clamp(alpha, 0.0F, 1.0F);
        float delta = MathHelper.wrapDegrees(to - from);
        return from + delta * alpha;
    }

    private float calculateCurrentAngle(float targetYaw, float targetPitch) {
        float dYaw = Math.abs(MathHelper.wrapDegrees(targetYaw - this.currentYaw));
        float dPitch = Math.abs(targetPitch - this.currentPitch);
        return dYaw + dPitch;
    }

    private void sendRotation(float yaw, float pitch) {
        Rotation rotation = new Rotation(yaw, pitch);
        RotationStorage.update(rotation, 360.0F, 45.0F, 45.0F, 45.0F, 0, 1, Aura.clientLook.isState());
        this.rotate = new Vec2f(rotation.getYaw(), rotation.getPitch());
    }

    @Override
    public void updateRotations(LivingEntity target) {
        if (mc.player == null || target == null) return;

        boolean playerFlying = mc.player.isGliding();

        if (this.trackedTarget != target) {
            this.trackedTarget = target;

            this.currentYaw = mc.player.getYaw();
            this.currentPitch = mc.player.getPitch();
            this.lastSentYaw = this.currentYaw;
            this.lastSentPitch = this.currentPitch;
            this.smoothYaw = this.currentYaw;
            this.smoothPitch = this.currentPitch;
            this.velocityYaw = this.velocityPitch = 0.0F;

            this.pickAimPoint(target);

            this.hitPhase = this.hitTimer = 0;

            float angleDiff = this.measureAngle(target);
            this.reactionMs = this.computeReaction(angleDiff);
            this.firstSeenTime = System.currentTimeMillis();
            this.reactionComplete = false;
        }

        Vec3d eyePos = mc.player.getEyePos();
        Vec3d targetCenter = this.getPredictedPoint(target, target.getBoundingBox().getCenter());
        float distance = (float) eyePos.distanceTo(targetCenter);
        float gcd = this.calcGcd();

        if (!this.reactionComplete) {
            long elapsed = System.currentTimeMillis() - this.firstSeenTime;

            if (elapsed < this.reactionMs) {
                float jitterY = (float) rand.nextGaussian() * 0.15F;
                float jitterP = (float) rand.nextGaussian() * 0.1F;

                float outY = this.lastSentYaw + jitterY;
                float outP = MathHelper.clamp(this.lastSentPitch + jitterP, -89.0F, 89.0F);

                outY -= (outY - this.lastSentYaw) % gcd;
                outP -= (outP - this.lastSentPitch) % gcd;

                this.lastSentYaw = outY;
                this.lastSentPitch = outP;

                this.sendRotation(outY, outP);
                return;
            }

            this.reactionComplete = true;
        }

        float[] noise = this.generateNoise(distance);

        if (this.hitPhase > 0) {
            this.hitTimer++;

            int upDuration = 25;
            int downDuration = 20;
            float targetPitchUp = -89.0F;

            if (this.hitPhase == 1) {
                float t = MathHelper.clamp((float) this.hitTimer / upDuration, 0.0F, 1.0F);
                this.currentPitch = MathHelper.lerp(this.accelCurve(t), this.pitchBeforeHit, targetPitchUp);

                if (this.hitTimer >= upDuration) {
                    this.hitPhase = 2;
                    this.hitTimer = 0;
                }
            } else if (this.hitPhase == 2) {
                float t = MathHelper.clamp((float) this.hitTimer / downDuration, 0.0F, 1.0F);
                this.currentPitch = MathHelper.lerp(this.smoothStep(t), targetPitchUp, this.pitchBeforeHit);

                if (this.hitTimer >= downDuration) {
                    this.hitPhase = 0;
                    this.hitTimer = 0;
                }
            }

            float outY = this.currentYaw + noise[0];
            float outP = MathHelper.clamp(this.currentPitch + noise[1], -89.0F, 89.0F);

            outY -= (outY - this.lastSentYaw) % gcd;
            outP -= (outP - this.lastSentPitch) % gcd;

            this.lastSentYaw = outY;
            this.lastSentPitch = outP;

            this.sendRotation(outY, outP);
            return;
        }

        if (rand.nextDouble() < 0.015) {
            this.pickAimPoint(target);
        }

        Vec3d targetVel = new Vec3d(
                target.getX() - target.prevX,
                target.getY() - target.prevY,
                target.getZ() - target.prevZ
        );

        int predictTicks = this.shouldUseElytraPredict(target) ? 0 : 2;
        Vec3d predictedCenter = targetCenter.add(targetVel.multiply(predictTicks));
        Vec3d aimPos = predictedCenter.add(this.aimPointX, this.aimPointY, this.aimPointZ);
        Vec3d direction = aimPos.subtract(eyePos);

        float wantYaw = (float) MathHelper.wrapDegrees(Math.toDegrees(Math.atan2(direction.z, direction.x)) - 90.0);
        float wantPitch = (float) (-Math.toDegrees(Math.atan2(direction.y, direction.horizontalLength())));

        float diffYaw = MathHelper.wrapDegrees(wantYaw - this.currentYaw);
        float diffPitch = wantPitch - this.currentPitch;
        float speedMultiplier = 1.0F;

        if (playerFlying) {
            float currentAngle = this.calculateCurrentAngle(wantYaw, wantPitch);

            if (currentAngle > 120.0F) {
                speedMultiplier = 0.18F;
            } else if (currentAngle > 80.0F) {
                speedMultiplier = MathHelper.lerp(this.smoothStep((currentAngle - 80.0F) / 40.0F), 0.35F, 0.18F);
            } else if (currentAngle > 25.0F) {
                speedMultiplier = MathHelper.lerp(this.smoothStep((currentAngle - 25.0F) / 55.0F), 0.65F, 0.35F);
            } else {
                speedMultiplier = 0.65F + 0.35F * (1.0F - currentAngle / 25.0F);
            }
        } else {
            if (this.isMovingForward() || this.isOvertakingTarget(target)) {
                speedMultiplier = 0.5F;
            }
        }

        float stiffness = (0.038F + (float) Math.abs(rand.nextGaussian()) * 0.007F) * speedMultiplier;
        float damping = 0.68F + 0.12F * (1.0F - speedMultiplier);
        float totalDiff = (float) Math.sqrt(diffYaw * diffYaw + diffPitch * diffPitch);

        if (totalDiff > 32.0F) {
            stiffness += 0.018F * speedMultiplier;
        } else if (totalDiff < 4.2F) {
            stiffness *= 0.48F;
        }

        stiffness += MathHelper.clamp((distance - 1.6F) / 7.5F, 0.0F, 0.045F) * speedMultiplier;

        this.velocityYaw = this.springInterp(this.currentYaw, this.currentYaw + diffYaw, this.velocityYaw, stiffness, damping, true);
        this.velocityPitch = this.springInterp(this.currentPitch, wantPitch, this.velocityPitch, stiffness * 0.87F, damping, false);

        float maxVelYaw = 7.5F * speedMultiplier;
        float maxVelPitch = 5.8F * speedMultiplier;

        this.velocityYaw = MathHelper.clamp(this.velocityYaw, -maxVelYaw, maxVelYaw);
        this.velocityPitch = MathHelper.clamp(this.velocityPitch, -maxVelPitch, maxVelPitch);

        this.currentYaw += this.velocityYaw;
        this.currentPitch = MathHelper.clamp(this.currentPitch + this.velocityPitch, -89.0F, 89.0F);

        float smoothFactor = playerFlying ? 0.3F + speedMultiplier * 0.4F : 0.85F;

        this.smoothYaw = this.smoothLerp(this.smoothYaw, this.currentYaw, smoothFactor);
        this.smoothPitch = this.smoothLerp(this.smoothPitch, this.currentPitch, smoothFactor * 0.95F);

        float outY = this.smoothYaw + noise[0];
        float outP = MathHelper.clamp(this.smoothPitch + noise[1], -89.0F, 89.0F);

        outY -= (outY - this.lastSentYaw) % gcd;
        outP -= (outP - this.lastSentPitch) % gcd;

        this.lastSentYaw = outY;
        this.lastSentPitch = outP;

        this.sendRotation(outY, outP);
    }
}

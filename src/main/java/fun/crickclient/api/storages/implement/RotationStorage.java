package fun.crickclient.api.storages.implement;

import fun.crickclient.api.QClient;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import net.minecraft.util.math.MathHelper;
import fun.crickclient.api.events.EventInvoker;
import fun.crickclient.api.events.EventLink;
import fun.crickclient.api.events.implement.EventKeyboardInput;
import fun.crickclient.api.events.implement.EventMoveInput;
import fun.crickclient.api.events.implement.EventUpdate;
import fun.crickclient.api.utils.rotate.Rotation;
import fun.crickclient.api.utils.rotate.RotationUtils;
import fun.crickclient.client.modules.impl.combat.components.gcd.GCDUtil;

@Getter
@Setter
@Accessors(fluent = true)
public class RotationStorage implements QClient {

    public static RotationStorage instance;

    public RotationStorage() {
        instance = this;
        EventInvoker.register(this);
    }

    private RotationTask currentTask = RotationTask.IDLE;
    private float currentYawSpeed;
    private float currentPitchSpeed;
    private float currentYawReturnSpeed;
    private float currentPitchReturnSpeed;
    private int currentPriority;
    private int currentTimeout;
    private int idleTicks;
    private int resetTicks;
    private Rotation targetRotation;

    public static double direction(float rotationYaw, final float moveForward, final float moveStrafing) {
        if (moveForward < 0F) rotationYaw += 180F;
        float forward = 1F;
        if (moveForward < 0F) forward = -0.5F;
        if (moveForward > 0F) forward = 0.5F;
        if (moveStrafing > 0F) rotationYaw -= 90F * forward;
        if (moveStrafing < 0F) rotationYaw += 90F * forward;
        return Math.toRadians(rotationYaw);
    }

    public static void fixMovement(final EventKeyboardInput event, final float yaw) {
        final float forward = event.getMovementForward();
        final float strafe = event.getMovementSideways();

        if (forward == 0 && strafe == 0) {
            return;
        }

        final double targetAngle = MathHelper.wrapDegrees(Math.toDegrees(direction(yaw, forward, strafe)));

        float bestForward = 0, bestStrafe = 0;
        float smallestDifference = Float.MAX_VALUE;

        for (float testForward = -1F; testForward <= 1F; testForward++) {
            for (float testStrafe = -1F; testStrafe <= 1F; testStrafe++) {
                if (testForward == 0 && testStrafe == 0) continue;

                final double testAngle = MathHelper.wrapDegrees(Math.toDegrees(direction(yaw, testForward, testStrafe)));
                final float difference = Math.abs(MathHelper.wrapDegrees((float)(targetAngle - testAngle)));

                if (difference < smallestDifference) {
                    smallestDifference = difference;
                    bestForward = testForward;
                    bestStrafe = testStrafe;
                }
            }
        }

        event.setMovementForward(bestForward);
        event.setMovementSideways(bestStrafe);
    }


    @EventLink
    public void onInput(final EventKeyboardInput event) {
        if (isRotating()) {
            fixMovement(event, MathHelper.wrapDegrees(mc.gameRenderer.getCamera().getYaw()));
        }
    }

    /**
     * Реальный (единственный вызываемый) ивент ввода — из KeyboardInputMixin.
     * Пока анти-эйм вращает игрока, камера смотрит вдоль free-yaw, а ванила
     * применяет ввод относительно yaw игрока. Без этой правки «вперёд по
     * экрану» летит туда, куда смотрит игрок (внутрь таргета), — отсюда
     * «иду вперёд, а ухожу назад» после использования ауры.
     * Пересчитываем ввод так, чтобы движение шло в сторону камеры.
     */
    @EventLink
    public void onMoveInput(final EventMoveInput event) {
        if (!isRotating() || mc.player == null || mc.world == null) return;

        final float forward = event.getForward();
        final float strafe = event.getStrafe();
        if (forward == 0 && strafe == 0) return;

        final float cameraYaw = MathHelper.wrapDegrees(FreeLookStorage.getFreeYaw());
        final float playerYaw = mc.player.getYaw();

        // Куда игрок реально смотрит (камера) → целевой мир-направление.
        final double targetAngle = MathHelper.wrapDegrees(Math.toDegrees(direction(cameraYaw, forward, strafe)));

        float bestForward = forward;
        float bestStrafe = strafe;
        float smallestDifference = Float.MAX_VALUE;

        for (float testForward = -1F; testForward <= 1F; testForward++) {
            for (float testStrafe = -1F; testStrafe <= 1F; testStrafe++) {
                if (testForward == 0 && testStrafe == 0) continue;

                final double testAngle = MathHelper.wrapDegrees(Math.toDegrees(direction(playerYaw, testForward, testStrafe)));
                final float difference = Math.abs(MathHelper.wrapDegrees((float) (targetAngle - testAngle)));

                if (difference < smallestDifference) {
                    smallestDifference = difference;
                    bestForward = testForward;
                    bestStrafe = testStrafe;
                }
            }
        }

        event.setForward(bestForward);
        event.setStrafe(bestStrafe);
    }

    /** @return true, если ротация вернулась к свободному взгляду. */
    private boolean resetRotation() {
        Rotation targetRotation = new Rotation(FreeLookStorage.getFreeYaw(), FreeLookStorage.getFreePitch());
        return updateRotation(targetRotation, currentYawReturnSpeed(), currentPitchReturnSpeed());
    }

    @EventLink
    public void onEventTick(EventUpdate event) {
        // Мир/игрок пропали (вылет, смерть, смена мира) — сбрасываем состояние,
        // иначе ротация и FreeLook висят навсегда и ломают управление.
        if (mc.player == null || mc.world == null) {
            if (isRotating()) {
                stopRotation();
            }
            resetTicks = 0;
            return;
        }

        if (currentTask().equals(RotationTask.AIM) && idleTicks() > currentTimeout()) {
            currentTask(RotationTask.RESET);
            resetTicks = 0;
        }

        if (currentTask().equals(RotationTask.RESET)) {
            if (resetRotation()) {
                stopRotation();
            } else if (++resetTicks > 80) {
                // Не сошлась за 4 секунды — не держим камеру и ввод намертво.
                stopRotation();
            }
        }
        idleTicks++;
    }

    public static void update(Rotation target, float yawSpeed, float pitchSpeed, float yawReturnSpeed, float pitchReturnSpeed, int timeout, int priority, boolean clientRotation) {
        final RotationStorage instance = RotationStorage.instance;
        if (mc.player == null) return;
        if (instance.currentPriority() > priority) {
            return;
        }

        if (instance.currentTask().equals(RotationTask.IDLE) && !clientRotation) {
            FreeLookStorage.setActive(true);
        }

        instance.currentYawSpeed(yawSpeed);
        instance.currentPitchSpeed(pitchSpeed);
        instance.currentYawReturnSpeed(yawReturnSpeed);
        instance.currentPitchReturnSpeed(pitchReturnSpeed);
        instance.currentTimeout(timeout);
        instance.currentPriority(priority);
        instance.currentTask(RotationTask.AIM);
        instance.targetRotation(target);

        instance.updateRotation(target, yawSpeed, pitchSpeed);
    }

    public static void update(Rotation targetRotation, float turnSpeed, float returnSpeed, int timeout, int priority) {
        update(targetRotation, turnSpeed, turnSpeed, returnSpeed, returnSpeed, timeout, priority, false);
    }

    public static void update(Rotation targetRotation, float yawSpeed, float pitchSpeed, float returnSpeed, int timeout, int priority) {
        update(targetRotation, yawSpeed, pitchSpeed, returnSpeed, returnSpeed, timeout, priority, false);
    }

    private boolean updateRotation(Rotation targetRotation, float yawSpeed, float pitchSpeed) {
        if (mc.player == null) return false;

        Rotation currentRotation = new Rotation(mc.player);
        float yawDelta = MathHelper.wrapDegrees(targetRotation.getYaw() - currentRotation.getYaw());
        float pitchDelta = targetRotation.getPitch() - currentRotation.getPitch();

        float clampedYaw = Math.min(Math.abs(yawDelta), yawSpeed);
        float clampedPitch = Math.min(Math.abs(pitchDelta), pitchSpeed);

        float yaw = mc.player.getYaw();
        yaw += GCDUtil.getFixedRotation(MathHelper.clamp(yawDelta, -clampedYaw, clampedYaw));
        mc.player.setYaw(yaw);
        mc.player.setPitch(MathHelper.clamp(mc.player.getPitch() + GCDUtil.getFixedRotation(MathHelper.clamp(pitchDelta, -clampedPitch, clampedPitch)), -90F, 90F));

        idleTicks(0);
        return new Rotation(mc.player).getDelta(targetRotation) < 1F;
    }

    public void stopRotation() {
        currentTask(RotationTask.IDLE);
        currentPriority(0);
        FreeLookStorage.setActive(false);
    }

    public boolean isRotating() {
        return !currentTask.equals(RotationTask.IDLE);
    }

    public enum RotationTask {
        AIM,
        RESET,
        IDLE
    }
}

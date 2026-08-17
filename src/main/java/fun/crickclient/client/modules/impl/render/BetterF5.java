package fun.crickclient.client.modules.impl.render;

import net.minecraft.util.math.MathHelper;
import fun.crickclient.api.events.EventLink;
import fun.crickclient.api.events.Priority;
import fun.crickclient.api.events.implement.EventRotation;
import fun.crickclient.api.events.implement.EventUpdate;
import fun.crickclient.api.storages.implement.FreeLookStorage;
import fun.crickclient.api.utils.animation.Easing;
import fun.crickclient.api.utils.animation.Easings;
import fun.crickclient.client.modules.Module;
import fun.crickclient.client.modules.settings.implement.BooleanSetting;
import fun.crickclient.client.modules.settings.implement.FloatSetting;
import fun.crickclient.client.modules.settings.implement.ModeSetting;

/**
 * Улучшенный F5 (третье лицо).
 * При переключении в третье лицо камера плавно и красиво отъезжает назад
 * с выбранной анимацией (easing), плавно следит за поворотом и реагирует
 * на присед / прыжок и скорость движения.
 */
public class BetterF5 extends Module {

    public static BetterF5 INSTANCE = new BetterF5();

    private static final float ROTATION_SMOOTH = 0.28F;
    private static final float HEIGHT_ANIM_SPEED = 0.13F;
    private static final float SNEAK_OFFSET = 0.5F;
    private static final float JUMP_MULTIPLIER = 2.0F;
    private static final float SPEED_ZOOM_MAX = 2.2F;
    private static final float SPEED_ZOOM_SCALE = 1.4F;
    private static final long BASE_ANIMATION_NANOS = 550_000_000L; // ~0.55s при скорости 1.0

    private final ModeSetting animationMode = new ModeSetting(
            "Animation", "Expo", "Expo", "Cubic", "Back", "Elastic", "Bounce", "Sine", "Linear"
    );
    private final FloatSetting distance = new FloatSetting("Distance", 4.2F, 1.0F, 15.0F, 0.1F);
    private final FloatSetting animationSpeed = new FloatSetting("Animation Speed", 1.0F, 0.2F, 4.0F, 0.05F);
    private final BooleanSetting smoothRotation = new BooleanSetting("Smooth Rotation", true);
    private final BooleanSetting dynamicHeight = new BooleanSetting("Dynamic Height", true);
    private final BooleanSetting speedZoom = new BooleanSetting("Speed Zoom", true);

    private float currentDistance;
    private float prevDistance;
    private float currentYaw;
    private float prevYaw;
    private float currentPitch;
    private float prevPitch;
    private float heightOffset;
    private float prevHeightOffset;

    private boolean wasThirdPerson;
    private boolean zooming;
    private long zoomStartNanos;
    private float zoomFrom;

    public BetterF5() {
        super("BetterF5", "Улучшенный F5 с плавной анимацией камеры", ModuleCategory.RENDER);
        addSettings(animationMode, distance, animationSpeed, smoothRotation, dynamicHeight, speedZoom);
    }

    @EventLink
    public void onUpdate(EventUpdate event) {
        if (mc.player == null || mc.world == null) return;

        boolean thirdPerson = !mc.options.getPerspective().isFirstPerson();

        if (thirdPerson && !wasThirdPerson) {
            beginZoom();
        }
        if (!thirdPerson && wasThirdPerson) {
            zooming = false;
        }

        wasThirdPerson = thirdPerson;
        if (thirdPerson) {
            updateCamera();
        }
    }

    @EventLink(priority = Priority.HIGH)
    public void onRotation(EventRotation event) {
        if (mc.player == null || mc.world == null) return;
        if (mc.options.getPerspective().isFirstPerson()) return;

        event.setYaw(getInterpolatedYaw(event.getPartialTicks()));
        event.setPitch(getInterpolatedPitch(event.getPartialTicks()));
    }

    private void beginZoom() {
        prevDistance = currentDistance;
        currentYaw = prevYaw = getReferenceYaw();
        currentPitch = prevPitch = getReferencePitch();
        // Каждый раз при входе в третье лицо камера стартует близко к игроку
        // и плавно отъезжает назад — красивая анимация отдаления.
        zoomFrom = Math.min(currentDistance, 0.5F);
        zoomStartNanos = System.nanoTime();
        zooming = true;
    }

    private void updateCamera() {
        if (mc.player == null) return;

        prevYaw = currentYaw;
        prevPitch = currentPitch;
        prevDistance = currentDistance;
        prevHeightOffset = heightOffset;

        // Поворот
        if (smoothRotation.isState()) {
            currentYaw += MathHelper.wrapDegrees(getReferenceYaw() - currentYaw) * ROTATION_SMOOTH;
            currentPitch = MathHelper.clamp(
                    currentPitch + (getReferencePitch() - currentPitch) * ROTATION_SMOOTH,
                    -90.0F,
                    90.0F
            );
        } else {
            currentYaw = getReferenceYaw();
            currentPitch = getReferencePitch();
        }

        // Дистанция
        float target = distance.get();
        if (speedZoom.isState()) {
            target += getSpeedZoomOffset();
        }

        long duration = (long) (BASE_ANIMATION_NANOS / Math.max(0.05F, animationSpeed.get()));

        if (zooming) {
            long elapsed = System.nanoTime() - zoomStartNanos;
            float progress = MathHelper.clamp((float) elapsed / (float) duration, 0.0F, 1.0F);
            float eased = (float) currentEasing().ease(progress);
            currentDistance = MathHelper.lerp(eased, zoomFrom, target);
            if (progress >= 1.0F) {
                zooming = false;
                currentDistance = target;
            }
        } else {
            currentDistance += (target - currentDistance) * 0.12F;
            if (Math.abs(target - currentDistance) < 0.005F) {
                currentDistance = target;
            }
        }

        // Вертикальное смещение (присед / прыжок)
        float targetOffset = 0.0F;
        if (dynamicHeight.isState()) {
            if (mc.player.isSneaking()) {
                targetOffset = -SNEAK_OFFSET;
            }
            if (!mc.player.isOnGround()) {
                targetOffset += (float) (-mc.player.getVelocity().y * JUMP_MULTIPLIER);
            }
        }
        heightOffset += (targetOffset - heightOffset) * HEIGHT_ANIM_SPEED;
    }

    private float getSpeedZoomOffset() {
        double horizontalSpeed = Math.hypot(mc.player.getVelocity().x, mc.player.getVelocity().z);
        return (float) Math.min(horizontalSpeed * SPEED_ZOOM_SCALE, SPEED_ZOOM_MAX);
    }

    private Easing currentEasing() {
        return switch (animationMode.getCurrent()) {
            case "Cubic" -> Easings.CUBIC_OUT;
            case "Back" -> Easings.BACK_OUT;
            case "Elastic" -> Easings.ELASTIC_OUT;
            case "Bounce" -> Easings.BOUNCE_OUT;
            case "Sine" -> Easings.SINE_OUT;
            case "Linear" -> Easings.LINEAR;
            default -> Easings.EXPO_OUT;
        };
    }

    public float getInterpolatedYaw(float partialTicks) {
        if (mc.player == null) return 0.0F;
        return prevYaw + (currentYaw - prevYaw) * partialTicks;
    }

    public float getInterpolatedPitch(float partialTicks) {
        if (mc.player == null) return 0.0F;
        return MathHelper.clamp(prevPitch + (currentPitch - prevPitch) * partialTicks, -90.0F, 90.0F);
    }

    public float getInterpolatedDistance(float partialTicks) {
        return prevDistance + (currentDistance - prevDistance) * partialTicks;
    }

    public float getInterpolatedHeightOffset(float partialTicks) {
        return prevHeightOffset + (heightOffset - prevHeightOffset) * partialTicks;
    }

    private float getReferenceYaw() {
        if (FreeLookStorage.isActive()) {
            return FreeLookStorage.getFreeYaw();
        }
        return mc.player != null ? mc.player.getYaw() : 0.0F;
    }

    private float getReferencePitch() {
        if (FreeLookStorage.isActive()) {
            return FreeLookStorage.getFreePitch();
        }
        return mc.player != null ? mc.player.getPitch() : 0.0F;
    }

    @Override
    public void onEnable() {
        super.onEnable();
        wasThirdPerson = false;
        zooming = false;

        if (mc.player != null && !mc.options.getPerspective().isFirstPerson()) {
            currentYaw = prevYaw = getReferenceYaw();
            currentPitch = prevPitch = getReferencePitch();
            currentDistance = prevDistance = distance.get();
            heightOffset = prevHeightOffset = 0.0F;
            wasThirdPerson = true;
        }
    }

    @Override
    public void onDisable() {
        super.onDisable();
        wasThirdPerson = false;
        zooming = false;
    }
}

package fun.crickclient.api.storages.implement.helpertstorages;

import java.io.Serializable;

/**
 * One recorded rotation sample used by the AI aura.
 *
 * <p>The accessors are explicit instead of relying on Lombok-generated
 * methods. Besides making the serialized model self-contained, this prevents
 * IDEs without Lombok annotation processing from reporting missing getters.</p>
 */
public class NeuroPattern implements Serializable {
    private static final long serialVersionUID = 1L;

    private final float yaw;
    private final float pitch;
    private final float deltaYaw;
    private final float deltaPitch;
    private final double distance;
    private final long timestamp;
    private final boolean isCritical;
    private final double targetSpeed;
    private final String targetType;
    private final float smoothness;

    public NeuroPattern(float yaw, float pitch, float deltaYaw, float deltaPitch, double distance,
                        boolean critical, double targetSpeed, String targetType, float smoothness) {
        this.yaw = yaw;
        this.pitch = pitch;
        this.deltaYaw = deltaYaw;
        this.deltaPitch = deltaPitch;
        this.distance = distance;
        this.timestamp = System.currentTimeMillis();
        this.isCritical = critical;
        this.targetSpeed = targetSpeed;
        this.targetType = targetType;
        this.smoothness = smoothness;
    }

    public float getYaw() {
        return yaw;
    }

    public float getPitch() {
        return pitch;
    }

    public float getDeltaYaw() {
        return deltaYaw;
    }

    public float getDeltaPitch() {
        return deltaPitch;
    }

    public double getDistance() {
        return distance;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public boolean isCritical() {
        return isCritical;
    }

    public double getTargetSpeed() {
        return targetSpeed;
    }

    public String getTargetType() {
        return targetType;
    }

    public float getSmoothness() {
        return smoothness;
    }
}

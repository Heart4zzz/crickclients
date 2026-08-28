package fun.crickclient.client.modules.impl.combat.aura;

import java.util.concurrent.ThreadLocalRandom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;

import fun.crickclient.api.utils.rotate.Rotation;
import fun.crickclient.api.utils.rotate.RotationUtils;

/**
 * "ai" rotation — the neuro aura of this client.
 * <p>
 * This mode is <b>not</b> taken from the ported client: it is the AI rotation of crickclient that
 * replays the recorded aiming patterns (see {@code NeuroAuraStorage}) and adds the
 * {@code ai-jitter} / {@code human-misses} behaviour on top of them.
 */
public final class AiMode extends AuraMode {

    /** Chance of a simulated human miss per tick. */
    private static final float MISS_CHANCE = 0.30F;
    /** Strength of a simulated human miss (relative to the jitter). */
    private static final float MISS_SCALE = 1.5F;

    public AiMode(Aura aura) {
        super(aura);
    }

    @Override
    public String name() {
        return "ai";
    }

    @Override
    public Vec3d aimPoint(LivingEntity target, double range) {
        return aura.getStableBodyPoint(target);
    }

    @Override
    public Rotation rotation(LivingEntity target, boolean attack, double range) {
        float currentYaw = mc.player.getYaw();
        float currentPitch = mc.player.getPitch();

        float jitter = aura.aiJitter.getValue().floatValue();
        boolean humanMisses = aura.aiHumanMisses.isState();

        Rotation base = null;
        if (aura.getDataSystem().isUsingNeuro() && aura.getDataSystem().hasFrames()) {
            base = aura.getDataSystem().getNeuroRotation(target, currentYaw, currentPitch,
                    aura.shouldFocusDataRotation());
        }

        if (base == null) {
            Vec2f fallback = RotationUtils.getRotations(aimPoint(target, range));
            base = new Rotation(fallback.x, fallback.y);
        }

        ThreadLocalRandom random = ThreadLocalRandom.current();
        float jitterYaw = jitter * (random.nextFloat() - 0.5F);
        float jitterPitch = jitter * (random.nextFloat() - 0.5F);

        float missYaw = 0.0F;
        float missPitch = 0.0F;
        if (humanMisses && random.nextFloat() < MISS_CHANCE) {
            missYaw = (random.nextFloat() - 0.5F) * jitter * MISS_SCALE;
            missPitch = (random.nextFloat() - 0.5F) * jitter * MISS_SCALE;
        }

        float yaw = MathHelper.wrapDegrees(base.getYaw() + jitterYaw + missYaw);
        float pitch = MathHelper.clamp(base.getPitch() + jitterPitch + missPitch, -90.0F, 90.0F);

        return new Rotation(yaw, pitch);
    }
}

package fun.crickclient.client.modules.impl.combat.aura;

import java.util.ArrayDeque;
import java.util.Deque;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Vec3d;

import fun.crickclient.api.QClient;

/**
 * Per tick snapshot history of the player (used by the critical hit timing).
 * <p>
 * Ported from {@code rw.core.OljOitkn} / {@code rw.data.Rec0288}.
 */
public final class AuraHistory implements QClient {

    /** How many ticks are kept. */
    private static final int SIZE = 32;

    private static final Deque<Snapshot> HISTORY = new ArrayDeque<>(SIZE);

    private static int ticksSinceJump = 0;

    private AuraHistory() {
    }

    /** {@code rw.data.Rec0288} — the player state of a single tick. */
    public record Snapshot(boolean sneaking, boolean sprinting, boolean jumping, boolean water, boolean ground,
                           double fallDistance, int jumpingCooldown, Vec3d position, Vec3d velocity,
                           float yaw, float pitch, LivingEntity target) {
    }

    /** {@code rw.core.OljOitkn#m22000} — stores the current tick. */
    public static void update(LivingEntity target) {
        boolean jumping = !mc.player.isOnGround() && mc.player.getVelocity().y > 0.0;
        ticksSinceJump = jumping ? 0 : ticksSinceJump + 1;

        HISTORY.addFirst(new Snapshot(
                mc.player.isSneaking(),
                mc.player.isSprinting(),
                jumping,
                mc.player.isTouchingWater() || mc.player.isSubmergedInWater(),
                mc.player.isOnGround(),
                mc.player.fallDistance,
                ticksSinceJump,
                mc.player.getPos(),
                mc.player.getVelocity(),
                mc.player.getYaw(),
                mc.player.getPitch(),
                target
        ));

        while (HISTORY.size() > SIZE) {
            HISTORY.removeLast();
        }
    }

    /** {@code rw.core.OljOitkn#m28000} — the snapshot {@code ticksAgo} ticks back (null when missing). */
    public static Snapshot get(int ticksAgo) {
        int index = 0;
        for (Snapshot snapshot : HISTORY) {
            if (index++ == ticksAgo) {
                return snapshot;
            }
        }
        return null;
    }

    /** Snapshot of one tick ago. */
    public static Snapshot previous() {
        return get(1);
    }

    /** {@code rw.core.Base0764#m22000} — true when the fall is long enough to crit. */
    public static boolean canCrit(Snapshot snapshot) {
        if (snapshot == null || mc.player.fallDistance <= 1.0) {
            return false;
        }
        return snapshot.ground() && mc.player.fallDistance > 1.5 || snapshot.jumping();
    }

    public static void reset() {
        HISTORY.clear();
        ticksSinceJump = 0;
    }
}

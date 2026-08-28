package fun.crickclient.client.modules.impl.combat.aura;

import net.minecraft.component.DataComponentTypes;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

import fun.crickclient.api.QClient;
import fun.crickclient.api.storages.implement.RotationStorage;
import fun.crickclient.api.utils.rotate.Rotation;
import fun.crickclient.api.utils.rotate.RotationUtils;
import fun.crickclient.client.modules.impl.combat.aura.AuraHistory.Snapshot;

/**
 * Base class of every AttackAura rotation ("mode").
 * <p>
 * Ported from {@code rw.core.Base0764}: it owns the whole attack pipeline (target reach check,
 * critical hit timing, shield break, mace handling, weapon swap, packet delay) while the concrete
 * modes only provide the aim point and the rotation itself
 * ({@code rw.core.Base0764#m30000} / {@code m46000}).
 */
public abstract class AuraMode implements QClient {

    /** {@code rw.core.Base0764#m32000} — swing cooldown length used by every mode. */
    public static final int COOLDOWN_TICKS = 10;
    /** {@code f16000[5]} — ticks the shield break item is kept. */
    private static final int SHIELD_TICKS = 5;
    /** {@code f16000[4]} — ticks the mace is kept after a mace hit. */
    private static final int MACE_TICKS = 20;
    /** {@code f16000[6]} — maximum amount of ticks the aura waits for a critical hit. */
    private static final int CRIT_WAIT = 10;
    /** {@code f11000} — critical hit thresholds of the attack gate. */
    private static final double MIN_FALL = 1.0;
    private static final double STRONG_FALL = 1.3;
    private static final double LONG_FALL = 1.5;
    /** {@code f34000} — velocity prediction factor of the historical hit check. */
    private static final double PREDICTION = 2.0;

    protected final Aura aura;

    /** {@code f16000[2]} — a critical hit is pending for the next swing. */
    private boolean critPending;
    /** {@code f16000[3]} — the shield of the target has to be broken with an axe. */
    private boolean shieldPending;
    /** {@code f16000[4]} — cooldown of the mace handling. */
    private int maceTicks;
    /** {@code f16000[5]} — cooldown of the shield break. */
    private int shieldTicks;
    /** {@code f16000[6]} — ticks spent waiting for a critical hit. */
    private int critTicks;

    protected AuraMode(Aura aura) {
        this.aura = aura;
    }

    /** Setting name of the mode ("ft", "grim", "spooky-time", "noise", "hw", "ai"). */
    public abstract String name();

    /** {@code rw.core.Base0764#m30000} — the point of the target the mode aims at. */
    public abstract Vec3d aimPoint(LivingEntity target, double range);

    /** {@code rw.core.Base0764#m46000} — the rotation produced for this tick. */
    public abstract Rotation rotation(LivingEntity target, boolean attack, double range);

    public void reset() {
        critPending = false;
        shieldPending = false;
        maceTicks = 0;
        shieldTicks = 0;
        critTicks = 0;
    }

    // ---------------------------------------------------------------------------------------------
    // Tick pipeline — rw.core.Base0764#m44000
    // ---------------------------------------------------------------------------------------------

    public void update(LivingEntity target) {
        if (maceTicks > 0) {
            maceTicks--;
        }
        if (shieldTicks > 0) {
            shieldTicks--;
        }

        critPending = shouldCritNow();
        if (critPending && shieldTicks <= 0 && aura.isBlockingWithShield(target)) {
            shieldPending = true;
        }

        Rotation rotation;
        if (canAttack(target)) {
            rotation = rotation(target, true, aura.aimRange());
            if (!shouldSkipAttack(target, rotation)) {
                attack(target);
            }
        } else {
            rotation = rotation(target, false, aura.attackRange());
        }

        if (rotation != null) {
            RotationStorage.update(rotation, 360.0F, 360.0F, 360.0F, 360.0F, 1, 1, aura.clientLook.isState());
            aura.setRotation(rotation);
        }
    }

    // ---------------------------------------------------------------------------------------------
    // Attack gate — rw.core.Base0764#m4000
    // ---------------------------------------------------------------------------------------------

    protected boolean canAttack(LivingEntity target) {
        if (aura.isAttackPaused()) {
            return false;
        }

        if (shieldPending && aura.isBlockingWithShield(target)) {
            return true;
        }

        if (AuraCrits.before(COOLDOWN_TICKS)) {
            return false;
        }

        if (mc.player.getItemCooldownManager().isCoolingDown(mc.player.getMainHandStack())) {
            return false;
        }

        double range = aura.attackRange();
        Vec3d point = aimPoint(target, range);
        if (!inRange(target, point, range)) {
            return false;
        }

        if (!mc.player.isOnGround()
                && AuraCrits.attackTicks() >= COOLDOWN_TICKS - 4
                && AuraCrits.cooldownReady(0.5F)
                && (!shouldCrit() || aura.fallDistance(2) > 0.0)) {
            if (aura.swapDamage()) {
                AuraWeapon.select();
            }
        }

        int gate = !AuraCrits.canCrit()
                && (aura.autoMace() || !mc.player.hasStatusEffect(StatusEffects.SLOW_FALLING)) ? 0 : 1;

        if (shouldCrit() && gate != 0 && !critPending) {
            if (shouldSprintReset()) {
                aura.setSprintTicks(1);
            }
            if (mc.player.isSprinting()) {
                return false;
            }
        }

        int falling = critPending && mc.player.fallDistance > STRONG_FALL && maceTicks <= 0 ? 1 : 0;
        if (falling == 0 && !AuraCrits.cooldownReady(0.5F)) {
            return false;
        }

        if (waitForCrit(target, point, range)) {
            return false;
        }

        // While the player is still rising the swing is held back so the hit lands while falling.
        if (shouldCrit() && mc.player.fallDistance == 0.0 && gate != 0) {
            return false;
        }

        if (!mc.player.isOnGround() && aura.swapDamage()) {
            AuraWeapon.select();
        }

        return aura.isAttackReady();
    }

    /** {@code rw.core.Base0764#m40000} — the target has to be reachable from the current eye position. */
    protected boolean inRange(LivingEntity target, Vec3d point, double range) {
        Vec3d eye = mc.player.getEyePos();
        Vec3d direction = RotationUtils.getRotationVector(
                AuraPoints.toRotation(point).getPitch(), AuraPoints.toRotation(point).getYaw()).multiply(range);
        Vec3d end = eye.add(direction);
        return !AuraRaycast.missesEntity(eye, end, target);
    }

    /** {@code rw.core.Base0764#m26000} — waits (up to {@value #CRIT_WAIT} ticks) for the crit window. */
    protected boolean waitForCrit(LivingEntity target, Vec3d point, double range) {
        if (!shouldCrit() || !critPending) {
            critTicks = 0;
            return false;
        }

        Snapshot snapshot = AuraHistory.get(1);
        if (AuraHistory.canCrit(snapshot)) {
            critTicks = 0;
            return false;
        }

        if (!canHitHistorical(snapshot, target, point, range)) {
            critTicks = 0;
            return false;
        }

        critTicks++;
        if (critTicks >= CRIT_WAIT) {
            critTicks = 0;
            return false;
        }

        return true;
    }

    /** {@code rw.core.Base0764#m34000} — hit check against the predicted (historical) target box. */
    protected boolean canHitHistorical(Snapshot snapshot, LivingEntity target, Vec3d point, double range) {
        if (snapshot == null) {
            return false;
        }

        double dx = (target.getX() - target.prevX) * PREDICTION;
        double dy = (target.getY() - target.prevY) * PREDICTION;
        double dz = (target.getZ() - target.prevZ) * PREDICTION;

        double height = target.getY() - mc.player.getY();
        if (height > 0.0 && height <= LONG_FALL && dy < 0.0) {
            return false;
        }

        if (mc.player.getMainHandStack().isOf(Items.MACE) && snapshot.jumpingCooldown() < 1) {
            return true;
        }

        if (snapshot.jumpingCooldown() < 1) {
            return false;
        }

        if (mc.player.isSprinting() && AuraHistory.canCrit(AuraHistory.get(2))) {
            aura.setSprintTicks(1);
            aura.setMoveTicks(1);
        }

        Vec3d from = snapshot.position().add(0.0, mc.player.getEyeHeight(mc.player.getPose()), 0.0);
        Vec3d to = point.add(dx, dy, dz);

        if (!aura.throughWallsEnabled() && !AuraRaycast.noBlocksBetween(from, to)) {
            return false;
        }

        return AuraRaycast.boxRaycast(from, to, target)
                .map(hit -> hit.distanceTo(from) < range)
                .orElse(false);
    }

    /** {@code rw.core.Base0764#m38000} — sprint has to be dropped to land the critical hit. */
    protected boolean shouldSprintReset() {
        Snapshot snapshot = AuraHistory.get(1);
        return aura.sprintReset()
                && mc.player.isSprinting()
                && AuraCrits.attackTicks() >= COOLDOWN_TICKS - 1
                && snapshot != null && snapshot.jumpingCooldown() > 0
                && !AuraCrits.cooldownReady(0.5F);
    }

    /** {@code rw.core.Base0764#m48000} — true when the swing has to be skipped. */
    protected boolean shouldSkipAttack(LivingEntity target, Rotation rotation) {
        Vec3d eye = mc.player.getEyePos();
        Vec3d end = eye.add(RotationUtils.getRotationVector(rotation.getPitch(), rotation.getYaw())
                .multiply(aura.attackRange()));

        Vec3d hit = AuraRaycast.boxRaycast(eye, end, target).orElse(null);
        if (hit == null) {
            return true;
        }

        if (mc.player.getMainHandStack().contains(DataComponentTypes.CHARGED_PROJECTILES)) {
            return false;
        }

        return hit.squaredDistanceTo(eye) > aura.attackRange() * aura.attackRange();
    }

    // ---------------------------------------------------------------------------------------------
    // Attack — rw.core.Base0764#m16000
    // ---------------------------------------------------------------------------------------------

    protected void attack(LivingEntity target) {
        if (shieldPending) {
            shieldPending = false;
            if (aura.isBlockingWithShield(target)) {
                aura.breakShield(target);
                shieldTicks = SHIELD_TICKS;
                return;
            }
        }

        if (mc.player.isBlocking()) {
            mc.interactionManager.stopUsingItem(mc.player);
        }

        aura.flushPackets(10);

        if (mc.player.getMainHandStack().contains(DataComponentTypes.CHARGED_PROJECTILES)) {
            if (mc.interactionManager.isBreakingBlock()) {
                return;
            }
            mc.interactionManager.stopUsingItem(mc.player);
            mc.player.swingHand(Hand.MAIN_HAND);
            aura.applyMoveFix();
            aura.notifyAttack(target);
        } else {
            mc.interactionManager.attackEntity(mc.player, target);
            mc.player.swingHand(Hand.MAIN_HAND);
            aura.notifyAttack(target);
        }

        if (aura.shieldBreak() && shieldTicks <= 0 && aura.isBlockingWithShield(target)) {
            shieldPending = true;
        }

        if (mc.player.getMainHandStack().isOf(Items.MACE)) {
            maceTicks = MACE_TICKS;
        }
    }

    // ---------------------------------------------------------------------------------------------
    // Critical hits — rw.core.Base0764#m14000 / m24000
    // ---------------------------------------------------------------------------------------------

    /** {@code rw.core.Base0764#m14000} — a critical hit is expected for the next swing. */
    public boolean shouldCritNow() {
        if (mc.player.getMainHandStack().isOf(Items.MACE)) {
            return true;
        }
        if (mc.player.fallDistance < MIN_FALL) {
            return false;
        }
        return aura.autoMace() && aura.hasMace();
    }

    /** {@code rw.core.Base0764#m24000} — the mode wants a critical hit at all. */
    public boolean shouldCrit() {
        if (mc.player.getMainHandStack().contains(DataComponentTypes.CHARGED_PROJECTILES)) {
            return false;
        }
        if (aura.isCritDisabled()) {
            return false;
        }
        if (!aura.isCritOnlySpace()) {
            return true;
        }
        return !(!mc.options.jumpKey.isPressed() && mc.player.isOnGround());
    }

    /** {@code rw.core.Base0764#m20000} — true while the shield break axe is still equipped. */
    public boolean isShieldPending() {
        return shieldPending;
    }

    /** {@code f16000[6]} — ticks spent waiting for the critical window. */
    public int getCritTicks() {
        return critTicks;
    }

    // ---------------------------------------------------------------------------------------------
    // Helpers shared by the modes
    // ---------------------------------------------------------------------------------------------

    /** Rotation of the player (the base every mode works from). */
    protected Rotation playerRotation() {
        return AuraPoints.playerRotation();
    }

    /** {@code rw.core.C0989#m4000} — the rotation the client is currently looking at. */
    protected Rotation currentRotation() {
        RotationStorage storage = RotationStorage.instance;
        if (storage != null && storage.targetRotation() != null) {
            return new Rotation(storage.targetRotation().getYaw(), storage.targetRotation().getPitch());
        }
        return playerRotation();
    }

    /** {@code rw.core.C0989#m26000} — rotation delta between the player rotation and a point. */
    protected Rotation delta(Vec3d point) {
        Rotation player = playerRotation();
        Rotation target = AuraPoints.toRotation(point);
        return new Rotation(MathHelper.wrapDegrees(target.getYaw() - player.getYaw()),
                target.getPitch() - player.getPitch());
    }

    /** {@code rw.core.C0983#m64000} — offsets a rotation by a delta. */
    protected Rotation offset(Rotation base, float yaw, float pitch) {
        return new Rotation(base.getYaw() + yaw, MathHelper.clamp(base.getPitch() + pitch, -90.0F, 90.0F));
    }
}

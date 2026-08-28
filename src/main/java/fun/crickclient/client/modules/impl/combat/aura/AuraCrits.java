package fun.crickclient.client.modules.impl.combat.aura;

import net.minecraft.block.Blocks;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;

import fun.crickclient.CrickClient;
import fun.crickclient.api.QClient;
import fun.crickclient.mixin.ILivingEntity;

/**
 * Critical hit / attack cooldown helpers of the ported AttackAura.
 * <p>
 * Ported from {@code rw.core.C0887}.
 */
public final class AuraCrits implements QClient {

    /** {@code rw.core.Base0764#m32000} — attack cooldown length used by the modes. */
    public static final int COOLDOWN_TICKS = 10;
    /** {@code f11000[5]} — the aura only attacks once the cooldown reached 90%. */
    private static final float COOLDOWN_THRESHOLD = 0.9F;

    private AuraCrits() {
    }

    /** {@code rw.core.C0887#m36000} — ticks elapsed since the last attack. */
    public static int attackTicks() {
        return ((ILivingEntity) mc.player).getLastAttackedTicks();
    }

    /** {@code rw.core.C0887#m32000} — true while fewer than {@code ticks} passed since the attack. */
    public static boolean before(int ticks) {
        return attackTicks() < ticks;
    }

    /** {@code rw.core.C0887#m30000} — attack cooldown progress (0..1), TPS aware. */
    public static float cooldownProgress(float add) {
        float tps = 20.0F;
        if (CrickClient.INSTANCE != null && CrickClient.INSTANCE.tpsCalc != null) {
            tps = MathHelper.clamp(CrickClient.INSTANCE.tpsCalc.getTPS(), 0.1F, 20.0F);
        }

        float cooldown = (float) (1.0 / mc.player.getAttributeValue(EntityAttributes.ATTACK_SPEED) * 20.0);
        float ticks = attackTicks() + add;
        float scaled = cooldown * (20.0F / tps);
        return MathHelper.clamp(ticks / scaled, 0.0F, 1.0F);
    }

    /** {@code rw.core.C0887#m30000} — true when the swing cooldown is (almost) over. */
    public static boolean cooldownReady(float add) {
        return cooldownProgress(add) > COOLDOWN_THRESHOLD;
    }

    /** {@code rw.core.C0887#m2000} */
    public static boolean cooldownReady() {
        return cooldownReady(0.5F);
    }

    /**
     * {@code rw.core.C0887#m24000} — true when the player is physically able to land a critical hit.
     */
    public static boolean canCrit() {
        if (mc.player.hasStatusEffect(StatusEffects.LEVITATION)
                || mc.player.hasStatusEffect(StatusEffects.SLOW_FALLING)
                || isMovementBlocked()
                || mc.player.isClimbing()
                || isGlidingWithElytra()
                || mc.player.isSwimming()) {
            return false;
        }

        Box ground = mc.player.getBoundingBox().offset(0.0, 0.09, 0.0).expand(0.0, 0.1, 0.0);
        if (mc.player.isOnGround() && !mc.world.isSpaceEmpty(mc.player, ground)) {
            return false;
        }

        if (mc.player.isOnGround() && mc.player.isSwimming()) {
            return false;
        }

        if (mc.player.getAbilities().flying) {
            return false;
        }

        double offset = mc.player.isSprinting() ? 0.0 : 0.6;
        Box space = mc.player.getBoundingBox().offset(0.0, offset, 0.0).expand(0.0, offset, 0.0);
        return mc.world.isSpaceEmpty(mc.player, space);
    }

    /** {@code rw.core.C1187#m36000} — true while the player flies with an elytra. */
    public static boolean isGlidingWithElytra() {
        if (!mc.player.isGliding()) {
            return false;
        }
        return mc.player.getEquippedStack(net.minecraft.entity.EquipmentSlot.CHEST).isOf(net.minecraft.item.Items.ELYTRA);
    }

    /** {@code rw.core.C0887} — {@code field_17046 == Vec3d.ZERO} (no web / berry bush / powder snow). */
    public static boolean isMovementBlocked() {
        BlockPos pos = BlockPos.ofFloored(mc.player.getPos());
        return mc.world.getBlockState(pos).isOf(Blocks.COBWEB)
                || mc.world.getBlockState(pos).isOf(Blocks.SWEET_BERRY_BUSH)
                || mc.world.getBlockState(pos).isOf(Blocks.POWDER_SNOW);
    }

    /** {@code rw.core.C0887#m26000} — first player tick. */
    public static boolean isFirstTick() {
        return mc.player.age == 0;
    }
}

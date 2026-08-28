package fun.crickclient.client.modules.impl.combat.aura;

import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MaceItem;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.TridentItem;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;

import fun.crickclient.api.QClient;

/**
 * Best weapon selection of the ported AttackAura ("swap-damage").
 * <p>
 * Ported from {@code rw.core.IltOkpplt} (selection) and {@code rw.core.C0892} (silent swap).
 */
public final class AuraWeapon implements QClient {

    /** {@code f12000[5]} — ticks the swapped slot is kept. */
    private static final int TIMEOUT = 5;
    /** {@code f1000} — ticks the swap stays active (1 normally, 2 when the inventory is open). */
    private static final int ACTIVE_TICKS = 1;

    private static int slot = -1;
    private static ItemStack selected = ItemStack.EMPTY;
    private static int ticks = 0;
    private static int activeTicks = 0;
    private static int restoreTicks = TIMEOUT;
    private static int previousSlot = -1;

    private AuraWeapon() {
    }

    /** {@code rw.core.IltOkpplt#m62000} — picks the strongest weapon of the hotbar and swaps to it. */
    public static void select() {
        if (isSwapped()) {
            restoreTicks = TIMEOUT;
            return;
        }

        if (!isHoldingMelee(mc.player.getOffHandStack())) {
            int best = bestSlot();
            if (best != -1) {
                selected = mc.player.getInventory().getStack(best);
                slot = best;
                previousSlot = mc.player.getInventory().selectedSlot;
                swap(best);
                ticks = 0;
                activeTicks = mc.currentScreen != null ? 2 : ACTIVE_TICKS;
                restoreTicks = TIMEOUT;
            }
        }
    }

    /** {@code rw.core.IltOkpplt#m20000} — called every tick. */
    public static void tick() {
        if (!isSwapped()) {
            return;
        }

        ticks++;
        restoreTicks--;
        if (restoreTicks <= 0) {
            release();
        }
    }

    /** {@code rw.core.IltOkpplt#m22000} / {@code rw.core.C0892#m4000} — restores the real slot. */
    public static void release() {
        if (!isSwapped()) {
            return;
        }

        if (previousSlot >= 0 && previousSlot < 9) {
            swap(previousSlot);
        }
        reset();
    }

    /** {@code rw.core.IltOkpplt#m2000} — resets at the start of every tick. */
    public static void reset() {
        slot = -1;
        selected = ItemStack.EMPTY;
        ticks = 0;
        activeTicks = 0;
        restoreTicks = 0;
        previousSlot = -1;
    }

    /** {@code rw.core.IltOkpplt#m32000} — true while a weapon is silently held. */
    public static boolean isSwapped() {
        return slot != -1 && !selected.isEmpty() && mc.player.getMainHandStack().isOf(selected.getItem());
    }

    /** {@code rw.core.IltOkpplt#m38000} — true once the swap was applied long enough. */
    public static boolean isReady() {
        return !isSwapped() || ticks >= activeTicks;
    }

    /** {@code rw.core.IltOkpplt#m28000} — index of the strongest weapon of the hotbar. */
    private static int bestSlot() {
        double current = damage(mc.player.getMainHandStack());
        int best = -1;

        for (int i = 0; i < 9; i++) {
            ItemStack stack = mc.player.getInventory().getStack(i);
            if (stack.isEmpty() || !isMelee(stack)) {
                continue;
            }

            double value = damage(stack);
            if (value > current) {
                current = value;
                best = i;
            }
        }

        return best;
    }

    /** {@code rw.core.IltOkpplt#m44000} — Minecraft damage formula of an item stack. */
    private static double damage(ItemStack stack) {
        AttributeModifiersComponent component = stack.getOrDefault(DataComponentTypes.ATTRIBUTE_MODIFIERS,
                AttributeModifiersComponent.DEFAULT);

        double base = 1.0;
        double addition = 0.0;
        double multiplier = 0.0;
        double factor = 1.0;

        for (AttributeModifiersComponent.Entry entry : component.modifiers()) {
            if (!entry.attribute().equals(EntityAttributes.ATTACK_DAMAGE)) {
                continue;
            }

            double value = entry.modifier().value();
            switch (entry.modifier().operation()) {
                case ADD_VALUE -> addition += value;
                case ADD_MULTIPLIED_BASE -> multiplier += value;
                case ADD_MULTIPLIED_TOTAL -> factor *= 1.0 + value;
            }
        }

        return (base + addition + (base + addition) * multiplier) * factor;
    }

    public static boolean isMelee(ItemStack stack) {
        return stack.getItem() instanceof SwordItem
                || stack.getItem() instanceof AxeItem
                || stack.getItem() instanceof MaceItem
                || stack.getItem() instanceof TridentItem
                || stack.getItem() instanceof PickaxeItem
                || stack.getItem() instanceof ShovelItem
                || stack.getItem() instanceof HoeItem;
    }

    private static boolean isHoldingMelee(ItemStack stack) {
        return !stack.isEmpty() && isMelee(stack);
    }

    /** {@code rw.core.C0892#m44000} — silent hotbar swap. */
    private static void swap(int target) {
        if (mc.player == null || mc.getNetworkHandler() == null) {
            return;
        }
        mc.player.getInventory().selectedSlot = target;
        mc.getNetworkHandler().sendPacket(new UpdateSelectedSlotC2SPacket(target));
    }
}

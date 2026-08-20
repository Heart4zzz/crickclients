package fun.crickclient.client.modules.impl.combat;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.BuiltBuffer;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormat;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.EquippableComponent;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInputC2SPacket;
import net.minecraft.registry.Registries;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.Identifier;
import net.minecraft.util.PlayerInput;
import net.minecraft.util.math.MathHelper;
import org.joml.Matrix4f;
import fun.crickclient.api.events.EventLink;
import fun.crickclient.api.events.implement.EventBinding;
import fun.crickclient.api.events.implement.EventClickSlot;
import fun.crickclient.api.events.implement.EventMoveInput;
import fun.crickclient.api.events.implement.EventRender;
import fun.crickclient.api.events.implement.EventTickPre;
import fun.crickclient.api.utils.color.ColorUtils;
import fun.crickclient.api.utils.input.KeyBoardUtils;
import fun.crickclient.api.utils.notification.NotificationManager;
import fun.crickclient.api.utils.render.RenderUtils;
import fun.crickclient.client.modules.Module;
import fun.crickclient.client.modules.settings.implement.BindSetting;
import fun.crickclient.client.modules.settings.implement.BooleanSetting;
import fun.crickclient.client.modules.settings.implement.ModeSetting;
import fun.crickclient.client.modules.settings.implement.TextSetting;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class AutoSwap extends Module {

    public static AutoSwap INSTANCE = new AutoSwap();

    private final BindSetting offhandSwapKey = new BindSetting("Offhand Swap key", -1);
    private final BindSetting headSwapKey = new BindSetting("Head Swap key", -1);

    private final BooleanSetting serverBypass = new BooleanSetting("Обход серверов", false);

    private final ModeSetting swapMode = new ModeSetting("Swap mode", "Wheel", "Simple", "Wheel");
    private final ModeSetting firstItem = new ModeSetting("First item", "Shield", "Shield", "GApple", "Totem", "Ball");
    private final ModeSetting secondItem = new ModeSetting("Second item", "GApple", "Shield", "GApple", "Totem", "Ball");

    private final TextSetting slot1 = new TextSetting("Slot 1", "minecraft:air", 64);
    private final TextSetting slot2 = new TextSetting("Slot 2", "minecraft:air", 64);
    private final TextSetting slot3 = new TextSetting("Slot 3", "minecraft:air", 64);
    private final TextSetting slot4 = new TextSetting("Slot 4", "minecraft:air", 64);
    private final TextSetting slot5 = new TextSetting("Slot 5", "minecraft:air", 64);
    private final TextSetting slot6 = new TextSetting("Slot 6", "minecraft:air", 64);
    private final TextSetting slot7 = new TextSetting("Slot 7", "minecraft:air", 64);
    private final TextSetting slot8 = new TextSetting("Slot 8", "minecraft:air", 64);

    private boolean wheelOpen = false;
    private int wheelTargetSlot = -1;
    private int selectedWheelIndex = -1;
    private int pendingPickSlot = -1;
    private int wheelKey = -1;
    private boolean cursorUnlocked;

    private boolean needSprintReset = false;
    private boolean sprintResetDone = false;
    private int sprintResetTicks = 0;
    private int pendingSwapSlot = -1;
    private int pendingSwapTargetSlot = -1;
    private int pendingSwapAge = 0;

    private static final float OUTER_R = 75f;
    private static final float INNER_R = 50f;
    private static final int WHEEL_COUNT = 8;

    public AutoSwap() {
        super("AutoSwap", "Быстрая смена предметов в офф-хенде и на голове", ModuleCategory.COMBAT);
        addSettings(offhandSwapKey, headSwapKey, serverBypass, swapMode, firstItem, secondItem,
                slot1, slot2, slot3, slot4, slot5, slot6, slot7, slot8);
    }

    @EventLink
    public void onBinding(final EventBinding event) {
        if (mc.player == null || mc.world == null) return;

        int key = event.getKey();
        boolean isOffhand = key == offhandSwapKey.getKey();
        boolean isHead = key == headSwapKey.getKey();

        // Открытие радиального колеса (зажатие клавиши)
        if (swapMode.is("Wheel") && (isOffhand || isHead)) {
            wheelOpen = true;
            wheelTargetSlot = isOffhand ? 45 : 5;
            wheelKey = key;
            updateWheelCursorState(true);
            return;
        }

        // Клики мышью по колесу, пока оно открыто
        if (wheelOpen && event.getBindType() == EventBinding.BindType.MOUSE) {
            int hover = getHoverIndex();
            if (hover == -1) return;

            int button = KeyBoardUtils.getMouseButtonFromKey(key);
            if (button == 1) {
                // ПКМ — очистить слот
                setSlotString(hover, "minecraft:air");
            } else if (button == 0) {
                ItemStack stack = getStackForIndex(hover);
                if (stack.isEmpty() || stack.getItem() == Items.AIR) {
                    // ЛКМ по пустому слоту — выбрать предмет из инвентаря
                    pendingPickSlot = hover;
                    mc.setScreen(new InventoryScreen(mc.player));
                } else {
                    executeSwapLogicByItem(stack.getItem(), wheelTargetSlot);
                    closeWheel();
                }
            }
            return;
        }

        // Простой режим — свап по нажатию
        if (!wheelOpen) {
            if (isOffhand) handleOffhandSwap();
            else if (isHead) handleHeadSwap();
        }
    }

    @EventLink
    public void onMoveInput(final EventMoveInput event) {
        if (!needSprintReset) return;

        event.setForward(0);
        event.setStrafe(0);
        needSprintReset = false;
        sprintResetDone = true;
        sprintResetTicks = 0;
    }

    @EventLink
    public void onTick(final EventTickPre event) {
        if (mc.player == null) {
            resetWheel();
            resetSprintState();
            return;
        }

        handlePendingSwap();

        if (!wheelOpen) return;

        if (pendingPickSlot != -1) {
            // Инвентарь закрыли без выбора предмета (ESC) — отменяем выбор и снова разблокируем курсор
            if (mc.currentScreen == null) {
                pendingPickSlot = -1;
                cursorUnlocked = false;
                updateWheelCursorState(true);
            }
            return;
        }

        if (mc.currentScreen != null) return;

        // Клавишу отпустили — закрываем колесо (события отпускания в клиенте нет, поэтому поллим)
        if (wheelKey != -1 && !KeyBoardUtils.isBindHeld(wheelKey)) {
            closeWheel();
        }
    }

    @EventLink
    public void onClickSlot(final EventClickSlot event) {
        if (mc.player == null || mc.world == null) return;
        if (!swapMode.is("Wheel")) return;
        if (pendingPickSlot == -1) return;
        if (!(mc.currentScreen instanceof InventoryScreen)) return;
        if (event.getSlotActionType() != SlotActionType.PICKUP) return;

        ItemStack picked = mc.player.currentScreenHandler.getSlot(event.getSlotId()).getStack();
        if (picked == null || picked.isEmpty() || picked.getItem() == Items.AIR) return;

        Identifier id = Registries.ITEM.getId(picked.getItem());
        if (id == null) return;

        setSlotString(pendingPickSlot, id.toString());
        pendingPickSlot = -1;

        event.cancel();

        mc.setScreen(null);
        cursorUnlocked = false;
        updateWheelCursorState(true);
    }

    @EventLink
    public void onRender(final EventRender.Default event) {
        if (!wheelOpen || mc.player == null) return;
        renderRadialWheel(event.getContext());
    }

    @Override
    public void onDisable() {
        resetWheel();
        resetSprintState();
        super.onDisable();
    }

    private void resetWheel() {
        wheelOpen = false;
        wheelTargetSlot = -1;
        selectedWheelIndex = -1;
        pendingPickSlot = -1;
        wheelKey = -1;
        updateWheelCursorState(false);
    }

    private void closeWheel() {
        if (pendingPickSlot == -1 && selectedWheelIndex != -1) {
            ItemStack stack = getStackForIndex(selectedWheelIndex);
            if (!stack.isEmpty() && stack.getItem() != Items.AIR) {
                executeSwapLogicByItem(stack.getItem(), wheelTargetSlot);
            }
        }
        wheelOpen = false;
        pendingPickSlot = -1;
        wheelKey = -1;
        selectedWheelIndex = -1;
        updateWheelCursorState(false);
    }

    private void updateWheelCursorState(boolean shouldBeUnlocked) {
        if (shouldBeUnlocked) {
            if (!cursorUnlocked) {
                mc.mouse.unlockCursor();
                cursorUnlocked = true;
            }
        } else {
            if (cursorUnlocked) {
                if (mc.currentScreen == null) {
                    mc.mouse.lockCursor();
                }
                cursorUnlocked = false;
            }
        }
    }

    private List<TextSetting> getWheelSettings() {
        List<TextSetting> list = new ArrayList<>();
        list.add(slot1);
        list.add(slot2);
        list.add(slot3);
        list.add(slot4);
        list.add(slot5);
        list.add(slot6);
        list.add(slot7);
        list.add(slot8);
        return list;
    }

    private void setSlotString(int index, String value) {
        List<TextSetting> settings = getWheelSettings();
        if (index < 0 || index >= settings.size()) return;
        settings.get(index).setText(value);
    }

    private ItemStack getStackForIndex(int index) {
        List<TextSetting> settings = getWheelSettings();
        if (index < 0 || index >= settings.size()) return ItemStack.EMPTY;
        String raw = settings.get(index).get();
        if (raw == null || raw.isBlank()) return ItemStack.EMPTY;
        Identifier id = Identifier.tryParse(raw);
        if (id == null) return ItemStack.EMPTY;
        Item item = Registries.ITEM.get(id);
        if (item == null || item == Items.AIR) return ItemStack.EMPTY;
        return item.getDefaultStack();
    }

    private double[] getMouseScaled() {
        double mx = mc.mouse.getX() * mc.getWindow().getScaledWidth() / (double) mc.getWindow().getWidth();
        double my = mc.mouse.getY() * mc.getWindow().getScaledHeight() / (double) mc.getWindow().getHeight();
        return new double[]{mx, my};
    }

    private int getHoverIndex() {
        float cx = mc.getWindow().getScaledWidth() / 2f;
        float cy = mc.getWindow().getScaledHeight() / 2f;
        double[] mouse = getMouseScaled();
        return getHoverIndex((float) mouse[0], (float) mouse[1], cx, cy, INNER_R, OUTER_R, WHEEL_COUNT);
    }

    private int getHoverIndex(float mouseX, float mouseY, float cx, float cy, float innerR, float outerR, int count) {
        float dx = mouseX - cx;
        float dy = mouseY - cy;
        float dist = MathHelper.sqrt(dx * dx + dy * dy);
        if (dist < innerR || dist > outerR) return -1;

        double ang = Math.atan2(dy, dx);
        if (ang < 0) ang += Math.PI * 2.0;

        int idx = (int) (ang / ((Math.PI * 2.0) / count));
        if (idx < 0 || idx >= count) return -1;
        return idx;
    }

    private void renderRadialWheel(DrawContext context) {
        MatrixStack ms = context.getMatrices();
        float cx = mc.getWindow().getScaledWidth() / 2f;
        float cy = mc.getWindow().getScaledHeight() / 2f;

        double[] mouse = getMouseScaled();
        selectedWheelIndex = getHoverIndex((float) mouse[0], (float) mouse[1], cx, cy, INNER_R, OUTER_R, WHEEL_COUNT);

        int accent = ColorUtils.getThemeColor();

        for (int i = 0; i < WHEEL_COUNT; i++) {
            boolean hovered = (i == selectedWheelIndex);
            double slice = (Math.PI * 2.0) / WHEEL_COUNT;
            double startAngle = i * slice;
            double endAngle = startAngle + slice;

            Color segColor = hovered
                    ? new Color(255, 255, 255, 50)
                    : new Color(30, 35, 30, 100);
            Color borderC = hovered
                    ? new Color((accent >> 16) & 0xFF, (accent >> 8) & 0xFF, accent & 0xFF, 200)
                    : new Color(255, 255, 255, 40);

            drawRadialSegment(ms, cx, cy, INNER_R, OUTER_R, startAngle, endAngle, segColor, borderC);

            double midAngle = startAngle + slice / 2.0;
            float iconDist = INNER_R + (OUTER_R - INNER_R) / 2f;
            float itemX = cx + (float) Math.cos(midAngle) * iconDist;
            float itemY = cy + (float) Math.sin(midAngle) * iconDist;

            ItemStack stack = getStackForIndex(i);
            if (!stack.isEmpty() && stack.getItem() != Items.AIR) {
                RenderUtils.drawHudItem(context, stack, itemX - 8f, itemY - 8f, 1f, 0f);
            }
        }

        float cs = 3f;
        Color crossColor = new Color(255, 255, 255, 180);
        RenderUtils.drawRoundedRect(ms, cx - cs, cy - 0.5f, cs * 2f, 1f, 0f, crossColor.getRGB());
        RenderUtils.drawRoundedRect(ms, cx - 0.5f, cy - cs, 1f, cs * 2f, 0f, crossColor.getRGB());
    }

    private void drawRadialSegment(MatrixStack ms, float cx, float cy, float innerR, float outerR,
                                   double startAngle, double endAngle, Color bg, Color border) {
        int steps = 24;
        double delta = (endAngle - startAngle) / steps;
        Matrix4f matrix = ms.peek().getPositionMatrix();

        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);

        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder builder = tessellator.begin(VertexFormat.DrawMode.TRIANGLE_STRIP, VertexFormats.POSITION_COLOR);
        for (int i = 0; i <= steps; i++) {
            double a = startAngle + i * delta;
            float cos = (float) Math.cos(a);
            float sin = (float) Math.sin(a);
            builder.vertex(matrix, cx + cos * outerR, cy + sin * outerR, 0)
                    .color(bg.getRed(), bg.getGreen(), bg.getBlue(), bg.getAlpha());
            builder.vertex(matrix, cx + cos * innerR, cy + sin * innerR, 0)
                    .color(bg.getRed(), bg.getGreen(), bg.getBlue(), bg.getAlpha());
        }
        BuiltBuffer buffer = builder.end();
        if (buffer != null) {
            BufferRenderer.drawWithGlobalProgram(buffer);
        }

        BufferBuilder lineBuilder = tessellator.begin(VertexFormat.DrawMode.DEBUG_LINE_STRIP, VertexFormats.POSITION_COLOR);
        for (int i = 0; i <= steps; i++) {
            double a = startAngle + i * delta;
            float cos = (float) Math.cos(a);
            float sin = (float) Math.sin(a);
            lineBuilder.vertex(matrix, cx + cos * outerR, cy + sin * outerR, 0)
                    .color(border.getRed(), border.getGreen(), border.getBlue(), border.getAlpha());
        }
        for (int i = steps; i >= 0; i--) {
            double a = startAngle + i * delta;
            float cos = (float) Math.cos(a);
            float sin = (float) Math.sin(a);
            lineBuilder.vertex(matrix, cx + cos * innerR, cy + sin * innerR, 0)
                    .color(border.getRed(), border.getGreen(), border.getBlue(), border.getAlpha());
        }
        BuiltBuffer lineBuffer = lineBuilder.end();
        if (lineBuffer != null) {
            BufferRenderer.drawWithGlobalProgram(lineBuffer);
        }
    }

    private void handleOffhandSwap() {
        if (mc.player == null) return;
        Item f = getItemByMode(firstItem.getCurrent());
        Item s = getItemByMode(secondItem.getCurrent());
        Item target = mc.player.getOffHandStack().isOf(f) ? s : f;
        if (target != Items.AIR) executeSwapLogicByItem(target, 45);
    }

    private void handleHeadSwap() {
        if (mc.player == null) return;
        ItemStack headStack = mc.player.getEquippedStack(EquipmentSlot.HEAD);
        boolean isWearingBall = headStack.isOf(Items.PLAYER_HEAD);
        int slot = isWearingBall ? findHelmet() : findItem(Items.PLAYER_HEAD);
        if (slot != -1) executeSwapLogicBySlot(slot, 5);
    }

    private void executeSwapLogicByItem(Item target, int targetContainerSlot) {
        int slot = findItem(target);
        if (slot != -1) executeSwapLogicBySlot(slot, targetContainerSlot);
    }

    private void executeSwapLogicBySlot(int slot, int targetContainerSlot) {
        int containerSlot = slot < 9 ? slot + 36 : slot;

        // Обход серверов — сначала сбрасываем спринт (как в ауре), свап уходит следующим тиком
        if (shouldSprintResetBeforeSwap()) {
            pendingSwapSlot = containerSlot;
            pendingSwapTargetSlot = targetContainerSlot;
            pendingSwapAge = 0;
            needSprintReset = true;
            return;
        }

        executeGrimSwap(containerSlot, targetContainerSlot);
        resetSprintState();
    }

    private boolean shouldSprintResetBeforeSwap() {
        return serverBypass.isState()
                && mc.player != null
                && mc.player.isSprinting()
                && !sprintResetDone
                && pendingSwapSlot == -1;
    }

    /** Досылает отложенный свап после того, как ввод движения был обнулён (сброс спринта). */
    private void handlePendingSwap() {
        if (sprintResetDone) {
            sprintResetTicks++;
        }

        if (pendingSwapSlot == -1) {
            if (sprintResetDone) resetSprintState();
            return;
        }

        // Страховка от зависшего свапа, если ввод движения так и не обновился
        if (++pendingSwapAge > 10) {
            resetSprintState();
            return;
        }

        if (needSprintReset) return;
        if (sprintResetDone && sprintResetTicks < 1) return;

        int slot = pendingSwapSlot;
        int targetSlot = pendingSwapTargetSlot;
        resetSprintState();
        executeGrimSwap(slot, targetSlot);
    }

    private void resetSprintState() {
        needSprintReset = false;
        sprintResetDone = false;
        sprintResetTicks = 0;
        pendingSwapSlot = -1;
        pendingSwapTargetSlot = -1;
        pendingSwapAge = 0;
    }

    private void executeGrimSwap(int slot, int targetSlot) {
        if (mc.player == null || mc.interactionManager == null) return;

        int syncId = mc.player.currentScreenHandler.syncId;
        boolean wasSprinting = mc.player.isSprinting();

        if (wasSprinting) {
            mc.player.networkHandler.sendPacket(new ClientCommandC2SPacket(mc.player, ClientCommandC2SPacket.Mode.STOP_SPRINTING));
        }
        mc.player.networkHandler.sendPacket(new PlayerInputC2SPacket(new PlayerInput(false, false, false, false, false, false, false)));

        int invIndex = slot >= 36 ? slot - 36 : slot;
        ItemStack iconStack = mc.player.getInventory().getStack(invIndex).copy();

        if (invIndex >= 0 && invIndex <= 8) {
            mc.interactionManager.clickSlot(syncId, targetSlot, invIndex, SlotActionType.SWAP, mc.player);
        } else {
            mc.interactionManager.clickSlot(syncId, slot, 0, SlotActionType.PICKUP, mc.player);
            mc.interactionManager.clickSlot(syncId, targetSlot, 0, SlotActionType.PICKUP, mc.player);
            mc.interactionManager.clickSlot(syncId, slot, 0, SlotActionType.PICKUP, mc.player);
        }

        mc.player.networkHandler.sendPacket(new CloseHandledScreenC2SPacket(syncId));
        if (wasSprinting) {
            mc.player.networkHandler.sendPacket(new ClientCommandC2SPacket(mc.player, ClientCommandC2SPacket.Mode.START_SPRINTING));
        }

        NotificationManager.pushCustom(iconStack.getName().getString(), "b");
    }

    /** Поиск предмета в инвентаре (0–35: хотбар 0–8, основной инвентарь 9–35). */
    private int findItem(Item item) {
        for (int i = 0; i < 36; i++) {
            ItemStack stack = mc.player.getInventory().getStack(i);
            if (stack.isOf(item)) return i;
        }
        return -1;
    }

    private int findHelmet() {
        int s = findItem(Items.NETHERITE_HELMET);
        if (s == -1) s = findItem(Items.DIAMOND_HELMET);

        if (s == -1) {
            for (int i = 0; i < 36; i++) {
                Item item = mc.player.getInventory().getStack(i).getItem();
                if (item instanceof ArmorItem && isHelmetItem(item)) return i;
            }
        }
        return s;
    }

    private boolean isHelmetItem(Item item) {
        if (!(item instanceof ArmorItem)) return false;
        EquippableComponent equippable = item.getDefaultStack().get(DataComponentTypes.EQUIPPABLE);
        return equippable != null && equippable.slot() == EquipmentSlot.HEAD;
    }

    private Item getItemByMode(String name) {
        return switch (name.toLowerCase()) {
            case "shield" -> Items.SHIELD;
            case "ball" -> Items.PLAYER_HEAD;
            case "totem" -> Items.TOTEM_OF_UNDYING;
            case "gapple" -> Items.GOLDEN_APPLE;
            default -> Items.AIR;
        };
    }
}

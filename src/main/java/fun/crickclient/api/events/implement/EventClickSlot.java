package fun.crickclient.api.events.implement;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.minecraft.screen.slot.SlotActionType;
import fun.crickclient.api.events.Event;

/**
 * Срабатывает при клике по слоту в любом {@code HandledScreen} (инвентарь, сундук и т.д.).
 * Можно отменить, чтобы перехватить клик (например, для выбора предмета в радиальном меню).
 */
@AllArgsConstructor @Getter
public class EventClickSlot extends Event {
    private final int slotId;
    private final int button;
    private final SlotActionType slotActionType;
}

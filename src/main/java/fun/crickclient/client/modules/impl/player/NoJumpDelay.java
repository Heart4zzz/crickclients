package fun.crickclient.client.modules.impl.player;

import fun.crickclient.api.events.EventLink;
import fun.crickclient.api.events.implement.EventUpdate;
import fun.crickclient.client.modules.Module;
import fun.crickclient.mixin.ILivingEntity;

public class NoJumpDelay extends Module {

    public static NoJumpDelay INSTANCE = new NoJumpDelay();

    public NoJumpDelay() {
        super("NoJumpDelay", "Убирает задержку на прыжок", ModuleCategory.PLAYER);
    }

    @EventLink
    public void onEvent(final EventUpdate event) {
        if (mc.player == null || mc.world == null) return;

        ((ILivingEntity) mc.player).setJumpingCooldown(0);
    }
}

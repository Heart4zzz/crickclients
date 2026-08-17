package fun.crickclient.client.modules.impl.movement;

import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.text.Text;
import net.minecraft.util.math.Vec3d;
import fun.crickclient.api.events.EventLink;
import fun.crickclient.api.events.implement.EventMoveInput;
import fun.crickclient.api.events.implement.EventPacket;
import fun.crickclient.api.events.implement.EventTickPre;
import fun.crickclient.api.utils.math.StopWatch;
import fun.crickclient.client.modules.Module;
import fun.crickclient.client.modules.settings.implement.BooleanSetting;
import fun.crickclient.client.modules.settings.implement.ModeSetting;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class AirStuck extends Module {

    public static AirStuck INSTANCE = new AirStuck();

    private final ModeSetting modeSetting = new ModeSetting("Mode", "Grim", "Grim", "FunTime");

    private final BooleanSetting fallCheck = new BooleanSetting("Fall Check", true);

    private Vec3d savedVelocity = Vec3d.ZERO;
    private final Queue<Packet<?>> packets = new ConcurrentLinkedQueue<>();
    private final StopWatch stopWatch = new StopWatch();

    public AirStuck() {
        super("AirStuck", "Air Stuck", ModuleCategory.MOVEMENT);
        addSettings(modeSetting, fallCheck);
    }

    @EventLink
    public void onInput(EventMoveInput e) {
        e.setForward(0);
        e.setStrafe(0);
        e.setJump(false);
        e.setSneak(false);
    }

    @EventLink
    public void onPacket(EventPacket e) {
        if (!isEnable() || mc.player == null) return;

        if (modeSetting.is("FunTime")) {
            if (e.getType() == EventPacket.Type.SEND) {
                if (e.getPacket() instanceof PlayerMoveC2SPacket) {
                    e.cancel();
                } else {
                    packets.add(e.getPacket());
                    e.cancel();
                }
            }
        } else if (modeSetting.is("Grim")) {
            if (e.getPacket() instanceof PlayerMoveC2SPacket) {
                e.cancel();
            }
        }
    }

    @EventLink
    public void onTick(EventTickPre e) {
        if (mc.player == null) return;

        if (modeSetting.is("FunTime") && stopWatch.isReached(28000)) {
            mc.player.sendMessage(Text.literal("§c[AirStuck] Автоматически выключен (защита от кика)"), false);
            setEnabled(false);
            return;
        }

        mc.player.setVelocity(0, 0, 0);
        mc.player.setNoGravity(true);
    }

    @Override
    public void onEnable() {
        super.onEnable();
        stopWatch.reset();
        packets.clear();
        if (mc.player == null || mc.world == null) return;

        if (mc.player.isOnGround() && fallCheck.isState()) {
            mc.player.sendMessage(Text.literal("Вам нужно находиться в воздухе"), false);
            setEnabled(false);
            return;
        }

        mc.player.setNoGravity(true);
        savedVelocity = mc.player.getVelocity();
    }

    @Override
    public void onDisable() {
        super.onDisable();
        if (mc.player == null) return;
        if (mc.player.isOnGround() && fallCheck.isState()) return;

        if (!packets.isEmpty()) {
            for (Packet<?> packet : packets) {
                if (mc.getNetworkHandler() != null) {
                    mc.getNetworkHandler().sendPacket(packet);
                }
            }
            packets.clear();
        }

        if (savedVelocity != null) {
            mc.player.setVelocity(savedVelocity);
        }
        mc.player.setNoGravity(false);
    }
}

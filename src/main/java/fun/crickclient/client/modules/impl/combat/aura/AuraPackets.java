package fun.crickclient.client.modules.impl.combat.aura;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.minecraft.network.packet.Packet;

import fun.crickclient.api.QClient;

/**
 * Delayed (blinked) packet queue of the ported AttackAura.
 * <p>
 * Ported from {@code rw.gui.AttackAura#m128000} / {@code m148000} / {@code m140000} and
 * {@code rw.data.Rec0190} — packets are cancelled and re-sent {@value #DELAY} ms later so the
 * server sees the player falling while the attack packet is already processed.
 */
public final class AuraPackets implements QClient {

    /** {@code f51000[0]} — delay in milliseconds. */
    public static final long DELAY = 80L;

    private static final List<DelayedPacket> QUEUE = new ArrayList<>();

    private static boolean requested;

    private AuraPackets() {
    }

    public record DelayedPacket(Packet<?> packet, long timestamp) {
    }

    /** {@code m132000} / {@code m6000} — the aura asks to delay the packets of the current tick. */
    public static void request(boolean state) {
        requested = state;
    }

    public static boolean isRequested() {
        return requested;
    }

    /** {@code m128000} — the packet is cancelled and queued instead of being sent. */
    public static void queue(Packet<?> packet) {
        QUEUE.add(new DelayedPacket(packet, System.currentTimeMillis()));
    }

    /** {@code m140000} — everything queued is sent right now. */
    public static void flush() {
        synchronized (QUEUE) {
            for (DelayedPacket delayed : QUEUE) {
                send(delayed.packet());
            }
            QUEUE.clear();
        }
        requested = false;
    }

    /** {@code m148000} — tick processing: everything older than {@value #DELAY} ms is sent. */
    public static void tick() {
        if (mc.player == null) {
            clear();
            return;
        }

        long now = System.currentTimeMillis();
        synchronized (QUEUE) {
            Iterator<DelayedPacket> iterator = QUEUE.iterator();
            while (iterator.hasNext()) {
                DelayedPacket delayed = iterator.next();
                if (now - delayed.timestamp() >= DELAY) {
                    send(delayed.packet());
                    iterator.remove();
                }
            }
        }
    }

    /** {@code m10000} — drops the queue without sending anything. */
    public static void clear() {
        synchronized (QUEUE) {
            QUEUE.clear();
        }
        requested = false;
    }

    public static boolean isEmpty() {
        synchronized (QUEUE) {
            return QUEUE.isEmpty();
        }
    }

    public static int size() {
        synchronized (QUEUE) {
            return QUEUE.size();
        }
    }

    private static void send(Packet<?> packet) {
        if (mc.getNetworkHandler() != null) {
            mc.getNetworkHandler().sendPacket(packet);
        }
    }
}

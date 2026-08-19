package fun.crickclient.api.storages.implement;

import net.minecraft.util.math.MathHelper;
import fun.crickclient.api.QClient;
import fun.crickclient.api.events.EventInvoker;
import fun.crickclient.api.events.EventLink;
import fun.crickclient.api.events.implement.EventLook;
import fun.crickclient.api.events.implement.EventRotation;

public class FreeLookStorage implements QClient {

    public FreeLookStorage() {
        EventInvoker.register(this);
    }

    private static boolean active;
    private static float freeYaw, freePitch;

    public static boolean isActive() {
        return active;
    }

    public static void setActive(boolean value) {
        active = value;
    }

    public static float getFreeYaw() {
        return freeYaw;
    }

    public static float getFreePitch() {
        return freePitch;
    }

    public static void setFreeYaw(float value) {
        freeYaw = value;
    }

    public static void setFreePitch(float value) {
        freePitch = value;
    }

    @EventLink
    public void onLook(EventLook event) {
        if (active) {
            rotateTowards(event.getYaw(), event.getPitch());
            event.cancel();
        }
    }

    @EventLink
    public void onRotation(EventRotation event) {
        if (active) {
            event.setYaw(freeYaw);
            event.setPitch(freePitch);
        } else {
            freeYaw = event.getYaw();
            freePitch = event.getPitch();
        }
    }

    private void rotateTowards(double targetYaw, double targetPitch) {
        freePitch = MathHelper.clamp((float) (freePitch + targetPitch * 0.15D), -90.0F, 90.0F);
        freeYaw = (float) (freeYaw + targetYaw * 0.15D);
    }
}

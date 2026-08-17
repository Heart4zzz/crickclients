package fun.crickclient.api.utils.input;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.Perspective;
import org.lwjgl.glfw.GLFW;

/**
 * Fallback for clients where the vanilla perspective key press is queued but
 * not consumed. Vanilla is always given the first opportunity to handle the
 * configured key; this class only cycles the perspective when it is still
 * unchanged at the end of the client tick.
 */
public final class PerspectiveInputFix {
    private static Perspective perspectiveBeforePress;
    private static boolean pendingPress;

    private PerspectiveInputFix() {
    }

    public static void recordKeyPress(MinecraftClient client, int key, int scanCode, int action) {
        if (client == null || client.options == null || client.currentScreen != null || action != GLFW.GLFW_PRESS) {
            return;
        }
        if (!client.options.togglePerspectiveKey.matchesKey(key, scanCode)) {
            return;
        }

        perspectiveBeforePress = client.options.getPerspective();
        pendingPress = true;
    }

    public static void applyFallback(MinecraftClient client) {
        if (!pendingPress || client == null || client.options == null) {
            return;
        }

        pendingPress = false;
        Perspective before = perspectiveBeforePress;
        perspectiveBeforePress = null;
        if (before == null || client.options.getPerspective() != before) {
            return;
        }

        Perspective next = before.next();
        client.options.setPerspective(next);
        if (before.isFirstPerson() != next.isFirstPerson()) {
            client.gameRenderer.onCameraEntitySet(client.getCameraEntity());
        }
    }
}

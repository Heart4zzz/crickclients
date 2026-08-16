package fun.crickclient.api.utils.render.hud;

import net.minecraft.client.util.math.MatrixStack;
import fun.crickclient.api.utils.color.HudColors;
import fun.crickclient.api.utils.render.RenderUtils;

/**
 * Тонкий световой блик по контуру HUD-панели.
 */
public final class HudShine {

    private HudShine() {
    }

    public static void render(MatrixStack matrices, float x, float y, float width, float height,
                              float radius, float thickness, float intensity, float alpha) {
        if (matrices == null || width <= 0f || height <= 0f) return;

        int a = (int) (255f * Math.max(0f, Math.min(1f, alpha)) * Math.max(0f, Math.min(1f, intensity)));
        if (a <= 0) return;

        float outline = Math.max(0.2f, thickness);
        RenderUtils.drawRoundedRectOutline(matrices, x, y, width, height,
                radius, radius, radius, radius, outline, HudColors.rgba(255, 255, 255, a));
    }
}

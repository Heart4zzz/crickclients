package fun.crickclient.client.ui.clickgui.component;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.MatrixStack;

/** Базовый контракт элементов клик гуи (как в старом клиенте). */
public interface IComponent {

    void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks);

    default void render(DrawContext context, int mouseX, int mouseY, float partialTicks) {
        render(context == null ? new MatrixStack() : context.getMatrices(), mouseX, mouseY, partialTicks);
    }

    default void mouseClicked(double mouseX, double mouseY, int button) {
    }

    default void mouseReleased(double mouseX, double mouseY, int button) {
    }

    default void mouseScrolled(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
    }

    default void keyPressed(int keyCode, int scanCode, int modifiers) {
    }

    default void charTyped(char chr, int modifiers) {
    }
}

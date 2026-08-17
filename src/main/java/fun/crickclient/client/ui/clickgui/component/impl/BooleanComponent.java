package fun.crickclient.client.ui.clickgui.component.impl;

import fun.crickclient.client.modules.settings.implement.BooleanSetting;
import fun.crickclient.client.ui.clickgui.ClickGuiStyles;
import fun.crickclient.client.ui.clickgui.component.Component;
import fun.crickclient.client.ui.clickgui.util.Animation;
import fun.crickclient.client.ui.clickgui.util.ColorProvider;
import fun.crickclient.client.ui.clickgui.util.CursorManager;
import fun.crickclient.client.ui.clickgui.util.DrawUtil;
import fun.crickclient.client.ui.clickgui.util.Easing;
import fun.crickclient.client.ui.clickgui.util.GuiFonts;
import fun.crickclient.client.ui.clickgui.util.HoverUtil;
import net.minecraft.client.util.math.MatrixStack;

public class BooleanComponent extends Component {
    private final BooleanSetting setting;
    private final Animation toggleAnim = new Animation(Easing.QUINTIC_OUT, 250);

    public BooleanComponent(BooleanSetting setting) {
        this.setting = setting;
        this.toggleAnim.setValue(setting.isState() ? 1f : 0f);
    }

    @Override
    public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks) {
        float alpha = Math.max(Math.min(getAlphaAnimSetting().getValue(), 1), 0)
                * Math.max(Math.min(getAlphaAnim().getValue(), 1), 0);
        int alphaInt = (int) (255 * alpha);

        float toggleW = 18f;
        float toggleH = 9f;
        float toggleX = x + width - toggleW - 2.5f;
        float toggleY = y + 3.5f;

        if (HoverUtil.isHovered(mouseX, mouseY, toggleX, toggleY, toggleW, toggleH)) {
            CursorManager.requestHand();
        }

        DrawUtil.drawText(GuiFonts.GUI_BODY.get(), setting.displayName(),
                x + 4.5f, y + 4.5f, ColorProvider.setAlpha(ColorProvider.getColorText(), alphaInt),
                7f, 0.4f, 1f, width - toggleW - 8f);

        toggleAnim.run(setting.isState());
        ClickGuiStyles.drawToggle(toggleX, toggleY, alpha, toggleAnim.getValue());

        setHeight(16);
    }

    @Override
    public void mouseClicked(double mouseX, double mouseY, int button) {
        float toggleW = 18f;
        float toggleH = 9f;
        float toggleX = x + width - toggleW - 2.5f;
        float toggleY = y + 3.5f;

        if (button == 0 && HoverUtil.isHovered(mouseX, mouseY, toggleX, toggleY, toggleW, toggleH)) {
            setting.setState(!setting.isState());
        }
    }

    @Override
    public boolean isVisible() {
        return setting.visible.get();
    }
}

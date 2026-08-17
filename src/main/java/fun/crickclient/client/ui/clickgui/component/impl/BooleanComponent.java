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
import net.minecraft.util.math.MathHelper;

public class BooleanComponent extends Component {
    private final BooleanSetting setting;
    private final Animation toggleAnim = new Animation(Easing.QUINTIC_OUT, 250);
    private final Animation hoverAnim = new Animation(Easing.QUINTIC_OUT, 170);

    private static final float ROW_H = 17f;
    private static final float TOGGLE_W = 18f;
    private static final float TOGGLE_H = 9f;
    private static final float PADDING = 4.5f;

    public BooleanComponent(BooleanSetting setting) {
        this.setting = setting;
        this.toggleAnim.setValue(setting.isState() ? 1f : 0f);
    }

    private float toggleX() {
        return x + width - TOGGLE_W - PADDING;
    }

    private float toggleY() {
        return y + (ROW_H - TOGGLE_H) / 2f;
    }

    @Override
    public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks) {
        float alpha = MathHelper.clamp(getAlphaAnimSetting().getValue(), 0f, 1f)
                * MathHelper.clamp(getAlphaAnim().getValue(), 0f, 1f);
        if (alpha < 0.02f) {
            setHeight(ROW_H);
            return;
        }

        float toggleX = toggleX();
        float toggleY = toggleY();

        // Кликабельна вся строка — так попасть по настройке заметно проще.
        boolean hovered = HoverUtil.isHovered(mouseX, mouseY, x + 2f, y, width - 4f, ROW_H);
        if (hovered) CursorManager.requestHand();
        float hover = MathHelper.clamp(hoverAnim.run(hovered ? 1f : 0f), 0f, 1f);

        if (hover > 0.01f) {
            DrawUtil.drawRound(x + 2f, y, width - 4f, ROW_H, 4.5f,
                    ColorProvider.rgba(255, 255, 255, (int) (9 * hover * alpha)));
        }

        toggleAnim.run(setting.isState());
        float enabled = MathHelper.clamp(toggleAnim.getValue(), 0f, 1f);

        int textColor = ColorProvider.interpolateColor(
                ColorProvider.setAlpha(ColorProvider.getColorInactiveText(), (int) (235 * alpha)),
                ColorProvider.setAlpha(ColorProvider.getColorText(), (int) (255 * alpha)),
                enabled);
        DrawUtil.drawText(GuiFonts.GUI_BODY.get(), setting.displayName(),
                x + PADDING + 1f, DrawUtil.centeredTextY(GuiFonts.GUI_BODY.get(), y, ROW_H, 6.6f),
                textColor, 6.6f, 0.4f, 1f, width - TOGGLE_W - PADDING * 2f - 6f);

        ClickGuiStyles.drawToggle(toggleX, toggleY, alpha, enabled);

        setHeight(ROW_H);
    }

    @Override
    public void mouseClicked(double mouseX, double mouseY, int button) {
        if (button == 0 && HoverUtil.isHovered(mouseX, mouseY, x + 2f, y, width - 4f, ROW_H)) {
            setting.setState(!setting.isState());
        }
    }

    @Override
    public boolean isVisible() {
        return setting.visible.get();
    }
}

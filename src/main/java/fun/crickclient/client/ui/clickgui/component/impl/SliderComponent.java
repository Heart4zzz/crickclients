package fun.crickclient.client.ui.clickgui.component.impl;

import fun.crickclient.client.modules.settings.implement.FloatSetting;
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
import org.lwjgl.glfw.GLFW;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SliderComponent extends Component {
    private final FloatSetting setting;
    private boolean drag;
    private final Animation sliderAnimation = new Animation(Easing.QUINTIC_OUT, 100);

    public SliderComponent(FloatSetting setting) {
        this.setting = setting;
    }

    private double round(double num, double increment) {
        if (increment <= 0) return num;
        double v = Math.round(num / increment) * increment;
        return BigDecimal.valueOf(v).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    private String formatNumber(double value) {
        return BigDecimal.valueOf(value).setScale(2, RoundingMode.HALF_UP)
                .stripTrailingZeros().toPlainString();
    }

    @Override
    public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks) {
        float alpha = Math.min(getAlphaAnimSetting().getValue(), 1) * Math.max(Math.min(getAlphaAnim().getValue(), 1), 0);
        int alphaInt = (int) (255 * alpha);

        String numberText = formatNumber(setting.get());
        float trackWidth = width - 9f;
        float range = Math.max(0.0001f, setting.getMax() - setting.getMin());

        sliderAnimation.run(trackWidth * (setting.get() - setting.getMin()) / range);

        DrawUtil.drawText(GuiFonts.GUI_BODY.get(), setting.displayName(), x + 4.5f, y + 3f,
                ColorProvider.setAlpha(ColorProvider.getColorText(), alphaInt), 7.5f, 0.6f, 1.0f, trackWidth);

        DrawUtil.drawText(GuiFonts.GUI_BODY.get(), numberText,
                x + width - 4.5f - GuiFonts.GUI_BODY.get().getWidth(numberText, 7.5f), y + 1f,
                ColorProvider.setAlpha(ColorProvider.getColorInactiveText(), alphaInt), 7.5f);

        float trackY = y + 14f;
        DrawUtil.drawRound(x + 3f, trackY - 3.5f, trackWidth + 1, 4, 1f,
                ColorProvider.setAlpha(ColorProvider.getColorSliderWindow(), (int) (100 * alpha)));
        DrawUtil.drawRound(x + 3.5f, trackY - 3, trackWidth, 3, 1f,
                ColorProvider.setAlpha(ColorProvider.getColorSliderWindow(), alphaInt));

        float fillWidth = MathHelper.clamp(sliderAnimation.getValue(), 0, trackWidth);
        int sliderColor = ColorProvider.setAlpha(ColorProvider.getColorSlider(), alphaInt);
        DrawUtil.drawRound(x + 3.5f, trackY - 3.5f, fillWidth, 4, 1f, sliderColor);

        float circleSize = drag ? 7f : 5.5f;
        float circleX = x + 3.5f + fillWidth;
        float circleY = trackY - 1.5f;
        DrawUtil.drawRound(circleX - circleSize / 2f, circleY - circleSize / 2f, circleSize, circleSize,
                circleSize / 2f, ColorProvider.setAlpha(ColorProvider.getColorSliderCircle(), alphaInt));

        if (HoverUtil.isHovered(mouseX, mouseY, x + 3f, y + 8f, width - 6f, 8f)) {
            CursorManager.requestHand();
        }

        if (drag) {
            double val = (mouseX - (x + 3.5f)) / trackWidth * range + setting.getMin();
            setting.setValue((float) MathHelper.clamp(round(val, setting.getIncrement()), setting.getMin(), setting.getMax()));
        }

        setHeight(15);
    }

    @Override
    public void mouseClicked(double mouseX, double mouseY, int button) {
        if (HoverUtil.isHovered(mouseX, mouseY, x + 3f, y + 8f, width - 6f, 8f) && button == 0) {
            drag = true;
        }
    }

    @Override
    public void mouseReleased(double mouseX, double mouseY, int button) {
        drag = false;
    }

    @Override
    public void keyPressed(int keyCode, int scanCode, int modifiers) {
        if (keyCode == GLFW.GLFW_KEY_ESCAPE) drag = false;
    }

    @Override
    public boolean isVisible() {
        return setting.visible.get();
    }
}

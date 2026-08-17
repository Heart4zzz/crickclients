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

    private static final float ROW_H = 24f;
    private static final float LABEL_H = 12f;
    private static final float TRACK_H = 3.5f;
    private static final float PADDING = 4.5f;
    private static final float FONT_SIZE = 6.6f;

    private final Animation sliderAnimation = new Animation(Easing.QUINTIC_OUT, 100);
    private final Animation hoverAnim = new Animation(Easing.QUINTIC_OUT, 170);
    private final Animation dragAnim = new Animation(Easing.QUINTIC_OUT, 150);

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

    private float trackX() {
        return x + PADDING + 1f;
    }

    private float trackWidth() {
        return width - (PADDING + 1f) * 2f;
    }

    private float trackY() {
        return y + LABEL_H + 4f;
    }

    @Override
    public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks) {
        float alpha = MathHelper.clamp(getAlphaAnimSetting().getValue(), 0f, 1f)
                * MathHelper.clamp(getAlphaAnim().getValue(), 0f, 1f);
        int alphaInt = (int) (255 * alpha);
        if (alpha < 0.02f) {
            setHeight(ROW_H);
            return;
        }

        int accent = ColorProvider.getColorClient();
        float trackX = trackX();
        float trackW = trackWidth();
        float trackY = trackY();
        float range = Math.max(0.0001f, setting.getMax() - setting.getMin());

        sliderAnimation.run(trackW * (setting.get() - setting.getMin()) / range);
        float fillWidth = MathHelper.clamp(sliderAnimation.getValue(), 0f, trackW);

        // Зона захвата шире самой дорожки — попасть по тонкому слайдеру иначе тяжело.
        boolean hovered = HoverUtil.isHovered(mouseX, mouseY, x + 2f, trackY - 6f, width - 4f, 13f);
        if (hovered || drag) CursorManager.requestHand();
        float hover = MathHelper.clamp(hoverAnim.run(hovered || drag ? 1f : 0f), 0f, 1f);
        float dragging = MathHelper.clamp(dragAnim.run(drag ? 1f : 0f), 0f, 1f);

        // Название слева, значение — справа, обе строки на одной оптической линии.
        DrawUtil.drawText(GuiFonts.GUI_BODY.get(), setting.displayName(),
                x + PADDING + 1f, DrawUtil.centeredTextY(GuiFonts.GUI_BODY.get(), y, LABEL_H, FONT_SIZE),
                ColorProvider.setAlpha(ColorProvider.getColorText(), alphaInt),
                FONT_SIZE, 0.4f, 1f, trackW - 34f);

        String numberText = formatNumber(setting.get());
        float valueW = GuiFonts.GUI_BODY.get().getWidth(numberText, FONT_SIZE) + 9f;
        float valueH = 10.5f;
        float valueX = x + width - PADDING - 1f - valueW;
        float valueY = y + (LABEL_H - valueH) / 2f;
        DrawUtil.drawRound(valueX, valueY, valueW, valueH, 3.5f,
                ColorProvider.setAlpha(accent, (int) ((26 + 24 * hover) * alpha)));
        DrawUtil.drawTextCentered(GuiFonts.GUI_BODY.get(), numberText, valueX, valueY, valueW, valueH,
                ColorProvider.setAlpha(ColorProvider.getColorText(), (int) (240 * alpha)), 6f);

        // Дорожка.
        DrawUtil.drawRound(trackX, trackY, trackW, TRACK_H, TRACK_H / 2f,
                ColorProvider.rgba(255, 255, 255, (int) (16 * alpha)));

        // Заполнение с градиентом акцента.
        if (fillWidth > 0.5f) {
            DrawUtil.drawRoundBlur(trackX, trackY, fillWidth, TRACK_H, TRACK_H / 2f,
                    ColorProvider.setAlpha(accent, (int) ((45 + 45 * hover) * alpha)), 5f);
            DrawUtil.drawRound(trackX, trackY, fillWidth, TRACK_H, TRACK_H / 2f,
                    ColorProvider.setAlpha(ColorProvider.lighten(accent, 0.18f), alphaInt),
                    ColorProvider.setAlpha(accent, alphaInt),
                    ColorProvider.setAlpha(ColorProvider.lighten(accent, 0.18f), alphaInt),
                    ColorProvider.setAlpha(accent, alphaInt));
        }

        // Ползунок: растёт при наведении и захвате.
        float knob = 6f + hover * 1.2f + dragging * 1.3f;
        float knobX = trackX + fillWidth - knob / 2f;
        float knobY = trackY + TRACK_H / 2f - knob / 2f;
        DrawUtil.drawRoundBlur(knobX, knobY + 0.5f, knob, knob, knob / 2f,
                ColorProvider.rgba(0, 0, 0, (int) (80 * alpha)), 4f);
        DrawUtil.drawRound(knobX, knobY, knob, knob, knob / 2f,
                ColorProvider.rgba(255, 255, 255, alphaInt));

        if (drag) {
            double val = (mouseX - trackX) / trackW * range + setting.getMin();
            setting.setValue((float) MathHelper.clamp(round(val, setting.getIncrement()),
                    setting.getMin(), setting.getMax()));
        }

        setHeight(ROW_H);
    }

    @Override
    public void mouseClicked(double mouseX, double mouseY, int button) {
        if (button == 0 && HoverUtil.isHovered(mouseX, mouseY, x + 2f, trackY() - 6f, width - 4f, 13f)) {
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

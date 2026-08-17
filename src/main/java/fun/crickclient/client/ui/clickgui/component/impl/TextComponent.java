package fun.crickclient.client.ui.clickgui.component.impl;

import fun.crickclient.client.modules.settings.implement.TextSetting;
import fun.crickclient.client.ui.clickgui.component.Component;
import fun.crickclient.client.ui.clickgui.util.ColorProvider;
import fun.crickclient.client.ui.clickgui.util.CursorManager;
import fun.crickclient.client.ui.clickgui.util.DrawUtil;
import fun.crickclient.client.ui.clickgui.util.GuiFonts;
import fun.crickclient.client.ui.clickgui.util.HoverUtil;
import fun.crickclient.client.ui.clickgui.util.Scissor;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.math.MatrixStack;
import org.lwjgl.glfw.GLFW;

/** Текстовое поле настройки (в старом клиенте такого типа настройки не было). */
public class TextComponent extends Component {
    private final TextSetting setting;
    private boolean focused;

    private static final float SETTING_HEIGHT = 28f;
    private static final float FIELD_H = 13f;
    private static final float PADDING = 4.5f;
    private static final float LABEL_H = 11f;
    private static final float RADIUS = 4f;

    public TextComponent(TextSetting setting) {
        this.setting = setting;
    }

    @Override
    public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks) {
        float alpha = Math.max(Math.min(getAlphaAnimSetting().getValue(), 1), 0)
                * Math.max(Math.min(getAlphaAnim().getValue(), 1), 0);
        int alphaInt = (int) (255 * alpha);

        if (alpha < 0.02f) return;

        float fieldX = x + PADDING;
        float fieldY = y + LABEL_H + 1f;
        float fieldW = width - PADDING * 2f;

        if (HoverUtil.isHovered(mouseX, mouseY, fieldX, fieldY, fieldW, FIELD_H)) {
            CursorManager.requestIBeam();
        }

        DrawUtil.drawText(GuiFonts.GUI_BODY.get(), setting.displayName(), fieldX + 1f,
                DrawUtil.centeredTextY(GuiFonts.GUI_BODY.get(), y, LABEL_H, 6.6f),
                ColorProvider.setAlpha(ColorProvider.getColorText(), (int) (240 * alpha)), 6.6f);

        DrawUtil.drawRound(fieldX, fieldY, fieldW, FIELD_H, RADIUS,
                ColorProvider.rgba(0, 0, 0, (int) (70 * alpha)));
        DrawUtil.drawRoundOutline(fieldX, fieldY, fieldW, FIELD_H, RADIUS, 0.9f,
                focused
                        ? ColorProvider.setAlpha(ColorProvider.getColorClient(), (int) (150 * alpha))
                        : ColorProvider.rgba(255, 255, 255, (int) (16 * alpha)));

        String text = setting.get() == null ? "" : setting.get();
        String shown = focused && (System.currentTimeMillis() / 500) % 2 == 0 ? text + "|" : text;

        Scissor.push();
        Scissor.setFromComponentCoordinates(fieldX + 1f, fieldY, fieldW - 2f, FIELD_H);
        DrawUtil.drawText(GuiFonts.GUI_BODY.get(), shown, fieldX + 4.5f,
                DrawUtil.centeredTextY(GuiFonts.GUI_BODY.get(), fieldY, FIELD_H, 6.4f),
                ColorProvider.setAlpha(text.isEmpty()
                        ? ColorProvider.getColorInactiveText()
                        : ColorProvider.getColorText(), alphaInt), 6.4f);
        Scissor.unset();
        Scissor.pop();

        setHeight(SETTING_HEIGHT);
    }

    @Override
    public void mouseClicked(double mouseX, double mouseY, int button) {
        float fieldX = x + PADDING;
        float fieldY = y + LABEL_H + 1f;
        float fieldW = width - PADDING * 2f;
        focused = button == 0 && HoverUtil.isHovered(mouseX, mouseY, fieldX, fieldY, fieldW, FIELD_H);
    }

    @Override
    public void keyPressed(int keyCode, int scanCode, int modifiers) {
        if (!focused) return;

        switch (keyCode) {
            case GLFW.GLFW_KEY_ESCAPE, GLFW.GLFW_KEY_ENTER, GLFW.GLFW_KEY_KP_ENTER -> focused = false;
            case GLFW.GLFW_KEY_BACKSPACE -> {
                String text = setting.get();
                if (text != null && !text.isEmpty()) {
                    setting.setText(text.substring(0, text.length() - 1));
                }
            }
            case GLFW.GLFW_KEY_V -> {
                if ((modifiers & GLFW.GLFW_MOD_CONTROL) != 0) {
                    String clip = MinecraftClient.getInstance().keyboard.getClipboard();
                    if (clip != null) setting.setText(setting.get() + clip);
                }
            }
            default -> {
            }
        }
    }

    @Override
    public void charTyped(char chr, int modifiers) {
        if (!focused || Character.isISOControl(chr)) return;
        setting.setText(setting.get() + chr);
    }

    public boolean isFocused() {
        return focused;
    }

    @Override
    public boolean isVisible() {
        return setting.visible.get();
    }
}

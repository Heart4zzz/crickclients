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

    private static final float SETTING_HEIGHT = 26f;
    private static final float FIELD_H = 12f;
    private static final float PADDING = 4.5f;

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
        float fieldY = y + 11f;
        float fieldW = width - PADDING * 2f;

        if (HoverUtil.isHovered(mouseX, mouseY, fieldX, fieldY, fieldW, FIELD_H)) {
            CursorManager.requestIBeam();
        }

        DrawUtil.drawText(GuiFonts.GUI_BODY.get(), setting.displayName(), fieldX, y + 1.5f,
                ColorProvider.setAlpha(ColorProvider.getColorText(), alphaInt), 7.5f);

        DrawUtil.drawRound(fieldX, fieldY, fieldW, FIELD_H, 3f,
                ColorProvider.setAlpha(focused ? ColorProvider.getColorInactiveField() : ColorProvider.getColorField(),
                        (int) (220 * alpha)));

        String text = setting.get() == null ? "" : setting.get();
        String shown = focused && (System.currentTimeMillis() / 500) % 2 == 0 ? text + "|" : text;

        Scissor.push();
        Scissor.setFromComponentCoordinates(fieldX + 1f, fieldY, fieldW - 2f, FIELD_H);
        DrawUtil.drawText(GuiFonts.GUI_BODY.get(), shown, fieldX + 3.5f, fieldY + 2f,
                ColorProvider.setAlpha(text.isEmpty()
                        ? ColorProvider.getColorInactiveText()
                        : ColorProvider.getColorText(), alphaInt), 7f);
        Scissor.unset();
        Scissor.pop();

        setHeight(SETTING_HEIGHT);
    }

    @Override
    public void mouseClicked(double mouseX, double mouseY, int button) {
        float fieldX = x + PADDING;
        float fieldY = y + 11f;
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

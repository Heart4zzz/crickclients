package fun.crickclient.client.ui.clickgui.component.impl;

import fun.crickclient.api.utils.input.KeyBoardUtils;
import fun.crickclient.client.modules.settings.implement.BindSetting;
import fun.crickclient.client.ui.clickgui.component.Component;
import fun.crickclient.client.ui.clickgui.util.ColorProvider;
import fun.crickclient.client.ui.clickgui.util.CursorManager;
import fun.crickclient.client.ui.clickgui.util.DrawUtil;
import fun.crickclient.client.ui.clickgui.util.GuiFonts;
import fun.crickclient.client.ui.clickgui.util.HoverUtil;
import net.minecraft.client.util.math.MatrixStack;
import org.lwjgl.glfw.GLFW;

public class BindComponent extends Component {
    private final BindSetting setting;
    private boolean binding;

    private static final float SETTING_HEIGHT = 14f;
    private static final float BIND_H = 10f;
    private static final float PADDING = 4.5f;
    private static final float RADIUS = 1f;

    public BindComponent(BindSetting setting) {
        this.setting = setting;
    }

    private String getKeyText() {
        if (binding) return "...";
        return setting.getKey() == -1 ? "None" : KeyBoardUtils.getBindName(setting.getKey());
    }

    @Override
    public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks) {
        float alpha = Math.max(Math.min(getAlphaAnimSetting().getValue(), 1), 0)
                * Math.max(Math.min(getAlphaAnim().getValue(), 1), 0);
        int alphaInt = (int) (255 * alpha);

        if (alpha < 0.02f) return;

        String keyText = getKeyText();
        float keyTextW = GuiFonts.GUI_BODY.get().getWidth(keyText, 6.5f);
        float bindBoxW = Math.max(16f, keyTextW + 8f);
        float bindX = x + width - bindBoxW - PADDING;
        float bindY = y + (SETTING_HEIGHT - BIND_H) / 2f;

        if (HoverUtil.isHovered(mouseX, mouseY, bindX, bindY, bindBoxW, BIND_H)) {
            CursorManager.requestHand();
        }

        DrawUtil.drawText(GuiFonts.GUI_BODY.get(), setting.displayName(), x + PADDING, y + 3.5f,
                ColorProvider.setAlpha(ColorProvider.getColorText(), alphaInt), 7.5f);

        boolean hasBind = setting.getKey() != -1;
        int bgColor;
        if (binding) {
            bgColor = ColorProvider.setAlpha(ColorProvider.getColorButton(), (int) (35 * alpha));
        } else if (hasBind) {
            bgColor = ColorProvider.setAlpha(ColorProvider.getColorButton(), (int) (80 * alpha));
        } else {
            bgColor = ColorProvider.setAlpha(ColorProvider.getColorInactiveButton(), (int) (80 * alpha));
        }
        DrawUtil.drawRound(bindX, bindY, bindBoxW, BIND_H, RADIUS, bgColor);

        int textColor = (binding || hasBind)
                ? ColorProvider.setAlpha(ColorProvider.getColorText(), alphaInt)
                : ColorProvider.setAlpha(ColorProvider.getColorInactiveText(), alphaInt);
        float keyX = bindX + (bindBoxW - keyTextW) / 2f;
        DrawUtil.drawText(GuiFonts.GUI_BODY.get(), keyText, keyX, bindY + 1.25f, textColor, 7.5f);

        setHeight(SETTING_HEIGHT);
    }

    @Override
    public void mouseClicked(double mouseX, double mouseY, int button) {
        String keyText = getKeyText();
        float keyTextW = GuiFonts.GUI_BODY.get().getWidth(keyText, 7.5f);
        float bindBoxW = Math.max(16f, keyTextW + 8f);
        float bindX = x + width - bindBoxW - PADDING;
        float bindY = y + (SETTING_HEIGHT - BIND_H) / 2f;

        if (binding) {
            if (button != 0) setting.setKey(KeyBoardUtils.createMouseBind(button));
            binding = false;
        } else if (HoverUtil.isHovered(mouseX, mouseY, bindX, bindY, bindBoxW, BIND_H) && button == 0) {
            binding = true;
        }
    }

    @Override
    public void keyPressed(int keyCode, int scanCode, int modifiers) {
        if (binding) {
            if (keyCode == GLFW.GLFW_KEY_ESCAPE || keyCode == GLFW.GLFW_KEY_DELETE) {
                setting.setKey(-1);
            } else {
                setting.setKey(keyCode);
            }
            binding = false;
        }
    }

    public boolean isBinding() {
        return binding;
    }

    @Override
    public boolean isVisible() {
        return setting.visible.get();
    }
}

package fun.crickclient.client.ui.clickgui.component.impl;

import fun.crickclient.api.utils.input.KeyBoardUtils;
import fun.crickclient.client.modules.settings.implement.BindSetting;
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

public class BindComponent extends Component {
    private final BindSetting setting;
    private boolean binding;

    private static final float ROW_H = 17f;
    private static final float BIND_H = 11f;
    private static final float PADDING = 4.5f;
    private static final float RADIUS = 3.5f;
    private static final float FONT_SIZE = 6.2f;

    private final Animation hoverAnim = new Animation(Easing.QUINTIC_OUT, 170);

    public BindComponent(BindSetting setting) {
        this.setting = setting;
    }

    private String getKeyText() {
        if (binding) return "...";
        return setting.getKey() == -1 ? "None" : KeyBoardUtils.getBindName(setting.getKey());
    }

    private float bindBoxWidth() {
        return Math.max(24f, GuiFonts.GUI_BODY.get().getWidth(getKeyText(), FONT_SIZE) + 11f);
    }

    private float bindX() {
        return x + width - bindBoxWidth() - PADDING;
    }

    private float bindY() {
        return y + (ROW_H - BIND_H) / 2f;
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
        String keyText = getKeyText();
        float bindBoxW = bindBoxWidth();
        float bindX = bindX();
        float bindY = bindY();

        boolean hovered = HoverUtil.isHovered(mouseX, mouseY, bindX, bindY, bindBoxW, BIND_H);
        if (hovered) CursorManager.requestHand();
        float hover = MathHelper.clamp(hoverAnim.run(hovered ? 1f : 0f), 0f, 1f);

        DrawUtil.drawText(GuiFonts.GUI_BODY.get(), setting.displayName(),
                x + PADDING + 1f, DrawUtil.centeredTextY(GuiFonts.GUI_BODY.get(), y, ROW_H, 6.6f),
                ColorProvider.setAlpha(ColorProvider.getColorText(), alphaInt), 6.6f,
                0.4f, 1f, width - bindBoxW - PADDING * 2f - 6f);

        boolean hasBind = setting.getKey() != -1;

        // В режиме назначения бейдж «дышит» акцентом — понятно, что клиент ждёт клавишу.
        if (binding) {
            float pulse = 0.5f + 0.5f * (float) Math.sin(System.currentTimeMillis() / 260.0);
            DrawUtil.drawRoundBlur(bindX, bindY, bindBoxW, BIND_H, RADIUS,
                    ColorProvider.setAlpha(accent, (int) ((40 + 55 * pulse) * alpha)), 6f);
            DrawUtil.drawRound(bindX, bindY, bindBoxW, BIND_H, RADIUS,
                    ColorProvider.setAlpha(accent, (int) ((70 + 45 * pulse) * alpha)));
            DrawUtil.drawRoundOutline(bindX, bindY, bindBoxW, BIND_H, RADIUS, 0.9f,
                    ColorProvider.setAlpha(accent, (int) (200 * alpha)));
        } else if (hasBind) {
            DrawUtil.drawRound(bindX, bindY, bindBoxW, BIND_H, RADIUS,
                    ColorProvider.setAlpha(accent, (int) ((55 + 30 * hover) * alpha)));
            DrawUtil.drawRoundOutline(bindX, bindY, bindBoxW, BIND_H, RADIUS, 0.8f,
                    ColorProvider.setAlpha(accent, (int) ((110 + 60 * hover) * alpha)));
        } else {
            DrawUtil.drawRound(bindX, bindY, bindBoxW, BIND_H, RADIUS,
                    ColorProvider.rgba(255, 255, 255, (int) ((10 + 12 * hover) * alpha)));
            DrawUtil.drawRoundOutline(bindX, bindY, bindBoxW, BIND_H, RADIUS, 0.8f,
                    ColorProvider.rgba(255, 255, 255, (int) ((14 + 14 * hover) * alpha)));
        }

        int textColor = (binding || hasBind)
                ? ColorProvider.setAlpha(ColorProvider.getColorText(), alphaInt)
                : ColorProvider.setAlpha(ColorProvider.getColorInactiveText(), alphaInt);
        DrawUtil.drawTextCentered(GuiFonts.GUI_BODY.get(), keyText, bindX, bindY, bindBoxW, BIND_H,
                textColor, FONT_SIZE);

        setHeight(ROW_H);
    }

    @Override
    public void mouseClicked(double mouseX, double mouseY, int button) {
        if (binding) {
            if (button != 0) setting.setKey(KeyBoardUtils.createMouseBind(button));
            binding = false;
        } else if (button == 0
                && HoverUtil.isHovered(mouseX, mouseY, bindX(), bindY(), bindBoxWidth(), BIND_H)) {
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

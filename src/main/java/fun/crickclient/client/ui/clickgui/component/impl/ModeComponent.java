package fun.crickclient.client.ui.clickgui.component.impl;

import fun.crickclient.client.modules.settings.implement.ModeSetting;
import fun.crickclient.client.ui.clickgui.component.Component;
import fun.crickclient.client.ui.clickgui.util.Animation;
import fun.crickclient.client.ui.clickgui.util.ColorProvider;
import fun.crickclient.client.ui.clickgui.util.CursorManager;
import fun.crickclient.client.ui.clickgui.util.DrawUtil;
import fun.crickclient.client.ui.clickgui.util.Easing;
import fun.crickclient.client.ui.clickgui.util.GuiFonts;
import fun.crickclient.client.ui.clickgui.util.HoverUtil;
import net.minecraft.client.util.math.MatrixStack;

import java.util.ArrayList;
import java.util.List;

public class ModeComponent extends Component {
    private final ModeSetting setting;
    private static final float NAME_HEIGHT = 10f;
    private static final float OPTION_H = 12f;
    private static final float GAP = 3f;
    private static final float PADDING = 4.5f;
    private static final float RADIUS = 4f;

    private final List<Animation> anims = new ArrayList<>();

    public ModeComponent(ModeSetting setting) {
        this.setting = setting;
        for (int i = 0; i < setting.getMods().size(); i++) {
            anims.add(new Animation(Easing.QUINTIC_OUT, 250));
        }
    }

    private String label(String mode) {
        return setting.displayMode(mode);
    }

    private float optionWidth(String mode) {
        return GuiFonts.GUI_BODY.get().getWidth(label(mode), 7.5f) + 8f;
    }

    private float calcHeight() {
        float maxRowWidth = width - PADDING * 2;
        float rowWidth = 0;
        float totalHeight = NAME_HEIGHT + GAP;
        boolean firstInRow = true;

        for (String mode : setting.getMods()) {
            float ow = optionWidth(mode);
            if (!firstInRow && rowWidth + ow > maxRowWidth) {
                totalHeight += OPTION_H + GAP;
                rowWidth = ow + GAP;
            } else {
                rowWidth += ow + GAP;
                firstInRow = false;
            }
        }
        totalHeight += OPTION_H;
        return totalHeight;
    }

    @Override
    public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks) {
        float animValue = getAlphaAnimSetting().getValue();
        float alpha = Math.max(Math.min(animValue * getAlphaAnim().getValue(), 1), 0);
        int alphaInt = (int) (255 * alpha);

        if (alpha < 0.02f) return;

        float totalHeight = calcHeight();
        setHeight((totalHeight + 2f) * animValue);

        DrawUtil.drawText(GuiFonts.GUI_BODY.get(), setting.displayName(), x + PADDING, y + 1.5f,
                ColorProvider.setAlpha(ColorProvider.getColorText(), alphaInt), 7.5f);

        float curX = x + PADDING;
        float curY = y + NAME_HEIGHT + GAP;
        boolean firstInRow = true;
        int i = 0;

        for (String mode : setting.getMods()) {
            float ow = optionWidth(mode);
            if (!firstInRow && curX + ow > x + width - PADDING) {
                curX = x + PADDING;
                curY += OPTION_H + GAP;
            }
            firstInRow = false;

            boolean selected = setting.is(mode);
            Animation anim = anims.get(Math.min(i, anims.size() - 1));
            anim.run(selected);
            float av = anim.getValue();

            if (HoverUtil.isHovered(mouseX, mouseY, curX, curY, ow, OPTION_H)) {
                CursorManager.requestHand();
            }

            // Glow border for selected mode
            if (av > 0.05f) {
                DrawUtil.drawRound(curX - 1f, curY - 1f, ow + 2f, OPTION_H + 2f, RADIUS + 1f,
                        ColorProvider.setAlpha(ColorProvider.getColorClient(), (int) (60 * av * alpha)));
            }

            // Hover highlight for unselected
            boolean hovered = HoverUtil.isHovered(mouseX, mouseY, curX, curY, ow, OPTION_H);
            int bgColor;
            if (selected) {
                bgColor = ColorProvider.setAlpha(ColorProvider.getColorButton(), alphaInt);
            } else if (hovered) {
                bgColor = ColorProvider.interpolateColor(
                        ColorProvider.setAlpha(ColorProvider.getColorInactiveButton(), alphaInt),
                        ColorProvider.setAlpha(ColorProvider.getColorButton(), (int) (45 * alpha)),
                        0.5f);
            } else {
                bgColor = ColorProvider.setAlpha(ColorProvider.getColorInactiveButton(), alphaInt);
            }
            DrawUtil.drawRound(curX, curY, ow, OPTION_H, RADIUS, bgColor);

            int textColor = ColorProvider.interpolateColor(
                    ColorProvider.setAlpha(ColorProvider.getColorInactiveText(), alphaInt),
                    ColorProvider.setAlpha(ColorProvider.getColorText(), alphaInt),
                    av);
            String text = label(mode);
            float tw = GuiFonts.GUI_BODY.get().getWidth(text, 7.5f);
            DrawUtil.drawText(GuiFonts.GUI_BODY.get(), text,
                    curX + (ow - tw) / 2f,
                    curY + (OPTION_H - 7.5f) / 2f - 0.5f,
                    textColor, 7.5f);

            curX += ow + GAP;
            i++;
        }
    }

    @Override
    public void mouseClicked(double mouseX, double mouseY, int button) {
        if (button != 0) return;

        float curX = x + PADDING;
        float curY = y + NAME_HEIGHT + GAP;
        boolean firstInRow = true;

        for (String mode : setting.getMods()) {
            float ow = optionWidth(mode);
            if (!firstInRow && curX + ow > x + width - PADDING) {
                curX = x + PADDING;
                curY += OPTION_H + GAP;
            }
            firstInRow = false;

            if (HoverUtil.isHovered(mouseX, mouseY, curX, curY, ow, OPTION_H)) {
                setting.set(mode);
                return;
            }
            curX += ow + GAP;
        }
    }

    @Override
    public boolean isVisible() {
        return setting.visible.get();
    }
}

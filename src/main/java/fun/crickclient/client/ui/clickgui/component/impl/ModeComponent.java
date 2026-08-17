package fun.crickclient.client.ui.clickgui.component.impl;

import fun.crickclient.client.modules.settings.implement.ModeSetting;
import fun.crickclient.client.ui.clickgui.ClickGuiStyles;
import fun.crickclient.client.ui.clickgui.component.Component;
import fun.crickclient.client.ui.clickgui.util.Animation;
import fun.crickclient.client.ui.clickgui.util.CursorManager;
import fun.crickclient.client.ui.clickgui.util.Easing;
import fun.crickclient.client.ui.clickgui.util.GuiFonts;
import fun.crickclient.client.ui.clickgui.util.HoverUtil;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;

import java.util.ArrayList;
import java.util.List;

/** Выбор одного режима из списка: ряд «чипов», подсвечивается выбранный. */
public class ModeComponent extends Component {
    private final ModeSetting setting;

    private static final float NAME_HEIGHT = 11f;
    private static final float OPTION_H = 13f;
    private static final float GAP = 3f;
    private static final float PADDING = 4.5f;
    private static final float FONT_SIZE = 6.4f;

    private final List<Animation> anims = new ArrayList<>();
    private final List<Animation> hoverAnims = new ArrayList<>();

    public ModeComponent(ModeSetting setting) {
        this.setting = setting;
        for (int i = 0; i < setting.getMods().size(); i++) {
            anims.add(new Animation(Easing.QUINTIC_OUT, 250));
            hoverAnims.add(new Animation(Easing.QUINTIC_OUT, 170));
        }
    }

    private String label(String mode) {
        return setting.displayMode(mode);
    }

    private float optionWidth(String mode) {
        return GuiFonts.GUI_BODY.get().getWidth(label(mode), FONT_SIZE) + 12f;
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
        float alpha = MathHelper.clamp(animValue * getAlphaAnim().getValue(), 0f, 1f);

        if (alpha < 0.02f) return;

        float totalHeight = calcHeight();
        setHeight((totalHeight + 4f) * animValue);

        ClickGuiStyles.drawSettingLabel(setting.displayName(), x + PADDING, y, NAME_HEIGHT, alpha, 6.6f);

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

            boolean hovered = HoverUtil.isHovered(mouseX, mouseY, curX, curY, ow, OPTION_H);
            if (hovered) CursorManager.requestHand();

            int index = Math.min(i, anims.size() - 1);
            float selected = MathHelper.clamp(anims.get(index).run(setting.is(mode) ? 1f : 0f), 0f, 1f);
            float hover = MathHelper.clamp(hoverAnims.get(index).run(hovered ? 1f : 0f), 0f, 1f);

            ClickGuiStyles.drawChip(label(mode), curX, curY, ow, OPTION_H, alpha, selected, hover, FONT_SIZE);

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

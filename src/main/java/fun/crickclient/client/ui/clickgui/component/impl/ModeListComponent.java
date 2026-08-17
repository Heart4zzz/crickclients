package fun.crickclient.client.ui.clickgui.component.impl;

import fun.crickclient.client.modules.settings.implement.BooleanSetting;
import fun.crickclient.client.modules.settings.implement.ListSetting;
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

/** Множественный выбор: ряд «чипов», подсвечиваются все включённые. */
public class ModeListComponent extends Component {
    private final ListSetting setting;

    private static final float NAME_HEIGHT = 11f;
    private static final float OPTION_H = 13f;
    private static final float GAP = 3f;
    private static final float PADDING = 4.5f;
    private static final float FONT_SIZE = 6.4f;

    private final List<Animation> anims = new ArrayList<>();
    private final List<Animation> hoverAnims = new ArrayList<>();

    public ModeListComponent(ListSetting setting) {
        this.setting = setting;
        for (int i = 0; i < setting.getSettings().size(); i++) {
            anims.add(new Animation(Easing.QUINTIC_OUT, 250));
            hoverAnims.add(new Animation(Easing.QUINTIC_OUT, 170));
        }
    }

    private float optionWidth(String name) {
        return GuiFonts.GUI_BODY.get().getWidth(name, FONT_SIZE) + 12f;
    }

    private float calcHeight() {
        float maxRowWidth = width - PADDING * 2;
        float rowWidth = 0;
        float totalHeight = NAME_HEIGHT + GAP;
        boolean firstInRow = true;

        for (BooleanSetting s : setting.getSettings()) {
            float ow = optionWidth(s.displayName());
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

        for (BooleanSetting s : setting.getSettings()) {
            String name = s.displayName();
            float ow = optionWidth(name);
            if (!firstInRow && curX + ow > x + width - PADDING) {
                curX = x + PADDING;
                curY += OPTION_H + GAP;
            }
            firstInRow = false;

            boolean hovered = HoverUtil.isHovered(mouseX, mouseY, curX, curY, ow, OPTION_H);
            if (hovered) CursorManager.requestHand();

            int index = Math.min(i, anims.size() - 1);
            float selected = MathHelper.clamp(anims.get(index).run(s.isState() ? 1f : 0f), 0f, 1f);
            float hover = MathHelper.clamp(hoverAnims.get(index).run(hovered ? 1f : 0f), 0f, 1f);

            ClickGuiStyles.drawChip(name, curX, curY, ow, OPTION_H, alpha, selected, hover, FONT_SIZE);

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

        for (BooleanSetting s : setting.getSettings()) {
            float ow = optionWidth(s.displayName());
            if (!firstInRow && curX + ow > x + width - PADDING) {
                curX = x + PADDING;
                curY += OPTION_H + GAP;
            }
            firstInRow = false;

            if (HoverUtil.isHovered(mouseX, mouseY, curX, curY, ow, OPTION_H)) {
                s.setState(!s.isState());
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

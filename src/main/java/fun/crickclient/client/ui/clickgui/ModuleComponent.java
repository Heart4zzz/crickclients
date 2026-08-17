package fun.crickclient.client.ui.clickgui;

import fun.crickclient.api.utils.input.KeyBoardUtils;
import fun.crickclient.client.modules.Module;
import fun.crickclient.client.modules.settings.Setting;
import fun.crickclient.client.modules.settings.implement.BindSetting;
import fun.crickclient.client.modules.settings.implement.BooleanSetting;
import fun.crickclient.client.modules.settings.implement.FloatSetting;
import fun.crickclient.client.modules.settings.implement.ListSetting;
import fun.crickclient.client.modules.settings.implement.ModeSetting;
import fun.crickclient.client.modules.settings.implement.TextSetting;
import fun.crickclient.client.ui.clickgui.component.Component;
import fun.crickclient.client.ui.clickgui.component.impl.BindComponent;
import fun.crickclient.client.ui.clickgui.component.impl.BooleanComponent;
import fun.crickclient.client.ui.clickgui.component.impl.ModeComponent;
import fun.crickclient.client.ui.clickgui.component.impl.ModeListComponent;
import fun.crickclient.client.ui.clickgui.component.impl.SliderComponent;
import fun.crickclient.client.ui.clickgui.component.impl.TextComponent;
import fun.crickclient.client.ui.clickgui.util.Animation;
import fun.crickclient.client.ui.clickgui.util.ColorProvider;
import fun.crickclient.client.ui.clickgui.util.CursorManager;
import fun.crickclient.client.ui.clickgui.util.DrawUtil;
import fun.crickclient.client.ui.clickgui.util.Easing;
import fun.crickclient.client.ui.clickgui.util.GuiFonts;
import fun.crickclient.client.ui.clickgui.util.HoverUtil;
import fun.crickclient.client.ui.clickgui.util.Scissor;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import lombok.Getter;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.glfw.GLFW;

@Getter
public class ModuleComponent extends Component {
    private final Module module;
    private final Panel panel;

    private final Animation animation = new Animation(Easing.QUINTIC_OUT, 320);
    private final Animation hoverAnim = new Animation(Easing.QUINTIC_OUT, 220);
    private final Animation enabledAnim = new Animation(Easing.QUINTIC_OUT, 350);
    private final Animation chevronAnim = new Animation(Easing.QUINTIC_OUT, 240);

    public boolean open;
    private boolean isHovered;
    private boolean binding;

    private final ObjectArrayList<Component> components = new ObjectArrayList<>();

    public ModuleComponent(Module module, Panel panel) {
        this.module = module;
        this.panel = panel;
        for (Setting setting : module.getSettings()) {
            switch (setting) {
                case BooleanSetting option -> components.add(new BooleanComponent(option));
                case ModeSetting option -> components.add(new ModeComponent(option));
                case ListSetting option -> components.add(new ModeListComponent(option));
                case FloatSetting option -> components.add(new SliderComponent(option));
                case BindSetting option -> components.add(new BindComponent(option));
                case TextSetting option -> components.add(new TextComponent(option));
                default -> {
                }
            }
        }
    }

    /** Описание модуля: у модулей без описания в этом клиенте стоит «NULLABLE». */
    public String description() {
        String desc = module.getDisplayDescription();
        return desc == null || desc.isEmpty() || "NULLABLE".equals(desc) ? "" : desc;
    }

    public float getHeaderHeight() {
        return ClickGuiStyles.moduleHeaderHeight(description());
    }

    @Override
    public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks) {
        float headerH = getHeaderHeight();
        isHovered = HoverUtil.isHovered(mouseX, mouseY, x, y, width, headerH);

        hoverAnim.run(isHovered);
        animation.run(open);
        enabledAnim.run(module.isEnable());
        chevronAnim.run(open);

        if (isHovered) CursorManager.requestHand();

        float alpha = Math.max(Math.min(panel.getAnimationAlpha().getValue(), 1), 0);
        float enabled = enabledAnim.getValue();
        float hover = hoverAnim.getValue();

        float currentHeight = headerH + (height - headerH) * animation.getValue();

        float visTop = panel.getContentTop();
        float visBottom = panel.getContentBottom();
        if (y + currentHeight < visTop || y > visBottom) {
            isHovered = false;
            return;
        }

        ClickGuiStyles.drawModuleCard(x, y, width, currentHeight - 0.5f, headerH, alpha, enabled, hover, open);

        if (binding) {
            DrawUtil.drawText(GuiFonts.GUI_BODY.get(), "Press key...",
                    x + width / 2f - GuiFonts.GUI_BODY.get().getWidth("Press key...", 6.5f) / 2f,
                    y + headerH / 2f - 3f, ColorProvider.rgba(255, 255, 255, (int) (255 * alpha)), 6.5f);
        } else {
            renderRowContent(alpha, enabled, headerH);
        }

        if (animation.getValue() > 0.01f) {
            renderSettings(mouseX, mouseY, partialTicks, alpha, currentHeight, headerH);
        }
    }

    private void renderRowContent(float alpha, float enabled, float headerH) {
        float padX = 8f;
        float titleY = y + 6f;
        float right = x + width - 6f;

        float toggleW = ClickGuiStyles.TOGGLE_W;
        float toggleX = right - toggleW;
        float toggleY = y + 7f;
        right = toggleX - 3f;

        if (!components.isEmpty()) right -= 8f;
        if (module.getKey() != -1) {
            right -= GuiFonts.GUI_BODY.get().getWidth(KeyBoardUtils.getBindName(module.getKey()), 5.5f) + 10f;
        }

        float maxTextW = Math.max(36f, right - (x + padX));
        ClickGuiStyles.drawModuleTitle(module.getDisplayName(), x + padX, titleY, maxTextW, alpha, enabled);

        String desc = description();
        if (!desc.isEmpty()) {
            float descMaxW = width - padX * 2f;
            ClickGuiStyles.drawModuleDesc(desc, x + padX, titleY + 9f, descMaxW, alpha);
        }

        ClickGuiStyles.drawToggle(toggleX, toggleY, alpha, enabled);
        right = toggleX - 3f;

        if (!components.isEmpty()) {
            String chevron = open ? "^" : "v";
            float chevronW = GuiFonts.GUI_BODY.get().getWidth(chevron, 6f);
            DrawUtil.drawText(GuiFonts.GUI_BODY.get(), chevron, right - chevronW, titleY + 1f,
                    ColorProvider.setAlpha(ColorProvider.getColorInactiveText(), (int) (180 * alpha)), 6f);
            right -= chevronW + 3f;
        }

        if (module.getKey() != -1) {
            String key = KeyBoardUtils.getBindName(module.getKey());
            float keyW = GuiFonts.GUI_BODY.get().getWidth(key, 5.5f);
            float keyBoxW = keyW + 8f;
            float keyX = right - keyBoxW;
            DrawUtil.drawRound(keyX, y + 8f, keyBoxW, 10f, 3f, ColorProvider.rgba(255, 255, 255, (int) (10 * alpha)));
            DrawUtil.drawText(GuiFonts.GUI_BODY.get(), key, keyX + 4f, y + 9.5f,
                    ColorProvider.setAlpha(ColorProvider.getColorInactiveText(), (int) (190 * alpha)), 5.5f);
        }
    }

    private void renderSettings(int mouseX, int mouseY, float partialTicks,
                                float alpha, float currentHeight, float headerH) {
        float compY = y + headerH + 3f;
        float panelTop = panel.getContentTop();
        float panelBottom = panel.getContentBottom();
        float intersectY = Math.max(y + headerH, panelTop);
        float intersectBottom = Math.min(y + currentHeight, panelBottom);
        float intersectHeight = Math.max(0, intersectBottom - intersectY);

        DrawUtil.drawRound(x + 8f, y + headerH, width - 16f, 0.5f, 0.25f,
                ColorProvider.setAlpha(ColorProvider.getColorClient(), (int) (30 * alpha * animation.getValue())));

        for (Component component : components) {
            component.getAlphaAnim().setValue(Math.min(panel.getAnimationAlpha().getValue(), 1) * animation.getValue());
            component.getAlphaAnimSetting().run(component.isVisible());

            float visibleProgress = MathHelper.clamp(component.getAlphaAnimSetting().getValue(), 0f, 1f);
            if (component.isVisible() || visibleProgress > 0) {
                component.setX(x + 2f);
                component.setY(compY);
                component.setWidth(width - 4f);

                Scissor.push();
                Scissor.setFromComponentCoordinates(x, intersectY, width, intersectHeight);
                component.render(DrawUtil.matrices(), mouseX, mouseY, partialTicks);
                Scissor.unset();
                Scissor.pop();

                compY += component.getHeight() * visibleProgress;
            }
        }
    }

    public void render(DrawContext context, int mouseX, int mouseY, float partialTicks) {
        render(DrawUtil.matrices(), mouseX, mouseY, partialTicks);
    }

    @Override
    public void mouseClicked(double mouseX, double mouseY, int button) {
        if (isHovered(mouseX, mouseY, getHeaderHeight())) {
            if (button == 0) module.setEnabled(!module.isEnable());
            if (button == 1 && !components.isEmpty()) open = !open;
            if (button == 2) binding = !binding;
        }

        if (open) {
            for (Component component : components) {
                if (component.isVisible() && component.getAlphaAnimSetting().getValue() > 0.5f) {
                    component.mouseClicked(mouseX, mouseY, button);
                }
            }
        }
    }

    @Override
    public void mouseReleased(double mouseX, double mouseY, int button) {
        if (open) {
            for (Component component : components) {
                component.mouseReleased(mouseX, mouseY, button);
            }
        }
    }

    @Override
    public void keyPressed(int keyCode, int scanCode, int modifiers) {
        if (binding) {
            if (keyCode == GLFW.GLFW_KEY_ESCAPE || keyCode == GLFW.GLFW_KEY_DELETE) {
                module.setKey(-1);
            } else {
                module.setKey(keyCode);
            }
            binding = false;
            return;
        }

        if (open) {
            for (Component component : components) {
                component.keyPressed(keyCode, scanCode, modifiers);
            }
        }
    }

    @Override
    public void charTyped(char chr, int modifiers) {
        if (!open) return;
        for (Component component : components) {
            component.charTyped(chr, modifiers);
        }
    }

    /** Ловит ли какой-нибудь текстовый компонент ввод с клавиатуры. */
    public boolean isTextFocused() {
        for (Component component : components) {
            if (component instanceof TextComponent text && text.isFocused()) return true;
            if (component instanceof BindComponent bind && bind.isBinding()) return true;
        }
        return false;
    }

    public boolean isBinding() {
        return binding;
    }

    private boolean isHovered(double mouseX, double mouseY, float heightCheck) {
        return HoverUtil.isHovered(mouseX, mouseY, x, y, width, heightCheck);
    }
}

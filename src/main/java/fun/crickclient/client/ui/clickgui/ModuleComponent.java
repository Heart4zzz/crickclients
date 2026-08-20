package fun.crickclient.client.ui.clickgui;

import fun.crickclient.api.storages.implement.ConfigStorage;
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
            DrawUtil.drawTextCentered(GuiFonts.GUI_BODY.get(), "Press key...", x, y, width, headerH,
                    ColorProvider.setAlpha(ColorProvider.getColorClient(), (int) (255 * alpha)), 6.5f);
        } else {
            renderRowContent(alpha, enabled, headerH);
        }

        if (animation.getValue() > 0.01f) {
            renderSettings(mouseX, mouseY, partialTicks, alpha, currentHeight, headerH);
        }
    }

    private void renderRowContent(float alpha, float enabled, float headerH) {
        float padX = 9f;
        String desc = description();
        boolean hasDesc = !desc.isEmpty();

        // Полоса, по которой центрируются все элементы шапки. Если описание есть,
        // элементы управления центрируются по строке заголовка, а не по всей шапке.
        float rowH = hasDesc ? 19f : headerH;
        float rowY = y;

        float right = x + width - padX;

        // Тумблер справа, строго по центру строки.
        float toggleW = ClickGuiStyles.TOGGLE_W;
        float toggleX = right - toggleW;
        float toggleY = rowY + (rowH - ClickGuiStyles.TOGGLE_H) / 2f;
        ClickGuiStyles.drawToggle(toggleX, toggleY, alpha, enabled);
        right = toggleX - 5f;

        // Шеврон раскрытия настроек.
        if (!components.isEmpty()) {
            String chevron = open ? "^" : "v";
            float chevronW = GuiFonts.GUI_BODY.get().getWidth(chevron, 6f);
            int chevronColor = ColorProvider.setAlpha(ColorProvider.getColorInactiveText(),
                    (int) ((150 + 80 * chevronAnim.getValue()) * alpha));
            // «^» рисуется выше базовой линии, поэтому центрируем его вручную.
            float chevronY = rowY + rowH / 2f - (open ? 5.2f : 3.4f);
            DrawUtil.drawText(GuiFonts.GUI_BODY.get(), chevron, right - chevronW, chevronY, chevronColor, 6f);
            right -= chevronW + 5f;
        }

        // Бейдж бинда.
        if (module.getKey() != -1) {
            String key = KeyBoardUtils.getBindName(module.getKey());
            float keyW = GuiFonts.GUI_BODY.get().getWidth(key, 5.5f);
            float keyBoxW = keyW + 9f;
            float keyBoxH = 11f;
            float keyX = right - keyBoxW;
            float keyY = rowY + (rowH - keyBoxH) / 2f;

            DrawUtil.drawRound(keyX, keyY, keyBoxW, keyBoxH, 3.5f,
                    ColorProvider.rgba(255, 255, 255, (int) (11 * alpha)));
            DrawUtil.drawRoundOutline(keyX, keyY, keyBoxW, keyBoxH, 3.5f, 0.8f,
                    ColorProvider.rgba(255, 255, 255, (int) (14 * alpha)));
            DrawUtil.drawTextCentered(GuiFonts.GUI_BODY.get(), key, keyX, keyY, keyBoxW, keyBoxH,
                    ColorProvider.setAlpha(ColorProvider.getColorInactiveText(), (int) (200 * alpha)), 5.5f);
            right = keyX - 5f;
        }

        float maxTextW = Math.max(36f, right - (x + padX));

        if (hasDesc) {
            // Заголовок и описание — единый блок, отцентрованный по высоте шапки.
            float blockH = 17f;
            float blockY = y + (headerH - blockH) / 2f;
            ClickGuiStyles.drawModuleTitle(module.getDisplayName(), x + padX, blockY, maxTextW, alpha, enabled);
            ClickGuiStyles.drawModuleDesc(desc, x + padX, blockY + 9.5f, width - padX * 2f, alpha);
        } else {
            float titleY = DrawUtil.centeredTextY(GuiFonts.GUI_TITLE.get(), rowY, rowH, 7.2f);
            ClickGuiStyles.drawModuleTitle(module.getDisplayName(), x + padX, titleY, maxTextW, alpha, enabled);
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

        // Тонкий нейтральный разделитель между шапкой и настройками.
        float sepAlpha = alpha * animation.getValue();
        DrawUtil.drawRound(x + 8f, y + headerH, width - 16f, 0.8f, 0.4f,
                ColorProvider.rgba(255, 255, 255, (int) (14 * sepAlpha)));

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
            ConfigStorage.saveCurrent();
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

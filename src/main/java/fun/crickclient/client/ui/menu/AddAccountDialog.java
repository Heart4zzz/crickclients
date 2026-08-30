package fun.crickclient.client.ui.menu;

import fun.crickclient.CrickClient;
import fun.crickclient.api.storages.implement.AccountStorage;
import fun.crickclient.api.utils.client.ClientAccount;
import fun.crickclient.api.utils.client.NicknameGenerator;
import fun.crickclient.api.utils.color.ColorUtils;
import fun.crickclient.client.ui.clickgui.util.Animation;
import fun.crickclient.client.ui.clickgui.util.DrawUtil;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.glfw.GLFW;

/**
 * Модальное окно Alt Manager: добавление аккаунта, переименование и
 * подтверждение удаления. Один компонент — три режима.
 * <p>
 * Анимация: fade + scale 0.98 → 1.0 ({@link MenuMotion#MODAL_MS}).
 */
public class AddAccountDialog {

    public enum Mode {
        ADD,
        RENAME,
        REMOVE
    }

    private final NicknameField field = new NicknameField();

    private final Animation openAnim = new Animation(MenuMotion.MODAL_EASING, MenuMotion.MODAL_MS);
    private final Animation generateHover = MenuMotion.hover();
    private final Animation confirmHover = MenuMotion.hover();
    private final Animation cancelHover = MenuMotion.hover();

    private Mode mode = Mode.ADD;
    private ClientAccount target;
    private Runnable onClose;
    private boolean open;

    // Кроссфейд текста при генерации ника.
    private boolean swapping;
    private long swapStart;
    private String swapOldText = "";

    // Клавиатурная навигация внутри диалога: 0 = поле, 1 = Generate, 2 = Add/Rename, 3 = Cancel.
    private int focusIndex = 0;

    // Позиции панели (последняя компоновка).
    private float panelX, panelY, panelW, panelH;
    private float fieldX, fieldY, fieldW, fieldH;
    private float generateX, generateY, generateW, generateH;
    private float confirmX, confirmY, confirmW, confirmH;
    private float cancelX, cancelY, cancelW, cancelH;
    private float hintY;

    private static final float GENERATE_W = 84f;
    private static final float BUTTON_W = 92f;
    private static final float BUTTON_H = 28f;

    public boolean isOpen() {
        return open;
    }

    public void open(Mode mode, ClientAccount target, Runnable onClose) {
        this.mode = mode;
        this.target = target;
        this.onClose = onClose;
        this.open = true;
        this.swapping = false;
        this.focusIndex = 0;
        openAnim.reset(0f);

        AccountStorage storage = CrickClient.INSTANCE.accountStorage;
        if (storage == null) {
            return;
        }
        if (mode == Mode.RENAME && target != null) {
            field.setText(target.getUsername());
        } else {
            field.setText("");
        }
        field.setFocused(true);
    }

    public void close() {
        if (!open) {
            return;
        }
        open = false;
        field.setFocused(false);
        if (onClose != null) {
            Runnable callback = onClose;
            onClose = null;
            callback.run();
        }
    }

    // ===================== Рендер =====================

    public void render(DrawContext context, int mouseX, int mouseY, float width, float height, float alpha) {
        if (!open) {
            return;
        }
        float p = MenuMotion.clamp01((float) openAnim.run(1f));
        if (p <= 0.001f) {
            return;
        }

        float s = MenuDesign.scale(width, height);
        panelW = 340f * s;
        panelH = mode == Mode.REMOVE ? 150f * s : 212f * s;
        float cx = width / 2f;
        float cy = height / 2f;

        // Затемнение фона.
        DrawUtil.drawRound(0, 0, width, height, 0, ColorUtils.rgba(3, 4, 8, (int) (130 * p * alpha)));

        // Панель: fade + scale 0.98 → 1.0.
        float scale = 0.98f + 0.02f * p;
        panelX = cx - panelW / 2f;
        panelY = cy - panelH / 2f;
        float panelAlpha = alpha * p;

        com.mojang.blaze3d.systems.RenderSystem.getModelViewStack().pushMatrix();
        com.mojang.blaze3d.systems.RenderSystem.getModelViewStack().translate(cx, cy, 0f);
        com.mojang.blaze3d.systems.RenderSystem.getModelViewStack().scale(scale, scale, 1f);
        com.mojang.blaze3d.systems.RenderSystem.getModelViewStack().translate(-cx, -cy, 0f);

        MenuDesign.drawPanel(context.getMatrices(), panelX, panelY, panelW, panelH, 16f * s, panelAlpha);

        layout(mode, panelX, panelY, s);
        renderContent(context, mouseX, mouseY, panelAlpha, s);

        com.mojang.blaze3d.systems.RenderSystem.getModelViewStack().popMatrix();
    }

    private void layout(Mode currentMode, float panelX, float panelY, float s) {
        float innerX = panelX + 20f * s;
        float innerW = panelW - 40f * s;

        if (currentMode == Mode.REMOVE) {
            fieldW = 0f;
            fieldH = 0f;
            generateW = 0f;
            generateH = 0f;
            confirmW = 92f * s;
            confirmH = 28f * s;
            cancelW = 80f * s;
            cancelH = 28f * s;
            confirmX = panelX + panelW - 20f * s - confirmW;
            confirmY = panelY + panelH - 22f * s - confirmH;
            cancelX = confirmX - 10f * s - cancelW;
            cancelY = confirmY;
            return;
        }

        fieldX = innerX;
        fieldY = panelY + 52f * s;
        fieldH = 28f * s;
        generateW = GENERATE_W * s;
        generateH = 26f * s;
        generateX = panelX + panelW - 20f * s - generateW;
        generateY = fieldY + (fieldH - generateH) / 2f;
        fieldW = generateX - 10f * s - fieldX;
        hintY = fieldY + fieldH + 10f * s;

        confirmW = BUTTON_W * s;
        confirmH = BUTTON_H * s;
        cancelW = 72f * s;
        cancelH = BUTTON_H * s;
        confirmX = panelX + panelW - 20f * s - confirmW;
        confirmY = panelY + panelH - 22f * s - confirmH;
        cancelX = confirmX - 10f * s - cancelW;
        cancelY = confirmY;
    }

    private void renderContent(DrawContext context, int mouseX, int mouseY, float alpha, float s) {
        if (mode == Mode.REMOVE) {
            String title = "Remove account?";
            MenuDesign.textCentered(title, panelX, panelY + 26f * s, panelW, 20f * s,
                    MenuDesign.withAlpha(MenuDesign.TEXT, (int) (255 * alpha)), 14f * s);
            String name = target == null ? "" : target.getUsername();
            MenuDesign.textCentered(name, panelX, panelY + 54f * s, panelW, 16f * s,
                    MenuDesign.withAlpha(MenuDesign.TEXT_2, (int) (230 * alpha)), 10.5f * s);
            renderButton(context, mouseX, mouseY, confirmX, confirmY, confirmW, confirmH, "Remove",
                    MenuDesign.DANGER, MenuDesign.withAlpha(0xFFFFFFFF, 240), confirmHover, alpha, s);
            renderQuietButton(context, mouseX, mouseY, cancelX, cancelY, cancelW, cancelH, "Cancel",
                    cancelHover, alpha, s);
            return;
        }

        boolean rename = mode == Mode.RENAME;
        String title = rename ? "Rename account" : "Add account";
        MenuDesign.text(title, fieldX, fieldY - 32f * s,
                MenuDesign.withAlpha(MenuDesign.TEXT, (int) (255 * alpha)), 14f * s);

        field.setBounds(fieldX, fieldY, fieldW, fieldH);
        field.render(mouseX, mouseY, alpha);

        // Кнопка Generate.
        renderButton(context, mouseX, mouseY, generateX, generateY, generateW, generateH, "Generate",
                MenuDesign.ACCENT_DEEP, MenuDesign.withAlpha(0xFFFFFFFF, 235), generateHover, alpha, s);

        // Подсказка валидации.
        AccountStorage storage = CrickClient.INSTANCE.accountStorage;
        String name = field.getText().trim();
        String hint = "3–16 characters · a–z, 0–9, _";
        int hintColor = MenuDesign.TEXT_3;
        boolean valid = true;
        if (name.isEmpty()) {
            valid = false;
        } else if (!AccountStorage.isValidName(name)) {
            hint = "Nickname must be 3–16 characters";
            hintColor = MenuDesign.DANGER;
            valid = false;
        } else if (storage != null && storage.hasUsername(name)
                && !(rename && target != null && name.equals(target.getUsername()))) {
            hint = "This nickname is already in your list";
            hintColor = MenuDesign.DANGER;
            valid = false;
        }
        if (valid && !name.isEmpty()) {
            hint = rename ? "Ready to rename" : "Ready to add";
            hintColor = MenuDesign.TEXT_3;
        }
        MenuDesign.text(hint, fieldX, hintY, MenuDesign.withAlpha(hintColor, (int) (200 * alpha)), 7.6f * s);

        // Кнопки.
        renderButton(context, mouseX, mouseY, confirmX, confirmY, confirmW, confirmH,
                rename ? "Rename" : "Add", MenuDesign.ACCENT, MenuDesign.withAlpha(0xFFFFFFFF, 245),
                confirmHover, valid ? alpha : alpha * 0.45f, s);
        renderQuietButton(context, mouseX, mouseY, cancelX, cancelY, cancelW, cancelH, "Cancel",
                cancelHover, alpha, s);

        // Фокус-кольцо.
        renderFocusRing(alpha, s);
    }

    private void renderButton(DrawContext context, int mouseX, int mouseY,
                              float x, float y, float w, float h, String label,
                              int fill, int textColor, Animation hoverAnim, float alpha, float s) {
        boolean hovered = mouseX >= x && mouseX <= x + w && mouseY >= y && mouseY <= y + h;
        float hover = hoverAnim.run(hovered ? 1f : 0f);
        float radius = h / 2f;
        DrawUtil.drawRound(x, y, w, h, radius, ColorUtils.rgba(
                ColorUtils.red(fill), ColorUtils.green(fill), ColorUtils.blue(fill),
                (int) ((170 + 60 * hover) * alpha)));
        DrawUtil.drawRound(x, y, w, h, radius,
                ColorUtils.rgba(0xFF, 0xFF, 0xFF, (int) (16 * hover * alpha)));
        MenuDesign.textCentered(label, x, y, w, h, MenuDesign.withAlpha(textColor, (int) (255 * alpha)), 9f * s);
    }

    private void renderQuietButton(DrawContext context, int mouseX, int mouseY,
                                   float x, float y, float w, float h, String label,
                                   Animation hoverAnim, float alpha, float s) {
        boolean hovered = mouseX >= x && mouseX <= x + w && mouseY >= y && mouseY <= y + h;
        float hover = hoverAnim.run(hovered ? 1f : 0f);
        if (hover > 0.01f) {
            DrawUtil.drawRound(x, y, w, h, h / 2f, ColorUtils.rgba(255, 255, 255, (int) (8 * hover * alpha)));
        }
        MenuDesign.textCentered(label, x, y, w, h,
                MenuDesign.withAlpha(hovered ? MenuDesign.TEXT_2 : MenuDesign.TEXT_3, (int) (235 * alpha)), 9f * s);
    }

    private void renderFocusRing(float alpha, float s) {
        float x;
        float y;
        float w;
        float h;
        switch (focusIndex) {
            case 1 -> {
                x = generateX;
                y = generateY;
                w = generateW;
                h = generateH;
            }
            case 2 -> {
                x = confirmX;
                y = confirmY;
                w = confirmW;
                h = confirmH;
            }
            case 3 -> {
                x = cancelX;
                y = cancelY;
                w = cancelW;
                h = cancelH;
            }
            default -> {
                x = fieldX;
                y = fieldY;
                w = fieldW;
                h = fieldH;
            }
        }
        if (w <= 0f || h <= 0f) {
            return;
        }
        DrawUtil.drawRoundOutline(x - 1.5f, y - 1.5f, w + 3f, h + 3f, h / 2f + 2f, 1.2f,
                MenuDesign.withAlpha(MenuDesign.ACCENT_BRIGHT, (int) (120 * alpha)));
    }

    // ===================== Ввод =====================

    public void mouseClicked(double mouseX, double mouseY, int button) {
        if (!open || button != 0) {
            return;
        }
        float cx = (float) mouseX;
        float cy = (float) mouseY;
        boolean insidePanel = cx >= panelX && cx <= panelX + panelW
                && cy >= panelY && cy <= panelY + panelH;
        if (!insidePanel) {
            close();
            return;
        }

        if (mode != Mode.REMOVE) {
            field.mouseClicked(mouseX, mouseY, button);
            if (cx >= generateX && cx <= generateX + generateW && cy >= generateY && cy <= generateY + generateH) {
                generate();
                return;
            }
        }
        if (cx >= confirmX && cx <= confirmX + confirmW && cy >= confirmY && cy <= confirmY + confirmH) {
            confirm();
            return;
        }
        if (cx >= cancelX && cx <= cancelX + cancelW && cy >= cancelY && cy <= cancelY + cancelH) {
            close();
        }
    }

    public void keyPressed(int keyCode, int scanCode, int modifiers) {
        if (!open) {
            return;
        }
        if (keyCode == GLFW.GLFW_KEY_ESCAPE) {
            close();
            return;
        }
        if (keyCode == GLFW.GLFW_KEY_TAB) {
            boolean shift = (modifiers & GLFW.GLFW_MOD_SHIFT) != 0;
            int count = mode == Mode.REMOVE ? 3 : 4;
            if (shift) {
                focusIndex = (focusIndex + count - 1) % count;
            } else {
                focusIndex = (focusIndex + 1) % count;
            }
            field.setFocused(focusIndex == 0);
            return;
        }
        if (mode == Mode.REMOVE) {
            if ((keyCode == GLFW.GLFW_KEY_ENTER || keyCode == GLFW.GLFW_KEY_KP_ENTER
                    || keyCode == GLFW.GLFW_KEY_SPACE) && focusIndex == 2) {
                confirm();
            }
            return;
        }
        if (keyCode == GLFW.GLFW_KEY_ENTER || keyCode == GLFW.GLFW_KEY_KP_ENTER) {
            if (focusIndex == 1) {
                generate();
            } else {
                confirm();
            }
            return;
        }
        if (keyCode == GLFW.GLFW_KEY_SPACE && focusIndex == 1) {
            generate();
            return;
        }
        field.keyPressed(keyCode, scanCode, modifiers);
    }

    public void charTyped(char chr, int modifiers) {
        if (open) {
            field.charTyped(chr, modifiers);
        }
    }

    // ===================== Действия =====================

    private void generate() {
        AccountStorage storage = CrickClient.INSTANCE.accountStorage;
        if (storage == null) {
            return;
        }
        String name = NicknameGenerator.generate(storage::hasUsername);
        swapOldText = field.getText();
        field.setText(name);
        swapping = true;
        swapStart = System.currentTimeMillis();
        field.overlayText = swapOldText;
        field.overlayAlpha = 1f;
        field.textAlpha = 0f;
    }

    private void confirm() {
        AccountStorage storage = CrickClient.INSTANCE.accountStorage;
        if (storage == null) {
            close();
            return;
        }
        if (mode == Mode.REMOVE) {
            if (target != null) {
                storage.removeAccount(target.getId());
            }
            close();
            return;
        }
        String name = field.getText().trim();
        if (!AccountStorage.isValidName(name)) {
            return;
        }
        boolean ok;
        if (mode == Mode.RENAME && target != null) {
            ok = storage.renameAccount(target.getId(), name);
        } else {
            ok = storage.addAccount(name) != null;
        }
        if (ok) {
            close();
        }
    }

    /** Обновляет кроссфейд текста генерации. Вызывается из tick/rend. */
    public void tickSwap() {
        if (!swapping) {
            return;
        }
        float p = (System.currentTimeMillis() - swapStart) / 260f;
        if (p >= 1f) {
            swapping = false;
            field.overlayText = null;
            field.overlayAlpha = 0f;
            field.textAlpha = 1f;
        } else {
            field.textAlpha = MathHelper.clamp(p, 0f, 1f);
            field.overlayAlpha = 1f - MathHelper.clamp(p, 0f, 1f);
        }
    }
}

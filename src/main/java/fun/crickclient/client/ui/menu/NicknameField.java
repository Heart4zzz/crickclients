package fun.crickclient.client.ui.menu;

import net.minecraft.client.MinecraftClient;
import org.lwjgl.glfw.GLFW;

/**
 * Поле ввода ника для Alt Manager.
 * <p>
 * Полноценный текстовый ввод: каретка, выделение, backspace/delete, стрелки,
 * Home/End, Ctrl+A/C/V/X, Ctrl+Backspace, вставка из буфера, click-to-caret.
 * Ввод ограничен символами валидного ника Minecraft (a–z, 0–9, «_», до 16 символов).
 */
public class NicknameField {

    private float x, y, width, height;
    private String text = "";
    private boolean focused;

    private int caret;
    private int selectionAnchor;
    private float scrollX;

    /** Поддержка кроссфейда текста (генерация ника): старый текст поверх нового. */
    public String overlayText;
    public float overlayAlpha;
    public float textAlpha = 1f;

    private static final float RADIUS = 7f;
    private static final float FONT_SIZE = 10f;

    public interface Listener {
        /** Enter в поле. */
        default void onEnter() {
        }
    }

    private Listener listener;

    public void setListener(Listener listener) {
        this.listener = listener;
    }

    public void setBounds(float x, float y, float width, float height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void setText(String value) {
        text = value == null ? "" : value;
        if (text.length() > 16) {
            text = text.substring(0, 16);
        }
        caret = text.length();
        selectionAnchor = caret;
        scrollX = 0f;
    }

    public String getText() {
        return text;
    }

    public boolean isEmpty() {
        return text.isEmpty();
    }

    public boolean isFocused() {
        return focused;
    }

    public void setFocused(boolean focused) {
        this.focused = focused;
        if (!focused) {
            caret = Math.max(0, Math.min(caret, text.length()));
            selectionAnchor = caret;
        }
    }

    public void render(int mouseX, int mouseY, float alpha) {
        caret = Math.max(0, Math.min(caret, text.length()));
        selectionAnchor = Math.max(0, Math.min(selectionAnchor, text.length()));

        boolean hovered = mouseX >= x && mouseX <= x + width && mouseY >= y && mouseY <= y + height;

        // Подложка: тёмная «врезка» с мягкой тенью.
        MenuDesign.drawPanel(MenuDesign.matrices(), x, y, width, height, RADIUS, alpha * 0.9f);
        // Внутренний тёмный слой поля.
        fun.crickclient.client.ui.clickgui.util.DrawUtil.drawRound(x, y, width, height, RADIUS,
                MenuDesign.withAlpha(0xFF0B0D14, (int) (215 * alpha)));
        if (focused) {
            fun.crickclient.client.ui.clickgui.util.DrawUtil.drawRoundOutline(x, y, width, height, RADIUS, 1f,
                    MenuDesign.withAlpha(MenuDesign.ACCENT, (int) (150 * alpha)));
        } else if (hovered) {
            fun.crickclient.client.ui.clickgui.util.DrawUtil.drawRoundOutline(x, y, width, height, RADIUS, 1f,
                    MenuDesign.withAlpha(0xFFFFFFFF, (int) (26 * alpha)));
        } else {
            fun.crickclient.client.ui.clickgui.util.DrawUtil.drawRoundOutline(x, y, width, height, RADIUS, 1f,
                    MenuDesign.withAlpha(0xFFFFFFFF, (int) (12 * alpha)));
        }

        float padding = 10f;
        float textY = textHeight(FONT_SIZE, height);

        updateScroll(width - padding * 2f);

        fun.crickclient.client.ui.clickgui.util.Scissor.push();
        fun.crickclient.client.ui.clickgui.util.Scissor.setFromComponentCoordinates(x + padding, y, width - padding * 2f, height);

        if (hasSelection()) {
            float selX1 = x + padding - scrollX + textWidth(text.substring(0, selMin()));
            float selX2 = x + padding - scrollX + textWidth(text.substring(0, selMax()));
            fun.crickclient.client.ui.clickgui.util.DrawUtil.drawRound(selX1, y + 3f, selX2 - selX1, height - 6f, 2f,
                    MenuDesign.withAlpha(MenuDesign.ACCENT, (int) (90 * alpha)));
        }

        MenuDesign.text(text, x + padding - scrollX, y + textY,
                MenuDesign.withAlpha(MenuDesign.TEXT, (int) (255 * alpha * textAlpha)), FONT_SIZE);

        // Старый текст при кроссфейде генерации ника.
        if (overlayText != null && !overlayText.isEmpty() && overlayAlpha > 0.01f) {
            MenuDesign.text(overlayText, x + padding - scrollX, y + textY,
                    MenuDesign.withAlpha(MenuDesign.TEXT, (int) (255 * alpha * overlayAlpha)), FONT_SIZE);
        }

        if (focused && System.currentTimeMillis() % 1000 > 500) {
            float caretX = x + padding - scrollX + textWidth(text.substring(0, caret));
            fun.crickclient.client.ui.clickgui.util.DrawUtil.drawRound(caretX, y + 4f, 1f, height - 8f, 0.5f,
                    MenuDesign.withAlpha(MenuDesign.ACCENT_BRIGHT, (int) (230 * alpha)));
        }
        // Каретка при кроссфейде генерации не рисуется (текст ещё «плывёт»).

        fun.crickclient.client.ui.clickgui.util.Scissor.unset();
        fun.crickclient.client.ui.clickgui.util.Scissor.pop();
    }

    private static float textWidth(String s) {
        return MenuDesign.textWidth(s, FONT_SIZE);
    }

    private static float textHeight(float size, float boxH) {
        return MenuDesign.textCenteredY(size, boxH);
    }

    private void updateScroll(float areaWidth) {
        if (text.isEmpty()) {
            scrollX = 0f;
            return;
        }
        float caretPos = textWidth(text.substring(0, caret));
        if (caretPos - scrollX > areaWidth - 2f) {
            scrollX = caretPos - areaWidth + 2f;
        }
        if (caretPos - scrollX < 0f) {
            scrollX = caretPos;
        }
        float total = textWidth(text);
        if (total - scrollX < areaWidth - 2f) {
            scrollX = Math.max(0f, total - areaWidth + 2f);
        }
        if (total <= areaWidth) {
            scrollX = 0f;
        }
    }

    // ===================== Ввод =====================

    public void mouseClicked(double mouseX, double mouseY, int button) {
        if (button != 0) {
            return;
        }
        boolean inside = mouseX >= x && mouseX <= x + width && mouseY >= y && mouseY <= y + height;
        focused = inside;
        if (inside) {
            int index = caretFromMouse((float) mouseX);
            caret = index;
            selectionAnchor = index;
        }
    }

    private int caretFromMouse(float mouseX) {
        float local = mouseX - (x + 10f) + scrollX;
        int best = 0;
        float bestDistance = Float.MAX_VALUE;
        for (int i = 0; i <= text.length(); i++) {
            float w = textWidth(text.substring(0, i));
            float d = Math.abs(w - local);
            if (d < bestDistance) {
                bestDistance = d;
                best = i;
            }
        }
        return best;
    }

    public void charTyped(char codePoint, int modifiers) {
        if (!focused) {
            return;
        }
        if ((modifiers & (GLFW.GLFW_MOD_CONTROL | GLFW.GLFW_MOD_ALT | GLFW.GLFW_MOD_SUPER)) != 0) {
            return;
        }
        if (codePoint < 32 || codePoint == 127) {
            return;
        }
        if (!isAllowed(codePoint)) {
            return;
        }
        insert(String.valueOf(codePoint));
    }

    public void keyPressed(int keyCode, int scanCode, int modifiers) {
        if (!focused) {
            return;
        }
        boolean ctrl = (modifiers & (GLFW.GLFW_MOD_CONTROL | GLFW.GLFW_MOD_SUPER)) != 0;
        boolean shift = (modifiers & GLFW.GLFW_MOD_SHIFT) != 0;

        if (ctrl) {
            switch (keyCode) {
                case GLFW.GLFW_KEY_A -> {
                    selectAll();
                    return;
                }
                case GLFW.GLFW_KEY_C -> {
                    copySelection();
                    return;
                }
                case GLFW.GLFW_KEY_X -> {
                    cutSelection();
                    return;
                }
                case GLFW.GLFW_KEY_V -> {
                    paste();
                    return;
                }
            }
        }

        switch (keyCode) {
            case GLFW.GLFW_KEY_BACKSPACE -> {
                if (hasSelection()) {
                    deleteSelection();
                } else if (ctrl) {
                    int start = prevWordBoundary(caret);
                    text = text.substring(0, start) + text.substring(caret);
                    caret = start;
                    selectionAnchor = caret;
                } else if (caret > 0) {
                    text = text.substring(0, caret - 1) + text.substring(caret);
                    caret--;
                    selectionAnchor = caret;
                }
            }
            case GLFW.GLFW_KEY_DELETE -> {
                if (hasSelection()) {
                    deleteSelection();
                } else if (caret < text.length()) {
                    text = text.substring(0, caret) + text.substring(caret + 1);
                }
            }
            case GLFW.GLFW_KEY_LEFT -> {
                int target = ctrl ? prevWordBoundary(caret) : Math.max(0, caret - 1);
                moveCaret(target, shift);
            }
            case GLFW.GLFW_KEY_RIGHT -> {
                int target = ctrl ? nextWordBoundary(caret) : Math.min(text.length(), caret + 1);
                moveCaret(target, shift);
            }
            case GLFW.GLFW_KEY_HOME -> moveCaret(0, shift);
            case GLFW.GLFW_KEY_END -> moveCaret(text.length(), shift);
            case GLFW.GLFW_KEY_ENTER, GLFW.GLFW_KEY_KP_ENTER -> {
                if (listener != null) {
                    listener.onEnter();
                }
            }
            case GLFW.GLFW_KEY_ESCAPE -> focused = false;
            default -> {
            }
        }
    }

    private static boolean isAllowed(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9') || c == '_';
    }

    private void insert(String s) {
        if (hasSelection()) {
            deleteSelection();
        }
        int free = 16 - text.length();
        if (free <= 0) {
            return;
        }
        if (s.length() > free) {
            s = s.substring(0, free);
        }
        text = text.substring(0, caret) + s + text.substring(caret);
        caret += s.length();
        selectionAnchor = caret;
    }

    private boolean hasSelection() {
        return caret != selectionAnchor;
    }

    private int selMin() {
        return Math.min(caret, selectionAnchor);
    }

    private int selMax() {
        return Math.max(caret, selectionAnchor);
    }

    private void deleteSelection() {
        int a = selMin();
        int b = selMax();
        text = text.substring(0, a) + text.substring(b);
        caret = a;
        selectionAnchor = a;
    }

    private void moveCaret(int target, boolean keepSelection) {
        caret = Math.max(0, Math.min(text.length(), target));
        if (!keepSelection) {
            selectionAnchor = caret;
        }
    }

    private void selectAll() {
        selectionAnchor = 0;
        caret = text.length();
    }

    private void copySelection() {
        if (!hasSelection()) {
            return;
        }
        MinecraftClient.getInstance().keyboard.setClipboard(text.substring(selMin(), selMax()));
    }

    private void cutSelection() {
        if (!hasSelection()) {
            return;
        }
        copySelection();
        deleteSelection();
    }

    private void paste() {
        String clip = MinecraftClient.getInstance().keyboard.getClipboard();
        if (clip == null || clip.isEmpty()) {
            return;
        }
        StringBuilder filtered = new StringBuilder();
        for (int i = 0; i < clip.length(); i++) {
            char c = clip.charAt(i);
            if (isAllowed(c)) {
                filtered.append(c);
            }
        }
        insert(filtered.toString());
    }

    private int prevWordBoundary(int from) {
        int i = from;
        while (i > 0 && text.charAt(i - 1) == '_') {
            i--;
        }
        while (i > 0 && text.charAt(i - 1) != '_') {
            i--;
        }
        return i;
    }

    private int nextWordBoundary(int from) {
        int i = from;
        int len = text.length();
        while (i < len && text.charAt(i) == '_') {
            i++;
        }
        while (i < len && text.charAt(i) != '_') {
            i++;
        }
        return i;
    }
}

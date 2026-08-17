package fun.crickclient.client.ui.clickgui;

import fun.crickclient.CrickClient;
import fun.crickclient.api.QClient;
import fun.crickclient.api.storages.implement.ThemeStorage;
import fun.crickclient.client.ui.clickgui.util.Animation;
import fun.crickclient.client.ui.clickgui.util.ColorProvider;
import fun.crickclient.client.ui.clickgui.util.CursorManager;
import fun.crickclient.client.ui.clickgui.util.DrawUtil;
import fun.crickclient.client.ui.clickgui.util.Easing;
import fun.crickclient.client.ui.clickgui.util.GuiFonts;
import fun.crickclient.client.ui.clickgui.util.HoverUtil;
import net.minecraft.client.gui.DrawContext;

import java.util.List;

/**
 * Выбор темы клиента справа от окна клик гуи.
 * <p>
 * Настройки отдельных цветов (кастомные слоты и пипетка) убраны — доступны только
 * готовые темы клиента, включая радужную.
 */
public class ThemeEditor implements QClient {

    public static final float COLLAPSED_W = 24f;
    public static final float POPUP_W = 132f;

    private static final float TAB_H = 56f;
    private static final float HEADER_H = 22f;
    private static final float SWATCH = 16f;
    private static final float CELL_W = 40f;
    private static final float CELL_H = 30f;
    private static final int COLUMNS = 3;
    private static final float PADDING = 8f;

    private static final float SHELL_SHIFT_X = -(POPUP_W + COLLAPSED_W + 28f) * 0.42f;
    private static final float SHELL_SHIFT_Y = -14f;

    private final Animation expandAnim = new Animation(Easing.QUINTIC_OUT, 280);
    private final Animation contentAnim = new Animation(Easing.QUINTIC_OUT, 220);

    private boolean expanded;
    private float anchorRight, anchorY, anchorH;
    private float tabX, tabY, popupX, popupY;
    private float shellVisibility = 1f;

    public void resetAppear() {
    }

    public boolean isExpanded() {
        return expanded;
    }

    public float getShellShiftX() {
        expandAnim.run(expanded);
        return expandAnim.getValue() * SHELL_SHIFT_X;
    }

    public float getShellShiftY() {
        expandAnim.run(expanded);
        return expandAnim.getValue() * SHELL_SHIFT_Y;
    }

    public void setAnchor(float shellRight, float shellY, float shellHeight) {
        this.anchorRight = shellRight;
        this.anchorY = shellY;
        this.anchorH = shellHeight;
    }

    private static List<ThemeStorage.Themes> themes() {
        return CrickClient.INSTANCE.themeStorage.getThemeList();
    }

    private static float popupHeight() {
        int rows = Math.max(1, (themes().size() + COLUMNS - 1) / COLUMNS);
        return HEADER_H + rows * CELL_H + PADDING;
    }

    public void render(DrawContext context, int mouseX, int mouseY, float delta, float visibility) {
        shellVisibility = Math.max(0f, Math.min(visibility, 1f));
        if (shellVisibility < 0.01f) return;

        expandAnim.run(expanded);
        contentAnim.run(expanded);
        float cp = contentAnim.getValue();

        tabX = anchorRight + 6f;
        tabY = anchorY + anchorH / 2f - TAB_H / 2f;
        popupX = tabX + COLLAPSED_W + 6f;
        popupY = tabY + TAB_H / 2f - popupHeight() / 2f;

        renderTab(mouseX, mouseY);

        if (cp > 0.01f) {
            renderPopup(mouseX, mouseY, cp);
        }
    }

    private void renderTab(int mouseX, int mouseY) {
        boolean hover = HoverUtil.isHovered(mouseX, mouseY, tabX, tabY, COLLAPSED_W, TAB_H);
        if (hover) CursorManager.requestHand();

        int accent = ColorProvider.getColorClient();
        DrawUtil.drawRound(tabX, tabY, COLLAPSED_W, TAB_H, 6f,
                ColorProvider.rgba(16, 18, 26, (int) (245 * shellVisibility)));
        DrawUtil.drawRound(tabX + 7f, tabY + 10f, 10f, 10f, 3f,
                ColorProvider.setAlpha(accent, (int) (255 * shellVisibility)));
        DrawUtil.drawRound(tabX + 7f, tabY + 24f, 10f, 10f, 3f,
                ColorProvider.setAlpha(accent, (int) (130 * shellVisibility)));
        DrawUtil.drawText(GuiFonts.GUI_BODY.get(), expanded ? "<" : ">",
                tabX + 8f, tabY + 40f,
                ColorProvider.setAlpha(ColorProvider.getColorInactiveText(), (int) (200 * shellVisibility)), 7f);
    }

    private void renderPopup(int mouseX, int mouseY, float alpha) {
        float combined = alpha * shellVisibility;
        int a = (int) (255 * combined);
        float slide = (1f - alpha) * 12f;
        float px = popupX + slide;
        float ph = popupHeight();

        DrawUtil.drawRound(px, popupY, POPUP_W, ph, 7f,
                ColorProvider.rgba(16, 18, 26, (int) (245 * combined)));

        DrawUtil.drawText(GuiFonts.GUI_TITLE.get(), "Themes", px + PADDING, popupY + 7f,
                ColorProvider.setAlpha(ColorProvider.getColorText(), a), 7.5f);

        DrawUtil.drawRound(px + PADDING, popupY + HEADER_H - 4f, POPUP_W - PADDING * 2f, 0.5f, 0.25f,
                ColorProvider.rgba(255, 255, 255, (int) (10 * combined)));

        List<ThemeStorage.Themes> themes = themes();
        ThemeStorage.Themes selected = CrickClient.INSTANCE.themeStorage.getThemes();

        for (int i = 0; i < themes.size(); i++) {
            ThemeStorage.Themes theme = themes.get(i);
            float cellX = px + PADDING + (i % COLUMNS) * CELL_W;
            float cellY = popupY + HEADER_H + (i / COLUMNS) * CELL_H;
            boolean hover = HoverUtil.isHovered(mouseX, mouseY, cellX, cellY, CELL_W - 2f, CELL_H - 2f);
            if (hover && combined > 0.9f) CursorManager.requestHand();

            float swatchX = cellX + (CELL_W - 2f - SWATCH) / 2f;
            int color = ColorProvider.setAlpha(displayColor(theme), a);

            if (theme == selected) {
                DrawUtil.drawRound(swatchX - 1.5f, cellY - 1.5f, SWATCH + 3f, SWATCH + 3f, 5f,
                        ColorProvider.setAlpha(displayColor(theme), (int) (110 * combined)));
            } else if (hover) {
                DrawUtil.drawRound(swatchX - 1f, cellY - 1f, SWATCH + 2f, SWATCH + 2f, 4.5f,
                        ColorProvider.rgba(255, 255, 255, (int) (14 * combined)));
            }

            DrawUtil.drawRound(swatchX, cellY, SWATCH, SWATCH, 4f, color);

            String name = theme.getTheme().getName();
            float nameW = GuiFonts.GUI_BODY.get().getWidth(name, 4.8f);
            DrawUtil.drawText(GuiFonts.GUI_BODY.get(), name,
                    cellX + (CELL_W - 2f - nameW) / 2f, cellY + SWATCH + 1.5f,
                    ColorProvider.setAlpha(theme == selected
                            ? ColorProvider.getColorText()
                            : ColorProvider.getColorInactiveText(), a), 4.8f);
        }
    }

    /** У радужной темы цвет анимированный, у остальных — их основной цвет. */
    private int displayColor(ThemeStorage.Themes theme) {
        int color = theme.getTheme().getColor(0);
        if (((color >> 24) & 0xFF) == 0) {
            return ColorProvider.rgba(220, 220, 220, 255);
        }
        return color;
    }

    public boolean mouseClicked(double mouseX, double mouseY, int button) {
        if (HoverUtil.isHovered(mouseX, mouseY, tabX, tabY, COLLAPSED_W, TAB_H) && button == 0) {
            expanded = !expanded;
            return true;
        }

        if (!expanded) return false;

        float ph = popupHeight();
        if (HoverUtil.isHovered(mouseX, mouseY, popupX, popupY, POPUP_W, ph)) {
            if (button == 0) {
                List<ThemeStorage.Themes> themes = themes();
                for (int i = 0; i < themes.size(); i++) {
                    float cellX = popupX + PADDING + (i % COLUMNS) * CELL_W;
                    float cellY = popupY + HEADER_H + (i / COLUMNS) * CELL_H;
                    if (HoverUtil.isHovered(mouseX, mouseY, cellX, cellY, CELL_W - 2f, CELL_H - 2f)) {
                        CrickClient.INSTANCE.themeStorage.setThemes(themes.get(i));
                        return true;
                    }
                }
            }
            return true;
        }

        expanded = false;
        return false;
    }

    public void mouseReleased(double mouseX, double mouseY, int button) {
    }
}

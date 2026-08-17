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
import net.minecraft.util.math.MathHelper;

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

    private static final float TAB_H = 58f;
    private static final float TAB_RADIUS = 7f;
    private static final float POPUP_RADIUS = 9f;
    private static final float HEADER_H = 22f;
    private static final float SWATCH = 16f;
    private static final float CELL_W = 40f;
    private static final float CELL_H = 31f;
    private static final int COLUMNS = 3;
    private static final float PADDING = 8f;

    private static final float SHELL_SHIFT_X = -(POPUP_W + COLLAPSED_W + 28f) * 0.42f;
    private static final float SHELL_SHIFT_Y = -14f;

    private final Animation expandAnim = new Animation(Easing.QUINTIC_OUT, 280);
    private final Animation contentAnim = new Animation(Easing.QUINTIC_OUT, 220);
    private final Animation hoverAnim = new Animation(Easing.QUINTIC_OUT, 180);

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
        // Попап центрируется относительно кнопки открытия, а не прижимается к низу окна,
        // и при этом не вылезает за пределы окна клик гуи по вертикали.
        float ph = popupHeight();
        float centered = anchorY + anchorH / 2f - ph / 2f;
        popupY = MathHelper.clamp(centered, anchorY, anchorY + anchorH - ph);

        renderTab(mouseX, mouseY);

        if (cp > 0.01f) {
            renderPopup(mouseX, mouseY, cp);
        }
    }

    private void renderTab(int mouseX, int mouseY) {
        boolean hover = HoverUtil.isHovered(mouseX, mouseY, tabX, tabY, COLLAPSED_W, TAB_H);
        if (hover) CursorManager.requestHand();
        hoverAnim.run(hover);
        float hv = hoverAnim.getValue();

        int accent = ColorProvider.getColorClient();
        int a = (int) (255 * shellVisibility);

        DrawUtil.drawRoundBlur(tabX, tabY + 2f, COLLAPSED_W, TAB_H, TAB_RADIUS,
                ColorProvider.rgba(0, 0, 0, (int) (80 * shellVisibility)), 12f);
        DrawUtil.drawRound(tabX, tabY, COLLAPSED_W, TAB_H, TAB_RADIUS,
                ColorProvider.setAlpha(ClickGuiStyles.BG_TOP, (int) (250 * shellVisibility)),
                ColorProvider.setAlpha(ClickGuiStyles.BG_TOP, (int) (250 * shellVisibility)),
                ColorProvider.setAlpha(ClickGuiStyles.BG_BOTTOM, (int) (250 * shellVisibility)),
                ColorProvider.setAlpha(ClickGuiStyles.BG_BOTTOM, (int) (250 * shellVisibility)));
        DrawUtil.drawRoundOutline(tabX, tabY, COLLAPSED_W, TAB_H, TAB_RADIUS, 1f,
                ColorProvider.rgba(255, 255, 255, (int) ((16 + 18 * hv) * shellVisibility)));

        // Две «пилюли» цвета текущей темы — визуальная метафора палитры.
        float dotW = COLLAPSED_W - 13f;
        float dotX = tabX + 6.5f;
        int currentColor = ColorProvider.setAlpha(displayColor(CrickClient.INSTANCE.themeStorage.getThemes()), a);

        DrawUtil.drawRoundBlur(dotX, tabY + 11f, dotW, dotW, dotW / 2f,
                ColorProvider.setAlpha(accent, (int) (90 * shellVisibility)), 5f);
        DrawUtil.drawRound(dotX, tabY + 11f, dotW, dotW, dotW / 2f, currentColor);
        DrawUtil.drawRound(dotX, tabY + 11f + dotW + 3f, dotW, dotW, dotW / 2f,
                ColorProvider.setAlpha(accent, (int) (90 * shellVisibility)));

        // Стрелка направления — по центру нижней части кнопки.
        DrawUtil.drawTextCentered(GuiFonts.GUI_BODY.get(), expanded ? "<" : ">",
                tabX, tabY + TAB_H - 14f, COLLAPSED_W, 12f,
                ColorProvider.setAlpha(ColorProvider.getColorInactiveText(),
                        (int) ((190 + 65 * hv) * shellVisibility)), 6.5f);
    }

    private void renderPopup(int mouseX, int mouseY, float alpha) {
        float combined = alpha * shellVisibility;
        int a = (int) (255 * combined);
        float slide = (1f - alpha) * 12f;
        float px = popupX + slide;
        float ph = popupHeight();

        DrawUtil.drawRoundBlur(px, popupY + 3f, POPUP_W, ph, POPUP_RADIUS,
                ColorProvider.rgba(0, 0, 0, (int) (95 * combined)), 18f);
        DrawUtil.drawRound(px, popupY, POPUP_W, ph, POPUP_RADIUS,
                ColorProvider.setAlpha(ClickGuiStyles.BG_TOP, (int) (250 * combined)),
                ColorProvider.setAlpha(ClickGuiStyles.BG_TOP, (int) (250 * combined)),
                ColorProvider.setAlpha(ClickGuiStyles.BG_BOTTOM, (int) (250 * combined)),
                ColorProvider.setAlpha(ClickGuiStyles.BG_BOTTOM, (int) (250 * combined)));
        DrawUtil.drawRoundOutline(px, popupY, POPUP_W, ph, POPUP_RADIUS, 1f,
                ColorProvider.rgba(255, 255, 255, (int) (24 * combined)),
                ColorProvider.rgba(255, 255, 255, (int) (7 * combined)));

        DrawUtil.drawTextVCentered(GuiFonts.GUI_TITLE.get(), "Themes", px + PADDING, popupY, HEADER_H,
                ColorProvider.setAlpha(ColorProvider.getColorText(), a), 7f);

        DrawUtil.drawRound(px + PADDING, popupY + HEADER_H - 4f, POPUP_W - PADDING * 2f, 0.8f, 0.4f,
                ColorProvider.rgba(255, 255, 255, (int) (12 * combined)));

        List<ThemeStorage.Themes> themes = themes();
        ThemeStorage.Themes selected = CrickClient.INSTANCE.themeStorage.getThemes();

        for (int i = 0; i < themes.size(); i++) {
            ThemeStorage.Themes theme = themes.get(i);
            float cellX = px + PADDING + (i % COLUMNS) * CELL_W;
            float cellY = popupY + HEADER_H + (i / COLUMNS) * CELL_H;
            float cellW = CELL_W - 2f;
            float cellH = CELL_H - 2f;
            boolean hover = HoverUtil.isHovered(mouseX, mouseY, cellX, cellY, cellW, cellH);
            if (hover && combined > 0.9f) CursorManager.requestHand();

            boolean isSelected = theme == selected;
            int color = ColorProvider.setAlpha(displayColor(theme), a);
            float swatchX = cellX + (cellW - SWATCH) / 2f;
            float swatchY = cellY + 1f;

            // Подложка ячейки: у выбранной — акцентная, у наведённой — светлая.
            if (isSelected) {
                DrawUtil.drawRound(cellX, cellY, cellW, cellH, 6f,
                        ColorProvider.setAlpha(displayColor(theme), (int) (34 * combined)));
                DrawUtil.drawRoundOutline(cellX, cellY, cellW, cellH, 6f, 1f,
                        ColorProvider.setAlpha(displayColor(theme), (int) (150 * combined)));
            } else if (hover) {
                DrawUtil.drawRound(cellX, cellY, cellW, cellH, 6f,
                        ColorProvider.rgba(255, 255, 255, (int) (16 * combined)));
            }

            if (isSelected || hover) {
                DrawUtil.drawRoundBlur(swatchX, swatchY, SWATCH, SWATCH, 5f,
                        ColorProvider.setAlpha(displayColor(theme),
                                (int) ((isSelected ? 130 : 70) * combined)), 6f);
            }

            DrawUtil.drawRound(swatchX, swatchY, SWATCH, SWATCH, 5f, color);
            DrawUtil.drawRoundOutline(swatchX, swatchY, SWATCH, SWATCH, 5f, 0.8f,
                    ColorProvider.rgba(255, 255, 255, (int) (40 * combined)));

            String name = theme.getTheme().getName();
            DrawUtil.drawTextCentered(GuiFonts.GUI_BODY.get(), name,
                    cellX, swatchY + SWATCH, cellW, cellH - SWATCH - 1f,
                    ColorProvider.setAlpha(isSelected
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

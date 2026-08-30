package fun.crickclient.client.ui.menu;

import com.mojang.blaze3d.systems.RenderSystem;
import fun.crickclient.CrickClient;
import fun.crickclient.api.QClient;
import fun.crickclient.api.storages.implement.AccountStorage;
import fun.crickclient.api.utils.client.ClientAccount;
import fun.crickclient.api.utils.color.ColorUtils;
import fun.crickclient.api.utils.render.blur.BlurProgram;
import fun.crickclient.client.ui.clickgui.util.Animation;
import fun.crickclient.client.ui.clickgui.util.DrawUtil;
import fun.crickclient.client.ui.clickgui.util.Easing;
import fun.crickclient.client.ui.clickgui.util.HoverUtil;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.glfw.GLFW;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Alt Manager — минималистичный account switcher.
 * <p>
 * Главная идея: «кто я сейчас?» — один текущий аккаунт сверху, остальные ниже.
 * Клик по аккаунту = выбор. Дополнительные действия (Rename/Remove) появляются
 * только через «…» при взаимодействии. Добавление — отдельное модальное окно.
 */
public class AltManagerScreen extends Screen implements QClient {

    private final Screen parent;
    private final long enteredAt = System.currentTimeMillis();
    private long exitStart = -1L;
    private Runnable exitAction;

    private final AddAccountDialog dialog = new AddAccountDialog();
    private final Map<String, Animation> rowHovers = new HashMap<>();

    private final Animation backHover = MenuMotion.hover();
    private final Animation addHover = MenuMotion.hover();
    private final Animation renameHover = MenuMotion.hover();
    private final Animation removeHover = MenuMotion.hover();

    // Скролл списка аккаунтов.
    private float scroll;
    private float scrollTarget;
    private long lastFrameTime = System.currentTimeMillis();

    // Открытое меню «…» для конкретного аккаунта.
    private String openMenuFor;
    private float menuX, menuY, menuW, menuH;

    // Компоновка.
    private float s = 1f;
    private float mL, mT;
    private float backX, backY, backW, backH;
    private float addX, addY, addW, addH;
    private float currentY;
    private float dividerY;
    private float otherCapY;
    private float listX, listY, listW, listH;
    private float rowX, rowW, rowH;
    private float moreSize;

    // Клавиатурный фокус: 0 = back, 1 = add, 2+ = строки аккаунтов.
    private int focusIndex = -1;

    public AltManagerScreen(Screen parent) {
        super(Text.of("Accounts"));
        this.parent = parent;
    }

    @Override
    public boolean shouldCloseOnEsc() {
        return false;
    }

    // ===================== Переходы =====================

    private void startExit(Runnable action) {
        if (exitStart >= 0) {
            return;
        }
        exitStart = System.currentTimeMillis();
        exitAction = action;
    }

    private void goBack() {
        if (parent != null) {
            mc.setScreen(parent);
        } else {
            mc.setScreen(new CrickMainMenu());
        }
    }

    // ===================== Рендер =====================

    @Override
    public void renderBackground(DrawContext context, int mouseX, int mouseY, float delta) {
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        int windowWidth = mc.getWindow().getScaledWidth();
        int windowHeight = mc.getWindow().getScaledHeight();

        long now = System.currentTimeMillis();
        dialog.tickSwap();

        float enterRaw = MenuMotion.progress(enteredAt, MenuMotion.SCREEN_ENTER_MS);
        float enter = Easing.QUINTIC_OUT.ease(enterRaw, 0f, 1f, 1f);
        float exitRaw = exitStart < 0 ? 0f : MenuMotion.progress(exitStart, MenuMotion.SCREEN_EXIT_MS);
        float exit = exitRaw >= 1f ? 1f : Easing.QUINTIC_IN.ease(exitRaw, 0f, 1f, 1f);

        if (exitRaw >= 1f && exitAction != null) {
            Runnable action = exitAction;
            exitAction = null;
            exitStart = -1L;
            action.run();
            return;
        }

        float contentAlpha = enter * (1f - exit);
        if (contentAlpha <= 0.001f) {
            return;
        }

        layout(windowWidth, windowHeight);
        float timeSeconds = (now - enteredAt) / 1000f;

        BlurProgram.getInstance().beginFrame();
        MenuDesign.renderBackground(context.getMatrices(), windowWidth, windowHeight,
                timeSeconds, mouseX, mouseY, contentAlpha);

        // Alt Manager входит справа и уходит вправо — «страница» приложения.
        float shiftX = (1f - enter) * 16f + exit * 16f;
        float shiftY = (1f - enter) * MenuMotion.SCREEN_SHIFT - exit * MenuMotion.SCREEN_SHIFT;

        RenderSystem.getModelViewStack().pushMatrix();
        RenderSystem.getModelViewStack().translate(shiftX, shiftY, 0f);

        renderHeader(context, mouseX, mouseY, contentAlpha);
        renderCurrentAccount(context, contentAlpha);
        renderAccountList(context, mouseX, mouseY, now, contentAlpha);
        renderFocusIndicator();
        renderBottomHint(contentAlpha);

        RenderSystem.getModelViewStack().popMatrix();

        dialog.render(context, mouseX, mouseY, windowWidth, windowHeight, 1f);
        MenuDesign.restoreGlState();
    }

    private void layout(float width, float height) {
        s = MenuDesign.scale(width, height);
        mL = 64f * s;
        mT = 34f * s;

        backX = mL;
        backY = mT;
        backW = 110f * s;
        backH = 26f * s;

        addW = 132f * s;
        addH = 30f * s;
        addX = width - mL - addW;
        addY = mT;

        currentY = mT + 96f * s;
        dividerY = currentY + 76f * s;
        otherCapY = dividerY + 16f * s;

        listX = mL;
        listW = 360f * s;
        listY = otherCapY + 12f * s;
        listH = Math.max(40f * s, height - 34f * s - listY);

        rowX = mL;
        rowW = listW;
        rowH = 42f * s;
        moreSize = 34f * s;
    }

    private void renderHeader(DrawContext context, int mouseX, int mouseY, float alpha) {
        // Back.
        boolean backHovered = HoverUtil.isHovered(mouseX, mouseY, backX, backY, backW, backH);
        float bh = backHover.run(backHovered ? 1f : 0f);
        if (bh > 0.01f) {
            DrawUtil.drawRound(backX, backY, backW, backH, 8f * s,
                    ColorUtils.rgba(255, 255, 255, (int) (8 * bh * alpha)));
        }
        int backColor = MenuDesign.withAlpha(backHovered ? MenuDesign.TEXT : MenuDesign.TEXT_2, (int) (235 * alpha));
        MenuDesign.text("←", backX + 10f * s, backY + 2f * s, backColor, 11f * s);
        MenuDesign.text("Back", backX + 26f * s, backY + 2f * s, backColor, 10.5f * s);

        // Заголовок.
        MenuDesign.text("Accounts", mL, backY + 44f * s,
                MenuDesign.withAlpha(MenuDesign.TEXT, (int) (255 * alpha)), 24f * s);
        MenuDesign.text("Profiles & sessions for Crick Client", mL, backY + 78f * s,
                MenuDesign.withAlpha(MenuDesign.TEXT_3, (int) (230 * alpha)), 8.5f * s);

        // Add account — маленькое secondary действие.
        boolean addHovered = HoverUtil.isHovered(mouseX, mouseY, addX, addY, addW, addH);
        float ah = addHover.run(addHovered ? 1f : 0f);
        DrawUtil.drawRound(addX, addY, addW, addH, addH / 2f,
                ColorUtils.rgba(255, 255, 255, (int) ((5 + 5 * ah) * alpha)));
        DrawUtil.drawRoundOutline(addX, addY, addW, addH, addH / 2f, 1f,
                MenuDesign.withAlpha(addHovered ? MenuDesign.ACCENT : 0xFFFFFFFF, (int) ((18 + 40 * ah) * alpha)));
        float plusBox = 9f * s;
        MenuDesign.iconPlus(context.getMatrices(), addX + 16f * s, addY + addH / 2f, plusBox,
                MenuDesign.withAlpha(addHovered ? MenuDesign.ACCENT_BRIGHT : MenuDesign.TEXT_2, (int) (235 * alpha)));
        MenuDesign.text("Add account", addX + 30f * s, addY + 4f * s,
                MenuDesign.withAlpha(addHovered ? MenuDesign.TEXT : MenuDesign.TEXT_2, (int) (235 * alpha)), 9f * s);
    }

    private void renderCurrentAccount(DrawContext context, float alpha) {
        AccountStorage storage = CrickClient.INSTANCE.accountStorage;
        ClientAccount selected = storage == null ? null : storage.getSelected();
        String session = sessionUsername();

        float avatarSize = 54f * s;
        float avatarX = mL;
        float avatarY = currentY;
        float textX = avatarX + avatarSize + 16f * s;

        if (selected != null) {
            DrawUtil.drawPlayerHead(selected.getUsername(), avatarX, avatarY, avatarSize, 14f * s, alpha);
            DrawUtil.drawRoundOutline(avatarX, avatarY, avatarSize, avatarSize, 14f * s, 1.2f,
                    MenuDesign.withAlpha(MenuDesign.ACCENT, (int) (90 * alpha)));

            MenuDesign.text(selected.getUsername(), textX, avatarY - 2f * s,
                    MenuDesign.withAlpha(MenuDesign.TEXT, (int) (255 * alpha)), 17f * s);

            // Капс-подпись и статус-чип.
            MenuDesign.text("CURRENT ACCOUNT", textX, avatarY + 20f * s,
                    MenuDesign.withAlpha(MenuDesign.ACCENT_BRIGHT, (int) (170 * alpha)), 7f * s);

            float chipLabel = "ACTIVE";
            float chipSize = 6.8f * s;
            float chipH = 16f * s;
            float chipW = MenuDesign.textWidth(chipLabel, chipSize) + 22f * s;
            float chipX = textX + MenuDesign.textWidth("CURRENT ACCOUNT", 7f * s) + 12f * s;
            float chipY = avatarY + 19f * s;
            DrawUtil.drawRound(chipX, chipY, chipW, chipH, chipH / 2f,
                    ColorUtils.rgba(0x6C, 0x7B, 0xFF, (int) (18 * alpha)));
            DrawUtil.drawCircle(chipX + 11f * s, chipY + chipH / 2f, 2.5f * s,
                    MenuDesign.withAlpha(MenuDesign.ACCENT_BRIGHT, (int) (220 * alpha)));
            MenuDesign.textCentered(chipLabel, chipX + 17f * s, chipY, chipW - 17f * s, chipH,
                    MenuDesign.withAlpha(MenuDesign.ACCENT_BRIGHT, (int) (200 * alpha)), chipSize);

            if (!session.isEmpty()) {
                MenuDesign.text("Authenticated session: " + session, textX, avatarY + 36f * s,
                        MenuDesign.withAlpha(MenuDesign.TEXT_3, (int) (200 * alpha)), 7.4f * s);
            }
        } else {
            if (session.isEmpty()) {
                DrawUtil.drawRoundOutline(avatarX, avatarY, avatarSize, avatarSize, 14f * s, 1.2f,
                        MenuDesign.withAlpha(MenuDesign.TEXT_3, (int) (50 * alpha)));
                MenuDesign.iconPlus(context.getMatrices(), avatarX + avatarSize / 2f, avatarY + avatarSize / 2f,
                        18f * s, MenuDesign.withAlpha(MenuDesign.TEXT_3, (int) (120 * alpha)));
                MenuDesign.text("No account selected", textX, avatarY - 2f * s,
                        MenuDesign.withAlpha(MenuDesign.TEXT_2, (int) (255 * alpha)), 15f * s);
                MenuDesign.text("Select a profile below or add a new one", textX, avatarY + 20f * s,
                        MenuDesign.withAlpha(MenuDesign.TEXT_3, (int) (200 * alpha)), 8f * s);
            } else {
                DrawUtil.drawPlayerHead(session, avatarX, avatarY, avatarSize, 14f * s, alpha);
                MenuDesign.text(session, textX, avatarY - 2f * s,
                        MenuDesign.withAlpha(MenuDesign.TEXT, (int) (255 * alpha)), 17f * s);
                MenuDesign.text("AUTHENTICATED SESSION", textX, avatarY + 20f * s,
                        MenuDesign.withAlpha(MenuDesign.TEXT_2, (int) (170 * alpha)), 7f * s);
                MenuDesign.text("No selected profile — click an account below", textX, avatarY + 36f * s,
                        MenuDesign.withAlpha(MenuDesign.TEXT_3, (int) (200 * alpha)), 7.4f * s);
            }
        }

        // Разделитель.
        DrawUtil.drawRound(mL, dividerY, rowW, 1f, 0.5f,
                ColorUtils.rgba(255, 255, 255, (int) (12 * alpha)));
        MenuDesign.text("OTHER ACCOUNTS", mL, otherCapY,
                MenuDesign.withAlpha(MenuDesign.TEXT_3, (int) (200 * alpha)), 7f * s);
    }

    private void renderAccountList(DrawContext context, int mouseX, int mouseY, long now, float alpha) {
        AccountStorage storage = CrickClient.INSTANCE.accountStorage;
        if (storage == null) {
            return;
        }
        List<ClientAccount> accounts = storage.getAccounts();

        // Плавный скролл.
        float dt = Math.min(1f, (now - lastFrameTime) / 50f);
        lastFrameTime = now;
        scroll += (scrollTarget - scroll) * Math.min(1f, dt * 0.14f);
        scroll = Math.max(0f, Math.min(scroll, maxScroll(accounts.size())));

        if (accounts.isEmpty()) {
            renderEmptyState(context, mouseX, mouseY, alpha);
            return;
        }

        float y = listY - scroll;
        for (ClientAccount account : accounts) {
            if (y + rowH < listY - 20f * s || y > listY + listH + 20f * s) {
                y += rowH + 5f * s;
                continue;
            }
            renderRow(context, mouseX, mouseY, account, y, alpha);
            y += rowH + 5f * s;
        }

        // Удалённые аккаунты не должны копить анимации ховера.
        if (rowHovers.size() > accounts.size() * 2) {
            rowHovers.keySet().removeIf(id -> {
                for (ClientAccount account : accounts) {
                    if (account.getId().equals(id)) {
                        return false;
                    }
                }
                return true;
            });
        }

        // Меню «…» поверх списка.
        if (openMenuFor != null) {
            renderMoreMenu(context, mouseX, mouseY, alpha);
        }
    }

    private float maxScroll(int count) {
        float content = count * (rowH + 5f * s) - 5f * s;
        return Math.max(0f, content - listH);
    }

    private boolean renderRow(DrawContext context, int mouseX, int mouseY,
                              ClientAccount account, float y, float alpha) {
        AccountStorage storage = CrickClient.INSTANCE.accountStorage;
        boolean selected = storage != null && storage.isSelected(account);
        boolean hovered = HoverUtil.isHovered(mouseX, mouseY, rowX, y, rowW, rowH);

        Animation hoverAnim = rowHovers.computeIfAbsent(account.getId(), k -> MenuMotion.hover());
        float hover = hoverAnim.run(hovered ? 1f : 0f);

        // Фон строки: очень слабый accent для выбранного, лёгкий белый для hover.
        if (selected) {
            DrawUtil.drawRound(rowX, y, rowW, rowH, 10f * s,
                    ColorUtils.rgba(0x6C, 0x7B, 0xFF, (int) (10 * alpha)));
            DrawUtil.drawRoundOutline(rowX, y, rowW, rowH, 10f * s, 1f,
                    ColorUtils.rgba(0x6C, 0x7B, 0xFF, (int) (26 * alpha)));
        } else if (hover > 0.01f) {
            DrawUtil.drawRound(rowX, y, rowW, rowH, 10f * s,
                    ColorUtils.rgba(255, 255, 255, (int) (8 * hover * alpha)));
        }

        float avatarSize = 30f * s;
        float avatarX = rowX + 10f * s;
        float avatarY = y + (rowH - avatarSize) / 2f;
        // Аватар: при hover слегка увеличивается и «подсвечивается».
        float grow = hover * 1.06f;
        float drawnSize = avatarSize * (1f + grow * 0.06f);
        float drawnX = avatarX + (avatarSize - drawnSize) / 2f;
        float drawnY = avatarY + (avatarSize - drawnSize) / 2f;
        DrawUtil.drawPlayerHead(account.getUsername(), drawnX, drawnY, drawnSize, 9f * s, alpha);
        if (selected) {
            DrawUtil.drawRoundOutline(drawnX, drawnY, drawnSize, drawnSize, 9f * s, 1.2f,
                    MenuDesign.withAlpha(MenuDesign.ACCENT_BRIGHT, (int) (150 * alpha)));
        }

        int nameColor = MenuDesign.withAlpha(selected ? MenuDesign.TEXT : MenuDesign.TEXT_2,
                (int) (255 * alpha));
        MenuDesign.text(account.getUsername(), avatarX + avatarSize + 12f * s, y + 3f * s,
                nameColor, 11.5f * s);

        // Маленькая капс-подпись выбранного.
        if (selected) {
            MenuDesign.text("ACTIVE", avatarX + avatarSize + 12f * s, y + 19f * s,
                    MenuDesign.withAlpha(MenuDesign.ACCENT_BRIGHT, (int) (150 * alpha)), 6.4f * s);
        }

        // Кнопка «…» — только при наведении на строку.
        if (hovered) {
            float moreX = rowX + rowW - moreSize - 6f * s;
            float moreY = y + (rowH - moreSize) / 2f;
            boolean moreHovered = HoverUtil.isHovered(mouseX, mouseY, moreX, moreY, moreSize, moreSize);
            if (moreHovered) {
                DrawUtil.drawRound(moreX, moreY, moreSize, moreSize, 8f * s,
                        ColorUtils.rgba(255, 255, 255, (int) (10 * alpha)));
            }
            MenuDesign.text("…", moreX + moreSize / 2f - MenuDesign.textWidth("…", 10f * s) / 2f,
                    moreY + 6f * s, MenuDesign.withAlpha(MenuDesign.TEXT_2, (int) (230 * alpha)), 10f * s);
        }
        return hovered;
    }

    private void renderMoreMenu(DrawContext context, int mouseX, int mouseY, float alpha) {
        AccountStorage storage = CrickClient.INSTANCE.accountStorage;
        if (storage == null) {
            return;
        }
        ClientAccount account = null;
        for (ClientAccount candidate : storage.getAccounts()) {
            if (candidate.getId().equals(openMenuFor)) {
                account = candidate;
                break;
            }
        }
        if (account == null) {
            openMenuFor = null;
            return;
        }

        MenuDesign.drawPanel(context.getMatrices(), menuX, menuY, menuW, menuH, 10f * s, alpha);
        MenuDesign.text(account.getUsername(), menuX + 12f * s, menuY + 6f * s,
                MenuDesign.withAlpha(MenuDesign.TEXT_3, (int) (200 * alpha)), 7f * s);

        float itemH = 26f * s;
        float renameY = menuY + 20f * s;
        float removeY = renameY + itemH;

        boolean renameHovered = HoverUtil.isHovered(mouseX, mouseY, menuX, renameY, menuW, itemH);
        boolean removeHovered = HoverUtil.isHovered(mouseX, mouseY, menuX, removeY, menuW, itemH);
        float rh = renameHover.run(renameHovered ? 1f : 0f);
        float rmv = removeHover.run(removeHovered ? 1f : 0f);
        if (rh > 0.01f) {
            DrawUtil.drawRound(menuX + 4f * s, renameY, menuW - 8f * s, itemH, 6f * s,
                    ColorUtils.rgba(255, 255, 255, (int) (9 * rh * alpha)));
        }
        if (rmv > 0.01f) {
            DrawUtil.drawRound(menuX + 4f * s, removeY, menuW - 8f * s, itemH, 6f * s,
                    ColorUtils.rgba(255, 255, 255, (int) (9 * rmv * alpha)));
        }
        MenuDesign.text("Rename", menuX + 14f * s, renameY + 4f * s,
                MenuDesign.withAlpha(renameHovered ? MenuDesign.TEXT : MenuDesign.TEXT_2, (int) (235 * alpha)), 9f * s);
        MenuDesign.text("Remove", menuX + 14f * s, removeY + 4f * s,
                MenuDesign.withAlpha(removeHovered ? MenuDesign.DANGER : MenuDesign.TEXT_2, (int) (235 * alpha)), 9f * s);
    }

    private void renderEmptyState(DrawContext context, int mouseX, int mouseY, float alpha) {
        float cx = mL + rowW / 2f;
        float cy = listY + listH / 2f;

        MenuDesign.textCentered("No accounts", cx, cy - 46f * s, 0f, 22f * s,
                MenuDesign.withAlpha(MenuDesign.TEXT, (int) (255 * alpha)), 17f * s);
        MenuDesign.textCentered("Add your first Minecraft account to Crick Client",
                cx, cy - 18f * s, 0f, 12f * s,
                MenuDesign.withAlpha(MenuDesign.TEXT_2, (int) (200 * alpha)), 8.5f * s);

        float buttonW = 120f * s;
        float buttonH = 30f * s;
        float buttonX = cx - buttonW / 2f;
        float buttonY = cy + 8f * s;
        boolean hovered = HoverUtil.isHovered(mouseX, mouseY, buttonX, buttonY, buttonW, buttonH);
        float hover = addHover.run(hovered ? 1f : 0f);
        DrawUtil.drawRound(buttonX, buttonY, buttonW, buttonH, buttonH / 2f,
                ColorUtils.rgba(0x6C, 0x7B, 0xFF, (int) ((170 + 60 * hover) * alpha)));
        MenuDesign.textCentered("Add account", buttonX, buttonY, buttonW, buttonH,
                MenuDesign.withAlpha(0xFFFFFFFF, (int) (245 * alpha)), 9f * s);
    }

    private void renderBottomHint(float alpha) {
        if (alpha <= 0.01f) {
            return;
        }
        int height = mc.getWindow().getScaledHeight();
        MenuDesign.text("Select a profile — online play still uses your authenticated launcher session",
                mL, height - 24f * s, MenuDesign.withAlpha(MenuDesign.TEXT_3, (int) (160 * alpha)), 7f * s);
    }

    private void renderFocusIndicator() {
        if (focusIndex < 0) {
            return;
        }
        float x;
        float y;
        float w;
        float h;
        if (focusIndex == 0) {
            x = backX;
            y = backY;
            w = backW;
            h = backH;
        } else if (focusIndex == 1) {
            x = addX;
            y = addY;
            w = addW;
            h = addH;
        } else {
            AccountStorage storage = CrickClient.INSTANCE.accountStorage;
            if (storage == null) {
                return;
            }
            int rowIndex = focusIndex - 2;
            List<ClientAccount> accounts = storage.getAccounts();
            if (rowIndex < 0 || rowIndex >= accounts.size()) {
                return;
            }
            x = rowX;
            y = listY - scroll + rowIndex * (rowH + 5f * s);
            w = rowW;
            h = rowH;
        }
        DrawUtil.drawRoundOutline(x - 1.5f, y - 1.5f, w + 3f, h + 3f, 10f * s, 1.2f,
                MenuDesign.withAlpha(MenuDesign.ACCENT_BRIGHT, 110));
    }

    // ===================== Ввод =====================

    @Override
    public boolean mouseClicked(double mouseX, double mouseY, int button) {
        if (exitStart >= 0) {
            return true;
        }
        if (dialog.isOpen()) {
            dialog.mouseClicked(mouseX, mouseY, button);
            return true;
        }
        if (button != 0) {
            return super.mouseClicked(mouseX, mouseY, button);
        }

        // Клик вне меню «…» закрывает его; пункты меню имеют приоритет над строками.
        if (openMenuFor != null) {
            boolean insideMenu = HoverUtil.isHovered(mouseX, mouseY, menuX, menuY, menuW, menuH);
            if (insideMenu) {
                float renameY = menuY + 20f * s;
                float removeY = renameY + 26f * s;
                if (HoverUtil.isHovered(mouseX, mouseY, menuX, renameY, menuW, 26f * s)) {
                    ClientAccount target = findAccount(openMenuFor);
                    if (target != null) {
                        dialog.open(AddAccountDialog.Mode.RENAME, target, () -> openMenuFor = null);
                    }
                    return true;
                }
                if (HoverUtil.isHovered(mouseX, mouseY, menuX, removeY, menuW, 26f * s)) {
                    ClientAccount target = findAccount(openMenuFor);
                    if (target != null) {
                        dialog.open(AddAccountDialog.Mode.REMOVE, target, () -> openMenuFor = null);
                    }
                    return true;
                }
                return true;
            }
            openMenuFor = null;
        }

        if (HoverUtil.isHovered(mouseX, mouseY, backX, backY, backW, backH)) {
            startExit(this::goBack);
            return true;
        }
        if (HoverUtil.isHovered(mouseX, mouseY, addX, addY, addW, addH)) {
            openAddDialog();
            return true;
        }

        AccountStorage storage = CrickClient.INSTANCE.accountStorage;
        if (storage == null) {
            return super.mouseClicked(mouseX, mouseY, button);
        }
        List<ClientAccount> accounts = storage.getAccounts();
        if (accounts.isEmpty()) {
            float cx = mL + rowW / 2f;
            float buttonW = 120f * s;
            float buttonH = 30f * s;
            float buttonX = cx - buttonW / 2f;
            float buttonY = listY + listH / 2f + 8f * s;
            if (HoverUtil.isHovered(mouseX, mouseY, buttonX, buttonY, buttonW, buttonH)) {
                openAddDialog();
                return true;
            }
            return super.mouseClicked(mouseX, mouseY, button);
        }

        float y = listY - scroll;
        for (ClientAccount account : accounts) {
            boolean rowHovered = HoverUtil.isHovered(mouseX, mouseY, rowX, y, rowW, rowH);
            if (rowHovered) {
                float moreX = rowX + rowW - moreSize - 6f * s;
                float moreY = y + (rowH - moreSize) / 2f;
                if (HoverUtil.isHovered(mouseX, mouseY, moreX, moreY, moreSize, moreSize)) {
                    openMenuFor = (openMenuFor != null && openMenuFor.equals(account.getId()))
                            ? null : account.getId();
                    if (openMenuFor != null) {
                        menuW = 132f * s;
                        menuH = 66f * s;
                        menuX = moreX - menuW + moreSize;
                        menuY = moreY + moreSize + 2f * s;
                        // Меню не должно вылезать за края окна.
                        int winW = mc.getWindow().getScaledWidth();
                        int winH = mc.getWindow().getScaledHeight();
                        menuX = MathHelper.clamp(menuX, 4f * s, winW - menuW - 4f * s);
                        menuY = MathHelper.clamp(menuY, 4f * s, winH - menuH - 4f * s);
                    }
                    return true;
                }
                // Клик по аккаунту = выбор.
                storage.selectAccount(account.getId());
                return true;
            }
            y += rowH + 5f * s;
        }
        return super.mouseClicked(mouseX, mouseY, button);
    }

    private ClientAccount findAccount(String id) {
        AccountStorage storage = CrickClient.INSTANCE.accountStorage;
        if (storage == null) {
            return null;
        }
        for (ClientAccount account : storage.getAccounts()) {
            if (account.getId().equals(id)) {
                return account;
            }
        }
        return null;
    }

    private void openAddDialog() {
        dialog.open(AddAccountDialog.Mode.ADD, null, null);
    }

    @Override
    public boolean mouseScrolled(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
        if (dialog.isOpen()) {
            return true;
        }
        AccountStorage storage = CrickClient.INSTANCE.accountStorage;
        if (storage == null || storage.getAccounts().isEmpty()) {
            return super.mouseScrolled(mouseX, mouseY, horizontalAmount, verticalAmount);
        }
        if (HoverUtil.isHovered(mouseX, mouseY, listX, listY, listW, listH)) {
            scrollTarget -= verticalAmount * 18f * s;
            scrollTarget = MathHelper.clamp(scrollTarget, 0f, maxScroll(storage.getAccounts().size()));
            return true;
        }
        return super.mouseScrolled(mouseX, mouseY, horizontalAmount, verticalAmount);
    }

    @Override
    public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
        if (exitStart >= 0) {
            return true;
        }
        if (dialog.isOpen()) {
            dialog.keyPressed(keyCode, scanCode, modifiers);
            return true;
        }
        if (keyCode == GLFW.GLFW_KEY_ESCAPE) {
            if (openMenuFor != null) {
                openMenuFor = null;
                return true;
            }
            startExit(this::goBack);
            return true;
        }
        boolean shift = (modifiers & GLFW.GLFW_MOD_SHIFT) != 0;
        if (keyCode == GLFW.GLFW_KEY_TAB) {
            moveFocus(shift ? -1 : 1);
            return true;
        }
        if (keyCode == GLFW.GLFW_KEY_UP || keyCode == GLFW.GLFW_KEY_DOWN) {
            moveFocus(keyCode == GLFW.GLFW_KEY_UP ? -1 : 1);
            return true;
        }
        if (keyCode == GLFW.GLFW_KEY_ENTER || keyCode == GLFW.GLFW_KEY_KP_ENTER
                || keyCode == GLFW.GLFW_KEY_SPACE) {
            if (focusIndex >= 0) {
                activateFocus(focusIndex);
                return true;
            }
        }
        return super.keyPressed(keyCode, scanCode, modifiers);
    }

    @Override
    public boolean charTyped(char chr, int modifiers) {
        if (dialog.isOpen()) {
            dialog.charTyped(chr, modifiers);
            return true;
        }
        return super.charTyped(chr, modifiers);
    }

    private int focusableCount() {
        AccountStorage storage = CrickClient.INSTANCE.accountStorage;
        return 2 + (storage == null ? 0 : storage.getAccounts().size());
    }

    private void moveFocus(int direction) {
        int count = focusableCount();
        if (focusIndex < 0) {
            focusIndex = direction < 0 ? count - 1 : 0;
        } else {
            focusIndex = (focusIndex + direction + count) % count;
        }
    }

    private void activateFocus(int index) {
        if (index == 0) {
            startExit(this::goBack);
            return;
        }
        if (index == 1) {
            openAddDialog();
            return;
        }
        AccountStorage storage = CrickClient.INSTANCE.accountStorage;
        if (storage == null) {
            return;
        }
        List<ClientAccount> accounts = storage.getAccounts();
        int rowIndex = index - 2;
        if (rowIndex >= 0 && rowIndex < accounts.size()) {
            storage.selectAccount(accounts.get(rowIndex).getId());
        }
    }

    private String sessionUsername() {
        try {
            if (mc.getSession() != null && mc.getSession().getUsername() != null
                    && !mc.getSession().getUsername().isEmpty()) {
                return mc.getSession().getUsername();
            }
        } catch (Exception ignored) {
        }
        return "";
    }
}

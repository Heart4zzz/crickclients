package fun.crickclient.client.ui.menu;

import com.mojang.blaze3d.systems.RenderSystem;
import fun.crickclient.CrickClient;
import fun.crickclient.api.QClient;
import fun.crickclient.api.utils.client.ClientAccount;
import fun.crickclient.api.utils.color.ColorUtils;
import fun.crickclient.api.utils.render.blur.BlurProgram;
import fun.crickclient.client.ui.clickgui.util.Animation;
import fun.crickclient.client.ui.clickgui.util.DrawUtil;
import fun.crickclient.client.ui.clickgui.util.Easing;
import fun.crickclient.client.ui.clickgui.util.HoverUtil;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.multiplayer.MultiplayerScreen;
import net.minecraft.client.gui.screen.option.OptionsScreen;
import net.minecraft.client.gui.screen.world.SelectWorldScreen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.glfw.GLFW;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 * Главное меню клиента — «клиентский desktop».
 * <p>
 * Не вертикальный список одинаковых кнопок, а композиция: живой кинематографичный
 * фон, реальные часы/дата, приветствие с micro-animation, primary action (Play),
 * вторичная навигация и честная системная информация. Все переходы — через
 * единый motion-язык {@link MenuMotion}.
 */
public class CrickMainMenu extends Screen implements QClient {

    private static final String WELCOME = "Welcome";

    private static boolean welcomeEverPlayed;
    private static String cachedClientVersion;
    private static String cachedMinecraftVersion;

    private long enteredAt = System.currentTimeMillis();
    private boolean hasEnteredOnce;
    /** Горизонтальный сдвиг входа: возврат из Alt Manager — страница въезжает слева. */
    private float enterOffsetX;
    private static final float EXIT_OFFSET_X = -16f;
    /** Печатается ли «Welcome» по буквам (только при первом показе за сессию). */
    private final boolean typeWelcome;
    private long exitStart = -1L;
    private Runnable exitAction;

    // Анимации hover (единый тайминг — MenuMotion.HOVER_MS).
    private final Animation playHover = MenuMotion.hover();
    private final Animation serversHover = MenuMotion.hover();
    private final Animation accountsHover = MenuMotion.hover();
    private final Animation settingsHover = MenuMotion.hover();
    private final Animation quitHover = MenuMotion.hover();
    private final Animation accountChipHover = MenuMotion.hover();

    // Кэш часов: строка пересобирается только при смене минуты/дня.
    private int lastClockKey = -1;
    private int lastDayKey = -1;
    private String clockText = "";
    private String dateText = "";
    // Кэш строк системной информации (не собираем каждый кадр).
    private String welcomeCaptionText = "";
    private String bottomLeftText = "";
    private String bottomRightText = "";
    private String cachedSession = "";

    // Клавиатурная навигация (Tab / Shift+Tab / Enter / стрелки).
    private static final int FOCUS_COUNT = 5;
    private int focusIndex = -1;

    // Позиции последней компоновки — для кликов и ховеров.
    private float s = 1f;
    private float mL;
    private float mT;
    private boolean compact;
    private float brandTile;
    private float clockRightX;
    private float clockY;
    private float welcomeY;
    private float captionY;
    private float playX, playY, playW, playH;
    private float rowX, rowW, rowH;
    private float serversY, accountsY, settingsY;
    private float quitY, quitH;
    private float chipX, chipY, chipW, chipH;
    private float bottomBarY;

    public CrickMainMenu() {
        super(Text.of("Crick Client"));
        typeWelcome = !welcomeEverPlayed;
        welcomeEverPlayed = true;
    }

    // ===================== Жизненный цикл =====================

    @Override
    public boolean shouldCloseOnEsc() {
        return false;
    }

    @Override
    public void init() {
        super.init();
        if (hasEnteredOnce) {
            // Возврат из Alt Manager: повторный плавный вход страницы слева.
            enteredAt = System.currentTimeMillis();
            enterOffsetX = -16f;
        }
        hasEnteredOnce = true;
    }

    @Override
    public void tick() {
        super.tick();
        updateClock();
    }

    private void updateClock() {
        try {
            String session = sessionUsername();
            if (!session.equals(cachedSession)) {
                cachedSession = session;
                welcomeCaptionText = "Crick Client v" + clientVersion();
                bottomLeftText = "CRICK CLIENT v" + clientVersion();
                bottomRightText = "MINECRAFT " + minecraftVersion()
                        + (session.isEmpty() ? "" : " · SESSION " + session);
            }
            LocalTime time = LocalTime.now();
            int clockKey = time.getHour() * 60 + time.getMinute();
            if (clockKey != lastClockKey) {
                lastClockKey = clockKey;
                clockText = time.format(DateTimeFormatter.ofPattern("HH:mm", Locale.getDefault()));
            }
            int dayKey = time.getDayOfYear();
            if (dayKey != lastDayKey) {
                lastDayKey = dayKey;
                LocalDate date = LocalDate.now();
                String day = date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());
                String month = date.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault());
                dateText = day + ", " + date.getDayOfMonth() + " " + month;
            }
        } catch (Exception ignored) {
        }
    }

    // ===================== Переходы =====================

    private void startExit(Runnable action) {
        if (exitStart >= 0) {
            return;
        }
        exitStart = System.currentTimeMillis();
        exitAction = action;
    }

    private void openWorlds() {
        mc.setScreen(new SelectWorldScreen(this));
    }

    private void openMultiplayer() {
        mc.setScreen(new MultiplayerScreen(this));
    }

    private void openAccounts() {
        mc.setScreen(new AltManagerScreen(this));
    }

    private void openOptions() {
        mc.setScreen(new OptionsScreen(this, mc.options));
    }

    private void quitGame() {
        mc.scheduleStop();
    }

    // ===================== Данные =====================

    private ClientAccount selectedAccount() {
        try {
            if (CrickClient.INSTANCE.accountStorage == null) {
                return null;
            }
            return CrickClient.INSTANCE.accountStorage.getSelected();
        } catch (Exception ignored) {
            return null;
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

    static String clientVersion() {
        if (cachedClientVersion == null) {
            try {
                cachedClientVersion = FabricLoader.getInstance()
                        .getModContainer("crickclient")
                        .map(container -> container.getMetadata().getVersion().getFriendlyString())
                        .orElse("1.0.0");
            } catch (Exception ignored) {
                cachedClientVersion = "1.0.0";
            }
        }
        return cachedClientVersion;
    }

    static String minecraftVersion() {
        if (cachedMinecraftVersion == null) {
            try {
                cachedMinecraftVersion = FabricLoader.getInstance()
                        .getModContainer("minecraft")
                        .map(container -> container.getMetadata().getVersion().getFriendlyString())
                        .orElse("1.21.4");
            } catch (Exception ignored) {
                cachedMinecraftVersion = "1.21.4";
            }
        }
        return cachedMinecraftVersion;
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

        // Прогресс входа/выхода экрана.
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

        // Кинематографичный фон — рисуется без сдвига, на весь экран.
        BlurProgram.getInstance().beginFrame();
        MenuDesign.renderBackground(context.getMatrices(), windowWidth, windowHeight,
                timeSeconds, mouseX, mouseY, contentAlpha);

        // Контент: вход — лёгкий подъём (8px) + горизонтальный сдвиг страницы,
        // выход — уход назад/влево.
        float shiftY = (1f - enter) * MenuMotion.SCREEN_SHIFT - exit * MenuMotion.SCREEN_SHIFT;
        float shiftX = (1f - enter) * enterOffsetX + exit * EXIT_OFFSET_X;

        RenderSystem.getModelViewStack().pushMatrix();
        RenderSystem.getModelViewStack().translate(shiftX, shiftY, 0f);

        renderBrand(contentAlpha * elementAlpha(120L));
        renderClockCluster(context, mouseX, mouseY, contentAlpha * elementAlpha(160L));
        renderWelcome(contentAlpha, now);
        renderNavigation(context, mouseX, mouseY, contentAlpha);
        renderBottomBar(contentAlpha);

        RenderSystem.getModelViewStack().popMatrix();
        MenuDesign.restoreGlState();
    }

    private float elementAlpha(long delayMs) {
        long elapsed = System.currentTimeMillis() - enteredAt - delayMs;
        if (elapsed <= 0) {
            return 0f;
        }
        float progress = MathHelper.clamp(elapsed / 300f, 0f, 1f);
        return Easing.CUBIC_OUT.ease(progress, 0f, 1f, 1f);
    }

    private void layout(float width, float height) {
        s = MenuDesign.scale(width, height);
        compact = MenuDesign.compact(s);
        mL = 56f * s;
        mT = 34f * s;
        brandTile = 30f * s;
        clockRightX = width - mL;
        clockY = mT - 2f * s;
        welcomeY = mT + 56f * s;
        captionY = welcomeY + 33f * s;
        float navY = compact ? captionY + 22f * s : captionY + 40f * s;

        playX = mL;
        playY = navY;
        playW = 292f * s;
        playH = compact ? 46f * s : 54f * s;

        rowX = mL;
        rowW = playW;
        rowH = compact ? 32f * s : 38f * s;
        float rowTop = playY + playH + (compact ? 8f : 12f) * s;
        serversY = rowTop;
        accountsY = serversY + rowH + 4f * s;
        settingsY = accountsY + rowH + 4f * s;

        quitY = settingsY + rowH + (compact ? 6f : 12f) * s;
        quitH = compact ? 24f * s : 30f * s;

        chipW = 180f * s;
        chipH = 34f * s;
        chipX = width - mL - chipW;
        chipY = clockY + 66f * s;

        bottomBarY = height - 21f * s;
    }

    // ===================== Бренд =====================

    private void renderBrand(float alpha) {
        if (alpha <= 0.01f) {
            return;
        }
        float tileX = mL;
        float tileY = mT;
        float tile = brandTile;
        float tileRadius = 9f * s;

        DrawUtil.drawRound(tileX, tileY, tile, tile, tileRadius,
                ColorUtils.rgba(0x6C, 0x7B, 0xFF, (int) (255 * alpha)),
                ColorUtils.rgba(0x93, 0xA0, 0xFF, (int) (255 * alpha)),
                ColorUtils.rgba(0x4A, 0x57, 0xD8, (int) (255 * alpha)),
                ColorUtils.rgba(0x4A, 0x57, 0xD8, (int) (255 * alpha)));
        MenuDesign.textCentered("C", tileX, tileY, tile, tile,
                MenuDesign.withAlpha(0xFFF2F4FF, (int) (255 * alpha)), 13f * s);

        float wordX = tileX + tile + 11f * s;
        MenuDesign.text("CRICK", wordX, tileY + 2f * s,
                MenuDesign.withAlpha(MenuDesign.TEXT, (int) (255 * alpha)), 11f * s);

        String chipLabel = "1.21.4";
        float chipSize = 6.6f * s;
        float chipPadX = 7f * s;
        float chipHeight = 14f * s;
        float chipWidth = MenuDesign.textWidth(chipLabel, chipSize) + chipPadX * 2f;
        float chipXLocal = wordX + MenuDesign.textWidth("CRICK", 11f * s) + 12f * s;
        float chipYLocal = tileY + (tile - chipHeight) / 2f;

        DrawUtil.drawRound(chipXLocal, chipYLocal, chipWidth, chipHeight, chipHeight / 2f,
                ColorUtils.rgba(255, 255, 255, (int) (6 * alpha)));
        DrawUtil.drawRoundOutline(chipXLocal, chipYLocal, chipWidth, chipHeight, chipHeight / 2f, 1f,
                ColorUtils.rgba(255, 255, 255, (int) (14 * alpha)));
        MenuDesign.textCentered(chipLabel, chipXLocal, chipYLocal, chipWidth, chipHeight,
                MenuDesign.withAlpha(MenuDesign.TEXT_3, (int) (255 * alpha)), chipSize);
    }

    // ===================== Часы / дата / аккаунт =====================

    private void renderClockCluster(DrawContext context, int mouseX, int mouseY, float alpha) {
        if (alpha <= 0.01f) {
            return;
        }
        float rightX = clockRightX;

        MenuDesign.textRight(clockText.isEmpty() ? "00:00" : clockText, rightX, clockY, 32f * s,
                MenuDesign.withAlpha(MenuDesign.TEXT, (int) (255 * alpha)), 27f * s);
        if (!compact) {
            MenuDesign.textRight(dateText.isEmpty() ? " " : dateText, rightX, clockY + 34f * s, 14f * s,
                    MenuDesign.withAlpha(MenuDesign.TEXT_2, (int) (200 * alpha)), 9.5f * s);
        }

        float dividerY = clockY + (compact ? 36f : 52f) * s;
        float dividerW = 130f * s;
        DrawUtil.drawRound(rightX - dividerW, dividerY, dividerW, 1f, 0.5f,
                ColorUtils.rgba(255, 255, 255, (int) (12 * alpha)));

        boolean hovered = HoverUtil.isHovered(mouseX, mouseY, chipX, chipY, chipW, chipH);
        float hover = accountChipHover.run(hovered ? 1f : 0f);
        if (hover > 0.01f) {
            DrawUtil.drawRound(chipX, chipY, chipW, chipH, 10f * s,
                    ColorUtils.rgba(255, 255, 255, (int) ((8 + 6 * hover) * alpha)));
        }

        ClientAccount selected = selectedAccount();
        float avatarSize = 26f * s;
        float avatarX = chipX + chipW - avatarSize;
        float avatarY = chipY + (chipH - avatarSize) / 2f;
        float nameRight = avatarX - 10f * s;
        float nameMaxW = chipW - avatarSize - 14f * s;

        if (selected != null) {
            DrawUtil.drawPlayerHead(selected.getUsername(), avatarX, avatarY, avatarSize, 8f * s, alpha);
            String name = truncate(selected.getUsername(), nameMaxW, 10.5f * s);
            MenuDesign.textRight(name, nameRight, chipY, 18f * s,
                    MenuDesign.withAlpha(MenuDesign.TEXT, (int) (255 * alpha)), 10.5f * s);
            MenuDesign.textRight("SELECTED PROFILE", nameRight, chipY + 18f * s, 10f * s,
                    MenuDesign.withAlpha(MenuDesign.ACCENT_BRIGHT, (int) (150 * alpha)), 6.4f * s);
        } else {
            DrawUtil.drawRoundOutline(avatarX, avatarY, avatarSize, avatarSize, 8f * s, 1.2f,
                    MenuDesign.withAlpha(MenuDesign.ACCENT, (int) (70 * alpha)));
            MenuDesign.iconPlus(context.getMatrices(), avatarX + avatarSize / 2f, avatarY + avatarSize / 2f,
                    10f * s, MenuDesign.withAlpha(MenuDesign.ACCENT_BRIGHT, (int) (140 * alpha)));

            String label = truncate("No account selected", nameMaxW, 10f * s);
            MenuDesign.textRight(label, nameRight, chipY + 2f * s, 16f * s,
                    MenuDesign.withAlpha(MenuDesign.TEXT_2, (int) (235 * alpha)), 10f * s);
            String session = sessionUsername();
            String hint = session.isEmpty() ? "OPEN ACCOUNTS" : "OPEN ACCOUNTS · SESSION " + session;
            MenuDesign.textRight(hint, nameRight, chipY + 18f * s, 10f * s,
                    MenuDesign.withAlpha(MenuDesign.TEXT_3, (int) (190 * alpha)), 6.4f * s);
        }
    }

    private static String truncate(String value, float maxWidth, float size) {
        if (MenuDesign.textWidth(value, size) <= maxWidth) {
            return value;
        }
        String candidate = value;
        while (candidate.length() > 3 && MenuDesign.textWidth(candidate + "…", size) > maxWidth) {
            candidate = candidate.substring(0, candidate.length() - 1);
        }
        return candidate + "…";
    }

    // ===================== Приветствие =====================

    private void renderWelcome(float globalAlpha, long now) {
        if (globalAlpha <= 0.01f) {
            return;
        }
        long elapsed = now - enteredAt;
        int fullLength = WELCOME.length();
        int typed = typeWelcome
                ? Math.min(fullLength, (int) (elapsed / 64L))
                : fullLength;

        MenuDesign.text(WELCOME.substring(0, typed), mL, welcomeY,
                MenuDesign.withAlpha(MenuDesign.TEXT, (int) (255 * globalAlpha)), 26f * s);

        // После «Welcome» плавно проявляется имя игрока.
        String session = sessionUsername();
        if (!session.isEmpty()) {
            float nameFade = typeWelcome
                    ? MathHelper.clamp((elapsed - fullLength * 64L) / 320f, 0f, 1f)
                    : 1f;
            nameFade = Easing.CUBIC_OUT.ease(nameFade, 0f, 1f, 1f);
            if (nameFade > 0.01f) {
                String nameText = ", " + session;
                float x = mL + MenuDesign.textWidth(WELCOME.substring(0, typed), 26f * s) + 2f * s;
                MenuDesign.text(nameText, x, welcomeY,
                        MenuDesign.withAlpha(MenuDesign.TEXT_2, (int) (255 * globalAlpha * nameFade)), 26f * s);
            }
        }

        if (!compact) {
            MenuDesign.text(welcomeCaptionText, mL, captionY,
                    MenuDesign.withAlpha(MenuDesign.TEXT_3, (int) (255 * globalAlpha * elementAlpha(360L))), 8.5f * s);
        }
    }

    // ===================== Навигация =====================

    private void renderNavigation(DrawContext context, int mouseX, int mouseY, float alpha) {
        if (alpha <= 0.01f) {
            return;
        }

        renderPlay(context, mouseX, mouseY, alpha * elementAlpha(440L));

        float rowA = alpha * elementAlpha(540L);
        renderRow(context, mouseX, mouseY, serversY, 1, "Servers", "Multiplayer",
                MenuDesign::iconServers, rowA);
        renderRow(context, mouseX, mouseY, accountsY, 2, "Accounts", "Profiles & sessions",
                MenuDesign::iconAccount, rowA);
        renderRow(context, mouseX, mouseY, settingsY, 3, "Settings", "Options",
                MenuDesign::iconSettings, rowA);

        float quitA = alpha * elementAlpha(760L);
        float dividerY = settingsY + rowH + (compact ? 6f : 10f) * s;
        DrawUtil.drawRound(mL + 8f * s, dividerY, rowW - 16f * s, 1f, 0.5f,
                ColorUtils.rgba(255, 255, 255, (int) (12 * quitA)));

        // ---- Quit (спокойный текстовый элемент) ----
        boolean quitHovered = HoverUtil.isHovered(mouseX, mouseY, mL, quitY, rowW, quitH);
        float qh = quitHover.run(quitHovered ? 1f : 0f);
        if (qh > 0.01f) {
            DrawUtil.drawRound(mL, quitY, rowW, quitH, 8f * s,
                    ColorUtils.rgba(255, 255, 255, (int) (6 * qh * quitA)));
        }
        float iconBox = 16f * s;
        int quitColor = MenuDesign.withAlpha(quitHovered ? MenuDesign.TEXT_2 : MenuDesign.TEXT_3,
                (int) (235 * quitA));
        MenuDesign.iconPower(context.getMatrices(), mL + 12f * s, quitY + (quitH - iconBox) / 2f, iconBox, quitColor);
        MenuDesign.text("Quit", mL + 12f * s + iconBox + 10f * s, quitY + 2f * s, quitColor, 10f * s);
        if (qh > 0.01f) {
            DrawUtil.drawRound(mL + 12f * s + iconBox + 10f * s, quitY + quitH - 5f * s,
                    20f * s, 2f * s, 1f * s,
                    MenuDesign.withAlpha(MenuDesign.ACCENT, (int) (150 * qh * quitA)));
        }

        renderFocusRing();
    }

    private void renderPlay(DrawContext context, int mouseX, int mouseY, float alpha) {
        if (alpha <= 0.01f) {
            return;
        }
        boolean hovered = HoverUtil.isHovered(mouseX, mouseY, playX, playY, playW, playH);
        float hover = playHover.run(hovered ? 1f : 0f);

        // Материал + фирменная подложка.
        MenuDesign.drawPanel(context.getMatrices(), playX, playY, playW, playH, 14f * s, alpha);
        DrawUtil.drawRound(playX, playY, playW, playH, 14f * s,
                ColorUtils.rgba(0x6C, 0x7B, 0xFF, (int) ((16 + 18 * hover) * alpha)));
        // Акцентная кромка слева.
        DrawUtil.drawRound(playX, playY + 11f * s, 3f * s, playH - 22f * s, 1.5f * s,
                MenuDesign.withAlpha(MenuDesign.ACCENT_BRIGHT, (int) (170 * alpha)));
        if (hover > 0.01f) {
            DrawUtil.drawRoundOutline(playX, playY, playW, playH, 14f * s, 1f,
                    MenuDesign.withAlpha(MenuDesign.ACCENT, (int) (70 * hover * alpha)));
        }

        float textX = playX + 20f * s;
        MenuDesign.text("Play", textX, playY + (compact ? 8f : 10f) * s,
                MenuDesign.withAlpha(MenuDesign.TEXT, (int) (255 * alpha)), 13.5f * s);
        if (!compact) {
            MenuDesign.text("Continue your Minecraft journey", textX, playY + 29f * s,
                    MenuDesign.withAlpha(MenuDesign.TEXT_2, (int) (200 * alpha)), 8f * s);
        }

        // Стрелка: при hover сдвигается и становится ярче.
        float arrowSize = 12f * s;
        float arrowX = playX + playW - 24f * s - hover * 4f * s;
        int arrowColor = ColorUtils.gradient(MenuDesign.TEXT_2, MenuDesign.TEXT, hover);
        MenuDesign.text("→", arrowX, playY + (playH - 16f * s) / 2f,
                MenuDesign.withAlpha(arrowColor, (int) (255 * alpha)), arrowSize);
    }

    private interface RowIcon {
        void draw(MatrixStack matrices, float x, float y, float box, int color);
    }

    private void renderRow(DrawContext context, int mouseX, int mouseY, float y, int index,
                           String label, String caption, RowIcon icon, float alpha) {
        if (alpha <= 0.01f) {
            return;
        }
        boolean hovered = HoverUtil.isHovered(mouseX, mouseY, rowX, y, rowW, rowH);
        Animation anim = switch (index) {
            case 1 -> serversHover;
            case 2 -> accountsHover;
            default -> settingsHover;
        };
        float hover = anim.run(hovered ? 1f : 0f);

        if (hover > 0.01f) {
            DrawUtil.drawRound(rowX, y, rowW, rowH, 9f * s,
                    ColorUtils.rgba(255, 255, 255, (int) (9 * hover * alpha)));
            DrawUtil.drawRoundOutline(rowX, y, rowW, rowH, 9f * s, 1f,
                    ColorUtils.rgba(255, 255, 255, (int) (14 * hover * alpha)));
        }

        float iconBox = 20f * s;
        float iconX = rowX + 13f * s;
        float iconY = y + (rowH - iconBox) / 2f;
        int iconColor = MenuDesign.withAlpha(hovered ? MenuDesign.TEXT : MenuDesign.TEXT_2,
                (int) (220 * alpha));
        icon.draw(context.getMatrices(), iconX, iconY, iconBox, iconColor);

        float labelX = iconX + iconBox + 11f * s;
        MenuDesign.text(label, labelX, y + 2f * s,
                MenuDesign.withAlpha(hovered ? MenuDesign.TEXT : MenuDesign.TEXT_2, (int) (255 * alpha)),
                11.5f * s);

        if (!compact) {
            MenuDesign.textRight(caption, rowX + rowW - 20f * s, y, rowH,
                    MenuDesign.withAlpha(MenuDesign.TEXT_3, (int) (200 * alpha)), 7.4f * s);
        }
    }

    private void renderFocusRing() {
        if (focusIndex < 0 || focusIndex >= FOCUS_COUNT) {
            return;
        }
        float x;
        float y;
        float w;
        float h;
        switch (focusIndex) {
            case 0 -> {
                x = playX;
                y = playY;
                w = playW;
                h = playH;
            }
            case 1 -> {
                x = rowX;
                y = serversY;
                w = rowW;
                h = rowH;
            }
            case 2 -> {
                x = rowX;
                y = accountsY;
                w = rowW;
                h = rowH;
            }
            case 3 -> {
                x = rowX;
                y = settingsY;
                w = rowW;
                h = rowH;
            }
            default -> {
                x = rowX;
                y = quitY;
                w = rowW;
                h = quitH;
            }
        }
        DrawUtil.drawRoundOutline(x - 1.5f, y - 1.5f, w + 3f, h + 3f, 14f * s, 1.2f,
                MenuDesign.withAlpha(MenuDesign.ACCENT_BRIGHT, 120));
    }

    // ===================== Нижняя статус-панель =====================

    private void renderBottomBar(float alpha) {
        if (alpha <= 0.01f) {
            return;
        }
        int width = mc.getWindow().getScaledWidth();
        float y = bottomBarY;

        DrawUtil.drawRound(mL, y, width - mL * 2f, 1f, 0.5f,
                ColorUtils.rgba(255, 255, 255, (int) (9 * alpha)));

        MenuDesign.text(bottomLeftText, mL + 4f * s, y + 5f * s,
                MenuDesign.withAlpha(MenuDesign.TEXT_3, (int) (255 * alpha)), 7f * s);

        MenuDesign.textRight(bottomRightText, width - mL - 4f * s, y + 5f * s,
                MenuDesign.withAlpha(MenuDesign.TEXT_3, (int) (255 * alpha)), 7f * s);
    }

    // ===================== Ввод =====================

    @Override
    public boolean mouseClicked(double mouseX, double mouseY, int button) {
        if (button != 0 || exitStart >= 0) {
            return super.mouseClicked(mouseX, mouseY, button);
        }
        if (HoverUtil.isHovered(mouseX, mouseY, chipX, chipY, chipW, chipH)) {
            startExit(this::openAccounts);
            return true;
        }
        if (HoverUtil.isHovered(mouseX, mouseY, playX, playY, playW, playH)) {
            startExit(this::openWorlds);
            return true;
        }
        if (HoverUtil.isHovered(mouseX, mouseY, rowX, serversY, rowW, rowH)) {
            startExit(this::openMultiplayer);
            return true;
        }
        if (HoverUtil.isHovered(mouseX, mouseY, rowX, accountsY, rowW, rowH)) {
            startExit(this::openAccounts);
            return true;
        }
        if (HoverUtil.isHovered(mouseX, mouseY, rowX, settingsY, rowW, rowH)) {
            startExit(this::openOptions);
            return true;
        }
        if (HoverUtil.isHovered(mouseX, mouseY, rowX, quitY, rowW, quitH)) {
            startExit(this::quitGame);
            return true;
        }
        return super.mouseClicked(mouseX, mouseY, button);
    }

    @Override
    public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
        if (exitStart >= 0) {
            return true;
        }
        boolean shift = (modifiers & GLFW.GLFW_MOD_SHIFT) != 0;
        if (keyCode == GLFW.GLFW_KEY_TAB) {
            if (focusIndex < 0) {
                focusIndex = shift ? FOCUS_COUNT - 1 : 0;
            } else if (shift) {
                focusIndex = (focusIndex + FOCUS_COUNT - 1) % FOCUS_COUNT;
            } else {
                focusIndex = (focusIndex + 1) % FOCUS_COUNT;
            }
            return true;
        }
        if (keyCode == GLFW.GLFW_KEY_ENTER || keyCode == GLFW.GLFW_KEY_KP_ENTER
                || keyCode == GLFW.GLFW_KEY_SPACE) {
            if (focusIndex >= 0 && focusIndex < FOCUS_COUNT) {
                activate(focusIndex);
                return true;
            }
        }
        if (keyCode == GLFW.GLFW_KEY_UP || keyCode == GLFW.GLFW_KEY_DOWN) {
            if (focusIndex < 0) {
                focusIndex = 0;
            } else if (keyCode == GLFW.GLFW_KEY_UP) {
                focusIndex = (focusIndex + FOCUS_COUNT - 1) % FOCUS_COUNT;
            } else {
                focusIndex = (focusIndex + 1) % FOCUS_COUNT;
            }
            return true;
        }
        return super.keyPressed(keyCode, scanCode, modifiers);
    }

    private void activate(int index) {
        switch (index) {
            case 0 -> startExit(this::openWorlds);
            case 1 -> startExit(this::openMultiplayer);
            case 2 -> startExit(this::openAccounts);
            case 3 -> startExit(this::openOptions);
            default -> startExit(this::quitGame);
        }
    }
}

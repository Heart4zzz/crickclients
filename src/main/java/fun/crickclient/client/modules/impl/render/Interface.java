package fun.crickclient.client.modules.impl.render;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.texture.AbstractTexture;
import net.minecraft.client.texture.Sprite;
import net.minecraft.client.util.DefaultSkinHelper;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.s2c.play.CooldownUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerRespawnS2CPacket;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.MutableText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.world.GameMode;
import org.lwjgl.glfw.GLFW;
import fun.crickclient.CrickClient;
import fun.crickclient.api.events.EventLink;
import fun.crickclient.api.events.implement.EventPacket;
import fun.crickclient.api.events.implement.EventPopTotem;
import fun.crickclient.api.events.implement.EventRender;
import fun.crickclient.api.events.implement.EventUpdate;
import fun.crickclient.api.storages.implement.helpertstorages.enumvar.ModuleClass;
import fun.crickclient.api.utils.animation.Easings;
import fun.crickclient.api.utils.animation.TimedAnimation;
import fun.crickclient.api.utils.color.HudColors;
import fun.crickclient.api.utils.draggable.Draggable;
import fun.crickclient.api.utils.input.KeyBoardUtils;
import fun.crickclient.api.utils.math.HoveringUtils;
import fun.crickclient.api.utils.notification.NotificationManager;
import fun.crickclient.api.utils.player.Counter;
import fun.crickclient.api.utils.render.RenderUtils;
import fun.crickclient.api.utils.render.fonts.msdf.Font;
import fun.crickclient.api.utils.render.fonts.msdf.Fonts;
import fun.crickclient.api.utils.render.hud.HudShine;
import fun.crickclient.api.utils.render.hud.TimerTextAnimator;
import fun.crickclient.api.utils.replace.ReplaceUtils;
import fun.crickclient.client.modules.Module;
import fun.crickclient.client.modules.impl.combat.AntiBot;
import fun.crickclient.client.modules.impl.combat.Aura;
import fun.crickclient.client.modules.impl.misc.NameProtect;
import fun.crickclient.client.modules.impl.misc.ServerHelper;
import fun.crickclient.client.modules.settings.Setting;
import fun.crickclient.client.modules.settings.implement.BindSetting;
import fun.crickclient.client.modules.settings.implement.BooleanSetting;
import fun.crickclient.client.modules.settings.implement.FloatSetting;
import fun.crickclient.client.modules.settings.implement.ListSetting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * HUD клиента: ватермарка, инфо-строка, таргет худ, бинды, стафф-лист, бафы, кулдауны,
 * ServerHelper, уведомления, кастомный хотбар, броня и полоса тотемов.
 * <p>
 * Каждый элемент перетаскивается в чате и настраивается по правому клику (размер, блюр,
 * прозрачность, блик и специфичные для элемента опции).
 */
public class Interface extends Module {

    public static Interface INSTANCE = new Interface();

    private static final Identifier CLIENT_ICON = Identifier.of("crickclient", "textures/client_icon.png");
    /** Пропорции client_icon.png (1402x1122). */
    private static final float CLIENT_ICON_ASPECT = 1402f / 1122f;
    private static final float HUD_PANEL_RADIUS = 5f;

    private static final String FONT_MAIN = "sf_regular";
    private static final String FONT_ICONS = "icon";
    private static final String FONT_LOGO = "logo";

    // Глифы иконок в шрифте "icon"
    private static final String ICON_KEYBINDS = "J";
    private static final String ICON_STAFF = "F";
    private static final String ICON_EFFECTS = "d";
    private static final String ICON_COOLDOWNS = "B";
    private static final String ICON_COORDS = "H";
    private static final String ICON_TPS = "I";
    private static final String ICON_BPS = "c";

    /** Матрица текущего кадра — HUD рисуется только из события рендера. */
    private MatrixStack ms = new MatrixStack();

    // ===================== Настройки =====================
    private final ListSetting elements = new ListSetting("Элементы",
            new BooleanSetting("Ватермарка", true),
            new BooleanSetting("Инфо", true),
            new BooleanSetting("Координаты", false),
            new BooleanSetting("Активный таргет", true),
            new BooleanSetting("Привязанные модули", true),
            new BooleanSetting("Активные модераторы", true),
            new BooleanSetting("Бафы", true),
            new BooleanSetting("КулДауны", true),
            new BooleanSetting("ServerHelper", true),
            new BooleanSetting("Нотификации", true),
            new BooleanSetting("Кастомный хотбар", false),
            new BooleanSetting("Броня", false),
            new BooleanSetting("Полоса тотемов", false),
            new BooleanSetting("Блюр фона", true)
    );

    private final FloatSetting backgroundIntensity = new FloatSetting("Интенсивность фона", 0.5f, 0.05f, 1.0f, 0.01f);
    private final FloatSetting headerIntensity = new FloatSetting("Интенсивность заголовков", 0.5f, 0.05f, 1.0f, 0.01f);
    private final FloatSetting itemIntensity = new FloatSetting("Интенсивность элементов", 0.2f, 0.05f, 1.0f, 0.01f);
    private final FloatSetting lowHpAlertThreshold = new FloatSetting("Порог ХП оповещения", 8f, 1f, 20f, 0.5f);

    // ===================== Перетаскивание =====================
    private final Draggable watermarkDrag = CrickClient.draggable(this, "Watermark", 4, 4);
    private final Draggable infoDrag = CrickClient.draggable(this, "Info", 4, 24);
    private final Draggable keyBindsDrag = CrickClient.draggable(this, "HotKeys", 4, 340);
    private final Draggable staffListDrag = CrickClient.draggable(this, "StaffList", 108, 340);
    private final Draggable potionsDrag = CrickClient.draggable(this, "Potions", 212, 340);
    private final Draggable cooldownsDrag = CrickClient.draggable(this, "CoolDowns", 316, 340);
    private final Draggable serverHelperDrag = CrickClient.draggable(this, "ServerHelper", 300, 200);
    private final Draggable targetHUDDrag = CrickClient.draggable(this, "TargetHUD", 420, 310);
    private final Draggable hotbarDrag = CrickClient.draggable(this, "CustomHotbar", 150, 220);
    private final Draggable armourDrag = CrickClient.draggable(this, "ArmourBar", 150, 245);
    private final Draggable totemBarDrag = CrickClient.draggable(this, "TotemBar", 150, 270);
    private final Draggable notificationsDrag = CrickClient.draggable(this, "Notifications", 250, 250);

    public final NotificationsElement notifications = new NotificationsElement();

    // ===================== Настройки элементов (скрыты в ClickGui) =====================
    // Potions
    private final BooleanSetting potionsBlur = hidden(new BooleanSetting("Блюр бафов", true));
    private final FloatSetting potionsSize = hidden(new FloatSetting("Размер бафов", 0.65f, 0.5f, 2.0f, 0.05f));
    private final FloatSetting potionsAlpha = hidden(new FloatSetting("Прозрачность бафов", 180f, 0f, 255f, 1f));
    private final BooleanSetting potionsRing = hidden(new BooleanSetting("Кольцо таймер", true));
    private final BooleanSetting potionsShine = hidden(new BooleanSetting("Блик бафов", true));
    private final FloatSetting potionsShineAlpha = hidden(new FloatSetting("Прозрачность блика", 30f, 0f, 100f, 1f));
    private final FloatSetting potionsShineThickness = hidden(new FloatSetting("Толщина блика", 0.5f, 0.2f, 2.0f, 0.05f));
    private final BooleanSetting potionsCorners = hidden(new BooleanSetting("Уголки бафов", false));

    // Keybinds
    private final BooleanSetting keybindsBlur = hidden(new BooleanSetting("Блюр кейбиндов", true));
    private final FloatSetting keybindsSize = hidden(new FloatSetting("Размер кейбиндов", 0.65f, 0.5f, 2.0f, 0.05f));
    private final FloatSetting keybindsAlpha = hidden(new FloatSetting("Прозрачность кейбиндов", 180f, 0f, 255f, 1f));
    private final BooleanSetting keybindsShine = hidden(new BooleanSetting("Блик кейбиндов", true));
    private final FloatSetting keybindsShineAlpha = hidden(new FloatSetting("Прозрачность блика кб", 30f, 0f, 100f, 1f));
    private final FloatSetting keybindsShineThickness = hidden(new FloatSetting("Толщина блика кб", 0.5f, 0.2f, 2.0f, 0.05f));
    private final BooleanSetting keybindsCorners = hidden(new BooleanSetting("Уголки кейбиндов", false));

    // StaffList
    private final BooleanSetting stafflistBlur = hidden(new BooleanSetting("Блюр стафф", true));
    private final FloatSetting stafflistSize = hidden(new FloatSetting("Размер стафф", 0.65f, 0.5f, 2.0f, 0.05f));
    private final FloatSetting stafflistAlpha = hidden(new FloatSetting("Прозрачность стафф", 180f, 0f, 255f, 1f));
    private final BooleanSetting stafflistShine = hidden(new BooleanSetting("Блик стафф", true));
    private final FloatSetting stafflistShineAlpha = hidden(new FloatSetting("Прозрачность блика стафф", 30f, 0f, 100f, 1f));
    private final FloatSetting stafflistShineThickness = hidden(new FloatSetting("Толщина блика стафф", 0.5f, 0.2f, 2.0f, 0.05f));
    private final BooleanSetting stafflistCorners = hidden(new BooleanSetting("Уголки списка модераторов", false));

    // CoolDowns
    private final BooleanSetting cooldownsBlur = hidden(new BooleanSetting("Блюр кд", true));
    private final FloatSetting cooldownsSize = hidden(new FloatSetting("Размер кд", 0.65f, 0.5f, 2.0f, 0.05f));
    private final FloatSetting cooldownsAlpha = hidden(new FloatSetting("Прозрачность кд", 180f, 0f, 255f, 1f));
    private final BooleanSetting cooldownsRing = hidden(new BooleanSetting("Кольцо таймер кд", true));
    private final BooleanSetting cooldownsShine = hidden(new BooleanSetting("Блик кд", true));
    private final FloatSetting cooldownsShineAlpha = hidden(new FloatSetting("Прозрачность блика кд", 30f, 0f, 100f, 1f));
    private final FloatSetting cooldownsShineThickness = hidden(new FloatSetting("Толщина блика кд", 0.5f, 0.2f, 2.0f, 0.05f));
    private final BooleanSetting cooldownsCorners = hidden(new BooleanSetting("Уголки кулдаунов", false));

    // ServerHelper
    private final BooleanSetting serverHelperBlur = hidden(new BooleanSetting("Блюр ServerHelper", true));
    private final FloatSetting serverHelperSize = hidden(new FloatSetting("Размер ServerHelper", 0.65f, 0.5f, 2.0f, 0.05f));
    private final FloatSetting serverHelperAlpha = hidden(new FloatSetting("Прозрачность ServerHelper", 180f, 0f, 255f, 1f));
    private final BooleanSetting serverHelperShine = hidden(new BooleanSetting("Блик ServerHelper", true));
    private final FloatSetting serverHelperShineAlpha = hidden(new FloatSetting("Прозрачность блика ServerHelper", 30f, 0f, 100f, 1f));
    private final FloatSetting serverHelperShineThickness = hidden(new FloatSetting("Толщина блика ServerHelper", 0.5f, 0.2f, 2.0f, 0.05f));
    private final BooleanSetting serverHelperCorners = hidden(new BooleanSetting("Уголки ServerHelper", false));

    // Watermark
    private final BooleanSetting wmBlur = hidden(new BooleanSetting("Блюр вм", true));
    private final FloatSetting wmSize = new FloatSetting("Размер вм", 0.65f, 0.5f, 1.5f, 0.05f);
    private final FloatSetting wmAlpha = hidden(new FloatSetting("Прозрачность вм", 180f, 0f, 255f, 1f));
    private final BooleanSetting wmShine = hidden(new BooleanSetting("Блик вм", true));
    private final FloatSetting wmShineAlpha = hidden(new FloatSetting("Прозрачность блика вм", 30f, 0f, 100f, 1f));
    private final FloatSetting wmShineThickness = hidden(new FloatSetting("Толщина блика вм", 0.5f, 0.2f, 2.0f, 0.05f));
    private final BooleanSetting wmCorners = hidden(new BooleanSetting("Уголки ватермарки", false));
    private final BooleanSetting wmBps = hidden(new BooleanSetting("Добавить BPS", false));
    private final BooleanSetting wmTps = hidden(new BooleanSetting("Добавить TPS", false));
    private final BooleanSetting wmCoords = hidden(new BooleanSetting("Добавить координаты", false));

    // Info
    private final BooleanSetting infoBlur = hidden(new BooleanSetting("Блюр инфо", true));
    private final FloatSetting infoSize = new FloatSetting("Размер инфо", 0.70f, 0.5f, 1.5f, 0.05f);
    private final FloatSetting infoAlpha = hidden(new FloatSetting("Прозрачность инфо", 180f, 0f, 255f, 1f));
    private final BooleanSetting infoShine = hidden(new BooleanSetting("Блик инфо", true));
    private final FloatSetting infoShineAlpha = hidden(new FloatSetting("Прозрачность блика инфо", 30f, 0f, 100f, 1f));
    private final FloatSetting infoShineThickness = hidden(new FloatSetting("Толщина блика инфо", 0.5f, 0.2f, 2.0f, 0.05f));
    private final BooleanSetting infoCorners = hidden(new BooleanSetting("Уголки инфо", false));

    // CustomHotbar
    private final BooleanSetting hotbarBlur = hidden(new BooleanSetting("Блюр хотбар", true));
    private final FloatSetting hotbarSize = hidden(new FloatSetting("Размер хотбар", 0.95f, 0.5f, 2.0f, 0.05f));
    private final FloatSetting hotbarAlpha = hidden(new FloatSetting("Прозрачность хотбар", 180f, 0f, 255f, 1f));
    private final BooleanSetting hotbarShine = hidden(new BooleanSetting("Блик хотбар", true));
    private final FloatSetting hotbarShineAlpha = hidden(new FloatSetting("Прозрачность блика хотбар", 30f, 0f, 100f, 1f));
    private final FloatSetting hotbarShineThickness = hidden(new FloatSetting("Толщина блика хотбар", 0.5f, 0.2f, 2.0f, 0.05f));
    private final BooleanSetting hotbarCorners = hidden(new BooleanSetting("Уголки хотбара", true));
    private final BooleanSetting hotbarCounts = hidden(new BooleanSetting("Показывать количество", true));

    // ArmourBar
    private final BooleanSetting armourBlur = hidden(new BooleanSetting("Блюр броня", true));
    private final FloatSetting armourSize = hidden(new FloatSetting("Размер броня", 0.95f, 0.5f, 2.0f, 0.05f));
    private final FloatSetting armourAlpha = hidden(new FloatSetting("Прозрачность броня", 180f, 0f, 255f, 1f));
    private final BooleanSetting armourShine = hidden(new BooleanSetting("Блик броня", true));
    private final FloatSetting armourShineAlpha = hidden(new FloatSetting("Прозрачность блика броня", 30f, 0f, 100f, 1f));
    private final FloatSetting armourShineThickness = hidden(new FloatSetting("Толщина блика броня", 0.5f, 0.2f, 2.0f, 0.05f));
    private final BooleanSetting armourCorners = hidden(new BooleanSetting("Уголки брони", true));
    private final BooleanSetting armourDurability = hidden(new BooleanSetting("Полоса прочности", true));

    // TotemBar
    private final BooleanSetting totemBarBlur = hidden(new BooleanSetting("Блюр тотем-бар", true));
    private final FloatSetting totemBarSize = hidden(new FloatSetting("Размер тотем-бар", 0.95f, 0.5f, 2.0f, 0.05f));
    private final FloatSetting totemBarAlpha = hidden(new FloatSetting("Прозрачность тотем-бар", 180f, 0f, 255f, 1f));
    private final BooleanSetting totemBarShine = hidden(new BooleanSetting("Блик тотем-бар", true));
    private final FloatSetting totemBarShineAlpha = hidden(new FloatSetting("Прозрачность блика тотем-бар", 30f, 0f, 100f, 1f));
    private final FloatSetting totemBarShineThickness = hidden(new FloatSetting("Толщина блика тотем-бар", 0.5f, 0.2f, 2.0f, 0.05f));
    private final BooleanSetting totemBarCorners = hidden(new BooleanSetting("Уголки полосы тотемов", true));

    // TargetHUD
    private final BooleanSetting thBlur = hidden(new BooleanSetting("Блюр тх", true));
    private final FloatSetting thSize = hidden(new FloatSetting("Размер тх", 0.85f, 0.5f, 2.0f, 0.05f));
    private final FloatSetting thAlpha = hidden(new FloatSetting("Прозрачность тх", 180f, 0f, 255f, 1f));
    private final BooleanSetting thShine = hidden(new BooleanSetting("Блик тх", true));
    private final FloatSetting thShineAlpha = hidden(new FloatSetting("Прозрачность блика тх", 30f, 0f, 100f, 1f));
    private final FloatSetting thShineThickness = hidden(new FloatSetting("Толщина блика тх", 0.5f, 0.2f, 2.0f, 0.05f));
    private final BooleanSetting thCorners = hidden(new BooleanSetting("Уголки таргет худа", false));
    private final BooleanSetting thShowOnHover = hidden(new BooleanSetting("Показывать при наведении", true));
    private final BooleanSetting thShowItems = hidden(new BooleanSetting("Показывать предметы", true));

    // Notifications
    private final BooleanSetting ntBlur = hidden(new BooleanSetting("Блюр notif", true));
    private final FloatSetting ntSize = hidden(new FloatSetting("Размер notif", 0.80f, 0.5f, 2.0f, 0.05f));
    private final FloatSetting ntAlpha = hidden(new FloatSetting("Прозрачность notif", 180f, 0f, 255f, 1f));
    private final BooleanSetting ntShine = hidden(new BooleanSetting("Блик notif", true));
    private final FloatSetting ntShineAlpha = hidden(new FloatSetting("Прозрачность блика notif", 30f, 0f, 100f, 1f));
    private final FloatSetting ntShineThickness = hidden(new FloatSetting("Толщина блика notif", 0.5f, 0.2f, 2.0f, 0.05f));
    private final BooleanSetting ntCorners = hidden(new BooleanSetting("Уголки уведомлений", true));
    private final BooleanSetting notifModuleStates = hidden(new BooleanSetting("Состояния модулей", true));
    private final BooleanSetting notifTotem = hidden(new BooleanSetting("Снос тотема", true));

    // ===================== Окна настроек элементов =====================
    private final HudPopup potionsPopup = new HudPopup("Potions", potionsDrag,
            potionsBlur, potionsSize, potionsAlpha, potionsRing,
            potionsShine, potionsShineAlpha, potionsShineThickness, potionsCorners);

    private final HudPopup cooldownsPopup = new HudPopup("CoolDowns", cooldownsDrag,
            cooldownsBlur, cooldownsSize, cooldownsAlpha, cooldownsRing,
            cooldownsShine, cooldownsShineAlpha, cooldownsShineThickness, cooldownsCorners);

    private final HudPopup serverHelperPopup = new HudPopup("ServerHelper", serverHelperDrag,
            serverHelperBlur, serverHelperSize, serverHelperAlpha, null,
            serverHelperShine, serverHelperShineAlpha, serverHelperShineThickness, serverHelperCorners);

    private final HudPopup watermarkPopup = new HudPopup("Watermark", watermarkDrag,
            wmBlur, wmSize, wmAlpha, null,
            wmShine, wmShineAlpha, wmShineThickness, wmCorners);

    private final HudPopup infoPopup = new HudPopup("Info", infoDrag,
            infoBlur, infoSize, infoAlpha, null,
            infoShine, infoShineAlpha, infoShineThickness, infoCorners);

    private final HudPopup hotbarPopup = new HudPopup("CustomHotbar", hotbarDrag,
            hotbarBlur, hotbarSize, hotbarAlpha, null,
            hotbarShine, hotbarShineAlpha, hotbarShineThickness, hotbarCorners);

    private final HudPopup armourPopup = new HudPopup("ArmourBar", armourDrag,
            armourBlur, armourSize, armourAlpha, null,
            armourShine, armourShineAlpha, armourShineThickness, armourCorners);

    private final HudPopup totemBarPopup = new HudPopup("TotemBar", totemBarDrag,
            totemBarBlur, totemBarSize, totemBarAlpha, null,
            totemBarShine, totemBarShineAlpha, totemBarShineThickness, totemBarCorners);

    private final HudPopup targetHudPopup = new HudPopup("TargetHUD", targetHUDDrag,
            thBlur, thSize, thAlpha, null,
            thShine, thShineAlpha, thShineThickness, thCorners);

    private final HudPopup notificationsPopup = new HudPopup("Notifications", notificationsDrag,
            ntBlur, ntSize, ntAlpha, null,
            ntShine, ntShineAlpha, ntShineThickness, ntCorners);

    private final HudPopup keybindsPopup = new HudPopup("Keybinds", keyBindsDrag,
            keybindsBlur, keybindsSize, keybindsAlpha, null,
            keybindsShine, keybindsShineAlpha, keybindsShineThickness, keybindsCorners);

    private final HudPopup stafflistPopup = new HudPopup("StaffList", staffListDrag,
            stafflistBlur, stafflistSize, stafflistAlpha, null,
            stafflistShine, stafflistShineAlpha, stafflistShineThickness, stafflistCorners);

    {
        infoPopup.extraRows.add(new PopupRow(PopupKind.TOGGLE, "Добавить BPS", wmBps, null));
        infoPopup.extraRows.add(new PopupRow(PopupKind.TOGGLE, "Добавить TPS", wmTps, null));
        infoPopup.extraRows.add(new PopupRow(PopupKind.TOGGLE, "Добавить координаты", wmCoords, null));

        hotbarPopup.extraRows.add(new PopupRow(PopupKind.TOGGLE, "Показывать количество", hotbarCounts, null));
        armourPopup.extraRows.add(new PopupRow(PopupKind.TOGGLE, "Полоса прочности", armourDurability, null));

        targetHudPopup.extraRows.add(new PopupRow(PopupKind.TOGGLE, "Показывать при наведении", thShowOnHover, null));
        targetHudPopup.extraRows.add(new PopupRow(PopupKind.TOGGLE, "Показывать предметы", thShowItems, null));

        notificationsPopup.extraRows.add(new PopupRow(PopupKind.TOGGLE, "Состояния модулей", notifModuleStates, null));
        notificationsPopup.extraRows.add(new PopupRow(PopupKind.TOGGLE, "Снос тотема", notifTotem, null));
    }

    public Interface() {
        super("Interface", "Настройка элементов HUD на экране", ModuleCategory.RENDER);
        addSettings(elements, backgroundIntensity, headerIntensity, itemIntensity, lowHpAlertThreshold,
                wmSize, infoSize);
        addSettings(potionsBlur, potionsSize, potionsAlpha, potionsRing, potionsShine, potionsShineAlpha,
                potionsShineThickness, potionsCorners);
        addSettings(keybindsBlur, keybindsSize, keybindsAlpha, keybindsShine, keybindsShineAlpha,
                keybindsShineThickness, keybindsCorners);
        addSettings(stafflistBlur, stafflistSize, stafflistAlpha, stafflistShine, stafflistShineAlpha,
                stafflistShineThickness, stafflistCorners);
        addSettings(cooldownsBlur, cooldownsSize, cooldownsAlpha, cooldownsRing, cooldownsShine,
                cooldownsShineAlpha, cooldownsShineThickness, cooldownsCorners);
        addSettings(serverHelperBlur, serverHelperSize, serverHelperAlpha, serverHelperShine,
                serverHelperShineAlpha, serverHelperShineThickness, serverHelperCorners);
        addSettings(wmBlur, wmAlpha, wmShine, wmShineAlpha, wmShineThickness, wmCorners, wmBps, wmTps, wmCoords);
        addSettings(infoBlur, infoAlpha, infoShine, infoShineAlpha, infoShineThickness, infoCorners);
        addSettings(hotbarBlur, hotbarSize, hotbarAlpha, hotbarShine, hotbarShineAlpha, hotbarShineThickness,
                hotbarCorners, hotbarCounts);
        addSettings(armourBlur, armourSize, armourAlpha, armourShine, armourShineAlpha, armourShineThickness,
                armourCorners, armourDurability);
        addSettings(totemBarBlur, totemBarSize, totemBarAlpha, totemBarShine, totemBarShineAlpha,
                totemBarShineThickness, totemBarCorners);
        addSettings(thBlur, thSize, thAlpha, thShine, thShineAlpha, thShineThickness, thCorners,
                thShowOnHover, thShowItems);
        addSettings(ntBlur, ntSize, ntAlpha, ntShine, ntShineAlpha, ntShineThickness, ntCorners,
                notifModuleStates, notifTotem);
    }

    private static BooleanSetting hidden(BooleanSetting setting) {
        return setting.visible(() -> false);
    }

    private static FloatSetting hidden(FloatSetting setting) {
        return setting.visible(() -> false);
    }

    // ===================== Хелперы отрисовки =====================
    private Font font(float size) {
        return Fonts.getFont(FONT_MAIN, size * 2f);
    }

    private Font iconFont(float size) {
        return Fonts.getFont(FONT_ICONS, size * 2f);
    }

    private float width(String text, float size) {
        Font font = font(size);
        return font == null || text == null ? 0f : font.getStringWidth(text);
    }

    private float iconWidth(String glyph, float size) {
        Font font = iconFont(size);
        return font == null || glyph == null ? 0f : font.getStringWidth(glyph);
    }

    private void drawText(String text, float x, float y, int color, float size) {
        Font font = font(size);
        if (font != null && text != null) font.drawStringNoOffset(ms, text, x, y, color);
    }

    private void drawIcon(String glyph, float x, float y, int color, float size) {
        Font font = iconFont(size);
        if (font != null && glyph != null) font.drawStringNoOffset(ms, glyph, x, y, color);
    }

    /** Отрисовка форматированного {@link Text} с сохранением цветов компонентов. */
    private void drawText(Text text, float x, float y, float size, int alpha) {
        Font font = font(size);
        if (font == null || text == null) return;

        final float[] cursor = {x};
        text.<Object>visit((style, string) -> {
            int rgb = style.getColor() != null ? style.getColor().getRgb() : 0xFFFFFF;
            font.drawStringNoOffset(ms, string, cursor[0], y, HudColors.setAlpha(rgb, alpha));
            cursor[0] += font.getStringWidth(string);
            return Optional.empty();
        }, Style.EMPTY);
    }

    private float width(Text text, float size) {
        Font font = font(size);
        if (font == null || text == null) return 0f;
        return font.getStringWidth(text.getString());
    }

    private void drawRound(float x, float y, float w, float h, float radius, int color) {
        RenderUtils.drawRoundedRect(ms, x, y, w, h, radius, color);
    }

    private void drawRound(float x, float y, float w, float h, float tl, float tr, float bl, float br, int color) {
        RenderUtils.drawRoundedRect(ms, x, y, w, h, tl, tr, br, bl, color);
    }

    private void drawRoundBlur(float x, float y, float w, float h, float radius, int color, float strength) {
        RenderUtils.drawBlur(ms, x, y, w, h, radius, strength, color);
    }

    private void drawRoundBlur(float x, float y, float w, float h, float tl, float tr, float bl, float br,
                               int color, float strength) {
        RenderUtils.drawBlur(ms, x, y, w, h, tl, tr, br, bl, strength, color);
    }

    private void drawCircle(float cx, float cy, float radius, int color) {
        RenderUtils.drawRoundCircle(ms, cx, cy, radius * 2f, color);
    }

    private void drawRingArc(float cx, float cy, float radius, float thickness, float startDeg, float endDeg, int color) {
        RenderUtils.drawRingArc(ms, cx - radius, cy - radius, radius * 2f, thickness, startDeg, endDeg, color);
    }

    public float getBackgroundIntensity() {
        return backgroundIntensity.get();
    }

    public void drawHeaderBackground(float x, float y, float w, float h, float radius, int alpha) {
        float intensity = headerIntensity.get();
        int color = HudColors.setAlpha(HudColors.getColorInterfaceBg(), (int) (alpha * intensity));
        if (elements.is("Блюр фона")) {
            drawRoundBlur(x, y, w, h, radius, HudColors.rgba(200, 200, 200, alpha), 12f);
        }
        drawRound(x, y, w, h, radius, color);
    }

    private void drawItemBackground(float x, float y, float w, float h, float radius, int alpha) {
        float intensity = itemIntensity.get();
        int color = HudColors.setAlpha(HudColors.getColorInterfaceBg(), (int) (alpha * intensity));
        if (elements.is("Блюр фона")) {
            drawRoundBlur(x, y, w, h, radius, HudColors.rgba(200, 200, 200, alpha), 12f);
        }
        drawRound(x, y, w, h, radius, color);
    }

    public void drawBackground(float x, float y, float w, float h, float radius, int alpha) {
        int color = HudColors.setAlpha(HudColors.getColorInterfaceBg(), (int) (alpha * backgroundIntensity.get()));
        if (elements.is("Блюр фона")) {
            drawRoundBlur(x, y, w, h, radius, HudColors.rgba(200, 200, 200, alpha), 12f);
        }
        drawRound(x, y, w, h, radius, color);
    }

    public void drawBackground(float x, float y, float w, float h, float tl, float tr, float bl, float br, int alpha) {
        int color = HudColors.setAlpha(HudColors.getColorInterfaceBg(), (int) (alpha * backgroundIntensity.get()));
        if (elements.is("Блюр фона")) {
            drawRoundBlur(x, y, w, h, tl, tr, bl, br, HudColors.rgba(200, 200, 200, alpha), 12f);
        }
        drawRound(x, y, w, h, tl, tr, bl, br, color);
    }

    // ===================== События =====================
    @EventLink
    public void onRender(EventRender.Default event) {
        if (mc.player == null || mc.options.hudHidden || mc.getDebugHud().shouldShowDebugHud()) return;

        DrawContext context = event.getContext();
        this.ms = context.getMatrices();

        if (elements.is("Нотификации")) {
            notifications.render(context);
            renderNotificationsExample(context);
        }
        if (elements.is("Ватермарка")) renderWatermark(context);
        if (elements.is("Инфо")) renderInfo(context);
        if (elements.is("Активный таргет")) renderTargetHUD(context);
        if (elements.is("Привязанные модули")) renderKeyBinds(context);
        if (elements.is("Активные модераторы")) renderStaffList(context);
        if (elements.is("Бафы")) renderPotions(context);
        if (elements.is("КулДауны")) renderCoolDowns(context);
        if (elements.is("ServerHelper")) renderServerHelper(context);
        if (elements.is("Кастомный хотбар")) renderCustomHotbar(context);
        if (elements.is("Броня")) renderArmourBar(context);
        if (elements.is("Полоса тотемов")) renderTotemBar(context);
    }

    @EventLink
    public void onUpdate(EventUpdate event) {
        if (mc.player == null || mc.world == null) return;

        if (elements.is("Активные модераторы")) update();
        if (elements.is("Бафы")) updatePotions();
        if (elements.is("КулДауны")) updateCooldowns();
    }

    @EventLink
    public void onPopTotem(EventPopTotem event) {
        if (!isTotemNotifEnabled()) return;
        PlayerEntity player = event.getPlayer();
        if (player == null) return;

        boolean enchanted = !player.getOffHandStack().getEnchantments().isEmpty();
        Text tagText = NameProtect.INSTANCE.isEnable()
                ? Text.literal(NameProtect.INSTANCE.patch(player.getName().getString()))
                : player.getName();
        notifications.postTotem(tagText, enchanted);
    }

    @EventLink
    public void onPacket(EventPacket event) {
        if (mc.player == null || event.getType() != EventPacket.Type.RECEIVE) return;

        if (event.getPacket() instanceof CooldownUpdateS2CPacket packet) {
            Item item = Registries.ITEM.get(packet.cooldownGroup());
            if (item == null || item == Items.AIR) return;
            for (CooldownItem cooldown : cooldownItems) {
                if (cooldown.item == item) cooldown.active = false;
            }
            if (packet.cooldown() != 0) {
                long durationMs = packet.cooldown() * 50L;
                cooldownItems.add(new CooldownItem(item, System.currentTimeMillis() + durationMs, durationMs));
            }
        } else if (event.getPacket() instanceof PlayerRespawnS2CPacket) {
            cooldownItems.clear();
        }
    }

    // ===================== Общие анимации =====================
    private final TimedAnimation animation = new TimedAnimation(Easings.EXPO_OUT, 300);
    private final TimedAnimation armorAnim = new TimedAnimation(Easings.EXPO_OUT, 300);
    private final TimedAnimation hpAnimation = new TimedAnimation(Easings.EXPO_OUT, 600);
    private final TimedAnimation alpha = new TimedAnimation(Easings.EXPO_OUT, 200);
    private final TimedAnimation alpha2 = new TimedAnimation(Easings.EXPO_OUT, 200);
    private final TimedAnimation alpha3 = new TimedAnimation(Easings.EXPO_OUT, 200);
    private final TimedAnimation cdAlpha = new TimedAnimation(Easings.EXPO_OUT, 200);
    private final TimedAnimation exampleNotifToggleAnim = new TimedAnimation(Easings.EXPO_OUT, 200);

    private final Map<Module, TimedAnimation> moduleAnimations = new HashMap<>();
    private final Map<BooleanSetting, TimedAnimation> toggleAnimations = new HashMap<>();

    private Entity lastTarget;

    private TimedAnimation moduleAnimation(Module module) {
        return moduleAnimations.computeIfAbsent(module, m -> new TimedAnimation(Easings.EXPO_OUT, 233));
    }

    private TimedAnimation toggleAnimation(BooleanSetting setting) {
        return toggleAnimations.computeIfAbsent(setting,
                s -> new TimedAnimation(Easings.EXPO_OUT, 200, s.isState() ? 1.0 : 0.0));
    }

    // ===================== Привязанные модули =====================
    private void renderKeyBinds(DrawContext context) {
        if (mc.player == null) return;

        if (!(mc.currentScreen instanceof ChatScreen)) {
            keybindsPopup.open = false;
            keybindsPopup.draggingSlider = null;
        }

        beginScale(keybindsPopup, context);
        renderKeyBindsNew(context);
        endScale(keybindsPopup, context);

        runPopup(keybindsPopup, context);
    }

    private record BindEntry(String label, String bind, double animValue, ModuleCategory category) {
    }

    /** Переиспользуемый буфер, чтобы не аллоцировать новый список каждый кадр. */
    private final List<BindEntry> keybindEntries = new ArrayList<>();

    private void renderKeyBindsNew(DrawContext context) {
        if (mc.player == null) return;

        float posX = keyBindsDrag.getX();
        float posY = keyBindsDrag.getY();

        float headerHeight = 14f;
        float itemHeight = 9.5f;
        float minWidth = 52f;
        float padX = 5f;
        float padY = 2f;

        List<BindEntry> entries = keybindEntries;
        entries.clear();
        for (Module module : ModuleClass.INSTANCE.getObject()) {
            if (module == null) continue;

            TimedAnimation moduleAnim = moduleAnimation(module);
            moduleAnim.run(module.isEnable() ? 1 : 0);

            if (module.getKey() != -1 && moduleAnim.getValue() > 0.001) {
                entries.add(new BindEntry(module.getDisplayName(), KeyBoardUtils.getKeyName(module.getKey()),
                        moduleAnim.getValue(), module.getCategory()));
            }
            for (Setting setting : module.getSettings()) {
                if (setting instanceof BindSetting bind && bind.getKey() != -1 && module.isEnable()) {
                    entries.add(new BindEntry(bind.displayName(), KeyBoardUtils.getKeyName(bind.getKey()),
                            1.0, module.getCategory()));
                }
            }
        }

        boolean isFound = !entries.isEmpty();
        if (!isFound && !(mc.currentScreen instanceof ChatScreen)) alpha.run(0);
        else alpha.run(1);

        float globalAlpha = (float) alpha.getValue();
        if (globalAlpha <= 0.05f) return;

        int headerAlpha = (int) Math.min(255, Math.max(0, 255 * globalAlpha));

        boolean showExample = (mc.currentScreen instanceof ChatScreen) && !isFound;

        // Расчёт ширины левой (иконка + название) и правой (бинд) колонок
        float maxLabelBoxW = minWidth;
        float maxBindBoxW = 0f;
        for (BindEntry entry : entries) {
            float animVal = (float) Math.min(1.0, Math.max(0.0, entry.animValue()));
            if (animVal <= 0.001f) continue;
            float lw = 9f + width(entry.label(), 7f) + 7f;
            if (lw > maxLabelBoxW) maxLabelBoxW = lw;
            float bw = width(entry.bind(), 6.75f) + 6f;
            if (bw > maxBindBoxW) maxBindBoxW = bw;
        }
        if (showExample) {
            float lw = 9f + width("Example", 7f) + 7f;
            if (lw > maxLabelBoxW) maxLabelBoxW = lw;
            float bw = width("K", 6.75f) + 6f;
            if (bw > maxBindBoxW) maxBindBoxW = bw;
        }

        // Высота панели считается по сумме анимированных высот строк — плавное появление/исчезновение
        float contentHeight = 0f;
        if (showExample) {
            contentHeight = itemHeight;
        } else {
            for (BindEntry entry : entries) {
                float av = (float) Math.min(1.0, Math.max(0.0, entry.animValue()));
                if (av <= 0.001f) continue;
                contentHeight += itemHeight * av;
            }
        }

        float rawWidth = maxLabelBoxW + maxBindBoxW + padX * 2;
        keybindsPopup.panelWidth.run(rawWidth);
        float totalRowWidth = (float) keybindsPopup.panelWidth.getValue();
        if (totalRowWidth < 20f) totalRowWidth = rawWidth;
        float totalHeight = headerHeight + contentHeight + padY * 2;

        drawElementBackground(keybindsPopup, posX, posY, totalRowWidth, totalHeight, HUD_PANEL_RADIUS, globalAlpha);
        drawElementShine(keybindsPopup, context, posX, posY, totalRowWidth, totalHeight, HUD_PANEL_RADIUS);
        drawHudHeader("Keybinds", ICON_KEYBINDS, posX, posY, totalRowWidth, headerHeight, headerAlpha);

        float curY = posY + headerHeight + padY;

        for (BindEntry entry : entries) {
            float animVal = (float) Math.min(1.0, Math.max(0.0, entry.animValue()));
            if (animVal <= 0.001f) continue;

            int itemAlpha = (int) Math.min(255, Math.max(0, 255 * animVal * globalAlpha));
            if (itemAlpha < 5) continue;

            float rowHeight = itemHeight * animVal;
            ms.push();
            ms.translate(posX + totalRowWidth / 2f, curY + rowHeight / 2f, 0);
            ms.scale(animVal, animVal, animVal);
            ms.translate(-(posX + totalRowWidth / 2f), -(curY + rowHeight / 2f), 0);

            String catIcon = entry.category().getIcons();
            drawIcon(catIcon, posX + padX + 1f, curY + 1.5f, HudColors.setAlpha(HudColors.getColorIcons(), itemAlpha), 7f);
            drawText(entry.label(), posX + padX + 9f, curY + 1.35f, HudColors.rgba(255, 255, 255, itemAlpha), 7f);

            drawKeybindCap(entry.bind(), posX + totalRowWidth - padX - maxBindBoxW, curY, maxBindBoxW, itemHeight, itemAlpha);

            ms.pop();
            curY += rowHeight;
        }

        if (showExample) {
            int exampleAlpha = headerAlpha;
            drawIcon(ModuleCategory.COMBAT.getIcons(), posX + padX + 1f, curY + 1.5f,
                    HudColors.setAlpha(HudColors.getColorIcons(), exampleAlpha), 7f);
            drawText("Example", posX + padX + 9f, curY + 1.35f, HudColors.rgba(255, 255, 255, exampleAlpha), 7f);
            drawKeybindCap("K", posX + totalRowWidth - padX - maxBindBoxW, curY, maxBindBoxW, itemHeight, exampleAlpha);
        }

        keyBindsDrag.setWidth(totalRowWidth);
        keyBindsDrag.setHeight(totalHeight);
    }

    /** Клавиша бинда в тёмном бейдже. */
    private void drawKeybindCap(String bind, float colX, float rowY, float colW, float itemHeight, int itemAlpha) {
        float bindW = width(bind, 6.75f);
        float capW = Math.min(colW, bindW + 8f);
        float capH = Math.max(7f, itemHeight - 1.5f);
        float capX = colX + (colW - capW) / 2f;
        float capY = rowY + (itemHeight - capH) / 2f;
        drawRound(capX, capY, capW, capH, 2f, HudColors.rgba(255, 255, 255, (int) (14f * itemAlpha / 255f)));
        float textX = capX + (capW - bindW) / 2f + 0.75f;
        float textY = capY + (capH - 6.75f) / 2f - 2f;
        drawText(bind, textX, textY, HudColors.rgba(255, 255, 255, itemAlpha), 6.75f);
    }

    // ===================== Кастомный хотбар / броня / тотемы =====================
    private static final float HB_PAD = 3f;
    private static final float HB_CELL = 20f;
    private static final float HB_ICON = 16f;
    private static final float HB_OFFHAND_GAP = 4f;

    private float hbMainWidth() {
        return HB_PAD * 2f + HB_CELL * 9f;
    }

    private float hbOffhandBoxW() {
        return HB_PAD * 2f + HB_CELL;
    }

    private float hbHeight() {
        return HB_PAD * 2f + HB_CELL;
    }

    private float hbBottomY() {
        return mc.getWindow().getScaledHeight() - 4f;
    }

    /** Правый видимый край основного блока хотбара (с учётом его масштаба). */
    private float hotbarMainVisualRight() {
        float size = hotbarPopup.size.get();
        return mc.getWindow().getScaledWidth() / 2f + hbMainWidth() * size / 2f;
    }

    /** Цвет полосы прочности: зелёный -> жёлтый -> красный. */
    private int durabilityColor(float ratio) {
        ratio = MathHelper.clamp(ratio, 0f, 1f);
        int rgb = java.awt.Color.HSBtoRGB(ratio * 0.33f, 0.85f, 0.95f);
        return HudColors.rgba((rgb >> 16) & 0xFF, (rgb >> 8) & 0xFF, rgb & 0xFF, 255);
    }

    private String trimTextToWidth(String text, float size, float maxWidth) {
        if (text == null || width(text, size) <= maxWidth) return text;
        String ellipsis = "..";
        String result = text;
        while (!result.isEmpty() && width(result + ellipsis, size) > maxWidth) {
            result = result.substring(0, result.length() - 1);
        }
        return result + ellipsis;
    }

    /** Текст с тёмной обводкой (для количества предметов). */
    private void drawOutlinedCount(String text, float x, float y, float size) {
        int outline = HudColors.rgba(0, 0, 0, 200);
        drawText(text, x - 0.6f, y, outline, size);
        drawText(text, x + 0.6f, y, outline, size);
        drawText(text, x, y - 0.6f, outline, size);
        drawText(text, x, y + 0.6f, outline, size);
        drawText(text, x, y, -1, size);
    }

    private void renderCustomHotbar(DrawContext context) {
        if (mc.player == null) return;

        float size = hotbarPopup.size.get();
        float offW = hbOffhandBoxW();
        float mainW = hbMainWidth();
        float height = hbHeight();
        float totalWidth = offW + HB_OFFHAND_GAP + mainW;
        float screenW = mc.getWindow().getScaledWidth();

        // Origin (левый-верх) так, чтобы ОСНОВНОЙ блок был по центру экрана, а низ — на hbBottomY()
        float ox = screenW / 2f - (offW + HB_OFFHAND_GAP + mainW / 2f) * size;
        float oy = hbBottomY() - height * size;

        hotbarDrag.setX(ox);
        hotbarDrag.setY(oy);
        hotbarDrag.setWidth(totalWidth);
        hotbarDrag.setHeight(height);

        if (!(mc.currentScreen instanceof ChatScreen)) {
            hotbarPopup.open = false;
            hotbarPopup.draggingSlider = null;
        }
        beginScale(hotbarPopup, context);
        renderCustomHotbarContent(context, ox, oy);
        endScale(hotbarPopup, context);
        runPopup(hotbarPopup, context);
    }

    private void renderCustomHotbarContent(DrawContext context, float ox, float oy) {
        float pad = HB_PAD;
        float cell = HB_CELL;
        float iconSize = HB_ICON;
        float offW = hbOffhandBoxW();
        float mainW = hbMainWidth();
        float height = hbHeight();

        int selected = mc.player.getInventory().selectedSlot;
        int divColor = HudColors.rgba(255, 255, 255, 35);

        // Офф-хенд — отдельный блок слева, как в ванилле
        float offX = ox;
        float offY = oy;
        drawElementBackground(hotbarPopup, offX, offY, offW, height, 3f, 1f);
        drawElementShine(hotbarPopup, context, offX, offY, offW, height, 3f);
        drawHotbarCell(context, mc.player.getOffHandStack(), offX + pad, offY + pad, cell, iconSize, false);

        // Основной блок: 9 слотов
        float mainX = ox + offW + HB_OFFHAND_GAP;
        float mainY = oy;
        drawElementBackground(hotbarPopup, mainX, mainY, mainW, height, 3f, 1f);
        drawElementShine(hotbarPopup, context, mainX, mainY, mainW, height, 3f);

        String lvl = String.valueOf(mc.player.experienceLevel);
        float lvlW = width(lvl, 8f);
        int xpColor = HudColors.rgba(80, 220, 80, 255);
        drawText(lvl, mainX + mainW / 2f - lvlW / 2f, mainY - 9f, xpColor, 8f);

        float cellY = mainY + pad;
        for (int i = 0; i < 9; i++) {
            float cellX = mainX + pad + i * cell;
            if (i > 0) {
                drawRound(cellX - 0.25f, cellY + 3f, 0.5f, cell - 6f, 0.25f, divColor);
            }
            drawHotbarCell(context, mc.player.getInventory().getStack(i), cellX, cellY, cell, iconSize, i == selected);
        }
    }

    private void drawHotbarCell(DrawContext context, ItemStack stack, float cellX, float cellY,
                                float cell, float iconSize, boolean selected) {
        if (selected) {
            drawRound(cellX + 0.5f, cellY, cell - 1f, cell, 2.5f,
                    HudColors.setAlpha(HudColors.getColorClient(), 90));
        }
        if (stack.isEmpty()) return;

        float iconX = cellX + (cell - iconSize) / 2f;
        float iconY = cellY + (cell - iconSize) / 2f;
        drawCooldownIcon(context, stack, iconX, iconY, iconSize, 255);

        if (hotbarCounts.isState() && stack.getCount() > 1) {
            String count = String.valueOf(stack.getCount());
            float cw = width(count, 7.5f);
            drawOutlinedCount(count, cellX + cell - cw - 1.5f, cellY + cell - 8.5f, 7.5f);
        }
    }

    private void renderArmourBar(DrawContext context) {
        if (mc.player == null) return;

        float pad = 3f;
        float cell = 20f;
        float iconSize = 16f;
        int count = 4;
        float width = pad * 2f + cell * count;
        float height = pad * 2f + cell;

        float size = armourPopup.size.get();
        float screenW = mc.getWindow().getScaledWidth();

        // Левый край примыкает к правому краю хотбара, низ выровнен с хотбаром
        float ox = hotbarMainVisualRight() + 4f;
        float oy = hbBottomY() - height * size;
        if (ox + width * size > screenW - 2f) ox = screenW - 2f - width * size;

        armourDrag.setX(ox);
        armourDrag.setY(oy);
        armourDrag.setWidth(width);
        armourDrag.setHeight(height);

        if (!(mc.currentScreen instanceof ChatScreen)) {
            armourPopup.open = false;
            armourPopup.draggingSlider = null;
        }
        beginScale(armourPopup, context);
        renderArmourBarContent(context, ox, oy, width, height, pad, cell, iconSize);
        endScale(armourPopup, context);
        runPopup(armourPopup, context);
    }

    private void renderArmourBarContent(DrawContext context, float posX, float posY, float width, float height,
                                        float pad, float cell, float iconSize) {
        boolean durability = armourDurability.isState();

        EquipmentSlot[] eqSlots = {
                EquipmentSlot.HEAD,
                EquipmentSlot.CHEST,
                EquipmentSlot.LEGS,
                EquipmentSlot.FEET
        };

        drawElementBackground(armourPopup, posX, posY, width, height, 3f, 1f);
        drawElementShine(armourPopup, context, posX, posY, width, height, 3f);

        for (int i = 0; i < eqSlots.length; i++) {
            float cellX = posX + pad + i * cell;
            float cellY = posY + pad;
            ItemStack stack = mc.player.getEquippedStack(eqSlots[i]);
            if (stack.isEmpty()) continue;

            float iconX = cellX + (cell - iconSize) / 2f;
            float iconY = cellY + (cell - iconSize) / 2f;
            drawCooldownIcon(context, stack, iconX, iconY, iconSize, 255);

            if (durability && stack.isDamageable() && stack.getMaxDamage() > 0) {
                float ratio = 1f - (float) stack.getDamage() / (float) stack.getMaxDamage();
                ratio = MathHelper.clamp(ratio, 0f, 1f);
                float barH = 2.5f;
                float barW = iconSize;
                float barX = cellX + (cell - barW) / 2f;
                float barY = cellY + cell - barH - 0.5f;
                drawRound(barX, barY, barW, barH, barH / 2f, HudColors.rgba(20, 20, 20, 200));
                drawRound(barX, barY, barW * ratio, barH, barH / 2f, durabilityColor(ratio));
            }
        }
    }

    private void renderTotemBar(DrawContext context) {
        if (mc.player == null) return;
        if (!(mc.currentScreen instanceof ChatScreen)) {
            totemBarPopup.open = false;
            totemBarPopup.draggingSlider = null;
        }
        beginScale(totemBarPopup, context);
        renderTotemBarContent(context);
        endScale(totemBarPopup, context);
        runPopup(totemBarPopup, context);
    }

    private void renderTotemBarContent(DrawContext context) {
        float posX = totemBarDrag.getX();
        float posY = totemBarDrag.getY();

        int totemCount = 0;
        for (int i = 0; i < mc.player.getInventory().size(); i++) {
            ItemStack stack = mc.player.getInventory().getStack(i);
            if (stack.getItem() == Items.TOTEM_OF_UNDYING) totemCount += stack.getCount();
        }

        String text = totemCount + "x";
        float pad = 4f;
        float iconSize = 16f;
        float textSize = 8f;
        float gap = 1.5f;
        float textW = width(text, textSize);

        float contentW = Math.max(iconSize, textW);
        float boxWidth = pad * 2f + contentW;
        float boxHeight = pad * 2f + iconSize + gap + textSize;

        drawElementBackground(totemBarPopup, posX, posY, boxWidth, boxHeight, 3f, 1f);
        drawElementShine(totemBarPopup, context, posX, posY, boxWidth, boxHeight, 3f);

        float iconX = posX + (boxWidth - iconSize) / 2f;
        float iconY = posY + pad;
        drawCooldownIcon(context, new ItemStack(Items.TOTEM_OF_UNDYING), iconX, iconY, iconSize, 255);

        drawText(text, posX + (boxWidth - textW) / 2f, iconY + iconSize + gap, -1, textSize);

        totemBarDrag.setWidth(boxWidth);
        totemBarDrag.setHeight(boxHeight);
    }

    // ===================== Активные модераторы =====================
    private final List<Staff> staffPlayers = new ArrayList<>();
    private final Pattern namePattern = Pattern.compile("^\\w{3,16}$");
    private final Pattern prefixMatches = Pattern.compile(".*(ꔷ|ꔳ|ꔩ|ꔥ|ꔡ|ꔗ|ꔓ|\\bmod\\b|\\badm\\b|\\bhelp\\b|\\bwne\\b|модер|хелп|помощ|админ|владел|отриц|\\btaf\\b|\\bcurat\\b|куратор|\\bdev\\b|разраб|\\bsupp\\b|саппорт|\\byt\\b|\\[yt\\]|ютуб|стажер|сотрудник).*");

    private void renderStaffList(DrawContext context) {
        if (mc.player == null) return;

        if (!(mc.currentScreen instanceof ChatScreen)) {
            stafflistPopup.open = false;
            stafflistPopup.draggingSlider = null;
        }

        beginScale(stafflistPopup, context);
        renderStaffListNew(context);
        endScale(stafflistPopup, context);

        runPopup(stafflistPopup, context);
    }

    private void renderStaffListNew(DrawContext context) {
        float posX = staffListDrag.getX();
        float posY = staffListDrag.getY();

        float headerHeight = 14f;
        float itemHeight = 11.5f;
        float minWidth = 52f;
        float padX = 5f;
        float padY = 2f;
        float statusBoxW = 12f;

        for (Staff staff : staffPlayers) staff.animation.run(staff.isOnServer ? 1 : 0);

        boolean isFound = false;
        for (Staff staff : staffPlayers) {
            if (staff.animation.getValue() > 0.001f) isFound = true;
        }

        if (!isFound && !(mc.currentScreen instanceof ChatScreen)) alpha2.run(0);
        else alpha2.run(1);

        float globalAlpha = (float) alpha2.getValue();
        if (globalAlpha <= 0.05f) return;

        int headerAlpha = (int) Math.min(255, Math.max(0, 255 * globalAlpha));

        boolean showExample = (mc.currentScreen instanceof ChatScreen) && !isFound;

        float maxNameBoxW = minWidth;
        for (Staff staff : staffPlayers) {
            if (staff.animation.getValue() > 0.001f) {
                float nw = 11f + width(staff.prefix, 7f) + 7f;
                if (nw > maxNameBoxW) maxNameBoxW = nw;
            }
        }
        if (showExample) {
            float nw = 11f + width("Example", 7f) + 7f;
            if (nw > maxNameBoxW) maxNameBoxW = nw;
        }

        // Плавная высота по сумме анимированных строк и плавная ширина
        float contentHeight = 0f;
        if (showExample) {
            contentHeight = itemHeight;
        } else {
            for (Staff staff : staffPlayers) {
                float av = (float) staff.animation.getValue();
                if (av <= 0.001f) continue;
                contentHeight += itemHeight * av;
            }
        }

        float rawWidth = maxNameBoxW + statusBoxW + padX * 2;
        stafflistPopup.panelWidth.run(rawWidth);
        float totalRowWidth = (float) stafflistPopup.panelWidth.getValue();
        if (totalRowWidth < 20f) totalRowWidth = rawWidth;
        float totalHeight = headerHeight + contentHeight + padY * 2;

        drawElementBackground(stafflistPopup, posX, posY, totalRowWidth, totalHeight, HUD_PANEL_RADIUS, globalAlpha);
        drawElementShine(stafflistPopup, context, posX, posY, totalRowWidth, totalHeight, HUD_PANEL_RADIUS);
        drawHudHeader("Staff List", ICON_STAFF, posX, posY, totalRowWidth, headerHeight, headerAlpha);

        float curY = posY + headerHeight + padY;

        for (Staff staff : staffPlayers) {
            float animVal = (float) staff.animation.getValue();
            if (animVal <= 0.001f) continue;

            int itemAlpha = (int) Math.min(255, Math.max(0, 255 * animVal * globalAlpha));
            if (itemAlpha < 5) continue;

            float rowHeight = itemHeight * animVal;
            ms.push();
            ms.translate(posX + totalRowWidth / 2f, curY + rowHeight / 2f, 0);
            ms.scale(animVal, animVal, animVal);
            ms.translate(-(posX + totalRowWidth / 2f), -(curY + rowHeight / 2f), 0);

            float headSize = 8f;
            Identifier skinTexture = null;
            if (mc.getNetworkHandler() != null) {
                PlayerListEntry playerEntry = mc.getNetworkHandler().getPlayerListEntry(staff.name);
                if (playerEntry != null) skinTexture = playerEntry.getSkinTextures().texture();
            }
            if (skinTexture == null) skinTexture = DefaultSkinHelper.getTexture();
            RenderUtils.drawPlayerHead(ms, skinTexture, posX + padX + 1f,
                    curY + (itemHeight - headSize) / 2f, headSize, 2f, itemAlpha / 255f, 0f);

            drawText(staff.prefix, posX + padX + 10f, curY + (itemHeight - 7f) / 2f - 0.35f, 7f, itemAlpha);

            int dotColor = staff.status == Status.NONE
                    ? HudColors.rgba(32, 255, 32, itemAlpha)
                    : HudColors.rgba(255, 32, 32, itemAlpha);
            float dotCX = posX + totalRowWidth - padX - statusBoxW / 2f;
            drawCircle(dotCX, curY + itemHeight / 2f, 3.5f, dotColor);

            ms.pop();
            curY += rowHeight;
        }

        if (showExample) {
            int exampleAlpha = headerAlpha;
            float headSize = 8f;
            RenderUtils.drawPlayerHead(ms, DefaultSkinHelper.getTexture(), posX + padX + 1f,
                    curY + (itemHeight - headSize) / 2f, headSize, 2f, exampleAlpha / 255f, 0f);

            drawText("Example", posX + padX + 10f, curY + (itemHeight - 7f) / 2f - 0.35f,
                    HudColors.rgba(255, 255, 255, exampleAlpha), 7f);
            float dotCX = posX + totalRowWidth - padX - statusBoxW / 2f;
            drawCircle(dotCX, curY + itemHeight / 2f, 3.5f, HudColors.rgba(32, 255, 32, exampleAlpha));
        }

        staffListDrag.setWidth(totalRowWidth);
        staffListDrag.setHeight(totalHeight);
    }

    public void update() {
        if (mc.getNetworkHandler() == null || mc.player == null) return;

        for (Staff staff : staffPlayers) {
            staff.isOnServer = false;
        }

        for (PlayerListEntry playerListEntry : mc.getNetworkHandler().getPlayerList()) {
            String name = playerListEntry.getProfile().getName().replaceAll("[\\[\\]]", "");
            PlayerListEntry info = mc.getNetworkHandler().getPlayerListEntry(name);
            boolean vanish = info == null;
            boolean isGM3 = info != null && info.getGameMode() == GameMode.SPECTATOR;

            boolean matchesPrefix = prefixMatches.matcher(playerListEntry.getDisplayName() != null
                    ? playerListEntry.getDisplayName().getString().toLowerCase(Locale.ROOT) : "").matches();
            boolean isValidName = namePattern.matcher(name).matches();
            boolean notSelf = !name.equals(mc.player.getName().getString());
            boolean markedStaff = CrickClient.INSTANCE.staffStorage != null
                    && CrickClient.INSTANCE.staffStorage.isStaff(name);

            if ((isValidName && notSelf && matchesPrefix) || (isValidName && notSelf && vanish) || markedStaff) {
                if (markedStaff && isShopName(name)) continue;

                Optional<Staff> existingStaff = staffPlayers.stream().filter(s -> s.name.equals(name)).findFirst();
                Status status = vanish ? Status.VANISHED : (isGM3 ? Status.VANISHED : Status.NONE);

                if (existingStaff.isPresent()) {
                    Staff staff = existingStaff.get();
                    staff.isOnServer = true;
                    staff.status = status;
                } else if (!isShopName(name)) {
                    Text prefix = trimPrefixToNick(playerListEntry.getDisplayName(), name);
                    Staff staff = new Staff(prefix == null ? Text.of(playerListEntry.getProfile().getName()) : prefix,
                            name, vanish || isGM3, status);
                    staff.isOnServer = true;
                    staffPlayers.add(staff);
                }
            }
        }

        staffPlayers.removeIf(staff -> !staff.isOnServer && staff.animation.getValue() == 0);
    }

    private static final String[] SHOP_NAMES = {
            "auction", "exp_smith", "shop_balls", "shop_grief", "free", "shop_kits", "siege", "rwplus",
            "bossfight", "guide", "shop_smith", "shop_spawners", "colliseum", "battlepass", "buyer",
            "huckster", "buff_brewer", "killer", "shop_mage"
    };

    /** Служебные NPC магазинов на некоторых серверах не считаем модераторами. */
    private boolean isShopName(String name) {
        if (mc.getCurrentServerEntry() == null || mc.getCurrentServerEntry().address == null) return false;
        String address = mc.getCurrentServerEntry().address;
        if (!address.contains("mc.rwdonat.pw") && !address.contains("mc.cakeworld.pw")) return false;
        return Arrays.stream(SHOP_NAMES).anyMatch(name::contains);
    }

    /** Обрезает префикс ника так, чтобы остался только сам ник с его форматированием. */
    private Text trimPrefixToNick(Text originalPrefix, String name) {
        Text prefix = originalPrefix;
        if (prefix == null) return null;

        prefix = ReplaceUtils.replaceSymbols(prefix);
        String fullString = prefix.getString();
        int nickIndex = fullString.indexOf(name);
        if (nickIndex == -1) return prefix;

        int endIndex = nickIndex + name.length();
        if (endIndex >= fullString.length()) return prefix;

        MutableText newText = Text.empty();
        int currentLength = 0;
        MutableText baseCopy = prefix.copy();
        baseCopy.getSiblings().clear();
        String mainContent = baseCopy.getString();

        if (!mainContent.isEmpty() && currentLength < endIndex) {
            int takeLength = Math.min(mainContent.length(), endIndex - currentLength);
            newText.append(Text.literal(mainContent.substring(0, takeLength)).setStyle(prefix.getStyle()));
            currentLength += takeLength;
        }

        for (Text sibling : prefix.getSiblings()) {
            if (currentLength >= endIndex) break;
            MutableText siblingCopy = sibling.copy();
            siblingCopy.getSiblings().clear();
            String siblingContent = siblingCopy.getString();

            int takeLength = Math.min(siblingContent.length(), endIndex - currentLength);
            if (takeLength > 0) {
                newText.append(Text.literal(siblingContent.substring(0, takeLength)).setStyle(sibling.getStyle()));
                currentLength += takeLength;
            }
        }

        return newText;
    }

    public enum Status {
        NONE("", -1),
        VANISHED("SPEC", HudColors.rgba(229, 0, 63, 255));

        public final String string;
        public final int color;

        Status(String string, int color) {
            this.string = string;
            this.color = color;
        }
    }

    public static class Staff {
        Text prefix;
        public String name;
        boolean isSpec;
        Status status;
        boolean isOnServer;
        TimedAnimation animation;
        long mills;

        public Staff(Text prefix, String name, boolean isSpec, Status status) {
            this.prefix = prefix;
            this.name = name;
            this.isSpec = isSpec;
            this.status = status;
            this.animation = new TimedAnimation(Easings.EXPO_OUT, 233);
            this.mills = System.currentTimeMillis();
        }
    }

    public int getPing(PlayerEntity entity) {
        if (mc.getNetworkHandler() == null || entity == null) return 0;
        PlayerListEntry list = mc.getNetworkHandler().getPlayerListEntry(entity.getUuid());
        return list != null ? list.getLatency() : 0;
    }

    // ===================== Инфраструктура окон настроек элементов =====================
    private enum PopupKind {TOGGLE, SLIDER}

    private static final class PopupRow {
        final PopupKind kind;
        final String label;
        final BooleanSetting bool;
        final FloatSetting slider;
        float x, y, w, h;

        PopupRow(PopupKind kind, String label, BooleanSetting bool, FloatSetting slider) {
            this.kind = kind;
            this.label = label;
            this.bool = bool;
            this.slider = slider;
        }
    }

    /** Набор настроек и состояние окна для одного HUD-элемента. */
    private static final class HudPopup {
        final String title;
        final Draggable drag;
        final BooleanSetting blur, shine, corners;
        final FloatSetting size, alpha, shineAlpha, shineThickness;
        final BooleanSetting ring; // nullable — только для Potions/CoolDowns

        boolean open = false;
        boolean transformed = false;
        final TimedAnimation anim = new TimedAnimation(Easings.EXPO_OUT, 250);
        /** Плавное изменение ширины панели при появлении/исчезновении строк. */
        final TimedAnimation panelWidth = new TimedAnimation(Easings.EXPO_OUT, 220);
        final List<PopupRow> rendered = new ArrayList<>();
        /** Дополнительные строки-переключатели (специфичные для элемента). */
        final List<PopupRow> extraRows = new ArrayList<>();
        float px, py, pw, ph;
        FloatSetting draggingSlider = null;
        float trackX, trackW;

        HudPopup(String title, Draggable drag,
                 BooleanSetting blur, FloatSetting size, FloatSetting alpha, BooleanSetting ring,
                 BooleanSetting shine, FloatSetting shineAlpha, FloatSetting shineThickness,
                 BooleanSetting corners) {
            this.title = title;
            this.drag = drag;
            this.blur = blur;
            this.size = size;
            this.alpha = alpha;
            this.ring = ring;
            this.shine = shine;
            this.shineAlpha = shineAlpha;
            this.shineThickness = shineThickness;
            this.corners = corners;
        }
    }

    private List<PopupRow> buildRows(HudPopup popup) {
        List<PopupRow> rows = new ArrayList<>();
        rows.add(new PopupRow(PopupKind.SLIDER, "Размер", null, popup.size));
        rows.add(new PopupRow(PopupKind.TOGGLE, "Блюр", popup.blur, null));
        rows.add(new PopupRow(PopupKind.SLIDER, "Прозрачность", null, popup.alpha));
        if (popup.ring != null) rows.add(new PopupRow(PopupKind.TOGGLE, "Кольцо таймер", popup.ring, null));
        rows.add(new PopupRow(PopupKind.TOGGLE, "Блик", popup.shine, null));
        if (popup.shine.isState()) {
            rows.add(new PopupRow(PopupKind.SLIDER, "Прозрачность блика", null, popup.shineAlpha));
            rows.add(new PopupRow(PopupKind.SLIDER, "Толщина блика", null, popup.shineThickness));
        }
        rows.addAll(popup.extraRows);
        return rows;
    }

    private double hudMouseX() {
        return mc.mouse.getX() / mc.getWindow().getScaleFactor();
    }

    private double hudMouseY() {
        return mc.mouse.getY() / mc.getWindow().getScaleFactor();
    }

    /**
     * Масштабирование и покачивание всего элемента (масштаб — вокруг левого верхнего угла,
     * покачивание «качели» — вокруг центра элемента).
     */
    private void beginScale(HudPopup popup, DrawContext context) {
        float size = popup.size.get();
        float angle = popup.drag.getWobbleAngle();
        boolean needScale = Math.abs(size - 1f) > 0.001f;
        boolean needRot = Math.abs(angle) > 0.01f;
        popup.transformed = needScale || needRot;
        if (!popup.transformed) return;

        float ox = popup.drag.getX();
        float oy = popup.drag.getY();
        float cx = ox + popup.drag.getWidth() / 2f;
        float cy = oy + popup.drag.getHeight() / 2f;

        ms.push();
        if (needScale) {
            ms.translate(ox, oy, 0f);
            ms.scale(size, size, 1f);
            ms.translate(-ox, -oy, 0f);
        }
        if (needRot) {
            ms.translate(cx, cy, 0f);
            ms.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(angle));
            ms.translate(-cx, -cy, 0f);
        }
    }

    private void endScale(HudPopup popup, DrawContext context) {
        if (!popup.transformed) return;
        ms.pop();
    }

    private void runPopup(HudPopup popup, DrawContext context) {
        popup.anim.run(popup.open ? 1 : 0);
        if (popup.anim.getValue() > 0.01f) {
            renderSettingsPopup(popup, context);
        }
    }

    /** Единый фон элемента: чёрное стекло + blur. */
    private void drawElementBackground(HudPopup popup, float x, float y, float w, float h, float radius, float alphaFactor) {
        float clampFactor = MathHelper.clamp(alphaFactor, 0f, 1f);
        int alpha = (int) (popup.alpha.get() * clampFactor);
        alpha = Math.min(255, Math.max(0, alpha));
        int bg = HudColors.rgba(0, 0, 0, alpha);
        if (popup.blur.isState()) {
            int blurAlpha = Math.min(255, Math.max(0, (int) (255 * clampFactor)));
            drawRoundBlur(x, y, w, h, radius, HudColors.rgba(200, 200, 200, blurAlpha), 12f);
        }
        drawRound(x, y, w, h, radius, bg);
    }

    private void drawHudHeader(String title, String iconGlyph, float x, float y, float w, float headerH, int alpha) {
        drawText(title, x + 5f, y + 2.5f, HudColors.rgba(255, 255, 255, alpha), 8f);
        float iconW = iconWidth(iconGlyph, 9f);
        drawIcon(iconGlyph, x + w - 5f - iconW, y + 3f, HudColors.setAlpha(HudColors.getColorIcons(), alpha), 9f);
        drawRound(x + 4f, y + headerH - 0.5f, w - 8f, 0.5f, 0.25f,
                HudColors.rgba(255, 255, 255, Math.min(255, Math.max(0, alpha / 10))));
    }

    private void drawElementShine(HudPopup popup, DrawContext context, float x, float y, float w, float h, float radius) {
        if (!popup.shine.isState()) return;
        HudShine.render(ms, x, y, w, h, radius,
                popup.shineThickness.get(), 1f, popup.shineAlpha.get() / 100f);
    }

    private static final float POPUP_HEADER_H = 15f;
    private static final float POPUP_TOGGLE_H = 14f;
    private static final float POPUP_SLIDER_H = 19f;
    private static final float POPUP_PAD = 4f;
    private static final float POPUP_TRACK_INSET = 6f;

    private void renderSettingsPopup(HudPopup popup, DrawContext context) {
        List<PopupRow> rows = buildRows(popup);

        // Ширина окна под самую длинную строку
        float w = 96f;
        for (PopupRow row : rows) {
            float lw = width(row.label, 6.75f);
            float need = lw + 12f + (row.kind == PopupKind.TOGGLE ? 22f : 34f);
            if (need > w) w = need;
        }

        float totalH = POPUP_HEADER_H + POPUP_PAD;
        for (PopupRow row : rows) {
            totalH += (row.kind == PopupKind.TOGGLE ? POPUP_TOGGLE_H : POPUP_SLIDER_H);
        }

        float ex = popup.drag.getX();
        float ey = popup.drag.getY();
        float ew = popup.drag.getWidth();

        float screenW = mc.getWindow().getScaledWidth();
        float screenH = mc.getWindow().getScaledHeight();

        // Обычно окно открывается справа от элемента, но для кастомного хотбара — слева
        float x = popup.title.equals("CustomHotbar") ? ex - w - 4f : ex + ew + 4f;
        float y = ey;

        x = MathHelper.clamp(x, 2f, Math.max(2f, screenW - w - 2f));
        y = MathHelper.clamp(y, 2f, Math.max(2f, screenH - totalH - 2f));

        popup.px = x;
        popup.py = y;
        popup.pw = w;
        popup.ph = totalH;

        float anim = (float) popup.anim.getValue();
        int a = (int) Math.min(255, Math.max(0, 255 * anim));

        drawBackground(x, y, w, totalH, 4f, a);

        drawText("Настройки", x + 6f, y + 4.5f, HudColors.rgba(255, 255, 255, a), 7.5f);
        drawRound(x + 5f, y + POPUP_HEADER_H - 1.5f, w - 10f, 0.5f, 0f, HudColors.rgba(120, 120, 120, a));

        float cy = y + POPUP_HEADER_H;
        for (PopupRow row : rows) {
            row.x = x;
            row.y = cy;
            row.w = w;
            row.h = (row.kind == PopupKind.TOGGLE ? POPUP_TOGGLE_H : POPUP_SLIDER_H);

            if (row.kind == PopupKind.TOGGLE) {
                drawPopupToggleRow(row.label, row.bool, row.x, row.y, row.w, row.h, a);
            } else {
                drawPopupSliderRow(row.label, row.slider, row.x, row.y, row.w, row.h, a);
            }
            cy += row.h;
        }

        popup.rendered.clear();
        popup.rendered.addAll(rows);

        if (popup.draggingSlider != null) {
            FloatSetting slider = popup.draggingSlider;
            double value = (hudMouseX() - popup.trackX) / popup.trackW
                    * (slider.getMax() - slider.getMin()) + slider.getMin();
            slider.setValue(stepValue(slider, value));
        }
    }

    private float stepValue(FloatSetting setting, double rawValue) {
        double step = setting.getIncrement();
        if (step <= 0) step = 0.01;
        return (float) (Math.round(rawValue / step) * step);
    }

    private void drawPopupToggleRow(String label, BooleanSetting setting, float x, float y, float w, float h, int a) {
        TimedAnimation toggleAnim = toggleAnimation(setting);
        toggleAnim.run(setting.isState() ? 1 : 0);

        drawText(label, x + 6f, y + (h / 2f) - 3.25f, HudColors.rgba(255, 255, 255, a), 6.75f);

        float toggleW = 15f;
        float toggleH = 8f;
        float toggleX = x + w - toggleW - 6f;
        float toggleY = y + (h - toggleH) / 2f;

        float tAnim = (float) toggleAnim.getValue();
        int inactive = HudColors.setAlpha(HudColors.getColorInactiveIndicator(), a);
        int active = HudColors.setAlpha(HudColors.getColorIndicator(), a);
        int bg = HudColors.interpolateColor(inactive, active, tAnim);
        drawRound(toggleX, toggleY, toggleW, toggleH, toggleH / 2f, bg);

        float knob = toggleH - 1f;
        float knobMinX = toggleX + 0.5f;
        float knobMaxX = toggleX + toggleW - knob - 0.5f;
        float knobX = knobMinX + (knobMaxX - knobMinX) * tAnim;
        drawCircle(knobX + knob / 2f, toggleY + 0.5f + knob / 2f, knob / 2f,
                HudColors.setAlpha(HudColors.getColorSliderCircle(), a));
    }

    private String formatSliderValue(FloatSetting setting) {
        if (setting.getIncrement() < 1f) {
            return String.format(Locale.US, "%.2f", setting.get());
        }
        return String.valueOf((int) setting.get());
    }

    private void drawPopupSliderRow(String label, FloatSetting setting, float x, float y, float w, float h, int a) {
        drawText(label, x + 6f, y + 2.5f, HudColors.rgba(255, 255, 255, a), 6.5f);

        String valStr = formatSliderValue(setting);
        float valW = width(valStr, 6.5f);
        drawText(valStr, x + w - 6f - valW, y + 2.5f, HudColors.setAlpha(HudColors.getColorInactiveText(), a), 6.5f);

        float trackX = x + POPUP_TRACK_INSET;
        float trackW = w - POPUP_TRACK_INSET * 2f;
        float trackY = y + h - 5.5f;

        drawRound(trackX, trackY, trackW, 3f, 1f, HudColors.setAlpha(HudColors.getColorSliderWindow(), a));

        float fill = trackW * (setting.get() - setting.getMin()) / (setting.getMax() - setting.getMin());
        fill = MathHelper.clamp(fill, 0f, trackW);
        drawRound(trackX, trackY, fill, 3f, 1f, HudColors.setAlpha(HudColors.getColorSlider(), a));

        float circleX = trackX + fill;
        drawRound(circleX - 2.5f, trackY - 1f, 5f, 5f, 1.75f, HudColors.setAlpha(HudColors.getColorSliderCircle(), a));
    }

    public boolean isPotionsActive() {
        return isEnable() && elements.is("Бафы");
    }

    public boolean isCustomHotbarActive() {
        return isEnable() && elements.is("Кастомный хотбар");
    }

    /** Роутинг кликов чата на настройки HUD-элементов. */
    public boolean handleHudContextClick(double mouseX, double mouseY, int button) {
        if (!isEnable() || !(mc.currentScreen instanceof ChatScreen)) return false;
        if (elements.is("Бафы") && handleElementClick(potionsPopup, mouseX, mouseY, button)) return true;
        if (elements.is("КулДауны") && handleElementClick(cooldownsPopup, mouseX, mouseY, button)) return true;
        if (elements.is("ServerHelper") && handleElementClick(serverHelperPopup, mouseX, mouseY, button)) return true;
        if (elements.is("Привязанные модули") && handleElementClick(keybindsPopup, mouseX, mouseY, button)) return true;
        if (elements.is("Активные модераторы") && handleElementClick(stafflistPopup, mouseX, mouseY, button)) return true;
        if (elements.is("Ватермарка") && handleElementClick(watermarkPopup, mouseX, mouseY, button)) return true;
        if (elements.is("Инфо") && handleElementClick(infoPopup, mouseX, mouseY, button)) return true;
        if (elements.is("Активный таргет") && handleElementClick(targetHudPopup, mouseX, mouseY, button)) return true;
        if (elements.is("Нотификации") && handleElementClick(notificationsPopup, mouseX, mouseY, button)) return true;
        if (elements.is("Кастомный хотбар") && handleElementClick(hotbarPopup, mouseX, mouseY, button)) return true;
        if (elements.is("Броня") && handleElementClick(armourPopup, mouseX, mouseY, button)) return true;
        if (elements.is("Полоса тотемов") && handleElementClick(totemBarPopup, mouseX, mouseY, button)) return true;
        return false;
    }

    private boolean handleElementClick(HudPopup popup, double mouseX, double mouseY, int button) {
        if (popup.open && popup.anim.getValue() > 0.5f) {
            if (button == 0) {
                for (PopupRow row : popup.rendered) {
                    if (!HoveringUtils.isInRegion(mouseX, mouseY, row.x, row.y, row.w, row.h)) continue;
                    if (row.kind == PopupKind.TOGGLE) {
                        row.bool.toggle();
                    } else {
                        popup.draggingSlider = row.slider;
                        popup.trackX = row.x + POPUP_TRACK_INSET;
                        popup.trackW = row.w - POPUP_TRACK_INSET * 2f;
                        double value = (mouseX - popup.trackX) / popup.trackW
                                * (row.slider.getMax() - row.slider.getMin()) + row.slider.getMin();
                        row.slider.setValue(stepValue(row.slider, value));
                    }
                    return true;
                }
            }
            if (HoveringUtils.isInRegion(mouseX, mouseY, popup.px, popup.py, popup.pw, popup.ph)) {
                return true;
            }
        }

        if (button == 1 && popup.drag.isHovering()) {
            popup.open = !popup.open;
            return true;
        }

        // Клик мимо элемента и окна закрывает настройки
        if (popup.open && !popup.drag.isHovering()) {
            popup.open = false;
        }
        return false;
    }

    public void handleHudRelease(int button) {
        if (button != 0) return;
        potionsPopup.draggingSlider = null;
        cooldownsPopup.draggingSlider = null;
        serverHelperPopup.draggingSlider = null;
        keybindsPopup.draggingSlider = null;
        stafflistPopup.draggingSlider = null;
        watermarkPopup.draggingSlider = null;
        infoPopup.draggingSlider = null;
        targetHudPopup.draggingSlider = null;
        notificationsPopup.draggingSlider = null;
        hotbarPopup.draggingSlider = null;
        armourPopup.draggingSlider = null;
        totemBarPopup.draggingSlider = null;
    }

    // ===================== Бафы =====================
    private static final float POTION_RING_DIAMETER = 8f;
    private static final float POTION_RING_GAP = 3f;
    private static final float POTION_RING_THICKNESS = 1.4f;

    private static class PotionItem {
        String name;
        int amplifier;
        int durationTicks;
        int maxDurationTicks;
        boolean active;
        RegistryEntry<StatusEffect> effect;
        TimedAnimation animation = new TimedAnimation(Easings.EXPO_OUT, 233);
        TimedAnimation rowAnim = new TimedAnimation(Easings.QUAD_OUT, 150);

        PotionItem(String name, int amplifier, int durationTicks, RegistryEntry<StatusEffect> effect) {
            this.name = name;
            this.amplifier = amplifier;
            this.durationTicks = durationTicks;
            this.maxDurationTicks = durationTicks;
            this.effect = effect;
            this.active = true;
        }
    }

    private final List<PotionItem> potionItems = new CopyOnWriteArrayList<>();

    private RegistryEntry<StatusEffect> currentRandomEffect;
    private long lastEffectChange = 0;
    private static List<RegistryEntry<StatusEffect>> cachedAllEffects;
    private static final Random RANDOM = new Random();

    private void updatePotions() {
        Map<String, StatusEffectInstance> currentEffects = mc.player.getStatusEffects().stream()
                .collect(Collectors.toMap(
                        e -> Text.translatable(e.getTranslationKey()).getString() + ":" + e.getAmplifier(),
                        e -> e,
                        (first, second) -> first
                ));

        potionItems.forEach(item -> {
            String key = item.name + ":" + item.amplifier;
            StatusEffectInstance effect = currentEffects.get(key);

            if (effect != null) {
                item.durationTicks = effect.getDuration();
                if (item.durationTicks > item.maxDurationTicks) {
                    item.maxDurationTicks = item.durationTicks;
                }
                if (!item.active) {
                    item.animation.setValue(1.0f);
                }
                item.active = true;
                currentEffects.remove(key);
            } else {
                item.active = false;
            }
        });

        boolean added = !currentEffects.isEmpty();
        currentEffects.forEach((key, effect) -> potionItems.add(new PotionItem(
                Text.translatable(effect.getTranslationKey()).getString(),
                effect.getAmplifier(),
                effect.getDuration(),
                effect.getEffectType()
        )));

        boolean removed = potionItems.removeIf(item -> !item.active && item.animation.getValue() == 0);

        // Сортируем только когда набор изменился, а не каждый кадр в рендере
        if (added || removed) {
            potionItems.sort(Comparator.comparing(item -> item.name));
        }
    }

    private void renderPotions(DrawContext context) {
        if (mc.player == null) return;

        if (!(mc.currentScreen instanceof ChatScreen)) {
            potionsPopup.open = false;
            potionsPopup.draggingSlider = null;
        }

        beginScale(potionsPopup, context);
        renderPotionsNew(context);
        endScale(potionsPopup, context);

        runPopup(potionsPopup, context);
    }

    private void renderPotionsNew(DrawContext context) {
        if (mc.player == null) return;

        float posX = potionsDrag.getX();
        float posY = potionsDrag.getY();

        float headerHeight = 14f;
        float itemHeight = 12f;
        float minWidth = 52f;
        float padX = 5f;
        float padY = 2f;

        boolean isFound = false;
        for (PotionItem item : potionItems) {
            item.animation.run(item.active ? 1 : 0);
            item.rowAnim.run(item.active ? 1 : 0);
            if (item.animation.getValue() > 0.001f) isFound = true;
        }

        if (!isFound && !(mc.currentScreen instanceof ChatScreen)) alpha3.run(0);
        else alpha3.run(1);

        float globalAlpha = (float) alpha3.getValue();
        if (globalAlpha <= 0.05f) return;

        int headerAlpha = (int) Math.min(255, Math.max(0, 255 * globalAlpha));

        boolean showExample = (mc.currentScreen instanceof ChatScreen) && !isFound;
        if (showExample) {
            long currentTime = System.currentTimeMillis();
            if (currentTime - lastEffectChange > 2000) {
                if (cachedAllEffects == null) {
                    cachedAllEffects = new ArrayList<>();
                    Registries.STATUS_EFFECT.streamEntries().forEach(cachedAllEffects::add);
                }
                if (!cachedAllEffects.isEmpty()) {
                    currentRandomEffect = cachedAllEffects.get(RANDOM.nextInt(cachedAllEffects.size()));
                    lastEffectChange = currentTime;
                }
            }
        }

        float maxNameBoxW = minWidth;
        float maxTimeBoxW = 0f;
        float contentHeight = 0f;
        for (PotionItem item : potionItems) {
            float animVal = (float) item.animation.getValue();
            if (animVal > 0.001f) {
                contentHeight += itemHeight * (float) item.rowAnim.getValue();
                String lvlStr = item.amplifier >= 0 ? " " + toRomanLevel(item.amplifier) : "";
                float nameW = width(item.name + lvlStr, 7f);
                float nw = nameW + 8f + 10f + 10f;
                if (nw > maxNameBoxW) maxNameBoxW = nw;

                int seconds = item.durationTicks / 20;
                String timeStr = formatHudDuration(seconds);
                float tw = width(timeStr, 6.75f) + 10f
                        + (potionsRing.isState() ? POTION_RING_DIAMETER + POTION_RING_GAP : 0f);
                if (tw > maxTimeBoxW) maxTimeBoxW = tw;
            }
        }

        if (showExample) {
            float exNameW = width("Example", 7f);
            if (exNameW + 8f + 10f + 10f > maxNameBoxW) maxNameBoxW = exNameW + 8f + 10f + 10f;
            float exTimeW = width("**:**", 6.75f) + 10f
                    + (potionsRing.isState() ? POTION_RING_DIAMETER + POTION_RING_GAP : 0f);
            if (exTimeW > maxTimeBoxW) maxTimeBoxW = exTimeW;
            contentHeight = itemHeight;
        }

        float rawWidth = maxNameBoxW + maxTimeBoxW + padX * 2;
        potionsPopup.panelWidth.run(rawWidth);
        float totalRowWidth = (float) potionsPopup.panelWidth.getValue();
        if (totalRowWidth < 20f) totalRowWidth = rawWidth;
        float totalHeight = headerHeight + contentHeight + padY * 2;

        drawElementBackground(potionsPopup, posX, posY, totalRowWidth, totalHeight, HUD_PANEL_RADIUS, globalAlpha);
        drawElementShine(potionsPopup, context, posX, posY, totalRowWidth, totalHeight, HUD_PANEL_RADIUS);
        drawHudHeader("Effects", ICON_EFFECTS, posX, posY, totalRowWidth, headerHeight, headerAlpha);

        float curY = posY + headerHeight + padY;

        for (PotionItem item : potionItems) {
            float animVal = (float) item.animation.getValue();
            if (animVal <= 0.001f) continue;

            float rowAnimVal = (float) item.rowAnim.getValue();
            if (rowAnimVal <= 0.001f) continue;

            int seconds = item.durationTicks / 20;
            String timeStr = formatHudDuration(seconds);
            String nameStr = item.name + (item.amplifier >= 0 ? " " + toRomanLevel(item.amplifier) : "");

            boolean isHarmful = !item.effect.value().isBeneficial();
            Identifier effectIdentifier = Registries.STATUS_EFFECT.getId(item.effect.value());
            String effectId = effectIdentifier == null ? "unknown" : effectIdentifier.getPath();
            boolean isNightVision = effectId.equals("night_vision");

            // Мигание для истекающих эффектов (кроме ночного зрения)
            int textAlpha = 255;
            if (item.durationTicks <= 200 && item.durationTicks > 0 && !isNightVision) {
                double output = 0.5 + 0.5 * Math.cos(2 * Math.PI * (System.currentTimeMillis() % 700) / 700.0);
                textAlpha = (int) (100 + (155 * output));
            } else if (item.durationTicks == 0) {
                textAlpha = 0;
            }

            int itemAlpha = (int) Math.min(255, Math.max(0, textAlpha * animVal * globalAlpha));
            if (itemAlpha < 5) continue;

            float timeW = width(timeStr, 6.75f);
            float timeBoxW = timeW + 10f;

            float rowHeight = itemHeight * rowAnimVal;
            ms.push();
            ms.translate(posX + totalRowWidth / 2f, curY + rowHeight / 2f, 0);
            ms.scale(rowAnimVal, rowAnimVal, rowAnimVal);
            ms.translate(-(posX + totalRowWidth / 2f), -(curY + rowHeight / 2f), 0);

            float potionMid = textMidY(curY + 2.5f, 7f);
            Sprite sprite = mc.getStatusEffectSpriteManager().getSprite(item.effect);
            if (sprite != null) {
                float iconSize = 8f;
                float iconX = posX + padX + 2f;
                float iconY = potionMid - iconSize / 2f;
                int color = (itemAlpha << 24) | 0xFFFFFF;
                RenderSystem.setShaderColor(1f, 1f, 1f, itemAlpha / 255f);
                context.drawSpriteStretched(RenderLayer::getGuiTextured, sprite,
                        (int) iconX, (int) iconY, (int) iconSize, (int) iconSize, color);
                RenderSystem.setShaderColor(1f, 1f, 1f, 1f);
            }

            int nameColor = isHarmful
                    ? HudColors.rgba(255, 80, 80, itemAlpha)
                    : HudColors.rgba(255, 255, 255, itemAlpha);
            float textX = posX + padX + 12f;
            drawText(nameStr, textX, curY + 2.5f, nameColor, 7f);

            float timerX = posX + totalRowWidth - padX - timeBoxW;

            // Кольцо-таймер слева от времени
            if (potionsRing.isState()) {
                float ringRadius = POTION_RING_DIAMETER / 2f;
                float ringCX = timerX - POTION_RING_GAP - ringRadius;
                float ringCY = curY + itemHeight / 2f;
                float progress = 1f;
                if (item.maxDurationTicks > 0 && item.durationTicks >= 0) {
                    progress = MathHelper.clamp((float) item.durationTicks / (float) item.maxDurationTicks, 0f, 1f);
                }
                drawRingArc(ringCX, ringCY, ringRadius, POTION_RING_THICKNESS, -90f, 270f,
                        HudColors.rgba(80, 80, 80, itemAlpha));
                if (progress > 0f) {
                    drawRingArc(ringCX, ringCY, ringRadius, POTION_RING_THICKNESS, -90f, -90f + 360f * progress,
                            HudColors.setAlpha(HudColors.getColorClient(), itemAlpha));
                }
            }

            String timerKey = "potions_duration_" + effectId + "_" + item.amplifier;
            TimerTextAnimator.draw(font(6.75f), ms, timerKey, timeStr,
                    timerX + (timeBoxW - timeW) / 2f + 1f, curY + 2.5f,
                    HudColors.rgba(255, 255, 255, itemAlpha));

            ms.pop();

            curY += rowHeight;
        }

        if (showExample && currentRandomEffect != null) {
            int exampleAlpha = headerAlpha;
            String nameStr = "Example";
            String timeStr = "**:**";

            float timeW = width(timeStr, 6.75f);
            float timeBoxW = timeW + 10f;

            float exMid = textMidY(curY + 2.5f, 7f);
            Sprite sprite = mc.getStatusEffectSpriteManager().getSprite(currentRandomEffect);
            if (sprite != null) {
                float iconSize = 8f;
                float iconX = posX + padX + 2f;
                float iconY = exMid - iconSize / 2f;
                int color = (exampleAlpha << 24) | 0xFFFFFF;
                RenderSystem.setShaderColor(1f, 1f, 1f, exampleAlpha / 255f);
                context.drawSpriteStretched(RenderLayer::getGuiTextured, sprite,
                        (int) iconX, (int) iconY, (int) iconSize, (int) iconSize, color);
                RenderSystem.setShaderColor(1f, 1f, 1f, 1f);
            }

            float dotX = posX + padX + 11f;
            float dotY = exMid - 1.5f;
            drawRound(dotX, dotY, 3f, 3f, 1.5f, HudColors.rgba(120, 120, 120, exampleAlpha));

            float textX = posX + padX + 18f;
            drawText(nameStr, textX, curY + 2.5f, HudColors.rgba(255, 255, 255, exampleAlpha), 7f);

            float timerX = posX + totalRowWidth - padX - timeBoxW;

            if (potionsRing.isState()) {
                float ringRadius = POTION_RING_DIAMETER / 2f;
                float ringCX = timerX - POTION_RING_GAP - ringRadius;
                float ringCY = curY + itemHeight / 2f;
                drawRingArc(ringCX, ringCY, ringRadius, POTION_RING_THICKNESS, -90f, 270f,
                        HudColors.rgba(80, 80, 80, exampleAlpha));
                drawRingArc(ringCX, ringCY, ringRadius, POTION_RING_THICKNESS, -90f, 180f,
                        HudColors.setAlpha(HudColors.getColorClient(), exampleAlpha));
            }

            drawText(timeStr, timerX + (timeBoxW - timeW) / 2f + 1f, curY + 2.5f,
                    HudColors.rgba(255, 255, 255, exampleAlpha), 6.75f);
        }

        potionsDrag.setWidth(totalRowWidth);
        potionsDrag.setHeight(totalHeight);
    }

    private static String formatHudDuration(float seconds) {
        if (seconds >= 60f) {
            int minutes = (int) (seconds / 60f);
            int sec = (int) seconds % 60;
            return String.format(Locale.US, "%d:%02d", minutes, sec);
        }
        return String.format(Locale.US, "%.2f сек", seconds);
    }

    private static String toRomanLevel(int amplifier) {
        return switch (amplifier + 1) {
            case 1 -> "I";
            case 2 -> "II";
            case 3 -> "III";
            case 4 -> "IV";
            case 5 -> "V";
            case 6 -> "VI";
            case 7 -> "VII";
            case 8 -> "VIII";
            case 9 -> "IX";
            case 10 -> "X";
            default -> String.valueOf(amplifier + 1);
        };
    }

    /** Визуальный вертикальный центр текста. */
    private static float textMidY(float drawY, float size) {
        return drawY + size * 0.59f;
    }

    // ===================== КулДауны =====================
    private static class CooldownItem {
        final Item item;
        long endTimeMs;
        long maxDurationMs;
        boolean active = true;
        final TimedAnimation animation = new TimedAnimation(Easings.EXPO_OUT, 233);
        final TimedAnimation rowAnim = new TimedAnimation(Easings.QUAD_OUT, 150);

        CooldownItem(Item item, long endTimeMs, long maxDurationMs) {
            this.item = item;
            this.endTimeMs = endTimeMs;
            this.maxDurationMs = maxDurationMs;
        }

        int remainingSeconds() {
            long rem = endTimeMs - System.currentTimeMillis();
            return (int) Math.max(0, Math.ceil(rem / 1000.0));
        }
    }

    private final List<CooldownItem> cooldownItems = new CopyOnWriteArrayList<>();

    private static final Item[] COOLDOWN_EXAMPLE_ITEMS = {
            Items.ENDER_PEARL, Items.ENDER_EYE, Items.CHORUS_FRUIT, Items.MACE,
            Items.ENCHANTED_GOLDEN_APPLE, Items.TRIDENT, Items.SHIELD, Items.GOAT_HORN
    };
    private int cooldownExampleIndex = 0;
    private long cooldownExampleChange = 0;

    private void updateCooldowns() {
        if (mc.player == null) return;
        for (CooldownItem cooldown : cooldownItems) {
            boolean cooling = mc.player.getItemCooldownManager().isCoolingDown(cooldown.item.getDefaultStack());
            if (!cooling || System.currentTimeMillis() >= cooldown.endTimeMs) {
                cooldown.active = false;
            }
        }
        cooldownItems.removeIf(cooldown -> !cooldown.active && cooldown.animation.getValue() == 0);

        if (cooldownItems.isEmpty() && mc.currentScreen instanceof ChatScreen) {
            long now = System.currentTimeMillis();
            if (now - cooldownExampleChange >= 1500) {
                cooldownExampleIndex = (cooldownExampleIndex + 1) % COOLDOWN_EXAMPLE_ITEMS.length;
                cooldownExampleChange = now;
            }
        }
    }

    private void renderCoolDowns(DrawContext context) {
        if (mc.player == null) return;

        if (!(mc.currentScreen instanceof ChatScreen)) {
            cooldownsPopup.open = false;
            cooldownsPopup.draggingSlider = null;
        }

        beginScale(cooldownsPopup, context);
        renderCoolDownsNew(context);
        endScale(cooldownsPopup, context);

        runPopup(cooldownsPopup, context);
    }

    private void drawCooldownIcon(DrawContext context, ItemStack stack, float x, float y, float size, int alpha) {
        float scale = size / 16f;
        ms.push();
        ms.translate(x, y, 0);
        ms.scale(scale, scale, 1f);
        RenderSystem.setShaderColor(1f, 1f, 1f, alpha / 255f);
        context.drawItem(stack, 0, 0);
        RenderSystem.setShaderColor(1f, 1f, 1f, 1f);
        ms.pop();
    }

    private void renderCoolDownsNew(DrawContext context) {
        if (mc.player == null) return;

        float posX = cooldownsDrag.getX();
        float posY = cooldownsDrag.getY();

        float headerHeight = 14f;
        float itemHeight = 12f;
        float minWidth = 56f;
        float padX = 5f;
        float padY = 2f;

        boolean isFound = false;
        for (CooldownItem item : cooldownItems) {
            item.animation.run(item.active ? 1 : 0);
            item.rowAnim.run(item.active ? 1 : 0);
            if (item.animation.getValue() > 0.001f) isFound = true;
        }

        boolean showExample = (mc.currentScreen instanceof ChatScreen) && !isFound;

        if (!isFound && !(mc.currentScreen instanceof ChatScreen)) cdAlpha.run(0);
        else cdAlpha.run(1);

        float globalAlpha = (float) cdAlpha.getValue();
        if (globalAlpha <= 0.05f) return;

        int headerAlpha = (int) Math.min(255, Math.max(0, 255 * globalAlpha));

        float maxNameBoxW = minWidth;
        float maxTimeBoxW = 0f;
        float contentHeight = 0f;
        for (CooldownItem item : cooldownItems) {
            float animVal = (float) item.animation.getValue();
            if (animVal > 0.001f) {
                contentHeight += itemHeight * (float) item.rowAnim.getValue();
                String name = item.item.getName().getString();
                float nameW = width(name, 7f);
                float nw = nameW + 8f + 12f + 10f;
                if (nw > maxNameBoxW) maxNameBoxW = nw;

                String timeStr = formatHudDuration(item.remainingSeconds());
                float tw = width(timeStr, 6.75f) + 10f
                        + (cooldownsRing.isState() ? POTION_RING_DIAMETER + POTION_RING_GAP : 0f);
                if (tw > maxTimeBoxW) maxTimeBoxW = tw;
            }
        }

        if (showExample) {
            float exNameW = width("Example", 7f);
            if (exNameW + 8f + 12f + 10f > maxNameBoxW) maxNameBoxW = exNameW + 8f + 12f + 10f;
            float exTimeW = width("**:**", 6.75f) + 10f
                    + (cooldownsRing.isState() ? POTION_RING_DIAMETER + POTION_RING_GAP : 0f);
            if (exTimeW > maxTimeBoxW) maxTimeBoxW = exTimeW;
            contentHeight = itemHeight;
        }

        float rawWidth = maxNameBoxW + maxTimeBoxW + padX * 2;
        cooldownsPopup.panelWidth.run(rawWidth);
        float totalRowWidth = (float) cooldownsPopup.panelWidth.getValue();
        if (totalRowWidth < 20f) totalRowWidth = rawWidth;
        float totalHeight = headerHeight + contentHeight + padY * 2;

        drawElementBackground(cooldownsPopup, posX, posY, totalRowWidth, totalHeight, HUD_PANEL_RADIUS, globalAlpha);
        drawElementShine(cooldownsPopup, context, posX, posY, totalRowWidth, totalHeight, HUD_PANEL_RADIUS);
        drawHudHeader("Cooldowns", ICON_COOLDOWNS, posX, posY, totalRowWidth, headerHeight, headerAlpha);

        float curY = posY + headerHeight + padY;

        for (CooldownItem item : cooldownItems) {
            float animVal = (float) item.animation.getValue();
            if (animVal <= 0.001f) continue;
            float rowAnimVal = (float) item.rowAnim.getValue();
            if (rowAnimVal <= 0.001f) continue;

            String timeStr = formatHudDuration(item.remainingSeconds());
            String nameStr = item.item.getName().getString();

            int itemAlpha = (int) Math.min(255, Math.max(0, 255 * animVal * globalAlpha));
            if (itemAlpha < 5) continue;

            float timeW = width(timeStr, 6.75f);
            float timeBoxW = timeW + 10f;

            float rowHeight = itemHeight * rowAnimVal;
            ms.push();
            ms.translate(posX + totalRowWidth / 2f, curY + rowHeight / 2f, 0);
            ms.scale(rowAnimVal, rowAnimVal, rowAnimVal);
            ms.translate(-(posX + totalRowWidth / 2f), -(curY + rowHeight / 2f), 0);

            float cdMid = textMidY(curY + 2.75f, 7f);
            drawCooldownIcon(context, item.item.getDefaultStack(), posX + padX + 1f, cdMid - 5f, 10f, itemAlpha);

            float textX = posX + padX + 14f;
            drawText(nameStr, textX, curY + 2.75f, HudColors.rgba(255, 255, 255, itemAlpha), 7f);

            float timerX = posX + totalRowWidth - padX - timeBoxW;

            if (cooldownsRing.isState()) {
                float ringRadius = POTION_RING_DIAMETER / 2f;
                float ringCX = timerX - POTION_RING_GAP - ringRadius;
                float ringCY = cdMid;
                float progress = 1f;
                if (item.maxDurationMs > 0) {
                    long rem = item.endTimeMs - System.currentTimeMillis();
                    progress = MathHelper.clamp((float) rem / (float) item.maxDurationMs, 0f, 1f);
                }
                drawRingArc(ringCX, ringCY, ringRadius, POTION_RING_THICKNESS, -90f, 270f,
                        HudColors.rgba(80, 80, 80, itemAlpha));
                if (progress > 0f) {
                    drawRingArc(ringCX, ringCY, ringRadius, POTION_RING_THICKNESS, -90f, -90f + 360f * progress,
                            HudColors.setAlpha(HudColors.getColorClient(), itemAlpha));
                }
            }

            String timerKey = "cooldowns_duration_" + item.item.getTranslationKey();
            TimerTextAnimator.draw(font(6.75f), ms, timerKey, timeStr,
                    timerX + (timeBoxW - timeW) / 2f + 1f, curY + 3.5f,
                    HudColors.rgba(255, 255, 255, itemAlpha));

            ms.pop();
            curY += rowHeight;
        }

        if (showExample) {
            int exampleAlpha = headerAlpha;
            String nameStr = "Example";
            String timeStr = "**:**";
            ItemStack stack = COOLDOWN_EXAMPLE_ITEMS[cooldownExampleIndex].getDefaultStack();

            float timeW = width(timeStr, 6.75f);
            float timeBoxW = timeW + 10f;

            float cdExMid = textMidY(curY + 3.5f, 7f);
            drawCooldownIcon(context, stack, posX + padX + 1f, cdExMid - 5f, 10f, exampleAlpha);

            float dotX = posX + padX + 13f;
            float dotY = cdExMid - 1.5f;
            drawRound(dotX, dotY, 3f, 3f, 1.5f, HudColors.rgba(120, 120, 120, exampleAlpha));

            float textX = posX + padX + 20f;
            drawText(nameStr, textX, curY + 3.5f, HudColors.rgba(255, 255, 255, exampleAlpha), 7f);

            float timerX = posX + totalRowWidth - padX - timeBoxW;

            if (cooldownsRing.isState()) {
                float ringRadius = POTION_RING_DIAMETER / 2f;
                float ringCX = timerX - POTION_RING_GAP - ringRadius;
                float ringCY = cdExMid;
                drawRingArc(ringCX, ringCY, ringRadius, POTION_RING_THICKNESS, -90f, 270f,
                        HudColors.rgba(80, 80, 80, exampleAlpha));
                drawRingArc(ringCX, ringCY, ringRadius, POTION_RING_THICKNESS, -90f, 180f,
                        HudColors.setAlpha(HudColors.getColorClient(), exampleAlpha));
            }

            drawText(timeStr, timerX + (timeBoxW - timeW) / 2f + 1f, curY + 3.5f,
                    HudColors.rgba(255, 255, 255, exampleAlpha), 6.75f);
        }

        cooldownsDrag.setWidth(totalRowWidth);
        cooldownsDrag.setHeight(totalHeight);
    }

    // ===================== Ватермарка и инфо-строка =====================
    private void renderWatermark(DrawContext context) {
        if (mc.player == null) return;

        if (!(mc.currentScreen instanceof ChatScreen)) {
            watermarkPopup.open = false;
            watermarkPopup.draggingSlider = null;
        }

        beginScale(watermarkPopup, context);
        renderWatermarkNew(context);
        endScale(watermarkPopup, context);
        runPopup(watermarkPopup, context);
    }

    private void renderWatermarkNew(DrawContext context) {
        Counter.updateFPS();

        String userText = mc.getSession().getUsername();
        String fpsValue = Counter.getCurrentFPS() + " fps";
        String pingValue = getPing(mc.player) + " ping";

        float x = watermarkDrag.getX();
        float y = watermarkDrag.getY();
        float height = 16.5f;
        float fontSize = 7f;

        int accent = HudColors.getColorClient();
        int whiteColor = -1;
        int sepColor = HudColors.rgba(255, 255, 255, 55);

        String title = "Crick Client";
        float iconSize = 9f;
        float iconWidth = iconSize * CLIENT_ICON_ASPECT;
        float titleW = width(title, fontSize);
        float userW = width(userText, fontSize);
        float fpsW = width(fpsValue, fontSize);
        float pingW = width(pingValue, fontSize);
        float sepW = width("|", fontSize);

        float iconGap = 2f;
        float sepGap = 4f;
        float leftPad = 5f;
        float rightPad = 5f;

        float boxWidth = leftPad + iconWidth + iconGap + titleW
                + sepGap + sepW + sepGap + userW
                + sepGap + sepW + sepGap + fpsW
                + sepGap + sepW + sepGap + pingW + rightPad;

        drawElementBackground(watermarkPopup, x, y, boxWidth, height, HUD_PANEL_RADIUS, 1f);
        drawElementShine(watermarkPopup, context, x, y, boxWidth, height, HUD_PANEL_RADIUS);

        float textY = y + 4f;
        float cx = x + leftPad;
        drawWatermarkClientIcon(context, cx, y + (height - iconSize) / 2f, iconSize, accent);
        cx += iconWidth + iconGap;
        drawText(title, cx, textY, whiteColor, fontSize);
        cx += titleW + sepGap;
        drawText("|", cx, textY, sepColor, fontSize);
        cx += sepW + sepGap;
        drawText(userText, cx, textY, whiteColor, fontSize);
        cx += userW + sepGap;
        drawText("|", cx, textY, sepColor, fontSize);
        cx += sepW + sepGap;
        drawText(fpsValue, cx, textY, whiteColor, fontSize);
        cx += fpsW + sepGap;
        drawText("|", cx, textY, sepColor, fontSize);
        cx += sepW + sepGap;
        drawText(pingValue, cx, textY, whiteColor, fontSize);

        watermarkDrag.setWidth(boxWidth);
        watermarkDrag.setHeight(height);
    }

    /** Иконка клиента (client_icon.png) с сохранением пропорций, перекрашенная в цвет темы. */
    private void drawWatermarkClientIcon(DrawContext context, float x, float y, float size, int tint) {
        try {
            RenderUtils.drawImage(ms, CLIENT_ICON, x, y, size * CLIENT_ICON_ASPECT, size, tint);
            return;
        } catch (Exception ignored) {
        }
        Font logo = Fonts.getFont(FONT_LOGO, size * 2f);
        if (logo != null) logo.drawStringNoOffset(ms, "A", x, y + 1f, tint);
    }

    private void renderInfo(DrawContext context) {
        if (mc.player == null) return;

        if (!(mc.currentScreen instanceof ChatScreen)) {
            infoPopup.open = false;
            infoPopup.draggingSlider = null;
        }

        beginScale(infoPopup, context);
        renderInfoNew(context);
        endScale(infoPopup, context);
        runPopup(infoPopup, context);
    }

    private void renderInfoNew(DrawContext context) {
        boolean showCoords = wmCoords.isState() || elements.is("Координаты");
        boolean showTps = wmTps.isState();
        boolean showBps = wmBps.isState();

        float x = infoDrag.getX();
        float y = infoDrag.getY();
        float height = 16.5f;

        int iconColor = HudColors.getColorIcons();
        int whiteColor = -1;
        int dotColor = HudColors.rgba(255, 255, 255, 60);

        float iconGap = 1.5f;
        float sepGap = 3.5f;
        float dotSize = 3f;
        float sep = sepGap + dotSize + sepGap;
        float leftPad = 5f, rightPad = 5f;

        // Пусто: если чат открыт — рисуем плейсхолдер (чтобы можно было открыть настройки), иначе скрываем
        if (!showCoords && !showTps && !showBps) {
            if (mc.currentScreen instanceof ChatScreen) {
                String placeholder = "Info";
                float w = leftPad + width(placeholder, 7f) + rightPad;
                drawElementBackground(infoPopup, x, y, w, height, HUD_PANEL_RADIUS, 1f);
                drawElementShine(infoPopup, context, x, y, w, height, HUD_PANEL_RADIUS);
                drawText(placeholder, x + leftPad, y + 4f, HudColors.rgba(255, 255, 255, 120), 7f);
                infoDrag.setWidth(w);
                infoDrag.setHeight(height);
            } else {
                infoDrag.setWidth(0f);
                infoDrag.setHeight(0f);
            }
            return;
        }

        String xPart = "x" + (int) mc.player.getX();
        String yPart = "y" + (int) mc.player.getY();
        String zPart = "z" + (int) mc.player.getZ();

        double dX = mc.player.getX() - mc.player.prevX;
        double dZ = mc.player.getZ() - mc.player.prevZ;
        String bpsValue = String.format(Locale.US, "%.1f Bps", Math.hypot(dX, dZ) * 20);
        String tpsValue = String.format(Locale.US, "%.1f Tps",
                CrickClient.INSTANCE.tpsCalc == null ? 20f : CrickClient.INSTANCE.tpsCalc.getTPS());

        int groups = (showCoords ? 1 : 0) + (showTps ? 1 : 0) + (showBps ? 1 : 0);

        float boxWidth = leftPad + rightPad;
        if (showCoords) {
            boxWidth += iconWidth(ICON_COORDS, 7f) + iconGap
                    + width(xPart, 7f) + sep + width(yPart, 7f) + sep + width(zPart, 7f);
        }
        if (showTps) boxWidth += iconWidth(ICON_TPS, 7f) + iconGap + width(tpsValue, 7f);
        if (showBps) boxWidth += iconWidth(ICON_BPS, 7f) + iconGap + width(bpsValue, 7f);
        boxWidth += sep * (groups - 1);

        drawElementBackground(infoPopup, x, y, boxWidth, height, HUD_PANEL_RADIUS, 1f);
        drawElementShine(infoPopup, context, x, y, boxWidth, height, HUD_PANEL_RADIUS);

        float dotY = y + (height - dotSize) / 2f;
        float cx = x + leftPad;
        boolean first = true;

        if (showCoords) {
            drawIcon(ICON_COORDS, cx, y + 4.75f, iconColor, 7f);
            cx += iconWidth(ICON_COORDS, 7f) + iconGap;
            drawText(xPart, cx, y + 4f, whiteColor, 7f);
            cx += width(xPart, 7f) + sepGap;
            drawRound(cx, dotY, dotSize, dotSize, dotSize / 2f, dotColor);
            cx += dotSize + sepGap;
            drawText(yPart, cx, y + 4f, whiteColor, 7f);
            cx += width(yPart, 7f) + sepGap;
            drawRound(cx, dotY, dotSize, dotSize, dotSize / 2f, dotColor);
            cx += dotSize + sepGap;
            drawText(zPart, cx, y + 4f, whiteColor, 7f);
            cx += width(zPart, 7f);
            first = false;
        }
        if (showTps) {
            if (!first) {
                cx += sepGap;
                drawRound(cx, dotY, dotSize, dotSize, dotSize / 2f, dotColor);
                cx += dotSize + sepGap;
            }
            drawIcon(ICON_TPS, cx, y + 4.75f, iconColor, 7f);
            cx += iconWidth(ICON_TPS, 7f) + iconGap;
            drawText(tpsValue, cx, y + 4f, whiteColor, 7f);
            cx += width(tpsValue, 7f);
            first = false;
        }
        if (showBps) {
            if (!first) {
                cx += sepGap;
                drawRound(cx, dotY, dotSize, dotSize, dotSize / 2f, dotColor);
                cx += dotSize + sepGap;
            }
            drawIcon(ICON_BPS, cx, y + 4.75f, iconColor, 7f);
            cx += iconWidth(ICON_BPS, 7f) + iconGap;
            drawText(bpsValue, cx, y + 4f, whiteColor, 7f);
        }

        infoDrag.setWidth(boxWidth);
        infoDrag.setHeight(height);
    }

    // ===================== Активный таргет =====================
    private void renderTargetHUD(DrawContext context) {
        if (!(mc.currentScreen instanceof ChatScreen)) {
            targetHudPopup.open = false;
            targetHudPopup.draggingSlider = null;
        }
        beginScale(targetHudPopup, context);
        renderTargetHUDContent(context);
        endScale(targetHudPopup, context);
        runPopup(targetHudPopup, context);
    }

    private void renderTargetHUDContent(DrawContext context) {
        boolean chatOpen = mc.currentScreen instanceof ChatScreen;
        LivingEntity target = null;

        Aura aura = Aura.INSTANCE;
        if (aura.isEnable() && aura.getTarget() != null && aura.getTarget().isAlive()) {
            target = aura.getTarget();
        } else if (thShowOnHover.isState() && mc.targetedEntity instanceof LivingEntity living && living.isAlive()) {
            if (!AntiBot.checkBot(living)) {
                target = living;
            }
        } else if (chatOpen) {
            target = mc.player;
        }

        if (target != null) {
            lastTarget = target;
            animation.run(1);
            armorAnim.run(1);
        } else {
            animation.run(0);
            armorAnim.run(0);
        }

        if (animation.getValue() <= 0.05f || !(lastTarget instanceof LivingEntity livingEntity)) return;

        AbstractClientPlayerEntity playerEntity = lastTarget instanceof AbstractClientPlayerEntity clientPlayer
                ? clientPlayer : null;

        float anim = (float) animation.getValue();
        int alphaInt = (int) (255 * anim);

        float width = 122f;
        float height = 38f;
        float x = targetHUDDrag.getX();
        float y = targetHUDDrag.getY();

        drawElementBackground(targetHudPopup, x, y, width, height, HUD_PANEL_RADIUS, anim);
        drawElementShine(targetHudPopup, context, x, y, width, height, HUD_PANEL_RADIUS);

        float ringRadius = 14f;
        float ringThick = 2.4f;
        float ringPad = 7f;
        float ringCX = x + width - ringPad - ringRadius;
        float ringCY = y + height / 2f;

        float headSize = 28f;
        float headX = x + 5f;
        float headY = y + (height - headSize) / 2f;

        float hurtPercent = livingEntity.hurtTime / 10f;

        // Голова: у игрока — скин, у моба — текстура его рендерера
        try {
            Identifier faceTex = getEntityFaceTexture(livingEntity, playerEntity);
            if (faceTex != null) {
                AbstractTexture texture = mc.getTextureManager().getTexture(faceTex);
                if (texture != null) texture.setFilter(false, false);
                RenderUtils.drawPlayerHead(ms, faceTex, headX, headY, headSize, 6f, anim, hurtPercent);
            }
        } catch (Exception ignored) {
        }

        float textX = headX + headSize + 6f;
        float nameMaxW = ringCX - ringRadius - 4f - textX;

        String rawName = livingEntity.getName().getString();
        String name = NameProtect.INSTANCE.isEnable() ? NameProtect.INSTANCE.patch(rawName) : rawName;

        String shownName = trimTextToWidth(name, 8.5f, Math.max(20f, nameMaxW));
        drawText(shownName, textX, y + 8f, HudColors.rgba(255, 255, 255, alphaInt), 8.5f);

        float currentHp = getEntityHealth(livingEntity);
        if (Float.isNaN(currentHp) || currentHp < 0) currentHp = 0;

        float maxHealth = Math.max(livingEntity.getMaxHealth(), 1f);
        float healthFrac = MathHelper.clamp(currentHp / maxHealth, 0f, 1f);
        hpAnimation.run(healthFrac);
        float ringProgress = (float) hpAnimation.getValue();

        int trackColor = HudColors.rgba(255, 255, 255, 28);
        int fillColor = currentHp <= lowHpAlertThreshold.get()
                ? HudColors.rgba(255, 80, 80, 255)
                : HudColors.getColorClient();
        drawCircularHealthRing(ringCX, ringCY, ringRadius, ringThick, ringProgress, trackColor, fillColor, alphaInt);

        String hpText = formatHealthDisplay(currentHp);
        float hpTextW = width(hpText, 7.5f);
        drawText(hpText, ringCX - hpTextW / 2f, ringCY - 5f, HudColors.rgba(255, 255, 255, alphaInt), 7.5f);

        float armorAlpha = (float) armorAnim.getValue();
        if (thShowItems.isState() && armorAlpha > 0.05f) {
            List<ItemStack> armorList = new ArrayList<>();
            for (ItemStack stack : livingEntity.getArmorItems()) armorList.add(stack);
            Collections.reverse(armorList); // шлем -> ботинки
            List<ItemStack> handsList = new ArrayList<>();
            handsList.add(livingEntity.getMainHandStack());
            handsList.add(livingEntity.getOffHandStack());

            float cell = 13f;
            float boxPad = 2f;
            float boxH = cell + boxPad * 2f;
            float armorBoxW = 4 * cell + boxPad * 2f;
            float handsBoxW = 2 * cell + boxPad * 2f;
            float boxesY = y + height + 3f;

            float armorBoxX = x;
            float handsBoxX = x + width - handsBoxW;

            drawElementBackground(targetHudPopup, armorBoxX, boxesY, armorBoxW, boxH, 3f, armorAlpha);
            drawElementBackground(targetHudPopup, handsBoxX, boxesY, handsBoxW, boxH, 3f, armorAlpha);

            float itemScale = 11f / 16f;
            ms.push();
            ms.translate(0, 0, 100);
            TextRenderer textRenderer = mc.textRenderer;
            drawItemSlots(context, textRenderer, armorList, armorBoxX + boxPad, boxesY + boxPad, cell, itemScale);
            drawItemSlots(context, textRenderer, handsList, handsBoxX + boxPad, boxesY + boxPad, cell, itemScale);
            ms.pop();
        }

        targetHUDDrag.setWidth(width);
        targetHUDDrag.setHeight(height);
    }

    private void drawCircularHealthRing(float cx, float cy, float radius, float thickness,
                                        float progress, int trackColor, int fillColor, int alphaInt) {
        drawRingArc(cx, cy, radius, thickness, -90f, 270f, HudColors.setAlpha(trackColor, alphaInt));
        if (progress > 0.001f) {
            drawRingArc(cx, cy, radius, thickness, -90f, -90f + 360f * progress,
                    HudColors.setAlpha(fillColor, alphaInt));
        }
    }

    private float getEntityHealth(LivingEntity entity) {
        return entity.getHealth() + entity.getAbsorptionAmount();
    }

    private String formatHealthDisplay(float health) {
        if (health >= 10f) return String.valueOf((int) health);
        return String.format(Locale.US, "%.1f", health);
    }

    /** Текстура «лица» энтити: у игрока — скин, у моба — текстура его рендерера. */
    @SuppressWarnings({"rawtypes", "unchecked"})
    private Identifier getEntityFaceTexture(LivingEntity entity, AbstractClientPlayerEntity player) {
        try {
            if (player != null) {
                return player.getSkinTextures().texture();
            }
            net.minecraft.client.render.entity.EntityRenderer baseRenderer =
                    mc.getEntityRenderDispatcher().getRenderer(entity);
            if (baseRenderer instanceof net.minecraft.client.render.entity.LivingEntityRenderer renderer) {
                float tickDelta = mc.getRenderTickCounter().getTickDelta(false);
                net.minecraft.client.render.entity.state.LivingEntityRenderState state =
                        (net.minecraft.client.render.entity.state.LivingEntityRenderState)
                                renderer.getAndUpdateRenderState(entity, tickDelta);
                if (state != null) {
                    return renderer.getTexture(state);
                }
            }
        } catch (Exception ignored) {
        }
        return null;
    }

    /** Рисует предметы по ячейкам с центрированием внутри окошка. */
    private void drawItemSlots(DrawContext context, TextRenderer textRenderer, List<ItemStack> items,
                               float startX, float startY, float cell, float itemScale) {
        float drawn = 16f * itemScale;
        float inset = (cell - drawn) / 2f;
        for (int i = 0; i < items.size(); i++) {
            ItemStack stack = items.get(i);
            if (stack == null || stack.isEmpty()) continue;
            float cx = startX + i * cell + inset;
            float cy = startY + inset;
            ms.push();
            ms.translate(cx, cy, 0);
            ms.scale(itemScale, itemScale, 1f);
            context.drawItem(stack, 0, 0);
            context.drawStackOverlay(textRenderer, stack, 0, 0);
            ms.pop();
        }
    }

    // ===================== Уведомления =====================
    public float getNotificationsX() {
        return notificationsDrag.getX();
    }

    public float getNotificationsY() {
        return notificationsDrag.getY();
    }

    /** Ширина примера уведомления (та же формула, что и в renderNotificationsExample). */
    private float notifExampleWidth() {
        float toggleW = 15f, pad = 6f, gap = 6f;
        float textW = width("Пример уведомления", 7f);
        return pad + textW + gap + toggleW + pad;
    }

    /** Центр по X, вокруг которого выравниваются уведомления — совпадает с центром примера. */
    public float getNotificationsCenterX() {
        return notificationsDrag.getX() + notifExampleWidth() / 2f;
    }

    /** Масштаб уведомлений (тот же слайдер «Размер», что и у примера). */
    public float getNotificationsScale() {
        return notificationsPopup.size.get();
    }

    public boolean isModuleStateNotifEnabled() {
        return elements.is("Нотификации") && notifModuleStates.isState();
    }

    public boolean isTotemNotifEnabled() {
        return elements.is("Нотификации") && notifTotem.isState();
    }

    /** Публичная обёртка — единый фон/блик как у остальных элементов. */
    public void drawNotifBackground(DrawContext context, float x, float y, float w, float h, float radius, float alphaFactor) {
        drawElementBackground(notificationsPopup, x, y, w, h, radius, alphaFactor);
        drawElementShine(notificationsPopup, context, x, y, w, h, radius);
    }

    public void drawNewToggle(float x, float y, float toggleW, float toggleH, boolean on, float anim, int alpha) {
        int inactive = HudColors.setAlpha(HudColors.getColorInactiveIndicator(), alpha);
        int active = HudColors.setAlpha(HudColors.getColorIndicator(), alpha);
        int bg = HudColors.interpolateColor(inactive, active, anim);
        drawRound(x, y, toggleW, toggleH, toggleH / 2f, bg);
        float knob = toggleH - 1f;
        float knobMinX = x + 0.5f;
        float knobMaxX = x + toggleW - knob - 0.5f;
        float knobX = knobMinX + (knobMaxX - knobMinX) * anim;
        drawCircle(knobX + knob / 2f, y + 0.5f + knob / 2f, knob / 2f,
                HudColors.setAlpha(HudColors.getColorSliderCircle(), alpha));
    }

    private void renderNotificationsExample(DrawContext context) {
        if (mc.player == null) return;
        if (!(mc.currentScreen instanceof ChatScreen)) {
            notificationsPopup.open = false;
            notificationsPopup.draggingSlider = null;
            return;
        }

        beginScale(notificationsPopup, context);

        float posX = notificationsDrag.getX();
        float posY = notificationsDrag.getY();

        String text = "Пример уведомления";
        float toggleW = 15f;
        float toggleH = 8f;
        float pad = 6f;
        float gap = 6f;
        float textW = width(text, 7f);
        float boxWidth = pad + textW + gap + toggleW + pad;
        float height = 15f;

        drawElementBackground(notificationsPopup, posX, posY, boxWidth, height, 3f, 1f);
        drawElementShine(notificationsPopup, context, posX, posY, boxWidth, height, 3f);

        // Автопереключение примера каждые 3 секунды (вкл/выкл)
        boolean exampleOn = (System.currentTimeMillis() / 3000L) % 2 == 0;
        exampleNotifToggleAnim.run(exampleOn ? 1 : 0);

        float textX = posX + pad;
        drawText(text, textX, posY + (height / 2f) - 7f * 0.59f, HudColors.rgba(255, 255, 255, 255), 7f);

        float tX = textX + textW + gap;
        float tY = posY + (height - toggleH) / 2f;
        drawNewToggle(tX, tY, toggleW, toggleH, exampleOn, (float) exampleNotifToggleAnim.getValue(), 255);

        notificationsDrag.setWidth(boxWidth);
        notificationsDrag.setHeight(height);

        endScale(notificationsPopup, context);

        runPopup(notificationsPopup, context);
    }

    /**
     * Лента уведомлений в стиле остальных HUD-панелей: строка с текстом и переключателем
     * состояния модуля, а также оповещения о сносе тотема.
     */
    public final class NotificationsElement {

        private static final long TOTEM_DURATION_MS = 2500L;

        private final class Notif {
            final NotificationManager.Entry entry;
            final Text text;
            final boolean showToggle;
            final boolean enabled;
            final long created;
            final TimedAnimation appear = new TimedAnimation(Easings.EXPO_OUT, 220);
            final TimedAnimation toggle;
            boolean alive = true;

            Notif(NotificationManager.Entry entry, Text text, boolean showToggle, boolean enabled) {
                this.entry = entry;
                this.text = text;
                this.showToggle = showToggle;
                this.enabled = enabled;
                this.created = System.currentTimeMillis();
                this.toggle = new TimedAnimation(Easings.EXPO_OUT, 220, enabled ? 0.0 : 1.0);
            }
        }

        private final List<Notif> notifs = new CopyOnWriteArrayList<>();

        /** Оповещение о сносе тотема. */
        public void postTotem(Text playerName, boolean enchanted) {
            MutableText text = Text.empty()
                    .append(playerName == null ? Text.literal("?") : playerName.copy())
                    .append(Text.literal(enchanted ? " сломал зач. тотем" : " сломал тотем"));
            notifs.add(new Notif(null, text, false, false));
        }

        private void sync() {
            List<NotificationManager.Entry> active = isModuleStateNotifEnabled()
                    ? NotificationManager.getActive()
                    : List.of();

            for (NotificationManager.Entry entry : active) {
                boolean known = false;
                for (Notif notif : notifs) {
                    if (notif.entry == entry) {
                        known = true;
                        break;
                    }
                }
                if (!known) {
                    Text text = entry.isCustom()
                            ? Text.literal(entry.customText)
                            : Text.literal(entry.moduleName);
                    notifs.add(new Notif(entry, text, !entry.isCustom(), entry.enabled));
                }
            }

            long now = System.currentTimeMillis();
            for (Notif notif : notifs) {
                if (notif.entry != null) {
                    notif.alive = active.contains(notif.entry);
                } else {
                    notif.alive = now - notif.created < TOTEM_DURATION_MS;
                }
            }
        }

        public void render(DrawContext context) {
            sync();
            if (notifs.isEmpty()) return;

            float scale = getNotificationsScale();
            float centerX = getNotificationsCenterX();
            float rowHeight = 15f;
            float spacing = 3f;
            float pad = 6f;
            float gap = 6f;
            float toggleW = 15f;
            float toggleH = 8f;

            float baseY = notificationsDrag.getY() + rowHeight + spacing;
            float curY = baseY;

            for (Notif notif : notifs) {
                notif.appear.run(notif.alive ? 1 : 0);
                notif.toggle.run(notif.enabled ? 1 : 0);

                float appear = (float) notif.appear.getValue();
                if (appear <= 0.01f) continue;

                int alpha = (int) MathHelper.clamp(255 * appear, 0f, 255f);
                float textW = width(notif.text, 7f);
                float boxWidth = notif.showToggle ? pad + textW + gap + toggleW + pad : pad * 2f + textW;
                float x = centerX - boxWidth / 2f;

                ms.push();
                ms.translate(centerX, curY + rowHeight / 2f, 0f);
                ms.scale(scale, scale, 1f);
                ms.translate(-centerX, -(curY + rowHeight / 2f), 0f);

                drawElementBackground(notificationsPopup, x, curY, boxWidth, rowHeight, 3f, appear);
                drawElementShine(notificationsPopup, context, x, curY, boxWidth, rowHeight, 3f);

                float textY = curY + (rowHeight / 2f) - 7f * 0.59f;
                drawText(notif.text, x + pad, textY, 7f, alpha);

                if (notif.showToggle) {
                    float tX = x + pad + textW + gap;
                    float tY = curY + (rowHeight - toggleH) / 2f;
                    drawNewToggle(tX, tY, toggleW, toggleH, notif.enabled, (float) notif.toggle.getValue(), alpha);
                }

                ms.pop();

                curY += (rowHeight + spacing) * appear * scale;
            }

            notifs.removeIf(notif -> !notif.alive && notif.appear.getValue() <= 0.001);
        }
    }

    // ===================== ServerHelper =====================
    private record ServerHelperItem(Item item, String keyBind, String name) {
    }

    private void renderServerHelper(DrawContext context) {
        if (mc.player == null) return;

        if (!(mc.currentScreen instanceof ChatScreen)) {
            serverHelperPopup.open = false;
            serverHelperPopup.draggingSlider = null;
        }

        beginScale(serverHelperPopup, context);
        renderServerHelperNew(context);
        endScale(serverHelperPopup, context);

        runPopup(serverHelperPopup, context);
    }

    private void renderServerHelperNew(DrawContext context) {
        if (mc.player == null) return;

        ServerHelper serverHelper = ServerHelper.INSTANCE;
        if (serverHelper == null) return;

        boolean chatOpen = mc.currentScreen instanceof ChatScreen;
        boolean showExample = chatOpen && !serverHelper.isEnable();

        float posX = serverHelperDrag.getX();
        float posY = serverHelperDrag.getY();

        float itemSize = 32f;
        float gap = 4f;
        float padding = 2f;

        List<ServerHelperItem> items = new ArrayList<>();

        if (showExample) {
            items.add(new ServerHelperItem(Items.FIREWORK_STAR, "G", "АнтиПолет"));
            items.add(new ServerHelperItem(Items.SPLASH_POTION, "H", "Гринч"));
            items.add(new ServerHelperItem(Items.PLAYER_HEAD, "J", "Shift"));
            items.add(new ServerHelperItem(Items.HEART_OF_THE_SEA, "K", "Трапка"));
        } else if (serverHelper.isEnable()) {
            List<ServerHelper.HelperBind> binds = serverHelper.isSpookyMode()
                    ? serverHelper.getSpookyHelperBinds()
                    : serverHelper.getLonyHelperBinds();
            for (ServerHelper.HelperBind bind : binds) {
                if (bind == null || bind.bind() == null || bind.item() == null) continue;
                int key = bind.bind().getKey();
                if (key == -1 || !hasItemInInventory(bind.item())) continue;
                items.add(new ServerHelperItem(bind.item(), getKeyNameEnglish(key), bind.name()));
            }
        }

        if (items.isEmpty()) return;

        int itemsPerRow = items.size();
        float boxSize = itemSize + padding * 2;
        float totalWidth = boxSize * itemsPerRow + gap * (itemsPerRow - 1);
        float totalHeight = boxSize;

        serverHelperPopup.px = posX;
        serverHelperPopup.py = posY;
        serverHelperPopup.pw = totalWidth;
        serverHelperPopup.ph = totalHeight;

        int alpha = (int) serverHelperPopup.alpha.get();
        float radius = 4f;

        float curX = posX;
        for (ServerHelperItem item : items) {
            if (serverHelperPopup.blur.isState()) {
                drawRoundBlur(curX, posY, boxSize, boxSize, radius, HudColors.rgba(200, 200, 200, 255), 12f);
            }
            drawRound(curX, posY, boxSize, boxSize, radius, HudColors.rgba(0, 0, 0, alpha));

            if (serverHelperPopup.shine.isState()) {
                HudShine.render(ms, curX, posY, boxSize, boxSize, radius,
                        serverHelperPopup.shineThickness.get(), 1f,
                        serverHelperPopup.shineAlpha.get() / 100f);
            }

            ItemStack stack = item.item().getDefaultStack();
            float iconSize = 18f;
            float iconX = curX + (boxSize - iconSize) / 2f;
            float iconY = posY + padding + 2f;

            ms.push();
            ms.translate(iconX, iconY, 0);
            float iconScale = iconSize / 16f;
            ms.scale(iconScale, iconScale, 1f);
            RenderSystem.setShaderColor(1f, 1f, 1f, 1f);
            context.drawItem(stack, 0, 0);
            ms.pop();

            float keyW = width(item.keyBind(), 8.5f);
            float keyX = curX + (boxSize - keyW) / 2f;
            float keyY = posY + boxSize - padding - 10f;
            drawText(item.keyBind(), keyX, keyY, HudColors.rgba(200, 200, 200, 255), 8.5f);

            curX += boxSize + gap;
        }

        serverHelperDrag.setWidth(totalWidth);
        serverHelperDrag.setHeight(totalHeight);
    }

    private static final String RU_LAYOUT = "ЙЦУКЕНГШЩЗХЪФЫВАПРОЛДЖЭЯЧСМИТЬБЮйцукенгшщзхъфывапролджэячсмитьбю";
    private static final String EN_LAYOUT = "QWERTYUIOP[]ASDFGHJKL;'ZXCVBNM,.qwertyuiop[]asdfghjkl;'zxcvbnm,.";

    private String getKeyNameEnglish(int keyCode) {
        if (keyCode == -1) return "None";
        if (keyCode == -100) return "LMB";
        if (keyCode == -99) return "RMB";
        if (keyCode == -98) return "MMB";

        String keyName = GLFW.glfwGetKeyName(keyCode, 0);
        if (keyName != null) {
            return convertRussianToEnglish(keyName.toUpperCase(Locale.ROOT));
        }
        return convertRussianToEnglish(KeyBoardUtils.getKeyName(keyCode).toUpperCase(Locale.ROOT));
    }

    private String convertRussianToEnglish(String text) {
        if (text == null || text.isEmpty()) return text;

        StringBuilder result = new StringBuilder(text.length());
        for (char c : text.toCharArray()) {
            int index = RU_LAYOUT.indexOf(c);
            result.append(index >= 0 ? EN_LAYOUT.charAt(index) : c);
        }
        return result.toString();
    }

    private boolean hasItemInInventory(Item item) {
        if (mc.player == null) return false;

        for (ItemStack stack : mc.player.getInventory().main) {
            if (!stack.isEmpty() && stack.getItem() == item) return true;
        }
        for (ItemStack stack : mc.player.getInventory().armor) {
            if (!stack.isEmpty() && stack.getItem() == item) return true;
        }
        ItemStack offhand = mc.player.getOffHandStack();
        return !offhand.isEmpty() && offhand.getItem() == item;
    }
}

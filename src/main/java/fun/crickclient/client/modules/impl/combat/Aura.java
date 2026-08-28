package fun.crickclient.client.modules.impl.combat;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.MaceItem;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.util.Hand;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;

import fun.crickclient.CrickClient;
import fun.crickclient.api.events.EventLink;
import fun.crickclient.api.events.implement.EventAttackEntity;
import fun.crickclient.api.events.implement.EventKeyboardInput;
import fun.crickclient.api.events.implement.EventMoveInput;
import fun.crickclient.api.events.implement.EventPacket;
import fun.crickclient.api.events.implement.EventUpdate;
import fun.crickclient.api.events.implement.EventUpdatePost;
import fun.crickclient.api.storages.implement.NeuroAuraStorage;
import fun.crickclient.api.storages.implement.RotationStorage;
import fun.crickclient.api.storages.implement.helpertstorages.enumvar.ModuleClass;
import fun.crickclient.api.utils.combat.IdealHitUtils;
import fun.crickclient.api.utils.math.TimerUtils;
import fun.crickclient.api.utils.player.HotbarUtil;
import fun.crickclient.api.utils.player.SlotSearchResult;
import fun.crickclient.api.utils.rotate.Rotation;
import fun.crickclient.api.utils.rotate.RotationUtils;
import fun.crickclient.client.modules.Module;
import fun.crickclient.client.modules.impl.combat.aura.AiMode;
import fun.crickclient.client.modules.impl.combat.aura.AuraCrits;
import fun.crickclient.client.modules.impl.combat.aura.AuraHistory;
import fun.crickclient.client.modules.impl.combat.aura.AuraMode;
import fun.crickclient.client.modules.impl.combat.aura.AuraMoveFix;
import fun.crickclient.client.modules.impl.combat.aura.AuraPackets;
import fun.crickclient.client.modules.impl.combat.aura.AuraPoints;
import fun.crickclient.client.modules.impl.combat.aura.AuraRaycast;
import fun.crickclient.client.modules.impl.combat.aura.AuraWeapon;
import fun.crickclient.client.modules.impl.combat.aura.FunTimeMode;
import fun.crickclient.client.modules.impl.combat.aura.GrimMode;
import fun.crickclient.client.modules.impl.combat.aura.HolyWorldMode;
import fun.crickclient.client.modules.impl.combat.aura.NoiseMode;
import fun.crickclient.client.modules.impl.combat.aura.SpookyTimeMode;
import fun.crickclient.client.modules.settings.implement.BooleanSetting;
import fun.crickclient.client.modules.settings.implement.FloatSetting;
import fun.crickclient.client.modules.settings.implement.ListSetting;
import fun.crickclient.client.modules.settings.implement.ModeSetting;

/**
 * AttackAura — the kill aura ported from the reference client
 * ({@code rw.gui.AttackAura} + {@code rw.core.Base0764} and its rotation modes).
 * <p>
 * The whole system (settings tree, target search, rotations, critical hit timing, shield break,
 * weapon swap and the delayed packet bypass) was ported 1:1. Only the {@code ai} rotation is the one
 * of crickclient: it replays the recorded aiming patterns of {@link NeuroAuraStorage}.
 */
public class Aura extends Module {

    public static Aura INSTANCE = new Aura();

    /** Base attack reach of the player. */
    private static final double BASE_RANGE = 3.0;
    /** {@code f8000[1]} — the search box is the player hitbox expanded by the aim range + this. */
    private static final double SEARCH_EXPAND = 2.0;
    /** The fov check is disabled at 180 degrees. */
    private static final float FOV_DISABLED = 180.0F;

    // ---------------------------------------------------------------------------------------------
    // Settings — rw.gui.AttackAura
    // ---------------------------------------------------------------------------------------------

    private final BooleanSetting players = new BooleanSetting("players", true);
    private final BooleanSetting mobs = new BooleanSetting("mobs", true);
    private final BooleanSetting villagers = new BooleanSetting("villagers", true);
    private final ListSetting targets = new ListSetting("targets", players, mobs, villagers);

    private final BooleanSetting invisible = new BooleanSetting("invisible", true);
    private final BooleanSetting naked = new BooleanSetting("naked", true);
    private final BooleanSetting bot = new BooleanSetting("bot", false);
    private final ListSetting targetCondition = new ListSetting("target-condition", invisible, naked, bot)
            .visible(players::isState);

    /** Rotation mode — "ft", "grim", "spooky-time", "noise", "hw" (ported) and "ai" (crickclient). */
    public final ModeSetting mode = new ModeSetting("mode", "ft",
            "ft", "grim", "spooky-time", "noise", "hw", "ai");

    private final ModeSetting sort = new ModeSetting("sort", "distance", "distance", "smart", "fov", "health");

    private final ModeSetting moveCorrection = new ModeSetting("move-correction", "lite",
            "target-follow", "strong", "lite").visible(() -> !mode.is("ft"));

    private final ModeSetting sprintMode = new ModeSetting("sprint-mode", "default", "default", "fast")
            .visible(() -> !mode.is("ft"));

    private final BooleanSetting usingItem = new BooleanSetting("using-item", false);
    private final BooleanSetting usingShield = new BooleanSetting("using-shield", false);
    private final BooleanSetting blockBreaking = new BooleanSetting("block-breaking", false);
    private final BooleanSetting noWeapon = new BooleanSetting("no-weapon", false);
    private final BooleanSetting elytraGliding = new BooleanSetting("elytra-gliding", false);
    private final BooleanSetting movingItems = new BooleanSetting("moving-items", false);
    private final ListSetting doNotAttack = new ListSetting("do-not-attack",
            usingItem, usingShield, blockBreaking, noWeapon, elytraGliding, movingItems);

    public final ModeSetting criticalHit = new ModeSetting("critical-hit", "critical-disabled",
            "critical-disabled", "critical-always", "critical-only-space");
    private final BooleanSetting increaseCritAccuracy = new BooleanSetting("increase-crit-accuracy", false)
            .visible(() -> !criticalHit.is("critical-disabled"));

    private final FloatSetting fov = new FloatSetting("fov", 180.0F, 1.0F, 180.0F, 1.0F);
    private final FloatSetting additionalRange = new FloatSetting("additional-range", 0.0F, 0.0F, 3.0F, 0.1F)
            .visible(() -> !mode.is("ft"));
    private final FloatSetting aimRange = new FloatSetting("aim-range", 1.0F, 0.0F, 10.0F, 0.1F);

    public final ModeSetting throughWalls = new ModeSetting("through-walls", "disabled",
            "disabled", "always", "ft");

    private final BooleanSetting shieldBreak = new BooleanSetting("shield-break", true);
    private final BooleanSetting autoMace = new BooleanSetting("auto-mace", true);
    private final BooleanSetting swapDamage = new BooleanSetting("swap-damage", true)
            .visible(() -> !mode.is("ft"));

    // ---- crickclient only settings (kept from the previous aura) ----
    public final FloatSetting aiJitter = new FloatSetting("Джиттер ИИ", 1.0F, 0.0F, 5.0F, 0.1F)
            .visible(() -> mode.is("ai"));
    public final BooleanSetting aiHumanMisses = new BooleanSetting("Человеческие промахи", false)
            .visible(() -> mode.is("ai"));
    public static BooleanSetting clientLook = new BooleanSetting("Наводка от первого лица", false);
    public final BooleanSetting smartCrit = new BooleanSetting("Умные криты", false);
    public final BooleanSetting sprintReset = new BooleanSetting("Сброс спринта", true);

    // ---------------------------------------------------------------------------------------------
    // State
    // ---------------------------------------------------------------------------------------------

    private final Map<String, AuraMode> modes = new LinkedHashMap<>();

    private LivingEntity target;
    private Rotation rotation;
    private Vec2f targetRotations = new Vec2f(0.0F, 0.0F);
    private final NeuroAuraStorage dataSystem = new NeuroAuraStorage();
    private final TimerUtils attackTimer = new TimerUtils();

    private boolean training;
    private String trainingProfile = "";

    /** {@code f26000[3]} / {@code f26000[4]} — sprint / movement suppression ticks. */
    private int sprintTicks;
    private int moveTicks;
    /** {@code f26000[6]} — delay before the packets may be delayed again. */
    private int delayTicks;
    /** {@code f26000[5]} — the packets of this tick are held back. */
    private boolean blinkRequested;

    private TpsSync tpsSync;

    public static float adjYaw;
    public static float adjPitch;
    public static float otvodkaYaw;
    public static float otvodkaPitch;

    public Aura() {
        super("AttackAura", "Автоматически наводится и бьёт таргета", ModuleCategory.COMBAT);

        modes.put("ft", new FunTimeMode(this));
        modes.put("grim", new GrimMode(this));
        modes.put("spooky-time", new SpookyTimeMode(this));
        modes.put("noise", new NoiseMode(this));
        modes.put("hw", new HolyWorldMode(this));
        modes.put("ai", new AiMode(this));

        addSettings(targets, targetCondition, mode, sort, moveCorrection, doNotAttack, sprintMode,
                criticalHit, increaseCritAccuracy, fov, additionalRange, aimRange, throughWalls,
                shieldBreak, autoMace, swapDamage, aiJitter, aiHumanMisses, smartCrit, sprintReset,
                clientLook);
    }

    // ---------------------------------------------------------------------------------------------
    // Tick — rw.gui.AttackAura#m144000 / m148000 / m132000
    // ---------------------------------------------------------------------------------------------

    @EventLink
    public void onUpdate(EventUpdate event) {
        if (mc.player == null || mc.world == null) {
            return;
        }

        if (tpsSync == null && CrickClient.INSTANCE != null && CrickClient.INSTANCE.moduleStorage != null) {
            tpsSync = ModuleClass.tpsSync;
        }

        AuraHistory.update(target);
        AuraPackets.tick();
        AuraWeapon.tick();

        if (delayTicks > 0) {
            delayTicks--;
        }

        updateTarget();

        if (target != null) {
            mode().update(target);
            blinkRequested = shouldDelayPackets(false);

            if (dataSystem.isRecording()) {
                dataSystem.recordTick(target, mc.player.getYaw(), mc.player.getPitch());
            }
        } else {
            AuraWeapon.release();
            blinkRequested = false;
            attackTimer.reset();
            rotation = null;
        }
    }

    @EventLink
    public void onPostUpdate(EventUpdatePost event) {
        if (mc.player == null || mc.world == null) {
            return;
        }

        if (sprintTicks > 0) {
            sprintTicks--;
        }
        if (moveTicks > 0) {
            moveTicks--;
        }

        if (!blinkRequested && !AuraPackets.isEmpty()) {
            AuraPackets.flush();
        }
    }

    /** {@code rw.gui.AttackAura#m128000} — the packets of this tick are sent 80 ms later. */
    @EventLink
    public void onPacket(EventPacket event) {
        if (event.getType() != EventPacket.Type.SEND) {
            return;
        }

        if (mc.player == null || mc.world == null || !isEnable()) {
            return;
        }

        if (blinkRequested && delayTicks <= 0) {
            event.cancel();
            AuraPackets.queue(event.getPacket());
        }
    }

    /** {@code rw.gui.AttackAura#m158000} — sprint / movement reset and "target-follow". */
    @EventLink
    public void onMoveInput(EventMoveInput event) {
        if (mc.player == null || mc.world == null || target == null) {
            return;
        }

        if (sprintTicks > 0 || moveTicks > 0) {
            if (sprintMode.is("default")) {
                if (sprintTicks > 0) {
                    event.setForward(0.0F);
                }
                if (moveTicks > 0) {
                    event.setStrafe(0.0F);
                }
            } else {
                event.setForward(0.0F);
                event.setStrafe(0.0F);
                mc.player.setSprinting(false);
            }
        }

        if (moveCorrection.is("target-follow") && rotation != null) {
            AuraMoveFix.applyTargetFollow(event, rotation);
        }
    }

    /** {@code rw.core.C0066} — "strong" movement correction. */
    @EventLink
    public void onKeyboardInput(EventKeyboardInput event) {
        if (mc.player == null || mc.world == null || target == null || rotation == null) {
            return;
        }

        if (moveCorrection.is("strong")) {
            AuraMoveFix.applyStrong(event, rotation);
        }
    }

    @EventLink
    public void onAttackEntity(EventAttackEntity event) {
        if (mc.player == null || mc.world == null) return;
        if (event.getPlayer() != mc.player) return;
        if (!(event.getTarget() instanceof LivingEntity living)) return;
        if (!isValid(living)) return;

        target = living;
    }

    // ---------------------------------------------------------------------------------------------
    // Target search — rw.gui.AttackAura#m170000 / rw.core.OlmInrq
    // ---------------------------------------------------------------------------------------------

    private void updateTarget() {
        if (!isEnable()) {
            target = null;
            return;
        }

        if (target != null && isValid(target)) {
            return;
        }

        target = findTarget();
    }

    private LivingEntity findTarget() {
        Box box = mc.player.getBoundingBox().expand(aimRange() + SEARCH_EXPAND);
        List<LivingEntity> entities = mc.world.getEntitiesByClass(LivingEntity.class, box, this::isValid);

        if (entities.isEmpty() || !isEnable()) {
            return null;
        }

        return entities.stream()
                .min(Comparator.<LivingEntity>comparingInt(this::rangeRank)
                        .thenComparingInt(this::typeRank)
                        .thenComparing(sortComparator()))
                .orElse(null);
    }

    /** {@code f26000[0]} — targets inside the attack range come first. */
    private int rangeRank(LivingEntity entity) {
        return mc.player.getEyePos().distanceTo(AuraPoints.nearestPoint(entity)) > attackRange() ? 1 : 0;
    }

    /** {@code f31000[2]} — players come before everything else. */
    private int typeRank(LivingEntity entity) {
        return entity instanceof PlayerEntity ? 0 : 1;
    }

    /** The "sort" setting — {@code C0801} / {@code OlipIn} / {@code C0782} / {@code C0799}. */
    private Comparator<LivingEntity> sortComparator() {
        if (sort.is("smart")) {
            return Comparator.comparingDouble(this::smartScore);
        }
        if (sort.is("fov")) {
            return Comparator.comparingDouble(entity ->
                    AuraPoints.angleTo(currentRotation(), AuraPoints.samplePoint(entity, attackRange())));
        }
        if (sort.is("health")) {
            return Comparator.comparingDouble(LivingEntity::getHealth);
        }
        return Comparator.comparingDouble(entity ->
                mc.player.getEyePos().distanceTo(AuraPoints.nearestPoint(entity)));
    }

    /** {@code rw.core.OlipIn} — distance (3) + health (20) + hands holding a weapon (2). */
    private double smartScore(LivingEntity entity) {
        double score = mc.player.distanceTo(entity) / 3.0;
        score += entity.getHealth() / 20.0;
        score += weaponHands(entity) / 2.0;
        return score;
    }

    private int weaponHands(LivingEntity entity) {
        int hands = 0;
        if (AuraWeapon.isMelee(entity.getStackInHand(Hand.MAIN_HAND))) hands++;
        if (AuraWeapon.isMelee(entity.getStackInHand(Hand.OFF_HAND))) hands++;
        return hands;
    }

    /** {@code rw.core.OlmInrq#m10000} — the full target filter. */
    public boolean isValid(Entity entity) {
        if (entity == null || entity == mc.player || !entity.isAlive()) {
            return false;
        }

        if (!(entity instanceof LivingEntity living)) {
            return false;
        }

        if (entity.getWorld() != mc.world) {
            return false;
        }

        if (!matchesTargets(living)) {
            return false;
        }

        if (!isInsideFov(living)) {
            return false;
        }

        double range = aimRange();
        Vec3d point = mode().aimPoint(living, range);
        Vec3d eye = mc.player.getEyePos();
        Rotation toPoint = AuraPoints.toRotation(point);
        Vec3d end = eye.add(RotationUtils.getRotationVector(toPoint.getPitch(), toPoint.getYaw()).multiply(range));

        if (AuraRaycast.missesEntity(eye, end, living)) {
            return false;
        }

        return throughWallsEnabled() || !AuraRaycast.isBlocked(point, living);
    }

    private boolean matchesTargets(LivingEntity entity) {
        if (entity instanceof PlayerEntity player) {
            if (!players.isState()) {
                return false;
            }
            if (!invisible.isState() && player.isInvisible()) {
                return false;
            }
            if (!naked.isState() && isNaked(player)) {
                return false;
            }
            if (!bot.isState() && AntiBot.checkBot(entity)) {
                return false;
            }
            return !isFriend(player);
        }

        if (entity instanceof VillagerEntity) {
            return villagers.isState();
        }

        return entity instanceof MobEntity && mobs.isState();
    }

    /** {@code rw.gui.AttackAura#m150000} — the target has to be inside the configured fov. */
    private boolean isInsideFov(LivingEntity entity) {
        float fovValue = fov.getValue().floatValue();
        if (fovValue >= FOV_DISABLED) {
            return true;
        }

        Rotation current = currentRotation();
        Vec3d point = AuraPoints.gridPoint(entity, current, false, attackRange());

        return AuraRaycast.missesEntity(current, attackRange(), entity)
                || AuraPoints.angleTo(current, point) < fovValue;
    }

    // ---------------------------------------------------------------------------------------------
    // Values shared with the rotation modes
    // ---------------------------------------------------------------------------------------------

    /** {@code rw.gui.AttackAura#m76000} — reach + additional-range. */
    public double attackRange() {
        return BASE_RANGE + additionalRange.getValue().floatValue();
    }

    /** {@code rw.gui.AttackAura#m72000} — attack range + aim-range. */
    public double aimRange() {
        return attackRange() + aimRange.getValue().floatValue();
    }

    public AuraMode mode() {
        AuraMode selected = modes.get(mode.getCurrent());
        return selected != null ? selected : modes.get("ft");
    }

    public Rotation currentRotation() {
        RotationStorage storage = RotationStorage.instance;
        if (storage != null && storage.targetRotation() != null) {
            return new Rotation(storage.targetRotation().getYaw(), storage.targetRotation().getPitch());
        }
        return new Rotation(mc.player.getYaw(), mc.player.getPitch());
    }

    public void setRotation(Rotation rotation) {
        this.rotation = rotation;
        this.targetRotations = new Vec2f(rotation.getYaw(), rotation.getPitch());
    }

    public boolean throughWallsEnabled() {
        return !throughWalls.is("disabled");
    }

    public boolean isCritDisabled() {
        return criticalHit.is("critical-disabled");
    }

    public boolean isCritOnlySpace() {
        return criticalHit.is("critical-only-space");
    }

    public boolean swapDamage() {
        return swapDamage.isState();
    }

    public boolean shieldBreak() {
        return shieldBreak.isState();
    }

    public boolean autoMace() {
        return autoMace.isState();
    }

    public boolean sprintReset() {
        return sprintReset.isState();
    }

    /** {@code rw.core.IljlItp#m60000} — the mace is somewhere in the inventory. */
    public boolean hasMace() {
        for (int i = 0; i < mc.player.getInventory().size(); i++) {
            if (mc.player.getInventory().getStack(i).isOf(Items.MACE)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasDelayedPackets() {
        return !AuraPackets.isEmpty();
    }

    /** {@code rw.gui.AttackAura#m172000} — the weapon swap has to be done before attacking. */
    public boolean isAttackReady() {
        return !swapDamage.isState() || AuraWeapon.isReady();
    }

    /** {@code rw.gui.AttackAura#m26000} — one of the "do not attack" conditions matched. */
    public boolean isAttackPaused() {
        if (usingItem.isState() && mc.player.isUsingItem() && !mc.player.isBlocking()) {
            return true;
        }
        if (usingShield.isState() && mc.player.isBlocking()) {
            return true;
        }
        if (blockBreaking.isState() && mc.interactionManager != null && mc.interactionManager.isBreakingBlock()) {
            return true;
        }
        if (noWeapon.isState() && !isWeapon(mc.player.getMainHandStack()) && !isWeapon(mc.player.getOffHandStack())) {
            return true;
        }
        if (elytraGliding.isState() && mc.player.isGliding()
                && mc.player.getEquippedStack(EquipmentSlot.CHEST).isOf(Items.ELYTRA)) {
            return true;
        }
        return movingItems.isState() && mc.currentScreen != null;
    }

    /** {@code rw.gui.AttackAura#m6000} — the packets are delayed to force a critical hit. */
    public boolean shouldDelayPackets(boolean crit) {
        if (!increaseCritAccuracy.isState() || mc.player == null || delayTicks > 0) {
            return false;
        }

        if (target == null || !mode().shouldCrit() || !AuraCrits.canCrit()) {
            return false;
        }

        if (mc.player.fallDistance > 0.0 && !crit) {
            return AuraCrits.attackTicks() >= AuraMode.COOLDOWN_TICKS;
        }

        return false;
    }

    /** {@code rw.gui.AttackAura#m4000(1)} */
    public void setSprintTicks(int ticks) {
        this.sprintTicks = ticks;
    }

    /** {@code rw.gui.AttackAura#m122000(1)} */
    public void setMoveTicks(int ticks) {
        this.moveTicks = ticks;
    }

    /** {@code rw.gui.AttackAura#m140000} — everything delayed is sent and the delay is armed. */
    public void flushPackets(int delay) {
        AuraPackets.flush();
        this.delayTicks = delay;
    }

    /** {@code rw.gui.AttackAura#m86000} */
    public void applyMoveFix() {
        if (rotation != null) {
            this.sprintTicks = Math.max(this.sprintTicks, 1);
        }
    }

    /** Fall distance of {@code ticksAgo} ticks ago. */
    public double fallDistance(int ticksAgo) {
        AuraHistory.Snapshot snapshot = AuraHistory.get(ticksAgo);
        return snapshot == null ? 0.0 : snapshot.fallDistance();
    }

    /** Called by the modes right after a swing. */
    public void notifyAttack(LivingEntity entity) {
        if (ModuleClass.INSTANCE != null && ModuleClass.INSTANCE.elytraresolver != null) {
            ModuleClass.INSTANCE.elytraresolver.onAuraAttack();
        }
        attackTimer.reset();
    }

    // ---------------------------------------------------------------------------------------------
    // Shield / weapon helpers
    // ---------------------------------------------------------------------------------------------

    /** {@code KDFzREm.wY#N} — the target blocks with a shield. */
    public boolean isBlockingWithShield(LivingEntity entity) {
        if (!(entity instanceof PlayerEntity player)) {
            return false;
        }

        Hand hand = player.getActiveHand();
        if (hand == null) {
            return false;
        }

        return player.isBlocking() && player.getStackInHand(hand).getItem() == Items.SHIELD;
    }

    /** {@code KDFzREm.wY#y} — breaks the shield with an axe. */
    public void breakShield(LivingEntity entity) {
        SlotSearchResult axe = HotbarUtil.getAxe();
        if (!axe.found()) {
            attack(entity);
            return;
        }

        int previous = mc.player.getInventory().selectedSlot;
        if (axe.isInHotBar() && axe.slot() != previous) {
            mc.player.networkHandler.sendPacket(new UpdateSelectedSlotC2SPacket(axe.slot()));
            try {
                attack(entity);
            } finally {
                mc.player.networkHandler.sendPacket(new UpdateSelectedSlotC2SPacket(previous));
            }
            return;
        }

        attack(entity);
    }

    private void attack(LivingEntity entity) {
        mc.interactionManager.attackEntity(mc.player, entity);
        mc.player.swingHand(Hand.MAIN_HAND);
        notifyAttack(entity);
    }

    /** {@code rw.core.C1193#m26000} */
    public boolean isWeapon(ItemStack stack) {
        if (stack == null || stack.isEmpty()) {
            return false;
        }

        Item item = stack.getItem();
        return item instanceof SwordItem
                || item instanceof AxeItem
                || item instanceof MaceItem
                || item instanceof PickaxeItem
                || item instanceof ShovelItem
                || item instanceof HoeItem;
    }

    /** {@code rw.core.C1137} — the entity does not wear any armor. */
    public boolean isNaked(LivingEntity entity) {
        for (ItemStack stack : entity.getArmorItems()) {
            if (stack != null && !stack.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    private boolean isFriend(LivingEntity entity) {
        return CrickClient.INSTANCE != null
                && CrickClient.INSTANCE.friendStorage != null
                && CrickClient.INSTANCE.friendStorage.isFriend(entity.getName().getString());
    }

    // ---------------------------------------------------------------------------------------------
    // AI (crickclient) helpers
    // ---------------------------------------------------------------------------------------------

    public NeuroAuraStorage getDataSystem() {
        return dataSystem;
    }

    public boolean isTraining() {
        return training;
    }

    public void setTraining(boolean state) {
        this.training = state;
    }

    public String getCurrentTrainingProfile() {
        return trainingProfile;
    }

    public void setCurrentTrainingProfile(String name) {
        this.trainingProfile = name == null ? "" : name;
    }

    /** Stable point of the hitbox used by the AI rotation. */
    public Vec3d getStableBodyPoint(LivingEntity entity) {
        Box box = entity.getBoundingBox();
        return new Vec3d(box.getCenter().x, box.minY + box.getLengthY() * 0.72, box.getCenter().z);
    }

    /** The AI focuses the target once the swing is (almost) ready. */
    public boolean shouldFocusDataRotation() {
        float cooldown = mc.player.getAttackCooldownProgress(1.5F);
        float threshold = Math.max(0.82F, IdealHitUtils.getAICooldown() - 0.08F);
        boolean readyByCooldown = cooldown >= threshold;
        boolean fallingForCrit = !mc.player.isOnGround()
                && mc.player.getVelocity().y < 0.0
                && mc.player.fallDistance > 0.0F;

        return readyByCooldown || fallingForCrit;
    }

    // ---------------------------------------------------------------------------------------------
    // API used by the other modules
    // ---------------------------------------------------------------------------------------------

    public LivingEntity getTarget() {
        return target;
    }

    public Vec2f getTargetRotations() {
        return targetRotations;
    }

    public Vec2f getCurrentRotations() {
        return new Vec2f(mc.player.getYaw(), mc.player.getPitch());
    }

    public Rotation getRotation() {
        return rotation;
    }

    public TimerUtils getAttackTimer() {
        return attackTimer;
    }

    public float getRangeValue() {
        return (float) attackRange();
    }

    public int getWhiteRiseTicksToAttack() {
        return sprintTicks + moveTicks;
    }

    public void Rotate() {
        if (target != null) {
            mode().update(target);
        }
    }

    /** Kept for the modules that relied on the old aura. */
    public void funTimeExtraAttack() {
        if (mc.player == null || mc.world == null || target == null) return;
        attack(target);
    }

    // ---------------------------------------------------------------------------------------------
    // Enable / disable
    // ---------------------------------------------------------------------------------------------

    @Override
    public void onEnable() {
        super.onEnable();
        resetState();
    }

    @Override
    public void onDisable() {
        resetState();
        super.onDisable();
    }

    private void resetState() {
        target = null;
        rotation = null;
        targetRotations = new Vec2f(mc.player != null ? mc.player.getYaw() : 0.0F,
                mc.player != null ? mc.player.getPitch() : 0.0F);

        sprintTicks = 0;
        moveTicks = 0;
        delayTicks = 0;
        blinkRequested = false;

        AuraPackets.flush();
        AuraWeapon.release();
        AuraHistory.reset();

        for (AuraMode auraMode : modes.values()) {
            auraMode.reset();
        }

        dataSystem.resetState();
        attackTimer.reset();
        adjYaw = 0.0F;
        adjPitch = 0.0F;
        otvodkaYaw = 0.0F;
        otvodkaPitch = 0.0F;
    }
}

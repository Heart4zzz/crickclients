package fun.crickclient.client.modules.impl.combat.components.rotations;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;

import fun.crickclient.api.QClient;
import fun.crickclient.api.storages.implement.FreeLookStorage;
import fun.crickclient.api.storages.implement.RotationStorage;
import fun.crickclient.api.utils.rotate.Rotation;
import fun.crickclient.client.modules.impl.combat.Aura;
import fun.crickclient.client.modules.impl.combat.components.RotationsSystem;

import java.util.Arrays;

/**
 * Ротация «ФанТайм ФОВ» — полный перенос из референс-клиента 1:1.
 *
 * <p>Что перенесено (методы {@code w()} и {@code a()} референсной киллуары):
 * <ul>
 *     <li>точка прицела по мультипоинту {@code AuraUtil.a(eye, target, reach, true)}
 *         (ФанТайм всегда наводится сквозь стены);</li>
 *     <li>история питчей {@code u[]} с задержкой {@code 10 - b} тиков;</li>
 *     <li>синусоидальное покачивание {@code smoothW/smoothH};</li>
 *     <li>плавный поворот {@code AuraUtil.a(start, end, amount)} с GCD-патчем;</li>
 *     <li>окно жёсткой наводки при готовности удара ({@code c[3]}, {@code c[8]});</li>
 *     <li>заморозка yaw первые 4 тика после удара ({@code b <= 4 && c[2] % 2 == 0});</li>
 *     <li>случайный дополнительный удар (часть обхода ач);</li>
 *     <li><b>ФОВ-питч</b>: питч остаётся на реальном взгляде игрока
 *         ({@code Look.c()} = {@code FreeLookStorage.getFreePitch()}), наводится только yaw.</li>
 * </ul>
 *
 * <p>Обход ач сохранён: задержка реакции, покачивание, GCD-квантование и «живой» питч
 * игрока — сервер видит человеческие повороты, а не мгновенный снап в цель.
 */
public class FunTimeRotation extends RotationsSystem implements QClient {

    /** Тайки с последнего удара (аналог {@code b} в референсе). */
    private int ticksSinceAttack;

    /** Массив состояний киллуары (аналог {@code c[]} в референсе). */
    private final float[] state = new float[12];

    /** История питчей по тикам (аналог {@code u[]} в референсе). */
    private final float[] pitchHistory = new float[30];

    /** Флаг случайного дополнительного удара (аналог {@code f} в референсе). */
    private boolean extraAttackToggle;

    /** Тики, которые цель стоит на месте (замена {@code ServerUtil.a.a(target)}). */
    private int targetIdleTicks;
    private Vec3d lastTargetPos;

    private LivingEntity trackedTarget;
    private int lastAdvanceTick = -1;
    private boolean initialized;

    /** Последние посчитанные углы (отправляются каждый апдейт, состояние — раз в тик). */
    private float outYaw;
    private float outPitch;

    public void reset() {
        ticksSinceAttack = 0;
        extraAttackToggle = false;
        targetIdleTicks = 0;
        lastTargetPos = null;
        // Точное начальное состояние c[] из референса (инициализатор + onEnable):
        // {-1,-1,-1,-1,0,-1,-1,-1,-1,-1,-1,-1}, затем c[8]=2 (окно наводки), c[9]=random(9..13)
        Arrays.fill(state, -1.0f);
        state[4] = 0.0f;
        state[8] = 2.0f;
        state[9] = randInt(9, 13);
        Arrays.fill(pitchHistory, mc.player != null ? mc.player.getPitch() : 0.0f);
        trackedTarget = null;
        lastAdvanceTick = -1;
        initialized = false;
        outYaw = mc.player != null ? mc.player.getYaw() : 0.0f;
        outPitch = mc.player != null ? mc.player.getPitch() : 0.0f;
    }

    /** Вызывается после каждого удара ауры. */
    public void onAttack() {
        this.ticksSinceAttack = 0;
        this.state[2] += 1.0f;
        this.state[5] = rand(8.0f, 10.0f);
        this.state[9] = randInt(9, 13);
        if (this.state[2] == -1.0f) {
            this.state[4] = randInt(30, 35);
        }
    }

    @Override
    public void updateRotations(LivingEntity target) {
        if (mc.player == null || target == null) {
            return;
        }

        if (!initialized) {
            initialized = true;
            lastAdvanceTick = mc.player.age;
            trackedTarget = target;
            Arrays.fill(pitchHistory, mc.player.getPitch());
        }

        if (trackedTarget != target) {
            trackedTarget = target;
            state[10] = 0.0f;
            state[11] = 0.0f;
            Arrays.fill(pitchHistory, mc.player.getPitch());
        }

        // Референс двигает состояние раз в тик (GlobalEvent), а updateRotations
        // прилетает ~240 раз/сек — навёрстываем пропущенные тики по age игрока.
        while (lastAdvanceTick != mc.player.age) {
            lastAdvanceTick = mc.player.age;
            advanceTick(target);
        }

        sendRotation(outYaw, outPitch);
    }

    /** Один тик логики референса ({@code w()} + {@code a()} для «ФанТайм ФОВ»). */
    private void advanceTick(LivingEntity target) {
        ticksSinceAttack++;

        // ---- точка прицела (AuraUtil.a(eye, target, reach, true)) ----
        Vec3d eye = mc.player.getEyePos();
        float range = Aura.INSTANCE.getRangeValue();
        Vec3d targetPosition = FunTimeUtil.computeAimPoint(eye, target, range, true);
        float yawToTarget = targetPosition == Vec3d.ZERO
                ? FreeLookStorage.getFreeYaw()
                : (float) MathHelper.wrapDegrees(Math.toDegrees(Math.atan2(targetPosition.z, targetPosition.x)) - 90.0);
        float pitchToTarget = targetPosition == Vec3d.ZERO
                ? FreeLookStorage.getFreePitch()
                : (float) (-Math.toDegrees(Math.atan2(targetPosition.y, Math.hypot(targetPosition.x, targetPosition.z))));

        System.arraycopy(pitchHistory, 0, pitchHistory, 1, 29);
        pitchHistory[0] = pitchToTarget;

        // ---- случайный дополнительный удар (часть обхода ач) ----
        Vec3d targetPos = target.getPos();
        if (lastTargetPos == null || targetPos.squaredDistanceTo(lastTargetPos) > 1.0E-4) {
            targetIdleTicks = 0;
        } else {
            targetIdleTicks++;
        }
        lastTargetPos = targetPos;

        if (ticksSinceAttack >= 2
                && (targetIdleTicks > 6 || state[2] > 43.0f)
                && state[2] >= 33.0f
                && (ticksSinceAttack == 4 || Math.random() > 0.5)
                && (!extraAttackToggle || !FunTimeUtil.isEntityInFov(mc.player.getYaw(), mc.player.getPitch(), 3.0, target, false))) {
            Aura.INSTANCE.funTimeExtraAttack();
            if (Math.random() > 0.5) {
                extraAttackToggle = !extraAttackToggle;
            }
            state[2] = randInt(-10, 10);
        }

        // ---- готовность к удару (c[3]) ----
        boolean skip = (mc.player.isUsingItem() && mc.player.getItemUseTimeLeft() > 0 && ticksSinceAttack >= 8)
                || mc.currentScreen != null;
        if ((state[3] <= 0.0f && canAttack(target)) || FunTimeUtil.isFallingCritReady(ticksSinceAttack, target, skip)) {
            state[3] = 1.0f;
            if (!mc.player.isTouchingWater() && Aura.INSTANCE.sprintReset.isState() && !mc.player.isOnGround()) {
                state[0] = 1.0f;
            }
        }

        // ---- ротация «ФанТайм ФОВ» (метод a() в референсе) ----
        float t = mc.player.age + mc.getRenderTickCounter().getTickDelta(false);
        float smoothW = (float) (Math.sin((double) t * 0.4000000008323731d) * 3.0d
                + Math.sin(((double) t * 0.9500002390239708d) + 1.4000004888461306d) * 2.0d);
        float smoothH = (float) (Math.cos(((double) t * 0.5d) + 0.7000001555309916d) * 0.5d
                + Math.cos(((double) t * 0.7800000620494261d) + 3.10000031689524d) * 1.5d);
        float finalPitch = FunTimeUtil.smoothAngle(
                mc.player.getPitch(),
                pitchHistory[MathHelper.clamp(10 - ticksSinceAttack, 0, 29)] + (smoothH * 1.5f),
                rand(0.1f, 0.5f));
        float finalYaw = FunTimeUtil.smoothAngle(
                mc.player.getYaw(),
                yawToTarget + smoothW,
                rand(0.1f, 0.4f));
        if (state[3] >= 0.0f) {
            if (!FunTimeUtil.isEntityInFov(mc.player.getYaw(), mc.player.getPitch(), range, target, true) && state[8] <= 0.0f) {
                finalYaw = yawToTarget;
            }
            if (!FunTimeUtil.isEntityInFov(yawToTarget, finalPitch, range, target, true) && state[8] <= 0.0f) {
                finalPitch = pitchToTarget;
            }
            if (!FunTimeUtil.isEntityInFov(mc.player.getYaw() + smoothW, mc.player.getYaw() + smoothH, range, target, true)
                    && FunTimeUtil.isEntityInFov(mc.player.getYaw(), mc.player.getPitch(), range, target, true)) {
                smoothW = MathHelper.clamp(smoothW, -0.05f, 0.05f);
                smoothH = MathHelper.clamp(smoothH, -0.05f, 0.05f);
            }
        }
        if (ticksSinceAttack <= 4 && state[2] % 2.0f == 0.0f) {
            finalYaw = mc.player.getYaw();
        }

        // «ФанТайм ФОВ»: питч остаётся на реальном взгляде игрока (Look.c()), наводится только yaw
        outYaw = finalYaw + smoothW;
        outPitch = FreeLookStorage.getFreePitch() + smoothH;

        // ---- декременты в конце тика ----
        state[3] -= 1.0f;
        state[5] -= 1.0f;
        state[8] -= 1.0f;
        state[1] = (float) MathHelper.wrapDegrees(Math.toDegrees(Math.atan2(
                target.getZ() - mc.player.getZ(), target.getX() - mc.player.getX())) - 90.0);
    }

    /** Аналог {@code q()} референса: можно ли сейчас ударить (влияет на окно наводки c[3]). */
    private boolean canAttack(LivingEntity target) {
        if (mc.player.isUsingItem() && mc.player.getItemUseTimeLeft() > 0 && ticksSinceAttack >= 8) {
            ticksSinceAttack = 8;
            return false;
        }
        if (mc.currentScreen != null || !FunTimeUtil.isEntityInRange(target, Aura.INSTANCE.getRangeValue())) {
            return false;
        }
        if (mc.player.fallDistance > 1.5f) {
            if (mc.player.getItemCooldownManager().isCoolingDown(mc.player.getMainHandStack()) || ticksSinceAttack <= 3) {
                return false;
            }
        } else if (mc.player.getAttackCooldownProgress(0.5f) < 0.9f || ticksSinceAttack < 10) {
            return false;
        }
        return FunTimeUtil.isFalling()
                || (mc.player.isOnGround() && !mc.player.input.playerInput.jump())
                || !FunTimeUtil.canMove();
    }

    private void sendRotation(float yaw, float pitch) {
        Rotation rotation = new Rotation(yaw, pitch);
        RotationStorage.update(rotation, 220.0F, 220.0F, 220.0F, 220.0F, 0, 1, Aura.clientLook.isState());
        this.rotate = new Vec2f(rotation.getYaw(), rotation.getPitch());
    }

    /** Равномерный случайный float (аналог MathUtil.a(min, max) в референсе). */
    private static float rand(float min, float max) {
        return (float) (min + Math.random() * (max - min));
    }

    /** Равномерный случайный int (аналог (int) MathUtil.a(min, max) в референсе). */
    private static int randInt(int min, int max) {
        return (int) (min + Math.random() * (max - min + 1));
    }
}

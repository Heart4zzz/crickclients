package fun.crickclient.client.modules.impl.render;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormat;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;
import fun.crickclient.CrickClient;
import fun.crickclient.api.events.EventLink;
import fun.crickclient.api.events.implement.Event3DRender;
import fun.crickclient.api.utils.color.ColorUtils;
import fun.crickclient.client.modules.Module;
import fun.crickclient.client.modules.settings.implement.BooleanSetting;
import fun.crickclient.client.modules.settings.implement.FloatSetting;
import fun.crickclient.client.modules.settings.implement.ModeSetting;

public class Katana extends Module {

    public static Katana INSTANCE = new Katana();

    /**
     * Набор цветовых вариаций катаны. Каждая вариация задаёт свою палитру
     * для лезвия, гарды, рукояти и навершия.
     */
    private enum Variation {
        STANDARD("Стандарт",
                0xFFE2E5EE, /* лезвие: светлая сталь */
                0xFF6C7080, /* спинка лезвия */
                0xFFF7F9FF, /* режущая кромка */
                0xFFC09A48, /* гарда */
                0xFF4A2D14, /* рукоять */
                0xFF6B4422, /* акцент обмотки */
                0xFFC8A052, /* навершие */
                0xFF3B2210  /* нижняя часть рукояти (под обмоткой) */
        ),
        FIRE("Огненная",
                0xFFFF5A22, /* лезвие: оранжево-красное */
                0xFF7A1E00, /* тёмная спинка */
                0xFFFFD37A, /* светящаяся кромка */
                0xFF2A2A30, /* гарда */
                0xFF14131A, /* рукоять */
                0xFF3A1410, /* акцент обмотки */
                0xFF8B2A11, /* навершие */
                0xFF1A1422  /* нижняя часть рукояти */
        ),
        ICE("Ледяная",
                0xFF84D3FF, /* лезвие: голубой лёд */
                0xFF1A4D8B, /* синяя спинка */
                0xFFEAF8FF, /* светящаяся кромка */
                0xFF1F3A56, /* гарда */
                0xFF101A2B, /* рукоять */
                0xFF26384F, /* акцент обмотки */
                0xFF6FBDE7, /* навершие */
                0xFF091625  /* нижняя часть рукояти */
        );

        public final String displayName;
        public final int bladeColor;
        public final int spineColor;
        public final int edgeColor;
        public final int guardColor;
        public final int handleColor;
        public final int handleAccentColor;
        public final int pommelColor;
        public final int handleBaseColor;

        Variation(String displayName,
                  int blade, int spine, int edge,
                  int guard, int handle, int handleAccent,
                  int pommel, int handleBase) {
            this.displayName = displayName;
            this.bladeColor = blade;
            this.spineColor = spine;
            this.edgeColor = edge;
            this.guardColor = guard;
            this.handleColor = handle;
            this.handleAccentColor = handleAccent;
            this.pommelColor = pommel;
            this.handleBaseColor = handleBase;
        }
    }

    /* ===================== Настройки ===================== */

    private final ModeSetting variation = new ModeSetting(
            "Вариация", "Стандарт", "Стандарт", "Огненная", "Ледяная"
    );
    private final BooleanSetting useThemeBlade = new BooleanSetting(
            "Цвет клинка из темы", true
    );
    private final FloatSetting bladeRed = new FloatSetting(
            "Клинок R", 230, 0, 255, 5
    ).visible(() -> !useThemeBlade.isState());
    private final FloatSetting bladeGreen = new FloatSetting(
            "Клинок G", 200, 0, 255, 5
    ).visible(() -> !useThemeBlade.isState());
    private final FloatSetting bladeBlue = new FloatSetting(
            "Клинок B", 220, 0, 255, 5
    ).visible(() -> !useThemeBlade.isState());

    private final FloatSetting scale = new FloatSetting(
            "Размер", 1.05f, 0.5f, 2.0f, 0.05f
    );
    private final FloatSetting offsetX = new FloatSetting(
            "Смещение X", 0.10f, -0.5f, 0.5f, 0.01f
    );
    private final FloatSetting offsetY = new FloatSetting(
            "Смещение Y", -0.06f, -0.5f, 0.5f, 0.01f
    );
    private final FloatSetting offsetZ = new FloatSetting(
            "Смещение Z", -0.05f, -0.5f, 0.5f, 0.01f
    );
    private final FloatSetting tilt = new FloatSetting(
            "Наклон тела", 25.0f, -80.0f, 80.0f, 1.0f
    );
    private final FloatSetting rotation = new FloatSetting(
            "Поворот", 8.0f, -180.0f, 180.0f, 1.0f
    );
    private final FloatSetting pitch = new FloatSetting(
            "Наклон вперёд", -6.0f, -80.0f, 80.0f, 1.0f
    );

    private final BooleanSetting showOnSelf = new BooleanSetting(
            "Показывать на себе", true
    );
    private final BooleanSetting showOnFriends = new BooleanSetting(
            "Показывать на друзьях", true
    );

    private final BooleanSetting idleAnimation = new BooleanSetting(
            "Покачивание", true
    );
    private final FloatSetting idleSpeed = new FloatSetting(
            "Скорость покачивания", 1.0f, 0.0f, 3.0f, 0.05f
    ).visible(() -> idleAnimation.isState());
    private final FloatSetting idleStrength = new FloatSetting(
            "Сила покачивания", 1.0f, 0.0f, 3.0f, 0.05f
    ).visible(() -> idleAnimation.isState());

    /* ============ Геометрия катаны в локальных координатах ============ */

    private static final float BLADE_WIDTH = 0.045f;     // толщина лезвия (X)
    private static final float BLADE_DEPTH = 0.055f;     // ширина лезвия (Z)
    private static final float BLADE_LENGTH = 0.78f;     // длина прямой части
    private static final float BLADE_TIP_LENGTH = 0.12f; // длина заострения наверху
    private static final float BLADE_START_Y = 0.02f;    // низ лезвия над гардой
    private static final float BLADE_END_Y = BLADE_START_Y + BLADE_LENGTH;

    private static final float HANDLE_HEIGHT = 0.22f;    // длина рукояти
    private static final float HANDLE_WIDTH = 0.046f;    // толщина рукояти (X)
    private static final float HANDLE_DEPTH = 0.046f;    // ширина рукояти (Z)
    private static final float HANDLE_TOP_Y = 0.0f;      // верх рукояти (на гарде)

    private static final float GUARD_WIDTH = 0.135f;     // ширина гарды (X)
    private static final float GUARD_HEIGHT = 0.028f;    // толщина гарды (Y)
    private static final float GUARD_DEPTH = 0.075f;     // глубина гарды (Z)

    private static final float POMMEL_SIZE_X = 0.062f;   // навершие (X)
    private static final float POMMEL_SIZE_Y = 0.052f;   // навершие (Y)
    private static final float POMMEL_SIZE_Z = 0.062f;   // навершие (Z)

    public Katana() {
        super("Katana", "3D-katana на спине", ModuleCategory.RENDER);
        addSettings(
                variation,
                useThemeBlade,
                bladeRed,
                bladeGreen,
                bladeBlue,
                scale,
                offsetX,
                offsetY,
                offsetZ,
                tilt,
                rotation,
                pitch,
                showOnSelf,
                showOnFriends,
                idleAnimation,
                idleSpeed,
                idleStrength
        );
    }

    /* ===================== Рендер ===================== */

    @EventLink
    public void onRender3D(Event3DRender event) {
        if (mc.player == null || mc.world == null) return;

        float tickDelta = event.getTickDelta();
        MatrixStack matrices = event.getMatrices();
        Vec3d cameraPos = event.getCamera().getPos();

        for (PlayerEntity player : mc.world.getPlayers()) {
            if (!shouldRenderForPlayer(player)) continue;
            if (player == mc.player && mc.options.getPerspective().isFirstPerson()) continue;
            renderKatanaForPlayer(player, tickDelta, matrices, cameraPos);
        }
    }

    private boolean shouldRenderForPlayer(PlayerEntity player) {
        if (mc.player == null) return false;
        if (player == mc.player) return showOnSelf.isState();

        return showOnFriends.isState()
                && CrickClient.INSTANCE != null
                && CrickClient.INSTANCE.friendStorage != null
                && CrickClient.INSTANCE.friendStorage.isFriend(player.getName().getString());
    }

    private Variation getVariation() {
        String current = variation.getCurrent();
        for (Variation v : Variation.values()) {
            if (v.displayName.equals(current)) return v;
        }
        return Variation.STANDARD;
    }

    private int resolveBladeColor(Variation v) {
        if (useThemeBlade.isState()) {
            // Получаем цвет из темы клиента (как другие модули делают)
            return ColorUtils.getThemeColor();
        }
        int r = MathHelper.clamp(Math.round(bladeRed.get()), 0, 255);
        int g = MathHelper.clamp(Math.round(bladeGreen.get()), 0, 255);
        int b = MathHelper.clamp(Math.round(bladeBlue.get()), 0, 255);
        return ColorUtils.rgba(r, g, b, 255);
    }

    private void renderKatanaForPlayer(PlayerEntity player, float tickDelta,
                                      MatrixStack matrices, Vec3d cameraPos) {
        double px = MathHelper.lerp(tickDelta, player.prevX, player.getX()) - cameraPos.x;
        double py = MathHelper.lerp(tickDelta, player.prevY, player.getY()) - cameraPos.y;
        double pz = MathHelper.lerp(tickDelta, player.prevZ, player.getZ()) - cameraPos.z;

        float bodyYaw = MathHelper.lerpAngleDegrees(tickDelta, player.prevBodyYaw, player.bodyYaw);

        // Приседающий игрок немного ниже — поправляем высоту крепления
        float sneakingOffset = player.isSneaking() ? 0.42f : 0.30f;
        float hipHeight = player.getHeight() - sneakingOffset;

        Variation v = getVariation();
        int bladeColor = resolveBladeColor(v);

        // Idle-анимация (лёгкое покачивание)
        float idleTilt = 0.0f;
        float idleRoll = 0.0f;
        if (idleAnimation.isState()) {
            float t = (player.age + tickDelta) * (0.7f + idleSpeed.get() * 0.55f);
            idleTilt = MathHelper.sin(t * 0.85f) * 1.3f * idleStrength.get();
            idleRoll = MathHelper.cos(t * 0.62f) * 0.7f * idleStrength.get();
        }

        // Базовое смещение: спина, чуть смещено вправо, чуть ниже плеч
        float backOffset = -0.05f;
        float rightSide = 0.12f;
        float backSide = -0.10f + offsetZ.get();
        float baseX = rightSide + offsetX.get();
        float baseY = hipHeight + offsetY.get();
        float baseZ = backSide;

        matrices.push();
        matrices.translate(px, py, pz);
        matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-bodyYaw));
        matrices.translate(baseX, baseY, baseZ);

        // Поворот катаны на спине: наклон тела (вдоль спины) + поворот вокруг себя
        matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(rotation.get()));
        matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(pitch.get()));
        matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(tilt.get() + idleTilt));
        matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(idleRoll));

        // Доп. смещение — вперёд/назад чтобы катана лежала ближе к телу
        matrices.translate(0.0f, 0.0f, backOffset);

        // Масштаб
        float s = scale.get();
        matrices.scale(s, s, s);

        // Рисуем все части одной партией, чтобы не было переключений шейдера
        renderKatanaParts(matrices, v, bladeColor);

        matrices.pop();
    }

    /**
     * Рисует все части катаны в локальных координатах, где:
     *   Y > 0 — вверх по лезвию
     *   X — поперёк клинка (тонкое направление)
     *   Z — по плоскости клинка (широкое направление)
     */
    private void renderKatanaParts(MatrixStack matrices, Variation v, int bladeColor) {
        RenderSystem.enableBlend();
        RenderSystem.disableCull();
        RenderSystem.enableDepthTest();
        RenderSystem.depthMask(true);
        RenderSystem.defaultBlendFunc();
        RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);

        BufferBuilder buffer = Tessellator.getInstance().begin(VertexFormat.DrawMode.QUADS, VertexFormats.POSITION_COLOR);
        Matrix4f matrix = matrices.peek().getPositionMatrix();

        // 1. Нижняя часть рукояти (под обмоткой), немного уже
        drawBox(buffer, matrix,
                0.0f, HANDLE_TOP_Y - HANDLE_HEIGHT * 0.5f - 0.02f, 0.0f,
                HANDLE_WIDTH * 0.92f, HANDLE_HEIGHT * 0.55f + 0.04f, HANDLE_DEPTH * 0.92f,
                v.handleBaseColor);

        // 2. Обмотка рукояти (чередующиеся сегменты сверху и снизу)
        int wrapSegments = 5;
        float wrapTop = HANDLE_TOP_Y - 0.005f;
        float wrapBottom = HANDLE_TOP_Y - HANDLE_HEIGHT + 0.01f;
        float segH = (wrapTop - wrapBottom) / wrapSegments;
        for (int i = 0; i < wrapSegments; i++) {
            float segCenter = wrapBottom + segH * (i + 0.5f);
            int segColor = (i % 2 == 0) ? v.handleColor : v.handleAccentColor;
            drawBox(buffer, matrix,
                    0.0f, segCenter * 0.99f, 0.0f,
                    HANDLE_WIDTH, segH * 0.98f, HANDLE_DEPTH,
                    segColor);
        }

        // 3. Гарда (плоская, чуть утоплена сверху)
        drawBox(buffer, matrix,
                0.0f, HANDLE_TOP_Y - GUARD_HEIGHT * 0.5f + 0.002f, 0.0f,
                GUARD_WIDTH, GUARD_HEIGHT, GUARD_DEPTH,
                v.guardColor);
        // Лёгкий акцент-полоска на гарде
        drawBox(buffer, matrix,
                0.0f, HANDLE_TOP_Y - GUARD_HEIGHT * 0.5f + 0.001f, GUARD_DEPTH * 0.32f,
                GUARD_WIDTH * 0.88f, GUARD_HEIGHT * 0.35f, GUARD_DEPTH * 0.08f,
                blendColors(v.guardColor, 0xFFFFFFFF, 0.25f));

        // 4. Навершие (pommel)
        drawBox(buffer, matrix,
                0.0f, HANDLE_TOP_Y - HANDLE_HEIGHT - POMMEL_SIZE_Y * 0.5f + 0.01f, 0.0f,
                POMMEL_SIZE_X, POMMEL_SIZE_Y, POMMEL_SIZE_Z,
                v.pommelColor);
        // Маленькая "шляпка" сверху навершия (чуть светлее)
        drawBox(buffer, matrix,
                0.0f, HANDLE_TOP_Y - HANDLE_HEIGHT + 0.008f, 0.0f,
                POMMEL_SIZE_X * 0.7f, POMMEL_SIZE_Y * 0.35f, POMMEL_SIZE_Z * 0.7f,
                blendColors(v.pommelColor, 0xFFFFFFFF, 0.2f));

        // 5. Лезвие (прямая часть)
        drawBox(buffer, matrix,
                0.0f, BLADE_START_Y + BLADE_LENGTH * 0.5f, 0.0f,
                BLADE_WIDTH, BLADE_LENGTH, BLADE_DEPTH,
                bladeColor);

        // Светлая кромка у самого низа лезвия
        drawBox(buffer, matrix,
                0.0f, BLADE_START_Y - 0.005f, 0.0f,
                BLADE_WIDTH * 0.95f, 0.012f, BLADE_DEPTH * 0.96f,
                blendColors(bladeColor, v.edgeColor, 0.55f));

        // Тёмная спинка у верха лезвия
        drawBox(buffer, matrix,
                0.0f, BLADE_END_Y - 0.018f, 0.0f,
                BLADE_WIDTH * 0.6f, 0.022f, BLADE_DEPTH * 0.92f,
                v.spineColor);

        // Лёгкое осветление у острия — эффект заточки
        drawBox(buffer, matrix,
                0.0f, BLADE_END_Y - 0.045f, 0.0f,
                BLADE_WIDTH * 0.5f, 0.05f, BLADE_DEPTH * 0.94f,
                blendColors(bladeColor, v.edgeColor, 0.30f));

        // 6. Заострённый конец лезвия (треугольная призма)
        drawBladeTip(buffer, matrix, BLADE_END_Y, BLADE_WIDTH, BLADE_DEPTH, bladeColor);

        BufferRenderer.drawWithGlobalProgram(buffer.end());

        RenderSystem.enableCull();
        RenderSystem.enableDepthTest();
        RenderSystem.disableBlend();
    }

    /**
     * Рисует шесть граней осесимметричного блока, центр в (cx,cy,cz),
     * размеры (w,h,d).
     */
    private void drawBox(BufferBuilder buffer, Matrix4f m,
                         float cx, float cy, float cz,
                         float w, float h, float d,
                         int color) {
        float hx = w * 0.5f;
        float hy = h * 0.5f;
        float hz = d * 0.5f;
        int r = (color >> 16) & 0xFF;
        int g = (color >> 8) & 0xFF;
        int b = color & 0xFF;
        int a = (color >> 24) & 0xFF;

        float minX = cx - hx, maxX = cx + hx;
        float minY = cy - hy, maxY = cy + hy;
        float minZ = cz - hz, maxZ = cz + hz;

        // Front (+Z)
        buffer.vertex(m, minX, minY, maxZ).color(r, g, b, a);
        buffer.vertex(m, maxX, minY, maxZ).color(r, g, b, a);
        buffer.vertex(m, maxX, maxY, maxZ).color(r, g, b, a);
        buffer.vertex(m, minX, maxY, maxZ).color(r, g, b, a);

        // Back (-Z)
        buffer.vertex(m, maxX, minY, minZ).color(r, g, b, a);
        buffer.vertex(m, minX, minY, minZ).color(r, g, b, a);
        buffer.vertex(m, minX, maxY, minZ).color(r, g, b, a);
        buffer.vertex(m, maxX, maxY, minZ).color(r, g, b, a);

        // Left (-X)
        buffer.vertex(m, minX, minY, minZ).color(r, g, b, a);
        buffer.vertex(m, minX, minY, maxZ).color(r, g, b, a);
        buffer.vertex(m, minX, maxY, maxZ).color(r, g, b, a);
        buffer.vertex(m, minX, maxY, minZ).color(r, g, b, a);

        // Right (+X)
        buffer.vertex(m, maxX, minY, maxZ).color(r, g, b, a);
        buffer.vertex(m, maxX, minY, minZ).color(r, g, b, a);
        buffer.vertex(m, maxX, maxY, minZ).color(r, g, b, a);
        buffer.vertex(m, maxX, maxY, maxZ).color(r, g, b, a);

        // Top (+Y)
        buffer.vertex(m, minX, maxY, maxZ).color(r, g, b, a);
        buffer.vertex(m, maxX, maxY, maxZ).color(r, g, b, a);
        buffer.vertex(m, maxX, maxY, minZ).color(r, g, b, a);
        buffer.vertex(m, minX, maxY, minZ).color(r, g, b, a);

        // Bottom (-Y)
        buffer.vertex(m, minX, minY, minZ).color(r, g, b, a);
        buffer.vertex(m, maxX, minY, minZ).color(r, g, b, a);
        buffer.vertex(m, maxX, minY, maxZ).color(r, g, b, a);
        buffer.vertex(m, minX, minY, maxZ).color(r, g, b, a);
    }

    /**
     * Треугольная призма — заострение лезвия. Стартует с квадрата на высоте
     * {@code startY} и сходится в точку на высоте {@code startY + tipLength}.
     * Рисуется четырьмя гранями (две боковые + передняя + задняя).
     */
    private void drawBladeTip(BufferBuilder buffer, Matrix4f m,
                              float startY, float width, float depth,
                              int color) {
        float hx = width * 0.5f;
        float hz = depth * 0.5f;
        float apexY = startY + BLADE_TIP_LENGTH;

        // Маленький отступ от прямой части — чтобы не Z-fighting
        float baseY = startY + 0.001f;

        int r = (color >> 16) & 0xFF;
        int g = (color >> 8) & 0xFF;
        int b = color & 0xFF;
        int a = (color >> 24) & 0xFF;

        // Front (+Z): четыре вершины (два основания + дубликат апекса)
        buffer.vertex(m, -hx, baseY, hz).color(r, g, b, a);
        buffer.vertex(m, hx, baseY, hz).color(r, g, b, a);
        buffer.vertex(m, 0.0f, apexY, 0.0f).color(r, g, b, a);
        buffer.vertex(m, 0.0f, apexY, 0.0f).color(r, g, b, a);

        // Back (-Z)
        buffer.vertex(m, hx, baseY, -hz).color(r, g, b, a);
        buffer.vertex(m, -hx, baseY, -hz).color(r, g, b, a);
        buffer.vertex(m, 0.0f, apexY, 0.0f).color(r, g, b, a);
        buffer.vertex(m, 0.0f, apexY, 0.0f).color(r, g, b, a);

        // Left (-X)
        buffer.vertex(m, -hx, baseY, -hz).color(r, g, b, a);
        buffer.vertex(m, -hx, baseY, hz).color(r, g, b, a);
        buffer.vertex(m, 0.0f, apexY, 0.0f).color(r, g, b, a);
        buffer.vertex(m, 0.0f, apexY, 0.0f).color(r, g, b, a);

        // Right (+X)
        buffer.vertex(m, hx, baseY, hz).color(r, g, b, a);
        buffer.vertex(m, hx, baseY, -hz).color(r, g, b, a);
        buffer.vertex(m, 0.0f, apexY, 0.0f).color(r, g, b, a);
        buffer.vertex(m, 0.0f, apexY, 0.0f).color(r, g, b, a);
    }

    /**
     * Смешивает два цвета в формате ARGB. {@code amount} в диапазоне [0..1].
     */
    private int blendColors(int c1, int c2, float amount) {
        amount = MathHelper.clamp(amount, 0.0f, 1.0f);
        int a1 = (c1 >> 24) & 0xFF, r1 = (c1 >> 16) & 0xFF, g1 = (c1 >> 8) & 0xFF, b1 = c1 & 0xFF;
        int a2 = (c2 >> 24) & 0xFF, r2 = (c2 >> 16) & 0xFF, g2 = (c2 >> 8) & 0xFF, b2 = c2 & 0xFF;
        int a = (int) MathHelper.lerp(amount, a1, a2);
        int r = (int) MathHelper.lerp(amount, r1, r2);
        int g = (int) MathHelper.lerp(amount, g1, g2);
        int b = (int) MathHelper.lerp(amount, b1, b2);
        return (a << 24) | (r << 16) | (g << 8) | b;
    }
}

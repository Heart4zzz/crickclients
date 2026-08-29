package fun.crickclient.client.modules.impl.misc;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormat;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;
import org.lwjgl.opengl.GL11;
import fun.crickclient.api.events.EventLink;
import fun.crickclient.api.events.implement.Event3DRender;
import fun.crickclient.api.events.implement.EventUpdate;
import fun.crickclient.api.utils.music.LrcLoader;
import fun.crickclient.api.utils.music.MusicManager;
import fun.crickclient.api.utils.music.TrackState;
import fun.crickclient.api.utils.render.fonts.msdf.Font;
import fun.crickclient.api.utils.render.fonts.msdf.Fonts;
import fun.crickclient.client.modules.Module;
import fun.crickclient.client.modules.settings.implement.FloatSetting;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Песня «в мире»: текущая строка текста появляется в случайной точке перед игроком,
 * по ней перепрыгивает светящийся шарик, подсвечивая слово, которое поётся прямо сейчас.
 *
 * <p>Тексты берутся из LRC-файлов в {@code C:\CrickClient\crickclient\lyrics\}
 * («Исполнитель-Название.lrc» или просто «Название.lrc»). Без LRC — караоке по
 * названию трека.
 */
public class TextMusic extends Module {

    public static TextMusic INSTANCE = new TextMusic();

    private static final String FONT_NAME = "sf_regular";
    private static final float FONT_UNITS = 16f;
    private static final float LINE_FADE_IN_MS = 420f;
    private static final float LINE_FADE_OUT_MS = 520f;
    private static final float LINE_FADE_OUT_RISE = 0.35f;

    private static final Identifier BALL_TEXTURE = Identifier.of("crickclient", "textures/jumpcircle/circle.png");

    private final FloatSetting distance = new FloatSetting("Дистанция", 7f, 4f, 12f, 0.5f);
    private final FloatSetting brightness = new FloatSetting("Яркость", 0.7f, 0.2f, 1.0f, 0.05f);
    private final FloatSetting ballSpeed = new FloatSetting("Скорость шарика", 1f, 0.4f, 2.0f, 0.1f);
    private final FloatSetting scale = new FloatSetting("Размер", 1f, 0.5f, 2.0f, 0.1f);

    private final Random random = new Random();

    private String lastTrackKey = null;
    private List<LrcLoader.LyricLine> lines;
    private int lineIndex = -1;
    private LineState current;
    private LineState previous;

    // Тексты из API (Яндекс Музыка): приходят асинхронно в фоновом потоке
    private volatile List<LrcLoader.LyricLine> pendingLyrics;
    private volatile boolean lyricsFailed;
    private final AtomicReference<String> lyricsRequest = new AtomicReference<>();

    /** Позиция воспроизведения, сглаженная по кадрам (мс). */
    private double displayPosMs = -1;
    private boolean hasDisplayPos;

    /** Текущая позиция шарика (font-единицы, локальные координаты строки) — догоняет цель. */
    private float ballX, ballY;
    private boolean ballInit;

    public TextMusic() {
        super("TextMusic", "Текст песни прямо в мире: строки в поле зрения, неоновый шарик на текущем слове",
                ModuleCategory.MISC);
        addSettings(distance, brightness, ballSpeed, scale);
    }

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
        lastTrackKey = null;
        lines = null;
        lineIndex = -1;
        current = null;
        previous = null;
        hasDisplayPos = false;
        displayPosMs = -1;
        ballInit = false;
    }

    /** Одно отображаемое состояние строки (текущая или исчезающая). */
    private static final class LineState {
        String text;
        String[] words;
        float[] wordCenters; // X-центр каждого слова в font-единицах, 0 = центр строки
        float totalWidth;
        Vec3d spot;          // центр строки в мире
        long startMs;        // начало строки по таймкодам (0 — fallback)
        long endMs;          // конец строки
        long bornAtMs;       // когда строка появилась (fade-in)
        long switchedAtMs;   // когда строка уступила место следующей (fade-out)
        float seed;          // фаза для лёгкого «парения»
    }

    // ===================== Логика (тик) =====================

    @EventLink
    public void onUpdate(EventUpdate event) {
        if (mc.player == null || mc.world == null) return;

        MusicManager music = MusicManager.instance;
        if (music == null || !music.isMusicActive()) {
            if (current != null) resetState();
            return;
        }

        TrackState st = music.state();
        String key = music.isYandex()
                ? "ym|" + st.trackId
                : "sp|" + (st.artist + "||" + st.title).toLowerCase(Locale.ROOT);
        if (!key.equals(lastTrackKey)) {
            lastTrackKey = key;
            pendingLyrics = null;
            lyricsFailed = false;
            loadTrack(st);
            hasDisplayPos = false;
            return;
        }

        // Пришли тексты из API — переключаемся с заголовка на реальные строки
        if (music.isYandex()) {
            if (pendingLyrics != null) {
                List<LrcLoader.LyricLine> got = pendingLyrics;
                pendingLyrics = null;
                previous = current;
                if (previous != null) previous.switchedAtMs = System.currentTimeMillis();
                lines = normalizeLyrics(got, st.durationMs);
                lineIndex = -1;
                pickLineForPosition(st.positionMs);
            } else if (lines == null && !lyricsFailed && !st.trackId.isEmpty()) {
                requestYmLyrics(st.trackId);
            }
        }

        long pos = st.positionMs;
        if (current == null) {
            pickLineForPosition(pos);
        } else if (pos < current.startMs - 250) {
            // Перемотка назад
            pickLineForPosition(pos);
        } else if (pos >= current.endMs) {
            // Строка отсвечана — передаём её в «прошлое» и берём следующую
            if (hasNextLine()) {
                previous = current;
                previous.switchedAtMs = System.currentTimeMillis();
                lineIndex++;
                enterLine();
            }
            // Последняя строка просто остаётся до конца трека
        }
    }

    private void loadTrack(TrackState st) {
        if (MusicManager.instance != null && MusicManager.instance.isYandex()) {
            // Пока тексты грузятся из API — караоке по названию
            lines = null;
            buildTitleFallback(st);
            if (!st.trackId.isEmpty() && current != null) {
                requestYmLyrics(st.trackId);
            } else {
                lyricsFailed = true;
            }
            return;
        }

        lines = LrcLoader.load(st.artist, st.title);
        lineIndex = -1;

        if (lines == null || lines.isEmpty()) {
            // Fallback: караоке по названию на всю длину трека
            buildTitleFallback(st);
            return;
        }

        pickLineForPosition(st.positionMs);
    }

    private void buildTitleFallback(TrackState st) {
        String text = (st.title != null && !st.title.isEmpty()) ? st.title : st.artist;
        if (text == null || text.isEmpty()) {
            current = null;
            previous = null;
            return;
        }
        long dur = st.durationMs > 0 ? st.durationMs : 300_000L; // если Spotify не вернул длительность — показываем 5 минут
        // Для Spotify без LRC показываем весь трек одной строкой, а не 1 секунду
        current = buildLine(text, 0L, Math.max(1000L, dur));
        previous = null;
    }

    /** Запрос текстов из API Яндекса; результат появится в pendingLyrics. */
    private void requestYmLyrics(String trackId) {
        MusicManager music = MusicManager.instance;
        if (music == null || trackId == null || trackId.isEmpty()) return;
        lyricsRequest.set(trackId);
        music.loadLyricsAsync(trackId, l -> {
            // Игнорируем результат, если трек уже сменился
            if (!trackId.equals(lyricsRequest.get())) return;
            if (l != null && !l.isEmpty()) {
                pendingLyrics = l;
            } else {
                lyricsFailed = true; // текстов у трека нет — остаёмся на заголовке
            }
        });
    }

    /**
     * Тексты без таймкодов (plain) распределяем равномерно по длительности трека,
     * синхронизированные оставляем как есть.
     */
    private static List<LrcLoader.LyricLine> normalizeLyrics(List<LrcLoader.LyricLine> got, long durationMs) {
        if (got.get(0).startMs >= 0) return got;

        long total = Math.max(1000L, durationMs);
        long slot = Math.max(100L, total / got.size());
        List<LrcLoader.LyricLine> out = new ArrayList<>();
        for (int i = 0; i < got.size(); i++) {
            LrcLoader.LyricLine src = got.get(i);
            LrcLoader.LyricLine line = new LrcLoader.LyricLine(i * slot, src.text);
            line.endMs = (i + 1 == got.size()) ? total : (i + 1) * slot;
            out.add(line);
        }
        return out;
    }

    private boolean hasNextLine() {
        return lines != null && lineIndex + 1 < lines.size();
    }

    private void pickLineForPosition(long pos) {
        if (lines == null || lines.isEmpty()) {
            current = null;
            return;
        }
        int idx = 0;
        for (int i = 0; i < lines.size(); i++) {
            if (pos >= lines.get(i).startMs) idx = i; else break;
        }
        // Если перемотали вперёд и строка уже «отыграна» — берём её (дождемся endMs)
        lineIndex = idx;
        current = null;
        enterLine();
    }

    private void enterLine() {
        LrcLoader.LyricLine lyr = lines.get(lineIndex);
        current = buildLine(lyr.text, lyr.startMs, lyr.endMs);
    }

    private LineState buildLine(String text, long startMs, long endMs) {
        LineState state = new LineState();
        state.text = text;
        state.startMs = startMs;
        state.endMs = Math.max(endMs, startMs + 500L);
        state.bornAtMs = System.currentTimeMillis();
        state.switchedAtMs = -1;
        state.seed = random.nextFloat() * 1000f;
        state.spot = pickSpot();
        ballInit = false; // шарик стартует с первого слова новой строки
        layoutWords(state, text);
        return state;
    }

    private void layoutWords(LineState state, String text) {
        String[] parts = text.split(" ");
        List<String> words = new java.util.ArrayList<>();
        for (String p : parts) {
            if (!p.isEmpty()) words.add(p);
        }
        if (words.isEmpty()) words.add(text);
        state.words = words.toArray(new String[0]);

        Font font = getFont();
        if (font == null) {
            state.wordCenters = new float[state.words.length];
            state.totalWidth = 0;
            return;
        }

        float spaceW = font.getStringWidth(" ");
        float total = 0f;
        for (String w : state.words) total += font.getStringWidth(w);
        total += spaceW * (state.words.length - 1);
        state.totalWidth = total;

        float x = -total / 2f;
        for (int i = 0; i < state.words.length; i++) {
            float w = font.getStringWidth(state.words[i]);
            state.wordCenters[i] = x + w / 2f;
            x += w + spaceW;
        }
    }

    private Font getFont() {
        return Fonts.getFont(FONT_NAME, (int) FONT_UNITS);
    }

    /** Случайная точка в конусе перед глазами игрока. */
    private Vec3d pickSpot() {
        float yawDeg = mc.player.getYaw() + (float) (random.nextGaussian() * 34.0);
        yawDeg = MathHelper.clamp(yawDeg, mc.player.getYaw() - 55f, mc.player.getYaw() + 55f);
        float pitchDeg = MathHelper.clamp(mc.player.getPitch() + (float) (random.nextGaussian() * 14.0),
                mc.player.getPitch() - 26f, mc.player.getPitch() + 26f);

        float dist = distance.get() * (0.8f + 0.4f * random.nextFloat());
        float yawRad = (float) Math.toRadians(yawDeg);
        float pitchRad = (float) Math.toRadians(pitchDeg);

        Vec3d eye = mc.player.getEyePos();
        return new Vec3d(
                eye.x - Math.sin(yawRad) * Math.cos(pitchRad) * dist,
                eye.y + Math.sin(pitchRad) * dist,
                eye.z + Math.cos(yawRad) * Math.cos(pitchRad) * dist
        );
    }

    // ===================== Рендер (кадр) =====================

    @EventLink
    public void onRender3D(Event3DRender event) {
        if (mc.player == null || current == null) return;

        MusicManager music = MusicManager.instance;
        if (music == null || !music.isMusicActive()) return;
        TrackState st = music.state();

        // Плавная позиция воспроизведения между опросами (~5 раз/с)
        long now = System.currentTimeMillis();
        if (!hasDisplayPos) {
            displayPosMs = st.positionMs;
            hasDisplayPos = true;
        } else {
            double diff = st.positionMs - displayPosMs;
            if (Math.abs(diff) > 5000) {
                displayPosMs = st.positionMs; // перемотка — без «доезда»
            } else {
                displayPosMs += diff * 0.18;
            }
        }
        float progress = lineProgress(current, (long) displayPosMs);

        // Лёгкое парение строки
        float t = now / 1000f;
        Vec3d spot = new Vec3d(
                current.spot.x + Math.sin(t * 0.7f + current.seed) * 0.12f,
                current.spot.y + Math.sin(t * 0.9f + current.seed * 2.1f) * 0.1f,
                current.spot.z
        );

        // Исчезающая предыдущая строка
        if (previous != null) {
            float f = (float) MathHelper.clamp((now - previous.switchedAtMs) / LINE_FADE_OUT_MS, 0f, 1f);
            if (f >= 1f) {
                previous = null;
            } else {
                float eased = f * f * (3f - 2f * f);
                float oldAlpha = 1f - eased;
                Vec3d oldSpot = new Vec3d(previous.spot.x,
                        previous.spot.y + eased * LINE_FADE_OUT_RISE,
                        previous.spot.z);
                // true в конце — без подсветки активного слова и без шарика на уходящей строке
                renderLine(event, previous, oldSpot, spotToScreenScale(oldSpot), oldAlpha, 0f, 0f, true);
            }
        }

        float fadeIn = (float) MathHelper.clamp((now - current.bornAtMs) / LINE_FADE_IN_MS, 0f, 1f);
        float easedIn = fadeIn * fadeIn * (3f - 2f * fadeIn);

        renderLine(event, current, spot, spotToScreenScale(spot), easedIn, progress, t, st.paused);
    }

    private float lineProgress(LineState line, long posMs) {
        if (line.endMs <= line.startMs) return 0f;
        return (float) MathHelper.clamp((double) (posMs - line.startMs) / (double) (line.endMs - line.startMs), 0.0, 1.0);
    }

    /** Масштаб font-единиц -> миры: строка держит ~10-12 px на экране. */
    private float spotToScreenScale(Vec3d spot) {
        double dist = mc.player.getEyePos().distanceTo(spot);
        dist = MathHelper.clamp(dist, 3d, 14d);
        return 0.0105f * (float) Math.pow(dist / 7.0, 0.6) * scale.get();
    }

    private void renderLine(Event3DRender event, LineState line, Vec3d spot, float s, float alpha,
                            float progress, float time, boolean paused) {
        if (alpha <= 0.01f || line.words.length == 0) return;

        MatrixStack matrices = event.getMatrices();
        Vec3d cameraPos = event.getCamera().getPos();
        Font font = getFont();
        if (font == null) return;

        matrices.push();
        matrices.translate(spot.x - cameraPos.x, spot.y - cameraPos.y, spot.z - cameraPos.z);
        matrices.scale(s, s, s);

        // --- Слова ---
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.enableDepthTest();
        RenderSystem.depthMask(false);
        RenderSystem.disableCull();

        float textTop = -FONT_UNITS * 0.5f;
        float activeF = progress * (line.words.length - 1);
        int activeIdx = (int) Math.floor(activeF);
        activeIdx = MathHelper.clamp(activeIdx, 0, Math.max(0, line.words.length - 1));
        float bright = brightness.get();

        for (int i = 0; i < line.words.length; i++) {
            String word = line.words[i];
            float x = line.wordCenters[i] - font.getStringWidth(word) / 2f;
            boolean isActive = i == activeIdx && !paused;

            if (isActive) {
                // Неоновое гало: мягкие копии со смещениями
                int halo = setAlpha(0x86DDFF, (int) (55 * bright * alpha));
                int halo2 = setAlpha(0x86DDFF, (int) (30 * bright * alpha));
                font.drawStringNoOffset(matrices, word, x - 0.7f, textTop, halo);
                font.drawStringNoOffset(matrices, word, x + 0.7f, textTop, halo);
                font.drawStringNoOffset(matrices, word, x, textTop - 0.7f, halo);
                font.drawStringNoOffset(matrices, word, x, textTop + 0.7f, halo);
                font.drawStringNoOffset(matrices, word, x - 1.4f, textTop, halo2);
                font.drawStringNoOffset(matrices, word, x + 1.4f, textTop, halo2);
                font.drawStringNoOffset(matrices, word, x, textTop - 1.4f, halo2);
                font.drawStringNoOffset(matrices, word, x, textTop + 1.4f, halo2);
                // Ядро — яркое, но сдержанное
                int core = setAlpha(0xEAFAFF, (int) (Math.min(1f, alpha + 0.3f) * 235));
                font.drawStringNoOffset(matrices, word, x, textTop, core);
            } else {
                int dim = setAlpha(0xB4C6DE, (int) ((90 + 70 * bright) * alpha));
                font.drawStringNoOffset(matrices, word, x, textTop, dim);
            }
        }

        // --- Шарик ---
        if (!paused) {
            float targetX, targetY;
            if (line.words.length <= 1) {
                targetX = line.words.length == 1 ? line.wordCenters[0] : 0f;
                targetY = textTop - 4f;
            } else {
                float t01 = activeF - activeIdx;
                float from = line.wordCenters[activeIdx];
                float to = line.wordCenters[Math.min(activeIdx + 1, line.words.length - 1)];
                // Дуга прыжка между словами
                float hop = (float) (Math.sin(t01 * Math.PI) * (4.5f + 1.5f * Math.sin(time * 2f)));
                targetX = from + (to - from) * t01;
                targetY = textTop - 3.5f - hop;
            }

            if (!ballInit) {
                ballX = targetX;
                ballY = targetY;
                ballInit = true;
            } else {
                // Шарик «догоняет» цель — скорость задаётся настройкой
                float k = MathHelper.clamp(0.10f + 0.14f * ballSpeed.get(), 0.02f, 0.6f);
                ballX += (targetX - ballX) * k;
                ballY += (targetY - ballY) * k;
            }
            renderBall(matrices, ballX, ballY, alpha, bright, time);
        }

        matrices.pop();

        RenderSystem.enableCull();
        RenderSystem.depthMask(true);
        RenderSystem.disableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.setShaderColor(1f, 1f, 1f, 1f);
    }

    private void renderBall(MatrixStack matrices, float x, float y, float alpha, float bright, float time) {
        float pulse = 1f + (float) Math.sin(time * 5f) * 0.08f;
        float r = 4.6f * pulse;

        // Свечение (аддитивное)
        RenderSystem.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE);
        RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
        RenderSystem.setShaderTexture(0, BALL_TEXTURE);

        float glowR = r * 2.4f;
        int glowColor = setAlpha(0x86DDFF, (int) (70 * bright * alpha));
        drawBallQuad(matrices, x, y, glowR, glowColor);
        int coreColor = setAlpha(0xD8F6FF, (int) (200 * bright * alpha));
        drawBallQuad(matrices, x, y, r, coreColor);

        RenderSystem.defaultBlendFunc();
    }

    private void drawBallQuad(MatrixStack matrices, float x, float y, float r, int color) {
        Matrix4f matrix = matrices.peek().getPositionMatrix();
        int cr = (color >> 16) & 0xFF;
        int cg = (color >> 8) & 0xFF;
        int cb = color & 0xFF;
        int ca = (color >> 24) & 0xFF;

        BufferBuilder buffer = Tessellator.getInstance().begin(VertexFormat.DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
        buffer.vertex(matrix, x - r, y - r, 0f).texture(0f, 1f).color(cr, cg, cb, ca);
        buffer.vertex(matrix, x - r, y + r, 0f).texture(0f, 0f).color(cr, cg, cb, ca);
        buffer.vertex(matrix, x + r, y + r, 0f).texture(1f, 0f).color(cr, cg, cb, ca);
        buffer.vertex(matrix, x + r, y - r, 0f).texture(1f, 1f).color(cr, cg, cb, ca);
        BufferRenderer.drawWithGlobalProgram(buffer.end());
    }

    private static int setAlpha(int rgb, int alpha) {
        return (rgb & 0x00FFFFFF) | (MathHelper.clamp(alpha, 0, 255) << 24);
    }
}

package fun.crickclient.api.utils.render.blur;

import com.mojang.blaze3d.systems.ProjectionType;
import com.mojang.blaze3d.systems.RenderSystem;
import lombok.Getter;
import lombok.Setter;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.gl.GlUniform;
import net.minecraft.client.gl.ShaderProgram;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.gl.SimpleFramebuffer;
import net.minecraft.client.render.*;
import org.joml.Matrix4f;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;
import fun.crickclient.api.QClient;
import fun.crickclient.api.utils.render.ShaderUtils;

/**
 * Kawase-blur для стеклянного фона HUD.
 * <p>
 * Считается в пониженном разрешении (1/2 или 1/4) и двумя итерациями —
 * визуально почти как полный 4-проходный блюр, но на порядок дешевле.
 * После каждой сборки обязательно возвращает основной FBO, шейдер и viewport,
 * иначе ванильный рендер рисует «шахматные» квадраты на весь экран.
 */
public class BlurProgram implements QClient {

    private static BlurProgram instance;

    @Getter
    private static Framebuffer buffer1;
    @Getter
    private static Framebuffer buffer2;

    private int lastWidth = -1;
    private int lastHeight = -1;
    private int lastDivisor = -1;
    private long lastUpdateTime = 0;
    private boolean requestedThisFrame = false;
    private Framebuffer resultBuffer;

    @Setter
    private float blurOffset = 1.0f;

    private static final int ITERATIONS = 2;
    private static final long MIN_UPDATE_INTERVAL_MS = 22L;

    public static BlurProgram getInstance() {
        if (instance == null) {
            instance = new BlurProgram();
        }
        return instance;
    }

    public void beginFrame() {
        boolean shouldDraw = requestedThisFrame;
        requestedThisFrame = false;
        if (!shouldDraw) {
            return;
        }
        draw();
    }

    public void request() {
        requestedThisFrame = true;
    }

    /** Сбрасывает отложенный проход — нужно при выключении HUD, чтобы не гонять kawase вхолостую. */
    public void cancel() {
        requestedThisFrame = false;
    }

    public boolean isRequested() {
        return requestedThisFrame;
    }

    private void draw() {
        long currentTime = System.currentTimeMillis();
        if (currentTime - lastUpdateTime < MIN_UPDATE_INTERVAL_MS) {
            return;
        }
        lastUpdateTime = currentTime;

        int srcWidth = mc.getWindow().getFramebufferWidth();
        int srcHeight = mc.getWindow().getFramebufferHeight();
        if (srcWidth <= 0 || srcHeight <= 0) {
            return;
        }

        int divisor = chooseDivisor(srcHeight);
        int width = Math.max(2, srcWidth / divisor);
        int height = Math.max(2, srcHeight / divisor);

        Matrix4f savedProjection = new Matrix4f(RenderSystem.getProjectionMatrix());
        int savedFbo = GL11.glGetInteger(GL30.GL_FRAMEBUFFER_BINDING);
        int[] savedViewport = new int[4];
        GL11.glGetIntegerv(GL11.GL_VIEWPORT, savedViewport);

        try {
            if (buffer1 == null || buffer2 == null || lastWidth != width || lastHeight != height || lastDivisor != divisor) {
                if (buffer1 != null) {
                    buffer1.delete();
                }
                if (buffer2 != null) {
                    buffer2.delete();
                }
                buffer1 = new SimpleFramebuffer(width, height, false);
                buffer2 = new SimpleFramebuffer(width, height, false);

                setLinearFiltering(buffer1);
                setLinearFiltering(buffer2);

                lastWidth = width;
                lastHeight = height;
                lastDivisor = divisor;
            }

            float scaledWidth = Math.max(1, mc.getWindow().getScaledWidth());
            float scaledHeight = Math.max(1, mc.getWindow().getScaledHeight());
            RenderSystem.setProjectionMatrix(
                    new Matrix4f().setOrtho(0.0f, scaledWidth, scaledHeight, 0.0f, 1000.0f, 3000.0f),
                    ProjectionType.ORTHOGRAPHIC
            );

            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            RenderSystem.disableDepthTest();
            RenderSystem.depthMask(false);
            RenderSystem.disableCull();

            ShaderProgram kawaseDown = mc.getShaderLoader().getOrCreateProgram(ShaderUtils.kawaseDown);
            ShaderProgram kawaseUp = mc.getShaderLoader().getOrCreateProgram(ShaderUtils.kawaseUp);
            if (kawaseDown == null || kawaseUp == null) {
                return;
            }

            buffer1.setClearColor(0, 0, 0, 0);
            buffer1.clear();
            buffer1.beginWrite(true);

            RenderSystem.setShader(ShaderUtils.kawaseDown);
            RenderSystem.setShaderTexture(0, mc.getFramebuffer().getColorAttachment());
            setKawaseUniforms(kawaseDown, srcWidth, srcHeight);
            drawQuad(scaledWidth, scaledHeight);
            buffer1.endWrite();

            Framebuffer[] buffers = new Framebuffer[]{buffer1, buffer2};

            for (int i = 1; i < ITERATIONS; i++) {
                int srcIndex = (i + 1) % 2;
                int dstIndex = i % 2;

                Framebuffer src = buffers[srcIndex];
                Framebuffer dst = buffers[dstIndex];

                dst.setClearColor(0, 0, 0, 0);
                dst.clear();
                dst.beginWrite(true);

                RenderSystem.setShader(ShaderUtils.kawaseDown);
                RenderSystem.setShaderTexture(0, src.getColorAttachment());
                setKawaseUniforms(kawaseDown, src.textureWidth, src.textureHeight);
                drawQuad(scaledWidth, scaledHeight);
                dst.endWrite();
            }

            Framebuffer lastWritten = ITERATIONS <= 1 ? buffer1 : buffers[(ITERATIONS - 1) % 2];
            for (int i = 0; i < ITERATIONS; i++) {
                Framebuffer src = lastWritten;
                Framebuffer dst = src == buffer1 ? buffer2 : buffer1;

                dst.setClearColor(0, 0, 0, 0);
                dst.clear();
                dst.beginWrite(true);

                RenderSystem.setShader(ShaderUtils.kawaseUp);
                RenderSystem.setShaderTexture(0, src.getColorAttachment());
                setKawaseUniforms(kawaseUp, src.textureWidth, src.textureHeight);
                drawQuad(scaledWidth, scaledHeight);
                dst.endWrite();
                lastWritten = dst;
            }
            resultBuffer = lastWritten;
        } catch (Throwable ignored) {
        } finally {
            restoreAfterPass(savedProjection, savedFbo, savedViewport);
        }
    }

    private static int chooseDivisor(int framebufferHeight) {
        if (framebufferHeight >= 2160) {
            return 4;
        }
        if (framebufferHeight >= 1440) {
            return 3;
        }
        return 2;
    }

    private void restoreAfterPass(Matrix4f savedProjection, int savedFbo, int[] savedViewport) {
        try {
            mc.getFramebuffer().beginWrite(true);
        } catch (Throwable ignored) {
            GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER, savedFbo);
            if (savedViewport[2] > 0 && savedViewport[3] > 0) {
                GL11.glViewport(savedViewport[0], savedViewport[1], savedViewport[2], savedViewport[3]);
            }
        }
        RenderSystem.setProjectionMatrix(savedProjection, ProjectionType.ORTHOGRAPHIC);
        RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
        RenderSystem.setShaderTexture(0, 0);
        RenderSystem.setShaderTexture(1, 0);
        RenderSystem.setShaderColor(1f, 1f, 1f, 1f);
        RenderSystem.enableCull();
        RenderSystem.enableDepthTest();
        RenderSystem.depthMask(true);
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableBlend();
        RenderSystem.colorMask(true, true, true, true);
    }

    private void setLinearFiltering(Framebuffer framebuffer) {
        RenderSystem.bindTexture(framebuffer.getColorAttachment());
        GL30.glTexParameteri(GL30.GL_TEXTURE_2D, GL30.GL_TEXTURE_MIN_FILTER, GL30.GL_LINEAR);
        GL30.glTexParameteri(GL30.GL_TEXTURE_2D, GL30.GL_TEXTURE_MAG_FILTER, GL30.GL_LINEAR);
        RenderSystem.bindTexture(0);
    }

    private void setKawaseUniforms(ShaderProgram shader, int texWidth, int texHeight) {
        GlUniform resolutionUniform = shader.getUniform("Resolution");
        GlUniform offsetUniform = shader.getUniform("Offset");
        GlUniform saturationUniform = shader.getUniform("Saturation");
        GlUniform tintIntensityUniform = shader.getUniform("TintIntensity");
        GlUniform tintColorUniform = shader.getUniform("TintColor");

        if (resolutionUniform != null) resolutionUniform.set(1.0f / Math.max(1, texWidth), 1.0f / Math.max(1, texHeight));
        if (offsetUniform != null) offsetUniform.set(blurOffset);
        if (saturationUniform != null) saturationUniform.set(1.0f);
        if (tintIntensityUniform != null) tintIntensityUniform.set(0.0f);
        if (tintColorUniform != null) tintColorUniform.set(1.0f, 1.0f, 1.0f);
    }

    private void drawQuad(float width, float height) {
        BufferBuilder builder = Tessellator.getInstance().begin(VertexFormat.DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
        builder.vertex(0, 0, 0).texture(0, 1).color(1f, 1f, 1f, 1f);
        builder.vertex(0, height, 0).texture(0, 0).color(1f, 1f, 1f, 1f);
        builder.vertex(width, height, 0).texture(1, 0).color(1f, 1f, 1f, 1f);
        builder.vertex(width, 0, 0).texture(1, 1).color(1f, 1f, 1f, 1f);
        BufferRenderer.drawWithGlobalProgram(builder.end());
    }

    public static int getTexture() {
        getInstance().request();
        Framebuffer result = getInstance().resultBuffer != null ? getInstance().resultBuffer : buffer1;
        return result != null ? result.getColorAttachment() : 0;
    }
}

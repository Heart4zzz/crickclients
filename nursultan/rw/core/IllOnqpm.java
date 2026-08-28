package rw.core;

import KDFzREm.NNBj;
import KDFzREm.NNuU;
import com.mojang.blaze3d.opengl.GlStateManager;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;
import org.lwjgl.stb.STBImage;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import rw.api.Iface0672;

public class IllOnqpm implements Iface0672 {
   private static String[] f1000;
   private static boolean[] f2000;
   private static boolean[] f3000;
   public Object[] f4000;
   public static Object[] f5000;
   private static boolean[] f6000;
   private static boolean[] f7000;

   private static void m2000() {
      f1000 = new String[]{"Failed to load texture: {}"};
   }

   public IllOnqpm(String var1) {
      this(var1, 9729);
   }

   public IllOnqpm(String var1, int var2) {
      this.m12000();
      this.f4000[1] = var1;
      ByteBuffer var3 = null;
      ByteBuffer var4 = null;
      int var5 = f6000[0];
      int var6 = f6000[1];

      try {
         MemoryStack var7 = MemoryStack.stackPush();

         try (InputStream var8 = this.m20000()) {
            byte[] var9 = IOUtils.toByteArray(var8);
            var3 = MemoryUtil.memAlloc(var9.length);
            var3.put(var9).flip();
            IntBuffer var10 = var7.mallocInt(1);
            IntBuffer var11 = var7.mallocInt(1);
            IntBuffer var12 = var7.mallocInt(1);
            var4 = STBImage.stbi_load_from_memory(var3, var10, var11, var12, 4);
            if (var4 == null) {
               throw new IllegalStateException("Failed to decode image " + var1 + ": " + STBImage.stbi_failure_reason());
            }

            var5 = GL11.glGenTextures();
            var6 = GL11.glGetInteger(32873);
            GlStateManager._bindTexture(var5);
            GlStateManager._texParameter(3553, 10240, var2);
            GlStateManager._texParameter(3553, 10241, var2);
            GlStateManager._texParameter(3553, 10242, 33071);
            GlStateManager._texParameter(3553, 10243, 33071);
            GlStateManager._pixelStore(3314, 0);
            GlStateManager._pixelStore(3316, 0);
            GlStateManager._pixelStore(3315, 0);
            GlStateManager._pixelStore(3317, 1);
            GL11.glTexImage2D(3553, 0, 32856, var10.get(0), var11.get(0), 0, 6408, 5121, var4);
         } catch (Throwable var29) {
            if (var7 != null) {
               try {
                  var7.close();
               } catch (Throwable var26) {
                  var29.addSuppressed(var26);
               }
            }

            throw var29;
         }

         if (var7 != null) {
            var7.close();
         }
      } catch (RuntimeException | IOException var30) {
         ((Logger)f5000[0]).error(f1000[0], var1, var30);
         if (var5 != 0) {
            GL11.glDeleteTextures(var5);
            var5 = 0;
         }
      } finally {
         if (var4 != null) {
            STBImage.stbi_image_free(var4);
         }

         if (var3 != null) {
            MemoryUtil.memFree(var3);
         }

         if (var5 != 0) {
            GlStateManager._bindTexture(var6);
         }
      }

      Integer var19 = var5;
      this.f4000[0] = var19;
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      f5000 = new Object[]{null};
   }

   private void m12000() {
      if (this.f4000 == null) {
         this.f4000 = new Object[2];
         Object[] var1 = this.f4000;
         var1[0] = 0;
      }
   }

   private static void m16000() {
      f6000 = new boolean[]{false, false};
      f7000 = new boolean[]{true, true, true};
      f2000 = new boolean[]{false, false, false, true, false, false};
      f3000 = new boolean[]{false, false, false, false, false, false, true};
   }

   public InputStream m20000() throws IOException {
      return ((NNBj)NNuU.Nq().Nm().method_14486(rw.setting.C0161.m38000((String)this.f4000[1])).orElseThrow()).method_14482();
   }

   public int m24000() {
      return (Integer)this.f4000[0];
   }
}

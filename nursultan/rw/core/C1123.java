package rw.core;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL12;
import org.lwjgl.stb.STBImage;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import rw.data.Rec0245;
import rw.data.Rec0250;

public class C1123 {
   private static String[] f1000;
   private static float[] f2000;
   public static Object[] f3000;

   private static void m6000() {
      f3000 = new Object[]{null};
   }

   private static Rec0245 m8000(String var0) {
      byte[] var1;
      try (InputStream var2 = rw.setting.C0161.m6000(var0).method_14482()) {
         var1 = IOUtils.toByteArray(var2);
      } catch (Exception var24) {
         throw new IllegalStateException("Failed to read icon atlas image: " + var0, var24);
      }

      ByteBuffer var25 = MemoryUtil.memAlloc(var1.length);
      ByteBuffer var3 = null;

      Rec0245 var11;
      try {
         MemoryStack var4 = MemoryStack.stackPush();

         try {
            var25.put(var1).flip();
            IntBuffer var5 = var4.mallocInt(1);
            IntBuffer var6 = var4.mallocInt(1);
            IntBuffer var7 = var4.mallocInt(1);
            var3 = STBImage.stbi_load_from_memory(var25, var5, var6, var7, 4);
            if (var3 == null) {
               throw new IllegalStateException("Failed to decode icon atlas image '" + var0 + "': " + STBImage.stbi_failure_reason());
            }

            int var8 = var5.get(0);
            int var9 = var6.get(0);
            byte[] var10 = new byte[var8 * var9 * 4];
            var3.get(var10);
            var11 = new Rec0245(var8, var9, var10);
         } catch (Throwable var22) {
            if (var4 != null) {
               try {
                  var4.close();
               } catch (Throwable var19) {
                  var22.addSuppressed(var19);
               }
            }

            throw var22;
         }

         if (var4 != null) {
            var4.close();
         }
      } finally {
         if (var3 != null) {
            STBImage.stbi_image_free(var3);
         }

         MemoryUtil.memFree(var25);
      }

      return var11;
   }

   private C1123() {
      throw new UnsupportedOperationException(f1000[2]);
   }

   static {
      ntfClinit();
   }

   private static Map<String, Integer> m16000(String var0) {
      Map var1 = rw.setting.C0161.m34000(rw.setting.C0161.m38000(var0), new C1121());
      if (var1 != null && !var1.isEmpty()) {
         return var1;
      } else {
         throw new IllegalStateException("Icon atlas names map invalid or empty: " + var0);
      }
   }

   private static C1110 m26000(String var0) {
      C1110 var1 = rw.setting.C0161.m36000(rw.setting.C0161.m38000(var0), C1110.class);
      if (var1 != null && var1.f2000 != null && var1.f1000 != null) {
         return var1;
      } else {
         throw new IllegalStateException("Icon atlas layout invalid or empty: " + var0);
      }
   }

   private static void m28000() {
      f1000 = new String[]{
         "Icon '{}' (codepoint {}) is missing from atlas layout — skipping",
         "Failed to allocate GL texture for icon atlas",
         "This is a utility class and cannot be instantiated"
      };
   }

   private static Map<String, Rec0250> m32000(C1110 var0, Map<String, Integer> var1) {
      HashMap var2 = new HashMap(var0.f1000.size());
      float var3 = var0.f2000.f3000;
      float var4 = var0.f2000.f2000;

      for (C1125 var6 : var0.f1000) {
         if (var6.f3000 != null) {
            float var7 = var6.f3000.f3000 / var3;
            float var8 = var6.f3000.f2000 / var3;
            float var9 = var6.f3000.f4000 / var4;
            float var10 = var6.f3000.f1000 / var4;
            float var11 = var6.f1000 == null ? f2000[0] : var6.f1000.f4000 - var6.f1000.f2000;
            float var12 = var6.f1000 == null ? f2000[1] : Math.abs(var6.f1000.f3000 - var6.f1000.f1000);
            var2.put(var6.f2000, new Rec0250(var7, var9, var8, var10, var11, var12));
         }
      }

      HashMap var13 = new HashMap(var1.size());

      for (Entry var15 : var1.entrySet()) {
         Rec0250 var16 = (Rec0250)var2.get(var15.getValue());
         if (var16 == null) {
            ((Logger)f3000[0]).warn(f1000[0], var15.getKey(), var15.getValue());
         } else {
            var13.put((String)var15.getKey(), var16);
         }
      }

      return var13;
   }

   private static int m34000(Rec0245 var0) {
      int var1 = GL12.glGenTextures();
      if (var1 == 0) {
         throw new IllegalStateException(f1000[1]);
      } else {
         ByteBuffer var2 = MemoryUtil.memAlloc(var0.f2000.length);

         try {
            var2.put(var0.f2000).flip();
            int var3 = GL12.glGetInteger(32873);
            GlStateManager._bindTexture(var1);
            GlStateManager._texParameter(3553, 10240, 9729);
            GlStateManager._texParameter(3553, 10241, 9729);
            GlStateManager._texParameter(3553, 10242, 33071);
            GlStateManager._texParameter(3553, 10243, 33071);
            GlStateManager._pixelStore(3314, 0);
            GlStateManager._pixelStore(3316, 0);
            GlStateManager._pixelStore(3315, 0);
            GlStateManager._pixelStore(3317, 1);
            GL12.glTexImage2D(3553, 0, 32856, var0.f3000, var0.f1000, 0, 6408, 5121, var2);
            GlStateManager._bindTexture(var3);
         } finally {
            MemoryUtil.memFree(var2);
         }

         return var1;
      }
   }

   public static C1112 m36000(String var0) {
      C1110 var1 = m26000(var0 + ".json");
      Map var2 = m16000(var0 + ".names.json");
      Map var3 = m32000(var1, var2);
      Rec0245 var4 = m8000(var0 + ".png");
      int var5 = m34000(var4);
      return new C1112(var5, var4.f3000, var4.f1000, var1.f2000.f1000, var3);
   }

   private static void m40000() {
      f2000 = new float[]{1.0F, 1.0F};
   }
}

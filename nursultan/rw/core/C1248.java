package rw.core;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.nio.ByteBuffer;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.MemoryStack;
import rw.api.Iface0672;

public class C1248 implements Iface0672 {
   public Object[] f1000;
   public static Object[] f2000;
   private static boolean[] f3000;
   private static boolean[] f4000;
   private static String[] f5000;
   private static boolean[] f6000;

   private static void m6000() {
      f2000 = new Object[]{null};
   }

   public C1248() {
      this.m14000();
      int var1 = 0;
      int var2 = 0;

      try {
         MemoryStack var3 = MemoryStack.stackPush();

         try {
            ByteBuffer var4 = var3.malloc(4);
            var4.put((byte)-1).put((byte)-1).put((byte)-1).put((byte)-1).flip();
            var1 = GL11.glGenTextures();
            var2 = GL11.glGetInteger(32873);
            GlStateManager._bindTexture(var1);
            GlStateManager._texParameter(3553, 10240, 9729);
            GlStateManager._texParameter(3553, 10241, 9729);
            GlStateManager._texParameter(3553, 10242, 33071);
            GlStateManager._texParameter(3553, 10243, 33071);
            GlStateManager._pixelStore(3314, 0);
            GlStateManager._pixelStore(3316, 0);
            GlStateManager._pixelStore(3315, 0);
            GlStateManager._pixelStore(3317, 1);
            GL11.glTexImage2D(3553, 0, 32856, f6000[0], f6000[1], f6000[2], 6408, 5121, var4);
         } catch (Throwable var17) {
            if (var3 != null) {
               try {
                  var3.close();
               } catch (Throwable var16) {
                  var17.addSuppressed(var16);
               }
            }

            throw var17;
         }

         if (var3 != null) {
            var3.close();
         }
      } catch (Exception var18) {
         ((Logger)f2000[0]).error(f5000[0], var18);
         if (var1 != 0) {
            GL11.glDeleteTextures(var1);
            var1 = f6000[3];
         }

         throw new RuntimeException(var18);
      } finally {
         if (var1 != 0) {
            GlStateManager._bindTexture(var2);
         }
      }

      Integer var11 = var1;
      this.f1000[0] = var11;
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f3000 = new boolean[]{false, false, false, false, false, true, false};
      f6000 = new boolean[]{true, true, false, false, false, true, false};
      f4000 = new boolean[]{false, true};
   }

   private void m14000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[f6000[5]];
         Object[] var1 = this.f1000;
         var1[f6000[6]] = 0;
      }
   }

   public int m26000() {
      return (Integer)this.f1000[0];
   }

   private static void m30000() {
      f5000 = new String[]{"Failed to create blank texture"};
   }
}

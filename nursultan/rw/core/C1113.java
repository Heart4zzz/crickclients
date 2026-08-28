package rw.core;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL12;
import org.lwjgl.opengl.GL33;
import rw.api.Iface0637;

public class C1113 implements Iface0637 {
   private static short[] f1000;
   private static short[] f2000;
   private static short[] f3000;
   private static short[] f4000;
   private static short[] f5000;
   private static short[] f6000;
   private static short[] f7000;
   private static short[] f8000;
   private static short[] f9000;

   private static void m4000() {
      f2000 = new short[]{3553, 10240, 9729, 3553, 10241};
      f9000 = new short[]{9729, 3553, 10242, 3553, 10243};
      f7000 = new short[]{3553, 3553, 3553, 3553};
      f4000 = new short[]{3553, 6403, 3314, 3316, 3315, 3317, 3553};
      f1000 = new short[]{6403, 5121, 3553, 6403, 5121};
      f6000 = new short[]{3553, 10240};
      f8000 = new short[]{9729, 3553, 10241};
      f5000 = new short[]{9729, 3553, 10242, 3553, 10243};
      f3000 = new short[]{3314, 3316, 3315, 3317, 3553, 6408, 5121};
   }

   C1113() {
   }

   static {
      ntfClinit();
   }

   public int m14000(int var1, int var2, ByteBuffer var3) {
      int var4 = GL33.glGenTextures();
      if (var4 == 0) {
         return 0;
      } else {
         int var5 = GL33.glGetInteger(32873);
         GlStateManager._bindTexture(var4);
         GlStateManager._texParameter(3553, 10240, f8000[0]);
         GlStateManager._texParameter(f8000[1], f8000[2], 9729);
         GlStateManager._texParameter(3553, 10242, 33071);
         GlStateManager._texParameter(3553, 10243, 33071);
         GlStateManager._pixelStore(3314, 0);
         GlStateManager._pixelStore(3316, 0);
         GlStateManager._pixelStore(3315, 0);
         GlStateManager._pixelStore(3317, 1);
         GL33.glTexImage2D(3553, 0, 32856, var1, var2, 0, 6408, 5121, var3);
         GlStateManager._bindTexture(var5);
         return var4;
      }
   }

   public int m16000() {
      int var1 = GL33.glGenTextures();
      if (var1 == 0) {
         return 0;
      } else {
         int var2 = GL33.glGetInteger(32873);
         GlStateManager._bindTexture(var1);
         GlStateManager._texParameter(3553, 10240, 9729);
         GlStateManager._texParameter(3553, 10241, 9729);
         GlStateManager._texParameter(3553, 10242, 33071);
         GlStateManager._texParameter(3553, 10243, 33071);
         GlStateManager._texParameter(3553, 32882, 33071);
         GlStateManager._texParameter(3553, 36418, 1);
         GlStateManager._texParameter(3553, 36419, 1);
         GlStateManager._texParameter(3553, 36420, 1);
         GlStateManager._texParameter(3553, 36421, 6403);
         GlStateManager._bindTexture(var2);
         return var1;
      }
   }

   public void m18000(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, ByteBuffer var9) {
      int var10 = GL33.glGetInteger(32873);
      GlStateManager._bindTexture(var1);
      GlStateManager._pixelStore(3314, 0);
      GlStateManager._pixelStore(3316, 0);
      GlStateManager._pixelStore(3315, 0);
      GlStateManager._pixelStore(3317, 1);
      if (var8) {
         GL33.glTexImage2D(3553, 0, 33321, var6, var7, 0, 6403, 5121, var9);
      } else {
         GL12.glTexSubImage2D(3553, 0, var2, var3, var4, var5, 6403, 5121, var9);
      }

      GlStateManager._bindTexture(var10);
   }
}

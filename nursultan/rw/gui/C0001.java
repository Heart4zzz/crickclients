package rw.gui;

import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.ScissorState;
import java.nio.ByteBuffer;
import java.nio.file.Path;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;
import rw.core.C0267;
import rw.core.C0272;
import rw.data.Rec0071;

public class C0001 {
   public Object[] f1000;
   private static short[] f2000;
   private static short[] f3000;
   private static float[] f4000;
   private static short[] f5000;
   private static String[] f6000;
   private static short[] f7000;
   private static short[] f8000;
   private static short[] f9000;
   public Object[] f10000;
   private static short[] f11000;
   private static short[] f12000;
   private static short[] f13000;
   private static short[] f14000;
   private static short[] f15000;
   private static double[] f16000;
   private static short[] f17000;
   public static Object[] f18000;

   public float m2000() {
      return (Float)this.f10000[0];
   }

   public int m8000() {
      return ((C0272)this.f1000[0]).m14000();
   }

   private static void m10000() {
      f16000 = new double[]{0.0};
   }

   public C0001(C0272 var1, int var2, float var3, Path var4) {
      this.m30000();
      Long var9 = System.currentTimeMillis();
      this.f10000[5] = var9;
      this.f1000[0] = var1;
      Integer var11 = var2;
      this.f1000[1] = var11;
      Float var12 = var3;
      this.f10000[0] = var12;
      this.f10000[1] = var4;
   }

   static {
      ntfClinit();
   }

   private void m14000() {
      if (!(Boolean)this.f10000[7] && (Path)this.f10000[1] != null && (Boolean)this.f10000[6]) {
         if (System.currentTimeMillis() - (Long)this.f10000[5] >= 2000L) {
            Boolean var6 = true;
            this.f10000[7] = var6;

            try {
               ((C0272)this.f1000[0]).m52000((Path)this.f10000[1]);
            } catch (Exception var7) {
               ((Logger)f18000[0]).warn(f6000[0], (Path)this.f10000[1], var7.toString());
            }
         }
      }
   }

   private static void m18000() {
      f6000 = new String[]{"Font atlas cache save failed ({}): {}"};
   }

   public void m22000() {
      ((C0272)this.f1000[0]).m24000();
   }

   private static void m26000() {
      f5000 = new short[]{5, 0, 1, 0, 1};
      f15000 = new short[]{1, 0, 0, 0, 0, 0};
      f12000 = new short[]{0, 0, 0, 0, 0, 2};
      f2000 = new short[]{0, 2, 2, 0};
      f3000 = new short[]{0, 0, 2};
      f7000 = new short[]{3317, 3, 4, 3314, 3316, 3315, 3553, 6408};
      f8000 = new short[]{5121, 3, 4, 3314};
      f14000 = new short[]{3316, 3315, 3553, 6408, 5121, 3314, 3316};
      f13000 = new short[]{3315, 6, 5, 7, 1};
      f9000 = new short[]{6, 5, 7, 0, 1, 0, 1, 2};
      f11000 = new short[]{2, 3553, 10240, 9729};
      f17000 = new short[]{3553, 10241, 9729, 3553, 10242, 3553, 10243, 0};
   }

   private void m30000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[2];
         Object[] var1 = this.f1000;
         var1[1] = 0;
      }

      if (this.f10000 == null) {
         this.f10000 = new Object[8];
         Object[] var2 = this.f10000;
         var2[0] = f4000[0];
         var2[2] = 0;
         var2[3] = 0;
         var2[4] = 0;
         var2[5] = 0L;
         var2[6] = false;
         var2[7] = false;
      }
   }

   private static void m32000() {
      f18000 = new Object[]{null, 2000L};
   }

   private static void m38000() {
      f4000 = new float[]{0.0F};
   }

   public int m44000() {
      return ((C0272)this.f1000[0]).m30000();
   }

   public boolean m46000(int var1) {
      return ((C0272)this.f1000[0]).m4000(var1);
   }

   public int m48000() {
      return (Integer)this.f1000[1];
   }

   public float m52000(float var1) {
      return (float)(((C0272)this.f1000[0]).m26000().m8000() * var1);
   }

   private void m54000() {
      Integer var6 = GL11.glGenTextures();
      this.f10000[2] = var6;
      int var1 = GL11.glGetInteger(32873);
      GlStateManager._bindTexture((Integer)this.f10000[2]);
      GlStateManager._texParameter(3553, 10240, 9729);
      GlStateManager._texParameter(3553, 10241, 9729);
      GlStateManager._texParameter(3553, 10242, 33071);
      GlStateManager._texParameter(3553, 10243, 33071);
      GlStateManager._bindTexture(var1);
   }

   public boolean m56000(int var1, float var2, C0267 var3) {
      return ((C0272)this.f1000[0]).m72000(var1, var2, var3);
   }

   public float m58000(int var1, float var2) {
      return (float)(((C0272)this.f1000[0]).m34000(var1) * var2);
   }

   public void m62000(int var1) {
      ((C0272)this.f1000[0]).m60000(var1);
   }

   public float m64000(float var1) {
      Rec0071 var2 = ((C0272)this.f1000[0]).m26000();
      double var3 = var2.m2000();
      if (var3 <= f16000[0]) {
         var3 = var2.m8000() - var2.m6000();
      }

      return (float)(var3 * var1);
   }

   public float m66000(int var1, int var2, float var3) {
      return (float)(((C0272)this.f1000[0]).m64000(var1, var2) * var3);
   }

   public void m68000() {
      ScissorState var1 = lOlImjp<"opzjpx",-780440770,794843425,794843429,794843426,-780440770>((C0272)this.f1000[0]);
      if (!lOlImjp<"sfhdfl",-780440770,794843427,794843429,794843436,-780440770>(var1) && (Integer)this.f10000[2] != 0) {
         this.m14000();
      } else {
         if ((Integer)this.f10000[2] == 0) {
            this.m54000();
         }

         int var2 = ((C0272)this.f1000[0]).m30000();
         int var3 = ((C0272)this.f1000[0]).m14000();
         ByteBuffer var4 = ((C0272)this.f1000[0]).m2000();
         int var5 = GL11.glGetInteger(32873);
         GlStateManager._bindTexture((Integer)this.f10000[2]);
         GL11.glPixelStorei(3317, 4);
         int var6 = !lOlImjp<"lsqujq",-780440770,794843427,794843437,794843436,-780440770>(var1) && this.f10000[3] == var2 && this.f10000[4] == var3 ? 0 : 1;
         if (var6 != 0) {
            GL11.glPixelStorei(3314, 0);
            GL11.glPixelStorei(3316, 0);
            GL11.glPixelStorei(3315, 0);
            GL11.glTexImage2D(3553, 0, 32856, var2, var3, 0, 6408, f8000[0], var4);
            Integer var14 = var2;
            this.f10000[f8000[1]] = var14;
            Integer var15 = var3;
            this.f10000[f8000[2]] = var15;
         } else {
            GL11.glPixelStorei(f8000[3], var2);

            for (int var7 = 0; var7 < lOlImjp<"tjsrk",-780440770,794843427,794843394,794843432,1695674232>(var1); var7++) {
               int var8 = lOlImjp<"tjsrk",-780440770,794843427,794843429,794843443,1695674232>(var1, var7);
               int var9 = lOlImjp<"mfnm",-780440770,794843427,794843437,794843443,1695674232>(var1, var7);
               GL11.glPixelStorei(3316, var8);
               GL11.glPixelStorei(3315, var9);
               GL11.glTexSubImage2D(
                  3553,
                  0,
                  var8,
                  var9,
                  lOlImjp<"mfnm",-780440770,794843427,794843445,794843443,1695674232>(var1, var7),
                  lOlImjp<"bjugkov",-780440770,794843427,794843431,794843443,1695674232>(var1, var7),
                  6408,
                  5121,
                  var4
               );
            }

            GL11.glPixelStorei(3314, 0);
            GL11.glPixelStorei(3316, 0);
            GL11.glPixelStorei(3315, 0);
         }

         GlStateManager._bindTexture(var5);
         Boolean var16 = true;
         this.f10000[6] = var16;
         Long var17 = System.currentTimeMillis();
         this.f10000[5] = var17;
      }
   }

   public int m76000() {
      this.m68000();
      return (Integer)this.f10000[2];
   }
}

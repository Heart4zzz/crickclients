package rw.core;

import com.mojang.blaze3d.opengl.GlStateManager;
import org.lwjgl.opengl.GL33;

public class C1240 implements AutoCloseable {
   public static Object[] f1000;
   private static short[] f2000;
   private static short[] f3000;
   public static Object[] f4000;
   private static short[] f5000;
   private static short[] f6000;
   private static short[] f7000;
   public static Object[] f8000;
   private static short[] f9000;
   private static short[] f10000;
   private static short[] f11000;

   private static void m2000() {
      f5000 = new short[]{5, 1, 2, 1, 0};
      f6000 = new short[]{2, 3, 5, 4, 3, 7, 0};
      f2000 = new short[]{1, 2, 3089, 6};
      f7000 = new short[]{3088, 4, 6, 3089, 0, 0};
      f9000 = new short[]{5, 2, 7};
      f3000 = new short[]{0, 1, 2, 3, 3, 4};
      f10000 = new short[]{5, 1, 1, 1, 2, 1, 0};
      f11000 = new short[]{4, 4, 4, 4, 6, 3089, 3089};
   }

   private C1240() {
   }

   static {
      ntfClinit();
   }

   public void m12000() {
      if ((Boolean)f8000[5]) {
         if ((Boolean)f4000[2]) {
            GlStateManager._enableBlend();
         } else {
            GlStateManager._disableBlend();
         }

         GlStateManager._blendFuncSeparate((Integer)f4000[7], (Integer)f1000[0], (Integer)f1000[1], (Integer)f1000[2]);
         if ((Boolean)f4000[3]) {
            GlStateManager._enableDepthTest();
         } else {
            GlStateManager._disableDepthTest();
         }

         GlStateManager._depthFunc((Integer)f1000[3]);
         GlStateManager._depthMask((Boolean)f4000[4]);
         if ((Boolean)f4000[5]) {
            GlStateManager._enableCull();
         } else {
            GlStateManager._disableCull();
         }

         if ((Integer)f8000[1] == 0 || GL33.glIsProgram((Integer)f8000[1])) {
            GL33.glUseProgram((Integer)f8000[1]);
         }

         GL33.glBindVertexArray((Integer)f8000[2]);
         GlStateManager._activeTexture((Integer)f4000[1]);
         GlStateManager._bindTexture((Integer)f4000[0]);
         GL33.glScissor(((int[])f1000[4])[0], ((int[])f1000[4])[1], ((int[])f1000[4])[2], ((int[])f1000[4])[3]);
         if ((Boolean)f4000[6]) {
            GL33.glEnable(3089);
         } else {
            GL33.glDisable(3089);
         }
      }
   }

   public static C1240 m20000() {
      Boolean var4 = true;
      f1000[f5000[0]] = var4;
      Integer var5 = GL33.glGetInteger(35725);
      f8000[f5000[1]] = var5;
      Integer var6 = GL33.glGetInteger(34229);
      f8000[f5000[2]] = var6;
      Integer var7 = GL33.glGetInteger(34016);
      f4000[f5000[3]] = var7;
      Integer var8 = GL33.glGetInteger(32873);
      f4000[f5000[4]] = var8;
      Boolean var9 = GlStateManager.BLEND.field_5045.field_5051;
      f4000[2] = var9;
      Boolean var10 = GlStateManager.DEPTH.field_5074.field_5051;
      f4000[3] = var10;
      Boolean var11 = GlStateManager.CULL.field_5072.field_5051;
      f4000[5] = var11;
      Boolean var12 = GlStateManager.DEPTH.field_5076;
      f4000[4] = var12;
      Integer var13 = GlStateManager.DEPTH.field_5075;
      f1000[3] = var13;
      Integer var14 = GlStateManager.BLEND.field_5049;
      f4000[7] = var14;
      Integer var15 = GlStateManager.BLEND.field_5048;
      f1000[0] = var15;
      Integer var16 = GlStateManager.BLEND.field_5047;
      f1000[1] = var16;
      Integer var17 = GlStateManager.BLEND.field_5046;
      f1000[2] = var17;
      Boolean var18 = GL33.glIsEnabled(3089);
      f4000[6] = var18;
      GL33.glGetIntegerv(3088, (int[])f1000[4]);
      if ((Boolean)f4000[6]) {
         GL33.glDisable(3089);
      }

      return (C1240)f8000[0];
   }

   public static void m22000() {
      ((C1240)f8000[0]).m12000();
   }

   private static void m26000() {
      f8000 = new Object[]{null, 233, 34};
      f4000 = new Object[]{715, 33984, true, false, true, true, false, 770};
      f1000 = new Object[]{771, 1, 771, 515, null, true};
   }
}

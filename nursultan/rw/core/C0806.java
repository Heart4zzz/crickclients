package rw.core;

import org.joml.Matrix4f;
import org.joml.Vector2fc;
import org.joml.Vector4fc;
import rw.data.Rec0004;
import rw.defs.OlmmOsl;
import rw.gui.IlkOns;
import rw.gui.ZwBs;

public class C0806 {
   private static float[] f1000;
   private static float[] f2000;
   public static Object[] f3000;
   private static String[] f4000;
   private static float[] f5000;
   private static float[] f6000;
   private static float[] f7000;
   private static float[] f8000;
   private static byte[] f9000;
   private static float[] f10000;

   private static void m2000() {
      f8000 = new float[]{0.0F, 0.0F, 0.0F};
      f7000 = new float[]{0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F};
      f10000 = new float[]{0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F};
      f6000 = new float[]{0.0F, 8.0F, 8.0F, 2.0F, 2.0F, 4.0F};
      f5000 = new float[]{2.0F, 4.0F, 1.0F};
      f1000 = new float[]{1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 2.0F};
      f2000 = new float[]{0.0F, 0.0F, 0.0F, 0.0F, 0.0F};
   }

   private static void m6000() {
      f9000 = new byte[]{-1, 2, 4};
   }

   private C0806() {
      throw new UnsupportedOperationException(f4000[1]);
   }

   static {
      ntfClinit();
   }

   public static void m18000(C0830 var0, Matrix4f var1, float var2, float var3, float var4, float var5, float var6, int var7) {
      m50000(var0, var1, var2, var3, var4, var5, var6, f8000[2], f7000[0], f7000[1], f7000[2], var7);
   }

   private static void m22000() {
      f3000 = new Object[]{4, -1442182646};
   }

   public static void m24000(C0830 var0, float var1, float var2, float var3, float var4, float var5, int var6) {
      m50000(var0, (Matrix4f)IlkOns.f9000[3], var1, var2, var3, var4, var5, f10000[0], f10000[1], f10000[2], f10000[3], var6);
   }

   public static void m28000(
      C0830 var0,
      Vector2fc var1,
      Vector2fc var2,
      Vector2fc var3,
      Vector2fc var4,
      int var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      int var12,
      float var13,
      int var14,
      int var15,
      Vector4fc var16,
      Vector4fc var17,
      int var18
   ) {
      m44000(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var13, f2000[4], var12, 0, var14, var15, var16, var17, var18);
   }

   public static void m30000(C0830 var0, Matrix4f var1, float var2, float var3, float var4, int var5) {
      m60000(var0, (Rec0004)C0011.f5000[0]);
      var2 = (float)Math.floor(var2) + f1000[5];
      var3 = (float)Math.floor(var3) + f1000[6];
      float var6 = var4 / f1000[7];
      C0811 var7 = var0.m6000();
      int var8 = var7.m16000();
      var7.m42000(var1, var2, var3 - var6, f2000[0]).m26000(var5).m28000();
      var7.m42000(var1, var2 + var6, var3, f2000[1]).m26000(var5).m28000();
      var7.m42000(var1, var2, var3 + var6, f2000[2]).m26000(var5).m28000();
      var7.m42000(var1, var2 - var6, var3, f2000[3]).m26000(var5).m28000();
      var0.m52000().m18000(var8);
   }

   public static void m32000(C0830 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9) {
      m50000(var0, (Matrix4f)IlkOns.f9000[3], var1, var2, f8000[1], var3, var4, var5, var6, var7, var8, var9);
   }

   public static void m34000(
      C0830 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11
   ) {
      m60000(var0, (Rec0004)C0011.f5000[4]);
      var0.m6000()
         .m30000(var1)
         .m30000(var2)
         .m30000(var3)
         .m30000(var4)
         .m30000(var5)
         .m30000(var6)
         .m30000(var8)
         .m30000(var9)
         .m30000(var7)
         .m26000(var10)
         .m26000(var11)
         .m28000();
   }

   public static void m36000(C0830 var0, float var1, float var2, float var3, float var4, int var5) {
      m38000(var0, (Matrix4f)IlkOns.f9000[3], var1, var2, var3, var4, var5, var5);
   }

   public static void m38000(C0830 var0, Matrix4f var1, float var2, float var3, float var4, float var5, int var6, int var7) {
      m60000(var0, (Rec0004)C0011.f5000[0]);
      C0811 var8 = var0.m6000();
      int var9 = var8.m16000();
      var8.m42000(var1, var2 + var4, var3, f1000[1]).m26000(var6).m28000();
      var8.m42000(var1, var2, var3, f1000[2]).m26000(var6).m28000();
      var8.m42000(var1, var2, var3 + var5, f1000[3]).m26000(var7).m28000();
      var8.m42000(var1, var2 + var4, var3 + var5, f1000[4]).m26000(var7).m28000();
      var0.m52000().m18000(var9);
   }

   public static void m44000(
      C0830 var0,
      Vector2fc var1,
      Vector2fc var2,
      Vector2fc var3,
      Vector2fc var4,
      int var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      int var14,
      int var15,
      int var16,
      int var17,
      Vector4fc var18,
      Vector4fc var19,
      int var20
   ) {
      m60000(var0, (Rec0004)C0011.f5000[5]);
      C0811 var21 = var0.m6000();
      var21.m30000(var1.x())
         .m30000(var1.y())
         .m30000(var2.x() - var1.x())
         .m30000(var2.y() - var1.y())
         .m30000(var4.x() - var1.x())
         .m30000(var4.y() - var1.y())
         .m26000(var5)
         .m30000(var6)
         .m30000(var7)
         .m30000(var8)
         .m30000(var9)
         .m30000(var10)
         .m30000(var11)
         .m30000(var12)
         .m30000(var13)
         .m26000(var14)
         .m26000(var15)
         .m36000(var16)
         .m36000(var17)
         .m36000(var20)
         .m30000(var18.x())
         .m30000(var18.y())
         .m30000(var18.z())
         .m30000(var18.w())
         .m30000(var19.x())
         .m30000(var19.y())
         .m30000(var19.z())
         .m30000(var19.w())
         .m28000();
   }

   public static void m46000(ZwBs var0, String var1, int var2, float var3, float var4) {
      float var5 = var2;
      float var6 = var0.m76000(var5, (OlmmOsl)OlmmOsl.f7000[3], false);
      float var7 = var0.m56000(var1, var5, (OlmmOsl)OlmmOsl.f7000[3], false);
      float var8 = var7 + f6000[1];
      float var9 = var6 + f6000[2];
      float var10 = var3 - var8 / f6000[3];
      float var11 = var4 - var9 / f6000[4];
      var0.m62000(var1)
         .m86000(var10 + f6000[5], var11 + (var9 - var6) / f5000[0])
         .m102000(var5)
         .m98000((OlmmOsl)OlmmOsl.f7000[3])
         .m28000(f9000[0])
         .m50000(-1442182646)
         .m40000(f5000[1])
         .m4000();
   }

   public static void m50000(
      C0830 var0, Matrix4f var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, int var11
   ) {
      m60000(var0, (Rec0004)C0011.f5000[2]);
      C0811 var12 = var0.m6000();
      int var13 = var12.m16000();
      var12.m42000(var1, var2 + var5, var3, var4).m32000(var9, var8).m26000(var11).m28000();
      var12.m42000(var1, var2, var3, var4).m32000(var7, var8).m26000(var11).m28000();
      var12.m42000(var1, var2, var3 + var6, var4).m32000(var7, var10).m26000(var11).m28000();
      var12.m42000(var1, var2 + var5, var3 + var6, var4).m32000(var9, var10).m26000(var11).m28000();
      var0.m52000().m18000(var13);
   }

   public static void m52000(C0830 var0, Matrix4f var1, float var2, float var3, float var4, float var5, float var6, int var7) {
      m50000(var0, var1, var2, var3, var4, var5, var6, f7000[3], f7000[4], f7000[5], f7000[6], var7);
   }

   public static void m54000(C0830 var0, float var1, float var2, float var3, float var4, float var5, int var6) {
      m50000(var0, (Matrix4f)IlkOns.f9000[3], var1, var2, var3, var4, var5, f10000[4], f10000[5], f10000[6], f6000[0], var6);
   }

   public static void m56000(ZwBs var0, String var1, float var2, float var3, float var4, int var5, int var6) {
      var0.m62000(var1).m86000(var2 + f5000[2], var3 + f1000[0]).m102000(var4).m98000((OlmmOsl)OlmmOsl.f7000[3]).m28000(var6).m4000();
      var0.m62000(var1).m86000(var2, var3).m102000(var4).m98000((OlmmOsl)OlmmOsl.f7000[3]).m28000(var5).m4000();
   }

   public static void m58000(
      C0830 var0, Matrix4f var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10
   ) {
      m50000(var0, var1, var2, var3, f8000[0], var4, var5, var6, var7, var8, var9, var10);
   }

   private static void m60000(C0830 var0, Rec0004 var1) {
      if (var0.m64000() != var1) {
         throw new IllegalStateException(f4000[0]);
      }
   }

   public static void m62000(C0830 var0, Matrix4f var1, float var2, float var3, float var4, float var5, int var6) {
      m38000(var0, var1, var2, var3, var4, var5, var6, var6);
   }

   private static void m66000() {
      f4000 = new String[]{"mismatch format", "This is a utility class and cannot be instantiated"};
   }
}

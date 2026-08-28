package rw.core;

import KDFzREm.NNWE;
import KDFzREm.NjL;
import rw.data.Rec0011;

public class C0058 {
   public Object[] f1000;
   private static double[] f2000;
   private static double[] f3000;
   private static float[] f4000;
   private static double[] f5000;
   private static float[] f6000;
   private static float[] f7000;
   private static float[] f8000;
   private static double[] f9000;
   private static float[] f10000;

   private void m6000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[8];
         Object[] var1 = this.f1000;
         var1[0] = 0L;
         var1[1] = f8000[7];
         var1[2] = f7000[0];
         var1[3] = 0;
         var1[4] = 0;
         var1[5] = 0;
         var1[6] = 0;
         var1[7] = 0;
      }
   }

   public C0058() {
      this.m6000();
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f5000 = new double[]{0.035F, 0.16, 0.5, 0.5, 0.54};
      f9000 = new double[]{3.25, 1.72, 0.22, 1.08, 0.58};
      f3000 = new double[]{70.0, 180.0, 190.0, 420.0, 0.46F};
      f2000 = new double[]{0.5, 1.0, 0.9, 2.6};
   }

   private float m22000(float var1, float var2, float var3) {
      if (Math.abs(var2) <= var3 * f8000[5]) {
         return var1;
      } else {
         float var4 = Math.max(var3, Math.abs(var2) - var3 * C0052.m8000(f2000[2], f2000[3]));
         return NNWE.N(var1, -var4, var4);
      }
   }

   private void m24000(long var1, float var3, boolean var4) {
      if (var1 >= (Long)this.f1000[0]) {
         Float var9 = C0052.m8000(-var3 * (var4 ? f6000[7] : f4000[0]), var3 * (var4 ? f4000[1] : f8000[0]));
         this.f1000[1] = var9;
         Float var10 = C0052.m8000(-var3 * (var4 ? f8000[1] : f8000[2]), var3 * (var4 ? f8000[3] : f8000[4]));
         this.f1000[2] = var10;
         Long var11 = var1 + (long)C0052.m8000(var4 ? f3000[0] : f3000[1], var4 ? f3000[2] : f3000[3]);
         this.f1000[0] = var11;
      }
   }

   private float m26000(float var1, float var2, boolean var3, boolean var4) {
      int var6 = Math.max(1, Math.round(var1 / var2));
      int var5 = var3 ? (Integer)this.f1000[5] : (Integer)this.f1000[6];
      if (var6 == var5 && var4 && Math.random() < f3000[4]) {
         int var8 = Math.random() > f2000[0] ? 1 : -1;
         int var9 = var4 ? 3 : 1;
         var6 = Math.max(1, var6 + var8 * Math.max(1, Math.round(C0052.m8000(f2000[1], var9))));
      }

      if (var3) {
         Integer var14 = var6;
         this.f1000[5] = var14;
      } else {
         Integer var15 = var6;
         this.f1000[6] = var15;
      }

      return var6 * var2;
   }

   public void m28000(C0983 var1) {
      Long var6 = 0L;
      this.f1000[0] = var6;
      Float var7 = f10000[0];
      this.f1000[1] = var7;
      Float var8 = f10000[1];
      this.f1000[2] = var8;
      Integer var9 = 0;
      this.f1000[3] = var9;
      Integer var10 = 0;
      this.f1000[4] = var10;
      Integer var11 = 0;
      this.f1000[5] = var11;
      Integer var12 = 0;
      this.f1000[6] = var12;
      Integer var13 = 0;
      this.f1000[7] = var13;
   }

   private int m32000(float var1, float var2) {
      return Math.abs(var1) <= f8000[6] ? 0 : Math.round(var1 / var2);
   }

   public Rec0011 m38000(C0768 var1, NjL var2, C0983 var3, C0983 var4, float var5, float var6, boolean var7, boolean var8, boolean var9) {
      double var10 = C0070.m16000();
      float var12 = (float)Math.max(var10, f5000[0]);
      long var13 = System.currentTimeMillis();
      this.m24000(var13, var12, var7);
      float var15 = C0070.m12000(var3.m38000(), var4.m38000());
      float var16 = var8 ? f10000[2] : var4.m68000() - var3.m68000();
      int var17 = this.m32000(var15, var12);
      int var18 = this.m32000(var16, var12);
      int var10001;
      if (var17 != (Integer)this.f1000[3] || var18 != (Integer)this.f1000[4] || var17 == 0 && var18 == 0) {
         var10001 = 0;
      } else {
         int var10003 = (Integer)this.f1000[7] + 1;
         var10001 = var10003;
         Integer var26 = var10003;
         this.f1000[7] = var26;
      }

      Integer var27 = var10001;
      this.f1000[7] = var27;
      C0983 var19 = var4;
      if ((Integer)this.f1000[7] >= 4 || var7 && (Integer)this.f1000[7] >= 2 || var7 && Math.random() < f5000[1]) {
         var19 = this.m40000(var1, var2, var3, var4, var15, var16, var12, var8, var9, var7);
         var15 = C0070.m12000(var3.m38000(), var19.m38000());
         var16 = var8 ? f10000[3] : var19.m68000() - var3.m68000();
         var17 = this.m32000(var15, var12);
         var18 = this.m32000(var16, var12);
      }

      float var20 = this.m26000(var5, var12, true, var7);
      float var21 = var8 ? var12 : this.m26000(var6, var12, false, var7);
      Integer var28 = var17;
      this.f1000[3] = var28;
      Integer var29 = var18;
      this.f1000[4] = var29;
      return new Rec0011(var19, var20, var21);
   }

   private C0983 m40000(C0768 var1, NjL var2, C0983 var3, C0983 var4, float var5, float var6, float var7, boolean var8, boolean var9, boolean var10) {
      if (var9 && Math.abs(var5) + Math.abs(var6) < var7 * f10000[4]) {
         return var4;
      } else {
         float var11 = Math.abs(var5) > f10000[5] ? Math.signum(var5) : (Math.random() > f5000[2] ? f10000[6] : f6000[0]);
         float var12 = Math.abs(var6) > f6000[1] ? Math.signum(var6) : (Math.random() > f5000[3] ? f6000[2] : f6000[3]);
         float var13 = var11 * var7 * C0052.m8000(f5000[4], var10 ? f9000[0] : f9000[1]) + (Float)this.f1000[1];
         float var14 = var8 ? f6000[4] : var12 * var7 * C0052.m8000(f9000[2], var10 ? f9000[3] : f9000[4]) + (Float)this.f1000[2];
         C0983 var15 = new C0983(
            var3.m38000() + this.m22000(var5 + var13, var5, var7), NNWE.N(var3.m68000() + this.m22000(var6 + var14, var6, var7), f6000[5], f6000[6])
         );
         if (var1.m36000(var2, var15)) {
            return var15;
         } else {
            return var9 && var1.m36000(var2, var3) ? var3 : var4;
         }
      }
   }

   private static void m42000() {
      f10000 = new float[]{0.0F, 0.0F, 0.0F, 0.0F, 0.8F, 1.0E-4F, 1.0F};
      f6000 = new float[]{-1.0F, 1.0E-4F, 1.0F, -1.0F, 0.0F, -90.0F, 90.0F, 1.55F};
      f4000 = new float[]{0.9F, 1.85F};
      f8000 = new float[]{0.92F, 0.48F, 0.32F, 0.48F, 0.32F, 2.0F, 1.0E-4F, 0.0F};
      f7000 = new float[]{0.0F};
   }
}

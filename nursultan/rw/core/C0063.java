package rw.core;

import KDFzREm.NNWE;
import rw.data.OltpmilOn;
import rw.data.Rec0188;

public class C0063 {
   private static double[] f1000;
   public Object[] f2000;
   private static double[] f3000;
   private static float[] f4000;
   private static double[] f5000;
   private static float[] f6000;
   private static double[] f7000;
   private static double[] f8000;
   private static float[] f9000;

   public C0063() {
      this.m20000();
      Float var5 = f6000[0];
      this.f2000[3] = var5;
   }

   static {
      ntfClinit();
   }

   private static void m12000() {
      f7000 = new double[]{0.7, 1.35, 0.72, 0.92, 0.42, 0.66};
      f1000 = new double[]{0.72, 0.94};
      f3000 = new double[]{0.48, 0.72, 0.74, 1.28, 1.08, 0.46, 0.24};
      f5000 = new double[]{45.0, 115.0, 0.42, 0.2, 55.0};
      f8000 = new double[]{125.0, 70.0, 115.0, 180.0, 310.0};
   }

   private static void m16000() {
      f6000 = new float[]{1.0F, 1.0F};
      f4000 = new float[]{0.0F, 2.8F, 0.16F, 0.72F, 0.65F, 0.18F};
      f9000 = new float[]{0.58F, 0.18F, 0.0F, 1.0F, 3.0F, 2.4F, 0.0F};
   }

   private void m20000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[4];
         Object[] var1 = this.f2000;
         var1[0] = 0L;
         var1[1] = 0L;
         var1[2] = 0L;
         var1[3] = f9000[6];
      }
   }

   public void m24000() {
      Long var5 = 0L;
      this.f2000[0] = var5;
      Long var6 = 0L;
      this.f2000[1] = var6;
      Long var7 = 0L;
      this.f2000[2] = var7;
      Float var8 = f6000[1];
      this.f2000[3] = var8;
   }

   public OltpmilOn m26000(Rec0188 var1, float var2, float var3, float var4, boolean var5) {
      if (var1.m22000()) {
         return new OltpmilOn(var4, f4000[0]);
      } else {
         long var6 = System.currentTimeMillis();
         this.m32000(var6, var1, var5);
         float var8 = var2;
         float var9 = var3;
         if (var1.m16000() && !var1.m4000() && !var1.m8000()) {
            float var10 = NNWE.N(var1.m2000() / f4000[1], f4000[2], f4000[3]);
            var8 = Math.min(var2, Math.max(var4, var1.m2000() * var10 + var4 * f4000[4]));
            var9 = var3 * NNWE.N(var10, f4000[5], f9000[0]);
         }

         if (var6 < (Long)this.f2000[1] && !var1.m8000()) {
            var8 = Math.min(var8, var4 * C0052.m8000(f7000[0], f7000[1]));
            var9 *= f9000[1];
         }

         if (var6 < (Long)this.f2000[2] || var1.m8000()) {
            float var11 = var1.m8000() ? C0052.m8000(f7000[2], f7000[3]) : C0052.m8000(f7000[4], f7000[5]);
            var8 = Math.max(var8, var1.m2000() * var11);
            var9 = Math.max(var9, var1.m8000() ? C0052.m8000(f1000[0], f1000[1]) : C0052.m8000(f3000[0], f3000[1]));
         }

         return new OltpmilOn(Math.max(var4, var8 * (Float)this.f2000[3]), NNWE.N(var9, f9000[2], f9000[3]));
      }
   }

   private void m32000(long var1, Rec0188 var3, boolean var4) {
      if (var1 >= (Long)this.f2000[0]) {
         Float var13 = C0052.m8000(f3000[2], var4 ? f3000[3] : f3000[4]);
         this.f2000[3] = var13;
         if (!var3.m8000() && var3.m2000() < f9000[4]) {
            double var5 = Math.random();
            double var7 = var3.m16000() ? f3000[5] : f3000[6];
            if (var5 < var7) {
               Long var14 = var1 + (long)C0052.m8000(f5000[0], f5000[1]);
               this.f2000[1] = var14;
            }
         }

         if (var3.m4000() || var3.m2000() > f9000[5]) {
            double var17 = Math.random();
            double var18 = var4 ? f5000[2] : f5000[3];
            if (var17 < var18) {
               Long var15 = var1 + (long)C0052.m8000(f5000[4], f8000[0]);
               this.f2000[2] = var15;
            }
         }

         Long var16 = var1 + (long)C0052.m8000(var4 ? f8000[1] : f8000[2], var4 ? f8000[3] : f8000[4]);
         this.f2000[0] = var16;
      }
   }
}

package rw.core;

import KDFzREm.NNWE;
import KDFzREm.NjL;

public class C0763 {
   private static float[] f1000;
   private static float[] f2000;
   private static float[] f3000;
   private static float[] f4000;
   private static double[] f5000;
   private static float[] f6000;
   private static float[] f7000;
   public Object[] f8000;
   private static float[] f9000;
   private static float[] f10000;

   private static void m4000() {
      f5000 = new double[]{0.5, 0.12F, 38.0, 92.0, 132.0};
   }

   public C0763() {
      this.m18000();
      Integer var5 = 1;
      this.f8000[3] = var5;
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      f10000 = new float[]{0.0F, 0.0F};
      f6000 = new float[]{1.45F, 1.0F};
      f4000 = new float[]{0.74F, 0.92F, 0.62F, 0.72F, 0.38F, 0.16F, 0.31F};
      f1000 = new float[]{0.18F, 1.38F};
      f7000 = new float[]{0.44F, 0.92F, 1.16F};
      f9000 = new float[]{-90.0F, 90.0F, 1.0F, 0.0F, 0.36F};
      f2000 = new float[]{0.14F, 1.18F, 0.36F, 1.0F};
      f3000 = new float[]{-1.0F, 0.44F, 0.18F, 0.0F, 0.0F};
   }

   private void m18000() {
      if (this.f8000 == null) {
         this.f8000 = new Object[4];
         Object[] var1 = this.f8000;
         var1[0] = 0L;
         var1[1] = f3000[3];
         var1[2] = f3000[4];
         var1[3] = 0;
      }
   }

   public C0983 m24000(C0768 var1, NjL var2, C0983 var3, C0983 var4, boolean var5, boolean var6, boolean var7, boolean var8) {
      if (var3 != null && var4 != null && var5 && !var6 && !var8) {
         long var10 = System.currentTimeMillis();
         this.m30000(var10, var7);
         float var12 = var4.m38000();
         float var13 = var4.m68000();
         float var14 = var7 ? f6000[0] : f6000[1];

         for (float[] var18 : new float[][]{
            {(Float)this.f8000[1] * var14, (Float)this.f8000[2] * var14},
            {(Float)this.f8000[1] * f4000[0] * var14, -(Float)this.f8000[2] * f4000[1]},
            {-(Float)this.f8000[1] * f4000[2], (Float)this.f8000[2] * f4000[3] * var14},
            {((Integer)this.f8000[3]).intValue() * f4000[4], -(Integer)this.f8000[3] * f4000[5]},
            {-(Integer)this.f8000[3] * f4000[6], ((Integer)this.f8000[3]).intValue() * f1000[0]},
            {(Float)this.f8000[1] * f1000[1], (Float)this.f8000[2] * f7000[0]},
            {-(Float)this.f8000[1] * f7000[1], -(Float)this.f8000[2] * f7000[2]}
         }) {
            C0983 var19 = new C0983(var12 + var18[0], NNWE.N(var13 + var18[1], f9000[0], f9000[1]));
            if (var1.m36000(var2, var19)) {
               return var19;
            }
         }

         return var4;
      } else {
         return var4;
      }
   }

   public void m26000() {
      Long var5 = 0L;
      this.f8000[0] = var5;
      Float var6 = f10000[0];
      this.f8000[1] = var6;
      Float var7 = f10000[1];
      this.f8000[2] = var7;
      Integer var8 = 1;
      this.f8000[3] = var8;
   }

   private void m30000(long var1, boolean var3) {
      if (var1 >= (Long)this.f8000[0]) {
         Integer var9 = -(Integer)this.f8000[3];
         this.f8000[3] = var9;
         float var4 = var3 ? f9000[2] : f9000[3];
         Float var10 = ((Integer)this.f8000[3]).intValue() * C0052.m8000(f9000[4] + var4 * f2000[0], f2000[1] + var4 * f2000[2]);
         this.f8000[1] = var10;
         Float var11 = (Math.random() > f5000[0] ? f2000[3] : f3000[0]) * C0052.m8000(f5000[1], f3000[1] + var4 * f3000[2]);
         this.f8000[2] = var11;
         Long var12 = var1 + (long)C0052.m8000(f5000[2], var3 ? f5000[3] : f5000[4]);
         this.f8000[0] = var12;
      }
   }
}

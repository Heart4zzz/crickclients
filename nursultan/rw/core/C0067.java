package rw.core;

import KDFzREm.NNWE;

public class C0067 {
   private static float[] f1000;
   private static double[] f2000;
   private static float[] f3000;
   private static float[] f4000;
   public Object[] f5000;
   private static float[] f6000;
   private static double[] f7000;
   private static float[] f8000;
   private static double[] f9000;
   private static double[] f10000;
   private static float[] f11000;
   private static double[] f12000;

   private void m6000() {
      if (this.f5000 == null) {
         this.f5000 = new Object[6];
         Object[] var1 = this.f5000;
         var1[0] = 0L;
         var1[1] = 0L;
         var1[2] = 0L;
         var1[3] = f1000[4];
         var1[4] = f1000[5];
         var1[5] = f1000[6];
      }
   }

   public C0067() {
      this.m6000();
      Float var5 = C0052.m8000(f12000[0], f12000[1]);
      this.f5000[5] = var5;
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      f3000 = new float[]{0.0F, 0.0F};
      f4000 = new float[]{34.0F, 9.0F, 0.0F, 1.0F, 0.82F, 0.44F, 0.32F};
      f8000 = new float[]{0.085F, 0.055F, 1.16F, 1.08F, 1.0F};
      f11000 = new float[]{1.08F, 1.04F, 1.0F, 0.72F, 2.4F, 4.0F};
      f6000 = new float[]{0.62F, 0.48F, 0.24F};
      f1000 = new float[]{1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F};
   }

   private static void m20000() {
      f12000 = new double[]{0.0, Math.PI * 2};
      f9000 = new double[]{0.0, Math.PI * 2, 0.028};
      f7000 = new double[]{0.021, 85.0, 210.0, 0.26, 0.16};
      f2000 = new double[]{0.72, 0.48, 0.08, 0.32, 0.22, 0.0};
      f10000 = new double[]{Math.PI * 2, 45.0, 125.0, 135.0, 360.0, Math.PI};
   }

   private void m26000(long var1, float var3, float var4, boolean var5, boolean var6) {
      if (var1 >= (Long)this.f5000[0] && var1 >= (Long)this.f5000[2]) {
         int var8 = var3 > var4 * (var6 ? f11000[4] : f11000[5]) ? 1 : 0;
         if (var8 != 0 || var5) {
            float var7 = var6 ? f6000[0] : (var5 ? f6000[1] : f6000[2]);
            if (Math.random() > var7) {
               Long var14 = var1 + (long)C0052.m8000(f7000[1], f7000[2]);
               this.f5000[0] = var14;
            } else {
               Float var15 = C0052.m8000(var6 ? f7000[3] : f7000[4], var5 ? f2000[0] : f2000[1]);
               this.f5000[3] = var15;
               Float var16 = C0052.m8000(f2000[2], var5 ? f2000[3] : f2000[4]);
               this.f5000[4] = var16;
               Float var17 = C0052.m8000(f2000[5], f10000[0]);
               this.f5000[5] = var17;
               Long var18 = var1;
               this.f5000[1] = var18;
               Long var19 = var1 + (long)C0052.m8000(f10000[1], f10000[2]);
               this.f5000[2] = var19;
               Long var20 = var1 + (long)C0052.m8000(f10000[3], f10000[4]);
               this.f5000[0] = var20;
            }
         }
      }
   }

   public float m28000(float var1, float var2, float var3, boolean var4, boolean var5, boolean var6) {
      long var8 = System.currentTimeMillis();
      this.m26000(var8, var2, var3, var4, var5);
      float var10 = var6 ? f4000[0] : f4000[1];
      float var11 = NNWE.N(var2 / var10, f4000[2], f4000[3]);
      float var12 = f4000[4] + (float)Math.sqrt(var11) * (var6 ? f4000[5] : f4000[6]);
      float var13 = (float)Math.sin(var8 * (var6 ? f9000[2] : f7000[0]) + ((Float)this.f5000[5]).floatValue()) * (var6 ? f8000[0] : f8000[1]);
      float var14 = this.m32000(var8, var6);
      float var7 = var5 ? (var6 ? f8000[2] : f8000[3]) : f8000[4];
      float var15 = var4 ? (var6 ? f11000[0] : f11000[1]) : f11000[2];
      return Math.max(var3, var1 * Math.max(f11000[3], var12 + var13) * var14 * var7 * var15);
   }

   private float m32000(long var1, boolean var3) {
      if (var1 >= (Long)this.f5000[1] && var1 < (Long)this.f5000[2]) {
         float var4 = NNWE.N((float)(var1 - (Long)this.f5000[1]) / (float)Math.max(1L, (Long)this.f5000[2] - (Long)this.f5000[1]), f1000[1], f1000[2]);
         float var5 = (float)Math.sin(var4 * f10000[5]);
         float var6 = var3 ? (Float)this.f5000[3] : (Float)this.f5000[4];
         return f1000[3] + var5 * var6;
      } else {
         return f1000[0];
      }
   }

   public void m34000() {
      Long var5 = 0L;
      this.f5000[0] = var5;
      Long var6 = 0L;
      this.f5000[1] = var6;
      Long var7 = 0L;
      this.f5000[2] = var7;
      Float var8 = f3000[0];
      this.f5000[3] = var8;
      Float var9 = f3000[1];
      this.f5000[4] = var9;
      Float var10 = C0052.m8000(f9000[0], f9000[1]);
      this.f5000[5] = var10;
   }
}

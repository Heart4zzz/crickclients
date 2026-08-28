package rw.core;

import rw.data.Rec0030;

public class C0060 {
   private static double[] f1000;
   private static double[] f2000;
   private static short[] f3000;
   public Object[] f4000;
   private static float[] f5000;
   private static float[] f6000;
   private static double[] f7000;
   private static float[] f8000;
   private static short[] f9000;

   private static void m2000() {
      f1000 = new double[]{45.0, 135.0};
      f2000 = new double[]{95.0, 42.0, 58.0, 92.0};
      f7000 = new double[]{148.0, 95.0, 145.0, 360.0, 280.0, 9.7137E-4};
   }

   public C0060() {
      this.m16000();
      Float var5 = f6000[0];
      this.f4000[f9000[0]] = var5;
   }

   static {
      ntfClinit();
   }

   private static void m12000() {
      f9000 = new short[]{2, 0, 1, 2, 0};
      f3000 = new short[]{2, 0, 1, 1, 2, 0, 1};
   }

   private void m16000() {
      if (this.f4000 == null) {
         this.f4000 = new Object[3];
         Object[] var1 = this.f4000;
         var1[0] = 0L;
         var1[1] = 0L;
         var1[2] = f8000[6];
      }
   }

   private float m18000(boolean var1, boolean var2, boolean var3, float var4) {
      float var5 = var3 ? f5000[2] : (var2 ? f8000[0] : f8000[1]);
      float var6 = var3 ? f8000[2] : (!var1 && !(var4 >= f8000[3]) ? f8000[5] : f8000[4]);
      double var7 = C0052.m8000(var5, var6) + Math.random() * f7000[5];
      return (float)var7;
   }

   private void m26000(long var1, float var3, float var4, boolean var5, boolean var6, boolean var7) {
      if (var1 >= (Long)this.f4000[0]) {
         if (var1 >= (Long)this.f4000[1] && !(var3 <= var4 * f6000[2])) {
            float var8 = this.m34000(var5, var6, var7, var3);
            if (Math.random() > var8) {
               Long var13 = var1 + (long)C0052.m8000(f1000[0], var6 ? f1000[1] : f2000[0]);
               this.f4000[1] = var13;
            } else {
               Float var14 = this.m18000(var5, var6, var7, var3);
               this.f4000[2] = var14;
               Long var15 = var1 + (long)C0052.m8000(var7 ? f2000[1] : f2000[2], var7 ? f2000[3] : f7000[0]);
               this.f4000[0] = var15;
               Long var16 = var1 + (long)C0052.m8000(var5 ? f7000[1] : f7000[2], var6 ? f7000[3] : f7000[4]);
               this.f4000[1] = var16;
            }
         }
      }
   }

   public Rec0030 m28000(float var1, float var2, float var3, boolean var4, boolean var5, boolean var6) {
      long var7 = System.currentTimeMillis();
      this.m26000(var7, var2, var3, var4, var5, var6);
      return var7 >= this.f4000[f9000[4]] ? new Rec0030(var1, false) : new Rec0030(var1 * (Float)this.f4000[2], true);
   }

   public void m30000() {
      Long var5 = 0L;
      this.f4000[f9000[1]] = var5;
      Long var6 = 0L;
      this.f4000[f9000[2]] = var6;
      Float var7 = f6000[1];
      this.f4000[f9000[3]] = var7;
   }

   private float m34000(boolean var1, boolean var2, boolean var3, float var4) {
      float var5 = var3 ? f6000[3] : (var1 ? f6000[4] : f6000[5]);
      if (var2) {
         var5 += f6000[6];
      }

      if (var4 >= f6000[7]) {
         var5 += f5000[0];
      }

      return Math.min(var5, f5000[1]);
   }

   private static void m38000() {
      f6000 = new float[]{1.0F, 1.0F, 3.0F, 0.72F, 0.58F, 0.38F, 0.2F, 7.0F};
      f5000 = new float[]{0.1F, 0.86F, 1.48F};
      f8000 = new float[]{1.34F, 1.38F, 2.2F, 9.0F, 2.2F, 2.04F, 0.0F};
   }
}

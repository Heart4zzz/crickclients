package rw.core;

import KDFzREm.NNWE;
import rw.data.Rec0012;

public class KgHk {
   private static float[] f1000;
   private static double[] f2000;
   private static float[] f3000;
   private static float[] f4000;
   private static float[] f5000;
   private static float[] f6000;
   private static float[] f7000;
   private static float[] f8000;
   private static float[] f9000;
   private static float[] f10000;
   private static double[] f11000;
   private static float[] f12000;
   private static float[] f13000;
   private static float[] f14000;
   private static float[] f15000;
   private static float[] f16000;
   private static double[] f17000;
   private static float[] f18000;
   private static float[] f19000;
   private static float[] f20000;
   private static float[] f21000;
   private static float[] f22000;
   private static float[] f23000;
   public Object[] f24000;
   private static float[] f25000;
   private static float[] f26000;
   private static float[] f27000;
   public Object[] f28000;

   private void m8000() {
      if (this.f24000 == null) {
         this.f24000 = new Object[4];
         Object[] var1 = this.f24000;
         var1[0] = 0L;
         var1[1] = 0L;
         var1[2] = 0L;
         var1[3] = f20000[1];
      }

      if (this.f28000 == null) {
         this.f28000 = new Object[6];
         Object[] var2 = this.f28000;
         var2[0] = f20000[2];
         var2[1] = f20000[3];
         var2[2] = f20000[4];
         var2[3] = f20000[5];
         var2[4] = 0;
         var2[5] = false;
      }
   }

   public KgHk() {
      this.m8000();
   }

   static {
      ntfClinit();
   }

   private static void m12000() {
      f10000 = new float[]{0.0F, 0.0F, 0.0F, 0.0F};
      f5000 = new float[]{0.0F, 0.0F, 4.2F, 12.0F, 7.2F, 17.0F, 3.6F, 8.5F};
      f12000 = new float[]{4.0F, 9.0F, 0.0F, 1.0E-4F, 1.0E-4F};
      f16000 = new float[]{0.35F, 0.0F, 96.0F};
      f15000 = new float[]{0.0F, 1.0F};
      f7000 = new float[]{0.82F, 0.7F, 0.22F, 0.24F, 0.14F, 0.2F, 0.78F, 0.7F};
      f25000 = new float[]{22.0F, 16.0F, 46.0F};
      f1000 = new float[]{34.0F, 36.0F};
      f19000 = new float[]{26.0F, 2.35F, 1.85F, 0.45F, 1.65F, 0.88F};
      f3000 = new float[]{0.96F, 0.92F, 0.84F, 1.0F};
      f4000 = new float[]{0.04F, 0.03F};
      f18000 = new float[]{2.0F, 1.0E-4F, 1.0E-4F, 0.45F, 0.0F};
      f22000 = new float[]{0.66F, 0.52F, 28.0F, 0.0F, 1.0F, 0.24F};
      f23000 = new float[]{0.14F, 0.62F, 0.45F, 8.0F};
      f14000 = new float[]{5.6F, 17.0F, 11.5F, 13.5F, 8.8F, 0.5F, 1.35F};
      f13000 = new float[]{0.45F, 1.65F, 0.18F, 0.82F, 0.035F, 0.02F};
      f27000 = new float[]{0.45F, 120.0F, 0.0F, 1.0F, 12.0F};
      f6000 = new float[]{16.0F, 34.0F};
      f21000 = new float[]{52.0F, 6.0F, 14.0F, 0.96F};
      f9000 = new float[]{0.88F, 1.0F, 50.0F, 0.35F};
      f8000 = new float[]{1.8F, 1.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F};
      f26000 = new float[]{1.0F, 0.06F, 0.0F, 1.0F, 1.0E-4F};
      f20000 = new float[]{0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F};
   }

   private static void m14000() {
      f2000 = new double[]{0.28, 4.0};
      f11000 = new double[]{18.0, 13.0, 0.94, 0.34};
      f17000 = new double[]{1.2F, 5.0, 0.92, 8.0, Math.PI};
   }

   private float m18000() {
      return this.f24000[2] <= 0L
         ? f8000[1]
         : NNWE.N((float)(System.currentTimeMillis() - (Long)this.f24000[1]) / (float)((Long)this.f24000[2]).longValue(), f8000[2], f8000[3]);
   }

   private int m24000(float var1) {
      if (Math.abs(var1) <= f26000[4]) {
         return 0;
      } else {
         return var1 > f20000[0] ? 1 : -1;
      }
   }

   private float m26000(long var1) {
      if ((Long)this.f24000[0] <= 0L) {
         Long var8 = var1;
         this.f24000[0] = var8;
         return f9000[1];
      } else {
         float var3 = NNWE.N((float)(var1 - (Long)this.f24000[0]) / f9000[2], f9000[3], f8000[0]);
         Long var9 = var1;
         this.f24000[0] = var9;
         return var3;
      }
   }

   private float m28000(float var1, float var2, float var3, float var4, boolean var5, boolean var6, boolean var7) {
      float var8 = Math.abs(var1);
      if (!(var8 <= f18000[1]) && !(Math.abs(var2) <= f18000[2])) {
         float var9 = this.m18000();
         float var10 = this.m46000(var9);
         float var11 = (var5 ? f22000[0] : f22000[1]) + (float)Math.pow(NNWE.N(var8 / f22000[2], f22000[3], f22000[4]), f11000[3]) * f22000[5];
         if (var6 || var7) {
            var11 += f23000[0];
         }

         float var12 = this.m48000() && !var7 ? NNWE.B(var10, Math.min(var11, f23000[1]), var11) : var11;
         float var13 = Math.max(var3 * f23000[2], var8 * var12 + var3 * C0052.m8000(f17000[0], f17000[1]));
         float var14 = NNWE.N(var2, -var13, var13);
         float var15 = (
               var3 * (this.m48000() ? NNWE.B(var10, var5 ? f23000[3] : f14000[0], var5 ? f14000[1] : f14000[2]) : (var5 ? f14000[3] : f14000[4]))
                  + (float)Math.pow(Math.abs(var14 - (Float)this.f28000[1]) + var3 * f14000[5], f17000[2]) * f14000[6]
            )
            * NNWE.N(var4, f13000[0], f13000[1]);
         float var16 = (Float)this.f28000[1] + NNWE.N(var14 - (Float)this.f28000[1], -var15, var15);
         Float var22 = (Float)this.f28000[3] * f13000[2] + var16 * f13000[3];
         this.f28000[3] = var22;
         var16 = NNWE.B(this.m48000() ? f13000[4] : f13000[5], var16, (Float)this.f28000[3]);
         if (Math.signum(var16) != Math.signum(var1) && var8 > var3) {
            var16 = Math.signum(var1) * Math.min(Math.abs(var16), var13);
         }

         return NNWE.N(var16, -var8, var8);
      } else {
         Float var21 = (Float)this.f28000[3] * f18000[3];
         this.f28000[3] = var21;
         return f18000[4];
      }
   }

   public Rec0012 m34000(float var1, float var2, float var3, float var4, float var5, boolean var6, boolean var7, boolean var8, boolean var9, boolean var10) {
      long var12 = System.currentTimeMillis();
      float var14 = this.m26000(var12);
      int var15 = this.m24000(var1);
      float var16 = this.f28000[5] ? Math.abs(var1 - (Float)this.f24000[3]) : f5000[1];
      int var17 = this.f28000[5] && var15 != 0 && this.f28000[4] != 0 && var15 != this.f28000[4] && Math.abs(var1) > Math.max(f5000[2], var5 * f5000[3])
         ? 1
         : 0;
      int var11 = !(Math.abs(var1) > Math.max(f5000[4], var5 * f5000[5]))
            || !(var16 > Math.max(f5000[6], var5 * f5000[7])) && var17 == 0 && !(Math.abs(var3) > Math.max(f12000[0], var5 * f12000[1]))
         ? 0
         : 1;
      if (var11 != 0 && !var10) {
         this.m40000(var12, var1, var16, var7, var8, var9);
      }

      float var19 = this.m44000(var1, var3, var5, var14, var7, var8, var10);
      float var20 = var6 ? f12000[2] : this.m28000(var2, var4, var5, var14, var7, var8, var10);
      Float var25 = var1;
      this.f24000[3] = var25;
      Float var26 = var19;
      this.f28000[0] = var26;
      Float var27 = var20;
      this.f28000[1] = var27;
      if (var15 != 0) {
         Integer var28 = var15;
         this.f28000[4] = var28;
      }

      Boolean var29 = true;
      this.f28000[5] = var29;
      return new Rec0012(var19, var20);
   }

   private void m40000(long var1, float var3, float var4, boolean var5, boolean var6, boolean var7) {
      float var8 = NNWE.N((Math.abs(var3) + var4 * f27000[0]) / f27000[1], f27000[2], f27000[3]);
      float var9 = !var5 && !var6 ? f6000[0] : f27000[4];
      float var10 = var7 ? f6000[1] : f21000[0];
      Long var15 = var1;
      this.f24000[1] = var15;
      Long var16 = (long)C0052.m8000(var9 + var8 * f21000[1], var10 + var8 * f21000[2]);
      this.f24000[2] = var16;
      Integer var17 = this.m24000(var3);
      this.f28000[4] = var17;
      Float var18 = (Float)this.f28000[2] * f21000[3];
      this.f28000[2] = var18;
      Float var19 = (Float)this.f28000[3] * f9000[0];
      this.f28000[3] = var19;
   }

   public void m42000() {
      Long var5 = 0L;
      this.f24000[0] = var5;
      Long var6 = 0L;
      this.f24000[1] = var6;
      Long var7 = 0L;
      this.f24000[2] = var7;
      Float var8 = f10000[0];
      this.f24000[3] = var8;
      Float var9 = f10000[1];
      this.f28000[0] = var9;
      Float var10 = f10000[2];
      this.f28000[1] = var10;
      Float var11 = f10000[3];
      this.f28000[2] = var11;
      Float var12 = f5000[0];
      this.f28000[3] = var12;
      Integer var13 = 0;
      this.f28000[4] = var13;
      Boolean var14 = false;
      this.f28000[5] = var14;
   }

   private float m44000(float var1, float var2, float var3, float var4, boolean var5, boolean var6, boolean var7) {
      float var8 = Math.abs(var1);
      if (!(var8 <= f12000[3]) && !(Math.abs(var2) <= f12000[4])) {
         float var9 = this.m18000();
         float var10 = this.m46000(var9);
         float var11 = NNWE.N(var8 / f16000[2], f15000[0], f15000[1]);
         float var12 = (var5 ? f7000[0] : f7000[1]) + (float)Math.pow(var11, f2000[0]) * (var5 ? f7000[2] : f7000[3]);
         if (var6) {
            var12 += f7000[4];
         }

         if (var7) {
            var12 += f7000[5];
         }

         float var13 = this.m48000() && !var7 ? NNWE.B(var10, Math.min(var12, var5 ? f7000[6] : f7000[7]), var12) : var12;
         float var14 = Math.max(var3, var8 * var13 + var3 * C0052.m8000(f2000[1], var5 ? f11000[0] : f11000[1]));
         float var15 = NNWE.N(var2, -var14, var14);
         float var16 = var3 * (this.m48000() ? NNWE.B(var10, var5 ? f25000[0] : f25000[1], var5 ? f25000[2] : f1000[0]) : (var5 ? f1000[1] : f19000[0]));
         float var17 = (float)Math.pow(Math.abs(var15 - (Float)this.f28000[0]) + var3, f11000[2]) * (var5 ? f19000[1] : f19000[2]);
         float var18 = (var16 + var17) * NNWE.N(var4, f19000[3], f19000[4]);
         float var19 = (Float)this.f28000[0] + NNWE.N(var15 - (Float)this.f28000[0], -var18, var18);
         float var20 = this.m48000() ? NNWE.B(var10, f19000[5], f3000[0]) : (var5 ? f3000[1] : f3000[2]);
         Float var27 = (Float)this.f28000[2] * (f3000[3] - var20) + var19 * var20;
         this.f28000[2] = var27;
         float var21 = this.m48000() ? f4000[0] : f4000[1];
         var19 = NNWE.B(var21, var19, (Float)this.f28000[2]);
         if (Math.signum(var19) != Math.signum(var1) && var8 > var3 * f18000[0]) {
            var19 = Math.signum(var1) * Math.min(Math.abs(var19), var14);
         }

         return NNWE.N(var19, -var8, var8);
      } else {
         Float var26 = (Float)this.f28000[2] * f16000[0];
         this.f28000[2] = var26;
         return f16000[1];
      }
   }

   private float m46000(float var1) {
      float var2 = NNWE.N(var1, f8000[4], f8000[5]);
      float var3 = f8000[6] - (float)Math.pow(f26000[0] - var2, f17000[3]);
      float var4 = (float)Math.sin(var2 * f17000[4]) * f26000[1];
      return NNWE.N(var3 + var4, f26000[2], f26000[3]);
   }

   private boolean m48000() {
      return (boolean)(this.f24000[2] > 0L && System.currentTimeMillis() - this.f24000[1] < this.f24000[2] ? 1 : 0);
   }
}

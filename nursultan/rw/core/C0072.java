package rw.core;

import KDFzREm.NNWE;
import rw.data.OllisOr;
import rw.data.Rec0188;

public class C0072 {
   private static double[] f1000;
   public Object[] f2000;
   private static short[] f3000;
   public Object[] f4000;
   private static double[] f5000;
   private static short[] f6000;
   private static float[] f7000;
   private static short[] f8000;
   private static float[] f9000;
   private static float[] f10000;
   private static short[] f11000;
   private static short[] f12000;
   private static double[] f13000;
   private static double[] f14000;
   private static double[] f15000;
   private static short[] f16000;
   private static double[] f17000;
   private static float[] f18000;
   private static short[] f19000;
   private static double[] f20000;
   private static short[] f21000;
   private static float[] f22000;
   private static float[] f23000;
   private static short[] f24000;
   private static double[] f25000;
   private static float[] f26000;
   private static float[] f27000;
   private static double[] f28000;
   private static float[] f29000;
   private static float[] f30000;
   private static short[] f31000;
   private static double[] f32000;
   public Object[] f33000;
   private static float[] f34000;
   private static float[] f35000;
   private static short[] f36000;
   private static short[] f37000;
   private static short[] f38000;
   private static float[] f39000;
   private static double[] f40000;
   private static short[] f41000;

   private void m6000() {
      if (this.f4000 == null) {
         this.f4000 = new Object[2];
         Object[] var1 = this.f4000;
         var1[0] = 0L;
         var1[1] = 0L;
      }

      if (this.f2000 == null) {
         this.f2000 = new Object[6];
         Object[] var2 = this.f2000;
         var2[0] = 0L;
         var2[1] = f9000[2];
         var2[2] = f10000[0];
         var2[3] = f10000[1];
         var2[4] = f10000[2];
         var2[5] = f10000[3];
      }

      if (this.f33000 == null) {
         this.f33000 = new Object[4];
         Object[] var3 = this.f33000;
         var3[0] = f10000[4];
         var3[1] = f10000[5];
         var3[2] = false;
         var3[3] = false;
      }
   }

   public C0072() {
      this.m6000();
      Float var5 = f18000[0];
      this.f2000[1] = var5;
      Float var6 = f18000[1];
      this.f2000[2] = var6;
      Float var7 = f30000[0];
      this.f2000[3] = var7;
      Float var8 = f30000[1];
      this.f2000[4] = var8;
      Float var9 = f35000[0];
      this.f2000[5] = var9;
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      f18000 = new float[]{11.0F, 1.0F};
      f30000 = new float[]{1.0F, 0.55F};
      f35000 = new float[]{0.42F, 1.0F, 1.0F, 0.55F, 0.42F, 0.0F, 0.0F};
      f7000 = new float[]{0.0F, 1.0F, 0.0F, 1.0F, 0.16F};
      f29000 = new float[]{0.96F, 0.74F};
      f27000 = new float[]{0.0F, 1.0F};
      f34000 = new float[]{1.0F, 0.72F, 1.22F, 0.08F};
      f23000 = new float[]{2.2F, 1.1F, 3.2F};
      f26000 = new float[]{4.8F, 0.86F, 4.4F, 0.58F};
      f22000 = new float[]{4.8F, 3.4F, 1.8F, 14.0F};
      f39000 = new float[]{8.0F, 12.0F, 5.6F, 1.0F, -1.0F};
      f9000 = new float[]{0.0F, 0.0F, 0.0F};
      f10000 = new float[]{0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F};
   }

   private static void m22000() {
      f38000 = new short[]{1, 2, 3, 4, 5, 0, 1};
      f19000 = new short[]{0, 1, 2, 3, 4, 5, 0};
      f8000 = new short[]{1, 2};
      f21000 = new short[]{3, 3, 2, 0, 3, 2, 3};
      f3000 = new short[]{0, 3, 1, 0, 1, 2, 2};
      f12000 = new short[]{3, 4, 5, 0, 1, 2, 1, 1};
      f11000 = new short[]{1, 2};
      f37000 = new short[]{3, 4, 5};
      f16000 = new short[]{2, 2, 0};
      f41000 = new short[]{1, 2, 2, 3};
      f31000 = new short[]{3, 4};
      f24000 = new short[]{4, 5, 5};
      f6000 = new short[]{0, 1, 1, 2, 2};
      f36000 = new short[]{0, 2, 2, 0, 1, 3};
   }

   private boolean m24000(Rec0188 var1, boolean var2, boolean var3, boolean var4, long var5) {
      if (!var1.m8000() && (!var4 || var5 < 500L)) {
         if (var3) {
            int var11 = var5 >= 18L && var5 <= 98L ? 1 : 0;
            return (boolean)(var11 != 0 && (var1.m14000() >= f23000[0] || var1.m2000() >= f23000[1] || !var1.m16000()) && Math.random() < f1000[2] ? 1 : 0);
         } else if (var1.m4000() && var5 >= 32L) {
            return (boolean)(Math.random() < f1000[3] ? 1 : 0);
         } else if (var1.m16000() && var1.m14000() < (Float)this.f2000[1] && var1.m2000() < f23000[2]) {
            return (boolean)(var1.m14000() <= f26000[0] && var5 >= 70L && Math.random() < f20000[0] ? 1 : 0);
         } else {
            float var7 = var1.m16000() ? (Float)this.f2000[1] * f26000[1] : Math.max(f26000[2], (Float)this.f2000[f11000[0]] * f26000[3]);
            int var8 = var1.m14000() >= var7 ? 1 : 0;
            int var9 = !var1.m16000() && var1.m14000() >= f22000[0] ? 1 : 0;
            int var10 = !var4 || !var2 || !(var1.m14000() >= f22000[1]) && !(var1.m2000() >= f22000[2]) ? 0 : 1;
            return (boolean)(var8 == 0 && var9 == 0 && var10 == 0 ? 0 : 1);
         }
      } else {
         return (boolean)0;
      }
   }

   public void m26000() {
      Long var5 = 0L;
      this.f4000[0] = var5;
      Long var6 = 0L;
      this.f4000[1] = var6;
      Long var7 = 0L;
      this.f2000[0] = var7;
      Float var8 = C0052.m8000(f25000[0], f25000[1]);
      this.f2000[1] = var8;
      Float var9 = f35000[1];
      this.f2000[2] = var9;
      Float var10 = f35000[2];
      this.f2000[3] = var10;
      Float var11 = f35000[3];
      this.f2000[4] = var11;
      Float var12 = f35000[4];
      this.f2000[5] = var12;
      Float var13 = f35000[5];
      this.f33000[0] = var13;
      Float var14 = f35000[6];
      this.f33000[1] = var14;
      Boolean var15 = false;
      this.f33000[2] = var15;
      Boolean var16 = false;
      this.f33000[3] = var16;
   }

   private void m28000(long var1, Rec0188 var3, boolean var4, boolean var5) {
      float var6 = var3.m14000();
      int var7 = !var3.m4000() && !(var6 >= f22000[3]) && (var3.m16000() || !(var6 >= f39000[0])) ? 0 : 1;
      Float var14 = C0052.m8000(var7 != 0 ? f20000[1] : f20000[2], var7 != 0 ? f20000[3] : f20000[4]);
      this.f2000[f11000[1]] = var14;
      Float var15 = C0052.m8000(var5 && var4 ? f14000[0] : f14000[1], var7 != 0 ? f14000[2] : f14000[3]);
      this.f2000[3] = var15;
      Float var16 = C0052.m8000(var7 != 0 ? f14000[4] : f14000[5], var7 != 0 ? f14000[6] : f28000[0]);
      this.f2000[4] = var16;
      Float var17 = C0052.m8000(f28000[1], var7 != 0 ? f28000[2] : f28000[3]);
      this.f2000[5] = var17;
      Boolean var18 = var3.m4000() && var6 <= f39000[1] || var3.m16000() && var6 <= f39000[2] || Math.random() < f28000[4];
      this.f33000[2] = var18;
      if ((Boolean)this.f33000[2]) {
         float var9 = Math.random() > f28000[5] ? f39000[3] : f39000[4];
         Float var19 = var9 * C0052.m8000(var7 != 0 ? f28000[6] : f28000[7], var7 != 0 ? f13000[0] : f13000[1]);
         this.f33000[0] = var19;
         Float var20 = C0052.m8000(var7 != 0 ? f40000[0] : f40000[1], var7 != 0 ? f40000[2] : f40000[3]);
         this.f33000[1] = var20;
         Float var21 = Math.max((Float)this.f2000[2], C0052.m8000(f40000[4], f5000[0]));
         this.f2000[2] = var21;
         Float var22 = Math.max((Float)this.f2000[3], C0052.m8000(f5000[1], f5000[2]));
         this.f2000[3] = var22;
         Float var23 = Math.max((Float)this.f2000[4], C0052.m8000(f17000[0], f17000[1]));
         this.f2000[4] = var23;
         Float var24 = Math.max((Float)this.f2000[5], C0052.m8000(f17000[2], f17000[3]));
         this.f2000[5] = var24;
      } else {
         Float var25 = f9000[0];
         this.f33000[0] = var25;
         Float var26 = f9000[1];
         this.f33000[1] = var26;
      }

      Long var27 = var1;
      this.f4000[1] = var27;
      Long var28 = var1 + (long)C0052.m8000(this.f33000[2] ? f32000[0] : f32000[1], this.f33000[2] ? f32000[2] : (var7 != 0 ? f32000[3] : f32000[4]));
      this.f2000[0] = var28;
      Long var29 = var1 + (long)C0052.m8000(this.f33000[2] ? f32000[5] : f32000[6], this.f33000[2] ? f15000[0] : (var7 != 0 ? f15000[1] : f15000[2]));
      this.f4000[0] = var29;
      Float var30 = C0052.m8000(f15000[3], var7 != 0 ? f15000[4] : f15000[5]);
      this.f2000[1] = var30;
      Boolean var31 = true;
      this.f33000[3] = var31;
   }

   public OllisOr m34000(Rec0188 var1, boolean var2, boolean var3, boolean var4, long var5) {
      long var8 = System.currentTimeMillis();
      int var7 = var5 >= 500L && var4 ? 1 : 0;
      if (var7 != 0 || var1.m8000()) {
         Boolean var19 = false;
         this.f33000[3] = var19;
         Boolean var20 = false;
         this.f33000[2] = var20;
      }

      if (var8 >= (Long)this.f2000[0]) {
         Boolean var21 = false;
         this.f33000[3] = var21;
         Boolean var22 = false;
         this.f33000[2] = var22;
      }

      if (!(Boolean)this.f33000[3] && var8 >= (Long)this.f4000[0] && this.m24000(var1, var2, var3, var4, var5)) {
         this.m28000(var8, var1, var2, var4);
      }

      if (!(Boolean)this.f33000[3]) {
         return OllisOr.m10000();
      } else {
         float var11 = NNWE.N((float)(var8 - (Long)this.f4000[1]) / (float)Math.max(1L, (Long)this.f2000[0] - (Long)this.f4000[1]), f7000[0], f7000[1]);
         float var12 = (float)Math.pow(Math.max(f7000[2], f7000[3] - var11), f1000[0]);
         float var13 = f7000[4] + var12 * f29000[0];
         float var14 = this.f33000[2] ? Math.max(f29000[1], (float)Math.sin(var11 * f1000[1])) : f27000[0];
         return new OllisOr(
            true,
            NNWE.B(var13, f27000[1], (Float)this.f2000[2]),
            NNWE.B(var13, f34000[0], (Float)this.f2000[3]),
            NNWE.B(var13, f34000[1], f34000[2]),
            (Float)this.f2000[4],
            (Float)this.f2000[5],
            (Float)this.f33000[0] * var14,
            (Float)this.f33000[1] * var14,
            (Boolean)this.f33000[2] && var14 > f34000[3]
         );
      }
   }

   private static void m36000() {
      f25000 = new double[]{8.5, 14.5};
      f1000 = new double[]{0.54F, Math.PI, 0.38, 0.24};
      f20000 = new double[]{0.18, 1.48, 1.24, 2.36, 1.82};
      f14000 = new double[]{1.12, 1.02, 1.46, 1.28, 0.52, 0.38, 0.86};
      f28000 = new double[]{0.68, 0.24, 0.52, 0.42, 0.18, 0.5, 2.2, 1.25};
      f13000 = new double[]{5.4, 3.6};
      f40000 = new double[]{-1.75, -0.95, 1.75, 0.95, 1.74};
      f5000 = new double[]{2.42, 1.18, 1.52};
      f17000 = new double[]{0.62, 0.9, 0.34, 0.58};
      f32000 = new double[]{120.0, 72.0, 230.0, 150.0, 126.0, 260.0, 340.0};
      f15000 = new double[]{760.0, 880.0, 1120.0, 4.8, 12.5, 9.8};
   }
}

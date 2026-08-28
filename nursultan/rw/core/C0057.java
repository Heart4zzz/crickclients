package rw.core;

import KDFzREm.NNWE;
import KDFzREm.NNiz;
import KDFzREm.NNuU;
import rw.data.OllisOr;
import rw.data.OltpmilOn;
import rw.data.Rec0020;
import rw.data.Rec0028;
import rw.data.Rec0030;
import rw.data.Rec0188;
import rw.data.SpeedX;

public class C0057 {
   private static float[] f1000;
   private static float[] f2000;
   private static short[] f3000;
   private static float[] f4000;
   private static double[] f5000;
   private static float[] f6000;
   private static double[] f7000;
   private static short[] f8000;
   public Object[] f9000;
   private static float[] f10000;
   private static double[] f11000;
   private static float[] f12000;
   private static float[] f13000;
   private static double[] f14000;
   private static double[] f15000;
   private static double[] f16000;
   private static float[] f17000;
   private static short[] f18000;
   private static short[] f19000;
   private static short[] f20000;
   private static float[] f21000;
   private static double[] f22000;
   private static float[] f23000;
   private static short[] f24000;
   private static double[] f25000;
   private static short[] f26000;
   private static short[] f27000;
   private static double[] f28000;
   private static double[] f29000;
   private static short[] f30000;
   private static float[] f31000;
   private static double[] f32000;
   private static short[] f33000;
   private static double[] f34000;
   private static double[] f35000;
   private static double[] f36000;
   private static double[] f37000;
   private static float[] f38000;
   private static double[] f39000;
   private static double[] f40000;
   public Object[] f41000;
   private static short[] f42000;
   private static float[] f43000;
   private static short[] f44000;
   private static short[] f45000;
   private static float[] f46000;
   public Object[] f47000;
   private static short[] f48000;
   private static double[] f49000;
   private static float[] f50000;
   private static float[] f51000;
   private static double[] f52000;

   private float m2000(int var1) {
      return NNWE.N((float)Math.sqrt(Math.max(f12000[2], (float)var1) / f12000[3]), f12000[4], f17000[0]);
   }

   private float m4000(long var1) {
      if ((Long)this.f9000[1] <= 0L) {
         Long var8 = var1;
         this.f9000[1] = var8;
         return f31000[4];
      } else {
         float var3 = NNWE.N((float)(var1 - (Long)this.f9000[1]) / f21000[0], f21000[1], f21000[2]);
         Long var9 = var1;
         this.f9000[1] = var9;
         return var3;
      }
   }

   private float m10000() {
      if ((NNiz)((NNuU)C0768.f1000[0]).i[7] == null) {
         return f38000[5];
      } else {
         double var1 = (Double)((NNiz)((NNuU)C0768.f1000[0]).i[7]).u().method_41753();
         double var3 = var1 * f34000[2] + f34000[3];
         return NNWE.N((float)(f34000[4] + var3 * var3 * f34000[5]), f12000[0], f12000[1]);
      }
   }

   public C0057() {
      this.m16000();
      C0072 var5 = new C0072();
      this.f47000[f8000[0]] = var5;
      C0045 var6 = new C0045();
      this.f47000[f8000[1]] = var6;
      C0053 var7 = new C0053();
      this.f47000[f8000[2]] = var7;
      C0067 var8 = new C0067();
      this.f47000[f8000[3]] = var8;
      C0063 var9 = new C0063();
      this.f47000[f8000[4]] = var9;
      C0060 var10 = new C0060();
      this.f9000[f8000[5]] = var10;
      Float var11 = f1000[0];
      this.f9000[f8000[6]] = var11;
      Float var12 = f1000[1];
      this.f41000[0] = var12;
      Float var13 = f1000[2];
      this.f41000[1] = var13;
      Float var14 = C0052.m8000(f15000[0], f15000[1]);
      this.f41000[2] = var14;
   }

   static {
      ntfClinit();
   }

   private static void m12000() {
      f1000 = new float[]{1.0F, 1.0F, 1.0F, 0.0F};
      f23000 = new float[]{0.0F, 1.0F, 1.0F, 1.0F, 7.2F};
      f43000 = new float[]{3.1F, 0.64F, 1.0F, 0.62F, 1.4F};
      f4000 = new float[]{0.56F, 1.2F, 1.15F, 0.72F};
      f51000 = new float[]{0.78F, 0.72F, 0.34F, 0.26F, 0.0F, 1.0F, 0.0F};
      f46000 = new float[]{1.0F, 0.0F, 0.78F, 0.62F, 0.0F, 0.48F, 0.94F};
      f2000 = new float[]{0.82F, 0.72F, 1.24F};
      f10000 = new float[]{1.12F, 1.0F, 0.14F};
      f31000 = new float[]{0.18F, 0.61F, 0.28F, 0.0F, 1.0F};
      f21000 = new float[]{50.0F, 0.35F, 1.8F, 8.2F};
      f50000 = new float[]{3.5F, 4.0F, 2.25F, 18.0F, 1.0F, 1.0E-4F, 0.76F};
      f13000 = new float[]{0.69F, 0.62F, 0.56F, 1.0F, 2.35F, 1.55F, 1.24F};
      f6000 = new float[]{0.82F, 0.76F, 0.58F, 0.42F, 0.3F, 58.0F, 28.0F};
      f38000 = new float[]{12.0F, 6.6F, 2.4F, 0.95F, 1.55F, 1.0F};
      f12000 = new float[]{0.62F, 1.72F, 400.0F, 800.0F, 0.7F};
      f17000 = new float[]{2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F};
   }

   private static void m14000() {
      f8000 = new short[]{0, 1, 2, 3, 4, 0, 7};
      f19000 = new short[]{0, 1, 2, 1, 2, 3};
      f30000 = new short[]{4, 5, 6, 7, 0};
      f20000 = new short[]{1, 2};
      f45000 = new short[]{0, 1, 2, 3, 4, 0, 0, 1};
      f27000 = new short[]{7, 7, 3, 3, 4, 5, 5};
      f26000 = new short[]{5, 6, 6, 6};
      f18000 = new short[]{5, 5, 6, 6, 5, 5};
      f42000 = new short[]{6, 6, 2, 0, 2, 1};
      f33000 = new short[]{5, 0, 2, 6};
      f24000 = new short[]{1, 1, 1, 1, 4};
      f48000 = new short[]{0, 1, 2, 4, 3, 2};
      f3000 = new short[]{3, 7};
      f44000 = new short[]{3, 2, 7, 0, 7, 0, 7};
   }

   private void m16000() {
      if (this.f47000 == null) {
         this.f47000 = new Object[5];
         Object[] var1 = this.f47000;
      }

      if (this.f9000 == null) {
         this.f9000 = new Object[8];
         Object[] var2 = this.f9000;
         var2[1] = 0L;
         var2[2] = 0L;
         var2[3] = 0L;
         var2[4] = 0L;
         var2[5] = f17000[1];
         var2[6] = f17000[2];
         var2[7] = f17000[3];
      }

      if (this.f41000 == null) {
         this.f41000 = new Object[3];
         Object[] var3 = this.f41000;
         var3[0] = f17000[4];
         var3[1] = f17000[5];
         var3[2] = f17000[6];
      }
   }

   private static void m28000() {
      f15000 = new double[]{0.0, Math.PI * 2, 0.0, Math.PI * 2, 0.035F};
      f16000 = new double[]{0.54, 0.78, 0.34, 0.54, 0.92};
      f32000 = new double[]{1.06, 0.68, 0.9, 1.06, 1.18, 1.02};
      f5000 = new double[]{1.12, 0.92};
      f14000 = new double[]{1.18, 0.75, 1.05, 0.82, 1.04};
      f49000 = new double[]{0.54, 0.82, 1.2, 3.3};
      f28000 = new double[]{0.8, 1.9, 0.86, 1.0, 0.82, 1.0, 0.82};
      f35000 = new double[]{1.0, 0.42, 0.66, 0.66, 0.9, 0.72, 0.94, 0.68};
      f29000 = new double[]{0.92, 0.64, 0.86, 0.28, 0.46, 0.48};
      f37000 = new double[]{0.7, 0.42, 0.28};
      f22000 = new double[]{0.68, 0.48};
      f11000 = new double[]{0.58, 0.82};
      f39000 = new double[]{0.68, 0.92, 0.44, 0.7, 0.018, 0.014, 0.9, 0.78};
      f25000 = new double[]{1.28, 1.16, 0.72};
      f52000 = new double[]{1.18, 1.06};
      f36000 = new double[]{0.0, Math.PI * 2};
      f40000 = new double[]{85.0, 160.0};
      f7000 = new double[]{210.0, 420.0, 1.04, 1.46, 1.28, 55.0, 138.0};
      f34000 = new double[]{230.0, 620.0, 0.6, 0.2, 0.64, 1.72};
   }

   public Rec0028 m32000(C0768 var1, C0983 var2, Rec0188 var3, boolean var4, boolean var5, boolean var6) {
      long var11 = System.currentTimeMillis();
      float var13 = this.m4000(var11);
      this.m42000(var11, var5);
      double var14 = C0070.m16000();
      float var16 = (float)Math.max(var14, f15000[4]);
      float var17 = var3.m14000();
      float var18 = var3.m2000();
      OllisOr var19 = ((C0072)this.f47000[0]).m34000(var3, var4, var5, var6, var1.m24000().m12000());
      Rec0020 var20 = ((C0045)this.f47000[1]).m40000(var3, var16, var5);
      int var21 = var3.m16000() && !var3.m4000() && !var3.m28000() && !var3.m8000() && !var5 && !var4 && var17 <= f23000[4] && var18 <= f43000[0] ? 1 : 0;
      boolean var22 = this.m36000(var11, var3, var4, var6);
      int var23 = !var3.m8000() && !var22 && !var19.m20000() ? 0 : 1;
      float var24 = this.m10000();
      float var25 = this.m2000(var1.m12000());
      float var26 = var24 * var25;
      float var27 = this.m40000(var17, var16, var26, (boolean)var23, true);
      float var10 = var3.m22000() ? var16 : this.m40000(var18, var16, var26 * f43000[1], (boolean)var23, false);
      if (var23 != 0) {
         var27 = Math.max(var27, var17 * C0052.m8000(f16000[0], f16000[1]) * (Float)this.f9000[7]);
         var10 = var3.m22000() ? var16 : Math.max(var10, var18 * C0052.m8000(f16000[2], f16000[3]) * (Float)this.f9000[7]);
      }

      if (var3.m8000()) {
         var27 = Math.max(var27, var17 * C0052.m8000(f16000[4], f32000[0]));
         var10 = var3.m22000() ? var16 : Math.max(var10, var18 * C0052.m8000(f32000[1], f32000[2]));
      }

      if (var19.m20000()) {
         var27 = Math.max(var27, var17 * var19.m18000() * var19.m12000() * C0052.m8000(f32000[3], f32000[4]));
         var10 = var3.m22000() ? var16 : Math.max(var10, var18 * var19.m8000() * var19.m4000() * C0052.m8000(f32000[5], f5000[0]));
      }

      if (var19.m28000()) {
         var27 = Math.max(var27, Math.abs(var19.m30000()) * C0052.m8000(f5000[1], f14000[0]));
         var10 = var3.m22000() ? var16 : Math.max(var10, Math.abs(var19.m16000()) * C0052.m8000(f14000[1], f14000[2]));
      }

      if (var20.m2000()) {
         float var29 = NNWE.B(var20.m8000(), f43000[2], var20.m16000());
         var27 = Math.max(var27, var17 * C0052.m8000(f14000[3], f14000[4]) * var29);
         var10 = var3.m22000() ? var16 : Math.max(var10, var18 * C0052.m8000(f49000[0], f49000[1]) * var29);
      }

      if (var21 != 0 && !var19.m20000()) {
         var27 = Math.max(var16, Math.min(var27, var17 * f43000[3] + var16 * f43000[4]));
         var10 = var3.m22000() ? var16 : Math.max(var16, Math.min(var10, var18 * f4000[0] + var16 * f4000[1]));
      } else {
         var27 = ((C0067)this.f47000[3]).m28000(var27, var17, var16, (boolean)var23, var3.m4000(), true);
         var10 = var3.m22000() ? var16 : ((C0067)this.f47000[3]).m28000(var10, var18, var16, (boolean)var23, var3.m4000(), false);
      }

      if (var3.m16000() && var17 < f4000[2] && var18 < f4000[3]) {
         var27 = Math.min(var27, var16 * C0052.m8000(f49000[2], f49000[3]));
         var10 = var3.m22000() ? var16 : Math.min(var10, var16 * C0052.m8000(f28000[0], f28000[1]));
      }

      var27 = this.m38000(var27, var17, var16, (boolean)var23);
      var10 = this.m38000(var10, var18, var16, (boolean)var23);
      float var9 = var20.m2000()
         ? C0052.m8000(f28000[2], f28000[3])
         : (
            var19.m20000()
               ? var19.m2000()
               : (
                  var3.m8000()
                     ? C0052.m8000(f28000[4], f28000[5])
                     : (var22 ? C0052.m8000(f28000[6], f35000[0]) : (var3.m16000() ? C0052.m8000(f35000[1], f35000[2]) : C0052.m8000(f35000[3], f35000[4])))
               )
         );
      float var8 = var20.m2000()
         ? C0052.m8000(f35000[5], f35000[6])
         : (
            var19.m20000()
               ? Math.max(f51000[0], var19.m2000() * f51000[1])
               : (
                  var3.m8000()
                     ? C0052.m8000(f35000[7], f29000[0])
                     : (var22 ? C0052.m8000(f29000[1], f29000[2]) : (var3.m16000() ? C0052.m8000(f29000[3], f29000[4]) : C0052.m8000(f29000[5], f37000[0])))
               )
         );
      if (var21 != 0 && !var19.m20000()) {
         var9 = Math.min(var9, f51000[2]);
         var8 = Math.min(var8, f51000[3]);
      }

      OltpmilOn var52 = ((C0063)this.f47000[4]).m26000(var3, var10, var8, var16, (boolean)var23);
      var10 = var52.m4000();
      var8 = var52.m6000();
      Float var40 = (Float)this.f9000[5] + (var27 - (Float)this.f9000[5]) * NNWE.N(var9 * var13, f51000[4], f51000[5]);
      this.f9000[5] = var40;
      Float var41 = (Float)this.f9000[6] + (var10 - (Float)this.f9000[6]) * NNWE.N(var8 * var13, f51000[6], f46000[0]);
      this.f9000[6] = var41;
      if (var19.m20000() || var20.m2000()) {
         float var30 = NNWE.N(
            C0052.m8000(var20.m2000() ? f37000[1] : f37000[2], var20.m2000() ? f22000[0] : f22000[1]) * var13, f46000[1], var20.m2000() ? f46000[2] : f46000[3]
         );
         Float var42 = NNWE.B(var30, (Float)this.f9000[5], var27);
         this.f9000[5] = var42;
         if (!var3.m22000()) {
            float var31 = NNWE.N(var30 * C0052.m8000(f11000[0], f11000[1]), f46000[4], f46000[5]);
            Float var43 = NNWE.B(var31, (Float)this.f9000[6], var10);
            this.f9000[6] = var43;
         }

         float var54 = var20.m2000() ? C0052.m8000(f39000[0], f39000[1]) : var19.m18000();
         float var32 = var20.m2000() ? C0052.m8000(f39000[2], f39000[3]) : var19.m8000();
         Float var44 = Math.max((Float)this.f9000[5], this.m38000(var17 * var54 * f46000[6], var17, var16, true));
         this.f9000[5] = var44;
         if (!var3.m22000()) {
            Float var45 = Math.max((Float)this.f9000[6], this.m38000(var18 * var32 * f2000[0], var18, var16, true));
            this.f9000[6] = var45;
         }
      }

      float var53 = (float)Math.sin(var11 * f39000[4] + ((Float)this.f41000[2]).floatValue()) * var16 * f2000[1] * (Float)this.f41000[0];
      float var7 = var3.m4000() ? f2000[2] : (var19.m28000() ? f10000[0] : f10000[1]);
      if (var21 != 0 && !var19.m20000()) {
         var7 *= f10000[2];
      }

      if (var21 != 0 && !var19.m20000()) {
         var53 *= f31000[0];
      }

      float var55 = (float)Math.cos(var11 * f39000[5] + (Float)this.f41000[2] * f31000[1]) * var16 * f31000[2] * (Float)this.f41000[1] * var7;
      float var56 = Math.max(var16, (Float)this.f9000[5] + var53);
      Rec0030 var33 = ((C0060)this.f9000[0]).m28000(var56, var17, var16, (boolean)var23, (boolean)var21, var19.m20000());
      var56 = var33.m4000();
      SpeedX var34 = ((C0053)this.f47000[2]).m34000(var1, var2, var3, var56, var16, var23 != 0 || var33.m6000(), var19.m20000() || var20.m2000(), var6);
      var56 = var34.m6000();
      float var35 = Math.max(var16, (Float)this.f9000[6] + (var3.m22000() ? f31000[3] : var55));
      return new Rec0028(
         this.m38000(var56, var17, var16, var23 != 0 || var33.m6000() || var34.m4000()),
         var3.m22000() ? var16 : this.m38000(var35, var18, var16, (boolean)var23),
         var23 != 0 || var33.m6000() || var34.m4000(),
         var19.m30000(),
         var19.m16000(),
         var19.m28000()
      );
   }

   private boolean m36000(long var1, Rec0188 var3, boolean var4, boolean var5) {
      int var7 = !var3.m8000()
            && (!var3.m10000() || var3.m16000() && !(var3.m14000() > f21000[3]) && !(var3.m2000() > f50000[0]))
            && (!var5 || !var4 || !(var3.m14000() > f50000[1]) && !(var3.m2000() > f50000[2]))
         ? 0
         : 1;
      int var6 = var1 < this.f9000[3] ? 1 : 0;
      if (var7 != 0 && var1 >= (Long)this.f9000[2] && var1 >= (Long)this.f9000[3]) {
         Float var13 = C0052.m8000(f7000[2], var3.m14000() > f50000[3] ? f7000[3] : f7000[4]);
         this.f9000[7] = var13;
         Long var14 = var1 + (long)C0052.m8000(f7000[5], f7000[6]);
         this.f9000[3] = var14;
         Long var15 = var1 + (long)C0052.m8000(f34000[0], f34000[1]);
         this.f9000[2] = var15;
         var6 = 1;
      }

      if (var6 == 0) {
         Float var16 = f50000[4];
         this.f9000[7] = var16;
      }

      return (boolean)(var7 == 0 && var6 == 0 ? 0 : 1);
   }

   private float m38000(float var1, float var2, float var3, boolean var4) {
      if (var2 <= var3 * f38000[2]) {
         return Math.max(var3, var1);
      } else {
         float var5 = var4 ? f38000[3] : f38000[4];
         float var6 = var3 * var5;
         return NNWE.N(var1, var3, Math.max(var3, var2 - var6));
      }
   }

   private float m40000(float var1, float var2, float var3, boolean var4, boolean var5) {
      if (var1 <= f50000[5]) {
         return var2;
      } else {
         float var6 = var1 / var2;
         float var7 = var4 ? (var5 ? f50000[6] : f13000[0]) : (var5 ? f13000[1] : f13000[2]);
         float var8 = (float)Math.pow(Math.max(f13000[3], var6), var7) * var2 * var3 * (var4 ? (var5 ? f13000[4] : f13000[5]) : (var5 ? f13000[6] : f6000[0]));
         float var9 = var4 ? (var5 ? f6000[1] : f6000[2]) : (var5 ? f6000[3] : f6000[4]);
         float var10 = var1 * var9;
         float var11 = Math.max(var8, var10);
         float var12 = var5 ? (var4 ? f6000[5] : f6000[6]) : (var4 ? f38000[0] : f38000[1]);
         return NNWE.N(var11, var2, var12);
      }
   }

   private void m42000(long var1, boolean var3) {
      if (var1 >= (Long)this.f9000[4]) {
         Float var8 = C0052.m8000(var3 ? f39000[6] : f39000[7], var3 ? f25000[0] : f25000[1]);
         this.f41000[0] = var8;
         Float var9 = C0052.m8000(f25000[2], var3 ? f52000[0] : f52000[1]);
         this.f41000[1] = var9;
         Float var10 = C0052.m8000(f36000[0], f36000[1]);
         this.f41000[2] = var10;
         Long var11 = var1 + (long)C0052.m8000(var3 ? f40000[0] : f40000[1], var3 ? f7000[0] : f7000[1]);
         this.f9000[4] = var11;
      }
   }

   public void m44000() {
      Long var5 = 0L;
      this.f9000[1] = var5;
      Long var6 = 0L;
      this.f9000[2] = var6;
      Long var7 = 0L;
      this.f9000[3] = var7;
      Long var8 = 0L;
      this.f9000[4] = var8;
      Float var9 = f1000[3];
      this.f9000[5] = var9;
      Float var10 = f23000[0];
      this.f9000[6] = var10;
      Float var11 = f23000[1];
      this.f9000[7] = var11;
      Float var12 = f23000[2];
      this.f41000[0] = var12;
      Float var13 = f23000[3];
      this.f41000[1] = var13;
      Float var14 = C0052.m8000(f15000[2], f15000[3]);
      this.f41000[2] = var14;
      ((C0072)this.f47000[0]).m26000();
      ((C0045)this.f47000[1]).m32000();
      ((C0053)this.f47000[2]).m30000();
      ((C0067)this.f47000[3]).m34000();
      ((C0063)this.f47000[4]).m24000();
      ((C0060)this.f9000[0]).m30000();
   }
}

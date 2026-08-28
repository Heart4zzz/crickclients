package rw.core;

import KDFzREm.NNWE;
import KDFzREm.NjL;
import rw.data.OlIirk;
import rw.data.Rec0024;

public class JrQo {
   private static float[] f1000;
   private static float[] f2000;
   private static float[] f3000;
   private static float[] f4000;
   public Object[] f5000;
   private static float[] f6000;
   private static float[] f7000;
   private static float[] f8000;
   private static float[] f9000;
   private static float[] f10000;
   private static float[] f11000;
   private static float[] f12000;
   private static float[] f13000;
   private static float[] f14000;
   private static float[] f15000;
   private static float[] f16000;
   private static float[] f17000;
   private static float[] f18000;
   private static float[] f19000;
   private static double[] f20000;
   private static float[] f21000;
   private static float[] f22000;
   private static float[] f23000;
   private static float[] f24000;
   private static float[] f25000;
   private static float[] f26000;
   private static float[] f27000;
   private static float[] f28000;
   public Object[] f29000;
   public Object[] f30000;
   private static float[] f31000;
   private static float[] f32000;
   public Object[] f33000;
   private static float[] f34000;
   private static float[] f35000;
   public Object[] f36000;
   private static float[] f37000;
   public static Object[] f38000;
   private static float[] f39000;
   private static float[] f40000;
   private static float[] f41000;
   private static float[] f42000;
   private static float[] f43000;
   private static float[] f44000;
   private static float[] f45000;
   private static float[] f46000;
   private static float[] f47000;
   private static float[] f48000;
   public Object[] f49000;

   private void m4000(float var1, float var2, float var3) {
      int var4 = this.m6000(var1, var3);
      int var5 = this.m6000(var2, var3);
      int var6 = this.f36000[6] ? var4 - (Integer)this.f36000[2] : 0;
      int var7 = this.f36000[6] ? var5 - (Integer)this.f36000[3] : 0;
      ((int[])this.f5000[1])[this.f36000[0]] = var4;
      ((int[])this.f5000[2])[this.f36000[0]] = var5;
      ((int[])this.f5000[3])[this.f36000[0]] = var6;
      ((int[])this.f5000[4])[this.f36000[0]] = var7;
      Integer var12 = ((Integer)this.f36000[0] + 1) % 14;
      this.f36000[0] = var12;
      Integer var13 = Math.min(14, (Integer)this.f36000[1] + 1);
      this.f36000[1] = var13;
      Integer var14 = var4;
      this.f36000[2] = var14;
      Integer var15 = var5;
      this.f36000[3] = var15;
      Integer var16 = var6;
      this.f36000[4] = var16;
      Integer var17 = var7;
      this.f36000[5] = var17;
      Boolean var18 = true;
      this.f36000[6] = var18;
   }

   private int m6000(float var1, float var2) {
      return Math.abs(var1) <= f2000[5] ? 0 : Math.round(var1 / var2);
   }

   public JrQo() {
      this.m20000();
      IllisOqkm var5 = new IllisOqkm();
      this.f5000[0] = var5;
      int[] var6 = new int[14];
      this.f5000[1] = var6;
      int[] var7 = new int[14];
      this.f5000[2] = var7;
      int[] var8 = new int[14];
      this.f5000[3] = var8;
      int[] var9 = new int[14];
      this.f5000[4] = var9;
      Float var10 = f6000[0];
      this.f49000[3] = var10;
      Float var11 = f6000[1];
      this.f33000[1] = var11;
      Float var12 = f45000[0];
      this.f33000[3] = var12;
      Float var13 = f45000[1];
      this.f29000[1] = var13;
      Float var14 = f45000[2];
      this.f29000[2] = var14;
      Float var15 = f4000[0];
      this.f29000[3] = var15;
   }

   static {
      ntfClinit();
   }

   private static void m16000() {
      f20000 = new double[]{0.035F, Math.PI, 2.7F, Math.PI, Math.PI, 2.0, Math.PI, 1.0E-5};
   }

   private static void m18000() {
      f6000 = new float[]{1.0F, 1.0F};
      f45000 = new float[]{1.0F, 1.0F, 1.0F};
      f4000 = new float[]{1.0F, 1.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F, 1.0F};
      f1000 = new float[]{1.0F, 1.0F, 0.0F, 0.0F, 0.18F, 0.55F, 0.35F};
      f21000 = new float[]{0.0F, 0.0F, 0.0F, -90.0F, 90.0F, 0.0F};
      f27000 = new float[]{1.0E-4F, 1.0F, 0.58F, 1.0F, 0.0F, 0.65F, 6.0F};
      f42000 = new float[]{3.2F, 0.46F, 0.38F};
      f10000 = new float[]{0.3F, 0.18F, 0.06F, 0.08F, 0.55F, 0.54F, 0.18F};
      f48000 = new float[]{0.0F, 0.1F, 0.0F, 0.14F, 0.0F, 16.0F, 8.0F, 0.0F};
      f22000 = new float[]{1.0F, 0.035F, 0.02F, 0.12F, 0.05F, 0.035F, 0.38F};
      f40000 = new float[]{0.92F, 0.16F, 0.0F, 0.07F, 0.045F, 0.86F, 1.34F, 0.0F};
      f24000 = new float[]{(float) (Math.PI * 2), 70.0F, 95.0F, 170.0F, 245.0F};
      f14000 = new float[]{210.0F, 320.0F, 620.0F, 980.0F, 0.18F, 1.0E-4F};
      f46000 = new float[]{1.18F, 1.0F, 0.14F, 0.0F, 0.18F};
      f12000 = new float[]{0.0F, 4.8F, 3.1F, 0.35F};
      f17000 = new float[]{0.16F, 0.58F, 0.0F, 0.0F, 1.0F, 1.0F, 0.22F, 0.0F};
      f32000 = new float[]{1.0F, 0.16F, 0.0F};
      f43000 = new float[]{0.1F, 0.0F, 0.12F, 0.0F, 0.9F, 0.04F, 1.14F, 0.12F};
      f41000 = new float[]{0.86F, 0.035F, 1.1F, 0.08F};
      f35000 = new float[]{0.26F, 0.12F, 0.58F, 1.08F, 1.34F};
      f47000 = new float[]{1.22F, 0.76F, 0.92F, 35.0F, 92.0F, 120.0F, 95.0F};
      f15000 = new float[]{140.0F, 260.0F, 420.0F, 0.045F, 0.055F, 0.16F, 0.0F, 0.1F};
      f19000 = new float[]{0.13F, 0.075F};
      f13000 = new float[]{180.0F, 420.0F, 0.45F, 0.42F};
      f9000 = new float[]{0.28F, 1.65F, 1.1F, 42.0F, 58.0F, 115.0F, 165.0F};
      f26000 = new float[]{420.0F, 620.0F};
      f3000 = new float[]{980.0F, 1450.0F, 1.0E-4F, -90.0F, 90.0F};
      f34000 = new float[]{0.0F, 1.0F, 95.0F};
      f44000 = new float[]{145.0F, 0.0F, 1.0F, 0.28F, 1.0F, 1.16F, 1.0F};
      f25000 = new float[]{0.34F, 0.0F, 0.45F, 0.22F, 0.28F, 1.18F, 0.22F, 0.86F};
      f31000 = new float[]{0.55F, 0.0F, 0.56F, 1.16F, 0.0F, -90.0F, 90.0F};
      f23000 = new float[]{0.82F, 0.66F, 0.48F, 0.32F};
      f8000 = new float[]{0.18F, 0.0F};
      f11000 = new float[]{0.0F, -90.0F, 90.0F, 0.0F, 0.35F, 0.45F};
      f28000 = new float[]{1.75F, 1.0E-4F, 0.0F};
      f7000 = new float[]{1.0E-4F, 2.4F, 3.2F, 1.65F, 3.0F, 0.85F, 1.45F};
      f2000 = new float[]{2.8F, 2.2F, 1.25F, 1.0E-4F, 0.0F, 1.0E-4F, 1.0E-4F};
      f18000 = new float[]{0.0F, 1.0F, -1.0F};
      f16000 = new float[]{1.0E-4F, 0.0F, 1.0F, -1.0F, 0.0F};
      f39000 = new float[]{0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F};
      f37000 = new float[]{0.0F, 0.0F, 0.0F};
   }

   private void m20000() {
      if (this.f5000 == null) {
         this.f5000 = new Object[6];
         Object[] var1 = this.f5000;
         var1[5] = 0L;
      }

      if (this.f30000 == null) {
         this.f30000 = new Object[3];
         Object[] var2 = this.f30000;
         var2[0] = 0L;
         var2[1] = 0L;
         var2[2] = 0L;
      }

      if (this.f49000 == null) {
         this.f49000 = new Object[4];
         Object[] var3 = this.f49000;
         var3[0] = 0L;
         var3[1] = 0L;
         var3[2] = 0L;
         var3[3] = f16000[4];
      }

      if (this.f33000 == null) {
         this.f33000 = new Object[4];
         Object[] var4 = this.f33000;
         var4[0] = f39000[0];
         var4[1] = f39000[1];
         var4[2] = f39000[2];
         var4[3] = f39000[3];
      }

      if (this.f29000 == null) {
         this.f29000 = new Object[5];
         Object[] var5 = this.f29000;
         var5[0] = f39000[4];
         var5[1] = f39000[5];
         var5[2] = f37000[0];
         var5[3] = f37000[1];
         var5[4] = f37000[2];
      }

      if (this.f36000 == null) {
         this.f36000 = new Object[7];
         Object[] var6 = this.f36000;
         var6[0] = 0;
         var6[1] = 0;
         var6[2] = 0;
         var6[3] = 0;
         var6[4] = 0;
         var6[5] = 0;
         var6[6] = false;
      }
   }

   private static void m26000() {
      f38000 = new Object[]{14};
   }

   private float m28000(long var1) {
      if (var1 >= (Long)this.f30000[0] && var1 < (Long)this.f30000[1]) {
         float var3 = NNWE.N((float)(var1 - (Long)this.f30000[0]) / (float)Math.max(1L, (Long)this.f30000[1] - (Long)this.f30000[0]), f17000[3], f17000[4]);
         float var4 = (float)Math.sin(var3 * f20000[3]);
         float var5 = f17000[5] + (float)Math.sin(var3 * f20000[4] * f20000[5] + ((Float)this.f29000[0]).floatValue()) * f17000[6];
         return NNWE.N((float)Math.pow(var4, ((Float)this.f33000[3]).floatValue()) * var5, f17000[7], f32000[0]);
      } else {
         return f17000[2];
      }
   }

   private boolean m30000(float var1, float var2, float var3) {
      int var5 = this.m6000(var1, var3);
      int var6 = this.m6000(var2, var3);
      if (var5 == 0 && var6 == 0) {
         return (boolean)0;
      } else {
         int var7 = this.f36000[6] ? var5 - (Integer)this.f36000[2] : 0;
         int var4 = this.f36000[6] ? var6 - (Integer)this.f36000[3] : 0;
         if ((Boolean)this.f36000[6] && var5 == (Integer)this.f36000[2] && var6 == (Integer)this.f36000[3]) {
            return (boolean)1;
         } else if ((Boolean)this.f36000[6]
            && (var7 != 0 || var4 != 0)
            && var7 == (Integer)this.f36000[4]
            && var4 == (Integer)this.f36000[5]
            && Math.abs(var5) + Math.abs(var6) > 3) {
            return (boolean)1;
         } else {
            for (int var9 = 0; var9 < this.f36000[1]; var9++) {
               if (((int[])this.f5000[1])[var9] == var5 && ((int[])this.f5000[2])[var9] == var6) {
                  return (boolean)1;
               }

               if (((int[])this.f5000[3])[var9] == var7 && ((int[])this.f5000[4])[var9] == var4 && (var7 != 0 || var4 != 0)) {
                  return (boolean)1;
               }
            }

            return (boolean)0;
         }
      }
   }

   private float m34000(float var1, float var2) {
      if (Math.abs(var2) > f2000[6]) {
         return var2 > f18000[0] ? f18000[1] : f18000[2];
      } else if (Math.abs(var1) > f16000[0]) {
         return var1 > f16000[1] ? f16000[2] : f16000[3];
      } else {
         return ((IllisOqkm)this.f5000[0]).m40000();
      }
   }

   private Rec0024 m38000(
      C0768 var1, NjL var2, C0983 var3, float var4, float var5, float var6, float var7, float var8, double var9, boolean var11, boolean var12, boolean var13
   ) {
      float var14 = var4;
      float var15 = var5;

      for (int var16 = 0; var16 < 8 && this.m30000(var14, var15, var8); var16++) {
         float var18 = this.m34000(var14, var6);
         float var19 = var11 ? this.m34000(var15, var7) : f25000[1];
         float var20 = f25000[2] + var16 * f25000[3];
         float var21 = var18 * var8 * ((IllisOqkm)this.f5000[0]).m26000(f25000[4], f25000[5] + var20);
         float var17 = var11 ? var19 * var8 * ((IllisOqkm)this.f5000[0]).m26000(f25000[6], f25000[7] + var20 * f31000[0]) : f31000[1];
         if (var16 % 2 == 1 && var11) {
            var17 = -var17 * ((IllisOqkm)this.f5000[0]).m26000(f31000[2], f31000[3]);
         }

         float var23 = this.m44000(this.m66000(var14 + var21, var6, var8, true, var13), var9);
         float var24 = var11 ? this.m44000(this.m66000(var15 + var17, var7, var8, false, var13), var9) : f31000[4];
         C0983 var25 = new C0983(var3.m38000() + var23, NNWE.N(var3.m68000() + var24, f31000[5], f31000[6]));
         if (!var12 || var13 || var2 == null || var1.m36000(var2, var25)) {
            var14 = var23;
            var15 = var24;
            break;
         }
      }

      return new Rec0024(var14, var15);
   }

   private float m40000(float var1, float var2, float var3, boolean var4) {
      if (!var4) {
         return f11000[3];
      } else if (Math.abs(var1) > var3 * f11000[4]) {
         return var1;
      } else {
         float var5 = Math.abs(var2) > var3 ? Math.signum(var2) * (Float)this.f49000[3] : ((IllisOqkm)this.f5000[0]).m40000();
         return var5 * var3 * ((IllisOqkm)this.f5000[0]).m26000(f11000[5], f28000[0]);
      }
   }

   private void m42000(long var1, float var3, boolean var4, boolean var5, boolean var6) {
      if (var1 >= (Long)this.f30000[2]) {
         float var7 = (var4 ? f32000[1] : f32000[2]) + (var5 ? f43000[0] : f43000[1]) + (var6 ? f43000[2] : f43000[3]);
         float var8 = f43000[4] - var7 * f43000[5];
         float var9 = f43000[6] + var7 * f43000[7];
         float var10 = f41000[0] - var7 * f41000[1];
         float var11 = f41000[2] + var7 * f41000[3];
         Float var16 = this.m56000((Float)this.f29000[1], var8, var9);
         this.f29000[1] = var16;
         Float var17 = this.m56000((Float)this.f29000[2], var10, var11);
         this.f29000[2] = var17;
         if (((IllisOqkm)this.f5000[0]).m34000(!var4 && !var6 ? f35000[1] : f35000[0])) {
            Float var18 = ((IllisOqkm)this.f5000[0]).m34000(f35000[2])
               ? ((IllisOqkm)this.f5000[0]).m26000(f35000[3], var4 ? f35000[4] : f47000[0])
               : ((IllisOqkm)this.f5000[0]).m26000(f47000[1], f47000[2]);
            this.f29000[3] = var18;
            Long var19 = var1 + (long)((IllisOqkm)this.f5000[0]).m26000(f47000[3], var5 ? f47000[4] : f47000[5]);
            this.f49000[0] = var19;
         }

         Long var20 = var1 + (long)((IllisOqkm)this.f5000[0]).m26000(var4 ? f47000[6] : f15000[0], var5 ? f15000[1] : f15000[2]);
         this.f30000[2] = var20;
      }
   }

   private float m44000(float var1, double var2) {
      if (!(Math.abs(var1) <= f2000[3]) && !(var2 <= f20000[7])) {
         int var4 = Math.round(var1 / (float)var2);
         if (var4 == 0) {
            var4 = var1 > f2000[4] ? 1 : -1;
         }

         return var4 * (float)var2;
      } else {
         return var1;
      }
   }

   private boolean m46000(long var1, float var3, float var4, float var5, boolean var6, boolean var7, boolean var8, boolean var9) {
      if (var1 >= (Long)this.f5000[5] && var1 >= (Long)this.f30000[1] && !(var4 <= var5 * f27000[5])) {
         float var11 = var8 && !var9 ? var5 * f27000[6] : var5 * f42000[0];
         if (var3 < var11 && !var7) {
            return (boolean)0;
         } else {
            float var10 = var9 ? f42000[1] : (var6 ? f42000[2] : (var7 ? f10000[0] : f10000[1]));
            if (var8 && !var9) {
               var10 -= f10000[2];
            }

            return ((IllisOqkm)this.f5000[0]).m34000(NNWE.N(var10, f10000[3], f10000[4]));
         }
      } else {
         return (boolean)0;
      }
   }

   private boolean m48000(long var1, C0768 var3, NjL var4, C0983 var5, float var6, float var7, boolean var8, boolean var9) {
      if (var4 != null && var8 && !var9 && var1 < (Long)this.f49000[2] && !(Math.abs((Float)this.f29000[4]) <= f3000[2])) {
         float var10 = this.m54000(var1, var7, false, false);
         C0983 var11 = new C0983(var5.m38000() + var6, NNWE.N(var5.m68000() + var10, f3000[3], f3000[4]));
         return var3.m36000(var4, var11);
      } else {
         return (boolean)0;
      }
   }

   private void m50000(long var1, float var3, float var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9) {
      if (var5 && var8 && !var9) {
         if (var1 >= (Long)this.f49000[2] && var1 >= (Long)this.f49000[1]) {
            float var10 = var7 ? f15000[7] : (var6 ? f19000[0] : f19000[1]);
            if (!((IllisOqkm)this.f5000[0]).m34000(var10)) {
               Long var17 = var1 + (long)((IllisOqkm)this.f5000[0]).m26000(f13000[0], f13000[1]);
               this.f49000[1] = var17;
            } else {
               float var11 = Math.abs(var3) > var4 * f13000[2] ? Math.signum(var3) : ((IllisOqkm)this.f5000[0]).m40000();
               Float var18 = var11 * var4 * ((IllisOqkm)this.f5000[0]).m26000(var6 ? f13000[3] : f9000[0], var6 ? f9000[1] : f9000[2]);
               this.f29000[4] = var18;
               Long var19 = var1 + (long)((IllisOqkm)this.f5000[0]).m26000(var6 ? f9000[3] : f9000[4], var7 ? f9000[5] : f9000[6]);
               this.f49000[2] = var19;
               Long var20 = var1 + (long)((IllisOqkm)this.f5000[0]).m26000(var7 ? f26000[0] : f26000[1], var7 ? f3000[0] : f3000[1]);
               this.f49000[1] = var20;
            }
         }
      } else {
         if (var1 >= (Long)this.f49000[2]) {
            Float var16 = f15000[6];
            this.f29000[4] = var16;
         }
      }
   }

   private float m54000(long var1, float var3, boolean var4, boolean var5) {
      if (var1 < (Long)this.f49000[2] && (Long)this.f49000[2] > 0L) {
         float var6 = NNWE.N((float)((Long)this.f49000[2] - var1) / Math.max(f34000[1], var4 ? f34000[2] : f44000[0]), f44000[1], f44000[2]);
         float var7 = NNWE.N((float)Math.sin(var6 * f20000[6]), f44000[3], f44000[4]);
         float var8 = var5 ? f44000[5] : f44000[6];
         return (Float)this.f29000[4] * var7 * var8 + ((IllisOqkm)this.f5000[0]).m32000(false, var3 * f25000[0]);
      } else {
         return f34000[0];
      }
   }

   private float m56000(float var1, float var2, float var3) {
      float var4 = ((IllisOqkm)this.f5000[0]).m26000(var2, var3);
      if (Math.abs(var4 - var1) < f15000[3]) {
         var4 += ((IllisOqkm)this.f5000[0]).m40000() * ((IllisOqkm)this.f5000[0]).m26000(f15000[4], f15000[5]);
      }

      return NNWE.N(var4, var2, var3);
   }

   private Rec0024 m58000(C0768 var1, NjL var2, C0983 var3, float var4, float var5, float var6, float var7, boolean var8) {
      for (float var13 : new float[]{f23000[0], f23000[1], f23000[2], f23000[3], f8000[0], f8000[1]}) {
         float var14 = NNWE.B(var13, var4, var6);
         float var15 = var8 ? NNWE.B(var13, var5, var7) : f11000[0];
         C0983 var16 = new C0983(var3.m38000() + var14, NNWE.N(var3.m68000() + var15, f11000[1], f11000[2]));
         if (var1.m36000(var2, var16)) {
            return new Rec0024(var14, var15);
         }
      }

      return new Rec0024(var4, var5);
   }

   private float[] m60000(long var1, float var3, float var4, float var5, float var6, float var7, boolean var8, boolean var9, boolean var10, boolean var11) {
      float var12 = this.m28000(var1);
      float var14 = var6;
      float var15 = var8 && Math.abs(var6) > var7 * f14000[4] ? var6 : this.m40000(var4, var3, var7, var8);
      float var16 = this.m62000(var5, var15);
      if (var16 <= f14000[5]) {
         return new float[]{var5, var6};
      } else {
         float var17 = (var9 ? f46000[0] : f46000[1]) + (var10 ? f46000[2] : f46000[3]) + (var11 ? f46000[4] : f12000[0]);
         float var18 = var7 * (var9 ? f12000[1] : f12000[2]) * var17;
         float var19 = Math.min(var18, Math.max(var7 * f12000[3], var16 * (Float)this.f33000[0])) * var12;
         float var20 = (float)Math.sin(var12 * f20000[1] * f20000[2] + ((Float)this.f29000[0]).floatValue())
            * var7
            * ((IllisOqkm)this.f5000[0]).m26000(f17000[0], f17000[1]);
         float var21 = -var15 / var16 * (Float)this.f49000[3];
         float var22 = var5 / var16 * (Float)this.f49000[3] * (Float)this.f33000[1];
         float var13 = var5 + (var21 * var19 - Math.signum(var5) * Math.abs(var5) * (Float)this.f33000[2] * var12);
         if (var8) {
            var14 = var6 + (var22 * var19 + var20);
         }

         return new float[]{var13, var14};
      }
   }

   private float m62000(float var1, float var2) {
      return (float)Math.sqrt(var1 * var1 + var2 * var2);
   }

   private float m66000(float var1, float var2, float var3, boolean var4, boolean var5) {
      if (Math.abs(var1) <= f28000[1]) {
         return f28000[2];
      } else if (Math.abs(var2) <= f7000[0]) {
         float var8 = var3 * (var4 ? f7000[1] : (var5 ? f7000[2] : f7000[3]));
         return NNWE.N(var1, -var8, var8);
      } else {
         float var6 = Math.signum(var2);
         if (Math.signum(var1) != var6 && Math.abs(var2) > var3 * f7000[4]) {
            float var9 = var3 * (var4 ? f7000[5] : f7000[6]);
            return NNWE.N(var1, -var9, var9);
         } else {
            float var7 = var3 * (var4 ? f2000[0] : (var5 ? f2000[1] : f2000[2]));
            return NNWE.N(var1, -Math.abs(var2) - var7, Math.abs(var2) + var7);
         }
      }
   }

   private void m68000(long var1, float var3, float var4, boolean var5, boolean var6, boolean var7) {
      Float var14 = ((IllisOqkm)this.f5000[0]).m34000(f10000[5]) ? -(Float)this.f49000[3] : ((IllisOqkm)this.f5000[0]).m40000();
      this.f49000[3] = var14;
      float var8 = (var5 ? f10000[6] : f48000[0]) + (var6 ? f48000[1] : f48000[2]) + (var7 ? f48000[3] : f48000[4]);
      float var9 = NNWE.N(var3 / Math.max(var4 * f48000[5], f48000[6]), f48000[7], f22000[0]);
      Float var15 = ((IllisOqkm)this.f5000[0]).m26000(f22000[1] + var8 * f22000[2], f22000[3] + var8 * f22000[4] + var9 * f22000[5]);
      this.f33000[0] = var15;
      Float var16 = ((IllisOqkm)this.f5000[0]).m26000(f22000[6], f40000[0] + var8 * f40000[1]);
      this.f33000[1] = var16;
      Float var17 = ((IllisOqkm)this.f5000[0]).m26000(f40000[2], var5 ? f40000[3] : f40000[4]);
      this.f33000[2] = var17;
      Float var18 = ((IllisOqkm)this.f5000[0]).m26000(f40000[5], f40000[6]);
      this.f33000[3] = var18;
      Float var19 = ((IllisOqkm)this.f5000[0]).m36000(f40000[7], f24000[0]);
      this.f29000[0] = var19;
      Long var20 = var1;
      this.f30000[0] = var20;
      Long var21 = var1 + (long)((IllisOqkm)this.f5000[0]).m26000(var5 ? f24000[1] : f24000[2], var6 ? f24000[3] : f24000[4]);
      this.f30000[1] = var21;
      Long var22 = var1 + (long)((IllisOqkm)this.f5000[0]).m26000(var5 ? f14000[0] : f14000[1], var6 ? f14000[2] : f14000[3]);
      this.f5000[5] = var22;
   }

   public void m70000() {
      Long var6 = 0L;
      this.f5000[5] = var6;
      Long var7 = 0L;
      this.f30000[0] = var7;
      Long var8 = 0L;
      this.f30000[1] = var8;
      Long var9 = 0L;
      this.f30000[2] = var9;
      Long var10 = 0L;
      this.f49000[0] = var10;
      Long var11 = 0L;
      this.f49000[1] = var11;
      Long var12 = 0L;
      this.f49000[2] = var12;
      Float var13 = f4000[1];
      this.f49000[3] = var13;
      Float var14 = f4000[2];
      this.f33000[0] = var14;
      Float var15 = f4000[3];
      this.f33000[1] = var15;
      Float var16 = f4000[4];
      this.f33000[2] = var16;
      Float var17 = f4000[5];
      this.f33000[3] = var17;
      Float var18 = f4000[6];
      this.f29000[0] = var18;
      Float var19 = f4000[7];
      this.f29000[1] = var19;
      Float var20 = f1000[0];
      this.f29000[2] = var20;
      Float var21 = f1000[1];
      this.f29000[3] = var21;
      Float var22 = f1000[2];
      this.f29000[4] = var22;
      Integer var23 = 0;
      this.f36000[0] = var23;
      Integer var24 = 0;
      this.f36000[1] = var24;
      Integer var25 = 0;
      this.f36000[2] = var25;
      Integer var26 = 0;
      this.f36000[3] = var26;
      Integer var27 = 0;
      this.f36000[4] = var27;
      Integer var28 = 0;
      this.f36000[5] = var28;
      Boolean var29 = false;
      this.f36000[6] = var29;

      for (int var1 = 0; var1 < 14; var1++) {
         ((int[])this.f5000[1])[var1] = 0;
         ((int[])this.f5000[2])[var1] = 0;
         ((int[])this.f5000[3])[var1] = 0;
         ((int[])this.f5000[4])[var1] = 0;
      }

      ((IllisOqkm)this.f5000[0]).m24000();
   }

   public OlIirk m72000(
      C0768 var1,
      NjL var2,
      C0983 var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      double var10,
      boolean var12,
      boolean var13,
      boolean var14,
      boolean var15,
      boolean var16
   ) {
      if (var3 == null) {
         return new OlIirk(var6, var7, var8, var9, var12);
      } else {
         float var18 = (float)Math.max(var10, f20000[0]);
         long var19 = System.currentTimeMillis();
         this.m42000(var19, var18, var13, var14, var16);
         this.m50000(var19, var5, var18, var12, var13, var14, var15, var16);
         float var21 = this.m62000(var4, var5);
         float var22 = this.m62000(var6, var7);
         if (this.m46000(var19, var21, var22, var18, var13, var14, var15, var16)) {
            this.m68000(var19, var21, var18, var13, var14, var16);
         }

         int var23 = var12 && !this.m48000(var19, var1, var2, var3, var6, var18, var15, var16) ? 0 : 1;
         float var24 = var6;
         float var17 = var23 != 0 ? var7 : f1000[3];
         if (var12 && var23 != 0 && Math.abs(var17) <= var18 * f1000[4]) {
            var17 = this.m54000(var19, var18, var13, var14);
         }

         if (var22 > var18 * f1000[5] || Math.abs(var17) > var18 * f1000[6]) {
            float[] var26 = this.m60000(var19, var4, var5, var6, var17, var18, (boolean)var23, var13, var14, var16);
            var24 = var26[0];
            var17 = var23 != 0 ? var26[1] : f21000[0];
         }

         var24 = this.m44000(this.m66000(var24, var4, var18, true, var16), var10);
         var17 = var23 != 0 ? this.m44000(this.m66000(var17, var5, var18, false, var16 || var12), var10) : f21000[1];
         Rec0024 var35 = this.m38000(var1, var2, var3, var24, var17, var4, var5, var18, var10, (boolean)var23, var15, var16);
         var24 = var35.m4000();
         var17 = var23 != 0 ? var35.m6000() : f21000[2];
         C0983 var27 = new C0983(var3.m38000() + var24, NNWE.N(var3.m68000() + var17, f21000[3], f21000[4]));
         if (var15 && !var16 && var2 != null && !var1.m36000(var2, var27)) {
            Rec0024 var28 = this.m58000(var1, var2, var3, var6, var12 ? f21000[5] : var7, var24, var17, (boolean)var23);
            var24 = var28.m4000();
            var17 = var28.m6000();
            var23 = var12 && !(Math.abs(var17) > f27000[0]) ? 0 : 1;
         }

         this.m4000(var24, var17, var18);
         float var36 = var19 < this.f49000[0] ? (Float)this.f29000[3] : f27000[1];
         float var29 = Math.max(var18, var8 * (Float)this.f29000[1] * var36);
         float var30 = Math.max(var18, var9 * (Float)this.f29000[2] * NNWE.B(f27000[2], var36, f27000[3]));
         return new OlIirk(var24, var23 != 0 ? var17 : f27000[4], var29, var30, var12 && var23 == 0);
      }
   }
}

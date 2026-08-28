package rw.core;

import KDFzREm.NNWE;
import KDFzREm.NjL;
import rw.data.Rec0014;
import rw.data.Rec0029;

public class C0064 {
   private static short[] f1000;
   private static short[] f2000;
   private static short[] f3000;
   private static double[] f4000;
   private static float[] f5000;
   private static short[] f6000;
   private static short[] f7000;
   private static float[] f8000;
   private static float[] f9000;
   private static short[] f10000;
   private static short[] f11000;
   private static float[] f12000;
   private static short[] f13000;
   private static short[] f14000;
   private static float[] f15000;
   private static float[] f16000;
   private static short[] f17000;
   private static short[] f18000;
   private static float[] f19000;
   private static short[] f20000;
   public Object[] f21000;
   private static float[] f22000;
   private static short[] f23000;
   private static short[] f24000;
   private static float[] f25000;
   public Object[] f26000;
   private static short[] f27000;
   private static short[] f28000;
   private static short[] f29000;
   private static short[] f30000;
   private static short[] f31000;
   private static float[] f32000;
   public Object[] f33000;
   private static float[] f34000;
   private static float[] f35000;
   private static short[] f36000;
   private static short[] f37000;
   private static short[] f38000;
   private static float[] f39000;
   private static short[] f40000;
   private static short[] f41000;
   private static short[] f42000;
   public Object[] f43000;
   private static short[] f44000;
   private static short[] f45000;
   private static float[] f46000;
   private static float[] f47000;
   public static Object[] f48000;
   private static short[] f49000;
   private static float[] f50000;
   private static float[] f51000;
   private static float[] f52000;

   private int m2000() {
      return this.f21000[4] && this.f26000[7] != 0 ? ((int[])this.f33000[2])[(this.f26000[6] - 1 + 18) % 18] : 0;
   }

   private int m8000() {
      return this.f21000[4] && this.f26000[7] != 0 ? ((int[])this.f33000[1])[(this.f26000[6] - 1 + 18) % 18] : 0;
   }

   public C0064() {
      this.m74000();
      IllisOqkm var5 = new IllisOqkm();
      this.f43000[0] = var5;
      int[] var6 = new int[18];
      this.f43000[1] = var6;
      int[] var7 = new int[18];
      this.f43000[2] = var7;
      int[] var8 = new int[18];
      this.f43000[3] = var8;
      int[] var9 = new int[18];
      this.f33000[0] = var9;
      int[] var10 = new int[18];
      this.f33000[1] = var10;
      int[] var11 = new int[18];
      this.f33000[2] = var11;
      int[] var12 = new int[18];
      this.f33000[3] = var12;
      int[] var13 = new int[18];
      this.f33000[4] = var13;
      int[] var14 = new int[18];
      this.f33000[5] = var14;
      int[] var15 = new int[18];
      this.f26000[0] = var15;
   }

   static {
      ntfClinit();
   }

   private static void m16000() {
      f4000 = new double[]{0.035F, 1.0E-5, 1.0E-5, 0.035F, 0.035F, 1.0E-5, 1.0E-5};
   }

   private static void m20000() {
      f9000 = new float[]{0.0F, 0.0F, 0.0F};
      f25000 = new float[]{0.0F, 0.0F};
      f12000 = new float[]{0.263728F, 0.327362F, 0.0F, 0.0F};
      f8000 = new float[]{0.127362F, 0.172638F, 0.0F, 0.0F, 0.0F};
      f16000 = new float[]{-90.0F, 90.0F, 0.0F, 0.004F, 0.183728F, 1.0F, 1.0F};
      f15000 = new float[]{0.58F, 0.0F, 0.42F};
      f39000 = new float[]{0.0F, 0.28F, 0.22F, 0.36F, 0.36F, 0.14F, 0.12F, 0.18F};
      f35000 = new float[]{0.18F, -0.083728F, 0.027362F, 0.117263F, 0.043728F, -0.063728F, 0.018273F};
      f5000 = new float[]{0.092736F, 0.027362F, 28.372639F, 42.736282F, 88.82736F, 136.37263F, 1.0E-4F, 4.372638F};
      f32000 = new float[]{2.172638F, 2.827362F, 1.372638F, 1.427362F, 1.0F, 1.0E-4F, 0.0F, 0.0F};
      f52000 = new float[]{0.0F, 0.75F, 0.24F, 4.8F, 3.2F};
      f19000 = new float[]{0.0F, 0.38F, 0.12F};
      f34000 = new float[]{2.8F, 1.75F, 0.55F, 1.15F, 0.42F, 0.35F, 0.8F, 0.0F};
      f22000 = new float[]{0.0F, 0.82F, 0.64F, 0.46F, 0.28F, -0.22F};
      f46000 = new float[]{0.0F, -90.0F, 90.0F, 1.0E-4F};
      f47000 = new float[]{0.0F, 0.68F, 0.68F, 1.0E-4F, 0.0F, 1.0E-4F};
      f51000 = new float[]{0.0F, 1.0F, -1.0F, 1.0E-4F};
      f50000 = new float[]{0.0F, 1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F};
   }

   private static void m22000() {
      f48000 = new Object[]{18};
   }

   private static void m30000() {
      f41000 = new short[]{0, 1, 2, 3};
      f6000 = new short[]{0, 1, 2, 3, 4, 5, 0};
      f37000 = new short[]{1, 2, 3, 4, 5};
      f29000 = new short[]{6, 7, 0, 1, 2, 3};
      f3000 = new short[]{4, 1, 2, 3, 0};
      f11000 = new short[]{1, 2, 3, 4};
      f24000 = new short[]{5, 0, 0, 2, 0, 3, 0, 4};
      f18000 = new short[]{5, 1};
      f31000 = new short[]{0, 2, 0};
      f44000 = new short[]{3, 0, 4, 0, 5, 0, 1};
      f17000 = new short[]{0, 1, 0, 0, 0, 0, 0};
      f38000 = new short[]{0, 0, 4};
      f7000 = new short[]{0, 4, 1, 4, 0, 1};
      f36000 = new short[]{4, 7, 3, 0, 1, 2, 3, 0};
      f45000 = new short[]{7, 6, 6, 3, 0, 3, 3, 0};
      f2000 = new short[]{0, 2, 3, 0, 4, 2};
      f13000 = new short[]{3, 7, 3, 4, 5, 0, 7};
      f23000 = new short[]{6, 6, 3, 4, 3, 4};
      f42000 = new short[]{0, 0};
      f49000 = new short[]{0, 4, 0};
      f30000 = new short[]{4, 1, 4, 2, 4, 3, 1, 6};
      f10000 = new short[]{2, 6, 3, 6, 0, 6, 1};
      f40000 = new short[]{6, 2, 6, 3, 6};
      f20000 = new short[]{4, 6, 5, 6, 0, 6};
      f27000 = new short[]{6, 6, 7, 7, 0};
      f1000 = new short[]{1, 2, 3, 4, 7};
      f14000 = new short[]{3, 0, 4, 7, 1, 6, 4, 7};
      f28000 = new short[]{2, 6, 4, 7, 6, 5, 0, 0};
   }

   private boolean m32000(int var1, boolean var2) {
      if (!(Boolean)this.f21000[4]) {
         return (boolean)0;
      } else {
         int var3 = var2 ? (Integer)this.f21000[2] : (Integer)this.f21000[3];
         int var4 = var1 - var3;
         int var5 = this.m46000(var2);
         if (var1 != var3 && (var4 != var5 || Math.abs(var4) > 2)) {
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;

            for (int var9 = 0; var9 < this.f26000[7]; var9++) {
               int var10 = var2 ? ((int[])this.f33000[3])[var9] : ((int[])this.f33000[4])[var9];
               int var11 = var2 ? ((int[])this.f33000[5])[var9] : ((int[])this.f26000[0])[var9];
               if (var10 == var1) {
                  var6++;
               }

               if (Math.abs(var10) == Math.abs(var1)) {
                  var7++;
               }

               if (var11 == var4 && var4 != 0) {
                  var8++;
               }
            }

            if (var6 <= 0 && var7 <= 1 && var8 <= 0) {
               if ((Integer)this.f26000[7] >= 4) {
                  int var15 = ((Integer)this.f26000[6] - 1 + 18) % 18;
                  int var16 = ((Integer)this.f26000[6] - 2 + 18) % 18;
                  int var17 = var2 ? ((int[])this.f33000[3])[var15] : ((int[])this.f33000[4])[var15];
                  int var12 = var2 ? ((int[])this.f33000[3])[var16] : ((int[])this.f33000[4])[var16];
                  int var13 = var1 - var17;
                  int var14 = var17 - var12;
                  if (var13 == var14) {
                     return (boolean)1;
                  }
               }

               return (boolean)0;
            } else {
               return (boolean)1;
            }
         } else {
            return (boolean)1;
         }
      }
   }

   private float m34000(float var1, double var2) {
      if (!(Math.abs(var1) <= f46000[3]) && !(var2 <= f4000[5])) {
         int var4 = Math.round(var1 / (float)var2);
         if (var4 == 0) {
            var4 = var1 > f47000[0] ? 1 : -1;
         }

         return var4 * (float)var2;
      } else {
         return var1;
      }
   }

   private void m40000(long var1, float var3, boolean var4, boolean var5) {
      if (var1 >= (Long)this.f26000[1]) {
         float var6 = (var4 ? f15000[0] : f15000[1]) + (var5 ? f15000[2] : f39000[0]);
         Float var11 = ((IllisOqkm)this.f43000[0]).m26000(-var3 * (f39000[1] + var6 * f39000[2]), var3 * (f39000[3] + var6 * f39000[4]));
         this.f26000[2] = var11;
         Float var12 = ((IllisOqkm)this.f43000[0]).m26000(-var3 * (f39000[5] + var6 * f39000[6]), var3 * (f39000[7] + var6 * f35000[0]));
         this.f26000[3] = var12;
         Float var13 = ((IllisOqkm)this.f43000[0]).m26000(f35000[1] - var6 * f35000[2], f35000[3] + var6 * f35000[4]);
         this.f26000[4] = var13;
         Float var14 = ((IllisOqkm)this.f43000[0]).m26000(f35000[5] - var6 * f35000[6], f5000[0] + var6 * f5000[1]);
         this.f26000[5] = var14;
         Long var15 = var1 + (long)((IllisOqkm)this.f43000[0]).m26000(var4 ? f5000[2] : f5000[3], var5 ? f5000[4] : f5000[5]);
         this.f26000[1] = var15;
      }
   }

   public void m44000() {
      Long var6 = 0L;
      this.f26000[1] = var6;
      Float var7 = f9000[0];
      this.f26000[2] = var7;
      Float var8 = f9000[1];
      this.f26000[3] = var8;
      Float var9 = f9000[2];
      this.f26000[4] = var9;
      Float var10 = f25000[0];
      this.f26000[5] = var10;
      Integer var11 = 0;
      this.f26000[6] = var11;
      Integer var12 = 0;
      this.f26000[7] = var12;
      Integer var13 = 0;
      this.f21000[0] = var13;
      Integer var14 = 0;
      this.f21000[1] = var14;
      Integer var15 = 0;
      this.f21000[2] = var15;
      Integer var16 = 0;
      this.f21000[3] = var16;
      Boolean var17 = false;
      this.f21000[f3000[0]] = var17;

      for (int var1 = 0; var1 < 18; var1++) {
         ((int[])this.f43000[f3000[1]])[var1] = 0;
         ((int[])this.f43000[f3000[2]])[var1] = 0;
         ((int[])this.f43000[f3000[3]])[var1] = 0;
         ((int[])this.f33000[f3000[4]])[var1] = 0;
         ((int[])this.f33000[1])[var1] = 0;
         ((int[])this.f33000[2])[var1] = 0;
         ((int[])this.f33000[3])[var1] = 0;
         ((int[])this.f33000[4])[var1] = 0;
         ((int[])this.f33000[5])[var1] = 0;
         ((int[])this.f26000[0])[var1] = 0;
      }

      ((IllisOqkm)this.f43000[0]).m24000();
   }

   private int m46000(boolean var1) {
      if ((Boolean)this.f21000[4] && (Integer)this.f26000[7] != 0) {
         int var2 = ((Integer)this.f26000[6] - 1 + 18) % 18;
         return var1 ? ((int[])this.f33000[5])[var2] : ((int[])this.f26000[0])[var2];
      } else {
         return 0;
      }
   }

   private int m48000(float var1, double var2) {
      if (!(Math.abs(var1) <= f47000[3]) && !(var2 <= f4000[6])) {
         int var4 = Math.round(var1 / (float)var2);
         return var4 == 0 ? (var1 > f47000[4] ? 1 : -1) : var4;
      } else {
         return 0;
      }
   }

   private int m50000(int var1, int var2, boolean var3) {
      if (var1 > var2) {
         return ((IllisOqkm)this.f43000[0]).m34000(f47000[1]) ? 1 : -1;
      } else if (var1 < var2) {
         return ((IllisOqkm)this.f43000[0]).m34000(f47000[2]) ? -1 : 1;
      } else {
         int var4 = this.m46000(var3);
         return var4 != 0 ? -Integer.signum(var4) : ((IllisOqkm)this.f43000[0]).m40000();
      }
   }

   private void m52000(float var1, float var2, float var3, float var4, double var5, float var7) {
      int var8 = this.m48000(var1, var5);
      int var9 = this.m48000(var2, var5);
      int var10 = this.f21000[4] ? var8 - (Integer)this.f21000[0] : 0;
      int var11 = this.f21000[4] ? var9 - (Integer)this.f21000[1] : 0;
      int var12 = Math.round(var3 / var7);
      int var13 = Math.round(var4 / var7);
      int var14 = this.f21000[4] ? var12 - (Integer)this.f21000[2] : 0;
      int var15 = this.f21000[4] ? var13 - (Integer)this.f21000[3] : 0;
      ((int[])this.f43000[1])[this.f26000[6]] = (var8 + 32768) * 65537 ^ var9 + 32768;
      ((int[])this.f43000[2])[this.f26000[6]] = (var12 + 32768) * 65537 ^ var13 + 32768;
      ((int[])this.f43000[3])[this.f26000[6]] = var8;
      ((int[])this.f33000[0])[this.f26000[6]] = var9;
      ((int[])this.f33000[1])[this.f26000[6]] = var10;
      ((int[])this.f33000[2])[this.f26000[6]] = var11;
      ((int[])this.f33000[3])[this.f26000[6]] = var12;
      ((int[])this.f33000[4])[this.f26000[6]] = var13;
      ((int[])this.f33000[5])[this.f26000[6]] = var14;
      ((int[])this.f26000[0])[this.f26000[6]] = var15;
      Integer var20 = ((Integer)this.f26000[6] + 1) % 18;
      this.f26000[6] = var20;
      Integer var21 = Math.min(18, (Integer)this.f26000[7] + 1);
      this.f26000[7] = var21;
      Integer var22 = var8;
      this.f21000[0] = var22;
      Integer var23 = var9;
      this.f21000[1] = var23;
      Integer var24 = var12;
      this.f21000[2] = var24;
      Integer var25 = var13;
      this.f21000[3] = var25;
      Boolean var26 = true;
      this.f21000[4] = var26;
   }

   private float m54000(float var1, float var2, boolean var3, boolean var4) {
      int var5 = Math.max(1, Math.round(var1 / var2));
      int var6 = var3 ? (Integer)this.f21000[2] : (Integer)this.f21000[3];

      for (int var7 = 0; var7 < 7 && this.m32000(var5, var3); var7++) {
         int var8 = this.m50000(var5, var6, var3);
         int var9 = var3 ? (var4 ? 9 : 6) : (var4 ? 6 : 4);
         var5 += var8 * ((IllisOqkm)this.f43000[0]).m42000(1 + var7 / 2, var9);
         var5 = Math.max(1, var5);
      }

      return var5 * var2;
   }

   private boolean m56000(float var1, float var2, double var3, boolean var5) {
      int var6 = this.m48000(var1, var3);
      int var7 = var5 ? 0 : this.m48000(var2, var3);
      if (var6 == 0 && var7 == 0) {
         return (boolean)0;
      } else {
         int var8 = this.f21000[4] ? var6 - (Integer)this.f21000[0] : 0;
         int var9 = this.f21000[4] ? var7 - (Integer)this.f21000[1] : 0;
         if ((Boolean)this.f21000[4] && var6 == (Integer)this.f21000[0] && var7 == (Integer)this.f21000[1]) {
            return (boolean)1;
         } else if ((Boolean)this.f21000[4] && var8 == this.m8000() && var9 == this.m2000() && Math.abs(var6) + Math.abs(var7) > 1) {
            return (boolean)1;
         } else {
            int var10 = 0;
            int var11 = 0;
            int var12 = 0;

            for (int var13 = 0; var13 < this.f26000[7]; var13++) {
               if (((int[])this.f43000[3])[var13] == var6 && ((int[])this.f33000[0])[var13] == var7) {
                  var10++;
               }

               if (((int[])this.f33000[1])[var13] == var8 && ((int[])this.f33000[2])[var13] == var9 && (var8 != 0 || var9 != 0)) {
                  var11++;
               }

               if (Math.abs(((int[])this.f43000[3])[var13]) == Math.abs(var6) && Math.abs(((int[])this.f33000[0])[var13]) == Math.abs(var7)) {
                  var12++;
               }
            }

            if (var10 <= 0 && var11 <= 0 && var12 <= 1) {
               if ((Integer)this.f26000[7] < 4) {
                  return (boolean)0;
               } else {
                  int var19 = ((Integer)this.f26000[6] - 1 + 18) % 18;
                  int var14 = ((Integer)this.f26000[6] - 2 + 18) % 18;
                  int var15 = var6 - ((int[])this.f43000[3])[var19];
                  int var16 = var7 - ((int[])this.f33000[0])[var19];
                  int var17 = ((int[])this.f43000[3])[var19] - ((int[])this.f43000[3])[var14];
                  int var18 = ((int[])this.f33000[0])[var19] - ((int[])this.f33000[0])[var14];
                  return (boolean)(var15 != var17 || var16 != var18 || var15 == 0 && var16 == 0 ? 0 : 1);
               }
            } else {
               return (boolean)1;
            }
         }
      }
   }

   public Rec0014 m58000(
      C0768 var1,
      NjL var2,
      C0983 var3,
      C0983 var4,
      C0983 var5,
      double var6,
      boolean var8,
      boolean var9,
      boolean var10,
      boolean var11,
      boolean var12,
      float var13,
      float var14
   ) {
      if (var3 != null && var4 != null && var5 != null) {
         float var15 = (float)Math.max(var6, f4000[0]);
         this.m40000(System.currentTimeMillis(), var15, var11, var12);
         float var16 = C0070.m12000(var3.m38000(), var5.m38000());
         float var17 = var8 ? f25000[1] : var5.m68000() - var3.m68000();
         float var18 = C0070.m12000(var3.m38000(), var4.m38000());
         float var19 = var4.m68000() - var3.m68000();
         float var20 = (Float)this.f26000[2] + ((IllisOqkm)this.f43000[0]).m32000(true, var15 * (f12000[0] + (var11 ? f12000[1] : f12000[2])));
         float var21 = var8 ? f12000[3] : (Float)this.f26000[3] + ((IllisOqkm)this.f43000[0]).m32000(false, var15 * (f8000[0] + (var12 ? f8000[1] : f8000[2])));
         var16 = this.m64000(var16 + var20, var18, var15, true, var11 || var12);
         var17 = var8 ? f8000[3] : this.m64000(var17 + var21, var19, var15, false, var11 || var12);
         var16 = this.m62000(var16, var6, true);
         var17 = var8 ? f8000[4] : this.m62000(var17, var6, false);
         Rec0029 var22 = this.m60000(var16, var17, var18, var19, var6, var8, var11 || var12);
         var16 = var22.m6000();
         var17 = var22.m4000();
         C0983 var23 = new C0983(var3.m38000() + var16, NNWE.N(var3.m68000() + var17, f16000[0], f16000[1]));
         if (var9 && !var10 && var1 != null && !var1.m36000(var2, var23)) {
            var23 = this.m70000(var1, var2, var3, var5, var16, var17, var6, var8);
            var16 = C0070.m12000(var3.m38000(), var23.m38000());
            var17 = var8 ? f16000[2] : var23.m68000() - var3.m68000();
         }

         float var24 = Math.max(f16000[3], var15 * f16000[4]);
         float var25 = this.m54000(Math.max(Math.abs(var16) + var24, var13 * (f16000[5] + (Float)this.f26000[4])), var24, true, var11 || var12);
         float var26 = this.m54000(Math.max(Math.abs(var17) + var24, var14 * (f16000[6] + (Float)this.f26000[5])), var24, false, var11 || var12);
         this.m52000(var16, var17, var25, var26, var6, var24);
         return new Rec0014(var23, var25, var26);
      } else {
         return new Rec0014(var5, var13, var14);
      }
   }

   private Rec0029 m60000(float var1, float var2, float var3, float var4, double var5, boolean var7, boolean var8) {
      if (var5 <= f4000[2]) {
         return new Rec0029(var1, var2);
      } else {
         float var9 = var1;
         float var10 = var7 ? f32000[7] : var2;

         for (int var11 = 0; var11 < 8 && this.m56000(var9, var10, var5, var7); var11++) {
            float var12 = this.m66000(var3, var9);
            float var13 = var7 ? f52000[0] : this.m66000(var4, var10);
            float var14 = var12 * (float)var5 * ((IllisOqkm)this.f43000[0]).m26000(f52000[1] + var11 * f52000[2], var8 ? f52000[3] : f52000[4]);
            float var15 = var7
               ? f19000[0]
               : var13 * (float)var5 * ((IllisOqkm)this.f43000[0]).m26000(f19000[1] + var11 * f19000[2], var8 ? f34000[0] : f34000[1]);
            if ((var11 & 1) == 1 && !var7) {
               var15 = -var15 * ((IllisOqkm)this.f43000[0]).m26000(f34000[2], f34000[3]);
            }

            if (var11 >= 3 && ((IllisOqkm)this.f43000[0]).m34000(f34000[4])) {
               var14 = -var14 * ((IllisOqkm)this.f43000[0]).m26000(f34000[5], f34000[6]);
            }

            var9 = this.m64000(var9 + var14, var3, (float)Math.max(var5, f4000[3]), true, var8);
            var10 = var7 ? f34000[7] : this.m64000(var10 + var15, var4, (float)Math.max(var5, f4000[4]), false, var8);
            var9 = this.m34000(var9, var5);
            var10 = var7 ? f22000[0] : this.m34000(var10, var5);
         }

         return new Rec0029(var9, var10);
      }
   }

   private float m62000(float var1, double var2, boolean var4) {
      if (!(Math.abs(var1) <= f32000[5]) && !(var2 <= f4000[1])) {
         int var5 = Math.round(var1 / (float)var2);
         if (var5 == 0) {
            var5 = var1 > f32000[6] ? 1 : -1;
         }

         int var6 = var4 ? (Integer)this.f21000[0] : (Integer)this.f21000[1];
         if (var5 == var6 && Math.abs(var5) > 1 || this.m72000(var5, var4) > 2) {
            int var7 = var5 == 0 ? ((IllisOqkm)this.f43000[0]).m40000() : (var5 > 0 ? 1 : -1);
            var5 += var7 * ((IllisOqkm)this.f43000[0]).m42000(1, var4 ? 4 : 3);
            if (var5 == 0) {
               var5 = var7;
            }
         }

         return var5 * (float)var2;
      } else {
         return var1;
      }
   }

   private float m64000(float var1, float var2, float var3, boolean var4, boolean var5) {
      if (Math.abs(var2) <= f5000[6]) {
         float var7 = var3 * (var4 ? f5000[7] : f32000[0]);
         return NNWE.N(var1, -var7, var7);
      } else {
         float var6 = var3 * (var4 ? f32000[1] : f32000[2]) * (var5 ? f32000[3] : f32000[4]);
         return NNWE.N(var1, -Math.abs(var2) - var6, Math.abs(var2) + var6);
      }
   }

   private float m66000(float var1, float var2) {
      if (Math.abs(var1) > f47000[5]) {
         return var1 > f51000[0] ? f51000[1] : f51000[2];
      } else if (Math.abs(var2) > f51000[3]) {
         return var2 > f50000[0] ? f50000[1] : f50000[2];
      } else {
         return ((IllisOqkm)this.f43000[0]).m40000();
      }
   }

   private C0983 m70000(C0768 var1, NjL var2, C0983 var3, C0983 var4, float var5, float var6, double var7, boolean var9) {
      float[] var10 = new float[]{f22000[1], f22000[2], f22000[3], f22000[4], f22000[5]};

      for (float var14 : var10) {
         C0983 var15 = new C0983(
            var3.m38000() + this.m34000(var5 * var14, var7), NNWE.N(var3.m68000() + (var9 ? f46000[0] : this.m34000(var6 * var14, var7)), f46000[1], f46000[2])
         );
         if (var1.m36000(var2, var15)) {
            return var15;
         }
      }

      return var4;
   }

   private int m72000(int var1, boolean var2) {
      int var3 = 0;

      for (int var4 = 0; var4 < this.f26000[7]; var4++) {
         int var5 = var2 ? ((int[])this.f43000[3])[var4] : ((int[])this.f33000[0])[var4];
         if (var5 == var1 || Math.abs(var5) == Math.abs(var1)) {
            var3++;
         }
      }

      return var3;
   }

   private void m74000() {
      if (this.f43000 == null) {
         this.f43000 = new Object[4];
         Object[] var1 = this.f43000;
      }

      if (this.f33000 == null) {
         this.f33000 = new Object[6];
         Object[] var2 = this.f33000;
      }

      if (this.f26000 == null) {
         this.f26000 = new Object[8];
         Object[] var3 = this.f26000;
         var3[1] = 0L;
         var3[2] = f50000[3];
         var3[3] = f50000[4];
         var3[4] = f50000[5];
         var3[5] = f50000[6];
         var3[6] = 0;
         var3[7] = 0;
      }

      if (this.f21000 == null) {
         this.f21000 = new Object[5];
         Object[] var4 = this.f21000;
         var4[0] = 0;
         var4[1] = 0;
         var4[2] = 0;
         var4[3] = 0;
         var4[4] = false;
      }
   }
}

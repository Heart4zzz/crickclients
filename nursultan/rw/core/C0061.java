package rw.core;

import KDFzREm.NNWE;
import KDFzREm.NjL;
import java.util.Arrays;

public class C0061 {
   private static short[] f1000;
   private static boolean[] f2000;
   private static boolean[] f3000;
   private static float[] f4000;
   private static boolean[] f5000;
   private static float[] f6000;
   private static boolean[] f7000;
   private static short[] f8000;
   public Object[] f9000;
   private static float[] f10000;
   private static short[] f11000;
   private static boolean[] f12000;
   private static boolean[] f13000;
   private static float[] f14000;
   private static boolean[] f15000;
   private static short[] f16000;
   private static short[] f17000;
   private static float[] f18000;
   private static float[] f19000;
   private static short[] f20000;
   private static boolean[] f21000;
   private static short[] f22000;
   private static float[] f23000;
   private static boolean[] f24000;
   private static boolean[] f25000;
   private static short[] f26000;
   private static short[] f27000;
   private static short[] f28000;
   private static boolean[] f29000;
   private static short[] f30000;
   private static float[] f31000;
   private static short[] f32000;
   private static short[] f33000;
   private static short[] f34000;
   private static float[] f35000;
   private static boolean[] f36000;
   private static float[] f37000;
   private static boolean[] f38000;
   public Object[] f39000;
   private static float[] f40000;
   private static boolean[] f41000;
   private static float[] f42000;
   private static boolean[] f43000;
   private static short[] f44000;
   private static boolean[] f45000;
   public Object[] f46000;
   private static float[] f47000;
   private static float[] f48000;
   private static short[] f49000;
   private static short[] f50000;
   private static short[] f51000;
   private static short[] f52000;
   private static float[] f53000;
   private static boolean[] f54000;
   public static Object[] f55000;
   private static float[] f56000;
   private static float[] f57000;
   private static short[] f58000;
   private static boolean[] f59000;
   private static boolean[] f60000;
   private static short[] f61000;
   private static short[] f62000;
   private static short[] f63000;
   private static double[] f64000;
   private static short[] f65000;
   private static short[] f66000;
   private static boolean[] f67000;
   private static short[] f68000;

   private void m2000(int var1, int var2) {
      int var3 = this.f39000[3] ? var1 - (Integer)this.f9000[2] : 0;
      int var4 = this.f39000[3] ? var2 - (Integer)this.f9000[3] : 0;
      int var5 = this.f39000[3] ? var3 - (Integer)this.f9000[4] : 0;
      int var6 = this.f39000[3] ? var4 - (Integer)this.f39000[0] : 0;
      ((int[])this.f46000[1])[this.f9000[0]] = var1;
      ((int[])this.f46000[2])[this.f9000[0]] = var2;
      ((int[])this.f46000[3])[this.f9000[0]] = var3;
      ((int[])this.f46000[4])[this.f9000[0]] = var4;
      ((int[])this.f46000[5])[this.f9000[0]] = this.m32000(var1, var2);
      Integer var11 = ((Integer)this.f9000[0] + 1) % 34;
      this.f9000[0] = var11;
      Integer var12 = Math.min(34, (Integer)this.f9000[1] + 1);
      this.f9000[1] = var12;
      Integer var13 = var1;
      this.f9000[2] = var13;
      Integer var14 = var2;
      this.f9000[3] = var14;
      Integer var15 = var3;
      this.f9000[4] = var15;
      Integer var16 = var4;
      this.f39000[0] = var16;
      Integer var17 = var5;
      this.f39000[1] = var17;
      Integer var18 = var6;
      this.f39000[2] = var18;
      Boolean var19 = true;
      this.f39000[3] = var19;
   }

   private float m6000() {
      if ((Integer)this.f9000[1] < 12) {
         return f42000[2];
      } else {
         int var1 = 0;
         int var2 = 0;
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;

         for (int var7 = 0; var7 < this.f9000[1]; var7++) {
            byte var9 = 1;
            byte var10 = 1;
            byte var11 = 1;
            int var12 = ((int[])this.f46000[5])[var7] != Integer.MIN_VALUE ? 1 : 0;
            int var13 = 0;

            for (int var8 = 0; var8 < var7; var8++) {
               if (((int[])this.f46000[1])[var7] == ((int[])this.f46000[1])[var8] && ((int[])this.f46000[2])[var7] == ((int[])this.f46000[2])[var8]) {
                  var9 = 0;
               }

               if (Math.abs(((int[])this.f46000[f30000[0]])[var7]) == Math.abs(((int[])this.f46000[f30000[1]])[var8])
                  && Math.abs(((int[])this.f46000[2])[var7]) == Math.abs(((int[])this.f46000[2])[var8])) {
                  var10 = 0;
               }

               if (((int[])this.f46000[3])[var7] == ((int[])this.f46000[3])[var8] && ((int[])this.f46000[4])[var7] == ((int[])this.f46000[4])[var8]) {
                  var11 = 0;
               }

               if (((int[])this.f46000[5])[var7] == ((int[])this.f46000[5])[var8]) {
                  var12 = 0;
               }
            }

            for (int var15 = 0; var15 < this.f9000[1]; var15++) {
               if (((int[])this.f46000[1])[var7] == ((int[])this.f46000[1])[var15] && ((int[])this.f46000[2])[var7] == ((int[])this.f46000[2])[var15]) {
                  var13++;
               }
            }

            if (((int[])this.f46000[3])[var7] == 0
               && ((int[])this.f46000[4])[var7] == 0
               && (((int[])this.f46000[1])[var7] != 0 || ((int[])this.f46000[2])[var7] != 0)) {
               var6++;
            }

            if (var9 != 0) {
               var1++;
            }

            if (var10 != 0) {
               var2++;
            }

            if (var11 != 0) {
               var3++;
            }

            if (var12 != 0) {
               var4++;
            }

            var5 = Math.max(var5, var13);
         }

         float var14 = f6000[0];
         if (var1 < Math.max(5, (Integer)this.f9000[1] / 4)) {
            var14 += f6000[1];
         }

         if (var2 < Math.max(4, (Integer)this.f9000[1] / 5)) {
            var14 += f6000[2];
         }

         if (var3 < Math.max(4, (Integer)this.f9000[1] / 5)) {
            var14 += f6000[3];
         }

         if (var4 < 3 && (Integer)this.f9000[1] >= 16) {
            var14 += f47000[0];
         }

         if ((float)var5 / ((Integer)this.f9000[1]).intValue() > f47000[1]) {
            var14 += f31000[0];
         }

         if ((float)var6 / ((Integer)this.f9000[1]).intValue() > f31000[1]) {
            var14 += f31000[2];
         }

         return var14;
      }
   }

   public C0061() {
      this.m18000();
      IllisOqkm var5 = new IllisOqkm();
      this.f46000[0] = var5;
      int[] var6 = new int[34];
      this.f46000[1] = var6;
      int[] var7 = new int[34];
      this.f46000[2] = var7;
      int[] var8 = new int[34];
      this.f46000[3] = var8;
      int[] var9 = new int[34];
      this.f46000[4] = var9;
      int[] var10 = new int[34];
      this.f46000[5] = var10;
   }

   static {
      ntfClinit();
   }

   private static void m14000() {
      f12000 = new boolean[]{false, false, false, false, false, false, false};
      f45000 = new boolean[]{false, false, false, false, false};
      f21000 = new boolean[]{false, false, false};
      f25000 = new boolean[]{true, false, false, false};
      f60000 = new boolean[]{true, false};
      f24000 = new boolean[]{true, false, true, false, false, false};
      f67000 = new boolean[]{false, false, true, true, true, true, false};
      f59000 = new boolean[]{false, true, false};
      f43000 = new boolean[]{false, false, false, false, false, false};
      f15000 = new boolean[]{true, true, true, true, false, false, false};
      f3000 = new boolean[]{false, false, false, false, false, false, false, false};
      f36000 = new boolean[]{false, true, true, true, false, false, true};
      f54000 = new boolean[]{false, true, false, false};
      f7000 = new boolean[]{false, false, false, false, false, true};
      f38000 = new boolean[]{true, true, false, true, true};
      f2000 = new boolean[]{false, false};
      f5000 = new boolean[]{true, false};
      f41000 = new boolean[]{false, false};
      f29000 = new boolean[]{false, false, false, true, false};
      f13000 = new boolean[]{false, false, true, false};
   }

   private static void m16000() {
      f55000 = new Object[]{34};
   }

   private void m18000() {
      if (this.f46000 == null) {
         this.f46000 = new Object[6];
         Object[] var1 = this.f46000;
      }

      if (this.f9000 == null) {
         this.f9000 = new Object[5];
         Object[] var2 = this.f9000;
         var2[0] = 0;
         var2[1] = 0;
         var2[2] = 0;
         var2[3] = 0;
         var2[4] = 0;
      }

      if (this.f39000 == null) {
         this.f39000 = new Object[4];
         Object[] var3 = this.f39000;
         var3[0] = 0;
         var3[1] = 0;
         var3[2] = 0;
         var3[3] = false;
      }
   }

   private int m20000(int var1) {
      if (var1 == Integer.MIN_VALUE) {
         return f7000[1];
      } else {
         int var2 = f7000[2];

         for (int var3 = f7000[3]; var3 < this.f9000[1]; var3++) {
            if (((int[])this.f46000[5])[var3] == var1) {
               var2++;
            }
         }

         return var2;
      }
   }

   private static void m22000() {
      f4000 = new float[]{0.0F, 0.34F, 0.48F, 0.32F, 0.18F};
      f57000 = new float[]{0.0F, 2.0F, 5.5F, 2.0F, 0.0F, 1.0F};
      f19000 = new float[]{3.0F, 1.0F, 0.0F, 2.2F, 0.4F};
      f48000 = new float[]{2.8F, 0.0F};
      f37000 = new float[]{0.18F, 1.2F};
      f35000 = new float[]{0.0F, -90.0F, 90.0F, 0.0F};
      f53000 = new float[]{-90.0F, 90.0F, 1.0E-4F, 2.6F, 1.2F};
      f23000 = new float[]{0.55F, 1.15F, 0.35F, 0.22F, 2.9F};
      f18000 = new float[]{1.25F, 3.0F};
      f10000 = new float[]{1.0F, -0.45F, 0.0F};
      f56000 = new float[]{0.0F, 0.55F};
      f40000 = new float[]{0.26F, 0.45F, 0.36F, 0.22F};
      f14000 = new float[]{0.38F, 0.11F, 0.28F, 0.07F, 0.34F};
      f42000 = new float[]{0.12F, 1.6F, 0.0F};
      f6000 = new float[]{0.0F, 0.25F, 0.18F, 0.25F};
      f47000 = new float[]{0.22F, 0.24F};
      f31000 = new float[]{0.28F, 0.34F, 0.24F, 0.38F, 1.0E-4F, 1.0E-4F, 1.0E-4F, 0.0F};
   }

   private static void m26000() {
      f64000 = new double[]{0.035F, 1.0E-5, 8.0};
   }

   private int m28000(int var1, int var2) {
      int var3 = 0;

      for (int var4 = f7000[0]; var4 < this.f9000[1]; var4++) {
         if (((int[])this.f46000[3])[var4] == var1 && ((int[])this.f46000[4])[var4] == var2) {
            var3++;
         }
      }

      return var3;
   }

   private static void m30000() {
      f61000 = new short[]{0, 1, 2, 3, 4, 5, 1};
      f8000 = new short[]{2, 3, 4, 5, 0, 1};
      f33000 = new short[]{2, 3, 4, 0, 1};
      f49000 = new short[]{2, 3, 0, 0, 0, 0};
      f32000 = new short[]{0, 3, 2, 3, 3, 3};
      f34000 = new short[]{2, 3, 3, 2, 3, 3, 4, 0};
      f26000 = new short[]{3, 2, 3, 4, 0};
      f27000 = new short[]{2, 3, 2, 3, 4, 0, 1, 2};
      f65000 = new short[]{1, 1, 5};
      f44000 = new short[]{1, 1, 2, 2};
      f30000 = new short[]{1, 1};
      f28000 = new short[]{2, 2};
      f1000 = new short[]{3, 3, 4, 4, 5, 5};
      f58000 = new short[]{1, 1, 1, 2, 2, 3, 4};
      f20000 = new short[]{1, 2, 1, 1, 1, 1};
      f63000 = new short[]{1, 1};
      f11000 = new short[]{3, 2, 3};
      f62000 = new short[]{3, 3, 4, 3, 0, 1};
      f68000 = new short[]{0, 2, 0};
      f66000 = new short[]{3, 0};
      f22000 = new short[]{4, 0, 5, 0};
      f16000 = new short[]{0, 0, 1, 1, 2, 3};
      f52000 = new short[]{4, 0};
      f17000 = new short[]{1, 2, 3, 1, 1, 2, 1, 2};
      f50000 = new short[]{1, 3, 4};
      f51000 = new short[]{1, 5, 0, 0, 0, 0};
   }

   private int m32000(int var1, int var2) {
      return var1 == 0 && var2 == 0 ? Integer.MIN_VALUE : (int)Math.round(Math.toDegrees(Math.atan2(Math.abs(var2), Math.abs(var1))) * f64000[2]);
   }

   public C0983 m36000(
      C0768 var1, NjL var2, C0983 var3, C0983 var4, C0983 var5, double var6, boolean var8, boolean var9, boolean var10, boolean var11, boolean var12
   ) {
      if (var3 != null && var4 != null && var5 != null) {
         float var14 = (float)Math.max(var6, f64000[0]);
         float var15 = C0070.m12000(var3.m38000(), var5.m38000());
         float var16 = var8 ? f4000[0] : var5.m68000() - var3.m68000();
         int var17 = this.m44000(var15, var14);
         int var18 = this.m44000(var16, var14);
         if (var17 == 0 && var18 == 0) {
            this.m2000(var17, var18);
            return var8 && var5.m68000() != var3.m68000() ? new C0983(var5.m38000(), var3.m68000()) : var5;
         } else {
            float var19 = this.m56000(var17, var18);
            float var20 = !var11 && !var12 ? f4000[2] : f4000[1];
            C0983 var21 = var5;
            C0983 var13;
            if ((var19 >= var20 || ((IllisOqkm)this.f46000[0]).m34000(var19 * (var11 ? f4000[3] : f4000[4])))
               && (var13 = this.m66000(var1, var2, var3, var4, var5, var6, var14, var8, var9, var10, var11, var12, var17, var18, var19)) != null) {
               var21 = var13;
            }

            if (var8 && var21.m68000() != var3.m68000()) {
               var21 = new C0983(var21.m38000(), var3.m68000());
            }

            this.m2000(this.m44000(C0070.m12000(var3.m38000(), var21.m38000()), var14), this.m44000(var21.m68000() - var3.m68000(), var14));
            return var21;
         }
      } else {
         return var5;
      }
   }

   private boolean m38000(C0983 var1, C0983 var2, float var3) {
      int var4 = this.m44000(C0070.m12000(var1.m38000(), var2.m38000()), var3);
      int var5 = this.m44000(var2.m68000() - var1.m68000(), var3);
      if (var4 == 0 && var5 == 0) {
         return (boolean)0;
      } else {
         int var6 = this.f39000[3] ? var4 - (Integer)this.f9000[2] : 0;
         int var7 = this.f39000[3] ? var5 - (Integer)this.f9000[3] : 0;
         int var8 = this.m32000(var4, var5);
         return (boolean)((!this.f39000[3] || var4 != this.f9000[2] || var5 != this.f9000[3])
               && (!this.f39000[3] || Math.abs(var4) != Math.abs((Integer)this.f9000[2]) || Math.abs(var5) != Math.abs((Integer)this.f9000[3]))
               && (!this.f39000[3] || var6 != this.f9000[4] || var7 != this.f39000[0])
               && this.m60000(var4, var5, false) == 0
               && this.m60000(var4, var5, true) <= 1
               && this.m28000(var6, var7) == 0
               && this.m20000(var8) <= 1
            ? 1
            : 0);
      }
   }

   private static float m40000(C0983 var0, C0983 var1) {
      return C0070.m12000(var1.m38000(), var0.m38000());
   }

   public void m42000() {
      Arrays.fill((int[])this.f46000[1], 0);
      Arrays.fill((int[])this.f46000[2], 0);
      Arrays.fill((int[])this.f46000[3], 0);
      Arrays.fill((int[])this.f46000[4], 0);
      Arrays.fill((int[])this.f46000[5], Integer.MIN_VALUE);
      Integer var5 = 0;
      this.f9000[0] = var5;
      Integer var6 = 0;
      this.f9000[1] = var6;
      Integer var7 = 0;
      this.f9000[2] = var7;
      Integer var8 = 0;
      this.f9000[3] = var8;
      Integer var9 = 0;
      this.f9000[4] = var9;
      Integer var10 = 0;
      this.f39000[0] = var10;
      Integer var11 = 0;
      this.f39000[1] = var11;
      Integer var12 = 0;
      this.f39000[2] = var12;
      Boolean var13 = false;
      this.f39000[3] = var13;
      ((IllisOqkm)this.f46000[0]).m24000();
   }

   private int m44000(float var1, float var2) {
      return Math.abs(var1) <= f31000[5] ? 0 : Math.round(var1 / var2);
   }

   private boolean m46000(C0768 var1, NjL var2, C0983 var3, boolean var4, boolean var5) {
      return (boolean)(var3 == null || var4 && !var5 && !var1.m36000(var2, var3) ? 0 : 1);
   }

   private int m48000(int var1, float var2) {
      if (var1 != 0) {
         return var1 > 0 ? 1 : -1;
      } else if (Math.abs(var2) > f31000[6]) {
         return var2 > f31000[7] ? 1 : -1;
      } else {
         return ((IllisOqkm)this.f46000[0]).m40000();
      }
   }

   private float m50000(float var1, float var2, float var3, boolean var4, float var5) {
      if (Math.abs(var2) <= f53000[2]) {
         float var9 = var3 * (var4 ? f53000[3] : f53000[4]) * (f23000[0] + var5);
         return NNWE.N(var1, -var9, var9);
      } else {
         float var6 = Math.signum(var2);
         if (Math.signum(var1) != var6 && Math.abs(var2) > var3 * f23000[1]) {
            var1 = var6 * Math.abs(var1);
         }

         float var7 = var3 * ((IllisOqkm)this.f46000[0]).m26000(var4 ? f23000[2] : f23000[3], var4 ? f23000[4] : f18000[0]);
         float var8 = Math.max(var3, Math.abs(var2) + var7 * (Math.abs(var2) <= var3 * f18000[1] ? f10000[0] : f10000[1]));
         return NNWE.N(var1, -var8, var8);
      }
   }

   private int m54000(int var1, int var2, int var3) {
      if (var2 <= 0) {
         return f7000[4];
      } else {
         int var5 = var1 < 6 ? var1 % 3 + f7000[5] : ((IllisOqkm)this.f46000[0]).m42000(1, var2);
         int var4 = var1 % 2 == 0 ? var3 : -var3;
         if (var1 >= 10 && ((IllisOqkm)this.f46000[0]).m34000(f31000[3])) {
            var4 *= -1;
         }

         return var5 * var4;
      }
   }

   private float m56000(int var1, int var2) {
      if (!(Boolean)this.f39000[3]) {
         return f10000[2];
      } else {
         int var3 = var1 - (Integer)this.f9000[2];
         int var4 = var2 - (Integer)this.f9000[3];
         int var5 = var3 - (Integer)this.f9000[4];
         int var6 = var4 - (Integer)this.f39000[0];
         float var7 = f56000[0];
         if (var1 == (Integer)this.f9000[2] && var2 == (Integer)this.f9000[3]) {
            var7 += f56000[1];
         }

         if (Math.abs(var1) == Math.abs((Integer)this.f9000[2]) && Math.abs(var2) == Math.abs((Integer)this.f9000[3])) {
            var7 += f40000[0];
         }

         if (var3 == (Integer)this.f9000[4] && var4 == (Integer)this.f39000[0]) {
            var7 += var3 == 0 && var4 == 0 ? f40000[1] : f40000[2];
         }

         if (var5 == (Integer)this.f39000[1] && var6 == (Integer)this.f39000[2]) {
            var7 += f40000[3];
         }

         var7 += Math.min(f14000[0], this.m60000(var1, var2, false) * f14000[1]);
         var7 += Math.min(f14000[2], this.m60000(var1, var2, true) * f14000[3]);
         var7 += Math.min(f14000[4], this.m28000(var3, var4) * f42000[0]);
         return Math.min(f42000[1], var7 + this.m6000());
      }
   }

   private int m60000(int var1, int var2, boolean var3) {
      int var4 = 0;

      for (int var5 = 0; var5 < this.f9000[1]; var5++) {
         int var6 = var3
            ? (Math.abs(((int[])this.f46000[1])[var5]) == Math.abs(var1) && Math.abs(((int[])this.f46000[2])[var5]) == Math.abs(var2) ? 1 : 0)
            : (((int[])this.f46000[1])[var5] == var1 && ((int[])this.f46000[2])[var5] == var2 ? 1 : 0);
         if (var6 != 0) {
            var4++;
         }
      }

      return var4;
   }

   private float m62000(float var1, double var2) {
      if (!(Math.abs(var1) <= f31000[4]) && !(var2 <= f64000[1])) {
         float var4 = Math.signum(var1);
         float var5 = Math.abs(var1) / (float)var2;
         int var6 = Math.max(1, (int)Math.floor(var5));
         int var7 = Math.max(var6, (int)Math.ceil(var5));
         int var8 = ((IllisOqkm)this.f46000[0]).m34000(var5 - var6) ? var7 : var6;
         return var4 * var8 * (float)var2;
      } else {
         return var1;
      }
   }

   private C0983 m64000(C0983 var1, float var2, float var3, double var4, float var6, int var7, int var8, boolean var9, float var10) {
      float var11 = this.m50000(var7 * var6, var2, var6, true, var10);
      float var12 = var9 ? f35000[3] : this.m50000(var8 * var6, var3, var6, false, var10);
      return new C0983(var1.m38000() + this.m62000(var11, var4), NNWE.N(var1.m68000() + this.m62000(var12, var4), f53000[0], f53000[1]));
   }

   private C0983 m66000(
      C0768 var1,
      NjL var2,
      C0983 var3,
      C0983 var4,
      C0983 var5,
      double var6,
      float var8,
      boolean var9,
      boolean var10,
      boolean var11,
      boolean var12,
      boolean var13,
      int var14,
      int var15,
      float var16
   ) {
      float var17 = C0070.m12000(var3.m38000(), var4.m38000());
      float var18 = var9 ? f57000[0] : var4.m68000() - var3.m68000();
      int var19 = this.m48000(var14, var17);
      int var20 = var9 ? 0 : this.m48000(var15, var18);
      int var21 = Math.min(9, Math.max(2, Math.round(f57000[1] + var16 * f57000[2] + (var12 ? f57000[3] : f57000[4]))));
      int var22 = var9 ? 0 : Math.min(5, Math.max(1, Math.round(f57000[5] + var16 * f19000[0] + (var13 ? f19000[1] : f19000[2]))));

      for (int var23 = 0; var23 < 28; var23++) {
         int var26 = this.m54000(var23, var21, var19);
         int var25 = var9 ? 0 : this.m54000(var23 + 7, var22, var20);
         C0983 var24;
         if ((var26 != 0 || var25 != 0)
            && this.m46000(var1, var2, var24 = this.m64000(var3, var17, var18, var6, var8, var14 + var26, var9 ? 0 : var15 + var25, var9, var16), var10, var11)
            && this.m38000(var3, var24, var8)) {
            return var24;
         }
      }

      float var28 = ((IllisOqkm)this.f46000[0]).m32000(true, var8 * NNWE.N(var16 * f19000[3], f19000[4], f48000[0]));
      float var29 = var9 ? f48000[1] : ((IllisOqkm)this.f46000[0]).m32000(false, var8 * NNWE.N(var16, f37000[0], f37000[1]));
      C0983 var30 = new C0983(
         var3.m38000() + this.m62000(m40000(var5, var3) + var28, var6),
         NNWE.N(var3.m68000() + this.m62000((var9 ? f35000[0] : var5.m68000() - var3.m68000()) + var29, var6), f35000[1], f35000[2])
      );
      return this.m46000(var1, var2, var30, var10, var11) && this.m38000(var3, var30, var8) ? var30 : null;
   }
}

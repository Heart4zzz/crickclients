package rw.core;

import KDFzREm.NNWE;
import KDFzREm.NjL;

public class C0056 {
   private static short[] f1000;
   private static double[] f2000;
   private static short[] f3000;
   private static short[] f4000;
   public static Object[] f5000;
   private static short[] f6000;
   private static float[] f7000;
   private static short[] f8000;
   private static short[] f9000;
   private static float[] f10000;
   private static short[] f11000;
   private static short[] f12000;
   private static float[] f13000;
   public Object[] f14000;
   public Object[] f15000;
   private static short[] f16000;
   private static double[] f17000;
   private static float[] f18000;
   private static short[] f19000;
   private static short[] f20000;
   private static short[] f21000;
   private static short[] f22000;
   private static short[] f23000;
   private static short[] f24000;
   private static short[] f25000;
   private static short[] f26000;

   private boolean m2000(int var1) {
      if (var1 == Integer.MIN_VALUE) {
         return (boolean)0;
      } else {
         int var2 = 0;

         for (int var3 = 0; var3 < this.f15000[f6000[0]]; var3++) {
            if (((int[])this.f14000[f6000[1]])[var3] == var1) {
               var2++;
            }
         }

         return (boolean)(var2 >= 2 ? 1 : 0);
      }
   }

   public C0056() {
      this.m20000();
      int[] var5 = new int[20];
      this.f14000[0] = var5;
      int[] var6 = new int[20];
      this.f14000[1] = var6;
      int[] var7 = new int[20];
      this.f14000[2] = var7;
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      f10000 = new float[]{0.0F, 0.0F, 0.0F, 0.0F, -90.0F, 90.0F};
      f18000 = new float[]{0.0F, -90.0F};
      f13000 = new float[]{90.0F, 1.15F};
      f7000 = new float[]{0.35F, 1.0E-4F, 0.0F, 1.0E-4F, 1.0E-4F, 1.0E-4F, 1.0E-4F, 0.0F};
   }

   private static void m14000() {
      f2000 = new double[]{0.035F, 0.35F, 0.85F, 0.2F, 0.65F, 1.0E-5, 90.0, 10.0};
      f17000 = new double[]{0.5};
   }

   private void m20000() {
      if (this.f14000 == null) {
         this.f14000 = new Object[7];
         Object[] var1 = this.f14000;
         var1[3] = 0;
         var1[4] = 0;
         var1[5] = 0;
         var1[6] = 0;
      }

      if (this.f15000 == null) {
         this.f15000 = new Object[5];
         Object[] var2 = this.f15000;
         var2[0] = 0;
         var2[1] = 0;
         var2[2] = 0;
         var2[3] = 0;
         var2[4] = false;
      }
   }

   private static void m26000() {
      f25000 = new short[]{0, 1};
      f26000 = new short[]{2, 3, 4};
      f4000 = new short[]{5, 6};
      f23000 = new short[]{0, 1, 2, 3};
      f20000 = new short[]{4, 3, 4, 5};
      f9000 = new short[]{4, 4, 3, 4, 4, 5, 1};
      f16000 = new short[]{1, 1};
      f3000 = new short[]{2, 2, 2, 0};
      f11000 = new short[]{3, 3};
      f8000 = new short[]{3, 2, 3, 3};
      f21000 = new short[]{4, 1, 1, 5, 2};
      f24000 = new short[]{2, 0, 3, 3, 3, 4, 5};
      f19000 = new short[]{4, 3, 4};
      f1000 = new short[]{5, 0, 0, 6, 1};
      f12000 = new short[]{6, 2, 6, 0, 6};
      f22000 = new short[]{6, 6, 0, 0, 0, 1, 2};
      f6000 = new short[]{0, 0};
   }

   private int m30000(float var1, float var2) {
      return Math.abs(var1) <= f7000[3] ? 0 : Math.round(var1 / var2);
   }

   public C0983 m32000(C0768 var1, NjL var2, C0983 var3, C0983 var4, C0983 var5, double var6, boolean var8, boolean var9, boolean var10) {
      float var12 = (float)Math.max(var6, f2000[0]);
      float var13 = C0070.m12000(var3.m38000(), var5.m38000());
      float var14 = var8 ? f10000[0] : var5.m68000() - var3.m68000();
      int var15 = this.m30000(var13, var12);
      int var16 = this.m30000(var14, var12);
      int var17 = this.m58000(var13, var14);
      int var18 = this.m56000(var17);
      if (var15 == 0 && var16 == 0) {
         Integer var29 = 0;
         this.f14000[3] = var29;
         Integer var30 = 0;
         this.f14000[4] = var30;
         Integer var31 = var17;
         this.f14000[5] = var31;
         Boolean var32 = true;
         this.f15000[4] = var32;
         return var5;
      } else {
         int var19 = this.f15000[4] && var15 == this.f14000[3] && var16 == this.f14000[4] ? 1 : 0;
         int var20 = !this.f15000[4] || var17 != this.f14000[5] || var17 == Integer.MIN_VALUE || var15 == 0 && var16 == 0 ? 0 : 1;
         boolean var21 = this.m34000(var15, var16);
         boolean var22 = this.m2000(var17);
         int var11 = !var8 && var15 != 0 && Math.abs(var15) == Math.abs(var16) ? 1 : 0;
         int var10001;
         if (var19 != 0) {
            int var10003 = (Integer)this.f15000[1] + 1;
            var10001 = var10003;
            Integer var33 = var10003;
            this.f15000[1] = var33;
         } else {
            var10001 = 0;
         }

         Integer var34 = var10001;
         this.f15000[1] = var34;
         if (var20 != 0) {
            int var51 = (Integer)this.f15000[2] + 1;
            var10001 = var51;
            Integer var35 = var51;
            this.f15000[2] = var35;
         } else {
            var10001 = 0;
         }

         Integer var36 = var10001;
         this.f15000[2] = var36;
         if (var18 == 0 && var17 != Integer.MIN_VALUE && (Integer)this.f15000[0] > 0) {
            int var52 = (Integer)this.f15000[3] + 1;
            var10001 = var52;
            Integer var37 = var52;
            this.f15000[3] = var37;
         } else {
            var10001 = 0;
         }

         Integer var38 = var10001;
         this.f15000[3] = var38;
         C0983 var24 = var5;
         if (var19 != 0 || var21 || (Integer)this.f15000[2] >= 1 || (Integer)this.f15000[3] >= 1 || var22 || var11 != 0) {
            var24 = this.m38000(var1, var2, var3, var4, var5, var6, var12, var8, var9, var10, var15, var16);
            var13 = C0070.m12000(var3.m38000(), var24.m38000());
            var14 = var8 ? f10000[1] : var24.m68000() - var3.m68000();
            var15 = this.m30000(var13, var12);
            var16 = this.m30000(var14, var12);
            var17 = this.m58000(var13, var14);
            var18 = this.m56000(var17);
            Integer var39 = var15 == this.f14000[3] && var16 == this.f14000[4] ? (Integer)this.f15000[1] : 0;
            this.f15000[1] = var39;
            Integer var40 = var17 == this.f14000[5] ? (Integer)this.f15000[2] : 0;
            this.f15000[2] = var40;
            Integer var41 = var18 == 0 && var17 != Integer.MIN_VALUE && this.f15000[0] > 0 ? (Integer)this.f15000[3] : 0;
            this.f15000[3] = var41;
         }

         Integer var42 = var15;
         this.f14000[3] = var42;
         Integer var43 = var16;
         this.f14000[4] = var43;
         Integer var44 = var17;
         this.f14000[5] = var44;
         this.m44000(var15, var16, var17);
         Boolean var45 = true;
         this.f15000[4] = var45;
         return var24;
      }
   }

   private boolean m34000(int var1, int var2) {
      if (var1 == 0 && var2 == 0) {
         return (boolean)0;
      } else {
         for (int var3 = 0; var3 < this.f15000[0]; var3++) {
            if (((int[])this.f14000[1])[var3] == var1 && ((int[])this.f14000[2])[var3] == var2) {
               return (boolean)1;
            }
         }

         return (boolean)0;
      }
   }

   public void m36000() {
      Integer var5 = 0;
      this.f14000[3] = var5;
      Integer var6 = 0;
      this.f14000[4] = var6;
      Integer var7 = Integer.MIN_VALUE;
      this.f14000[5] = var7;
      Integer var8 = 0;
      this.f14000[6] = var8;
      Integer var9 = 0;
      this.f15000[f23000[0]] = var9;
      Integer var10 = 0;
      this.f15000[f23000[1]] = var10;
      Integer var11 = 0;
      this.f15000[f23000[2]] = var11;
      Integer var12 = 0;
      this.f15000[f23000[3]] = var12;
      Boolean var13 = false;
      this.f15000[4] = var13;
   }

   private C0983 m38000(
      C0768 var1, NjL var2, C0983 var3, C0983 var4, C0983 var5, double var6, float var8, boolean var9, boolean var10, boolean var11, int var12, int var13
   ) {
      int var15 = this.m54000(var12, C0070.m12000(var3.m38000(), var4.m38000()));
      int var16 = this.m54000(var13, var4.m68000() - var3.m68000());
      int[] var17 = new int[]{1, -1, 2, -2, 3, -3};
      int[] var18 = new int[]{1, -1, 2, -2};
      if (!var9) {
         for (int var22 : var17) {
            C0983 var14 = this.m50000(var3, var4, var6, var8, var12, var13 + var16 * var22, false);
            if (this.m42000(var1, var2, var14, var10, var11) && this.m48000(var3, var14, var8)) {
               return var14;
            }
         }
      }

      for (int var31 : var18) {
         C0983 var23 = this.m50000(var3, var4, var6, var8, var12 + var15 * var31, var9 ? 0 : var13, var9);
         if (this.m42000(var1, var2, var23, var10, var11) && this.m48000(var3, var23, var8)) {
            return var23;
         }
      }

      float var26 = C0070.m12000(var3.m38000(), var5.m38000());
      float var28 = var9 ? f10000[2] : var5.m68000() - var3.m68000();
      float var30 = var15 * var8 * C0052.m8000(f2000[1], f2000[2]);
      float var32 = var9 ? f10000[3] : var16 * var8 * C0052.m8000(f2000[3], f2000[4]);
      C0983 var24 = new C0983(var3.m38000() + this.m40000(var26 + var30, var6), NNWE.N(var3.m68000() + this.m40000(var28 + var32, var6), f10000[4], f10000[5]));
      return this.m42000(var1, var2, var24, var10, var11) ? var24 : var5;
   }

   private float m40000(float var1, double var2) {
      if (!(Math.abs(var1) <= f7000[1]) && !(var2 <= f2000[5])) {
         int var4 = Math.round(var1 / (float)var2);
         if (var4 == 0) {
            var4 = var1 > f7000[2] ? 1 : -1;
         }

         return var4 * (float)var2;
      } else {
         return var1;
      }
   }

   private boolean m42000(C0768 var1, NjL var2, C0983 var3, boolean var4, boolean var5) {
      return (boolean)(var4 && !var5 && !var1.m36000(var2, var3) ? 0 : 1);
   }

   private void m44000(int var1, int var2, int var3) {
      if (var3 != Integer.MIN_VALUE) {
         ((int[])this.f14000[1])[this.f14000[6]] = var1;
         ((int[])this.f14000[2])[this.f14000[6]] = var2;
         ((int[])this.f14000[0])[this.f14000[6]] = var3;
         Integer var8 = ((Integer)this.f14000[6] + 1) % 20;
         this.f14000[6] = var8;
         Integer var9 = Math.min(20, (Integer)this.f15000[0] + 1);
         this.f15000[0] = var9;
      }
   }

   private boolean m48000(C0983 var1, C0983 var2, float var3) {
      int var4 = this.m30000(C0070.m12000(var1.m38000(), var2.m38000()), var3);
      int var5 = this.m30000(var2.m68000() - var1.m68000(), var3);
      int var6 = this.m58000(C0070.m12000(var1.m38000(), var2.m38000()), var2.m68000() - var1.m68000());
      return (boolean)(var4 == this.f14000[3] && var5 == this.f14000[4]
            || var6 == this.f14000[5]
            || this.m34000(var4, var5)
            || this.m2000(var6)
            || var5 != 0 && Math.abs(var4) == Math.abs(var5)
         ? 0
         : 1);
   }

   private C0983 m50000(C0983 var1, C0983 var2, double var3, float var5, int var6, int var7, boolean var8) {
      float var9 = C0070.m12000(var1.m38000(), var2.m38000());
      float var10 = var2.m68000() - var1.m68000();
      float var11 = this.m52000(var6 * var5, var9, var5);
      float var12 = var8 ? f18000[0] : this.m52000(var7 * var5, var10, var5);
      return new C0983(var1.m38000() + this.m40000(var11, var3), NNWE.N(var1.m68000() + this.m40000(var12, var3), f18000[1], f13000[0]));
   }

   private float m52000(float var1, float var2, float var3) {
      if (Math.abs(var2) <= var3 * f13000[1]) {
         return var1;
      } else {
         float var4 = Math.max(var3, Math.abs(var2) - var3 * f7000[0]);
         return NNWE.N(var1, -var4, var4);
      }
   }

   private int m54000(int var1, float var2) {
      if (var1 != 0) {
         return var1 > 0 ? 1 : -1;
      } else if (Math.abs(var2) > f7000[6]) {
         return var2 > f7000[7] ? 1 : -1;
      } else {
         return Math.random() > f17000[0] ? 1 : -1;
      }
   }

   private int m56000(int var1) {
      if (var1 != Integer.MIN_VALUE && (Integer)this.f15000[0] != 0) {
         int var2 = ((int[])this.f14000[0])[(this.f14000[6] - 1 + 20) % 20];
         return Math.abs(var1 - var2);
      } else {
         return Integer.MIN_VALUE;
      }
   }

   private int m58000(float var1, float var2) {
      if (Math.abs(var1) <= f7000[4] && Math.abs(var2) <= f7000[5]) {
         return Integer.MIN_VALUE;
      } else {
         double var3 = Math.toDegrees(Math.atan2(Math.abs(var2), Math.abs(var1))) % f2000[6];
         return (int)Math.round(var3 * f2000[7]);
      }
   }

   private static void m62000() {
      f5000 = new Object[]{20};
   }
}

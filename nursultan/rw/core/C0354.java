package rw.core;

public final class C0354 {
   public static final int f1000 = Integer.MAX_VALUE;
   public static final int f2000 = 0;
   public static final int f3000 = 1;
   private int[] f4000;
   private int[] f5000;
   private int[] f6000;
   private int f7000;
   private int f8000;
   private int f9000;
   private int f10000;
   private int f11000;
   private int f12000;
   private int f13000;
   private int[] f14000;
   private int f15000;
   private int f16000;
   private int f17000;
   private int f18000;
   private static final int f19000 = -2;
   private static final int f20000 = -1;

   private boolean m2000(int var1, int var2) {
      this.m8000(var1, var2);
      if (this.f18000 != -2 && this.f17000 + var2 <= this.f8000 && this.f13000 != -1) {
         int var3 = this.f13000;
         this.f4000[var3] = this.f16000;
         this.f5000[var3] = this.f17000 + var2;
         this.f13000 = this.f6000[var3];
         int var4 = this.m4000(this.f18000);
         if (this.f4000[var4] < this.f16000) {
            int var5 = this.f6000[var4];
            this.f6000[var4] = var3;
            var4 = var5;
         } else {
            this.m26000(this.f18000, var3);
         }

         int var7 = this.f16000 + var1;

         while (this.f6000[var4] != -1 && this.f4000[this.f6000[var4]] <= var7) {
            int var6 = this.f6000[var4];
            this.f6000[var4] = this.f13000;
            this.f13000 = var4;
            var4 = var6;
         }

         this.f6000[var3] = var4;
         if (this.f4000[var4] < var7) {
            this.f4000[var4] = var7;
         }

         return true;
      } else {
         this.f18000 = -2;
         return false;
      }
   }

   private int m4000(int var1) {
      return var1 == -1 ? this.f12000 : this.f6000[var1];
   }

   private int m6000(int var1, int var2, int var3) {
      int var4 = var1;
      int var5 = var2 + var3;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;

      while (this.f4000[var4] < var5) {
         int var9 = this.f5000[var4];
         int var10 = this.f4000[var4];
         int var11 = this.f4000[this.f6000[var4]];
         if (var9 > var6) {
            var7 += var8 * (var9 - var6);
            var6 = var9;
            var8 += var10 < var2 ? var11 - var2 : var11 - var10;
         } else {
            int var12 = var11 - var10;
            if (var12 + var8 > var3) {
               var12 = var3 - var8;
            }

            var7 += var12 * (var6 - var9);
            var8 += var12;
         }

         var4 = this.f6000[var4];
      }

      this.f15000 = var7;
      return var6;
   }

   private void m8000(int var1, int var2) {
      int var3 = 1073741824;
      int var4 = 1073741824;
      int var5 = 0;
      int var6 = -2;
      var1 = var1 + this.f9000 - 1;
      var1 -= var1 % this.f9000;
      if (var1 <= this.f7000 && var2 <= this.f8000) {
         int var7 = this.f12000;

         for (int var8 = -1; this.f4000[var7] + var1 <= this.f7000; var7 = this.f6000[var7]) {
            int var9 = this.m6000(var7, this.f4000[var7], var1);
            int var10 = this.f15000;
            if (this.f10000 == 0) {
               if (var9 < var4) {
                  var4 = var9;
                  var6 = var8;
               }
            } else if (var9 + var2 <= this.f8000 && (var9 < var4 || var9 == var4 && var10 < var3)) {
               var4 = var9;
               var3 = var10;
               var6 = var8;
            }

            var8 = var7;
         }

         var5 = var6 == -2 ? 0 : this.f4000[this.m4000(var6)];
         if (this.f10000 == 1) {
            int var18 = this.f12000;
            var7 = this.f12000;
            int var17 = -1;

            while (this.f4000[var18] < var1) {
               var18 = this.f6000[var18];
            }

            for (; var18 != -1; var18 = this.f6000[var18]) {
               int var19;
               for (var19 = this.f4000[var18] - var1; this.f4000[this.f6000[var7]] <= var19; var7 = this.f6000[var7]) {
                  var17 = var7;
               }

               int var11 = this.m6000(var7, var19, var1);
               int var12 = this.f15000;
               if (var11 + var2 <= this.f8000 && var11 <= var4 && (var11 < var4 || var12 < var3 || var12 == var3 && var19 < var5)) {
                  var5 = var19;
                  var4 = var11;
                  var3 = var12;
                  var6 = var17;
               }
            }
         }

         this.f18000 = var6;
         this.f16000 = var5;
         this.f17000 = var4;
      } else {
         this.f18000 = -2;
         this.f16000 = 0;
         this.f17000 = 0;
      }
   }

   private static int m10000(int[] var0, C0355[] var1, int var2, int var3) {
      int var4 = var2 + (var3 - var2 >>> 1);
      if (m24000(var1, var0[var2], var0[var4]) > 0) {
         m18000(var0, var2, var4);
      }

      if (m24000(var1, var0[var2], var0[var3]) > 0) {
         m18000(var0, var2, var3);
      }

      if (m24000(var1, var0[var4], var0[var3]) > 0) {
         m18000(var0, var4, var3);
      }

      m18000(var0, var4, var3);
      int var5 = var0[var3];
      int var6 = var2 - 1;

      for (int var7 = var2; var7 < var3; var7++) {
         if (m24000(var1, var0[var7], var5) <= 0) {
            m18000(var0, ++var6, var7);
         }
      }

      m18000(var0, var6 + 1, var3);
      return var6 + 1;
   }

   private static int m12000(int[] var0, int[] var1, int[] var2, int var3, int var4) {
      int var5 = var3 + (var4 - var3 >>> 1);
      if (m16000(var2, var1, var0[var3], var0[var5]) > 0) {
         m18000(var0, var3, var5);
      }

      if (m16000(var2, var1, var0[var3], var0[var4]) > 0) {
         m18000(var0, var3, var4);
      }

      if (m16000(var2, var1, var0[var5], var0[var4]) > 0) {
         m18000(var0, var5, var4);
      }

      m18000(var0, var5, var4);
      int var6 = var0[var4];
      int var7 = var3 - 1;

      for (int var8 = var3; var8 < var4; var8++) {
         if (m16000(var2, var1, var0[var8], var6) <= 0) {
            m18000(var0, ++var7, var8);
         }
      }

      m18000(var0, var7 + 1, var4);
      return var7 + 1;
   }

   public void m14000(int var1) {
      this.f10000 = var1;
   }

   private static int m16000(int[] var0, int[] var1, int var2, int var3) {
      int var4 = var0[var3] - var0[var2];
      if (var4 != 0) {
         return var4;
      } else {
         int var5 = var1[var3] - var1[var2];
         return var5 != 0 ? var5 : var2 - var3;
      }
   }

   private static void m18000(int[] var0, int var1, int var2) {
      int var3 = var0[var1];
      var0[var1] = var0[var2];
      var0[var2] = var3;
   }

   private static void m20000(int[] var0, C0355[] var1, int var2, int var3) {
      while (var2 < var3) {
         int var4 = m10000(var0, var1, var2, var3);
         if (var4 - var2 < var3 - var4) {
            m20000(var0, var1, var2, var4 - 1);
            var2 = var4 + 1;
         } else {
            m20000(var0, var1, var4 + 1, var3);
            var3 = var4 - 1;
         }
      }
   }

   public void m22000(int var1, int var2, int var3) {
      this.f7000 = var1;
      this.f8000 = var2;
      this.f11000 = var3;
      this.f10000 = 0;
      int var4 = var3 + 2;
      if (this.f4000 == null || this.f4000.length < var4) {
         this.f4000 = new int[var4];
         this.f5000 = new int[var4];
         this.f6000 = new int[var4];
      }

      for (int var5 = 0; var5 < var3 - 1; var5++) {
         this.f6000[var5] = var5 + 1;
      }

      this.f6000[var3 - 1] = -1;
      this.f13000 = 0;
      int var6 = var3 + 1;
      this.f4000[var3] = 0;
      this.f5000[var3] = 0;
      this.f6000[var3] = var6;
      this.f4000[var6] = var1;
      this.f5000[var6] = 1073741824;
      this.f6000[var6] = -1;
      this.f12000 = var3;
      this.m32000(false);
   }

   private static int m24000(C0355[] var0, int var1, int var2) {
      int var3 = var0[var2].f3000 - var0[var1].f3000;
      if (var3 != 0) {
         return var3;
      } else {
         int var4 = var0[var2].f2000 - var0[var1].f2000;
         return var4 != 0 ? var4 : var0[var1].f1000 - var0[var2].f1000;
      }
   }

   private void m26000(int var1, int var2) {
      if (var1 == -1) {
         this.f12000 = var2;
      } else {
         this.f6000[var1] = var2;
      }
   }

   public boolean m28000(C0355[] var1, int var2) {
      if (this.f14000 == null || this.f14000.length < var2) {
         this.f14000 = new int[var2];
      }

      int var3 = 0;

      while (var3 < var2) {
         this.f14000[var3] = var3++;
      }

      m20000(this.f14000, var1, 0, var2 - 1);
      boolean var7 = true;

      for (int var4 = 0; var4 < var2; var4++) {
         int var5 = this.f14000[var4];
         C0355 var6 = var1[var5];
         if (var6.f2000 == 0 || var6.f3000 == 0) {
            var6.f4000 = 0;
            var6.f5000 = 0;
            var6.f6000 = true;
         } else if (this.m2000(var6.f2000, var6.f3000)) {
            var6.f4000 = this.f16000;
            var6.f5000 = this.f17000;
            var6.f6000 = true;
         } else {
            var6.f4000 = Integer.MAX_VALUE;
            var6.f5000 = Integer.MAX_VALUE;
            var6.f6000 = false;
            var7 = false;
         }
      }

      return var7;
   }

   public boolean m30000(int[] var1, int[] var2, int[] var3, int[] var4, int[] var5, boolean[] var6, int var7) {
      if (this.f14000 == null || this.f14000.length < var7) {
         this.f14000 = new int[var7];
      }

      int var8 = 0;

      while (var8 < var7) {
         this.f14000[var8] = var8++;
      }

      m34000(this.f14000, var2, var3, 0, var7 - 1);
      boolean var13 = true;

      for (int var9 = 0; var9 < var7; var9++) {
         int var10 = this.f14000[var9];
         int var11 = var2[var10];
         int var12 = var3[var10];
         if (var11 == 0 || var12 == 0) {
            var4[var10] = 0;
            var5[var10] = 0;
            var6[var10] = true;
         } else if (this.m2000(var11, var12)) {
            var4[var10] = this.f16000;
            var5[var10] = this.f17000;
            var6[var10] = true;
         } else {
            var4[var10] = Integer.MAX_VALUE;
            var5[var10] = Integer.MAX_VALUE;
            var6[var10] = false;
            var13 = false;
         }
      }

      return var13;
   }

   public void m32000(boolean var1) {
      this.f9000 = var1 ? 1 : (this.f7000 + this.f11000 - 1) / this.f11000;
   }

   private static void m34000(int[] var0, int[] var1, int[] var2, int var3, int var4) {
      while (var3 < var4) {
         int var5 = m12000(var0, var1, var2, var3, var4);
         if (var5 - var3 < var4 - var5) {
            m34000(var0, var1, var2, var3, var5 - 1);
            var3 = var5 + 1;
         } else {
            m34000(var0, var1, var2, var5 + 1, var4);
            var4 = var5 - 1;
         }
      }
   }
}

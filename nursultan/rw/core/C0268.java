package rw.core;

import rw.data.Rec0124;

final class C0268 {
   private final int[] f1000;
   private final int[] f2000;
   private final int[] f3000;
   private final int[] f4000;
   private int f5000;
   private boolean f6000;

   Rec0124[] m2000() {
      Rec0124[] var1 = this.m8000();
      this.m4000();
      return var1;
   }

   C0268(int var1) {
      this.f1000 = new int[var1];
      this.f2000 = new int[var1];
      this.f3000 = new int[var1];
      this.f4000 = new int[var1];
   }

   void m4000() {
      this.f5000 = 0;
      this.f6000 = false;
   }

   private void m6000(int var1, int var2, int var3, int var4) {
      int var5 = var1;
      int var6 = var2;
      int var7 = var1 + var3;
      int var8 = var2 + var4;

      for (int var9 = 0; var9 < this.f5000; var9++) {
         var5 = Math.min(var5, this.f1000[var9]);
         var6 = Math.min(var6, this.f2000[var9]);
         var7 = Math.max(var7, this.f1000[var9] + this.f3000[var9]);
         var8 = Math.max(var8, this.f2000[var9] + this.f4000[var9]);
      }

      this.f1000[0] = var5;
      this.f2000[0] = var6;
      this.f3000[0] = var7 - var5;
      this.f4000[0] = var8 - var6;
      this.f5000 = 1;
   }

   Rec0124[] m8000() {
      if (this.f5000 == 0) {
         return rw.setting.C0025.f3000;
      } else {
         Rec0124[] var1 = new Rec0124[this.f5000];

         for (int var2 = 0; var2 < this.f5000; var2++) {
            var1[var2] = new Rec0124(this.f1000[var2], this.f2000[var2], this.f3000[var2], this.f4000[var2]);
         }

         return var1;
      }
   }

   private boolean m10000(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      return var1 <= var5 + var7 && var5 <= var1 + var3 && var2 <= var6 + var8 && var6 <= var2 + var4;
   }

   private void m12000(int var1) {
      int var2 = this.f5000 - 1;
      this.f1000[var1] = this.f1000[var2];
      this.f2000[var1] = this.f2000[var2];
      this.f3000[var1] = this.f3000[var2];
      this.f4000[var1] = this.f4000[var2];
      this.f5000 = var2;
   }

   boolean m14000() {
      return this.f6000;
   }

   void m16000(int var1, int var2, int var3, int var4) {
      if (var3 > 0 && var4 > 0) {
         this.f6000 = true;
         int var5 = var1;
         int var6 = var2;
         int var7 = var3;
         int var8 = var4;
         int var9 = 0;

         while (var9 < this.f5000) {
            if (this.m10000(var5, var6, var7, var8, this.f1000[var9], this.f2000[var9], this.f3000[var9], this.f4000[var9])) {
               int var10 = Math.min(var5, this.f1000[var9]);
               int var11 = Math.min(var6, this.f2000[var9]);
               int var12 = Math.max(var5 + var7, this.f1000[var9] + this.f3000[var9]);
               int var13 = Math.max(var6 + var8, this.f2000[var9] + this.f4000[var9]);
               var5 = var10;
               var6 = var11;
               var7 = var12 - var10;
               var8 = var13 - var11;
               this.m12000(var9);
               var9 = 0;
            } else {
               var9++;
            }
         }

         if (this.f5000 < this.f1000.length) {
            this.f1000[this.f5000] = var5;
            this.f2000[this.f5000] = var6;
            this.f3000[this.f5000] = var7;
            this.f4000[this.f5000] = var8;
            this.f5000++;
         } else {
            this.m6000(var5, var6, var7, var8);
         }
      }
   }
}

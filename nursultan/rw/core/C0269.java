package rw.core;

import java.nio.ByteBuffer;
import java.util.Arrays;
import org.lwjgl.system.MemoryUtil;

final class C0269 {
   private final int f1000;
   private final int f2000;
   private final int f3000;
   private final ByteBuffer f4000;
   private int[] f5000;
   private int[] f6000;
   private int[] f7000;
   private int f8000;

   int m2000() {
      return this.f3000;
   }

   C0269(int var1, int var2, int var3) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
      this.f4000 = MemoryUtil.memCalloc(var1 * var2 * var3);
      this.f5000 = new int[16];
      this.f6000 = new int[16];
      this.f7000 = new int[16];
      this.f5000[0] = 0;
      this.f6000[0] = 0;
      this.f7000[0] = var1;
      this.f8000 = 1;
   }

   void m4000() {
      MemoryUtil.memFree(this.f4000);
   }

   ByteBuffer m6000() {
      return this.f4000;
   }

   private void m8000(int var1) {
      if (var1 > this.f5000.length) {
         int var2 = Math.max(var1, this.f5000.length * 2);
         this.f5000 = Arrays.copyOf(this.f5000, var2);
         this.f6000 = Arrays.copyOf(this.f6000, var2);
         this.f7000 = Arrays.copyOf(this.f7000, var2);
      }
   }

   int m10000() {
      return this.f2000;
   }

   private void m12000(int var1) {
      int var2 = this.f8000 - var1 - 1;
      if (var2 > 0) {
         System.arraycopy(this.f5000, var1 + 1, this.f5000, var1, var2);
         System.arraycopy(this.f6000, var1 + 1, this.f6000, var1, var2);
         System.arraycopy(this.f7000, var1 + 1, this.f7000, var1, var2);
      }

      this.f8000--;
   }

   private void m14000(int var1, int var2, int var3, int var4) {
      this.m8000(this.f8000 + 1);
      int var5 = this.f8000 - var1;
      if (var5 > 0) {
         System.arraycopy(this.f5000, var1, this.f5000, var1 + 1, var5);
         System.arraycopy(this.f6000, var1, this.f6000, var1 + 1, var5);
         System.arraycopy(this.f7000, var1, this.f7000, var1 + 1, var5);
      }

      this.f5000[var1] = var2;
      this.f6000[var1] = var3;
      this.f7000[var1] = var4;
      this.f8000++;
   }

   void m16000(byte[] var1, int var2, int var3, int var4, int var5) {
      int var6 = var2 * this.f3000;

      for (int var7 = 0; var7 < var3; var7++) {
         int var8 = var7 * var6;
         int var9 = ((var5 + var7) * this.f1000 + var4) * this.f3000;
         this.f4000.put(var9, var1, var8, var6);
      }
   }

   void m18000(C0269 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      long var8 = MemoryUtil.memAddress(var1.f4000);
      long var10 = MemoryUtil.memAddress(this.f4000);
      int var12 = var4 * this.f3000;

      for (int var13 = 0; var13 < var5; var13++) {
         long var14 = var8 + (long)((var3 + var13) * var1.f1000 + var2) * this.f3000;
         long var16 = var10 + (long)((var7 + var13) * this.f1000 + var6) * this.f3000;
         MemoryUtil.memCopy(var14, var16, var12);
      }
   }

   void m20000(int var1, int var2, int var3, int var4, byte[] var5) {
      int var6 = var3 * this.f3000;

      for (int var7 = 0; var7 < var4; var7++) {
         int var8 = ((var2 + var7) * this.f1000 + var1) * this.f3000;
         int var9 = var7 * var6;
         this.f4000.get(var8, var5, var9, var6);
      }
   }

   boolean m22000(int var1, int var2, int var3, int[] var4) {
      int var5 = var1 + var3;
      int var6 = var2 + var3;
      if (var5 <= this.f1000 && var6 <= this.f2000) {
         int var7 = Integer.MAX_VALUE;
         int var8 = -1;
         int var9 = -1;

         for (int var10 = 0; var10 < this.f8000; var10++) {
            int var11 = this.m28000(var10, var5);
            if (var11 >= 0 && var11 + var6 <= this.f2000 && (var11 < var7 || var11 == var7 && this.f5000[var10] < var8)) {
               var7 = var11;
               var8 = this.f5000[var10];
               var9 = var10;
            }
         }

         if (var9 < 0) {
            return false;
         } else {
            this.m26000(var9, var8, var7, var5, var6);
            var4[0] = var8;
            var4[1] = var7;
            return true;
         }
      } else {
         return false;
      }
   }

   int m24000() {
      return this.f1000;
   }

   private void m26000(int var1, int var2, int var3, int var4, int var5) {
      this.m14000(var1, var2, var3 + var5, var4);
      int var6 = var2 + var4;
      int var7 = var1 + 1;

      while (var7 < this.f8000 && this.f5000[var7] < var6) {
         int var8 = this.f5000[var7] + this.f7000[var7];
         if (var8 > var6) {
            int var9 = var6 - this.f5000[var7];
            this.f5000[var7] = this.f5000[var7] + var9;
            this.f7000[var7] = this.f7000[var7] - var9;
            break;
         }

         this.m12000(var7);
      }

      this.m30000();
   }

   private int m28000(int var1, int var2) {
      if (this.f5000[var1] + var2 > this.f1000) {
         return -1;
      } else {
         int var3 = var2;
         int var4 = 0;

         for (int var5 = var1; var3 > 0; var5++) {
            if (var5 >= this.f8000) {
               return -1;
            }

            if (this.f6000[var5] > var4) {
               var4 = this.f6000[var5];
            }

            var3 -= this.f7000[var5];
         }

         return var4;
      }
   }

   private void m30000() {
      int var1 = 1;

      while (var1 < this.f8000) {
         if (this.f6000[var1] == this.f6000[var1 - 1]) {
            this.f7000[var1 - 1] = this.f7000[var1 - 1] + this.f7000[var1];
            this.m12000(var1);
         } else {
            var1++;
         }
      }
   }
}

package rw.core;

import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import java.util.Arrays;
import rw.data.Rec0084;

final class C0274 {
   static final int f1000 = -2;
   static final int f2000 = -1;
   private final Int2IntOpenHashMap f3000 = new Int2IntOpenHashMap(256, 0.7F);
   private int[] f4000;
   private float[] f5000;
   private float[] f6000;
   private float[] f7000;
   private float[] f8000;
   private float[] f9000;
   private int[] f10000;
   private int[] f11000;
   private int[] f12000;
   private int[] f13000;
   private int[] f14000;
   private int f15000;

   int m2000(int var1) {
      return this.f3000.get(var1);
   }

   float m4000(int var1) {
      return this.f7000[var1];
   }

   private void m6000(int var1) {
      if (var1 > this.f4000.length) {
         int var2 = Math.max(var1, this.f4000.length * 2);
         this.f4000 = Arrays.copyOf(this.f4000, var2);
         this.f5000 = Arrays.copyOf(this.f5000, var2);
         this.f6000 = Arrays.copyOf(this.f6000, var2);
         this.f7000 = Arrays.copyOf(this.f7000, var2);
         this.f8000 = Arrays.copyOf(this.f8000, var2);
         this.f9000 = Arrays.copyOf(this.f9000, var2);
         this.f10000 = Arrays.copyOf(this.f10000, var2);
         this.f11000 = Arrays.copyOf(this.f11000, var2);
         this.f12000 = Arrays.copyOf(this.f12000, var2);
         this.f13000 = Arrays.copyOf(this.f13000, var2);
         this.f14000 = Arrays.copyOf(this.f14000, var2);
      }
   }

   C0274() {
      this.f3000.defaultReturnValue(-2);
      short var1 = 256;
      this.f4000 = new int[var1];
      this.f5000 = new float[var1];
      this.f6000 = new float[var1];
      this.f7000 = new float[var1];
      this.f8000 = new float[var1];
      this.f9000 = new float[var1];
      this.f10000 = new int[var1];
      this.f11000 = new int[var1];
      this.f12000 = new int[var1];
      this.f13000 = new int[var1];
      this.f14000 = new int[var1];
   }

   float m8000(int var1) {
      return this.f8000[var1];
   }

   float m10000(int var1) {
      return this.f9000[var1];
   }

   float m12000(int var1) {
      return this.f5000[var1];
   }

   int m14000(int var1) {
      return this.f14000[var1];
   }

   int m16000(int var1) {
      return this.f11000[var1];
   }

   int m18000(int var1) {
      return this.f10000[var1];
   }

   int m20000(int var1) {
      return this.f4000[var1];
   }

   void m22000(int var1) {
      this.f3000.put(var1, -1);
   }

   int m24000(int var1) {
      return this.f12000[var1];
   }

   void m26000(int var1, float var2, int var3, int var4, float var5, float var6, C0267 var7) {
      var7.f1000 = this.f5000[var1] * var2;
      var7.f2000 = this.f6000[var1] * var2;
      var7.f3000 = this.f7000[var1] * var2;
      var7.f4000 = this.f8000[var1] * var2;
      if (this.f12000[var1] > 0) {
         float var8 = 1.0F / var3;
         float var9 = 1.0F / var4;
         var7.f5000 = this.f10000[var1] * var8;
         var7.f6000 = this.f11000[var1] * var9;
         var7.f7000 = (this.f10000[var1] + this.f12000[var1]) * var8;
         var7.f8000 = (this.f11000[var1] + this.f13000[var1]) * var9;
      } else {
         var7.f5000 = var7.f6000 = var7.f7000 = var7.f8000 = 0.0F;
      }

      var7.f9000 = this.f9000[var1] * var2;
      var7.f10000 = var5 * var2 / var6;
      var7.f11000 = this.f14000[var1];
   }

   void m28000(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.f10000[var1] = var2;
      this.f11000[var1] = var3;
      this.f12000[var1] = var4;
      this.f13000[var1] = var5;
      this.f14000[var1] = var6;
   }

   int m30000(int var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = this.f15000++;
      this.m6000(this.f15000);
      this.f4000[var12] = var1;
      this.f5000[var12] = var2;
      this.f6000[var12] = var3;
      this.f7000[var12] = var4;
      this.f8000[var12] = var5;
      this.f9000[var12] = var6;
      this.f10000[var12] = var7;
      this.f11000[var12] = var8;
      this.f12000[var12] = var9;
      this.f13000[var12] = var10;
      this.f14000[var12] = var11;
      this.f3000.put(var1, var12);
      return var12;
   }

   int m32000() {
      return this.f15000;
   }

   int m34000(int var1) {
      return this.f3000.get(var1);
   }

   int m36000(Rec0084 var1) {
      int var2 = this.f15000++;
      this.m6000(this.f15000);
      this.f4000[var2] = var1.m22000();
      this.f5000[var2] = var1.m20000();
      this.f6000[var2] = var1.m2000();
      this.f7000[var2] = var1.m18000();
      this.f8000[var2] = var1.m12000();
      this.f9000[var2] = var1.m24000();
      this.f10000[var2] = var1.m4000();
      this.f11000[var2] = var1.m8000();
      this.f12000[var2] = var1.m10000();
      this.f13000[var2] = var1.m16000();
      this.f14000[var2] = var1.m14000();
      this.f3000.put(var1.m22000(), var2);
      return var2;
   }

   int m38000(int var1) {
      return this.f13000[var1];
   }

   float m40000(int var1) {
      return this.f6000[var1];
   }
}

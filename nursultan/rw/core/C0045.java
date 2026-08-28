package rw.core;

import KDFzREm.NNWE;
import rw.data.Rec0020;
import rw.data.Rec0188;

public class C0045 {
   private static float[] f1000;
   private static double[] f2000;
   private static double[] f3000;
   private static float[] f4000;
   private static long[] f5000;
   private static long[] f6000;
   private static float[] f7000;
   public Object[] f8000;

   private static void m8000() {
      f1000 = new float[]{1.0F, 0.0F, 1.0F, 4.0F, 1.24F, 1.0F, 0.0F, 1.0F};
      f4000 = new float[]{0.0F, 1.0F, 0.32F, 1.0F};
      f7000 = new float[]{0.68F, 0.001F, 0.0F, 2.15F, 0.0F, 0.0F};
   }

   public C0045() {
      this.m16000();
      Float var5 = f1000[0];
      this.f8000[5] = var5;
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      f2000 = new double[]{0.52F, 0.64F, 0.36F, 1.7234382842983, 2.320309329, 42.0};
      f3000 = new double[]{86.0, 260.0, 620.0, 1000000.0, 1000000.0};
   }

   private static void m12000() {
      f5000 = new long[]{0L, 0L, 0L, 0L, 1L, 0L, 0L};
      f6000 = new long[]{0L, 0L, 0L};
   }

   private void m16000() {
      if (this.f8000 == null) {
         this.f8000 = new Object[8];
         Object[] var1 = this.f8000;
         var1[0] = 0L;
         var1[1] = f6000[0];
         var1[2] = f6000[1];
         var1[3] = f6000[2];
         var1[4] = f7000[4];
         var1[5] = f7000[5];
         var1[6] = false;
         var1[7] = false;
      }
   }

   private void m22000() {
      Long var5 = 0L;
      this.f8000[0] = var5;
      Float var6 = f7000[2];
      this.f8000[4] = var6;
      Boolean var7 = false;
      this.f8000[6] = var7;
      Boolean var8 = false;
      this.f8000[7] = var8;
   }

   private void m28000(long var1, float var3) {
      Long var8 = var1;
      this.f8000[0] = var8;
      Float var9 = Math.max(f7000[1], var3);
      this.f8000[4] = var9;
      Boolean var10 = true;
      this.f8000[6] = var10;
      Boolean var11 = false;
      this.f8000[7] = var11;
   }

   private float m30000(double var1) {
      return (float)(Math.round(var1 * f3000[3]) / f3000[4]);
   }

   public void m32000() {
      Long var5 = 0L;
      this.f8000[0] = var5;
      Long var6 = 0L;
      this.f8000[1] = var6;
      Long var7 = 0L;
      this.f8000[2] = var7;
      Long var8 = 0L;
      this.f8000[3] = var8;
      Float var9 = f1000[1];
      this.f8000[4] = var9;
      Float var10 = f1000[2];
      this.f8000[5] = var10;
      Boolean var11 = false;
      this.f8000[6] = var11;
      Boolean var12 = false;
      this.f8000[7] = var12;
   }

   private float m34000(Rec0188 var1) {
      return NNWE.N(var1.m14000() * var1.m14000() + var1.m2000() * var1.m2000() * f7000[3]);
   }

   private void m38000(long var1) {
      Float var7 = this.m30000(C0052.m8000(f2000[3], f2000[4]));
      this.f8000[5] = var7;
      Long var8 = var1;
      this.f8000[1] = var8;
      Long var9 = var1 + (long)C0052.m8000(f2000[5], f3000[0]);
      this.f8000[2] = var9;
      Long var10 = var1 + (long)C0052.m8000(f3000[1], f3000[2]);
      this.f8000[3] = var10;
      Boolean var11 = true;
      this.f8000[7] = var11;
   }

   public Rec0020 m40000(Rec0188 var1, float var2, boolean var3) {
      long var5 = System.currentTimeMillis();
      float var7 = this.m34000(var1);
      int var4 = !var3 && (var1.m4000() || var1.m8000() || !var1.m16000()) && var7 > var2 * f1000[3] ? 1 : 0;
      if (var4 == 0) {
         this.m22000();
         return Rec0020.m10000();
      } else {
         if (!(Boolean)this.f8000[6] || var7 > (Float)this.f8000[4] * f1000[4]) {
            this.m28000(var5, var7);
         }

         float var9 = f1000[5] - NNWE.N(var7 / Math.max(var2, (Float)this.f8000[4]), f1000[6], f1000[7]);
         if (!(Boolean)this.f8000[7] && var5 >= (Long)this.f8000[3] && var9 > C0052.m8000(f2000[0], f2000[1])) {
            this.m38000(var5);
         }

         if (var5 >= (Long)this.f8000[2]) {
            return Rec0020.m10000();
         } else {
            float var10 = NNWE.N((float)(var5 - (Long)this.f8000[1]) / (float)Math.max(1L, (Long)this.f8000[2] - (Long)this.f8000[1]), f4000[0], f4000[1]);
            float var11 = f4000[2] + (float)Math.pow(f4000[3] - var10, f2000[2]) * f7000[0];
            return new Rec0020(true, (Float)this.f8000[5], var11);
         }
      }
   }
}

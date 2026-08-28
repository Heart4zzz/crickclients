package rw.core;

import KDFzREm.NNWE;
import KDFzREm.NjL;
import rw.data.Rec0026;

public class C0050 {
   private static float[] f1000;
   private static float[] f2000;
   private static double[] f3000;
   private static float[] f4000;
   private static float[] f5000;
   private static float[] f6000;
   private static float[] f7000;
   private static float[] f8000;
   private static float[] f9000;
   public Object[] f10000;
   private static float[] f11000;

   private void m4000() {
      if (this.f10000 == null) {
         this.f10000 = new Object[6];
         Object[] var1 = this.f10000;
         var1[1] = 0L;
         var1[2] = f2000[3];
         var1[3] = f2000[4];
         var1[4] = f2000[5];
         var1[5] = f2000[6];
      }
   }

   public C0050() {
      this.m4000();
      IllisOqkm var5 = new IllisOqkm();
      this.f10000[0] = var5;
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f1000 = new float[]{0.0F, 0.0F, 0.0F, 0.0F, -90.0F, 90.0F};
      f4000 = new float[]{0.01F, 0.01F, 0.0F};
      f5000 = new float[]{0.72F, 0.48F, 0.26F, -0.38F, -0.18F, -90.0F, 90.0F};
      f7000 = new float[]{1.0F, 0.0F, 0.55F};
      f9000 = new float[]{0.0F, 0.18F, 0.08F};
      f11000 = new float[]{0.075F, 0.035F, 0.2F};
      f8000 = new float[]{0.11F, 0.1F, 0.05F, 34.0F, 48.0F, 96.0F};
      f6000 = new float[]{145.0F, 0.19F, 0.83F, 0.46F, 0.56F, 0.08F};
      f2000 = new float[]{0.18F, 0.12F, 0.92F, 0.0F, 0.0F, 0.0F, 0.0F};
   }

   private static void m16000() {
      f3000 = new double[]{1.0E-5, 0.035F};
   }

   public Rec0026 m24000(
      C0768 var1,
      NjL var2,
      C0983 var3,
      C0983 var4,
      double var5,
      boolean var7,
      boolean var8,
      boolean var9,
      boolean var10,
      boolean var11,
      float var12,
      float var13
   ) {
      if (var3 != null && var4 != null && !(var5 <= f3000[0])) {
         float var14 = (float)Math.max(var5, f3000[1]);
         this.m26000(System.currentTimeMillis(), var14, var10, var11);
         C0983 var15 = new C0983(
            var4.m38000() + (Float)this.f10000[2], var7 ? var4.m68000() : NNWE.N(var4.m68000() + (Float)this.f10000[3], f1000[4], f1000[5])
         );
         if (var8 && !var9 && !var1.m36000(var2, var15)) {
            var15 = this.m34000(var1, var2, var4, var7);
         }

         float var16 = Math.max(f4000[0], var12 + (Float)this.f10000[4]);
         float var17 = Math.max(f4000[1], var13 + (var7 ? f4000[2] : (Float)this.f10000[5]));
         return new Rec0026(var15, var16, var17);
      } else {
         return new Rec0026(var4, var12, var13);
      }
   }

   private void m26000(long var1, float var3, boolean var4, boolean var5) {
      if (var1 >= (Long)this.f10000[1]) {
         float var6 = (var4 ? f7000[0] : f7000[1]) + (var5 ? f7000[2] : f9000[0]);
         float var7 = var3 * (f9000[1] + var6 * f9000[2]);
         float var8 = var3 * (f11000[0] + var6 * f11000[1]);
         Float var13 = this.m32000(var7);
         this.f10000[2] = var13;
         Float var14 = this.m32000(var8);
         this.f10000[3] = var14;
         Float var15 = this.m32000(var3 * (f11000[2] + var6 * f8000[0]));
         this.f10000[4] = var15;
         Float var16 = this.m32000(var3 * (f8000[1] + var6 * f8000[2]));
         this.f10000[5] = var16;
         Long var17 = var1 + (long)((IllisOqkm)this.f10000[0]).m26000(var4 ? f8000[3] : f8000[4], var5 ? f8000[5] : f6000[0]);
         this.f10000[1] = var17;
      }
   }

   public void m30000() {
      Long var5 = 0L;
      this.f10000[1] = var5;
      Float var6 = f1000[0];
      this.f10000[2] = var6;
      Float var7 = f1000[1];
      this.f10000[3] = var7;
      Float var8 = f1000[2];
      this.f10000[4] = var8;
      Float var9 = f1000[3];
      this.f10000[5] = var9;
      ((IllisOqkm)this.f10000[0]).m24000();
   }

   private float m32000(float var1) {
      float var2 = ((IllisOqkm)this.f10000[0]).m40000();
      float var3 = ((IllisOqkm)this.f10000[0]).m26000(f6000[1], f6000[2]);
      if (var3 > f6000[3] && var3 < f6000[4]) {
         var3 += ((IllisOqkm)this.f10000[0]).m40000() * ((IllisOqkm)this.f10000[0]).m36000(f6000[5], f2000[0]);
      }

      return var2 * var1 * NNWE.N(var3, f2000[1], f2000[2]);
   }

   private C0983 m34000(C0768 var1, NjL var2, C0983 var3, boolean var4) {
      for (float var9 : new float[]{f5000[0], f5000[1], f5000[2], f5000[3], f5000[4]}) {
         C0983 var10 = new C0983(
            var3.m38000() + (Float)this.f10000[2] * var9, var4 ? var3.m68000() : NNWE.N(var3.m68000() + (Float)this.f10000[3] * var9, f5000[5], f5000[6])
         );
         if (var1.m36000(var2, var10)) {
            return var10;
         }
      }

      return var3;
   }
}

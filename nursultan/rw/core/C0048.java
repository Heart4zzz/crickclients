package rw.core;

import KDFzREm.NNWE;
import rw.data.Rec0013;

public class C0048 {
   private static float[] f1000;
   private static double[] f2000;
   public Object[] f3000;
   private static float[] f4000;
   private static float[] f5000;
   private static float[] f6000;
   private static float[] f7000;
   private static float[] f8000;
   private static float[] f9000;
   private static float[] f10000;

   private static void m6000() {
      f1000 = new float[]{0.0F, 0.0F, 0.0F};
      f8000 = new float[]{0.0F, 0.0F, 1.0E-4F, 1.0E-4F};
      f10000 = new float[]{0.35F, 0.45F, 0.0F};
      f6000 = new float[]{0.0F, 0.0F, 1.0F};
      f9000 = new float[]{0.62F, 7.4F, 1.85F};
      f7000 = new float[]{3.25F, 0.58F, 0.24F, 0.36F, 1.0E-4F, 0.0F, 0.62F};
      f4000 = new float[]{1.08F, 0.48F, 1.35F, 1.35F, 0.0F, 0.65F};
      f5000 = new float[]{1.65F, 1.65F, 0.0F, 0.0F, 0.0F, 0.0F};
   }

   public C0048() {
      this.m42000();
   }

   static {
      ntfClinit();
   }

   private static void m16000() {
      f2000 = new double[]{0.035F, 1.0E-5};
   }

   private float m18000(boolean var1) {
      return var1 ? (Float)this.f3000[0] : (Float)this.f3000[1];
   }

   private void m22000(boolean var1, float var2) {
      if (var1) {
         Float var7 = var2;
         this.f3000[0] = var7;
      } else {
         Float var8 = var2;
         this.f3000[1] = var8;
      }
   }

   private float m24000(boolean var1) {
      return var1 ? (Float)this.f3000[2] : (Float)this.f3000[3];
   }

   private float m26000(float var1, float var2, boolean var3, boolean var4, boolean var5) {
      float var6 = var3 ? f6000[2] : f9000[0];
      float var7 = var4 ? f9000[1] : (var5 ? f9000[2] : f7000[0]);
      float var8 = var4 ? f7000[1] : (var5 ? f7000[2] : f7000[3]);
      return var1 * var6 * var7 + Math.abs(var2) * var8;
   }

   public void m30000() {
      Float var5 = f1000[0];
      this.f3000[0] = var5;
      Float var6 = f1000[1];
      this.f3000[1] = var6;
      Float var7 = f1000[2];
      this.f3000[2] = var7;
      Float var8 = f8000[0];
      this.f3000[3] = var8;
   }

   private void m32000(boolean var1, float var2) {
      if (var1) {
         Float var7 = var2;
         this.f3000[2] = var7;
      } else {
         Float var8 = var2;
         this.f3000[3] = var8;
      }
   }

   private float m36000(float var1, float var2, double var3, float var5, boolean var6, boolean var7, boolean var8) {
      if (!(Math.abs(var1) <= f8000[2]) && !(Math.abs(var2) <= f8000[3])) {
         float var12 = Math.signum(var1);
         float var13 = this.m24000(var6);
         if (Math.signum(var13) != var12) {
            var13 = f6000[0];
            this.m22000(var6, f6000[1]);
         }

         float var9;
         float var10;
         float var11;
         if (Math.abs(
               var11 = var13
                  + NNWE.N((var10 = var12 * Math.min(Math.abs(var2), Math.abs(var1))) - var13, -(var9 = this.m26000(var5, var10, var6, var7, var8)), var9)
            )
            > Math.abs(var1)) {
            var11 = var1;
         }

         float var14 = this.m38000(var11, var1, var3, var5, var6, var7);
         this.m32000(var6, var14);
         return var14;
      } else {
         this.m32000(var6, this.m24000(var6) * f10000[0]);
         this.m22000(var6, this.m18000(var6) * f10000[1]);
         return f10000[2];
      }
   }

   private float m38000(float var1, float var2, double var3, float var5, boolean var6, boolean var7) {
      if (var3 <= f2000[1]) {
         return var1;
      } else {
         float var8 = var1 + this.m18000(var6);
         if (Math.abs(var8) <= f7000[4]) {
            return f7000[5];
         } else {
            float var9 = Math.signum(var8);
            int var10 = Math.round(Math.abs(var8) / (float)var3);
            int var11 = Math.signum(var2) == var9 && Math.abs(var2) > var5 * (var7 ? f7000[6] : f4000[0]) && Math.abs(var1) > var5 * f4000[1] ? 1 : 0;
            if (var10 == 0 && var11 != 0) {
               var10 = 1;
            }

            if (var10 == 0) {
               this.m22000(var6, NNWE.N(var8, -var5 * f4000[2], var5 * f4000[3]));
               return f4000[4];
            } else {
               float var12 = var9 * var10 * (float)var3;
               if (Math.signum(var2) == var9 && Math.abs(var12) > Math.abs(var2) && Math.abs(var2) > var5 * f4000[5]) {
                  var12 = var2;
               }

               this.m22000(var6, NNWE.N(var8 - var12, -var5 * f5000[0], var5 * f5000[1]));
               return var12;
            }
         }
      }
   }

   public Rec0013 m40000(float var1, float var2, float var3, float var4, double var5, boolean var7, boolean var8, boolean var9) {
      float var10 = (float)Math.max(var5, f2000[0]);
      float var11 = this.m36000(var1, var3, var5, var10, true, var8, var9);
      float var12 = var7 ? f8000[1] : this.m36000(var2, var4, var5, var10, false, var8, var9);
      return new Rec0013(var11, var12);
   }

   private void m42000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[4];
         Object[] var1 = this.f3000;
         var1[0] = f5000[2];
         var1[1] = f5000[3];
         var1[2] = f5000[4];
         var1[3] = f5000[5];
      }
   }
}

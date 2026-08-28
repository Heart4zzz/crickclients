package rw.core;

import KDFzREm.NHS;
import KDFzREm.NNNwS;
import KDFzREm.NNWE;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import KDFzREm.NjL;

public class ZvJx {
   private static double[] f1000;
   public Object[] f2000;
   public static Object[] f3000;
   private static double[] f4000;
   private static double[] f5000;
   private static float[] f6000;
   private static double[] f7000;

   private static void m6000() {
      f1000 = new double[]{0.0, 0.0, 0.0, 0.0, 0.0064, 0.0};
      f7000 = new double[]{1.18, 1.05, -0.025, 0.025, 1.65, 0.92, 0.025, 0.0};
      f4000 = new double[]{1.0, 1.35, 1.0, 1.0E-6, 0.0, 1.0, 0.0};
      f5000 = new double[]{0.0, 0.0, 0.0, 1.05, 0.08, 0.025, 1.0};
   }

   public ZvJx() {
      this.m18000();
   }

   static {
      ntfClinit();
   }

   private static void m14000() {
      f6000 = new float[]{1.35F, 1.25F};
   }

   private void m18000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[8];
         Object[] var1 = this.f2000;
         var1[0] = false;
         var1[1] = false;
         var1[2] = false;
         var1[3] = f4000[6];
         var1[4] = f5000[0];
         var1[5] = f5000[1];
         var1[6] = f5000[2];
         var1[7] = 0L;
      }
   }

   public void m26000() {
      Boolean var5 = false;
      this.f2000[0] = var5;
      Boolean var6 = false;
      this.f2000[1] = var6;
      Boolean var7 = false;
      this.f2000[2] = var7;
      Double var8 = f1000[0];
      this.f2000[3] = var8;
      Double var9 = f1000[1];
      this.f2000[4] = var9;
      Double var10 = f1000[2];
      this.f2000[5] = var10;
      Double var11 = f1000[3];
      this.f2000[6] = var11;
      Long var12 = 0L;
      this.f2000[7] = var12;
   }

   public boolean m30000(
      C0768 var1,
      NjL var2,
      C0983 var3,
      C0983 var4,
      NHS var5,
      NXi var6,
      NXi var7,
      double var8,
      double var10,
      float var12,
      boolean var13,
      boolean var14,
      boolean var15,
      boolean var16
   ) {
      if (var1 != null && var2 != null && var3 != null && var4 != null && var5 != null && var6 != null && var7 != null) {
         boolean var17 = var1.m36000(var2, var4);
         int var18 = !var16 && !var17 ? 0 : 1;
         int var19 = var13 && this.m44000(var7, var8, var14) ? 1 : 0;
         long var20 = System.currentTimeMillis();
         if (var19 != 0 && var18 != 0 && var10 <= var12 + f6000[0]) {
            Boolean var26 = true;
            this.f2000[0] = var26;
            Long var27 = var20 + 420L;
            this.f2000[7] = var27;
         } else if (var15 && var13 && var18 != 0 && var10 <= var12 + f6000[1]) {
            Boolean var28 = true;
            this.f2000[0] = var28;
            Long var29 = var20 + 320L;
            this.f2000[7] = var29;
         }

         if (!(Boolean)this.f2000[0]) {
            this.m36000(var7, var8);
            return (boolean)0;
         } else if (this.m32000(var3, var5, var6, var12, var16)) {
            this.m26000();
            this.m36000(var7, var8);
            return (boolean)0;
         } else if (var20 > (Long)this.f2000[7]) {
            Boolean var30 = false;
            this.f2000[0] = var30;
            this.m36000(var7, var8);
            return (boolean)0;
         } else {
            this.m36000(var7, var8);
            return (boolean)(var13 && var18 != 0 ? 1 : 0);
         }
      } else {
         this.m26000();
         return (boolean)0;
      }
   }

   private boolean m32000(C0983 var1, NHS var2, NXi var3, float var4, boolean var5) {
      if (var5) {
         return (boolean)0;
      } else {
         NXi var6 = C0052.m6000(var1.m68000(), var1.m38000());
         NXi var7 = var3.i(var6.L(var4 + f4000[1]));
         NXi var8 = this.m40000(var3, var7, var2.R());
         NXi var9 = new NXi(NNWE.N(var8.M, var2.N, var2.u), NNWE.N(var8.B, var2.y, var2.i), NNWE.N(var8.Z, var2.L, var2.R));
         return (boolean)(var8.R(var9) >= f4000[2] ? 1 : 0);
      }
   }

   public boolean m34000() {
      return (Boolean)this.f2000[0];
   }

   private void m36000(NXi var1, double var2) {
      if ((Boolean)this.f2000[1]) {
         Double var8 = var2 - (Double)this.f2000[3];
         this.f2000[4] = var8;
         Boolean var9 = true;
         this.f2000[2] = var9;
      }

      Boolean var10 = true;
      this.f2000[1] = var10;
      Double var11 = var2;
      this.f2000[3] = var11;
      Double var12 = ((NNNwS)((NNuU)C0768.f1000[0]).T[4]).method_23317() - var1.M;
      this.f2000[5] = var12;
      Double var13 = ((NNNwS)((NNuU)C0768.f1000[0]).T[4]).method_23321() - var1.Z;
      this.f2000[6] = var13;
   }

   private NXi m40000(NXi var1, NXi var2, NXi var3) {
      NXi var4 = var2.u(var1);
      double var5 = var4.B();
      if (var5 <= f4000[3]) {
         return var1;
      } else {
         double var7 = var3.u(var1).y(var4) / var5;
         return var1.i(var4.L(NNWE.N(var7, f4000[4], f4000[5])));
      }
   }

   private double m42000(double var1, double var3, double var5, double var7, double var9) {
      double var11 = -((Double)this.f2000[5] * var5 + (Double)this.f2000[6] * var7) / var9;
      var11 = NNWE.N(var11, f7000[7], f4000[0]);
      double var13 = (Double)this.f2000[5] + var5 * var11;
      double var15 = (Double)this.f2000[6] + var7 * var11;
      return Math.hypot(var13, var15);
   }

   private boolean m44000(NXi var1, double var2, boolean var4) {
      if (!(Boolean)this.f2000[1]) {
         return (boolean)0;
      } else {
         double var5 = ((NNNwS)((NNuU)C0768.f1000[0]).T[4]).method_23317() - var1.M;
         double var7 = ((NNNwS)((NNuU)C0768.f1000[0]).T[4]).method_23321() - var1.Z;
         double var9 = var5 - (Double)this.f2000[5];
         double var11 = var7 - (Double)this.f2000[6];
         double var13 = var9 * var9 + var11 * var11;
         if (var13 < f1000[4]) {
            return (boolean)0;
         } else {
            int var15 = this.f2000[5] * var5 + this.f2000[6] * var7 <= f1000[5] ? 1 : 0;
            double var16 = this.m42000(var5, var7, var9, var11, var13);
            double var18 = var4 ? f7000[0] : f7000[1];
            if (var16 > var18) {
               return (boolean)0;
            } else {
               double var20 = var2 - (Double)this.f2000[3];
               int var22 = this.f2000[2] && this.f2000[4] < f7000[2] && var20 > f7000[3] ? 1 : 0;
               int var23 = var15 != 0 && Math.min((Double)this.f2000[3], var2) <= f7000[4] ? 1 : 0;
               int var24 = Math.min((Double)this.f2000[3], var2) <= f7000[5] && var20 > f7000[6] ? 1 : 0;
               return (boolean)(var22 == 0 && var23 == 0 && var24 == 0 ? 0 : 1);
            }
         }
      }
   }

   private static void m50000() {
      f3000 = new Object[]{1.05, 0.08, 0.025, 1.0, 420L};
   }
}

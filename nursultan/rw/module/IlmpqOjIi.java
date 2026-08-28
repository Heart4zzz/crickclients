package rw.module;

import rw.Module;

public class IlmpqOjIi extends Module {
   public static Object[] f1000;
   public Object[] f2000;
   private static double[] f3000;

   public double m4000() {
      this.m2000();
      return (Double)this.f2000[0];
   }

   public IlmpqOjIi() {
      this.m2000();
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f3000 = new double[]{0.0, 0.0};
   }

   private void m2000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[2];
         Object[] var1 = this.f2000;
         var1[0] = f3000[0];
         var1[1] = f3000[1];
      }
   }

   public double m18000() {
      this.m2000();
      return (Double)this.f2000[1];
   }

   public static IlmpqOjIi m20000(double var0, double var2) {
      IlmpqOjIi var10000 = (IlmpqOjIi)f1000[0];
      Double var8 = var0;
      var10000.f2000[0] = var8;
      var10000 = (IlmpqOjIi)f1000[0];
      Double var9 = var2;
      var10000.f2000[1] = var9;
      return (IlmpqOjIi)f1000[0];
   }

   private static void m24000() {
      f1000 = new Object[]{null};
   }
}

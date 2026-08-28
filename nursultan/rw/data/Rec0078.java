package rw.data;

import java.lang.runtime.ObjectMethods;

record Rec0078() {
   private final int f1000;
   private final double[] f2000;

   Rec0078(int var1, double[] var2) {
      this.f1000 = var1;
      this.f2000 = var2;
   }

   public final boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0078,"type;c",Rec0078::f1000,Rec0078::f2000>(this, var1);
   }

   public double[] m4000() {
      return this.f2000;
   }

   public int m6000() {
      return this.f1000;
   }
}

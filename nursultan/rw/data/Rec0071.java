package rw.data;

import java.lang.runtime.ObjectMethods;

public record Rec0071() {
   private final double f1000;
   private final double f2000;
   private final double f3000;

   public double m2000() {
      return this.f3000;
   }

   public Rec0071(double var1, double var3, double var5) {
      this.f1000 = var1;
      this.f2000 = var3;
      this.f3000 = var5;
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0071,"ascent;descent;lineHeight",Rec0071::f1000,Rec0071::f2000,Rec0071::f3000>(this, var1);
   }

   public double m6000() {
      return this.f2000;
   }

   public double m8000() {
      return this.f1000;
   }
}

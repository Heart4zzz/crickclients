package rw.data;

import java.lang.runtime.ObjectMethods;

public record Rec0067() {
   private final float f1000;
   private final float f2000;

   public Rec0067(float var1, float var2) {
      this.f1000 = var1;
      this.f2000 = var2;
   }

   public final boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0067,"width;height",Rec0067::f1000,Rec0067::f2000>(this, var1);
   }

   public float m4000() {
      return this.f2000;
   }

   public float m6000() {
      return this.f1000;
   }
}

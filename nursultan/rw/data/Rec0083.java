package rw.data;

import java.lang.runtime.ObjectMethods;

public record Rec0083() {
   private final float f1000;
   private final float f2000;
   private final float f3000;

   public float m2000() {
      return this.f3000;
   }

   public Rec0083(float var1, float var2, float var3) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0083,"min;def;max",Rec0083::f1000,Rec0083::f2000,Rec0083::f3000>(this, var1);
   }

   public float m6000() {
      return this.f2000;
   }

   public float m8000() {
      return this.f1000;
   }
}

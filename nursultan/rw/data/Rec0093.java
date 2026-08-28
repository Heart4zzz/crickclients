package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.defs.Enum0044;

record Rec0093() {
   private final float f1000;
   private final float f2000;
   private final Enum0044 f3000;

   public Enum0044 m2000() {
      return this.f3000;
   }

   Rec0093(float var1, float var2, Enum0044 var3) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0093,"x;y;resolvedSide",Rec0093::f1000,Rec0093::f2000,Rec0093::f3000>(this, var1);
   }

   public float m6000() {
      return this.f2000;
   }

   public float m8000() {
      return this.f1000;
   }
}

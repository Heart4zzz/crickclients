package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.setting.C0059;

record Rec0104() {
   private final C0059 f1000;
   private final float f2000;
   private final float f3000;

   public float m2000() {
      return this.f3000;
   }

   Rec0104(C0059 var1, float var2, float var3) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0104,"viewport;grabOffsetY;accumulatedOffsetY",Rec0104::f1000,Rec0104::f2000,Rec0104::f3000>(this, var1);
   }

   public float m6000() {
      return this.f2000;
   }

   public C0059 m8000() {
      return this.f1000;
   }
}

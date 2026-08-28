package rw.data;

import java.lang.runtime.ObjectMethods;

public record Rec0029() {
   public float f1000;
   public float f2000;

   Rec0029(float var1, float var2) {
      this.f1000 = var1;
      this.f2000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0029,"yawDelta;pitchDelta",Rec0029::f1000,Rec0029::f2000>(this, var1);
   }

   public float m4000() {
      return this.f2000;
   }

   public float m6000() {
      return this.f1000;
   }
}

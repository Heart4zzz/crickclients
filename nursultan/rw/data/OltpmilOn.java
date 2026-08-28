package rw.data;

import java.lang.runtime.ObjectMethods;

public record OltpmilOn() {
   public float f1000;
   public float f2000;

   public OltpmilOn(float var1, float var2) {
      this.f2000 = var1;
      this.f1000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",OltpmilOn,"speed;acceleration",OltpmilOn::f2000,OltpmilOn::f1000>(this, var1);
   }

   public float m4000() {
      return this.f2000;
   }

   public float m6000() {
      return this.f1000;
   }
}

package rw.data;

import java.lang.runtime.ObjectMethods;

public record Rec0030() {
   public boolean f1000;
   public float f2000;

   public Rec0030(float var1, boolean var2) {
      this.f2000 = var1;
      this.f1000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0030,"speed;boosting",Rec0030::f2000,Rec0030::f1000>(this, var1);
   }

   public float m4000() {
      return this.f2000;
   }

   public boolean m6000() {
      return this.f1000;
   }
}

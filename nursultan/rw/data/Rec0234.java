package rw.data;

import java.lang.runtime.ObjectMethods;

public record Rec0234() {
   public boolean f1000;
   public float f2000;

   public Rec0234(float var1, boolean var2) {
      this.f2000 = var1;
      this.f1000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0234,"opacity;visible",Rec0234::f2000,Rec0234::f1000>(this, var1);
   }

   public boolean m4000() {
      return this.f1000;
   }

   public float m6000() {
      return this.f2000;
   }
}

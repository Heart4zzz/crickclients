package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.core.C0983;

public record Rec0014() {
   public C0983 f1000;
   public float f2000;
   public float f3000;

   public C0983 m2000() {
      return this.f1000;
   }

   public Rec0014(C0983 var1, float var2, float var3) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0014,"rotation;yawSpeed;pitchSpeed",Rec0014::f1000,Rec0014::f2000,Rec0014::f3000>(this, var1);
   }

   public float m6000() {
      return this.f3000;
   }

   public float m8000() {
      return this.f2000;
   }
}

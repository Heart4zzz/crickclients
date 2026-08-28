package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.core.C0983;

public record Rec0187() {
   public C0983 f1000;
   public boolean f2000;

   public Rec0187(C0983 var1, boolean var2) {
      this.f1000 = var1;
      this.f2000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0187,"rotation;overshooting",Rec0187::f1000,Rec0187::f2000>(this, var1);
   }

   public C0983 m4000() {
      return this.f1000;
   }

   public boolean m6000() {
      return this.f2000;
   }
}

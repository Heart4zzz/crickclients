package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.api.Iface0578;
import rw.api.Iface0608;

public non-sealed record Rec0008() implements Iface0608 {
   public Iface0578 f1000;

   public Iface0578 m2000() {
      return this.f1000;
   }

   public Rec0008(Iface0578 var1) {
      this.f1000 = var1;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0008,"action",Rec0008::f1000>(this, var1);
   }

   public Iface0578 m6000() {
      return this.f1000;
   }
}

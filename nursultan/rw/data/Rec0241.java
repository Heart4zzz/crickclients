package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.api.Iface0629;

record Rec0241() implements Iface0629 {
   final String f1000;

   Rec0241(String var1) {
      this.f1000 = var1;
   }

   public final boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0241,"target",Rec0241::f1000>(this, var1);
   }

   public String m4000() {
      return this.f1000;
   }
}

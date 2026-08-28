package rw.data;

import KDFzREm.NNoh;
import java.lang.runtime.ObjectMethods;
import rw.api.Iface0629;

record Rec0240() implements Iface0629 {
   private final NNoh f1000;

   Rec0240(NNoh var1) {
      this.f1000 = var1;
   }

   public final boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0240,"material",Rec0240::f1000>(this, var1);
   }

   public NNoh m4000() {
      return this.f1000;
   }
}

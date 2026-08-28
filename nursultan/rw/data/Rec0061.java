package rw.data;

import KDFzREm.NAQ;
import KDFzREm.NNNxM;
import java.lang.runtime.ObjectMethods;

record Rec0061() implements NNNxM {
   private final NAQ f1000;

   Rec0061(NAQ var1) {
      this.f1000 = var1;
   }

   public String m2000() {
      return this.f1000.Q() + "@" + this.f1000.d();
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0061,"blockEntity",Rec0061::f1000>(this, var1);
   }

   public NAQ m6000() {
      return this.f1000;
   }
}

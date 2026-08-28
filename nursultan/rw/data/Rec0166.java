package rw.data;

import KDFzREm.NNNxM;
import KDFzREm.NbK;
import java.lang.runtime.ObjectMethods;

record Rec0166() implements NNNxM {
   private final NbK f1000;

   Rec0166(NbK var1) {
      this.f1000 = var1;
   }

   public String m2000() {
      return this.f1000.toString();
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0166,"entity",Rec0166::f1000>(this, var1);
   }

   public NbK m6000() {
      return this.f1000;
   }
}

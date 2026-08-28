package rw.data;

import KDFzREm.NNNxM;
import KDFzREm.Ngq;
import java.lang.runtime.ObjectMethods;

record Rec0171() implements NNNxM {
   private final Ngq f1000;

   Rec0171(Ngq var1) {
      this.f1000 = var1;
   }

   public String m2000() {
      return "chunk@" + this.f1000;
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0171,"pos",Rec0171::f1000>(this, var1);
   }

   public Ngq m6000() {
      return this.f1000;
   }
}

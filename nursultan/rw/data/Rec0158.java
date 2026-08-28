package rw.data;

import KDFzREm.NNNG;
import java.lang.runtime.ObjectMethods;

record Rec0158() {
   final NNNG f1000;
   final NNNG f2000;

   Rec0158(NNNG var1, NNNG var2) {
      this.f1000 = var1;
      this.f2000 = var2;
   }

   public final boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0158,"registry;identifier",Rec0158::f1000,Rec0158::f2000>(this, var1);
   }

   public NNNG m4000() {
      return this.f2000;
   }

   public NNNG m6000() {
      return this.f1000;
   }
}

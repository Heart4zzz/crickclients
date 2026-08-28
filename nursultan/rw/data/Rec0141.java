package rw.data;

import KDFzREm.NNNNWA;
import KDFzREm.NNNeo;
import java.lang.runtime.ObjectMethods;

record Rec0141() implements NNNeo {
   private final int f1000;
   private final int f2000;

   Rec0141(int var1, int var2) {
      this.f1000 = var1;
      this.f2000 = var2;
   }

   public final boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0141,"previous;current",Rec0141::f1000,Rec0141::f2000>(this, var1);
   }

   public int m4000() {
      return this.f2000;
   }

   public int m6000() {
      return this.f1000;
   }

   public int method_48889(float var1) {
      return NNNNWA.N(var1, this.f1000, this.f2000);
   }
}

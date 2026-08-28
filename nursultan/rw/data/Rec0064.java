package rw.data;

import KDFzREm.NLz;
import KDFzREm.NNNNiR;
import java.lang.runtime.ObjectMethods;

public record Rec0064() implements NLz {
   private final NNNNiR f1000;
   private final boolean f2000;

   public Rec0064(NNNNiR var1, boolean var2) {
      this.f1000 = var1;
      this.f2000 = var2;
   }

   public final boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0064,"profile;hat",Rec0064::f1000,Rec0064::f2000>(this, var1);
   }

   public boolean m4000() {
      return this.f2000;
   }

   public NNNNiR m6000() {
      return this.f1000;
   }
}

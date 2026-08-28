package rw.core;

import KDFzREm.NCa;
import KDFzREm.NNNZB;
import KDFzREm.NNNZu;
import KDFzREm.NNNjL;
import org.jspecify.annotations.Nullable;

class C0459 implements NNNZu {
   C0459(NNNZB var1) {
      this.f1000 = var1;
   }

   @Nullable
   public NCa m2000(NNNjL var1, double var2) {
      return var2 > 0.0 ? null : this.f1000.computeFluid(var1.y(), var1.L(), var1.u()).N(var1.L());
   }

   public boolean m4000() {
      return false;
   }
}

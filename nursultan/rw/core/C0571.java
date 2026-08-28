package rw.core;

import KDFzREm.NAd;
import KDFzREm.NNpD;
import KDFzREm.NNpF;
import KDFzREm.NNpx;
import java.util.Optional;

class C0571 implements NNpF {
   C0571(String var1, NAd var2) {
      this.f1000 = var1;
      this.f2000 = var2;
   }

   public <T> Optional<T> m2000(NNpx<T> var1) {
      return var1.accept(this.f1000);
   }

   public <T> Optional<T> m4000(NNpD<T> var1, NAd var2) {
      return var1.accept(this.f2000.N(var2), this.f1000);
   }
}

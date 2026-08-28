package rw.core;

import KDFzREm.NAd;
import KDFzREm.NNpD;
import KDFzREm.NNpF;
import KDFzREm.NNpx;
import java.util.List;
import java.util.Optional;

class C0572 implements NNpF {
   C0572(List var1) {
      this.f1000 = var1;
   }

   public <T> Optional<T> m2000(NNpx<T> var1) {
      for (NNpF var3 : this.f1000) {
         Optional var4 = var3.N(var1);
         if (var4.isPresent()) {
            return var4;
         }
      }

      return Optional.empty();
   }

   public <T> Optional<T> m4000(NNpD<T> var1, NAd var2) {
      for (NNpF var4 : this.f1000) {
         Optional var5 = var4.N(var1, var2);
         if (var5.isPresent()) {
            return var5;
         }
      }

      return Optional.empty();
   }
}

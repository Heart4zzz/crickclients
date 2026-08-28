package rw.core;

import KDFzREm.NNny;
import KDFzREm.Ned;
import KDFzREm.NgS;
import java.util.Optional;
import java.util.function.BiFunction;

class C0568 implements NNny {
   C0568(NgS var1, Ned var2) {
      this.f1000 = var1;
      this.f2000 = var2;
   }

   public <T> Optional<T> m2000(BiFunction<NgS, Ned, T> var1) {
      return Optional.of((T)var1.apply(this.f1000, this.f2000));
   }
}

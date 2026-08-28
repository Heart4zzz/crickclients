package rw.core;

import KDFzREm.NHp;
import KDFzREm.NNNbA;
import KDFzREm.NNNbf;
import KDFzREm.NNpQ;
import java.util.Map;
import java.util.Optional;

class C0418 implements NNNbf {
   C0418(Map var1) {
      this.f1000 = var1;
   }

   public <T> Optional<NNNbA<T>> m2000(NNpQ<? extends NHp<? extends T>> var1) {
      return Optional.ofNullable((NNNbA<T>)this.f1000.get(var1));
   }
}

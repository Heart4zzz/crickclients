package rw.core;

import KDFzREm.NHp;
import KDFzREm.NNNGg;
import KDFzREm.NNNGo;
import KDFzREm.NNpQ;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

class C0232 implements NNNGo {
   C0232(Map var1) {
      this.f1000 = var1;
   }

   public Stream<NNpQ<? extends NHp<?>>> m2000() {
      return this.f1000.keySet().stream();
   }

   public <T> Optional<NNNGg<T>> method_46759(NNpQ<? extends NHp<? extends T>> var1) {
      return Optional.ofNullable((NNNGg<T>)this.f1000.get(var1));
   }
}

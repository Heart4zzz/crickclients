package rw.core;

import KDFzREm.NHp;
import KDFzREm.NNNGJ;
import KDFzREm.NNNGg;
import KDFzREm.NNNGo;
import KDFzREm.NNNgN;
import KDFzREm.NNNgu;
import KDFzREm.NNNtM;
import KDFzREm.NNpQ;
import KDFzREm.NoY;
import java.util.Optional;
import java.util.stream.Stream;

class C0649 implements NNNtM {
   C0649(NNNGo var1) {
      this.f1000 = var1;
   }

   public Stream<NNpQ<? extends NHp<?>>> m2000() {
      return this.f1000.y();
   }

   public NNNgN m4000() {
      return NNNgu.i.N();
   }

   private <T> NNNGJ<T> m6000(NNNGg<T> var1) {
      return new NoY(this, var1);
   }

   public <T> Optional<NNNGg<T>> method_46759(NNpQ<? extends NHp<? extends T>> var1) {
      return this.f1000.method_46759(var1).map(this::m6000);
   }
}

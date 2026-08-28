package rw.core;

import KDFzREm.NHp;
import KDFzREm.NNNGg;
import KDFzREm.NNNGo;
import KDFzREm.NNNgN;
import KDFzREm.NNNtM;
import KDFzREm.NNpQ;
import java.util.Optional;
import java.util.stream.Stream;

class C0497 implements NNNtM {
   C0497(NNNGo var1, NNNgN var2) {
      this.f1000 = var1;
      this.f2000 = var2;
   }

   public Stream<NNpQ<? extends NHp<?>>> m2000() {
      return this.f1000.y();
   }

   public NNNgN m4000() {
      return this.f2000;
   }

   public <T> Optional<NNNGg<T>> method_46759(NNpQ<? extends NHp<? extends T>> var1) {
      return this.f1000.method_46759(var1).map(var1x -> var1x.N(var0));
   }
}

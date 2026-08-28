package rw.core;

import KDFzREm.NHp;
import KDFzREm.NNAO;
import KDFzREm.NNAY;
import KDFzREm.NNpQ;
import java.util.Optional;
import java.util.stream.Stream;

class C0184 implements NNAY {
   C0184(NHp var1) {
      this.f1000 = var1;
   }

   public <T> Optional<NHp<T>> method_46759(NNpQ<? extends NHp<? extends T>> var1) {
      NHp var2 = this.f1000;
      return var2.M(var1);
   }

   public Stream<NNAO<?>> method_40311() {
      return this.f1000.Z().stream().map(NNAO::N);
   }

   public NNAY method_40316() {
      return this;
   }
}

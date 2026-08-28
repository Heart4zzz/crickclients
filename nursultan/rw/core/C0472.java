package rw.core;

import KDFzREm.NHp;
import KDFzREm.NNNgg;
import KDFzREm.NNNtM;
import KDFzREm.NNpQ;
import KDFzREm.NVF;
import KDFzREm.NVp;

public final class C0472 implements NVF<NNNgg<T>> {
   final NNpQ<? extends NHp<T>> f1000;

   C0472(NNpQ<? extends NHp<T>> var1, NNpQ var2) {
      this.f2000 = var1;
      this.f1000 = var2;
   }

   public NNNgg<T> m4000(NNNtM var1) {
      return new NNNgg(var1, this.f1000);
   }

   public NVp<NNNgg<T>, ?> m6000() {
      return this.f2000;
   }
}

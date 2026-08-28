package rw.core;

import KDFzREm.NHp;
import KDFzREm.NNNgo;
import KDFzREm.NNNtM;
import KDFzREm.NNpQ;
import KDFzREm.NVF;
import KDFzREm.NVp;

public final class C0473 implements NVF<NNNgo<T>> {
   final NNpQ<? extends NHp<T>> f1000;

   C0473(NNpQ<? extends NHp<T>> var1, NNpQ var2) {
      this.f2000 = var1;
      this.f1000 = var2;
   }

   public NNNgo<T> m4000(NNNtM var1) {
      return new NNNgo(var1, this.f1000);
   }

   public NVp<NNNgo<T>, ?> m6000() {
      return this.f2000;
   }
}

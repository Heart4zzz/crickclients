package rw.core;

import KDFzREm.NHp;
import KDFzREm.NNNtM;
import KDFzREm.NNNvt;
import KDFzREm.NNpQ;
import KDFzREm.NVF;
import KDFzREm.NVp;

public final class C0504 implements NVF<NNNvt<T>> {
   final NNpQ<? extends NHp<T>> f1000;

   C0504(NNpQ<? extends NHp<T>> var1, NNpQ var2) {
      this.f2000 = var1;
      this.f1000 = var2;
   }

   public NNNvt<T> m4000(NNNtM var1) {
      return new NNNvt(this.f1000);
   }

   public NVp<NNNvt<T>, ?> m6000() {
      return this.f2000;
   }
}

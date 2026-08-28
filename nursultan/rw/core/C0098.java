package rw.core;

import KDFzREm.HR;
import KDFzREm.NHp;
import KDFzREm.NNNtM;
import KDFzREm.NNpQ;
import KDFzREm.NVF;
import KDFzREm.NVp;

public final class C0098 implements NVF<HR<T>> {
   final NNpQ<? extends NHp<T>> f1000;

   C0098(NNpQ<? extends NHp<T>> var1, NNpQ var2) {
      this.f2000 = var1;
      this.f1000 = var2;
   }

   public HR<T> m4000(NNNtM var1) {
      return new HR(var1, this.f1000);
   }

   public NVp<HR<T>, ?> m6000() {
      return this.f2000;
   }
}

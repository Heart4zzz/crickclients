package rw.core;

import KDFzREm.NHn;
import KDFzREm.NHp;
import KDFzREm.NNNbw;
import java.util.Iterator;
import org.jspecify.annotations.Nullable;

class C0170 implements NHn<NNNbw<T>> {
   public int m2000() {
      return this.f1000.L();
   }

   @Nullable
   public NNNbw<T> m4000(int var1) {
      return (NNNbw<T>)this.f1000.L(var1).orElse(null);
   }

   C0170(NHp var1) {
      this.f1000 = var1;
   }

   public Iterator<NNNbw<T>> m6000() {
      return this.f1000.z().map(var0 -> (NNNbw)var0).iterator();
   }

   public int m14000(NNNbw<T> var1) {
      return this.f1000.N(var1.N());
   }
}

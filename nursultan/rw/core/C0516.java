package rw.core;

import KDFzREm.NNNyC;
import KDFzREm.NNNyr;
import java.util.List;

class C0516<E> implements NNNyr<E> {
   private final NNNyC<?>[] f1000;

   C0516(List<NNNyC<E>> var1) {
      this.f1000 = var1.toArray(var0 -> new NNNyC[var0]);
   }

   public E m4000(int var1) {
      for (NNNyC var5 : this.f1000) {
         var1 -= var5.y();
         if (var1 < 0) {
            return (E)var5.N();
         }
      }

      throw new IllegalStateException(var1 + " exceeded total weight");
   }
}

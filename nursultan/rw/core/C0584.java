package rw.core;

import KDFzREm.NNNfY;
import KDFzREm.NNRq;
import KDFzREm.NNnF;
import KDFzREm.NNpQ;
import KDFzREm.NOA;
import KDFzREm.NOD;
import KDFzREm.NOp;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

class C0584 implements NOD<I, T> {
   @Nullable
   private NNpQ<NOp<?>> f1000;

   C0584(NNnF var1) {
      this.f2000 = var1;
   }

   public Optional<NNNfY<T>> m2000(I var1, NNRq var2) {
      NOA var3 = var2.method_64577();
      Optional var4 = var3.N(this.f2000, var1, var2, this.f1000);
      if (var4.isPresent()) {
         NNNfY var5 = (NNNfY)var4.get();
         this.f1000 = var5.N();
         return Optional.of(var5);
      } else {
         return Optional.empty();
      }
   }
}

package rw.core;

import KDFzREm.NNGk;
import KDFzREm.NNRq;
import KDFzREm.NNhB;
import KDFzREm.NjL;
import KDFzREm.Nlh;
import KDFzREm.Ntd;
import KDFzREm.Nwn;
import org.jspecify.annotations.Nullable;

class C0613 implements NNGk {
   private final Nlh f1000;

   public C0613(Nlh var1) {
      this.f1000 = var1;
   }

   public boolean method_18303(@Nullable NjL var1, NNRq var2) {
      return (var1 instanceof Nwn || var1 instanceof Ntd || var1 instanceof NNhB) && var1.method_5858(this.f1000) > 9.0;
   }
}

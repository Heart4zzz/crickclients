package rw.core;

import KDFzREm.NAQ;
import KDFzREm.NNNNRR;
import KDFzREm.NNNNZz;
import KDFzREm.NNNNiX;
import java.util.Set;
import org.jspecify.annotations.Nullable;

class C0160 implements NNNNZz {
   @Nullable
   public <T> T method_58694(NNNNRR<? extends T> var1) {
      this.f1000.add(var1);
      return (T)this.f2000.method_58694(var1);
   }

   C0160(NAQ var1, Set var2, NNNNiX var3) {
      this.f1000 = var2;
      this.f2000 = var3;
   }

   public <T> T a_(NNNNRR<? extends T> var1, T var2) {
      this.f1000.add(var1);
      return (T)this.f2000.a_(var1, var2);
   }
}

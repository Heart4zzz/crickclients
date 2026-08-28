package rw.core;

import KDFzREm.NNNNRR;
import KDFzREm.NNNNiX;
import com.google.common.collect.Sets;
import java.util.Set;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

class C0304 implements NNNNiX {
   @Nullable
   public <T> T method_58694(NNNNRR<? extends T> var1) {
      return (T)(this.f1000.test(var1) ? this.f2000.method_58694(var1) : null);
   }

   C0304(NNNNiX var1, Predicate var2) {
      this.f2000 = var1;
      this.f1000 = var2;
   }

   public Set<NNNNRR<?>> m2000() {
      return Sets.filter(this.f2000.y(), this.f1000::test);
   }
}

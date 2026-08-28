package net.minecraft.core.component;

import KDFzREm.NNNNRR;
import KDFzREm.NNNNiX;
import com.google.common.collect.Sets;
import java.util.Set;
import org.jspecify.annotations.Nullable;

class DataComponentGetter implements NNNNiX {
   @Nullable
   public <T> T method_58694(NNNNRR<? extends T> var1) {
      Object var2 = this.L.method_58694(var1);
      return (T)(var2 != null ? var2 : this.u.method_58694(var1));
   }

   DataComponentGetter(NNNNiX var1, NNNNiX var2) {
      this.L = var1;
      this.u = var2;
   }

   public Set<NNNNRR<?>> y() {
      return Sets.union(this.u.y(), this.L.y());
   }
}

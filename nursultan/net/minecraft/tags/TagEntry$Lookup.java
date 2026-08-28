package net.minecraft.tags;

import KDFzREm.NNEQ;
import KDFzREm.NNEX;
import KDFzREm.NNNG;
import java.util.Collection;
import java.util.Map;
import org.jspecify.annotations.Nullable;

class TagEntry$Lookup implements NNEQ<T> {
   @Nullable
   public T method_43948(NNNG var1, boolean var2) {
      return (T)this.y.N.get(var1, var2).orElse(null);
   }

   @Nullable
   public Collection<T> method_43949(NNNG var1) {
      return (Collection<T>)this.N.get(var1);
   }

   TagEntry$Lookup(NNEX var1, Map var2) {
      this.y = var1;
      this.N = var2;
   }
}

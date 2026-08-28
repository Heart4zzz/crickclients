package net.minecraft.core.component;

import KDFzREm.NNNNRR;
import KDFzREm.NNNNRU;
import KDFzREm.NNNNiX;
import com.google.common.collect.Iterators;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMaps;
import java.util.Iterator;
import java.util.Set;
import org.jspecify.annotations.Nullable;

record DataComponentMap$Builder$SimpleMap() implements NNNNiX {
   private final Reference2ObjectMap<NNNNRR<?>, Object> map;

   @Nullable
   public <T> T method_58694(NNNNRR<? extends T> var1) {
      return (T)this.map.get(var1);
   }

   DataComponentMap$Builder$SimpleMap(Reference2ObjectMap<NNNNRR<?>, Object> var1) {
      this.map = var1;
   }

   @Override
   public String toString() {
      return this.map.toString();
   }

   public Iterator<NNNNRU<?>> iterator() {
      return Iterators.transform(Reference2ObjectMaps.fastIterator(this.map), NNNNRU::N);
   }

   public int u() {
      return this.map.size();
   }

   public Set<NNNNRR<?>> keySet() {
      return this.map.keySet();
   }

   public boolean N(NNNNRR<?> var1) {
      return this.map.containsKey(var1);
   }
}

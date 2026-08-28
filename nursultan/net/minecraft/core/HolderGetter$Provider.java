package net.minecraft.core;

import KDFzREm.NHp;
import KDFzREm.NNNGo;
import KDFzREm.NNNbA;
import KDFzREm.NNNbf;
import KDFzREm.NNpQ;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public final class HolderGetter$Provider implements NNNbf {
   private final NNNGo N;
   private final Map<NNpQ<? extends NHp<?>>, Optional<? extends NNNbA<?>>> y = new ConcurrentHashMap<>();

   public HolderGetter$Provider(NNNGo var1) {
      this.N = var1;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof HolderGetter$Provider var2 && this.N.equals(var2.N);
   }

   @Override
   public int hashCode() {
      return this.N.hashCode();
   }

   private Optional<NNNbA<Object>> y(NNpQ<? extends NHp<?>> var1) {
      return this.N.method_46759(var1).map(NNNbA::N);
   }

   public <E> Optional<NNNbA<E>> N(NNpQ<? extends NHp<? extends E>> var1) {
      return (Optional<NNNbA<E>>)this.y.computeIfAbsent(var1, this::y);
   }
}

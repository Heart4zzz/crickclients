package net.minecraft.tags;

import KDFzREm.NNNG;
import KDFzREm.NNNaw;
import java.util.List;
import java.util.function.Consumer;
import rw.data.Rec0065;

record TagEntry() implements NNNaw<NNNG> {
   final List<Rec0065> N;

   TagEntry(List<Rec0065> var1) {
      this.N = var1;
   }

   public void y(Consumer<NNNG> var1) {
      this.N.forEach(var1x -> var1x.f1000.method_43944(var1));
   }

   public void N(Consumer<NNNG> var1) {
      this.N.forEach(var1x -> var1x.f1000.method_32831(var1));
   }
}

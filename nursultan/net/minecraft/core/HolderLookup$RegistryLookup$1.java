package net.minecraft.core;

import KDFzREm.NNNGJ;
import KDFzREm.NNNGg;
import KDFzREm.NNNbQ;
import KDFzREm.NNpQ;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

class HolderLookup$RegistryLookup$1 implements NNNGJ<T> {
   HolderLookup$RegistryLookup$1(NNNGg var1, Predicate var2) {
      this.y = var1;
      this.val$filter = var2;
   }

   public Stream<NNNbQ<T>> listElements() {
      return this.N().z().filter(var1 -> var0.test(var1.N()));
   }

   public Optional<NNNbQ<T>> N(NNpQ<T> var1) {
      return this.N().N(var1).filter(var1x -> var0.test(var1x.N()));
   }

   public NNNGg<T> N() {
      return this.y;
   }
}

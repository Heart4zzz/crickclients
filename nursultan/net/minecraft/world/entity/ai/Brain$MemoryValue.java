package net.minecraft.world.entity.ai;

import KDFzREm.NNGD;
import KDFzREm.NNKH;
import KDFzREm.NNNqL;
import KDFzREm.NNdu;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.RecordBuilder;
import java.util.Optional;

final class Brain$MemoryValue<U> {
   private final NNdu<U> N;
   private final Optional<? extends NNKH<U>> value;

   Brain$MemoryValue(NNdu<U> var1, Optional<? extends NNKH<U>> var2) {
      this.N = var1;
      this.value = var2;
   }

   public <T> void createUnchecked(DynamicOps<T> var1, RecordBuilder<T> var2) {
      this.N.N().ifPresent(var3 -> this.value.ifPresent(var4 -> var2.add(NNNqL.k.T().encodeStart(var1, this.N), var3.encodeStart(var1, var4))));
   }

   void N(NNGD<?> var1) {
      var1.y(this.N, this.value);
   }

   static <U> Brain$MemoryValue<U> N(NNdu<U> var0, Optional<? extends NNKH<?>> var1) {
      return new Brain$MemoryValue<>(var0, var1);
   }
}

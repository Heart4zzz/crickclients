package net.minecraft.world.entity.ai;

import KDFzREm.NNGD;
import KDFzREm.NNNqL;
import KDFzREm.NNdu;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableObject;

class Brain$1 extends MapCodec<NNGD<E>> {
   Brain$1(Collection var1, Collection var2, MutableObject var3) {
      this.N = var1;
      this.y = var2;
      this.val$codecReference = var3;
   }

   public <T> DataResult<NNGD<E>> decode(DynamicOps<T> var1, MapLike<T> var2) {
      MutableObject var3 = new MutableObject(DataResult.success(ImmutableList.builder()));
      var2.entries().forEach(var3x -> {
         DataResult var4x = NNNqL.k.T().parse(var1, var3x.getFirst());
         DataResult var5 = var4x.flatMap(var3xx -> this.N(var3xx, var1, var3x.getSecond()));
         var3.setValue(((DataResult)var3.get()).apply2(Builder::add, var5));
      });
      ImmutableList var4 = ((DataResult)var3.get()).resultOrPartial(NNGD.N::error).<ImmutableList>map(Builder::build).orElseGet(ImmutableList::of);
      return DataResult.success(new NNGD(this.N, this.y, var4, this.val$codecReference));
   }

   public <T> Stream<T> keys(DynamicOps<T> var1) {
      return this.N.stream().flatMap(var0 -> var0.N().map(var1x -> NNNqL.k.y(var0)).stream()).map(var1x -> (T)var1.createString(var1x.toString()));
   }

   private <T, U> DataResult<Brain$MemoryValue<U>> N(NNdu<U> var1, DynamicOps<T> var2, T var3) {
      return var1.N()
         .<DataResult>map(DataResult::success)
         .orElseGet(() -> DataResult.error(() -> "No codec for memory: " + var1))
         .flatMap(var2x -> var2x.parse(var2, var3))
         .map(var1x -> new Brain$MemoryValue(var1, Optional.of(var1x)));
   }

   public <T> RecordBuilder<T> N(NNGD<E> var1, DynamicOps<T> var2, RecordBuilder<T> var3) {
      var1.N().forEach(var2x -> var2x.createUnchecked(var2, var3));
      return var3;
   }
}

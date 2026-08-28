package net.minecraft.world.item.component;

import KDFzREm.NNNNug;
import KDFzREm.NNNbF;
import KDFzREm.NaK;
import KDFzREm.NpC;
import KDFzREm.NpG;
import KDFzREm.rn;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;

class TypedEntityData$1 implements Codec<rn<T>> {
   TypedEntityData$1(Codec var1) {
      this.val$typeCodec = var1;
   }

   public <V> DataResult<Pair<rn<T>, V>> decode(DynamicOps<V> var1, V var2) {
      return NNNNug.y
         .decode(var1, var2)
         .flatMap(
            var3 -> {
               NaK var4 = ((NaK)var3.getFirst()).W();
               NpC var5 = var4.b("id");
               return var5 == null
                  ? DataResult.error(() -> "Expected 'id' field in " + var2)
                  : var1x.parse(val$typeCodec(var1), var5).map(var2xx -> Pair.of(new rn(var2xx, var4), var3.getSecond()));
            }
         );
   }

   public <V> DataResult<V> N(rn<T> var1, DynamicOps<V> var2, V var3) {
      return this.val$typeCodec.encodeStart(val$typeCodec(var2), var1.N).flatMap(var3x -> {
         NaK var4 = var1.y.W();
         var4.N("id", var3x);
         return NNNNug.y.encode(var4, var2, var3);
      });
   }

   private static <T> DynamicOps<NpC> val$typeCodec(DynamicOps<T> var0) {
      return (DynamicOps<NpC>)(var0 instanceof NNNbF var1 ? var1.N(NpG.N) : NpG.N);
   }
}

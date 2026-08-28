package net.minecraft.util.datafix;

import KDFzREm.NNkj;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;

class DataFixTypes$1 implements Codec<A> {
   DataFixTypes$1(NNkj var1, Codec var2, int var3, DataFixer var4) {
      this.u = var1;
      this.val$codec = var2;
      this.val$defaultVersion = var3;
      this.val$dataFixer = var4;
   }

   public <T> DataResult<Pair<A, T>> decode(DynamicOps<T> var1, T var2) {
      int var3 = var1.get(var2, "DataVersion").flatMap(var1::getNumberValue).map(Number::intValue).result().orElse(this.val$defaultVersion);
      Dynamic var4 = new Dynamic(var1, var1.remove(var2, "DataVersion"));
      Dynamic var5 = this.u.N(this.val$dataFixer, var4, var3);
      return this.val$codec.decode(var5);
   }

   public <T> DataResult<T> encode(A var1, DynamicOps<T> var2, T var3) {
      return this.val$codec.encode(var1, var2, var3).flatMap(var1x -> var2.mergeToMap(var1x, var2.createString("DataVersion"), var2.createInt(NNkj.N())));
   }
}

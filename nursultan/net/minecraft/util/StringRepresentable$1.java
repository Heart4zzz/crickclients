package net.minecraft.util;

import KDFzREm.NNWv;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Keyable;
import java.util.Arrays;
import java.util.stream.Stream;

class StringRepresentable$1 implements Keyable {
   StringRepresentable$1(NNWv[] var1) {
      this.N = var1;
   }

   public <T> Stream<T> keys(DynamicOps<T> var1) {
      return Arrays.stream(this.N).map(NNWv::method_15434).map(var1::createString);
   }
}

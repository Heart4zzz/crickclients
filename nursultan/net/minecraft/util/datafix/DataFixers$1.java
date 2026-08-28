package net.minecraft.util.datafix;

import KDFzREm.NNNCa;
import KDFzREm.NNmy;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

class DataFixers$1 extends NNNCa {
   DataFixers$1(Schema var1, boolean var2, String var3, TypeReference var4, String var5) {
      super(var1, var2, var3, var4, var5);
   }

   protected <T> Dynamic<T> fix(Dynamic<T> var1) {
      return NNmy.N(var1);
   }
}

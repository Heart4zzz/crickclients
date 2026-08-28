package net.minecraft.client;

import KDFzREm.NNNtl;
import KDFzREm.NNib;
import KDFzREm.NNiz;
import com.mojang.datafixers.util.Pair;
import java.util.List;

class Options$4 implements NNib {
   Options$4(NNiz var1, List var2) {
      this.val$optionsForReport = var2;
   }

   public <T> void N(String var1, NNNtl<T> var2) {
      this.val$optionsForReport.add(Pair.of(var1, var2.method_41753()));
   }
}

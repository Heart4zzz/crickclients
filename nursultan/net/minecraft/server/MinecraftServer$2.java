package net.minecraft.server;

import KDFzREm.NNNNsj;
import KDFzREm.NNka;
import KDFzREm.NWf;
import KDFzREm.Nga;
import java.util.List;
import java.util.Locale;

class MinecraftServer$2 implements NNka {
   MinecraftServer$2(NNNNsj var1, List var2, Nga var3) {
      this.N = var2;
      this.y = var3;
   }

   public <T> void N(NWf<T> var1) {
      this.N.add(String.format(Locale.ROOT, "%s=%s\n", var1.y(), this.y.y(var1)));
   }
}

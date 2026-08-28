package net.minecraft.server.packs.repository;

import KDFzREm.NAN;
import KDFzREm.NNFy;
import java.util.function.UnaryOperator;

class PackSource implements NNFy {
   PackSource(UnaryOperator var1, boolean var2) {
      this.NO_DECORATION = var1;
      this.B = var2;
   }

   public NAN method_45282(NAN var1) {
      return this.NO_DECORATION.apply(var1);
   }

   public boolean shouldAddAutomatically() {
      return this.B;
   }
}

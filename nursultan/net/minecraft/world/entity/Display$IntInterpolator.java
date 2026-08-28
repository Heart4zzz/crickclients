package net.minecraft.world.entity;

import KDFzREm.NNNeo;
import KDFzREm.NNWE;

record Display$IntInterpolator() implements NNNeo {
   private final int N;
   private final int y;

   Display$IntInterpolator(int var1, int var2) {
      this.N = var1;
      this.y = var2;
   }

   public int get(float var1) {
      return NNWE.N(var1, this.N, this.y);
   }
}

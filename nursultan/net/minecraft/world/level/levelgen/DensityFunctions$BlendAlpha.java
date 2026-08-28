package net.minecraft.world.level.levelgen;

import KDFzREm.NNNEd;
import KDFzREm.NNNEm;
import KDFzREm.NNNjL;
import KDFzREm.NNNjN;
import KDFzREm.NNNjR;
import KDFzREm.NNNjU;
import KDFzREm.NNNjy;
import KDFzREm.NNNlL;

class DensityFunctions$BlendAlpha implements NNNEd {
   public NNNlL<? extends NNNjN> L() {
      return NNNjU.field_37079;
   }

   DensityFunctions$BlendAlpha(NNNEm var1) {
      this.N = var1;
   }

   public NNNjN u() {
      return NNNjU.field_36549;
   }

   public double y() {
      return 1.0;
   }

   public double N() {
      return 0.0;
   }

   public void N(double[] var1, NNNjy var2) {
      var2.N(var1, this);
   }

   public double N(NNNjL var1) {
      return this.N.L(var1.y(), var1.u()).N();
   }

   public NNNjN N(NNNjR var1) {
      return this.u().N(var1);
   }
}

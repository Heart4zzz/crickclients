package net.minecraft.world.level.levelgen;

import KDFzREm.NNNEd;
import KDFzREm.NNNEm;
import KDFzREm.NNNjL;
import KDFzREm.NNNjN;
import KDFzREm.NNNjR;
import KDFzREm.NNNjW;
import KDFzREm.NNNjy;
import KDFzREm.NNNlL;

class DensityFunctions$BlendOffset implements NNNEd {
   public NNNlL<? extends NNNjN> L() {
      return NNNjW.field_37081;
   }

   DensityFunctions$BlendOffset(NNNEm var1) {
      this.N = var1;
   }

   public NNNjN u() {
      return NNNjW.field_36551;
   }

   public double y() {
      return Double.POSITIVE_INFINITY;
   }

   public double N() {
      return Double.NEGATIVE_INFINITY;
   }

   public void N(double[] var1, NNNjy var2) {
      var2.N(var1, this);
   }

   public double N(NNNjL var1) {
      return this.N.L(var1.y(), var1.u()).y();
   }

   public NNNjN N(NNNjR var1) {
      return this.u().N(var1);
   }
}

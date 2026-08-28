package net.minecraft.world.level.levelgen;

import KDFzREm.NNNEd;
import KDFzREm.NNNEm;
import KDFzREm.NNNjL;
import KDFzREm.NNNjN;
import KDFzREm.NNNje;
import KDFzREm.NNNjv;
import KDFzREm.NNNjy;

class NoiseChunk$CacheAllInCell implements NNNEd, NNNje {
   final NNNjN N;
   final double[] values;

   NoiseChunk$CacheAllInCell(NNNEm var1, NNNjN var2) {
      this.L = var1;
      this.N = var2;
      this.values = new double[var1.Z * var1.Z * var1.z];
      var1.M.add(this);
   }

   public NNNjv i() {
      return NNNjv.field_36566;
   }

   public NNNjN u() {
      return this.N;
   }

   public double N(NNNjL var1) {
      if (var1 != this.L) {
         return this.N.N(var1);
      } else if (!this.L.U) {
         throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
      } else {
         int var2 = this.L.m;
         int var3 = this.L.P;
         int var4 = this.L.s;
         return var2 >= 0 && var3 >= 0 && var4 >= 0 && var2 < this.L.Z && var3 < this.L.z && var4 < this.L.Z
            ? this.values[((this.L.z - 1 - var3) * this.L.Z + var2) * this.L.Z + var4]
            : this.N.N(var1);
      }
   }

   public void N(double[] var1, NNNjy var2) {
      var2.N(var1, this);
   }
}

package rw.core;

import KDFzREm.NNNXD;
import KDFzREm.NNNcm;
import KDFzREm.NNWE;

public abstract class Base0460 implements NNNcm {
   protected Base0460(NNNXD var1) {
      this.f1000 = var1;
   }

   public int m2000(float var1) {
      return Math.max(NNWE.y(this.f1000.B + this.f1000.Z * var1), 0);
   }
}

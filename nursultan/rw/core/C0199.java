package rw.core;

import KDFzREm.NAN;
import KDFzREm.NNGc;
import KDFzREm.NNMH;
import KDFzREm.NNUm;
import KDFzREm.NNag;

class C0199 extends NNUm {
   C0199(NNGc var1, NNMH var2, int var3, int var4, int var5, int var6, NAN var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.f1000 = var1;
   }

   protected NNag method_25360() {
      return super.method_25360().y(this.f1000.R.i());
   }
}

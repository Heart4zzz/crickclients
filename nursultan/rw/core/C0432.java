package rw.core;

import KDFzREm.NNNPN;
import KDFzREm.NNNmf;
import KDFzREm.NNXC;

class C0432 extends Base0428 {
   C0432(NNNPN var1, NNNmf var2, NNXC var3) {
      super(var2);
      this.f3000 = var1;
      this.f1000 = var2;
      this.f2000 = var3;
   }

   protected boolean m2000() {
      double var1 = this.f2000.N(this.L.z, 0.0, this.L.U);
      return var1 >= this.f3000.N && var1 <= this.f3000.y;
   }
}

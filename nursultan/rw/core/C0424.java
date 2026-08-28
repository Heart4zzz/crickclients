package rw.core;

import KDFzREm.NNNPz;
import KDFzREm.NNNmf;
import KDFzREm.NNWE;

class C0424 extends Base0430 {
   C0424(NNNPz var1, NNNmf var2, boolean var3) {
      super(var2);
      this.f3000 = var1;
      this.f1000 = var2;
      this.f2000 = var3;
   }

   protected boolean m2000() {
      int var1 = this.f2000 ? this.L.b : this.L.j;
      int var2 = this.f3000.y ? this.L.E : 0;
      int var3 = this.f3000.u == 0 ? 0 : (int)NNWE.y(this.L.N(), -1.0, 1.0, 0.0, this.f3000.u);
      return var1 <= 1 + this.f3000.N + var2 + var3;
   }
}

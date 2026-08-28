package rw.core;

import KDFzREm.NNNPs;
import KDFzREm.NNNmf;

class C0423 extends Base0430 {
   C0423(NNNPs var1, NNNmf var2) {
      super(var2);
      this.f2000 = var1;
      this.f1000 = var2;
   }

   protected boolean m2000() {
      return this.L.T == Integer.MIN_VALUE || this.L.s + (this.f2000.u ? this.L.j : 0) >= this.L.T + this.f2000.N + this.L.E * this.f2000.y;
   }
}

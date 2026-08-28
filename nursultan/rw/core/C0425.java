package rw.core;

import KDFzREm.NNNPb;
import KDFzREm.NNNmf;

class C0425 extends Base0430 {
   C0425(NNNPb var1, NNNmf var2) {
      super(var2);
      this.f2000 = var1;
      this.f1000 = var2;
   }

   protected boolean m2000() {
      return this.L.s + (this.f2000.u ? this.L.j : 0) >= this.f2000.N.N(this.L.B) + this.L.E * this.f2000.y;
   }
}

package rw.core;

import KDFzREm.NNNEO;
import KDFzREm.NNNPG;
import KDFzREm.NNNmf;
import KDFzREm.NNWE;
import KDFzREm.NNrm;

class C0427 extends Base0430 {
   C0427(NNNPG var1, NNNmf var2, int var3, int var4, NNNEO var5) {
      super(var2);
      this.f1000 = var2;
      this.f2000 = var3;
      this.f3000 = var4;
      this.f4000 = var5;
   }

   protected boolean m2000() {
      int var1 = this.L.s;
      if (var1 <= this.f2000) {
         return true;
      } else if (var1 >= this.f3000) {
         return false;
      } else {
         double var2 = NNWE.y(var1, this.f2000, this.f3000, 1.0, 0.0);
         NNrm var4 = this.f4000.N(this.L.z, var1, this.L.U);
         return var4.z() < var2;
      }
   }
}

package rw.core;

import KDFzREm.NNZC;
import KDFzREm.NNZh;
import KDFzREm.NNrm;
import KDFzREm.NNzB;
import KDFzREm.NNzu;
import KDFzREm.Nef;

class C0539 implements NNZC {
   public boolean m2000(NNzB var1) {
      return var1.L[Nef.field_11036.L()] && !var1.y[Nef.field_11036.L()].u;
   }

   public NNzu m4000(Nef var1, NNzB var2, NNrm var3) {
      var2.u = true;
      var2.y[Nef.field_11036.L()].u = true;
      return new NNZh(var1, var2);
   }
}

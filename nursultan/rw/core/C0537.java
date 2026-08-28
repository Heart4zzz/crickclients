package rw.core;

import KDFzREm.NNZC;
import KDFzREm.NNZx;
import KDFzREm.NNrm;
import KDFzREm.NNzB;
import KDFzREm.NNzu;
import KDFzREm.Nef;

class C0537 implements NNZC {
   public boolean m2000(NNzB var1) {
      return var1.L[Nef.field_11034.L()] && !var1.y[Nef.field_11034.L()].u;
   }

   public NNzu m4000(Nef var1, NNzB var2, NNrm var3) {
      var2.u = true;
      var2.y[Nef.field_11034.L()].u = true;
      return new NNZx(var1, var2);
   }
}

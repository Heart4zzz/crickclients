package rw.core;

import KDFzREm.NNZC;
import KDFzREm.NNZD;
import KDFzREm.NNrm;
import KDFzREm.NNzB;
import KDFzREm.NNzu;
import KDFzREm.Nef;

class C0541 implements NNZC {
   public boolean m2000(NNzB var1) {
      if (var1.L[Nef.field_11034.L()] && !var1.y[Nef.field_11034.L()].u && var1.L[Nef.field_11036.L()] && !var1.y[Nef.field_11036.L()].u) {
         NNzB var2 = var1.y[Nef.field_11034.L()];
         return var2.L[Nef.field_11036.L()] && !var2.y[Nef.field_11036.L()].u;
      } else {
         return false;
      }
   }

   public NNzu m4000(Nef var1, NNzB var2, NNrm var3) {
      var2.u = true;
      var2.y[Nef.field_11034.L()].u = true;
      var2.y[Nef.field_11036.L()].u = true;
      var2.y[Nef.field_11034.L()].y[Nef.field_11036.L()].u = true;
      return new NNZD(var1, var2);
   }
}

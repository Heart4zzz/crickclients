package rw.core;

import KDFzREm.NCa;
import KDFzREm.NKL;
import KDFzREm.NNHG;
import KDFzREm.NNNI;
import KDFzREm.NNRq;
import KDFzREm.NQo;
import KDFzREm.NVA;
import KDFzREm.Ned;
import KDFzREm.Nee;
import KDFzREm.Nef;

class C0175 extends NNNI {
   public NQo m2000(Nee var1, NQo var2) {
      Nef var3 = (Nef)var1.u().L(NVA.y);
      Ned var4 = var1.L().method_10093(var3);
      NNRq var5 = var1.y();
      NCa var6 = var5.method_8320(var4);
      this.N(true);
      if (var6.N(NKL.TE)) {
         if ((Integer)var6.L(NNHG.u) != 4) {
            NNHG.N(null, var5, var4, var6);
            var2.B(1);
         } else {
            this.N(false);
         }

         return var2;
      } else {
         return super.N(var1, var2);
      }
   }
}

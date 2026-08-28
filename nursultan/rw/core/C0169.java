package rw.core;

import KDFzREm.NKL;
import KDFzREm.NKc;
import KDFzREm.NNDz;
import KDFzREm.NNNI;
import KDFzREm.NNRq;
import KDFzREm.NQo;
import KDFzREm.NVA;
import KDFzREm.Ned;
import KDFzREm.Nee;
import KDFzREm.Nef;
import KDFzREm.gd;

class C0169 extends NNNI {
   protected NQo m2000(Nee var1, NQo var2) {
      NNRq var3 = var1.y();
      Ned var4 = var1.L().method_10093((Nef)var1.u().L(NVA.y));
      NKc var5 = (NKc)NKL.iK;
      if (var3.R(var4) && var5.N(var3, var4)) {
         if (!var3.method_8608()) {
            var3.method_8652(var4, var5.W(), 3);
            var3.N(null, NNDz.Z, var4);
         }

         var2.B(1);
         this.N(true);
      } else {
         this.N(gd.y(var1, var2));
      }

      return var2;
   }
}

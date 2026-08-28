package rw.core;

import KDFzREm.NAQ;
import KDFzREm.NAW;
import KDFzREm.NCa;
import KDFzREm.NKL;
import KDFzREm.NNDz;
import KDFzREm.NNNI;
import KDFzREm.NNNgv;
import KDFzREm.NNRq;
import KDFzREm.NQo;
import KDFzREm.NVA;
import KDFzREm.NaJ;
import KDFzREm.Ned;
import KDFzREm.Nee;
import KDFzREm.Nef;
import KDFzREm.NfH;
import KDFzREm.gd;

class C0173 extends NNNI {
   protected NQo m2000(Nee var1, NQo var2) {
      NNRq var3 = var1.y();
      Nef var4 = (Nef)var1.u().L(NVA.y);
      Ned var5 = var1.L().method_10093(var4);
      if (var3.R(var5) && NAW.y(var3, var5, var2)) {
         var3.method_8652(var5, (NCa)NKL.Bl.W().y(NaJ.i, NNNgv.N(var4)), 3);
         var3.N(null, NNDz.Z, var5);
         NAQ var6 = var3.method_8321(var5);
         if (var6 instanceof NfH) {
            NAW.N(var3, var5, (NfH)var6);
         }

         var2.B(1);
         this.N(true);
      } else {
         this.N(gd.y(var1, var2));
      }

      return var2;
   }
}

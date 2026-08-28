package rw.core;

import KDFzREm.NCa;
import KDFzREm.NKd;
import KDFzREm.NNDz;
import KDFzREm.NNRq;
import KDFzREm.NQl;
import KDFzREm.NQo;
import KDFzREm.NVA;
import KDFzREm.Nea;
import KDFzREm.Ned;
import KDFzREm.Nee;
import KDFzREm.Nef;

class C0171 extends Nea {
   public NQo m2000(Nee var1, NQo var2) {
      NNRq var3 = var1.y();
      Ned var4 = var1.L().method_10093((Nef)var1.u().L(NVA.y));
      NCa var5 = var3.method_8320(var4);
      if (var5.i() instanceof NKd var8) {
         NQo var9 = var8.N(null, var3, var4, var5);
         if (var9.R()) {
            return super.N(var1, var2);
         } else {
            var3.N(null, NNDz.d, var4);
            NQl var7 = var9.B();
            return this.N(var1, var2, new NQo(var7));
         }
      } else {
         return super.N(var1, var2);
      }
   }
}

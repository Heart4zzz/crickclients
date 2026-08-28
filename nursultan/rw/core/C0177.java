package rw.core;

import KDFzREm.NCa;
import KDFzREm.NNNI;
import KDFzREm.NNNNx;
import KDFzREm.NNRq;
import KDFzREm.NQo;
import KDFzREm.NVA;
import KDFzREm.Ned;
import KDFzREm.Nee;
import KDFzREm.Nef;
import java.util.Optional;

class C0177 extends NNNI {
   public NQo m2000(Nee var1, NQo var2) {
      Ned var3 = var1.L().method_10093((Nef)var1.u().L(NVA.y));
      NNRq var4 = var1.y();
      NCa var5 = var4.method_8320(var3);
      Optional var6 = NNNNx.N(var5);
      if (var6.isPresent()) {
         var4.method_8501(var3, (NCa)var6.get());
         var4.N(3003, var3, 0);
         var2.B(1);
         this.N(true);
         return var2;
      } else {
         return super.N(var1, var2);
      }
   }
}

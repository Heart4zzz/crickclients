package rw.core;

import KDFzREm.NNRq;
import KDFzREm.NNSK;
import KDFzREm.NQa;
import KDFzREm.NQo;
import KDFzREm.NVA;
import KDFzREm.Nea;
import KDFzREm.Ned;
import KDFzREm.Nee;
import KDFzREm.Nef;

class C0172 extends Nea {
   private final Nea f1000 = new Nea();

   public NQo m2000(Nee var1, NQo var2) {
      NNSK var3 = (NNSK)var2.B();
      Ned var4 = var1.L().method_10093((Nef)var1.u().L(NVA.y));
      NNRq var5 = var1.y();
      if (var3.N(null, var5, var4, null)) {
         var3.N(null, var5, var2, var4);
         return this.N(var1, var2, new NQo(NQa.jU));
      } else {
         return this.f1000.dispense(var1, var2);
      }
   }
}

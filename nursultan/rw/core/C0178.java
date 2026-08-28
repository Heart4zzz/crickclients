package rw.core;

import KDFzREm.NGC;
import KDFzREm.NNDz;
import KDFzREm.NNNI;
import KDFzREm.NNRq;
import KDFzREm.NNUU;
import KDFzREm.NNUW;
import KDFzREm.NQo;
import KDFzREm.NVA;
import KDFzREm.Ned;
import KDFzREm.Nee;
import KDFzREm.Nef;
import KDFzREm.Nga;

class C0178 extends NNNI {
   protected NQo m2000(Nee var1, NQo var2) {
      NNRq var3 = var1.y();
      if (!(Boolean)var3.method_64395().N(Nga.Nu)) {
         this.N(false);
         return var2;
      } else {
         Ned var4 = var1.L().method_10093((Nef)var1.u().L(NVA.y));
         NGC var5 = new NGC(var3, var4.method_10263() + 0.5, var4.method_10264(), var4.method_10260() + 0.5, null);
         var3.method_8649(var5);
         var3.method_43128(null, var5.method_23317(), var5.method_23318(), var5.method_23321(), NNUU.Qp, NNUW.field_15245, 1.0F, 1.0F);
         var3.N(null, NNDz.v, var4);
         var2.B(1);
         this.N(true);
         return var2;
      }
   }
}

package rw.core;

import KDFzREm.NGx;
import KDFzREm.NQo;
import KDFzREm.Ned;

class C0325 {
   final Ned f1000;
   NQo f2000;

   C0325(Ned var1, NQo var2) {
      this.f1000 = var1;
      this.f2000 = var2;
   }

   public void m2000(NQo var1) {
      if (NGx.N(this.f2000, var1)) {
         this.f2000 = NGx.N(this.f2000, var1, 16);
      }
   }
}

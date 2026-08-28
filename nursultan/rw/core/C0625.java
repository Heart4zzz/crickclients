package rw.core;

import KDFzREm.NNNHS;
import KDFzREm.NQo;
import KDFzREm.Nbr;
import KDFzREm.Nbx;
import KDFzREm.Nwn;

class C0625 implements NNNHS {
   C0625(Nbr var1, Nbx var2) {
      this.f2000 = var1;
      this.f1000 = var2;
   }

   public void m2000(NQo var1) {
      this.f2000.method_5673(this.f1000, var1);
      if (!var1.R()) {
         this.f2000.N(this.f1000);
         this.f2000.NW();
      }
   }

   public NQo m4000() {
      return this.f2000.method_6118(this.f1000);
   }

   public boolean method_5443(Nwn var1) {
      return var1.method_5854() == this.f2000 || var1.method_56094(this.f2000, 4.0);
   }

   public void method_5431() {
   }
}

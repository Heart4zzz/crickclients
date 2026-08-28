package rw.core;

import KDFzREm.Nde;
import KDFzREm.NlV;

class C0637 extends Nde {
   C0637(NlV var1) {
      super(var1);
      this.f1000 = var1;
   }

   public void m2000() {
      if (this.f1000.T() != null) {
         this.f1000.p().N(this.f1000.T(), this.f1000.NR(), this.f1000.Ni());
      } else if (this.f1000.W() != null) {
         this.f1000.p().N(this.f1000.W(), this.f1000.NR(), this.f1000.Ni());
      }
   }
}

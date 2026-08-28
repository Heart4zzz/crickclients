package rw.core;

import KDFzREm.NAa;
import KDFzREm.NCa;
import KDFzREm.NNRq;
import KDFzREm.NVB;
import KDFzREm.NXi;
import KDFzREm.NZr;
import KDFzREm.NcV;
import KDFzREm.Nef;
import KDFzREm.Ngw;
import KDFzREm.Not;
import KDFzREm.Nov;

class C0161 extends Ngw {
   C0161(NAa var1) {
      this.f1000 = var1;
   }

   public boolean m2000() {
      return !this.f1000.k();
   }

   public Not m4000(NNRq var1, Nov var2) {
      Nef var3 = (Nef)this.f1000.w().L(NVB.y);
      return new Not(var2, NXi.y(this.f1000.U), new NcV(0.0F, var3.U()), var1, NZr.L, this.i().getString(), this.i(), var1.method_8503(), null);
   }

   public void m6000(NNRq var1) {
      NCa var2 = var1.method_8320(this.f1000.U);
      var1.method_8413(this.f1000.U, var2, var2, 3);
   }

   public void m8000(String var1) {
      super.N(var1);
      this.f1000.method_5431();
   }
}

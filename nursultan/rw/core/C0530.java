package rw.core;

import KDFzREm.NNTn;
import KDFzREm.NNTs;
import KDFzREm.NjD;
import KDFzREm.Njx;
import java.util.EnumSet;

public class C0530 extends Njx {
   private final NNTs f1000;

   public void m2000() {
      this.f1000.z(true);
      super.L();
   }

   C0530(NNTs var1, NNTs var2) {
      this.f2000 = var1;
      this.f1000 = var2;
      this.N(EnumSet.of(NjD.field_18405));
   }

   public void m4000() {
      if (!this.f1000.method_5701() && NNTs.N(this.f1000).y(this.N(100)) == 0) {
         this.f2000.method_56078(this.f2000.E());
      }

      if (!this.f1000.method_5765() && NNTs.y(this.f1000).y(this.N(50)) == 0) {
         this.f1000.A().y();
      }

      super.i();
   }

   public void m6000() {
      this.f1000.z(false);
      super.u();
   }

   public boolean m8000() {
      NNTn var1 = this.f1000.K();
      return this.f1000.method_5805() && this.f1000.T() == null && var1 != null && var1.R();
   }
}

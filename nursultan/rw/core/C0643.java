package rw.core;

import KDFzREm.Njx;
import KDFzREm.Nng;

class C0643 extends Njx {
   private final Nng f1000;
   private int f2000;

   public void m2000() {
      this.f1000.M(true);
      this.f2000 = 0;
   }

   public C0643(Nng var1) {
      this.f1000 = var1;
   }

   public void m4000() {
      this.f1000.M(false);
      this.f2000 = this.f1000.field_6012 + 200;
   }

   public boolean m6000() {
      return !this.f1000.method_5799() && (this.f1000.Q() || Nng.z(this.f1000).y(y(600)) != 1) ? Nng.U(this.f1000).y(y(2000)) != 1 : false;
   }

   public boolean m8000() {
      return this.f2000 < this.f1000.field_6012 && this.f1000.Q() && this.f1000.No() && Nng.Z(this.f1000).y(y(400)) == 1;
   }
}

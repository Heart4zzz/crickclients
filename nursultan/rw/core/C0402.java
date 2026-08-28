package rw.core;

import rw.data.Rec0135;
import rw.setting.C0062;

final class C0402 {
   private final C0062 f1000;

   C0402(C0062 var1) {
      this.f1000 = var1;
   }

   void m2000() {
      C0387 var1 = new C0387(this.f1000.m8000(), new Rec0135(this.f1000), this.f1000.m26000(), true);
      var1.m12000(this.f1000.m18000());
   }
}

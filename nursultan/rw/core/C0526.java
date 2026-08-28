package rw.core;

import KDFzREm.NNSO;
import KDFzREm.NQo;
import KDFzREm.Nbx;
import KDFzREm.NjL;
import java.util.function.Predicate;

class C0526 implements NNSO {
   C0526(NjL var1, Nbx var2, Predicate var3) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
   }

   public NQo m2000() {
      return this.f1000.method_6118(this.f2000);
   }

   public boolean m4000(NQo var1) {
      if (!this.f3000.test(var1)) {
         return false;
      } else {
         this.f1000.method_5673(this.f2000, var1);
         return true;
      }
   }
}

package rw.core;

import KDFzREm.NNSO;
import KDFzREm.NQo;
import java.util.List;

class C0527 implements NNSO {
   C0527(List var1, int var2) {
      this.f1000 = var1;
      this.f2000 = var2;
   }

   public NQo m2000() {
      return (NQo)this.f1000.get(this.f2000);
   }

   public boolean m4000(NQo var1) {
      this.f1000.set(this.f2000, var1);
      return true;
   }
}

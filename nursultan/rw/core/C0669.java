package rw.core;

import KDFzREm.NZr;
import KDFzREm.Nzz;

class C0669 implements NZr {
   C0669(Nzz var1) {
      this.f1000 = var1;
   }

   @Override
   public String toString() {
      return "permission level: " + this.f1000.name();
   }

   public Nzz m2000() {
      return this.f1000;
   }
}

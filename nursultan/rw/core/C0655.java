package rw.core;

import KDFzREm.Ned;
import KDFzREm.NtO;
import KDFzREm.Nvt;

class C0655 extends Nvt {
   C0655(NtO var1, double var2) {
      super(var1, var2);
   }

   public boolean m2000() {
      if (!this.M()) {
         return false;
      } else {
         Ned var1 = this.N(this.L.method_73183(), this.L, 7);
         if (var1 != null) {
            this.i = var1.method_10263();
            this.R = var1.method_10264();
            this.M = var1.method_10260();
            return true;
         } else {
            return this.Z();
         }
      }
   }
}

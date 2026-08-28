package rw.core;

import KDFzREm.NAQ;
import KDFzREm.NBf;
import KDFzREm.NZu;
import KDFzREm.NZy;
import rw.api.Iface0515;

class C0602 implements NZy {
   C0602(NZu var1, NAQ var2) {
      this.f2000 = var1;
      this.f1000 = var2;
   }

   public <T> void m2000(NBf<T> var1, Iface0515<T> var2) {
      this.f2000.N(var1).m18000(this.f1000.d(), var2);
   }
}

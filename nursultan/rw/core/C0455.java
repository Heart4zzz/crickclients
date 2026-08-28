package rw.core;

import KDFzREm.NNka;
import KDFzREm.NWf;
import KDFzREm.Nab;
import java.util.Set;

class C0455 implements NNka {
   C0455(Nab var1, Set var2) {
      this.f1000 = var1;
      this.f2000 = var2;
   }

   public <T> void m2000(NWf<T> var1) {
      if (!this.f1000.N(var1.L())) {
         this.f2000.add(var1.N());
      }
   }
}

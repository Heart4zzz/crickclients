package rw.core;

import KDFzREm.NAd;
import KDFzREm.NNaN;
import KDFzREm.NNaZ;
import KDFzREm.NNau;
import KDFzREm.NNay;
import KDFzREm.NNpD;
import KDFzREm.NNpF;
import java.util.Optional;

class C0544 implements NNpD<NNpF> {
   private final NNaN f1000;

   C0544(NNau var1, NNaZ var2) {
      this.f2000 = var2;
      this.f1000 = new NNaN();
   }

   public Optional<NNpF> m2000(NAd var1, String var2) {
      this.f2000.y();
      if (!NNay.L(var2, var1, this.f2000)) {
         String var3 = var2.substring(0, this.f2000.N());
         if (!var3.isEmpty()) {
            this.f1000.N(NNpF.N(var3, var1));
         }

         return Optional.of(this.f1000.y());
      } else {
         if (!var2.isEmpty()) {
            this.f1000.N(NNpF.N(var2, var1));
         }

         return Optional.empty();
      }
   }
}

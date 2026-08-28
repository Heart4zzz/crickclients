package rw.core;

import KDFzREm.NAd;
import KDFzREm.NNAf;
import KDFzREm.NNay;
import KDFzREm.NNpF;
import KDFzREm.Nab;
import java.util.Map;
import java.util.Optional;

class C0609 extends Nab {
   C0609(Map var1) {
      this.f1000 = var1;
   }

   public NNAf m2000(NNpF var1) {
      return var1x -> var1.N((var1xx, var2) -> NNay.L(var2, var1xx, var1x) ? Optional.empty() : NNpF.L, NAd.N).isPresent();
   }

   public boolean m8000() {
      return false;
   }

   public boolean m10000(String var1) {
      return this.f1000.containsKey(var1);
   }

   public String m12000(String var1, String var2) {
      return this.f1000.getOrDefault(var1, var2);
   }
}

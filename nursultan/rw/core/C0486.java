package rw.core;

import KDFzREm.NNNjN;
import KDFzREm.NNNjR;
import KDFzREm.NNNjV;
import KDFzREm.NNNjj;
import KDFzREm.NNNnf;
import java.util.HashMap;
import java.util.Map;

class C0486 implements NNNjR {
   private final Map<NNNjN, NNNjN> f1000 = new HashMap<>();

   C0486(NNNnf var1) {
   }

   public NNNjN m2000(NNNjN var1) {
      return this.f1000.computeIfAbsent(var1, this::m4000);
   }

   private NNNjN m4000(NNNjN var1) {
      if (var1 instanceof NNNjV var3) {
         return (NNNjN)var3.u().N();
      } else {
         return var1 instanceof NNNjj var2 ? var2.u() : var1;
      }
   }
}

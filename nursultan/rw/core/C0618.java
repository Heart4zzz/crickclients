package rw.core;

import KDFzREm.NNNbw;
import KDFzREm.NNrm;
import KDFzREm.NbI;
import KDFzREm.Nbw;
import KDFzREm.NjU;
import org.jspecify.annotations.Nullable;

public class C0618 implements NjU {
   @Nullable
   public NNNbw<Nbw> f1000;

   public void m2000(NNrm var1) {
      int var2 = var1.y(5);
      if (var2 <= 1) {
         this.f1000 = NbI.N;
      } else if (var2 <= 2) {
         this.f1000 = NbI.i;
      } else if (var2 <= 3) {
         this.f1000 = NbI.z;
      } else if (var2 <= 4) {
         this.f1000 = NbI.m;
      }
   }
}

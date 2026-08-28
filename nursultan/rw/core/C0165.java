package rw.core;

import KDFzREm.NCa;
import KDFzREm.NDe;
import KDFzREm.NKL;
import KDFzREm.NNPy;
import KDFzREm.NhW;

class C0165 implements NhW<NCa> {
   public int f1000;
   public int f2000;
   public int f3000;

   C0165(NDe var1) {
   }

   public void m4000(NCa var1, int var2) {
      NNPy var3 = var1.Y();
      if (!this.m6000(var1)) {
         this.f1000 += var2;
         if (var1.Q()) {
            this.f2000 += var2;
         }
      }

      if (!var3.W()) {
         this.f1000 += var2;
         if (var3.M()) {
            this.f3000 += var2;
         }
      }
   }

   private boolean m6000(NCa var1) {
      return var1.N(NKL.N) || var1.N(NKL.mr) || var1.N(NKL.mh);
   }
}

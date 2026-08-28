package rw.core;

import KDFzREm.NNNEm;
import KDFzREm.NNNjL;
import KDFzREm.NNNjN;
import KDFzREm.NNNjy;

class C0222 implements NNNjy {
   public NNNjL m2000(int var1) {
      this.f1000.W = (var1 + this.f1000.L) * this.f1000.z;
      this.f1000.T++;
      this.f1000.P = 0;
      this.f1000.j = var1;
      return this.f1000;
   }

   C0222(NNNEm var1) {
      this.f1000 = var1;
   }

   public void m4000(double[] var1, NNNjN var2) {
      for (int var3 = 0; var3 < this.f1000.y + 1; var3++) {
         this.f1000.W = (var3 + this.f1000.L) * this.f1000.z;
         this.f1000.T++;
         this.f1000.P = 0;
         this.f1000.j = var3;
         var1[var3] = var2.N(this.f1000);
      }
   }
}

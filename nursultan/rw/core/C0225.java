package rw.core;

import KDFzREm.NNNEd;
import KDFzREm.NNNjL;
import KDFzREm.NNNjN;
import KDFzREm.NNNje;
import KDFzREm.NNNjv;
import KDFzREm.NNNjy;
import KDFzREm.Ngq;

class C0225 implements NNNEd, NNNje {
   private final NNNjN f1000;
   private long f2000 = Ngq.L;
   private double f3000;

   C0225(NNNjN var1) {
      this.f1000 = var1;
   }

   public NNNjv m2000() {
      return NNNjv.field_36564;
   }

   public NNNjN m4000() {
      return this.f1000;
   }

   public double m6000(NNNjL var1) {
      int var2 = var1.y();
      int var3 = var1.u();
      long var4 = Ngq.u(var2, var3);
      if (this.f2000 == var4) {
         return this.f3000;
      } else {
         this.f2000 = var4;
         double var6 = this.f1000.N(var1);
         this.f3000 = var6;
         return var6;
      }
   }

   public void m8000(double[] var1, NNNjy var2) {
      this.f1000.N(var1, var2);
   }
}

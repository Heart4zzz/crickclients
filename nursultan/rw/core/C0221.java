package rw.core;

import KDFzREm.NNNEd;
import KDFzREm.NNNEm;
import KDFzREm.NNNjL;
import KDFzREm.NNNjN;
import KDFzREm.NNNje;
import KDFzREm.NNNjv;
import KDFzREm.NNNjy;
import org.jspecify.annotations.Nullable;

class C0221 implements NNNEd, NNNje {
   private final NNNjN f1000;
   private long f2000;
   private long f3000;
   private double f4000;
   @Nullable
   private double[] f5000;

   C0221(NNNEm var1, NNNjN var2) {
      this.f6000 = var1;
      this.f1000 = var2;
   }

   public NNNjv m2000() {
      return NNNjv.field_36565;
   }

   public NNNjN m4000() {
      return this.f1000;
   }

   public double m6000(NNNjL var1) {
      if (var1 != this.f6000) {
         return this.f1000.N(var1);
      } else if (this.f5000 != null && this.f3000 == this.f6000.b) {
         return this.f5000[this.f6000.j];
      } else if (this.f2000 == this.f6000.T) {
         return this.f4000;
      } else {
         this.f2000 = this.f6000.T;
         double var2 = this.f1000.N(var1);
         this.f4000 = var2;
         return var2;
      }
   }

   public void m8000(double[] var1, NNNjy var2) {
      if (this.f5000 != null && this.f3000 == this.f6000.b) {
         System.arraycopy(this.f5000, 0, var1, 0, var1.length);
      } else {
         this.m4000().N(var1, var2);
         if (this.f5000 != null && this.f5000.length == var1.length) {
            System.arraycopy(var1, 0, this.f5000, 0, var1.length);
         } else {
            this.f5000 = (double[])var1.clone();
         }

         this.f3000 = this.f6000.b;
      }
   }
}

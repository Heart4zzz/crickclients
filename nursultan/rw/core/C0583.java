package rw.core;

import KDFzREm.NAN;
import KDFzREm.NNMH;
import KDFzREm.NNUm;
import KDFzREm.NNwC;

class C0583 extends NNUm {
   C0583(NNwC var1, NNMH var2, int var3, int var4, int var5, int var6, NNUm var7, NAN var8) {
      super(var2, var3, var4, var5, var6, var7, var8);
      this.f1000 = var1;
   }

   public void method_25365(boolean var1) {
      if (!this.method_25370() && var1) {
         super.method_25365(true);
         this.f1000.u();
      } else {
         super.method_25365(var1);
      }
   }
}

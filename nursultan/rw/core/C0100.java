package rw.core;

import KDFzREm.IJ;
import KDFzREm.NHr;
import KDFzREm.NNNNiI;
import KDFzREm.NNNvi;
import KDFzREm.Ned;
import KDFzREm.NvF;

class C0100 extends NvF {
   private static final int f1000 = 1024;

   C0100(IJ var1) {
      this.f2000 = var1;
   }

   public NNNvi m2000(NNNNiI var1, int var2, int var3, int var4) {
      Ned var5 = this.f2000.U();
      if (var5 == null) {
         return super.N(var1, var2, var3, var4);
      } else {
         double var6 = var5.method_10262(new NHr(var2, var3, var4));
         return var6 > 1024.0 && var6 >= var5.method_10262(var1.y()) ? NNNvi.field_22 : super.N(var1, var2, var3, var4);
      }
   }
}

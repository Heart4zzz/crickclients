package rw.core;

import KDFzREm.NNNGF;
import KDFzREm.NNNZg;
import KDFzREm.NNNvM;
import KDFzREm.NNNvY;
import KDFzREm.NNWE;
import KDFzREm.NNrm;
import KDFzREm.NNtJ;
import KDFzREm.Ncv;

public class C0231 implements NNNvY<Ncv> {
   private final NNtJ f1000;

   public C0231(NNtJ var1) {
      this.f1000 = var1;
   }

   public NNNvM m2000(Ncv var1, NNNZg var2, double var3, double var5, double var7, double var9, double var11, double var13, NNrm var15) {
      NNNGF var16 = new NNNGF(this, var2, var3, var5, var7, 0.0, -0.8F, 0.0, this.f1000.method_18139(var15));
      var16.field_3847 = NNWE.y(var15, 500, 1000);
      var16.field_3844 = 0.01F;
      var16.method_74305(0.32F, 0.5F, 0.22F);
      return var16;
   }
}

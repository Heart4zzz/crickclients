package rw.core;

import KDFzREm.NNNZg;
import KDFzREm.NNNvM;
import KDFzREm.NNNvY;
import KDFzREm.NNrm;
import KDFzREm.NNtJ;
import KDFzREm.Ncv;
import KDFzREm.XE;

public class C0802 implements NNNvY<Ncv> {
   private final NNtJ f1000;

   public C0802(NNtJ var1) {
      this.f1000 = var1;
   }

   public NNNvM m2000(Ncv var1, NNNZg var2, double var3, double var5, double var7, double var9, double var11, double var13, NNrm var15) {
      XE var16 = new XE(var2, var3, var5, var7, 0.5 - var15.U(), var15.Z() ? var11 : -var11, 0.5 - var15.U(), this.f1000.method_18139(var15));
      var16.method_3077(var15.N(200, 300));
      var16.method_3087(1.5F);
      var16.method_74308(0.0F);
      return var16;
   }
}

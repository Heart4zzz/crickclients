package rw.core;

import KDFzREm.NNNZg;
import KDFzREm.NNPL;
import KDFzREm.NNPu;
import KDFzREm.NNUB;
import KDFzREm.NNUU;
import KDFzREm.NNUW;
import KDFzREm.NNWE;
import KDFzREm.Ncm;
import KDFzREm.Vx;

class C0452 extends C0443 {
   @Override
   protected void m2000() {
      if (this.field_3845) {
         this.method_3085();
         this.field_3851.method_8406(this.y, this.field_3874, this.field_3854, this.field_3871, 0.0, 0.0, 0.0);
         NNUB var1 = this.N() == NNPu.i ? NNUU.zR : NNUU.zM;
         float var2 = NNWE.y(this.field_3840, 0.3F, 1.0F);
         this.field_3851.method_8486(this.field_3874, this.field_3854, this.field_3871, var1, NNUW.field_15245, var2, 1.0F, false);
      }
   }

   C0452(NNNZg var1, double var2, double var4, double var6, NNPL var8, Ncm var9, Vx var10) {
      super(var1, var2, var4, var6, var8, var9, var10);
   }
}

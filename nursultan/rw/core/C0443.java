package rw.core;

import KDFzREm.NNNZg;
import KDFzREm.NNPL;
import KDFzREm.Ncm;
import KDFzREm.Vx;

class C0443 extends C0442 {
   protected final Ncm f1000;

   @Override
   protected void m2000() {
      if (this.field_3845) {
         this.method_3085();
         this.field_3851.method_8406(this.f1000, this.field_3874, this.field_3854, this.field_3871, 0.0, 0.0, 0.0);
      }
   }

   C0443(NNNZg var1, double var2, double var4, double var6, NNPL var8, Ncm var9, Vx var10) {
      super(var1, var2, var4, var6, var8, var10);
      this.field_3847 = (int)(64.0 / (this.field_3840.z() * 0.8 + 0.2));
      this.f1000 = var9;
   }
}

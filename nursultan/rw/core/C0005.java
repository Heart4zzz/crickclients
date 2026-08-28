package rw.core;

import KDFzREm.Az;
import KDFzREm.FS;
import KDFzREm.NNNwS;
import KDFzREm.NNUU;
import KDFzREm.NNUW;

public class C0005 extends FS {
   public static final int f1000 = 40;
   private final NNNwS f2000;
   private int f3000;

   public void m2000() {
      if (!this.f2000.method_31481() && this.f3000 >= 0) {
         if (this.f2000.method_5869()) {
            this.f3000++;
         } else {
            this.f3000 -= 2;
         }

         this.f3000 = Math.min(this.f3000, 40);
         this.u = Math.max(0.0F, Math.min(this.f3000 / 40.0F, 1.0F));
      } else {
         this.y();
      }
   }

   public C0005(NNNwS var1) {
      super(NNUU.w, NNUW.field_15256, Az.v());
      this.f2000 = var1;
      this.Z = true;
      this.z = 0;
      this.u = 1.0F;
      this.E = true;
   }
}

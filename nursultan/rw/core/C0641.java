package rw.core;

import KDFzREm.NNEt;
import KDFzREm.NNWE;
import KDFzREm.NNcO;
import KDFzREm.NjI;
import KDFzREm.Njg;
import KDFzREm.NnU;

class C0641 extends Njg {
   private final NnU f1000;

   C0641(NnU var1) {
      super(var1);
      this.f1000 = var1;
   }

   public void m2000() {
      if (this.f1000.method_5777(NNEt.N)) {
         this.f1000.method_18799(this.f1000.method_18798().y(0.0, 0.005, 0.0));
      }

      if (this.E == NjI.field_6378 && !this.f1000.f().U()) {
         float var1 = (float)(this.Z * this.f1000.method_45325(NNcO.l));
         this.f1000.method_6125(NNWE.B(0.125F, this.f1000.method_6029(), var1));
         double var2 = this.R - this.f1000.method_23317();
         double var4 = this.M - this.f1000.method_23318();
         double var6 = this.B - this.f1000.method_23321();
         if (var4 != 0.0) {
            double var8 = Math.sqrt(var2 * var2 + var4 * var4 + var6 * var6);
            this.f1000.method_18799(this.f1000.method_18798().y(0.0, this.f1000.method_6029() * (var4 / var8) * 0.1, 0.0));
         }

         if (var2 != 0.0 || var6 != 0.0) {
            float var15 = (float)(NNWE.u(var6, var2) * 180.0F / (float)Math.PI) - 90.0F;
            this.f1000.method_36456(this.y(this.f1000.method_36454(), var15, 90.0F));
            NnU var10000 = this.f1000;
            Float var14 = this.f1000.method_36454();
            var10000.fields_4212a028292fd3c078969e3ee4c71d9e8[0] = var14;
         }
      } else {
         this.f1000.method_6125(0.0F);
      }
   }
}

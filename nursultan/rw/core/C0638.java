package rw.core;

import KDFzREm.NNWE;
import KDFzREm.NNcO;
import KDFzREm.NjI;
import KDFzREm.NjL;
import KDFzREm.Njg;
import KDFzREm.NlZ;

class C0638 extends Njg {
   private final NlZ f1000;

   public C0638(NlZ var1) {
      super(var1);
      this.f1000 = var1;
   }

   public void m2000() {
      NjL var1 = this.f1000.T();
      if (this.f1000.v() && this.f1000.method_5799()) {
         if (var1 != null && var1.method_23318() > this.f1000.method_23318() || this.f1000.y) {
            this.f1000.method_18799(this.f1000.method_18798().y(0.0, 0.002, 0.0));
         }

         if (this.E != NjI.field_6378 || this.f1000.f().U()) {
            this.f1000.method_6125(0.0F);
            return;
         }

         double var2 = this.R - this.f1000.method_23317();
         double var4 = this.M - this.f1000.method_23318();
         double var6 = this.B - this.f1000.method_23321();
         double var8 = Math.sqrt(var2 * var2 + var4 * var4 + var6 * var6);
         var4 /= var8;
         float var10 = (float)(NNWE.u(var6, var2) * 180.0F / (float)Math.PI) - 90.0F;
         this.f1000.method_36456(this.y(this.f1000.method_36454(), var10, 90.0F));
         NlZ var10000 = this.f1000;
         Float var17 = this.f1000.method_36454();
         var10000.fields_4212a028292fd3c078969e3ee4c71d9e8[0] = var17;
         float var11 = (float)(this.Z * this.f1000.method_45325(NNcO.l));
         float var12 = NNWE.B(0.125F, this.f1000.method_6029(), var11);
         this.f1000.method_6125(var12);
         this.f1000.method_18799(this.f1000.method_18798().y(var12 * var2 * 0.005, var12 * var4 * 0.1, var12 * var6 * 0.005));
      } else {
         if (!this.f1000.method_24828()) {
            this.f1000.method_18799(this.f1000.method_18798().y(0.0, -0.008, 0.0));
         }

         super.N();
      }
   }
}

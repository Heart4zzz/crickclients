package rw.core;

import KDFzREm.NNWE;
import KDFzREm.NNcO;
import KDFzREm.NXi;
import KDFzREm.NjI;
import KDFzREm.NjQ;
import KDFzREm.Njg;
import KDFzREm.Nlh;

class C0619 extends Njg {
   private final Nlh f1000;

   public C0619(Nlh var1) {
      super(var1);
      this.f1000 = var1;
   }

   public void m2000() {
      if (this.E == NjI.field_6378 && !this.f1000.f().U()) {
         NXi var1 = new NXi(this.R - this.f1000.method_23317(), this.M - this.f1000.method_23318(), this.B - this.f1000.method_23321());
         double var2 = var1.M();
         double var4 = var1.M / var2;
         double var6 = var1.B / var2;
         double var8 = var1.Z / var2;
         float var10 = (float)(NNWE.u(var1.Z, var1.M) * 180.0F / (float)Math.PI) - 90.0F;
         this.f1000.method_36456(this.y(this.f1000.method_36454(), var10, 90.0F));
         Nlh var10000 = this.f1000;
         Float var38 = this.f1000.method_36454();
         var10000.fields_4212a028292fd3c078969e3ee4c71d9e8[0] = var38;
         float var11 = (float)(this.Z * this.f1000.method_45325(NNcO.l));
         float var12 = NNWE.B(0.125F, this.f1000.method_6029(), var11);
         this.f1000.method_6125(var12);
         double var13 = Math.sin((this.f1000.field_6012 + this.f1000.method_5628()) * 0.5) * 0.05;
         double var15 = Math.cos(this.f1000.method_36454() * (float) (Math.PI / 180.0));
         double var17 = Math.sin(this.f1000.method_36454() * (float) (Math.PI / 180.0));
         double var19 = Math.sin((this.f1000.field_6012 + this.f1000.method_5628()) * 0.75) * 0.05;
         this.f1000.method_18799(this.f1000.method_18798().y(var13 * var15, var19 * (var17 + var15) * 0.25 + var12 * var6 * 0.1, var13 * var17));
         NjQ var21 = this.f1000.p();
         double var22 = this.f1000.method_23317() + var4 * 2.0;
         double var24 = this.f1000.method_23320() + var6 / var2;
         double var26 = this.f1000.method_23321() + var8 * 2.0;
         double var28 = var21.i();
         double var30 = var21.R();
         double var32 = var21.M();
         if (!var21.u()) {
            var28 = var22;
            var30 = var24;
            var32 = var26;
         }

         this.f1000.p().N(NNWE.u(0.125, var28, var22), NNWE.u(0.125, var30, var24), NNWE.u(0.125, var32, var26), 10.0F, 40.0F);
         this.f1000.N(true);
      } else {
         this.f1000.method_6125(0.0F);
         this.f1000.N(false);
      }
   }
}

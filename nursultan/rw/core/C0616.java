package rw.core;

import KDFzREm.NNWE;
import KDFzREm.NXi;
import KDFzREm.Nbr;
import KDFzREm.NdU;
import KDFzREm.Njg;

class C0616 extends Njg {
   private float f1000;

   public C0616(NdU var1, Nbr var2) {
      super(var2);
      this.f2000 = var1;
      this.f1000 = 0.1F;
   }

   public void m2000() {
      if (this.f2000.field_5976) {
         this.f2000.method_36456(this.f2000.method_36454() + 180.0F);
         this.f1000 = 0.1F;
      }

      double var1 = this.f2000.L.M - this.f2000.method_23317();
      double var3 = this.f2000.L.B - this.f2000.method_23318();
      double var5 = this.f2000.L.Z - this.f2000.method_23321();
      double var7 = Math.sqrt(var1 * var1 + var5 * var5);
      if (Math.abs(var7) > 1.0E-5F) {
         double var9 = 1.0 - Math.abs(var3 * 0.7F) / var7;
         var1 *= var9;
         var5 *= var9;
         var7 = Math.sqrt(var1 * var1 + var5 * var5);
         double var11 = Math.sqrt(var1 * var1 + var5 * var5 + var3 * var3);
         float var13 = this.f2000.method_36454();
         float var14 = (float)NNWE.u(var5, var1);
         float var15 = NNWE.R(this.f2000.method_36454() + 90.0F);
         float var16 = NNWE.R(var14 * (180.0F / (float)Math.PI));
         this.f2000.method_36456(NNWE.i(var15, var16, 4.0F) - 90.0F);
         NdU var10000 = this.f2000;
         Float var30 = this.f2000.method_36454();
         var10000.fields_4212a028292fd3c078969e3ee4c71d9e8[0] = var30;
         if (NNWE.i(var13, this.f2000.method_36454()) < 3.0F) {
            this.f1000 = NNWE.u(this.f1000, 1.8F, 0.005F * (1.8F / this.f1000));
         } else {
            this.f1000 = NNWE.u(this.f1000, 0.2F, 0.025F);
         }

         float var17 = (float)(-(NNWE.u(-var3, var7) * 180.0F / (float)Math.PI));
         this.f2000.method_36457(var17);
         float var18 = this.f2000.method_36454() + 90.0F;
         double var19 = this.f1000 * NNWE.P(var18 * (float) (Math.PI / 180.0)) * Math.abs(var1 / var11);
         double var21 = this.f1000 * NNWE.m(var18 * (float) (Math.PI / 180.0)) * Math.abs(var5 / var11);
         double var23 = this.f1000 * NNWE.m(var17 * (float) (Math.PI / 180.0)) * Math.abs(var3 / var11);
         NXi var25 = this.f2000.method_18798();
         this.f2000.method_18799(var25.i(new NXi(var19, var23, var21).u(var25).L(0.2)));
      }
   }
}

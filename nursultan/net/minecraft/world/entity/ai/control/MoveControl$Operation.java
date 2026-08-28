package net.minecraft.world.entity.ai.control;

import KDFzREm.NNWE;
import KDFzREm.NXi;
import KDFzREm.NjI;
import KDFzREm.Njg;
import KDFzREm.Nwu;

class MoveControl$Operation extends Njg {
   public MoveControl$Operation(Nwu var1, Nwu var2) {
      super(var2);
      this.N = var1;
   }

   {
      if (this.E == NjI.field_6378) {
         NXi var1 = new NXi(this.R - this.N.method_23317(), this.M - this.N.method_23318(), this.B - this.N.method_23321());
         double var2 = var1.M();
         if (var2 < this.N.method_5829().N()) {
            this.E = NjI.field_6377;
            this.N.method_18799(this.N.method_18798().L(0.5));
         } else {
            this.N.method_18799(this.N.method_18798().i(var1.L(this.Z * 0.05 / var2)));
            if (this.N.T() == null) {
               NXi var4 = this.N.method_18798();
               this.N.method_36456(-((float)NNWE.u(var4.M, var4.Z)) * (180.0F / (float)Math.PI));
               Nwu var10000 = this.N;
               Float var12 = this.N.method_36454();
               var10000.fields_4212a028292fd3c078969e3ee4c71d9e8[0] = var12;
            } else {
               double var14 = this.N.T().method_23317() - this.N.method_23317();
               double var6 = this.N.T().method_23321() - this.N.method_23321();
               this.N.method_36456(-((float)NNWE.u(var14, var6)) * (180.0F / (float)Math.PI));
               Nwu var15 = this.N;
               Float var13 = this.N.method_36454();
               var15.fields_4212a028292fd3c078969e3ee4c71d9e8[0] = var13;
            }
         }
      }
   }
}

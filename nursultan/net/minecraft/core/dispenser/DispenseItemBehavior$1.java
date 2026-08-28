package net.minecraft.core.dispenser;

import KDFzREm.NNDz;
import KDFzREm.NNse;
import KDFzREm.NOz;
import KDFzREm.NQo;
import KDFzREm.NVA;
import KDFzREm.Nbp;
import KDFzREm.Nea;
import KDFzREm.Nee;
import KDFzREm.Nef;

class DispenseItemBehavior$1 extends Nea {
   public NQo N(Nee var1, NQo var2) {
      Nef var3 = (Nef)var1.u().L(NVA.y);
      Nbp var4 = ((NOz)var2.B()).u(var2);
      if (var4 == null) {
         return var2;
      } else {
         try {
            var4.N(var1.y(), var2, null, var1.L().method_10093(var3), NNse.field_16470, var3 != Nef.field_11036, false);
         } catch (Exception var6) {
            y.error("Error while dispensing spawn egg from dispenser at {}", var1.L(), var6);
            return NQo.E;
         }

         var2.B(1);
         var1.y().N(null, NNDz.v, var1.L());
         return var2;
      }
   }
}

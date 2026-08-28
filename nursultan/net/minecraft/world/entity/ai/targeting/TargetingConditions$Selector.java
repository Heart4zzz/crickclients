package net.minecraft.world.entity.ai.targeting;

import KDFzREm.NNGk;
import KDFzREm.NNRq;
import KDFzREm.NNtf;
import KDFzREm.NdM;
import KDFzREm.NjL;
import KDFzREm.Njb;
import KDFzREm.NnT;
import KDFzREm.NtZ;
import KDFzREm.Nwn;

public class TargetingConditions$Selector implements NNGk {
   public TargetingConditions$Selector(NNtf var1) {
      this.N = var1;
   }

   public boolean method_18303(NjL var1, NNRq var2) {
      if (var1 instanceof NNtf) {
         return false;
      } else if (var1 instanceof NnT || var1 instanceof NtZ || var1 instanceof NdM) {
         return true;
      } else if (var1 instanceof Njb) {
         return !((Njb)var1).NQ();
      } else if (var1 instanceof Nwn var3 && (var3.method_7325() || var3.method_68878())) {
         return false;
      } else {
         return this.N.u(var1) ? false : !var1.method_6113() && !var1.method_21751();
      }
   }
}

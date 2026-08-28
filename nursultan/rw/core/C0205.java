package rw.core;

import KDFzREm.NAN;
import KDFzREm.NNHd;
import KDFzREm.NNMH;
import KDFzREm.NNUm;
import KDFzREm.NRq;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

class C0205 extends NNUm {
   C0205(NNHd var1, NNMH var2, int var3, int var4, int var5, int var6, NAN var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.f1000 = var1;
   }

   private void m2000(NRq var1, CallbackInfoReturnable var2) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
         var2.setReturnValue(super.method_25400(var1));
      }
   }

   public boolean method_25400(NRq var1) {
      CallbackInfoReturnable var2 = new CallbackInfoReturnable("", true);
      this.m2000(var1, var2);
      if (var2.isCancelled()) {
         return var2.getReturnValueZ();
      } else {
         return !NNHd.N(this.f1000, this.method_1882(), var1.L(), this.method_1881()) ? false : super.method_25400(var1);
      }
   }
}

package rw.core;

import KDFzREm.NNEl;
import KDFzREm.NNNG;
import KDFzREm.NQo;
import KDFzREm.NTS;
import KDFzREm.NYj;
import KDFzREm.NkO;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

class C0632 extends NYj {
   public NNNG m2000() {
      return NkO.N;
   }

   public C0632(NTS var1, int var2, int var3, int var4) {
      super(var1, var2, var3, var4);
   }

   public static boolean m4000(NQo var0) {
      CallbackInfoReturnable var1 = new CallbackInfoReturnable("", true);
      m8000(var1);
      return var1.isCancelled() ? var1.getReturnValueZ() : var0.N(NNEl.Nd);
   }

   public boolean m6000() {
      return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_8);
   }

   private static void m8000(CallbackInfoReturnable var0) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
         var0.setReturnValue(false);
      }
   }

   public boolean m10000(NQo var1) {
      return m4000(var1);
   }
}

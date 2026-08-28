package rw.gui;

import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NSe;
import rw.GuiWidget;
import rw.NursultanClient;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.C0892;
import rw.defs.Enum0055;

@AnnotationDefault(
   L = "NoSlotChange",
   y = Enum0055.COMBAT,
   N = Enum0070.OTHER
)
public class NoSlotChange extends GuiWidget {
   static {
      ntfClinit();
   }

   @Iface0642
   private void m4000(rw.module.AutoAccept var1) {
      if (var1.m6000() instanceof NSe var2) {
         NSe var10000 = var2;

         try {
            var7 = var10000.N();
         } catch (Throwable var6) {
            throw new MatchException(var6.toString(), var6);
         }

         int var5 = var7;
         var1.N();
         NursultanClient.m36000().m36000(() -> {
            int var2x = ((NNNwS)((NNuU)this.y[0]).T[4]).method_31548().N();
            C0892.m18000(var5);
            C0892.m18000(var2x);
         });
      }
   }
}

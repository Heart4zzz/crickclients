package rw.gui;

import KDFzREm.NNNNi;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.data.Rec0179;
import rw.defs.Enum0055;

@AnnotationDefault(
   L = "AutoRespawn",
   y = Enum0055.PLAYER,
   N = Enum0070.AUTO
)
public class AutoRespawn extends GuiWidget {
   static {
      ntfClinit();
   }

   @Iface0642
   private void m2000(Rec0179 var1) {
      if (var1.m4000() instanceof NNNNi var2) {
         ((NNuU)this.y[0]).execute(() -> {
            if ((NNNwS)((NNuU)this.y[0]).T[4] != null && var2.N() == ((NNNwS)((NNuU)this.y[0]).T[4]).method_5628()) {
               ((NNNwS)((NNuU)this.y[0]).T[4]).K();
            }
         });
      }
   }
}

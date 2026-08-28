package rw.gui;

import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.OljOitkn;
import rw.data.Rec0288;
import rw.defs.Enum0055;
import rw.module.AttackAura_x_x;

@AnnotationDefault(
   L = "EdgeJump",
   y = Enum0055.MOVEMENT,
   N = Enum0070.TOOLS
)
public class EdgeJump extends GuiWidget {
   static {
      ntfClinit();
   }

   @Iface0642
   public void m2000(AttackAura_x_x var1) {
      if (((NNNwS)((NNuU)this.y[0]).T[4]).method_24828() && !var1.m6000()) {
         Rec0288 var2 = OljOitkn.m32000(var1.m28000(), 1);
         if (!var2.m8000()) {
            var1.m22000((boolean)1);
         }
      }
   }
}

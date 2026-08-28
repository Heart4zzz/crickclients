package rw.core;

import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.gB;
import rw.gui.Scaffold;
import rw.module.AttackAura_x_x;

public class C0733 extends Base1148<Scaffold> {
   public C0733(Scaffold var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   static {
      ntfClinit();
   }

   public void m12000(Object var1) {
      if (var1 instanceof AttackAura_x_x var2) {
         if (((NNNwS)((NNuU)this.N[0]).T[4]).method_24828() && this.m16000()) {
            var2.m36000((boolean)1);
         }
      }
   }

   private boolean m16000() {
      gB[] var1 = new gB[]{new gB(true, false, false, false, false, false, false), new gB(false, true, false, false, false, false, false)};

      for (gB var5 : var1) {
         if (!OljOitkn.m32000(var5, 3).m12000().m6000().method_24828()) {
            return (boolean)1;
         }
      }

      return (boolean)0;
   }
}

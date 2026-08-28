package rw.gui;

import KDFzREm.NCc;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NbK;
import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.C0991;
import rw.core.C1140;
import rw.defs.Enum0055;
import rw.setting.C0122;

@AnnotationDefault(
   L = "NoFriendDamage",
   y = Enum0055.COMBAT,
   N = Enum0070.OTHER
)
public class NoFriendDamage extends GuiWidget {
   private static String[] f1000;
   public Object[] f2000;

   private void m4000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[1];
         Object[] var1 = this.f2000;
      }
   }

   public NoFriendDamage() {
      this.m4000();
      C0991 var5 = C0122.m26000(this, f1000[0], false);
      this.f2000[0] = var5;
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f1000 = new String[]{"teams"};
   }

   @Iface0642
   public void m2000(rw.module.NoEntityTrace var1) {
      if (C1140.m32000().test(var1.m4000())) {
         var1.N();
      }
   }

   public boolean m4000(NbK var1) {
      this.m4000();
      if (this.U() && (Boolean)((C0991)this.f2000[0]).i() && (NNNwS)((NNuU)this.y[0]).T[4] != null && var1 != (NNNwS)((NNuU)this.y[0]).T[4]) {
         NCc var2 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_5781();
         return (boolean)(var2 != null && var2.N(var1.method_5781()) ? 1 : 0);
      } else {
         return (boolean)0;
      }
   }
}

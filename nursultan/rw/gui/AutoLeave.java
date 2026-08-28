package rw.gui;

import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import java.util.List;
import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0636;
import rw.api.Iface0642;
import rw.api.Iface0648;
import rw.api.Iface0654;
import rw.core.Base1148;
import rw.core.C0700;
import rw.core.C1000;
import rw.core.C1003;
import rw.core.C1013;
import rw.core.C1085;
import rw.core.C1102;
import rw.core.C1104;
import rw.defs.Enum0055;
import rw.setting.C0122;
import rw.setting.C0141;
import rw.setting.C0148;

@AnnotationDefault(
   L = "AutoLeave",
   y = Enum0055.PLAYER,
   N = Enum0070.AUTO
)
public class AutoLeave extends GuiWidget {
   private static String[] f1000;
   private static String[] f2000;
   public Object[] f3000;

   public AutoLeave() {
      this.m10000();
      C1000 var8 = C0122.m18000(
         this,
         f1000[0],
         new C1104(this, f1000[1], f1000[2], true),
         new C1104(this, f1000[3], f1000[4], false),
         new rw.setting.C0147(this, f1000[5], false),
         new C1085(f1000[6], false)
      );
      this.f3000[0] = var8;

      for (C1013 var2 : ((C1000)this.f3000[0]).m2000()) {
         if (var2 instanceof Iface0648 var3) {
            var3.m2000(this);
         }
      }

      C1003 var9 = C0122.m4000(this, f2000[0], new C0148(this, f2000[1], true), new C0141(this, f2000[2], false), new C1102(this, f2000[3], false));
      this.f3000[1] = var9;

      for (Base1148 var11 : ((C1003)this.f3000[1]).m2000()) {
         if (var11 instanceof Iface0648 var12) {
            var12.m2000(this);
         }
      }
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f1000 = new String[]{"action", "hub", "hub", "spawn", "spawn", "custom-command", "disconnect"};
      f2000 = new String[]{"triggers", "player-nearby", "health", "was-in-pvp"};
   }

   public void m8000() {
      this.m10000();
      if (!((Iface0654)((NNNwS)((NNuU)this.y[0]).T[4])).dataManager().m14000().m10000().m20000()) {
         ((Iface0636)((C1013)((C1000)this.f3000[0]).i())).m2000();
         this.N((boolean)0);
      }
   }

   private void m10000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[2];
         Object[] var1 = this.f3000;
      }
   }

   @Iface0642
   public void m14000(C0700 var1) {
      this.m10000();

      for (Base1148 var3 : (List)((C1003)this.f3000[1]).i()) {
         var3.y(var1);
      }
   }
}

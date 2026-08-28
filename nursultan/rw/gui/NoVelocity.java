package rw.gui;

import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.api.Iface0648;
import rw.core.Base1138;
import rw.core.C0790;
import rw.core.C0918;
import rw.core.C1000;
import rw.core.C1013;
import rw.defs.Enum0055;
import rw.defs.Enum0081;
import rw.module.AttackAura_x_x;
import rw.setting.C0086;
import rw.setting.C0122;

@AnnotationDefault(
   L = "NoVelocity",
   y = Enum0055.COMBAT,
   N = Enum0070.FIGHTING
)
public class NoVelocity extends GuiWidget {
   private static String[] f1000;
   public Object[] f2000;

   private void m4000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[3];
         Object[] var1 = this.f2000;
      }
   }

   public NoVelocity() {
      this.m4000();
      C0086 var8 = new C0086(f1000[0], true);
      this.f2000[0] = var8;
      C0790 var9 = new C0790(f1000[1], false);
      this.f2000[1] = var9;
      C1000 var10 = C0122.m18000(this, f1000[2], (C0086)this.f2000[0], (C0790)this.f2000[1]);
      this.f2000[2] = var10;

      for (C1013 var2 : ((C1000)this.f2000[2]).m2000()) {
         if (var2 instanceof Iface0648 var3) {
            var3.m2000(this);
         }
      }
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f1000 = new String[]{"jump-reset", "vanilla", "mode"};
   }

   @Iface0642(
      y = Enum0081.AFTER,
      L = {SprintReset.class}
   )
   public void m2000(AttackAura_x_x var1) {
      this.m4000();
      ((Base1138)((C1000)this.f2000[2]).i()).y(var1);
   }

   @Iface0642
   public void m4000(C0918 var1) {
      this.m4000();
      ((Base1138)((C1000)this.f2000[2]).i()).y(var1);
   }

   @Iface0642
   public void m6000(rw.module.AutoAccept var1) {
      this.m4000();
      ((Base1138)((C1000)this.f2000[2]).i()).y(var1);
   }
}

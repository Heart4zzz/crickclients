package rw.gui;

import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.Base1148;
import rw.core.C0673;
import rw.core.C0700;
import rw.core.C0721;
import rw.core.C0924;
import rw.core.C1000;
import rw.defs.Enum0055;
import rw.module.AttackAura_x_x;
import rw.setting.C0122;

@AnnotationDefault(
   L = "Speed",
   y = Enum0055.MOVEMENT,
   N = Enum0070.BASE
)
public class Speed extends GuiWidget {
   private static String[] f1000;
   public Object[] f2000;

   private void m4000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[2];
         Object[] var1 = this.f2000;
      }
   }

   public Speed() {
      this.m4000();
      C0673 var5 = new C0673(this, f1000[0], true);
      this.f2000[0] = var5;
      C1000 var6 = C0122.m18000(this, f1000[1], (Base1148)this.f2000[0]);
      this.f2000[1] = var6;
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f1000 = new String[]{"collision", "mode"};
   }

   @Iface0642
   public void m2000(rw.module.AutoAccept var1) {
      this.m4000();
      ((Base1148)((C1000)this.f2000[1]).i()).y(var1);
   }

   @Iface0642
   public void m4000(C0721 var1) {
      this.m4000();
      ((Base1148)((C1000)this.f2000[1]).i()).y(var1);
   }

   @Iface0642
   public void m6000(AttackAura_x_x var1) {
      this.m4000();
      ((Base1148)((C1000)this.f2000[1]).i()).y(var1);
   }

   @Iface0642
   public void m8000(C0700 var1) {
      this.m4000();
      ((Base1148)((C1000)this.f2000[1]).i()).y(var1);
   }

   @Iface0642
   public void m10000(rw.core.C0147 var1) {
      this.m4000();
      ((Base1148)((C1000)this.f2000[1]).i()).y(var1);
   }

   @Iface0642
   public void m12000(C0924 var1) {
      this.m4000();
      ((Base1148)((C1000)this.f2000[1]).i()).y(var1);
   }
}

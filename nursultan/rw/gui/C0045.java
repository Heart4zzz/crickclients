package rw.gui;

import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.api.Iface0648;
import rw.core.Base1148;
import rw.core.C0686;
import rw.core.C0721;
import rw.core.C1000;
import rw.core.C1013;
import rw.defs.Enum0055;
import rw.module.AttackAura_x_x;
import rw.setting.C0076;
import rw.setting.C0122;

@AnnotationDefault(
   L = "Flight",
   y = Enum0055.MOVEMENT,
   N = Enum0070.BASE
)
public class C0045 extends GuiWidget {
   private static String[] f1000;
   public Object[] f2000;

   private static void m4000() {
      f1000 = new String[]{"multi-jump", "vanilla", "motion", "mode"};
   }

   public C0045() {
      this.m8000();
      C0686 var8 = new C0686(this, f1000[0], true);
      this.f2000[0] = var8;
      rw.setting.Speed var9 = new rw.setting.Speed(this, f1000[1], false);
      this.f2000[1] = var9;
      C0076 var10 = new C0076(this, f1000[2], false);
      this.f2000[2] = var10;
      C1000 var11 = C0122.m18000(this, f1000[3], (Base1148)this.f2000[0], (Base1148)this.f2000[1], (Base1148)this.f2000[2]);
      this.f2000[3] = var11;

      for (C1013 var2 : ((C1000)this.f2000[3]).m2000()) {
         if (var2 instanceof Iface0648 var3) {
            var3.m2000(this);
         }
      }
   }

   static {
      ntfClinit();
   }

   private void m8000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[4];
         Object[] var1 = this.f2000;
      }
   }

   @Iface0642
   public void m2000(AttackAura_x_x var1) {
      this.m8000();
      ((Base1148)((C1000)this.f2000[3]).i()).y(var1);
   }

   @Iface0642
   public void m4000(rw.module.AutoAccept var1) {
      this.m8000();
      ((Base1148)((C1000)this.f2000[3]).i()).y(var1);
   }

   @Iface0642
   public void m6000(rw.module.Speed var1) {
      this.m8000();
      ((Base1148)((C1000)this.f2000[3]).i()).y(var1);
   }

   @Iface0642
   public void m8000(C0721 var1) {
      this.m8000();
      ((Base1148)((C1000)this.f2000[3]).i()).y(var1);
   }
}

package rw.gui;

import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.Base1148;
import rw.core.C0719;
import rw.core.C1000;
import rw.core.DhSt;
import rw.defs.Enum0055;
import rw.setting.C0122;

@AnnotationDefault(
   L = "WallClimb",
   y = Enum0055.MOVEMENT,
   N = Enum0070.BASE
)
public class WallClimb extends GuiWidget {
   private static String[] f1000;
   public Object[] f2000;

   private static void m4000() {
      f1000 = new String[]{"mode", "block"};
   }

   public WallClimb() {
      this.m6000();
      C1000 var5 = C0122.m18000(this, f1000[0], new DhSt(this, f1000[1], true));
      this.f2000[0] = var5;
   }

   static {
      ntfClinit();
   }

   private void m6000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[1];
         Object[] var1 = this.f2000;
      }
   }

   @Override
   public void m10000() {
      this.m6000();
      ((Base1148)((C1000)this.f2000[0]).i()).y(this);
      super.m6000();
   }

   @Iface0642
   public void m2000(C0719 var1) {
      this.m6000();
      ((Base1148)((C1000)this.f2000[0]).i()).y(var1);
   }
}

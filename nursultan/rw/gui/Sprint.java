package rw.gui;

import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.C0991;
import rw.core.OlrOjknp;
import rw.defs.Enum0055;
import rw.defs.Enum0081;
import rw.module.AttackAura_x_x;
import rw.setting.C0122;

@AnnotationDefault(
   L = "Sprint",
   y = Enum0055.MOVEMENT,
   N = Enum0070.BASE
)
public class Sprint extends GuiWidget {
   public Object[] f1000;
   private static String[] f2000;

   public Sprint() {
      this.m6000();
      C0991 var5 = C0122.m26000(this, f2000[0], false);
      this.f1000[0] = var5;
   }

   static {
      ntfClinit();
   }

   private static void m4000() {
      f2000 = new String[]{"ignore-hunger"};
   }

   private void m6000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }

   @Iface0642
   public void m2000(OlrOjknp var1) {
      this.m6000();
      var1.m16000((Boolean)((C0991)this.f1000[0]).i());
   }

   @Iface0642(
      y = Enum0081.AFTER
   )
   public void m4000(AttackAura_x_x var1) {
      var1.m10000(var1.m20000());
   }
}

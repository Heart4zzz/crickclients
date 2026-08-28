package rw.gui;

import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.Base1148;
import rw.core.C0676;
import rw.core.C0678;
import rw.core.C1000;
import rw.defs.Enum0055;
import rw.module.Module010;
import rw.setting.C0122;

@AnnotationDefault(
   L = "NoWeb",
   y = Enum0055.MOVEMENT,
   N = Enum0070.TOOLS
)
public class Noweb extends GuiWidget {
   public Object[] f1000;
   private static String[] f2000;

   private void m4000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[3];
         Object[] var1 = this.f1000;
      }
   }

   public Noweb() {
      this.m4000();
      C0678 var5 = new C0678(this, f2000[0], true);
      this.f1000[0] = var5;
      C0676 var6 = new C0676(this, f2000[1], false);
      this.f1000[1] = var6;
      C1000 var7 = C0122.m18000(this, f2000[2], (C0678)this.f1000[0], (C0676)this.f1000[1]);
      this.f1000[2] = var7;
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f2000 = new String[]{"default", "really-world", "mode"};
   }

   @Iface0642
   public void m2000(Module010 var1) {
      this.m4000();
      ((Base1148)((C1000)this.f1000[2]).i()).y(var1);
   }
}

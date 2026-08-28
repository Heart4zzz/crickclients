package rw.gui;

import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.C0675;
import rw.core.C0687;
import rw.core.C1003;
import rw.defs.Enum0055;
import rw.module.IlOnsini;
import rw.module.Module002;
import rw.setting.C0122;

@AnnotationDefault(
   L = "NoPush",
   y = Enum0055.MOVEMENT,
   N = Enum0070.TOOLS
)
public class NoPush extends GuiWidget {
   public Object[] f1000;
   private static String[] f2000;

   private static void m4000() {
      f2000 = new String[]{"entity-push", "block-push", "fishing-rod", "apply-to"};
   }

   public NoPush() {
      this.m8000();
      C0687 var5 = new C0687(f2000[0], true);
      this.f1000[0] = var5;
      C0687 var6 = new C0687(f2000[1], true);
      this.f1000[1] = var6;
      C0675 var7 = new C0675(f2000[2], true);
      this.f1000[2] = var7;
      C1003 var8 = C0122.m4000(this, f2000[3], (C0687)this.f1000[0], (C0687)this.f1000[1], (C0675)this.f1000[2]);
      this.f1000[3] = var8;
   }

   static {
      ntfClinit();
   }

   private void m8000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[4];
         Object[] var1 = this.f1000;
      }
   }

   @Iface0642
   public void m2000(Module002 var1) {
      this.m8000();
      ((C0687)this.f1000[1]).m2000(var1);
   }

   @Iface0642
   public void m4000(IlOnsini var1) {
      this.m8000();
      ((C0687)this.f1000[0]).m2000(var1);
   }

   @Iface0642
   public void m6000(rw.module.AutoAccept var1) {
      this.m8000();
      ((C0675)this.f1000[2]).m2000(var1);
   }
}

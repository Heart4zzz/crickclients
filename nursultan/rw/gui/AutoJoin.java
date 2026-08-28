package rw.gui;

import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.api.Iface0648;
import rw.core.Base0786;
import rw.core.C0721;
import rw.core.C0780;
import rw.core.C1000;
import rw.defs.Enum0055;
import rw.setting.C0088;
import rw.setting.C0122;

@AnnotationDefault(
   L = "AutoJoin",
   y = Enum0055.PLAYER,
   N = Enum0070.AUTO
)
public class AutoJoin extends GuiWidget {
   private static String[] f1000;
   public Object[] f2000;

   public AutoJoin() {
      this.m6000();
      C1000 var5 = C0122.m18000(this, f1000[0], new C0780(this, f1000[1], true), new C0088(this, f1000[2], false));
      this.f2000[0] = var5;
      ((C1000)this.f2000[0]).m2000().forEach(var1 -> {
         if (var1 instanceof Iface0648 var2) {
            var2.m2000(this);
         }
      });
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

   private static void m8000() {
      f1000 = new String[]{"mode", "spooky-time-duels", "really-world"};
   }

   public void m14000() {
      this.m6000();
      ((C1000)this.f2000[0]).m2000().forEach(Base0786::m4000);
   }

   @Iface0642
   public void m4000(rw.module.AutoAccept var1) {
      this.m6000();
      ((Base0786)((C1000)this.f2000[0]).i()).y(var1);
   }

   @Iface0642
   public void m6000(C0721 var1) {
      this.m6000();
      ((Base0786)((C1000)this.f2000[0]).i()).y(var1);
   }
}

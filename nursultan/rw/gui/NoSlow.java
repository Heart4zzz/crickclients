package rw.gui;

import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.Base0682;
import rw.core.C0684;
import rw.core.C0688;
import rw.core.C0721;
import rw.core.C0904;
import rw.core.C1000;
import rw.defs.Enum0055;
import rw.module.IltOkpln;
import rw.setting.C0122;

@AnnotationDefault(
   L = "NoSlow",
   y = Enum0055.MOVEMENT,
   N = Enum0070.BASE
)
public class NoSlow extends GuiWidget {
   public Object[] f1000;
   private static String[] f2000;

   public NoSlow() {
      this.m8000();
      C0684 var5 = new C0684(this, f2000[0], true);
      this.f1000[0] = var5;
      C0688 var6 = new C0688(this, f2000[1], false);
      this.f1000[1] = var6;
      C1000 var7 = C0122.m18000(this, f2000[2], (C0684)this.f1000[0], (C0688)this.f1000[1]);
      this.f1000[2] = var7;
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f2000 = new String[]{"vanilla", "spooky-time-duels", "mode"};
   }

   private void m8000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[3];
         Object[] var1 = this.f1000;
      }
   }

   @Iface0642
   public void m2000(C0904 var1) {
      this.m8000();
      ((Base0682)((C1000)this.f1000[2]).i()).y(var1);
   }

   @Iface0642
   public void m4000(IltOkpln var1) {
      this.m8000();
      ((Base0682)((C1000)this.f1000[2]).i()).y(var1);
   }

   @Iface0642
   public void m6000(C0721 var1) {
      this.m8000();
      ((Base0682)((C1000)this.f1000[2]).i()).y(var1);
   }
}

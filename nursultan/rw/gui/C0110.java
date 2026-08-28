package rw.gui;

import java.util.List;
import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.Base1148;
import rw.core.C0721;
import rw.core.C0925;
import rw.core.C1003;
import rw.data.Rec0215;
import rw.defs.Enum0055;
import rw.defs.Enum0088;
import rw.setting.C0117;
import rw.setting.C0122;
import rw.setting.OlmnOtit;

@AnnotationDefault(
   L = "Notifications",
   y = Enum0055.VISUAL,
   N = Enum0070.INTERFACE
)
public class C0110 extends GuiWidget {
   public Object[] f1000;
   private static String[] f2000;

   public C0110() {
      this.m8000();
      C0117 var5 = new C0117(this, f2000[0], true);
      this.f1000[0] = var5;
      OlmnOtit var6 = new OlmnOtit(this, f2000[1], false);
      this.f1000[1] = var6;
      rw.setting.C0114 var7 = new rw.setting.C0114(this, f2000[2], false);
      this.f1000[2] = var7;
      C1003 var8 = C0122.m4000(this, f2000[3], (Base1148)this.f1000[0], (Base1148)this.f1000[1], (Base1148)this.f1000[2]);
      this.f1000[3] = var8;
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f2000 = new String[]{"module-toggle", "armor-durability", "irc-ping", "notifications"};
   }

   private void m8000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[4];
         Object[] var1 = this.f1000;
      }
   }

   @Iface0642
   public void m6000(C0721 var1) {
      this.m8000();
      ((List)((C1003)this.f1000[3]).i()).forEach(var1x -> var1x.y(var1));
   }

   @Iface0642
   public void m8000(Rec0215 var1) {
      this.m8000();
      if (var1.m4000() == (Enum0088)Enum0088.f3000[2]) {
         ((List)((C1003)this.f1000[3]).i()).forEach(var1x -> var1x.y(var1));
      }
   }

   @Iface0642
   public void m10000(rw.module.AutoAccept var1) {
      this.m8000();
      ((List)((C1003)this.f1000[3]).i()).forEach(var1x -> var1x.y(var1));
   }

   @Iface0642
   public void m14000(C0925 var1) {
      this.m8000();
      ((List)((C1003)this.f1000[3]).i()).forEach(var1x -> ((Base1148)var1x).y(var1));
   }
}

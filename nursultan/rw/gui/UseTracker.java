package rw.gui;

import java.util.List;
import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.Base1039;
import rw.core.C0923;
import rw.core.C1003;
import rw.defs.Enum0055;
import rw.setting.C0122;
import rw.setting.OlkqtOti;
import rw.setting.Totem;

@AnnotationDefault(
   L = "UseTracker",
   y = Enum0055.MISC,
   N = Enum0070.TRACKERS
)
public class UseTracker extends GuiWidget {
   private static String[] f1000;
   public Object[] f2000;

   private static void m4000() {
      f1000 = new String[]{"totem-tracker", "food-tracker", "trackers"};
   }

   public UseTracker() {
      this.m8000();
      Totem var5 = new Totem(this, f1000[0], true);
      this.f2000[0] = var5;
      OlkqtOti var6 = new OlkqtOti(this, f1000[1], true);
      this.f2000[1] = var6;
      C1003 var7 = C0122.m4000(this, f1000[2], (Base1039)this.f2000[0], (Base1039)this.f2000[1]);
      this.f2000[2] = var7;
   }

   static {
      ntfClinit();
   }

   private void m8000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[3];
         Object[] var1 = this.f2000;
      }
   }

   @Iface0642
   public void m4000(C0923 var1) {
      this.m8000();
      ((List)((C1003)this.f2000[2]).i()).forEach(var1x -> var1x.y(var1));
   }

   @Iface0642
   public void m6000(rw.module.AutoAccept var1) {
      this.m8000();
      ((List)((C1003)this.f2000[2]).i()).forEach(var1x -> var1x.y(var1));
   }
}

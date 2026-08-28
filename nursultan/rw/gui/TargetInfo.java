package rw.gui;

import rw.GuiWidget;
import rw.NursultanClient;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.C0914;
import rw.core.C0991;
import rw.defs.Enum0055;
import rw.setting.C0122;

@AnnotationDefault(
   L = "TargetInfo",
   y = Enum0055.VISUAL,
   N = Enum0070.INTERFACE
)
public class TargetInfo extends GuiWidget {
   public Object[] f1000;
   private static String[] f2000;

   public C0991 m2000() {
      this.m4000();
      return (C0991)this.f1000[0];
   }

   private void m4000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[3];
         Object[] var1 = this.f1000;
      }
   }

   public TargetInfo() {
      this.m4000();
      C0991 var5 = C0122.m26000(this, f2000[0], false);
      this.f1000[0] = var5;
      C0991 var6 = C0122.m26000(this, f2000[1], true);
      this.f1000[1] = var6;
      C0991 var7 = C0122.m26000(this, f2000[2], true);
      this.f1000[2] = var7;
   }

   static {
      ntfClinit();
   }

   public boolean m6000() {
      NursultanClient.m42000().m64000();
      return super.m12000();
   }

   public boolean m8000() {
      NursultanClient.m42000().m64000();
      return super.m14000();
   }

   public C0991 m4000() {
      this.m4000();
      return (C0991)this.f1000[1];
   }

   public C0991 m6000() {
      this.m4000();
      return (C0991)this.f1000[2];
   }

   private static void m12000() {
      f2000 = new String[]{"show-from-mouse", "show-armor-details", "show-absorption"};
   }

   @Iface0642
   public void m8000(C0914 var1) {
      if (NursultanClient.m42000() != null) {
         NursultanClient.m42000().m64000();
      }
   }
}

package rw.gui;

import KDFzREm.NjL;
import rw.GuiWidget;
import rw.NursultanClient;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.Base1148;
import rw.core.C0138;
import rw.core.C0719;
import rw.core.C0721;
import rw.core.C0914;
import rw.core.C0936;
import rw.core.C0947;
import rw.core.C0998;
import rw.core.C1000;
import rw.core.RlQs;
import rw.defs.Enum0055;
import rw.setting.C0122;

@AnnotationDefault(
   L = "TargetEsp",
   y = Enum0055.VISUAL,
   N = Enum0070.WORLD
)
public class TargetEsp extends GuiWidget {
   public Object[] f1000;
   private static String[] f2000;

   public static void m2000(NjL var0) {
      m28000(var0, 1);
   }

   public NjL m8000() {
      this.m6000();
      return (NjL)this.f1000[1];
   }

   public NjL m10000() {
      this.m6000();
      return (NjL)this.f1000[0];
   }

   public TargetEsp() {
      this.m6000();
      C1000 var5 = C0122.m18000(this, f2000[0], new RlQs(this, f2000[1], false), new C0936(this, f2000[2], false), new C0947(this, f2000[3], true));
      this.f1000[4] = var5;
      C0998 var6 = C0122.m6000(this, f2000[4], -11104513);
      this.f1000[5] = var6;
      NursultanClient.m8000().m54000(C0719.class, var1 -> {
         this.m6000();
         if ((Integer)this.f1000[2] < NursultanClient.m74000().m10000() - (Integer)this.f1000[3]) {
            NjL var2 = (NjL)this.f1000[1];
            this.m20000(null);
            if (var2 != null) {
               NursultanClient.m8000().m12000(C0914.m18000(var2, null));
            }
         }
      });
   }

   static {
      ntfClinit();
   }

   private void m6000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[6];
         Object[] var1 = this.f1000;
         var1[2] = 0;
         var1[3] = 0;
      }
   }

   @Override
   public boolean m14000() {
      this.m6000();
      return (boolean)((NjL)this.f1000[0] != null ? 1 : 0);
   }

   public boolean m16000() {
      this.m6000();
      return (boolean)((NjL)this.f1000[1] != null ? 1 : 0);
   }

   private static void m18000() {
      f2000 = new String[]{"mode", "square", "jello", "scan", "color"};
   }

   public void m20000(NjL var1) {
      this.m6000();
      this.f1000[1] = var1;
   }

   public void m22000(int var1) {
      this.m6000();
      Integer var6 = var1;
      this.f1000[2] = var6;
   }

   public void m24000(NjL var1) {
      this.m6000();
      this.f1000[0] = var1;
   }

   public void m26000(int var1) {
      this.m6000();
      Integer var6 = var1;
      this.f1000[3] = var6;
   }

   public static void m28000(NjL var0, int var1) {
      TargetEsp var2 = NursultanClient.m88000().m94000();
      NjL var3 = (NjL)var2.f1000[1];
      var2.m20000(var0);
      if (var0 != null) {
         var2.m24000(var0);
      }

      var2.m22000(NursultanClient.m74000().m10000());
      var2.m26000(var1);
      if (var3 != var0) {
         NursultanClient.m8000().m12000(C0914.m18000(var3, var0));
      }
   }

   @Iface0642
   public void m32000(C0721 var1) {
      this.m6000();
      if (this.m14000()) {
         ((Base1148)((C1000)this.f1000[4]).i()).y(var1);
      }
   }

   @Iface0642
   public void m34000(C0138 var1) {
      this.m6000();
      if (this.m14000()) {
         ((Base1148)((C1000)this.f1000[4]).i()).y(var1);
      }
   }
}

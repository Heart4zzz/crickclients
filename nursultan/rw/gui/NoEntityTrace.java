package rw.gui;

import KDFzREm.NNNZZ;
import KDFzREm.NNuU;
import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.C0991;
import rw.defs.Enum0055;
import rw.setting.C0122;

@AnnotationDefault(
   L = "NoEntityTrace",
   y = Enum0055.PLAYER,
   N = Enum0070.BASE
)
public class NoEntityTrace extends GuiWidget {
   public Object[] f1000;
   private static String[] f2000;

   private void m4000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }

   public NoEntityTrace() {
      this.m4000();
      C0991 var5 = C0122.m26000(this, f2000[0], false);
      this.f1000[0] = var5;
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f2000 = new String[]{"only-while-breaking"};
   }

   @Iface0642
   public void m2000(rw.module.NoEntityTrace var1) {
      this.m4000();
      if (!(Boolean)((C0991)this.f1000[0]).i() || ((NNNZZ)((NNuU)this.y[0]).T[2]).E()) {
         var1.N();
      }
   }
}

package rw.gui;

import KDFzREm.NNNwS;
import KDFzREm.NNYH;
import KDFzREm.NNuU;
import java.util.List;
import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.C0798;
import rw.core.C0916;
import rw.core.C1003;
import rw.defs.Enum0055;
import rw.defs.Enum0081;
import rw.setting.C0122;

@AnnotationDefault(
   L = "TapeMouse",
   y = Enum0055.COMBAT,
   N = Enum0070.TOOLS
)
public class TapeMouse extends GuiWidget {
   public Object[] f1000;
   private static String[] f2000;

   private void m4000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[3];
         Object[] var1 = this.f1000;
      }
   }

   private static void m6000() {
      f2000 = new String[]{"left-mouse", "left-mouse-delay-sec", "right-mouse", "right-mouse-delay-sec", "mouse-buttons"};
   }

   public TapeMouse() {
      this.m4000();
      C0798 var5 = new C0798(f2000[0], true, f2000[1], ((NNuU)this.y[0])::NF);
      this.f1000[0] = var5;
      C0798 var6 = new C0798(f2000[2], false, f2000[3], ((NNuU)this.y[0])::yn);
      this.f1000[1] = var6;
      C1003 var7 = C0122.m4000(this, f2000[4], (C0798)this.f1000[0], (C0798)this.f1000[1]);
      this.f1000[2] = var7;
      ((C1003)this.f1000[2]).m2000().forEach(var1 -> ((C0798)var1).m6000(this));
   }

   static {
      ntfClinit();
   }

   @Iface0642(
      y = Enum0081.BEFORE_ALL
   )
   public void m8000(C0916 var1) {
      this.m4000();
      if ((NNNwS)((NNuU)this.y[0]).T[4] != null && !((NNNwS)((NNuU)this.y[0]).T[4]).method_6115() && (NNYH)((NNuU)this.y[0]).v[3] == null) {
         ((List)((C1003)this.f1000[2]).i()).forEach(var1x -> var1x.m4000(var1));
      }
   }
}

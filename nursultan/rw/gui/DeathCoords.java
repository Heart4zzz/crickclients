package rw.gui;

import KDFzREm.NNNNi;
import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNag;
import KDFzREm.NNuU;
import KDFzREm.NPh;
import KDFzREm.NXi;
import rw.GuiWidget;
import rw.NursultanClient;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.C0991;
import rw.core.C1188;
import rw.core.C1235;
import rw.data.Rec0207;
import rw.defs.Enum0055;
import rw.setting.C0106;
import rw.setting.C0122;
import rw.setting.C0160;

@AnnotationDefault(
   L = "DeathCoords",
   y = Enum0055.MISC,
   N = Enum0070.BASE
)
public class DeathCoords extends GuiWidget {
   private static String[] f1000;
   public Object[] f2000;

   public DeathCoords() {
      this.m6000();
      C0991 var5 = C0122.m26000(this, f1000[0], false);
      this.f2000[0] = var5;
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
      f1000 = new String[]{"save-waypoint", "death-message", "death-waypoint"};
   }

   @Iface0642
   public void m2000(rw.module.AutoAccept var1) {
      this.m6000();
      if (var1.m6000() instanceof NNNNi var2) {
         if (((NNNZg)((NNuU)this.y[0]).T[3]).method_8469(var2.N()) == (NNNwS)((NNuU)this.y[0]).T[4]) {
            NXi var8 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_73189();
            int var4 = (int)var8.N();
            int var5 = (int)var8.y();
            int var6 = (int)var8.L();
            NNag var7 = C1188.m16000(f1000[1], var4, var5, var6).N(NPh.field_1080);
            C0106.m52000(new Rec0207(this), var7);
            if ((Boolean)((C0991)this.f2000[0]).i()) {
               NursultanClient.m96000().m20000(C1235.m36000(f1000[2]), new NXi(var4, var5, var6), C0160.m6000());
            }
         }
      }
   }
}

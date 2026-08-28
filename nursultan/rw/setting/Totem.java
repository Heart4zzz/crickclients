package rw.setting;

import KDFzREm.NAB;
import KDFzREm.NAd;
import KDFzREm.NCj;
import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNag;
import KDFzREm.NNuU;
import KDFzREm.NPh;
import KDFzREm.NQa;
import KDFzREm.NQo;
import KDFzREm.NbK;
import KDFzREm.NbL;
import KDFzREm.Nwn;
import rw.core.Base1039;
import rw.core.C1189;
import rw.core.C1235;
import rw.data.Rec0207;
import rw.gui.UseTracker;
import rw.module.AutoAccept;

public class Totem extends Base1039 {
   private static String[] f1000;

   private static void m2000() {
      f1000 = new String[]{" ", "", " ", "totem-popped"};
   }

   public Totem(UseTracker var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   static {
      ntfClinit();
   }

   public void m12000(Object var1) {
      if (var1 instanceof AutoAccept var2) {
         if (var2.m6000() instanceof NCj var3 && var3.N() == 35) {
            NbK var11 = var3.N((NNNZg)((NNuU)this.N[0]).T[3]);
            if (var11 != (NNNwS)((NNuU)this.N[0]).T[4] && var11 instanceof Nwn var5) {
               for (NbL var9 : NbL.values()) {
                  NQo var10 = var5.method_5998(var9);
                  if (var10.B() == NQa.la) {
                     C1189.m22000(() -> this.m16000(var5, var10));
                     break;
                  }
               }
            }
         }
      }
   }

   private void m16000(Nwn var1, NQo var2) {
      NAB var3 = new NAB(var2);
      NNag var4 = var1.method_5476().L();
      NNag var5 = var4.i(NPh.field_1080 + (NPh.N(var4.getString()).endsWith(f1000[0]) ? f1000[1] : f1000[2]) + C1235.m36000(f1000[3]) + " ")
         .i(var2.I() ? NPh.field_1060 + "✔" : NPh.field_1061 + "❌")
         .y(NAd.N.N(var3));
      C0106.m52000(new Rec0207((UseTracker)this.u[0]), var5);
   }
}

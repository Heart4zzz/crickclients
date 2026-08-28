package rw.gui;

import KDFzREm.NCa;
import KDFzREm.NHk;
import KDFzREm.NKi;
import KDFzREm.NNNwS;
import KDFzREm.NNnC;
import KDFzREm.NNnS;
import KDFzREm.NNnf;
import KDFzREm.NNqB;
import KDFzREm.NNsZ;
import KDFzREm.NNty;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import KDFzREm.NcZ;
import KDFzREm.Ned;
import KDFzREm.wY;
import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.C0983;
import rw.core.C0989;
import rw.core.C1176;
import rw.defs.Enum0055;

@AnnotationDefault(
   L = "OpenWalls",
   y = Enum0055.MISC,
   N = Enum0070.BASE
)
public class OpenWalls extends GuiWidget {
   static {
      ntfClinit();
   }

   private boolean m2000(NCa var1, Ned var2) {
      NKi var3 = var1.i();
      return (boolean)(!(var3 instanceof NNqB) && !(var3 instanceof NNsZ) && !(var3 instanceof NHk) ? 0 : 1);
   }

   @Iface0642
   public void m4000(rw.module.OpenWalls var1) {
      NXi var2 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_33571();
      C0983 var3 = C0989.m4000();
      NXi var4 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_5631(var3.m68000(), var3.m38000()).L(((NNNwS)((NNuU)this.y[0]).T[4]).method_55754()).i(var2);
      NNty var5 = C1176.m34000(new NNnf(var2, var4, NNnS.field_17558, NNnC.field_1348, (NNNwS)((NNuU)this.y[0]).T[4]), this::m2000);
      if (var5.N() != NcZ.field_1333) {
         if (wY.N(var1.m4000(), var5)) {
            var1.N();
         }
      }
   }
}

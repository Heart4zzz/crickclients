package rw.core;

import KDFzREm.NHS;
import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.Nwn;
import rw.api.Iface0654;
import rw.gui.Speed;

public class C0673 extends Base1148<Speed> {
   private static double[] f1000;
   private static float[] f2000;

   public C0673(Speed var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f2000 = new float[]{4.0F};
   }

   public void m14000(Object var1) {
      if (var1 instanceof C0721) {
         NHS var2 = ((NNNwS)((NNuU)this.N[0]).T[4]).method_5829().L(f1000[0], f1000[1], f1000[2]);
         if (((NNNZg)((NNuU)this.N[0]).T[3]).N(Nwn.class, var2).size() > 1) {
            C1158 var3 = ((Iface0654)((NNNwS)((NNuU)this.N[0]).T[4])).dataManager().m2000();
            var3.m12000(f2000[0]);
         }
      }
   }

   private static void m18000() {
      f1000 = new double[]{1.0, 0.0, 1.0};
   }
}

package rw.core;

import KDFzREm.NHS;
import KDFzREm.NKL;
import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.Nbp;
import rw.gui.AutoTotem;

public class C1093 extends Base1096 {
   private static double[] f1000;

   public C1093(String var1, boolean var2) {
      super(var1, var2);
   }

   static {
      ntfClinit();
   }

   private static void m2000() {
      f1000 = new double[]{1.0, 5.0, 1.0, 0.0, 7.0, 0.0};
   }

   public boolean m6000() {
      NHS var1 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_5829().L(f1000[0], f1000[1], f1000[2]).u(f1000[3], f1000[4], f1000[5]);
      return (boolean)(!((NNNZg)((NNuU)this.y[0]).T[3]).method_18023(Nbp.Ny, var1, var0 -> (boolean)(var0.L().i() == NKL.vp ? 1 : 0)).isEmpty() ? 1 : 0);
   }

   public void m10000(AutoTotem var1) {
   }
}

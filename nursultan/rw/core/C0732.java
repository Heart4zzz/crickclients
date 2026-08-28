package rw.core;

import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import rw.gui.Scaffold;

public class C0732 extends C0734 {
   private static double[] f1000;

   public C0732(Scaffold var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   static {
      ntfClinit();
   }

   public boolean m2000() {
      return (boolean)(((NNNwS)((NNuU)this.y[0]).T[4]).field_6017 == f1000[0] && !((NNNwS)((NNuU)this.y[0]).T[4]).method_24828() && !this.R() ? 1 : 0);
   }

   private static void m8000() {
      f1000 = new double[]{0.0};
   }
}

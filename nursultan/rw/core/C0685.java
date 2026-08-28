package rw.core;

import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import rw.gui.ElytraTarget;

public class C0685 extends Base0680 {
   private static double[] f1000;
   private static float[] f2000;

   private static void m2000() {
      f2000 = new float[]{150.0F};
   }

   public C0685(ElytraTarget var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   static {
      ntfClinit();
   }

   private static void m4000() {
      f1000 = new double[]{1.5};
   }

   public void m8000(Object var1) {
      C0983 var2 = C0989.m26000(C0989.m28000(), ((NNNwS)((NNuU)this.N[0]).T[4]).method_18798());
      if ((((NNNwS)((NNuU)this.N[0]).T[4]).method_18798().M() < f1000[0] || var2.m8000().length() > f2000[0])
         && ((NNNwS)((NNuU)this.N[0]).T[4]).field_6012 % 5 == 0) {
         this.N((var0, var1x) -> {});
      }
   }
}

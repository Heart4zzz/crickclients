package rw.setting;

import KDFzREm.NNNZZ;
import KDFzREm.NNNZg;
import KDFzREm.NNty;
import KDFzREm.NNuU;
import KDFzREm.NcB;
import rw.api.Iface0648;
import rw.core.Base1099;
import rw.core.C0916;
import rw.core.C0988;
import rw.gui.NoDelay;

public class IlIsmni extends Base1099 implements Iface0648<NoDelay> {
   public Object[] f1000;
   private static float[] f2000;
   private static String[] f3000;

   public IlIsmni(NoDelay var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.m10000();
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f3000 = new String[]{"break-delay"};
   }

   private void m10000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }

   public void m14000(Object var1) {
      this.m10000();
      if (var1 instanceof C0916 && (NNNZg)((NNuU)this.N[0]).T[3] != null) {
         ((NNNZZ)((NNuU)this.N[0]).T[2]).y = 0;
         if (((NNNZZ)((NNuU)this.N[0]).T[2]).L
            && (NcB)((NNuU)this.N[0]).M[3] instanceof NNty
            && ((NNNZZ)((NNuU)this.N[0]).T[2]).N > f2000[4] - (Float)((C0988)this.f1000[0]).i()) {
            ((NNNZZ)((NNuU)this.N[0]).T[2]).N = f2000[5];
         }
      }
   }

   public void m22000(NoDelay var1) {
      this.m10000();
      C0988 var6 = (C0988)C0122.m12000(var1, f3000[0], f2000[0], f2000[1], f2000[2], f2000[3]).N(var1x -> this.U());
      this.f1000[0] = var6;
   }

   private static void m26000() {
      f2000 = new float[]{0.5F, 0.1F, 1.0F, 0.1F, 1.1F, 1.0F};
   }
}

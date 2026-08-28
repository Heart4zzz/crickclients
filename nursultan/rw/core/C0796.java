package rw.core;

import KDFzREm.NNNZZ;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NQa;
import KDFzREm.NQo;
import KDFzREm.NXi;
import KDFzREm.NbL;
import java.util.function.Function;
import rw.api.Iface0602;
import rw.data.Rec0199;
import rw.data.Rec0200;
import rw.data.Rec0202;
import rw.data.Rec0204;
import rw.gui.Crossbow;
import rw.gui.ItemRelease;

public class C0796 extends Base0788 {
   private static short[] f1000;
   private static short[] f2000;
   public Object[] f3000;
   private static short[] f4000;
   private static short[] f5000;
   private static float[] f6000;
   private static short[] f7000;

   private void m4000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[1];
         Object[] var1 = this.f3000;
      }
   }

   public C0796(ItemRelease var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.m4000();
      C0849 var8 = new C0849((Rec0200)Rec0200.f5000[1], Iface0602.f1000);
      this.f3000[0] = var8;
   }

   static {
      ntfClinit();
   }

   private static void m12000() {
      f6000 = new float[]{0.0F, 2.5F};
   }

   @Override
   public void m2000(NNuU var1, NbL var2) {
      ((NNNZZ)var1.T[2]).y((NNNwS)var1.T[4]);
   }

   private static void m16000() {
      f1000 = new short[]{1, 0};
      f2000 = new short[]{4, 4, 4, 1, 4};
      f5000 = new short[]{2, 4, 4, 4};
      f7000 = new short[]{0, 4, 4, 4, 2, 4, 1, 0};
      f4000 = new short[]{2, 4};
   }

   public boolean m18000(NNuU var1, NbL var2) {
      NQo var3 = ((NNNwS)var1.T[4]).method_5998(var2);
      if (var3.N(NQa.db)) {
         return (boolean)(((NNNwS)var1.T[4]).method_6048() >= 10 ? 1 : 0);
      } else {
         return (boolean)0;
      }
   }

   @Override
   public boolean m4000(NNuU var1, NbL var2, Function<Rec0199, Boolean> var3) {
      this.m4000();
      Rec0204 var4 = new Rec0204(
         new NXi(
            (Double)((NNNwS)var1.T[4]).M[1],
            (Double)((NNNwS)var1.T[4]).M[2] + ((NNNwS)var1.T[4]).method_18381(((NNNwS)var1.T[4]).method_18376()),
            (Double)((NNNwS)var1.T[4]).R[0]
         ),
         Crossbow.m36000(
            (NNNwS)var1.T[4], ((NNNwS)var1.T[4]).method_60478(), (Float)((NNNwS)var1.T[4]).R[2], (Float)((NNNwS)var1.T[4]).R[1], f6000[0], f6000[1]
         ),
         (C0837)this.f3000[0]
      );
      Rec0202 var5 = var4.m10000();
      return var5.m6000().<Boolean>map(var3).orElse(false);
   }
}

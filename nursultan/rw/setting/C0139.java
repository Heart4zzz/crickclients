package rw.setting;

import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import KDFzREm.Nbp;
import KDFzREm.Nky;
import java.util.function.Predicate;
import rw.core.Base1096;
import rw.core.C0988;
import rw.gui.AutoTotem;

public class C0139 extends Base1096 {
   private static String[] f1000;
   private static float[] f2000;
   private static double[] f3000;
   public Object[] f4000;

   private static void m2000() {
      f2000 = new float[]{5.0F, 5.0F, 40.0F, 1.0F};
   }

   private void m4000() {
      if (this.f4000 == null) {
         this.f4000 = new Object[1];
         Object[] var1 = this.f4000;
      }
   }

   public C0139(String var1, boolean var2) {
      super(var1, var2);
      this.m4000();
   }

   static {
      ntfClinit();
   }

   private static void m4000() {
      f1000 = new String[]{"distance-to-trident"};
   }

   private Predicate<Nky> m10000() {
      return var1 -> {
         NXi var2 = var1.method_18798();
         if (var2.B() == f3000[0]) {
            return (boolean)0;
         } else {
            NXi var3 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_73189().u(var1.method_73189()).u();
            return (boolean)(var2.u().y(var3) > f3000[1] && !var1.u && var1.R == 0 ? 1 : 0);
         }
      };
   }

   public boolean m10000() {
      this.m4000();
      return (boolean)(!((NNNZg)((NNuU)this.y[0]).T[3])
            .method_18023(Nbp.yo, ((NNNwS)((NNuU)this.y[0]).T[4]).method_5829().M(((Float)((C0988)this.f4000[0]).i()).floatValue()), this.m10000())
            .isEmpty()
         ? 1
         : 0);
   }

   public void m18000(AutoTotem var1) {
      this.m4000();
      C0988 var6 = (C0988)C0122.m12000(var1, f1000[0], f2000[0], f2000[1], f2000[2], f2000[3]).N(var1x -> this.U());
      this.f4000[0] = var6;
   }

   private static void m28000() {
      f3000 = new double[]{0.0, 0.5};
   }
}

package rw.setting;

import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.Nbp;
import rw.core.Base1096;
import rw.core.C0988;
import rw.gui.AutoTotem;

public class C0144 extends Base1096 {
   private static String[] f1000;
   public Object[] f2000;
   private static float[] f3000;

   private void m2000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[1];
         Object[] var1 = this.f2000;
      }
   }

   public C0144(String var1, boolean var2) {
      super(var1, var2);
      this.m2000();
   }

   static {
      ntfClinit();
   }

   private static void m4000() {
      f3000 = new float[]{5.0F, 3.0F, 60.0F, 1.0F};
   }

   public boolean m8000() {
      this.m2000();
      return (boolean)(!((NNNZg)((NNuU)this.y[0]).T[3])
            .method_18023(Nbp.S, ((NNNwS)((NNuU)this.y[0]).T[4]).method_5829().M(((Float)((C0988)this.f2000[0]).i()).floatValue()), var0 -> (boolean)1)
            .isEmpty()
         ? 1
         : 0);
   }

   public void m10000(AutoTotem var1) {
      this.m2000();
      C0988 var6 = (C0988)C0122.m12000(var1, f1000[0], f3000[0], f3000[1], f3000[2], f3000[3]).N(var1x -> this.U());
      this.f2000[0] = var6;
   }

   private static void m18000() {
      f1000 = new String[]{"distance-to-crystal"};
   }
}

package rw.setting;

import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.Nbp;
import rw.core.Base1096;
import rw.core.C0988;
import rw.gui.AutoTotem;

public class C0140 extends Base1096 {
   private static float[] f1000;
   private static String[] f2000;
   public Object[] f3000;

   private static void m4000() {
      f1000 = new float[]{5.0F, 3.0F, 60.0F, 1.0F};
   }

   public C0140(String var1, boolean var2) {
      super(var1, var2);
      this.m4000();
   }

   static {
      ntfClinit();
   }

   private static void m2000() {
      f2000 = new String[]{"distance-to-tnt"};
   }

   private void m4000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[1];
         Object[] var1 = this.f3000;
      }
   }

   public boolean m10000() {
      this.m4000();
      return (boolean)(!((NNNZg)((NNuU)this.y[0]).T[3])
            .method_8333(
               (NNNwS)((NNuU)this.y[0]).T[4],
               ((NNNwS)((NNuU)this.y[0]).T[4]).method_5829().M(((Float)((C0988)this.f3000[0]).i()).floatValue()),
               var0 -> (boolean)(var0.method_5864() != Nbp.yI && var0.method_5864() != Nbp.yg ? 0 : 1)
            )
            .isEmpty()
         ? 1
         : 0);
   }

   public void m10000(AutoTotem var1) {
      this.m4000();
      C0988 var6 = (C0988)C0122.m12000(var1, f2000[0], f1000[0], f1000[1], f1000[2], f1000[3]).N(var1x -> this.U());
      this.f3000[0] = var6;
   }
}

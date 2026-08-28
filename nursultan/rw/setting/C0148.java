package rw.setting;

import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.Nwn;
import rw.api.Iface0648;
import rw.core.Base1148;
import rw.core.C0700;
import rw.core.C0988;
import rw.core.C1140;
import rw.gui.AutoLeave;

public class C0148 extends Base1148<AutoLeave> implements Iface0648<AutoLeave> {
   public Object[] f1000;
   private static float[] f2000;
   private static String[] f3000;

   private void m2000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }

   public C0148(AutoLeave var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.m2000();
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f2000 = new float[]{40.0F, 1.0F, 100.0F, 1.0F};
   }

   public void m12000(Object var1) {
      this.m2000();
      if (var1 instanceof C0700
         && !((NNNZg)((NNuU)this.N[0]).T[3])
            .N(Nwn.class, ((NNNwS)((NNuU)this.N[0]).T[4]).method_5829().M(((Float)((C0988)this.f1000[0]).i()).floatValue()), this::m16000)
            .isEmpty()) {
         ((AutoLeave)this.N[1]).m8000();
      }
   }

   private boolean m16000(Nwn var1) {
      if (var1 == (NNNwS)((NNuU)this.N[0]).T[4]) {
         return (boolean)0;
      } else {
         return (boolean)(var1.method_5805() && !C1140.m32000().test(var1) && !C1140.m16000().test(var1) ? 1 : 0);
      }
   }

   public void m26000(AutoLeave var1) {
      this.m2000();
      C0988 var6 = (C0988)C0122.m12000(var1, f3000[0], f2000[0], f2000[1], f2000[2], f2000[3]).N(var1x -> this.U());
      this.f1000[0] = var6;
   }

   private static void m30000() {
      f3000 = new String[]{"distance"};
   }
}

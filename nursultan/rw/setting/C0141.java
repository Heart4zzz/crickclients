package rw.setting;

import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import rw.api.Iface0648;
import rw.core.Base1148;
import rw.core.C0700;
import rw.core.C0988;
import rw.gui.AutoLeave;

public class C0141 extends Base1148<AutoLeave> implements Iface0648<AutoLeave> {
   private static String[] f1000;
   private static float[] f2000;
   public Object[] f3000;

   private void m2000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[1];
         Object[] var1 = this.f3000;
      }
   }

   public C0141(AutoLeave var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.m2000();
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f1000 = new String[]{"health"};
   }

   public void m14000(Object var1) {
      this.m2000();
      if (var1 instanceof C0700 && ((NNNwS)((NNuU)this.N[0]).T[4]).method_6032() < (Float)((C0988)this.f3000[0]).i()) {
         ((AutoLeave)this.N[1]).m8000();
      }
   }

   public void m16000(AutoLeave var1) {
      this.m2000();
      C0988 var6 = (C0988)C0122.m12000(var1, f1000[0], f2000[0], f2000[1], f2000[2], f2000[3]).N(var1x -> this.U());
      this.f3000[0] = var6;
   }

   private static void m20000() {
      f2000 = new float[]{15.0F, 1.0F, 20.0F, 0.5F};
   }
}

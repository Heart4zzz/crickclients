package rw.setting;

import KDFzREm.NHS;
import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NQa;
import KDFzREm.Nwn;
import rw.core.Base1096;
import rw.core.C0988;
import rw.core.C1140;
import rw.gui.AutoTotem;

public class C0137 extends Base1096 {
   public Object[] f1000;
   private static double[] f2000;
   private static float[] f3000;
   private static String[] f4000;

   private static void m2000() {
      f3000 = new float[]{3.0F, 1.0F, 10.0F, 1.0F};
   }

   public C0137(String var1, boolean var2) {
      super(var1, var2);
      this.m4000();
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f2000 = new double[]{8.0, 2.0, 0.0, 2.0, 0.0};
   }

   private void m4000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }

   private static void m6000() {
      f4000 = new String[]{"smash-height"};
   }

   private boolean m12000(Nwn var1) {
      return (boolean)(var1 == (NNNwS)((NNuU)this.y[0]).T[4]
            || !var1.method_5805()
            || C1140.m32000().test(var1)
            || !var1.method_6047().N(NQa.Gm)
            || var1.method_24828()
            || !(var1.method_18798().B < f2000[4]) && !(var1.method_23318() <= var1.field_5971)
         ? 0
         : 1);
   }

   public void m16000(AutoTotem var1) {
      this.m4000();
      C0988 var6 = (C0988)C0122.m12000(var1, f4000[0], f3000[0], f3000[1], f3000[2], f3000[3]).N(var1x -> this.U());
      this.f1000[0] = var6;
   }

   public boolean m12000() {
      this.m4000();
      NHS var1 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_5829();
      NHS var2 = new NHS(var1.N, var1.i + ((Float)((C0988)this.f1000[0]).i()).floatValue(), var1.L, var1.u, var1.i + f2000[0], var1.R)
         .L(f2000[1], f2000[2], f2000[3]);
      return (boolean)(!((NNNZg)((NNuU)this.y[0]).T[3]).N(Nwn.class, var2, this::m12000).isEmpty() ? 1 : 0);
   }
}

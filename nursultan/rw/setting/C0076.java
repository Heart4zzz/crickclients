package rw.setting;

import KDFzREm.NNNwS;
import KDFzREm.NNNwj;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import rw.api.Iface0648;
import rw.core.Base1148;
import rw.core.C0988;
import rw.core.C1181;
import rw.gui.C0045;
import rw.module.AttackAura_x_x;

public class C0076 extends Base1148<C0045> implements Iface0648<C0045> {
   private static double[] f1000;
   public Object[] f2000;
   private static float[] f3000;
   private static String[] f4000;

   public C0076(C0045 var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.m34000();
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f3000 = new float[]{1.0F, 0.1F, 5.0F, 0.1F, 0.0F, 0.0F, 0.0F, 2.0F};
   }

   private static void m12000() {
      f1000 = new double[]{0.0, 0.0, 0.0};
   }

   public void m18000(Object var1) {
      this.m34000();
      if (var1 instanceof AttackAura_x_x var2) {
         float var3 = NNNwj.N(var2.m20000(), var2.m8000());
         float var4 = NNNwj.N(var2.m32000(), var2.m18000());
         if (var3 != f3000[4] || var4 != f3000[5]) {
            double var5 = Math.toRadians(C1181.m40000(((NNNwS)((NNuU)this.N[0]).T[4]).method_36454(), var3, var4));
            ((NNNwS)((NNuU)this.N[0]).T[4])
               .method_60491(
                  new NXi(
                     -Math.sin(var5) * ((Float)((C0988)this.f2000[0]).i()).floatValue(),
                     f1000[0],
                     Math.cos(var5) * ((Float)((C0988)this.f2000[0]).i()).floatValue()
                  )
               );
         }

         float var7 = NNNwj.N(var2.m6000(), var2.m44000());
         if (var7 != f3000[6]) {
            ((NNNwS)((NNuU)this.N[0]).T[4]).method_60491(new NXi(f1000[1], var7 * (Float)((C0988)this.f2000[0]).i() / f3000[7], f1000[2]));
         }
      }
   }

   public void m28000(C0045 var1) {
      this.m34000();
      C0988 var6 = (C0988)C0122.m12000(var1, f4000[0], f3000[0], f3000[1], f3000[2], f3000[3]).N(var1x -> this.U());
      this.f2000[0] = var6;
   }

   private static void m30000() {
      f4000 = new String[]{"boost"};
   }

   private void m34000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[1];
         Object[] var1 = this.f2000;
      }
   }
}

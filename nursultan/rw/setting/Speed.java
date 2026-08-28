package rw.setting;

import KDFzREm.NNNwS;
import KDFzREm.NNNwj;
import KDFzREm.NNNww;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import KDFzREm.gB;
import rw.api.Iface0648;
import rw.core.Base1148;
import rw.core.C0988;
import rw.core.C1181;
import rw.gui.C0045;

public class Speed extends Base1148<C0045> implements Iface0648<C0045> {
   private static short[] f1000;
   private static double[] f2000;
   private static String[] f3000;
   private static short[] f4000;
   public Object[] f5000;
   private static float[] f6000;

   private static void m2000() {
      f3000 = new String[]{"speed"};
   }

   public Speed(C0045 var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.m34000();
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f6000 = new float[]{1.0F, 0.1F, 10.0F, 0.1F, 0.0F, 0.0F, 2.0F};
   }

   private static void m14000() {
      f4000 = new short[]{0, 0};
      f1000 = new short[]{4, 1, 0, 4, 0, 0, 0};
   }

   public void m16000(Object var1) {
      this.m34000();
      if (var1 instanceof rw.module.Speed var2) {
         gB var3 = ((NNNww)((NNNwS)((NNuU)this.N[0]).T[4]).L[1]).field_54155;
         float var4 = NNNwj.N(var3.N(), var3.y());
         float var5 = NNNwj.N(var3.L(), var3.u());
         NXi var6 = NXi.L;
         if (var4 != f6000[4] || var5 != f6000[5]) {
            double var7 = Math.toRadians(C1181.m40000(((NNNwS)((NNuU)this.N[0]).T[4]).method_36454(), var4, var5));
            var6 = var6.y(
               -Math.sin(var7) * ((Float)((C0988)this.f5000[0]).i()).floatValue(), f2000[0], Math.cos(var7) * ((Float)((C0988)this.f5000[0]).i()).floatValue()
            );
         }

         float var10 = NNNwj.N(var3.i(), var3.R());
         var6 = var6.y(f2000[1], var10 * (Float)((C0988)this.f5000[0]).i() / f6000[6], f2000[2]);
         var2.m10000(var6);
      }
   }

   private static void m24000() {
      f2000 = new double[]{0.0, 0.0, 0.0};
   }

   public void m28000(C0045 var1) {
      this.m34000();
      C0988 var6 = (C0988)C0122.m12000(var1, f3000[0], f6000[0], f6000[1], f6000[2], f6000[3]).N(var1x -> this.U());
      this.f5000[0] = var6;
   }

   private void m34000() {
      if (this.f5000 == null) {
         this.f5000 = new Object[1];
         Object[] var1 = this.f5000;
      }
   }
}

package rw.gui;

import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NQa;
import KDFzREm.wY;
import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.C0988;
import rw.core.C0991;
import rw.defs.Enum0055;
import rw.module.IltlnIij;
import rw.setting.C0122;

@AnnotationDefault(
   L = "FastExp",
   y = Enum0055.PLAYER,
   N = Enum0070.BASE
)
public class FastExp extends GuiWidget {
   private static String[] f1000;
   public Object[] f2000;
   private static float[] f3000;

   private void m4000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[2];
         Object[] var1 = this.f2000;
      }
   }

   public FastExp() {
      this.m4000();
      C0991 var5 = C0122.m26000(this, f1000[0], true);
      this.f2000[0] = var5;
      C0988 var6 = C0122.m12000(this, f1000[1], f3000[0], f3000[1], f3000[2], f3000[3]);
      this.f2000[1] = var6;
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f3000 = new float[]{1.0F, 0.0F, 3.0F, 1.0F};
   }

   private static void m8000() {
      f1000 = new String[]{"only-without-pvp", "delay"};
   }

   @Iface0642
   public void m4000(IltlnIij var1) {
      this.m4000();
      if (!(Boolean)((C0991)this.f2000[0]).i() || !wY.u()) {
         if (((NNNwS)((NNuU)this.y[0]).T[4]).method_5998(var1.m12000()).B() == NQa.GB) {
            NNuU var10000 = (NNuU)this.y[0];
            Integer var6 = ((Float)((C0988)this.f2000[1]).i()).intValue();
            var10000.M[4] = var6;
         }
      }
   }
}

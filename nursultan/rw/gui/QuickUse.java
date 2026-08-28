package rw.gui;

import KDFzREm.NNNZZ;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NQa;
import KDFzREm.NbI;
import KDFzREm.NbL;
import KDFzREm.wY;
import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0606;
import rw.api.Iface0642;
import rw.core.C0719;
import rw.core.C0740;
import rw.core.C0746;
import rw.core.C1193;
import rw.defs.Enum0055;
import rw.module.OlpnniIl;

@AnnotationDefault(
   L = "QuickUse",
   y = Enum0055.PLAYER,
   N = Enum0070.BASE
)
public class QuickUse extends GuiWidget {
   private static short[] f1000;
   public Object[] f2000;
   private static short[] f3000;
   private static String[] f4000;
   private static String[] f5000;
   private static short[] f6000;

   private boolean m4000() {
      if (((NNNZZ)((NNuU)this.y[0]).T[2]).E() || ((NNNwS)((NNuU)this.y[0]).T[4]).n()) {
         return (boolean)0;
      } else {
         return (boolean)(!((NNNwS)((NNuU)this.y[0]).T[4]).method_6115() && ((NNuU)this.y[0]).M[4] == 0 ? 1 : 0);
      }
   }

   public QuickUse() {
      this.m10000();
      C0746[] var5 = new C0746[]{
         new C0746(Iface0606.m4000(NQa.lo), f4000[0], this),
         new C0746(Iface0606.m4000(NQa.jT), f4000[1], this),
         new C0746(Iface0606.m4000(NQa.lt), f4000[2], this),
         new C0746(Iface0606.m4000(NQa.bV), f4000[3], this),
         new C0746(Iface0606.m4000(NQa.be), f4000[4], this),
         new C0746(Iface0606.m4000(NQa.GB), f4000[5], this),
         new C0740(var0 -> C1193.m50000(var0, NbI.M), f4000[6], this),
         new C0746(var0 -> (boolean)(var0.N(NQa.ns) && C1193.m50000(var0, NbI.R) ? 1 : 0), f5000[0], this),
         new C0746(Iface0606.m4000(NQa.db), f5000[1], this)
      };
      this.f2000[0] = var5;
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f3000 = new short[]{0, 1, 0, 4};
      f1000 = new short[]{0, 1, 0, 0, 2, 0};
      f6000 = new short[]{4, 0, 4, 0, 4};
   }

   private static void m8000() {
      f4000 = new String[]{"shield", "milk", "chorus", "golden-apple", "enchanted-golden-apple", "bottle-of-exp", "instant-damage"};
      f5000 = new String[]{"instant-health", "trident"};
   }

   private void m10000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[2];
         Object[] var1 = this.f2000;
         var1[1] = false;
      }
   }

   @Iface0642(
      u = true
   )
   public void m16000(OlpnniIl var1) {
      this.m10000();

      for (C0746 var5 : (C0746[])this.f2000[0]) {
         var5.m20000(var1);
      }
   }

   @Iface0642
   public void m18000(C0719 var1) {
      this.m10000();
      if ((Boolean)this.f2000[1] && this.m4000()) {
         NNuU var10000 = (NNuU)this.y[0];
         Integer var10 = 4;
         var10000.M[4] = var10;
         wY.N(NbL.field_5808);
      }

      for (C0746 var5 : (C0746[])this.f2000[0]) {
         var5.m4000();
      }
   }

   @Iface0642
   public void m22000(rw.module.QuickUse var1) {
      this.m10000();
      if ((Boolean)this.f2000[1]) {
         var1.N();
      }
   }
}

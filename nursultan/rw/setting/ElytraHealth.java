package rw.setting;

import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NQa;
import KDFzREm.NbI;
import rw.core.Base1096;
import rw.core.C0988;
import rw.core.IljlItp;
import rw.gui.AutoTotem;

public class ElytraHealth extends Base1096 {
   public Object[] f1000;
   private static float[] f2000;
   private static String[] f3000;

   public ElytraHealth(String var1, boolean var2) {
      super(var1, var2);
      this.m2000();
   }

   static {
      ntfClinit();
   }

   private void m2000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }

   private static void m4000() {
      f3000 = new String[]{"elytra-health"};
   }

   public boolean m8000() {
      this.m2000();
      if (!IljlItp.m40000(NQa.sT)) {
         return (boolean)0;
      } else {
         float var1 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_6032();
         if (((NNNwS)((NNuU)this.y[0]).T[4]).method_6059(NbI.t)) {
            var1 += ((NNNwS)((NNuU)this.y[0]).T[4]).method_6067();
         }

         return (boolean)(var1 < ((C0988)this.f1000[0]).i() ? 1 : 0);
      }
   }

   public void m12000(AutoTotem var1) {
      this.m2000();
      C0988 var6 = (C0988)C0122.m12000(var1, f3000[0], f2000[0], f2000[1], f2000[2], f2000[3]).N(var1x -> this.U());
      this.f1000[0] = var6;
   }

   private static void m16000() {
      f2000 = new float[]{3.0F, 1.0F, 20.0F, 0.5F};
   }
}

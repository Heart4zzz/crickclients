package rw.setting;

import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NbI;
import rw.core.Base1096;
import rw.core.C0988;
import rw.gui.AutoTotem;

public class C0142 extends Base1096 {
   private static float[] f1000;
   private static String[] f2000;
   public Object[] f3000;

   private static void m2000() {
      f2000 = new String[]{"health"};
   }

   public C0142(String var1, boolean var2) {
      super(var1, var2);
      this.m6000();
   }

   static {
      ntfClinit();
   }

   private static void m4000() {
      f1000 = new float[]{3.0F, 1.0F, 20.0F, 0.5F};
   }

   private void m6000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[1];
         Object[] var1 = this.f3000;
      }
   }

   public void m8000(AutoTotem var1) {
      this.m6000();
      C0988 var6 = (C0988)C0122.m12000(var1, f2000[0], f1000[0], f1000[1], f1000[2], f1000[3]).N(var1x -> this.U());
      this.f3000[0] = var6;
   }

   public boolean m12000() {
      this.m6000();
      float var1 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_6032();
      if (((NNNwS)((NNuU)this.y[0]).T[4]).method_6059(NbI.t)) {
         var1 += ((NNNwS)((NNuU)this.y[0]).T[4]).method_6067();
      }

      return (boolean)(var1 < ((C0988)this.f3000[0]).i() ? 1 : 0);
   }
}

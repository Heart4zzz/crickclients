package rw.setting;

import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import rw.core.Base1096;
import rw.core.C0988;
import rw.gui.AutoTotem;

public class C0138 extends Base1096 {
   private static String[] f1000;
   private static float[] f2000;
   public Object[] f3000;

   private static void m2000() {
      f1000 = new String[]{"fall-distance"};
   }

   private void m4000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[1];
         Object[] var1 = this.f3000;
      }
   }

   public C0138(String var1, boolean var2) {
      super(var1, var2);
      this.m4000();
   }

   static {
      ntfClinit();
   }

   private static void m4000() {
      f2000 = new float[]{10.0F, 10.0F, 60.0F, 5.0F};
   }

   public void m8000(AutoTotem var1) {
      this.m4000();
      C0988 var6 = (C0988)C0122.m12000(var1, f1000[0], f2000[0], f2000[1], f2000[2], f2000[3]).N(var1x -> this.U());
      this.f3000[0] = var6;
   }

   public boolean m8000() {
      this.m4000();
      return (boolean)(!((NNNwS)((NNuU)this.y[0]).T[4]).method_6128()
            && ((NNNwS)((NNuU)this.y[0]).T[4]).field_6017 >= ((Float)((C0988)this.f3000[0]).i()).floatValue()
         ? 1
         : 0);
   }
}

package rw.core;

import KDFzREm.NNNwS;
import KDFzREm.NNuU;

public class CameraApiPart3 extends Base1138 {
   public Object[] f1000;
   private static String[] f2000;

   public CameraApiPart3(String var1, boolean var2) {
      super(var1, var2);
      this.m6000();
      String[] var7 = new String[]{f2000[0], f2000[1], f2000[2]};
      this.f1000[0] = var7;
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f2000 = new String[]{"/bal", "/baltop", "/rg"};
   }

   public void m10000(Object var1) {
      this.m6000();
      if (var1 instanceof C0719) {
         int var2 = ((NNNwS)((NNuU)this.N[0]).T[4]).method_59922().y(((String[])this.f1000[0]).length);
         rw.setting.C0160.m70000(((String[])this.f1000[0])[var2]);
      }
   }

   private void m6000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }
}

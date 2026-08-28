package rw.core;

import KDFzREm.NNuU;
import rw.gui.ChatHelper;

public abstract class Base1017 extends Base1138 {
   public Object[] f1000;

   public Base1017(ChatHelper var1, String var2, boolean var3) {
      super(var2, var3);
      this.m2000();
      NNuU var8 = NNuU.Nq();
      this.f1000[0] = var8;
      this.f1000[1] = var1;
   }

   static {
      ntfClinit();
   }

   private void m2000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[2];
         Object[] var1 = this.f1000;
      }
   }
}

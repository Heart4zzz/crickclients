package rw.core;

import KDFzREm.NNuU;
import rw.api.Iface0653;

public abstract class Base1138 extends C1013 implements Iface0653 {
   public Object[] f1000;

   public Base1138(String var1, boolean var2) {
      super(var1, var2);
      this.m2000();
      NNuU var7 = NNuU.Nq();
      this.f1000[0] = var7;
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
}

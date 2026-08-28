package rw.core;

import KDFzREm.NNuU;
import rw.api.Iface0636;
import rw.gui.AutoLeave;

public class C1104 extends BvBn<AutoLeave> implements Iface0636 {
   public Object[] f1000;

   public String m2000() {
      this.m2000();
      return (String)this.f1000[0];
   }

   public C1104(AutoLeave var1, String var2, String var3, boolean var4) {
      super(var1, var3, var4);
      this.m2000();
      this.f1000[0] = var2;
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

   public void m8000() {
      String var1 = this.m2000();
      if (!var1.isBlank()) {
         ((NNuU)this.N[0]).NE().u(var1);
      }
   }
}

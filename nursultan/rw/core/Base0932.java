package rw.core;

import KDFzREm.NbK;
import rw.api.Iface0648;
import rw.gui.Tracers;

public abstract class Base0932<T extends NbK> extends Base1156 implements Iface0648<Tracers> {
   public Object[] f1000;

   public Base0932(Tracers var1, String var2, boolean var3) {
      super(var2, var3);
      this.m8000();
      this.f1000[0] = var1;
   }

   static {
      ntfClinit();
   }

   private void m8000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }

   public int m12000() {
      return -1;
   }
}

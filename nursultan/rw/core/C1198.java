package rw.core;

import rw.api.Iface0578;
import rw.data.IlqOps;
import rw.module.Huddumped;

public class C1198 implements Iface0578 {
   public Object[] f1000;

   public C1198(IlqOps var1) {
      this.m4000();
      this.f1000[0] = var1;
   }

   static {
      ntfClinit();
   }

   private void m4000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }

   public boolean m10000() {
      return ((IlqOps)this.f1000[0]).f1000.m30000();
   }

   public void m12000(Huddumped var1) {
      ((IlqOps)this.f1000[0]).f1000.m40000();
   }
}

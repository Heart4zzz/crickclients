package rw.core;

import KDFzREm.NAN;

public class C0707 {
   public Object[] f1000;

   private void m2000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }

   public C0707(NAN var1) {
      this.m2000();
      this.f1000[0] = var1;
   }

   static {
      ntfClinit();
   }

   public NAN m10000() {
      return (NAN)this.f1000[0];
   }

   public C0707 m12000(NAN var1) {
      this.f1000[0] = var1;
      return this;
   }
}

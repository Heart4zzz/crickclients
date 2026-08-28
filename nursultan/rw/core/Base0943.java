package rw.core;

import rw.net.IlpOks;
import rw.net.PacketBuf;

public abstract class Base0943 {
   public Object[] f1000;

   public Base0943(IlpOks var1, boolean var2) {
      this.m20000();
      this.f1000[0] = var1;
      Boolean var8 = var2;
      this.f1000[1] = var8;
   }

   static {
      ntfClinit();
   }

   public boolean m12000() {
      return (Boolean)this.f1000[1];
   }

   public abstract void m16000(PacketBuf var1);

   public IlpOks m18000() {
      return (IlpOks)this.f1000[0];
   }

   private void m20000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[2];
         Object[] var1 = this.f1000;
         var1[1] = false;
      }
   }
}

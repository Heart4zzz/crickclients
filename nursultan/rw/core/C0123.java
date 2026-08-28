package rw.core;

import rw.api.Iface0027;
import rw.net.PacketBuf;
import rw.net.PacketHandlers;

public class C0123 implements PacketHandlers<Iface0027> {
   public Object[] f1000;

   public C0123() {
      this.m6000();
   }

   public C0123(long var1) {
      this.m6000();
      Long var7 = var1;
      this.f1000[0] = var7;
   }

   static {
      ntfClinit();
   }

   private void m6000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
         var1[0] = 0L;
      }
   }

   public void m14000(PacketBuf var1) {
      Long var6 = var1.m8000();
      this.f1000[0] = var6;
   }

   public void m18000(PacketBuf var1) {
      var1.m84000((Long)this.f1000[0]);
   }

   public void m20000(Iface0027 var1) {
      var1.m32000(this);
   }

   public long m22000() {
      return (Long)this.f1000[0];
   }
}

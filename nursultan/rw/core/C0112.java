package rw.core;

import rw.api.Iface0027;
import rw.net.PacketBuf;
import rw.net.PacketHandlers;

public class C0112 implements PacketHandlers<Iface0027> {
   public Object[] f1000;

   public C0112() {
      this.m8000();
   }

   public C0112(long var1) {
      this.m8000();
      Long var7 = var1;
      this.f1000[0] = var7;
   }

   static {
      ntfClinit();
   }

   private void m8000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
         var1[0] = 0L;
      }
   }

   public void m10000(PacketBuf var1) {
      Long var6 = var1.m8000();
      this.f1000[0] = var6;
   }

   public void m20000(PacketBuf var1) {
      var1.m84000((Long)this.f1000[0]);
   }

   public long m22000() {
      return (Long)this.f1000[0];
   }

   public void m26000(Iface0027 var1) {
      var1.m8000(this);
   }
}

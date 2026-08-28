package rw.core;

import rw.api.Iface0029;
import rw.net.PacketBuf;
import rw.net.PacketHandlers;

public class C1216 implements PacketHandlers<Iface0029> {
   public Object[] f1000;

   private void m2000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
         var1[0] = 0L;
      }
   }

   public C1216() {
      this.m2000();
   }

   public C1216(long var1) {
      this.m2000();
      Long var7 = var1;
      this.f1000[0] = var7;
   }

   static {
      ntfClinit();
   }

   public void m10000(PacketBuf var1) {
      Long var6 = var1.m8000();
      this.f1000[0] = var6;
   }

   public void m16000(PacketBuf var1) {
      var1.m84000((Long)this.f1000[0]);
   }

   public void m20000(Iface0029 var1) {
      var1.m24000(this);
   }

   public long m24000() {
      return (Long)this.f1000[0];
   }
}

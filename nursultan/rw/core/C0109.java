package rw.core;

import rw.api.Iface0027;
import rw.net.PacketBuf;
import rw.net.PacketHandlers;

public class C0109 implements PacketHandlers<Iface0027> {
   public Object[] f1000;

   public C0109(String var1) {
      this.m4000();
      this.f1000[0] = var1;
   }

   public C0109() {
      this.m4000();
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

   public void m10000(PacketBuf var1) {
      String var6 = var1.m10000();
      this.f1000[0] = var6;
   }

   public String m14000() {
      return (String)this.f1000[0];
   }

   public void m16000(Iface0027 var1) {
      var1.m22000(this);
   }

   public void m18000(PacketBuf var1) {
      var1.m70000((String)this.f1000[0]);
   }
}

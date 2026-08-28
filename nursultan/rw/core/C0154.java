package rw.core;

import rw.net.PacketListener;

public class C0154 implements PacketListener<Ilnorttr> {
   public Object[] f1000;

   private void m2000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[2];
         Object[] var1 = this.f1000;
      }
   }

   public C0154() {
      this.m2000();
      OlsIqOnqi var5 = new OlsIqOnqi();
      this.f1000[0] = var5;
      C0126 var6 = new C0126();
      this.f1000[1] = var6;
   }

   static {
      ntfClinit();
   }

   public void m14000(Ilnorttr var1) {
      ((OlsIqOnqi)this.f1000[0]).m6000(var1);
      ((C0126)this.f1000[1]).m4000(var1);
   }
}

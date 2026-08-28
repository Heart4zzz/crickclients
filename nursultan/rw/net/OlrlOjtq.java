package rw.net;

import io.netty.channel.Channel;

public class OlrlOjtq {
   public Object[] f1000;

   public boolean m2000() {
      return (boolean)((Channel)this.f1000[0] != null && ((Channel)this.f1000[0]).isActive() ? 1 : 0);
   }

   public OlrlOjtq() {
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

   public synchronized void m8000() {
      Object var5 = null;
      this.f1000[0] = var5;
   }

   public synchronized void m12000(Channel var1) {
      this.f1000[0] = var1;
   }

   public Channel m16000() {
      return (Channel)this.f1000[0];
   }
}

package rw.core;

import rw.NursultanClient;

public class C0965 {
   public Object[] f1000;

   public C0965() {
      this.m10000();
   }

   static {
      ntfClinit();
   }

   private void m10000() {
      this.f1000 = new Object[1];
      this.f1000[0] = 0;
   }

   public C0965 m14000(int var1) {
      Integer var6 = var1;
      this.f1000[0] = var6;
      return this;
   }

   public void m16000() {
      Integer var5 = NursultanClient.m74000().m10000();
      this.f1000[0] = var5;
   }

   public boolean m18000(int var1) {
      return (boolean)(this.f1000[0] + var1 <= NursultanClient.m74000().m10000() ? 1 : 0);
   }

   public int m20000() {
      return NursultanClient.m74000().m10000() - (Integer)this.f1000[0];
   }
}

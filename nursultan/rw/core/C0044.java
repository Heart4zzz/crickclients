package rw.core;

public class C0044 {
   public Object[] f1000;

   C0044() {
      this.m22000();
      Long var5 = System.currentTimeMillis();
      this.f1000[0] = var5;
   }

   static {
      ntfClinit();
   }

   public long m12000() {
      return System.currentTimeMillis() - (Long)this.f1000[0];
   }

   public boolean m18000(long var1) {
      return (boolean)(this.m12000() >= var1 ? 1 : 0);
   }

   public void m20000() {
      Long var5 = System.currentTimeMillis();
      this.f1000[0] = var5;
   }

   private void m22000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
         var1[0] = 0L;
      }
   }
}

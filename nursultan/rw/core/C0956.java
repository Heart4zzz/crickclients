package rw.core;

public class C0956 {
   public Object[] f1000;

   public C0956() {
      this.m8000();
      Long var5 = System.nanoTime();
      this.f1000[0] = var5;
      this.m18000();
   }

   static {
      ntfClinit();
   }

   private void m8000() {
      this.f1000 = new Object[1];
      this.f1000[0] = 0L;
   }

   public long m14000() {
      return (System.nanoTime() - (Long)this.f1000[0]) / 1000000L;
   }

   public void m18000() {
      Long var5 = System.nanoTime();
      this.f1000[0] = var5;
   }

   public boolean m20000(long var1) {
      return (boolean)(System.nanoTime() - this.f1000[0] >= var1 * 1000000L ? 1 : 0);
   }
}

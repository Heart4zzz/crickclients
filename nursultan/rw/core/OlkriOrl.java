package rw.core;

public class OlkriOrl {
   public Object[] f1000;

   private void m2000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
         var1[0] = 0;
      }
   }

   public OlkriOrl(int var1) {
      this.m2000();
      Integer var6 = var1;
      this.f1000[0] = var6;
   }

   static {
      ntfClinit();
   }

   public int m8000() {
      return (Integer)this.f1000[0];
   }
}

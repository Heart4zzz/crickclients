package rw.core;

public class C1158<T> {
   public Object[] f1000;

   public C1158(T var1) {
      this.m4000();
      this.f1000[0] = var1;
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

   public T m10000() {
      return (T)this.f1000[0];
   }

   public C1158<T> m12000(T var1) {
      this.f1000[0] = var1;
      return this;
   }
}

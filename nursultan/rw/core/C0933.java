package rw.core;

public class C0933 extends C1013 {
   public Object[] f1000;

   private void m2000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
         var1[0] = false;
      }
   }

   public C0933(String var1, boolean var2, boolean var3) {
      super(var1, var3);
      this.m2000();
      Boolean var8 = var2;
      this.f1000[0] = var8;
   }

   static {
      ntfClinit();
   }

   public boolean m2000() {
      this.m2000();
      return (Boolean)this.f1000[0];
   }
}

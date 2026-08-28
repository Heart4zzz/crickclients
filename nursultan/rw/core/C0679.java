package rw.core;

public class C0679 extends C1013 {
   public Object[] f1000;

   public C0679(String var1, boolean var2, C1227 var3) {
      super(var1, var2);
      this.m2000();
      this.f1000[0] = var3;
   }

   static {
      ntfClinit();
   }

   private void m2000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }
}

package rw.core;

public class C0728 extends C1013 {
   public Object[] f1000;

   private void m2000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
         var1[0] = 0;
      }
   }

   public C0728(String var1, boolean var2, int var3) {
      super(var1, var2);
      this.m2000();
      Integer var8 = var3;
      this.f1000[0] = var8;
   }

   static {
      ntfClinit();
   }
}

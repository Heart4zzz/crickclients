package rw.core;

public class IltOtprri extends C1013 {
   public Object[] f1000;

   private void m2000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
         var1[0] = 0;
      }
   }

   public IltOtprri(String var1, int var2, boolean var3) {
      super(var1, var3);
      this.m2000();
      Integer var8 = var2;
      this.f1000[0] = var8;
   }

   static {
      ntfClinit();
   }

   public int m2000() {
      this.m2000();
      return (Integer)this.f1000[0];
   }
}

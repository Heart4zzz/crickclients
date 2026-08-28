package rw.core;

import java.util.function.Supplier;

public class C0742 extends C1013 {
   public Object[] f1000;

   public C0742(String var1, Supplier<Integer> var2, boolean var3) {
      super(var1, var3);
      this.m2000();
      this.f1000[0] = var2;
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

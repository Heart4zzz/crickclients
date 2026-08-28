package rw.core;

import rw.Module;

public class C0934 extends Base0930 {
   public Object[] f1000;

   @SafeVarargs
   public C0934(String var1, boolean var2, Class<? extends Module>... var3) {
      super(var1, var2);
      this.m4000();
      this.f1000[0] = var3;
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

   public void m6000(Object var1) {
      this.m4000();

      for (Class var5 : (Class[])this.f1000[0]) {
         if (var5.isInstance(var1)) {
            ((Module)var1).m16000();
            return;
         }
      }
   }
}

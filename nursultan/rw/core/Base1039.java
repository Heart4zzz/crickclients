package rw.core;

import rw.gui.UseTracker;

public abstract class Base1039 extends Base1138 {
   public Object[] f1000;

   public Base1039(UseTracker var1, String var2, boolean var3) {
      super(var2, var3);
      this.m2000();
      this.f1000[0] = var1;
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

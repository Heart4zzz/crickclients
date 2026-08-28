package rw.core;

import rw.gui.Critical;

public abstract class OuFz extends Base1148<Critical> {
   public Object[] f1000;

   private void m2000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }

   public OuFz(Critical var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.m2000();
      this.f1000[0] = var1;
   }

   static {
      ntfClinit();
   }

   public void m12000(IlmmjsIlp var1) {
      this.m2000();
      ((Critical)this.f1000[0]).m50000(var1);
   }

   public int m14000() {
      this.m2000();
      return ((Critical)this.f1000[0]).m20000();
   }
}

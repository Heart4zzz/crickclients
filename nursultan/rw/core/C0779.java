package rw.core;

import rw.gui.AttackAura;

public class C0779 extends Base1138 {
   public Object[] f1000;

   public C0779(AttackAura var1, String var2, boolean var3, boolean var4) {
      super(var2, var3);
      this.m10000();
      this.f1000[0] = var1;
      Boolean var10 = var4;
      this.f1000[1] = var10;
   }

   static {
      ntfClinit();
   }

   public void m6000(Object var1) {
   }

   public boolean m8000() {
      this.m10000();
      return (Boolean)this.f1000[1];
   }

   private void m10000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[2];
         Object[] var1 = this.f1000;
         var1[1] = false;
      }
   }
}

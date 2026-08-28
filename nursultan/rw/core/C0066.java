package rw.core;

import rw.gui.AttackAura;

public class C0066 extends Base1138 {
   public Object[] f1000;

   public C0066(AttackAura var1, boolean var2, String var3, boolean var4) {
      super(var3, var4);
      this.m4000();
      this.f1000[0] = var1;
      Boolean var10 = var2;
      this.f1000[1] = var10;
   }

   static {
      ntfClinit();
   }

   private void m4000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[2];
         Object[] var1 = this.f1000;
         var1[1] = false;
      }
   }

   public void m6000(Object var1) {
   }

   public boolean m8000() {
      this.m4000();
      return (Boolean)this.f1000[1];
   }
}

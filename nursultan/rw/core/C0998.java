package rw.core;

import rw.data.Rec0312;

public class C0998 extends Base1014<Integer> {
   public Object[] f1000;

   public boolean m2000() {
      this.m4000();
      return (Boolean)this.f1000[1];
   }

   private void m4000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[2];
         Object[] var1 = this.f1000;
         var1[0] = false;
         var1[1] = false;
      }
   }

   public C0998(Rec0312 var1, int var2) {
      super(var1, var2);
      this.m4000();
      Boolean var7 = true;
      this.f1000[0] = var7;
   }

   static {
      ntfClinit();
   }

   public boolean m6000() {
      this.m4000();
      return (Boolean)this.f1000[0];
   }

   public C0998 m8000(boolean var1) {
      this.m4000();
      Boolean var6 = var1;
      this.f1000[1] = var6;
      return this;
   }

   public C0998 m10000(boolean var1) {
      this.m4000();
      Boolean var6 = var1;
      this.f1000[0] = var6;
      return this;
   }
}

package rw.core;

import rw.data.Rec0312;
import rw.gui.PgUp;
import rw.module.Huddumped;

public class C1006 extends Base1014<PgUp> {
   public Object[] f1000;

   public int m2000() {
      this.m8000();
      return (Integer)this.f1000[0];
   }

   public C1006(Rec0312 var1, PgUp var2) {
      super(var1, var2);
      this.m8000();
   }

   static {
      ntfClinit();
   }

   @Override
   public void m2000() {
      this.m8000();
      Integer var5 = 0;
      this.f1000[0] = var5;
      super.m6000();
   }

   public boolean m4000(Huddumped var1) {
      this.m8000();
      return var1.m38000((PgUp)this.i(), (Integer)this.f1000[0]);
   }

   public void m6000(PgUp var1, int var2) {
      this.m8000();
      Integer var7 = var2;
      this.f1000[0] = var7;
      this.N(var1);
   }

   private void m8000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
         var1[0] = 0;
      }
   }

   @Override
   public boolean c_() {
      this.m8000();
      return (boolean)(this.f1000[0] == 0 && !super.c_() ? 0 : 1);
   }
}

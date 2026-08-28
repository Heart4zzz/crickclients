package rw.core;

import KDFzREm.NNuU;
import rw.gui.ClickAction;
import rw.gui.PgUp;
import rw.module.Huddumped;

public abstract class Base0793 {
   public Object[] f1000;

   public Base0793(ClickAction var1, String var2) {
      this.m10000();
      NNuU var7 = NNuU.Nq();
      this.f1000[0] = var7;
      C1006 var8 = rw.setting.C0122.m14000(var1, var2, (PgUp)PgUp.f4000[0]);
      this.f1000[1] = var8;
   }

   static {
      ntfClinit();
   }

   public abstract void m8000(Huddumped var1);

   private void m10000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[2];
         Object[] var1 = this.f1000;
      }
   }

   public void m12000(Huddumped var1) {
      if (((C1006)this.f1000[1]).m4000(var1)) {
         this.m8000(var1);
      }
   }
}

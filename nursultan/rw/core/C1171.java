package rw.core;

import rw.api.Iface0195;
import rw.data.Ilnotljq;

public class C1171 implements Iface0195 {
   public Object[] f1000;

   public C1171(int var1, int var2, Ilnotljq var3) {
      this.m8000();
      rw.setting.C0153 var8 = new rw.setting.C0153(C0248.m20000(var1), C0248.m20000(var2), var3);
      this.f1000[0] = var8;
      rw.setting.C0153 var9 = new rw.setting.C0153(C0248.m8000(var1), C0248.m8000(var2), var3);
      this.f1000[1] = var9;
      rw.setting.C0153 var10 = new rw.setting.C0153(C0248.m2000(var1), C0248.m2000(var2), var3);
      this.f1000[2] = var10;
      rw.setting.C0153 var11 = new rw.setting.C0153(C0248.m6000(var1), C0248.m6000(var2), var3);
      this.f1000[3] = var11;
   }

   static {
      ntfClinit();
   }

   private void m8000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[4];
         Object[] var1 = this.f1000;
      }
   }

   public boolean m10000() {
      return (boolean)(((rw.setting.C0153)this.f1000[0]).m26000()
            && ((rw.setting.C0153)this.f1000[1]).m26000()
            && ((rw.setting.C0153)this.f1000[2]).m26000()
            && ((rw.setting.C0153)this.f1000[3]).m26000()
         ? 1
         : 0);
   }

   public boolean m14000(rw.setting.C0027 var1) {
      int var2 = var1.m2000();
      ((rw.setting.C0153)this.f1000[0]).m30000(C0248.m20000(var2));
      ((rw.setting.C0153)this.f1000[1]).m30000(C0248.m8000(var2));
      ((rw.setting.C0153)this.f1000[2]).m30000(C0248.m2000(var2));
      ((rw.setting.C0153)this.f1000[3]).m30000(C0248.m6000(var2));
      return (boolean)1;
   }

   public boolean m18000(float var1) {
      boolean var2 = ((rw.setting.C0153)this.f1000[0]).m36000(var1);
      var2 |= ((rw.setting.C0153)this.f1000[1]).m36000(var1);
      var2 |= ((rw.setting.C0153)this.f1000[2]).m36000(var1);
      return var2 | ((rw.setting.C0153)this.f1000[3]).m36000(var1);
   }

   public rw.setting.C0027 m20000() {
      return rw.setting.C0027.m16000(
         C0248.m18000(
            Math.round(((rw.setting.C0153)this.f1000[1]).m4000()),
            Math.round(((rw.setting.C0153)this.f1000[2]).m4000()),
            Math.round(((rw.setting.C0153)this.f1000[3]).m4000()),
            Math.round(((rw.setting.C0153)this.f1000[0]).m4000())
         )
      );
   }
}

package rw.setting;

import java.util.Objects;
import rw.api.Iface0195;
import rw.data.Ilnotljq;
import rw.data.Rec0066;

public class C0133 implements Iface0195 {
   public Object[] f1000;
   private static String[] f2000;

   private void m4000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[2];
         Object[] var1 = this.f1000;
      }
   }

   public C0133(Rec0066 var1, Rec0066 var2, Ilnotljq var3) {
      this.m4000();
      Objects.requireNonNull(var3, f2000[0]);
      C0153 var8 = new C0153(var1.m10000(), var2.m10000(), var3);
      this.f1000[0] = var8;
      C0153 var9 = new C0153(var1.m4000(), var2.m4000(), var3);
      this.f1000[1] = var9;
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      f2000 = new String[]{"spec"};
   }

   public boolean m16000() {
      return (boolean)(((C0153)this.f1000[0]).m26000() && ((C0153)this.f1000[1]).m26000() ? 1 : 0);
   }

   public boolean m20000(float var1) {
      boolean var2 = ((C0153)this.f1000[0]).m36000(var1);
      boolean var3 = ((C0153)this.f1000[1]).m36000(var1);
      return (boolean)(!var2 && !var3 ? 0 : 1);
   }

   public boolean m22000(C0027 var1) {
      Rec0066 var2 = var1.m6000();
      boolean var3 = ((C0153)this.f1000[0]).m30000(var2.m10000());
      boolean var4 = ((C0153)this.f1000[1]).m30000(var2.m4000());
      return (boolean)(!var3 && !var4 ? 0 : 1);
   }

   public C0027 m26000() {
      return C0027.m12000(Rec0066.m14000(((C0153)this.f1000[0]).m4000(), ((C0153)this.f1000[1]).m4000()));
   }
}

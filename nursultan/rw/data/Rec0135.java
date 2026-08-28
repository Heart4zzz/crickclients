package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.api.Iface0221;
import rw.setting.C0059;
import rw.setting.C0062;

record Rec0135() implements Iface0221 {
   private final C0062 f1000;

   @Override
   public String m2000(C0059 var1) {
      return this.f1000.m20000(var1).f9000;
   }

   Rec0135(C0062 var1) {
      this.f1000 = var1;
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0135,"run",Rec0135::f1000>(this, var1);
   }

   @Override
   public float m6000(C0059 var1) {
      return this.f1000.m20000(var1).f2000;
   }

   public C0062 m8000() {
      return this.f1000;
   }

   public float m10000(C0059 var1) {
      return this.f1000.m20000(var1).f1000;
   }
}

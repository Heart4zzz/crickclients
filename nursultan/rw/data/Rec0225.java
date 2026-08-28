package rw.data;

import KDFzREm.NQo;
import java.lang.runtime.ObjectMethods;

public record Rec0225() {
   public int f1000;
   public NQo f2000;

   Rec0225(int var1, NQo var2) {
      this.f1000 = var1;
      this.f2000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0225,"startTick;itemStack",Rec0225::f1000,Rec0225::f2000>(this, var1);
   }

   public int m4000() {
      return this.f1000;
   }

   public NQo m6000() {
      return this.f2000;
   }
}

package rw.data;

import KDFzREm.NAC;
import java.lang.runtime.ObjectMethods;

public record Rec0189() {
   public long f1000;
   public NAC<?> f2000;

   Rec0189(NAC<?> var1, long var2) {
      this.f2000 = var1;
      this.f1000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0189,"packet;time",Rec0189::f2000,Rec0189::f1000>(this, var1);
   }

   public NAC<?> m4000() {
      return this.f2000;
   }

   public long m6000() {
      return this.f1000;
   }
}

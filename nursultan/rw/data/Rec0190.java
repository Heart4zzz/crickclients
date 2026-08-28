package rw.data;

import KDFzREm.NAC;
import java.lang.runtime.ObjectMethods;

public record Rec0190() {
   public NAC<?> f1000;
   public long f2000;

   Rec0190(NAC<?> var1, long var2) {
      this.f1000 = var1;
      this.f2000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0190,"packet;timestamp",Rec0190::f1000,Rec0190::f2000>(this, var1);
   }

   public NAC<?> m4000() {
      return this.f1000;
   }

   public long m6000() {
      return this.f2000;
   }
}

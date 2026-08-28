package rw.data;

import KDFzREm.NQo;
import java.lang.runtime.ObjectMethods;

public record Rec0208() {
   public int f1000;
   public NQo f2000;

   public Rec0208(NQo var1, int var2) {
      this.f2000 = var1;
      this.f1000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0208,"itemStack;index",Rec0208::f2000,Rec0208::f1000>(this, var1);
   }

   public int m4000() {
      return this.f1000;
   }

   public NQo m6000() {
      return this.f2000;
   }
}

package rw.data;

import KDFzREm.NQo;
import java.lang.runtime.ObjectMethods;

public record Rec0192() {
   public NQo f1000;
   public long f2000;
   public String f3000;

   public String m2000() {
      return this.f3000;
   }

   Rec0192(NQo var1, String var2, long var3) {
      this.f1000 = var1;
      this.f3000 = var2;
      this.f2000 = var3;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0192,"itemStack;seller;price",Rec0192::f1000,Rec0192::f3000,Rec0192::f2000>(this, var1);
   }

   public NQo m6000() {
      return this.f1000;
   }

   public long m8000() {
      return this.f2000;
   }
}

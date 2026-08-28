package rw.data;

import KDFzREm.NAN;
import java.lang.runtime.ObjectMethods;

public record Rec0218() {
   public String f1000;
   public NAN f2000;

   Rec0218(String var1, NAN var2) {
      this.f1000 = var1;
      this.f2000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0218,"keyLower;replacement",Rec0218::f1000,Rec0218::f2000>(this, var1);
   }

   public NAN m4000() {
      return this.f2000;
   }

   public String m6000() {
      return this.f1000;
   }
}

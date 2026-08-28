package rw.data;

import KDFzREm.NNEY;
import java.lang.runtime.ObjectMethods;

public record Rec0065() {
   final NNEY f1000;
   private final String f2000;

   public Rec0065(NNEY var1, String var2) {
      this.f1000 = var1;
      this.f2000 = var2;
   }

   public final boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0065,"entry;source",Rec0065::f1000,Rec0065::f2000>(this, var1);
   }

   @Override
   public String toString() {
      return this.f1000 + " (from " + this.f2000 + ")";
   }

   public String m4000() {
      return this.f2000;
   }

   public NNEY m6000() {
      return this.f1000;
   }
}

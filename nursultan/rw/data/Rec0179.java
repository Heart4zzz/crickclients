package rw.data;

import KDFzREm.NAC;
import java.lang.runtime.ObjectMethods;

public record Rec0179() {
   public NAC<?> f1000;

   public Rec0179(NAC<?> var1) {
      this.f1000 = var1;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0179,"packet",Rec0179::f1000>(this, var1);
   }

   public NAC<?> m4000() {
      return this.f1000;
   }
}

package rw.data;

import KDFzREm.NCa;
import KDFzREm.Ned;
import java.lang.runtime.ObjectMethods;

public record IlsImt() {
   public Ned f1000;
   public NCa f2000;

   public IlsImt(Ned var1, NCa var2) {
      this.f1000 = var1;
      this.f2000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",IlsImt,"pos;blockState",IlsImt::f1000,IlsImt::f2000>(this, var1);
   }

   public NCa m4000() {
      return this.f2000;
   }

   public Ned m6000() {
      return this.f1000;
   }
}

package rw.data;

import KDFzREm.NAN;
import KDFzREm.NVk;
import KDFzREm.Nog;
import java.lang.runtime.ObjectMethods;

public record IlsIijm() {
   public int f1000;
   public int f2000;
   public NVk f3000;

   public NVk m2000() {
      return this.f3000;
   }

   public IlsIijm(int var1, int var2, NVk var3) {
      this.f2000 = var1;
      this.f1000 = var2;
      this.f3000 = var3;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",IlsIijm,"start;end;selector",IlsIijm::f2000,IlsIijm::f1000,IlsIijm::f3000>(this, var1);
   }

   public int m6000() {
      return this.f2000;
   }

   public int m8000() {
      return this.f1000;
   }

   public NAN m10000(Nog var1) {
      return NAN.y(var1.toString());
   }
}

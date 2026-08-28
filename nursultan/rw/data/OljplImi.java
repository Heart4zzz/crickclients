package rw.data;

import KDFzREm.NNuU;
import java.lang.runtime.ObjectMethods;
import rw.api.Iface0673;

public record OljplImi() implements Iface0673 {
   public Runnable f1000;

   public OljplImi(Runnable var1) {
      this.f1000 = var1;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",OljplImi,"runnable",OljplImi::f1000>(this, var1);
   }

   public void m4000(NNuU var1) {
      this.f1000.run();
   }

   public Runnable m8000() {
      return this.f1000;
   }
}

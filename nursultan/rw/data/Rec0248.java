package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.core.Noqodls;

public record Rec0248() {
   public Noqodls f1000;

   public Rec0248(Noqodls var1) {
      this.f1000 = var1;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0248,"account",Rec0248::f1000>(this, var1);
   }

   public Noqodls m4000() {
      return this.f1000;
   }
}

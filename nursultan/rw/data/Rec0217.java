package rw.data;

import java.lang.runtime.ObjectMethods;

public record Rec0217() {
   public String f1000;

   public Rec0217(String var1) {
      this.f1000 = var1;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0217,"packet",Rec0217::f1000>(this, var1);
   }

   public String m4000() {
      return this.f1000;
   }
}

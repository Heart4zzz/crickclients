package rw.data;

import java.lang.runtime.ObjectMethods;

public record Rec0193() {
   public int f1000;
   public String f2000;

   Rec0193(String var1, int var2) {
      this.f2000 = var1;
      this.f1000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0193,"seller;hash",Rec0193::f2000,Rec0193::f1000>(this, var1);
   }

   public int m4000() {
      return this.f1000;
   }

   public String m6000() {
      return this.f2000;
   }
}

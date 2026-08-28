package rw.data;

import java.lang.runtime.ObjectMethods;

public record Rec0173() {
   public String f1000;
   public String f2000;

   public Rec0173(String var1, String var2) {
      this.f1000 = var1;
      this.f2000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0173,"access;refresh",Rec0173::f1000,Rec0173::f2000>(this, var1);
   }

   public String m4000() {
      return this.f2000;
   }

   public String m6000() {
      return this.f1000;
   }
}

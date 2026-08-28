package rw.data;

import java.lang.runtime.ObjectMethods;

public record Rec0277() {
   public Runnable f1000;
   public Rec0312 f2000;

   public Rec0277(Rec0312 var1, Runnable var2) {
      this.f2000 = var1;
      this.f1000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0277,"key;onClick",Rec0277::f2000,Rec0277::f1000>(this, var1);
   }

   public Rec0312 m4000() {
      return this.f2000;
   }

   public Runnable m6000() {
      return this.f1000;
   }
}

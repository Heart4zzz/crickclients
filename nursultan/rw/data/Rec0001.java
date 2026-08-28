package rw.data;

import java.lang.runtime.ObjectMethods;

public record Rec0001() {
   public int f1000;
   public int f2000;

   Rec0001(int var1, int var2) {
      this.f1000 = var1;
      this.f2000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0001,"width;height",Rec0001::f1000,Rec0001::f2000>(this, var1);
   }

   public int m4000() {
      return this.f2000;
   }

   public int m6000() {
      return this.f1000;
   }
}

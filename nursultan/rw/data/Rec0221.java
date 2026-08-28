package rw.data;

import java.lang.runtime.ObjectMethods;

public record Rec0221() {
   public int f1000;
   public int f2000;

   Rec0221(int var1, int var2) {
      this.f1000 = var1;
      this.f2000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0221,"start;end",Rec0221::f1000,Rec0221::f2000>(this, var1);
   }

   public int m4000() {
      return this.f1000;
   }

   public int m6000() {
      return this.f2000;
   }
}

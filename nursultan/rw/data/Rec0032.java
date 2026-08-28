package rw.data;

import java.lang.runtime.ObjectMethods;

public record Rec0032() {
   public int f1000;
   public String f2000;

   Rec0032(String var1, int var2) {
      this.f2000 = var1;
      this.f1000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0032,"entryKey;days",Rec0032::f2000,Rec0032::f1000>(this, var1);
   }

   public int m4000() {
      return this.f1000;
   }

   public String m6000() {
      return this.f2000;
   }
}

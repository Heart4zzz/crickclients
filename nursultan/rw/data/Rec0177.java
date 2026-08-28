package rw.data;

import java.lang.runtime.ObjectMethods;

public record Rec0177() {
   public String f1000;
   public int f2000;

   Rec0177(String var1, int var2) {
      this.f1000 = var1;
      this.f2000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0177,"command;tick",Rec0177::f1000,Rec0177::f2000>(this, var1);
   }

   public int m4000() {
      return this.f2000;
   }

   public String m6000() {
      return this.f1000;
   }
}

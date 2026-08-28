package rw.data;

import java.lang.runtime.ObjectMethods;

public record Rec0059() {
   public int f1000;
   public int f2000;
   public String f3000;

   public String m2000() {
      return this.f3000;
   }

   Rec0059(String var1, int var2, int var3) {
      this.f3000 = var1;
      this.f2000 = var2;
      this.f1000 = var3;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0059,"name;type;size",Rec0059::f3000,Rec0059::f2000,Rec0059::f1000>(this, var1);
   }

   public int m6000() {
      return this.f1000;
   }

   public int m8000() {
      return this.f2000;
   }
}

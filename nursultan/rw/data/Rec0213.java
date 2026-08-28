package rw.data;

import java.lang.runtime.ObjectMethods;

public record Rec0213() {
   public String f1000;

   public Rec0213(String var1) {
      this.f1000 = var1;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0213,"packet",Rec0213::f1000>(this, var1);
   }

   public String m4000() {
      return this.f1000;
   }
}

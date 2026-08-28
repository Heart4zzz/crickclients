package rw.data;

import java.lang.runtime.ObjectMethods;

public record Rec0007() {
   public Rec0003 f1000;
   public Rec0003 f2000;
   public String f3000;

   public Rec0003 m2000() {
      return this.f2000;
   }

   public Rec0007(Rec0003 var1, Rec0003 var2, String var3) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0007,"color;depth;label",Rec0007::f1000,Rec0007::f2000,Rec0007::f3000>(this, var1);
   }

   public Rec0003 m6000() {
      return this.f1000;
   }

   public String m8000() {
      return this.f3000;
   }
}

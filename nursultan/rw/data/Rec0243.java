package rw.data;

import java.lang.runtime.ObjectMethods;

public record Rec0243() {
   public String f1000;
   public String f2000;
   public String f3000;

   public String m2000() {
      return this.f1000;
   }

   Rec0243(String var1, String var2, String var3) {
      this.f2000 = var1;
      this.f3000 = var2;
      this.f1000 = var3;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0243,"token;hash;xuid",Rec0243::f2000,Rec0243::f3000,Rec0243::f1000>(this, var1);
   }

   public String m6000() {
      return this.f2000;
   }

   public String m8000() {
      return this.f3000;
   }
}

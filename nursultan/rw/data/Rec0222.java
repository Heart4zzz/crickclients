package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.defs.Enum0004;

public record Rec0222() {
   public String f1000;
   public Enum0004 f2000;

   public Rec0222(Enum0004 var1, String var2) {
      this.f2000 = var1;
      this.f1000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0222,"phase;localeKey",Rec0222::f2000,Rec0222::f1000>(this, var1);
   }

   public String m4000() {
      return this.f1000;
   }

   public Enum0004 m6000() {
      return this.f2000;
   }
}

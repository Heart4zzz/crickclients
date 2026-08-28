package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.defs.Enum0002;

public record Rec0034() {
   public Enum0002 f1000;
   public String f2000;

   Rec0034(String var1, Enum0002 var2) {
      this.f2000 = var1;
      this.f1000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0034,"entryKey;type",Rec0034::f2000,Rec0034::f1000>(this, var1);
   }

   public Enum0002 m4000() {
      return this.f1000;
   }

   public String m6000() {
      return this.f2000;
   }
}

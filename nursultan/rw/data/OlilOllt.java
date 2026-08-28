package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.defs.Enum0086;

public record OlilOllt() {
   public Enum0086 f1000;
   public String f2000;

   public OlilOllt(String var1, Enum0086 var2) {
      this.f2000 = var1;
      this.f1000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",OlilOllt,"query;category",OlilOllt::f2000,OlilOllt::f1000>(this, var1);
   }

   public Enum0086 m4000() {
      return this.f1000;
   }

   public String m6000() {
      return this.f2000;
   }
}

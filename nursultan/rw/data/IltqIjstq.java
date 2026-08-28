package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.defs.Enum0085;

public record IltqIjstq() {
   public String f1000;
   public Enum0085 f2000;
   public String f3000;

   public String m2000() {
      return this.f1000;
   }

   public IltqIjstq(Enum0085 var1, String var2, String var3) {
      this.f2000 = var1;
      this.f3000 = var2;
      this.f1000 = var3;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",IltqIjstq,"phase;localeKey;detail",IltqIjstq::f2000,IltqIjstq::f3000,IltqIjstq::f1000>(this, var1);
   }

   public Enum0085 m6000() {
      return this.f2000;
   }

   public String m8000() {
      return this.f3000;
   }
}

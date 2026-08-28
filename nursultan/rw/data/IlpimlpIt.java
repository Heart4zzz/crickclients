package rw.data;

import java.lang.runtime.ObjectMethods;
import java.util.function.Consumer;

public record IlpimlpIt() {
   public Consumer<Boolean> f1000;
   public boolean f2000;

   public IlpimlpIt(boolean var1, Consumer<Boolean> var2) {
      this.f2000 = var1;
      this.f1000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",IlpimlpIt,"checked;onChange",IlpimlpIt::f2000,IlpimlpIt::f1000>(this, var1);
   }

   public Consumer<Boolean> m4000() {
      return this.f1000;
   }

   public boolean m6000() {
      return this.f2000;
   }
}

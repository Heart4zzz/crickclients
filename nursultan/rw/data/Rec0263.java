package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.api.Iface0196;
import rw.core.Base1014;

public record Rec0263() {
   public Base1014<?> f1000;
   public Iface0196<Void> f2000;

   public Rec0263(Base1014<?> var1, Iface0196<Void> var2) {
      this.f1000 = var1;
      this.f2000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0263,"setting;updater",Rec0263::f1000,Rec0263::f2000>(this, var1);
   }

   public Base1014<?> m4000() {
      return this.f1000;
   }

   public Iface0196<Void> m6000() {
      return this.f2000;
   }
}

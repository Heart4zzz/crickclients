package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.api.Iface0196;
import rw.core.Base0995;

public record Rec0272() {
   public Iface0196<Boolean> f1000;
   public Base0995 f2000;

   public Rec0272(Base0995 var1, Iface0196<Boolean> var2) {
      this.f2000 = var1;
      this.f1000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0272,"settingRegistrable;opened",Rec0272::f2000,Rec0272::f1000>(this, var1);
   }

   public Base0995 m4000() {
      return this.f2000;
   }

   public Iface0196<Boolean> m6000() {
      return this.f1000;
   }
}

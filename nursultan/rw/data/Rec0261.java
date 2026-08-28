package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.api.Iface0196;
import rw.defs.Enum0086;

public record Rec0261() {
   public String f1000;
   public String f2000;
   public Iface0196<Enum0086> f3000;
   public Enum0086 f4000;

   public String m2000() {
      return this.f2000;
   }

   public Rec0261(String var1, String var2, Enum0086 var3, Iface0196<Enum0086> var4) {
      this.f2000 = var1;
      this.f1000 = var2;
      this.f4000 = var3;
      this.f3000 = var4;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0261,"key;icon;menuCategory;state",Rec0261::f2000,Rec0261::f1000,Rec0261::f4000,Rec0261::f3000>(this, var1);
   }

   public String m6000() {
      return this.f1000;
   }

   public Iface0196<Enum0086> m8000() {
      return this.f3000;
   }

   public Enum0086 m10000() {
      return this.f4000;
   }
}

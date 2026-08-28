package rw.data;

import java.lang.runtime.ObjectMethods;
import java.util.function.Consumer;
import java.util.regex.Pattern;
import rw.api.Iface0196;

public record Rec0268() {
   public Pattern f1000;
   public Consumer<String> f2000;
   public Iface0196<Boolean> f3000;
   public String f4000;
   public String f5000;

   public Iface0196<Boolean> m2000() {
      return this.f3000;
   }

   public Rec0268(String var1, String var2, Pattern var3, Consumer<String> var4, Iface0196<Boolean> var5) {
      this.f5000 = var1;
      this.f4000 = var2;
      this.f1000 = var3;
      this.f2000 = var4;
      this.f3000 = var5;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0268,"placeholderKey;value;regex;onChange;focused",Rec0268::f5000,Rec0268::f4000,Rec0268::f1000,Rec0268::f2000,Rec0268::f3000>(
         this, var1
      );
   }

   public String m6000() {
      return this.f4000;
   }

   public String m8000() {
      return this.f5000;
   }

   public Pattern m10000() {
      return this.f1000;
   }

   public Consumer<String> m12000() {
      return this.f2000;
   }
}

package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.api.Iface0645;

public record Rec0254() {
   public Iface0645 f1000;
   public String f2000;

   Rec0254(String var1, Iface0645 var2) {
      this.f2000 = var1;
      this.f1000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0254,"packagePrefix;factory",Rec0254::f2000,Rec0254::f1000>(this, var1);
   }

   public String m4000() {
      return this.f2000;
   }

   public Iface0645 m6000() {
      return this.f1000;
   }
}

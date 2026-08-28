package rw.data;

import java.lang.runtime.ObjectMethods;
import java.util.List;
import rw.api.Iface0196;
import rw.defs.Enum0059;
import rw.setting.C0156;

public record Rec0269() {
   public List<C0156> f1000;
   public Iface0196<Boolean> f2000;
   public Enum0059 f3000;

   public Iface0196<Boolean> m2000() {
      return this.f2000;
   }

   public Rec0269(Iface0196<Boolean> var1, Enum0059 var2, List<C0156> var3) {
      this.f2000 = var1;
      this.f3000 = var2;
      this.f1000 = var3;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0269,"expanded;category;items",Rec0269::f2000,Rec0269::f3000,Rec0269::f1000>(this, var1);
   }

   public Enum0059 m6000() {
      return this.f3000;
   }

   public List<C0156> m8000() {
      return this.f1000;
   }
}

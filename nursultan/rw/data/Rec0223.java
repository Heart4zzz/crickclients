package rw.data;

import java.lang.runtime.ObjectMethods;
import java.util.List;

public record Rec0223() {
   public int f1000;
   public Object f2000;
   public List<String> f3000;

   public int m2000() {
      return this.f1000;
   }

   public Rec0223(List<String> var1, Object var2, int var3) {
      this.f3000 = var1;
      this.f2000 = var2;
      this.f1000 = var3;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0223,"breadcrumbs;target;score",Rec0223::f3000,Rec0223::f2000,Rec0223::f1000>(this, var1);
   }

   public List<String> m6000() {
      return this.f3000;
   }

   public Object m8000() {
      return this.f2000;
   }
}

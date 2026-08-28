package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.core.C1112;

public record IlltikIi() {
   public int f1000;
   public C1112 f2000;
   public Rec0232 f3000;

   public C1112 m2000() {
      return this.f2000;
   }

   IlltikIi(C1112 var1, int var2, Rec0232 var3) {
      this.f2000 = var1;
      this.f1000 = var2;
      this.f3000 = var3;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",IlltikIi,"atlas;textureIdSnapshot;texture",IlltikIi::f2000,IlltikIi::f1000,IlltikIi::f3000>(this, var1);
   }

   public int m6000() {
      return this.f1000;
   }

   public Rec0232 m8000() {
      return this.f3000;
   }
}

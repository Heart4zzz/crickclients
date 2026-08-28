package rw.data;

import KDFzREm.NXi;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;

public record Rec0202() {
   public List<NXi> f1000;
   public Optional<Rec0199> f2000;

   public Rec0202(List<NXi> var1, Optional<Rec0199> var2) {
      this.f1000 = var1;
      this.f2000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0202,"trajectory;landPoint",Rec0202::f1000,Rec0202::f2000>(this, var1);
   }

   public List<NXi> m4000() {
      return this.f1000;
   }

   public Optional<Rec0199> m6000() {
      return this.f2000;
   }
}

package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.defs.Nuker;

public record IlsOnqsqi() {
   public Nuker f1000;

   public IlsOnqsqi(Nuker var1) {
      this.f1000 = var1;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",IlsOnqsqi,"kind",IlsOnqsqi::f1000>(this, var1);
   }

   public static IlsOnqsqi m4000(Nuker var0) {
      return new IlsOnqsqi(var0);
   }

   public Nuker m6000() {
      return this.f1000;
   }
}

package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.defs.Enum0067;
import rw.defs.Nuker;

public record Rec0206() {
   public Nuker f1000;
   public Enum0067 f2000;

   public Nuker m2000() {
      return this.f1000;
   }

   public Rec0206(Enum0067 var1, Nuker var2) {
      this.f2000 = var1;
      this.f1000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0206,"kind;configKind",Rec0206::f2000,Rec0206::f1000>(this, var1);
   }

   public Enum0067 m8000() {
      return this.f2000;
   }

   public static Rec0206 m10000(Nuker var0) {
      return new Rec0206((Enum0067)Enum0067.f1000[2], var0);
   }

   public static Rec0206 m14000(Nuker var0) {
      return new Rec0206((Enum0067)Enum0067.f1000[1], var0);
   }

   public static Rec0206 m16000() {
      return new Rec0206((Enum0067)Enum0067.f1000[0], null);
   }
}

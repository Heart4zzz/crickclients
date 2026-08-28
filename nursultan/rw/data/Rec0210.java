package rw.data;

import java.lang.runtime.ObjectMethods;
import java.util.UUID;
import rw.defs.RenameX;

public record Rec0210() {
   public UUID f1000;
   public RenameX f2000;

   public static Rec0210 m4000(UUID var0) {
      return new Rec0210((RenameX)RenameX.f2000[1], var0);
   }

   public Rec0210(RenameX var1, UUID var2) {
      this.f2000 = var1;
      this.f1000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m6000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0210,"kind;clientId",Rec0210::f2000,Rec0210::f1000>(this, var1);
   }

   public static Rec0210 m8000(UUID var0) {
      return new Rec0210((RenameX)RenameX.f2000[3], var0);
   }

   public static Rec0210 m10000(UUID var0) {
      return new Rec0210((RenameX)RenameX.f2000[4], var0);
   }

   public RenameX m12000() {
      return this.f2000;
   }

   public static Rec0210 m14000(UUID var0) {
      return new Rec0210((RenameX)RenameX.f2000[0], var0);
   }

   public static Rec0210 m18000(UUID var0) {
      return new Rec0210((RenameX)RenameX.f2000[2], var0);
   }

   public UUID m20000() {
      return this.f1000;
   }
}

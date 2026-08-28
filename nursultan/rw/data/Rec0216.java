package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.core.C0073;
import rw.defs.Enum0073;

public record Rec0216() {
   public Enum0073 f1000;
   public C0073 f2000;

   public Rec0216(C0073 var1, Enum0073 var2) {
      this.f2000 = var1;
      this.f1000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0216,"bind;change",Rec0216::f2000,Rec0216::f1000>(this, var1);
   }

   public C0073 m4000() {
      return this.f2000;
   }

   public static Rec0216 m6000(C0073 var0, Enum0073 var1) {
      return new Rec0216(var0, var1);
   }

   public Enum0073 m8000() {
      return this.f1000;
   }
}

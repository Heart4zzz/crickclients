package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.defs.Enum0086;

public record Rec0037() {
   public int f1000;
   public Enum0086 f2000;
   public int f3000;
   public boolean f4000;
   public Enum0086 f5000;

   public Enum0086 m2000() {
      return this.f2000;
   }

   private Rec0037(Enum0086 var1, Enum0086 var2, int var3, int var4, boolean var5) {
      this.f5000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
      this.f1000 = var4;
      this.f4000 = var5;
   }

   static {
      ntfClinit();
   }

   public boolean m6000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0037,"displayed;previous;direction;generation;active",Rec0037::f5000,Rec0037::f2000,Rec0037::f3000,Rec0037::f1000,Rec0037::f4000>(
         this, var1
      );
   }

   boolean m8000() {
      return (boolean)(this.f4000 && this.f2000 != null ? 1 : 0);
   }

   public boolean m10000() {
      return this.f4000;
   }

   public int m12000() {
      return this.f3000;
   }

   static Rec0037 m14000(Enum0086 var0) {
      return new Rec0037(var0, null, 0, 0, false);
   }

   public Enum0086 m16000() {
      return this.f5000;
   }

   Rec0037 m20000(Enum0086 var1) {
      return var1 == this.f5000 ? this : new Rec0037(var1, this.f5000, Integer.signum(var1.ordinal() - this.f5000.ordinal()), this.f1000 + 1, true);
   }

   public int m22000() {
      return this.f1000;
   }

   Rec0037 m24000() {
      return !this.f4000 && this.f2000 == null ? this : new Rec0037(this.f5000, null, this.f3000, this.f1000, false);
   }
}

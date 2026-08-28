package rw.setting;

import java.util.Objects;
import rw.data.Rec0066;
import rw.data.Rec0125;
import rw.defs.Enum0022;

public final class C0027 {
   private final Enum0022 f1000;
   private final Object f2000;

   public int m2000() {
      this.m18000(Enum0022.f2000);
      return (Integer)this.f2000;
   }

   private C0027(Enum0022 var1, Object var2) {
      this.f1000 = Objects.requireNonNull(var1, "kind");
      this.f2000 = Objects.requireNonNull(var2, "value");
   }

   public boolean m4000(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof C0027 var2) ? false : this.f1000 == var2.f1000 && this.f2000.equals(var2.f2000);
      }
   }

   @Override
   public String toString() {
      return "TransitionValue[kind=" + this.f1000 + ", value=" + this.f2000 + "]";
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.f1000, this.f2000);
   }

   public Rec0066 m6000() {
      this.m18000(Enum0022.f4000);
      return (Rec0066)this.f2000;
   }

   public Rec0125 m8000() {
      this.m18000(Enum0022.f3000);
      return (Rec0125)this.f2000;
   }

   public float m10000() {
      this.m18000(Enum0022.f1000);
      return (Float)this.f2000;
   }

   public static C0027 m12000(Rec0066 var0) {
      return new C0027(Enum0022.f4000, Objects.requireNonNull(var0, "value"));
   }

   public static C0027 m14000(Rec0125 var0) {
      return new C0027(Enum0022.f3000, Objects.requireNonNull(var0, "value"));
   }

   public static C0027 m16000(int var0) {
      return new C0027(Enum0022.f2000, var0);
   }

   private void m18000(Enum0022 var1) {
      if (this.f1000 != var1) {
         throw new IllegalStateException("Expected " + var1 + " transition value, got " + this.f1000);
      }
   }

   public Enum0022 m20000() {
      return this.f1000;
   }

   public static C0027 m22000(float var0) {
      return new C0027(Enum0022.f1000, var0);
   }
}

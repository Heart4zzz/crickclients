package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.defs.Enum0068;

public record Rec0209() {
   public long f1000;
   public long f2000;
   public Enum0068 f3000;
   public static Object[] f4000;

   public static Rec0209 m2000() {
      return (Rec0209)ll0q0mrjj<"shefrmex",100016154,-559854492,-559854495,-559854494,100016154,100016154,100016154>()[0];
   }

   public Rec0209(Enum0068 var1, long var2, long var4) {
      this.f3000 = var1;
      this.f2000 = var2;
      this.f1000 = var4;
   }

   static {
      ntfClinit();
   }

   public boolean m8000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0209,"phase;presetId;generation",Rec0209::f3000,Rec0209::f2000,Rec0209::f1000>(this, var1);
   }

   public long m14000() {
      return this.f2000;
   }

   public long m20000() {
      return this.f1000;
   }

   public Enum0068 m22000() {
      return this.f3000;
   }

   private static void m28000() {
      f4000 = new Object[]{null};
   }
}

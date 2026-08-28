package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.defs.Enum0069;

public record Rec0211() {
   public long f1000;
   public int f2000;
   public Enum0069 f3000;
   public long f4000;

   public int m4000() {
      return this.f2000;
   }

   public Rec0211(Enum0069 var1, long var2, long var4, int var6) {
      this.f3000 = var1;
      this.f4000 = var2;
      this.f1000 = var4;
      this.f2000 = var6;
   }

   static {
      ntfClinit();
   }

   public boolean m10000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0211,"kind;presetId;expiresAtMillis;activationLimit",Rec0211::f3000,Rec0211::f4000,Rec0211::f1000,Rec0211::f2000>(
         this, var1
      );
   }

   public long m14000() {
      return this.f4000;
   }

   public long m16000() {
      return this.f1000;
   }

   public static Rec0211 m20000(long var0) {
      return new Rec0211((Enum0069)Enum0069.f1000[3], var0, 0L, 0);
   }

   public static Rec0211 m22000() {
      return new Rec0211((Enum0069)Enum0069.f1000[0], 0L, 0L, 0);
   }

   public Enum0069 m24000() {
      return this.f3000;
   }

   public static Rec0211 m26000(long var0) {
      return new Rec0211((Enum0069)Enum0069.f1000[2], var0, 0L, 0);
   }

   public static Rec0211 m30000(long var0, long var2, int var4) {
      return new Rec0211((Enum0069)Enum0069.f1000[1], var0, var2, var4);
   }
}

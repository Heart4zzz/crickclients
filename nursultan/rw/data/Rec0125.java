package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.core.C0259;
import rw.core.C0365;
import rw.defs.Enum0039;

public record Rec0125() {
   private final Enum0039 f1000;
   private final float f2000;
   private final float f3000;
   private final float f4000;
   private static final float f5000 = Float.POSITIVE_INFINITY;

   public float m2000(float var1) {
      float var2 = Math.max(0.0F, this.f2000);
      float var3 = Math.max(this.f3000, var2);
      return C0259.m8000(var1, var2, var3);
   }

   public boolean m4000() {
      return this.f1000 == Enum0039.f3000;
   }

   private static float m6000(float var0) {
      return Float.isInfinite(var0) ? Float.POSITIVE_INFINITY : Math.max(0.0F, var0);
   }

   public float m8000() {
      return this.f4000;
   }

   public Rec0125(Enum0039 var1, float var2, float var3, float var4) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
      this.f4000 = var4;
   }

   public final boolean m10000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0125,"mode;min;max;value",Rec0125::f1000,Rec0125::f2000,Rec0125::f3000,Rec0125::f4000>(this, var1);
   }

   private static float m12000(float var0) {
      return Float.isInfinite(var0) ? Float.POSITIVE_INFINITY : Math.max(0.0F, var0);
   }

   public float m14000() {
      return this.f2000;
   }

   public float m16000(float var1) {
      return Math.max(0.0F, var1) * this.f4000 / 100.0F;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public float m18000(float var1) {
      float var2 = Math.max(0.0F, var1);

      return switch (C0365.f1000[this.f1000.ordinal()]) {
         case 1 -> this.f4000;
         case 2 -> this.m2000(var2);
         case 3 -> this.m2000(var2);
         case 4 -> 0.0F;
         default -> throw new MatchException(null, null);
      };
   }

   public Enum0039 m20000() {
      return this.f1000;
   }

   public boolean m22000() {
      return this.f1000 == Enum0039.f2000;
   }

   public static Rec0125 m24000(float var0) {
      float var1 = m6000(var0);
      return new Rec0125(Enum0039.f4000, var1, var1, var1);
   }

   public static Rec0125 m26000(float var0, float var1) {
      return new Rec0125(Enum0039.f2000, m6000(var0), m12000(var1), 0.0F);
   }

   public static Rec0125 m28000(float var0) {
      float var1 = C0259.m8000(var0, 0.0F, 100.0F);
      return new Rec0125(Enum0039.f3000, 0.0F, Float.POSITIVE_INFINITY, var1);
   }

   public static Rec0125 m30000() {
      return new Rec0125(Enum0039.f1000, 0.0F, Float.POSITIVE_INFINITY, 0.0F);
   }

   public static Rec0125 m32000(float var0, float var1) {
      return new Rec0125(Enum0039.f1000, m6000(var0), m12000(var1), 0.0F);
   }

   public static Rec0125 m34000(float var0) {
      float var1 = m6000(var0);
      return m32000(var1, var1);
   }

   public float m36000() {
      return this.f3000;
   }
}

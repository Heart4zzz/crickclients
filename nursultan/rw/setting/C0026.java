package rw.setting;

import java.util.Objects;
import rw.api.Iface0192;
import rw.api.Iface0195;
import rw.api.Iface0203;
import rw.core.C0264;
import rw.data.Rec0066;
import rw.data.Rec0076;
import rw.data.Rec0125;
import rw.defs.Enum0017;
import rw.defs.Enum0019;
import rw.defs.StepStart;

public final class C0026 {
   private final Enum0019 f1000;
   private final Iface0192 f2000;
   private final int f3000;
   private final int f4000;
   private final float f5000;
   private final float f6000;
   private final Rec0125 f7000;
   private final Rec0125 f8000;
   private final Rec0066 f9000;
   private final Rec0066 f10000;
   private final Enum0017 f11000;
   private final Iface0195 f12000;
   private C0027 f13000;
   private float f14000;

   public float m2000() {
      return this.f11000 == Enum0017.f3000 ? this.m18000().m10000() : C0264.m2000(this.f5000, this.f6000, this.m24000());
   }

   int m4000() {
      return this.f4000;
   }

   private C0026(
      Enum0019 var1,
      Iface0192 var2,
      int var3,
      int var4,
      float var5,
      float var6,
      Rec0125 var7,
      Rec0125 var8,
      Rec0066 var9,
      Rec0066 var10,
      Enum0017 var11,
      Iface0195 var12,
      C0027 var13
   ) {
      this.f1000 = var1;
      this.f2000 = Objects.requireNonNull(var2, "spec");
      this.f3000 = var3;
      this.f4000 = var4;
      this.f5000 = var5;
      this.f6000 = var6;
      this.f7000 = var7;
      this.f8000 = var8;
      this.f9000 = var9;
      this.f10000 = var10;
      this.f11000 = var11;
      this.f12000 = var12;
      this.f13000 = Objects.requireNonNull(var13, "targetValue");
   }

   float m6000() {
      return this.f5000;
   }

   float m8000() {
      return this.f6000;
   }

   public Enum0019 m10000() {
      return this.f1000;
   }

   Enum0017 m12000() {
      return this.f11000;
   }

   Rec0125 m14000() {
      return this.f8000;
   }

   Rec0125 m16000() {
      return this.f7000;
   }

   public C0027 m18000() {
      if (this.f11000 == Enum0017.f3000) {
         return Objects.requireNonNull(this.f12000.m6000(), "transitionValue");
      } else {
         return switch (this.f11000) {
            case f1000 -> C0027.m16000(this.f4000);
            case f2000 -> C0027.m22000(this.m2000());
            case f3000 -> throw new IllegalStateException("Runtime value handled above");
            case f4000 -> C0027.m14000(this.f8000);
            case f5000 -> C0027.m12000(this.f10000);
         };
      }
   }

   public boolean m20000(Iface0192 var1) {
      return this.f11000 == Enum0017.f3000 && this.m38000(var1);
   }

   public boolean m22000(C0027 var1) {
      if (this.f11000 != Enum0017.f3000) {
         return false;
      } else {
         boolean var2 = this.f12000.m4000(var1);
         if (var2) {
            this.f13000 = var1;
         }

         return var2;
      }
   }

   public float m24000() {
      if (this.f2000 instanceof Rec0076 var4) {
         Rec0076 var10000 = var4;

         try {
            var13 = var10000.m10000();
         } catch (Throwable var9) {
            throw new MatchException(var9.toString(), var9);
         }

         float var6 = var13;
         var10000 = var4;

         try {
            var15 = var10000.m8000();
         } catch (Throwable var8) {
            throw new MatchException(var8.toString(), var8);
         }

         StepStart var11 = var15;
         var10000 = var4;

         try {
            var17 = var10000.m2000();
         } catch (Throwable var7) {
            throw new MatchException(var7.toString(), var7);
         }

         var6 = var17;
         if (!(var6 <= 0.0F)) {
            float var10 = (this.f14000 - var6) / var6;
            if (var10 <= 0.0F) {
               return 0.0F;
            }

            if (var10 >= 1.0F) {
               return 1.0F;
            }

            return var11.m6000(var10);
         }
      }

      return 1.0F;
   }

   Rec0066 m26000() {
      return this.f9000;
   }

   public static C0026 m28000(Enum0019 var0, Iface0192 var1, int var2, int var3) {
      Objects.requireNonNull(var1, "spec");
      C0027 var4 = C0027.m16000(var2);
      C0027 var5 = C0027.m16000(var3);
      return var1 instanceof Iface0203
         ? m44000(var0, var1, var4, var5, var2, var3, 0.0F, 0.0F, null, null, null, null)
         : new C0026(var0, var1, var2, var3, 0.0F, 0.0F, null, null, null, null, Enum0017.f1000, null, var5);
   }

   public static C0026 m30000(Enum0019 var0, Iface0192 var1, float var2, float var3) {
      Objects.requireNonNull(var1, "spec");
      C0027 var4 = C0027.m22000(var2);
      C0027 var5 = C0027.m22000(var3);
      return var1 instanceof Iface0203
         ? m44000(var0, var1, var4, var5, 0, 0, var2, var3, null, null, null, null)
         : new C0026(var0, var1, 0, 0, var2, var3, null, null, null, null, Enum0017.f2000, null, var5);
   }

   public static C0026 m32000(Enum0019 var0, Iface0192 var1, Rec0125 var2, Rec0125 var3) {
      Objects.requireNonNull(var1, "spec");
      C0027 var4 = C0027.m14000(var2);
      C0027 var5 = C0027.m14000(var3);
      return var1 instanceof Iface0203
         ? m44000(var0, var1, var4, var5, 0, 0, 0.0F, 0.0F, var2, var3, null, null)
         : new C0026(var0, var1, 0, 0, 0.0F, 0.0F, var2, var3, null, null, Enum0017.f4000, null, var5);
   }

   public boolean m34000(float var1) {
      if (var1 <= 0.0F || this.m36000()) {
         return false;
      } else if (this.f11000 == Enum0017.f3000) {
         return this.f12000.m8000(var1);
      } else {
         float var2 = this.m24000();
         this.f14000 += var1;
         float var3 = this.m24000();
         return Float.compare(var2, var3) != 0;
      }
   }

   public boolean m36000() {
      if (this.f11000 == Enum0017.f3000) {
         return this.f12000.m2000();
      } else if (this.f2000 instanceof Rec0076 var1) {
         Rec0076 var10000 = var1;

         try {
            var11 = var10000.m10000();
         } catch (Throwable var9) {
            throw new MatchException(var9.toString(), var9);
         }

         float var6 = var11;
         var10000 = var1;

         try {
            var10000.m8000();
         } catch (Throwable var8) {
            throw new MatchException(var8.toString(), var8);
         }

         var10000 = var1;

         try {
            var14 = var10000.m2000();
         } catch (Throwable var7) {
            throw new MatchException(var7.toString(), var7);
         }

         float var10 = var14;
         return this.f14000 >= var10 + var6;
      } else {
         return true;
      }
   }

   public boolean m38000(Iface0192 var1) {
      Iface0192 var2 = var1 == null ? Iface0192.m2000() : var1;
      return this.f2000.equals(var2);
   }

   public boolean m40000(C0027 var1) {
      return this.f13000.m4000(var1);
   }

   public static C0026 m42000(Enum0019 var0, Iface0192 var1, Rec0066 var2, Rec0066 var3) {
      Objects.requireNonNull(var1, "spec");
      C0027 var4 = C0027.m12000(var2);
      C0027 var5 = C0027.m12000(var3);
      return var1 instanceof Iface0203
         ? m44000(var0, var1, var4, var5, 0, 0, 0.0F, 0.0F, null, null, var2, var3)
         : new C0026(var0, var1, 0, 0, 0.0F, 0.0F, null, null, var2, var3, Enum0017.f5000, null, var5);
   }

   private static C0026 m44000(
      Enum0019 var0,
      Iface0192 var1,
      C0027 var2,
      C0027 var3,
      int var4,
      int var5,
      float var6,
      float var7,
      Rec0125 var8,
      Rec0125 var9,
      Rec0066 var10,
      Rec0066 var11
   ) {
      Iface0203 var12 = (Iface0203)var1;
      return new C0026(
         var0,
         var1,
         var4,
         var5,
         var6,
         var7,
         var8,
         var9,
         var10,
         var11,
         Enum0017.f3000,
         Objects.requireNonNull(var12.m4000(var0, var2, var3), "valueTransitionRuntime"),
         var3
      );
   }

   Rec0066 m46000() {
      return this.f10000;
   }

   int m48000() {
      return this.f3000;
   }
}

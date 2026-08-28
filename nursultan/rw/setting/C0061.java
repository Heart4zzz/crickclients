package rw.setting;

import java.util.Objects;
import rw.api.Iface0192;
import rw.api.Iface0195;
import rw.api.Iface0203;
import rw.data.Rec0076;
import rw.defs.Enum0019;
import rw.defs.StepStart;

final class C0061 {
   private final Iface0192 f1000;
   private final float f2000;
   private final float f3000;
   private final Iface0195 f4000;
   private float f5000;

   private float m2000() {
      if (this.f1000 instanceof Rec0076 var4) {
         Rec0076 var10000 = var4;

         try {
            var12 = var10000.m10000();
         } catch (Throwable var9) {
            throw new MatchException(var9.toString(), var9);
         }

         float var6 = var12;
         var10000 = var4;

         try {
            var10000.m8000();
         } catch (Throwable var8) {
            throw new MatchException(var8.toString(), var8);
         }

         var10000 = var4;

         try {
            var15 = var10000.m2000();
         } catch (Throwable var7) {
            throw new MatchException(var7.toString(), var7);
         }

         var6 = var15;
         if (!(var6 <= 0.0F)) {
            float var10 = (this.f5000 - var6) / var6;
            if (var10 <= 0.0F) {
               return 0.0F;
            }

            if (var10 >= 1.0F) {
               return 1.0F;
            }

            return var10;
         }
      }

      return 1.0F;
   }

   private C0061(Iface0192 var1, float var2, float var3, Iface0195 var4) {
      this.f1000 = Objects.requireNonNull(var1, "spec");
      this.f2000 = var2;
      this.f3000 = var3;
      this.f4000 = var4;
   }

   float m4000() {
      if (this.f4000 != null) {
         return this.f4000.m6000().m10000();
      } else if (this.f1000 instanceof Rec0076 var4) {
         Rec0076 var10000 = var4;

         try {
            var10000.m10000();
         } catch (Throwable var9) {
            throw new MatchException(var9.toString(), var9);
         }

         var10000 = var4;

         try {
            var12 = var10000.m8000();
         } catch (Throwable var8) {
            throw new MatchException(var8.toString(), var8);
         }

         StepStart var6 = var12;
         var10000 = var4;

         try {
            var10000.m2000();
         } catch (Throwable var7) {
            throw new MatchException(var7.toString(), var7);
         }

         float var10 = var6.m6000(this.m2000());
         return this.f2000 + (this.f3000 - this.f2000) * var10;
      } else {
         return this.f3000;
      }
   }

   boolean m6000() {
      if (this.f4000 != null) {
         return this.f4000.m2000();
      } else if (this.f1000 instanceof Rec0076 var1) {
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
         return this.f5000 >= var10 + var6;
      } else {
         return true;
      }
   }

   boolean m8000(float var1) {
      if (this.f4000 != null) {
         return this.f4000.m8000(var1);
      } else if (!(var1 <= 0.0F) && !this.m6000()) {
         float var2 = this.m2000();
         this.f5000 += var1;
         return Float.compare(var2, this.m2000()) != 0;
      } else {
         return false;
      }
   }

   static C0061 m10000(Enum0019 var0, Iface0192 var1, float var2, float var3) {
      if (var1 instanceof Iface0203 var4) {
         Iface0195 var5 = Objects.requireNonNull(var4.m4000(var0, C0027.m22000(var2), C0027.m22000(var3)), "valueTransitionRuntime");
         return new C0061(var1, var2, var3, var5);
      } else {
         return new C0061(var1, var2, var3, null);
      }
   }
}

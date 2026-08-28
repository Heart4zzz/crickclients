package rw.core;

import rw.data.Rec0093;
import rw.data.Rec0099;
import rw.defs.Enum0034;
import rw.defs.Enum0044;
import rw.gui.C0019;

final class C0302 {
   private static final float f1000 = 0.001F;

   private C0302() {
   }

   private static Enum0044 m2000(Enum0044 var0, Enum0044 var1, Enum0044 var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      boolean var9 = var3 + var5 <= var8;
      boolean var10 = var4 >= 0.0F;
      if (var0 == var1) {
         if (var9) {
            return var1;
         } else if (var10) {
            return var2;
         } else {
            return var6 > var7 ? var2 : var1;
         }
      } else if (var10) {
         return var2;
      } else if (var9) {
         return var1;
      } else {
         return var7 > var6 ? var1 : var2;
      }
   }

   private static float m4000(float var0, float var1, float var2) {
      float var3 = Math.max(0.0F, var2 - var1);
      return C0259.m8000(var0, 0.0F, var3);
   }

   private static void m6000(rw.setting.C0059 var0, float var1, float var2) {
      C0347 var3 = var0.m42000();
      var3.m6000(var3.m58000() + var1, var3.m8000() + var2);
      var3.m66000(var3.m80000() + var1, var3.m10000() + var2, var3.m18000(), var3.m20000());

      for (int var4 = 0; var4 < var0.m102000(); var4++) {
         rw.setting.C0059 var5 = var0.m148000(var4);
         if (!C0385.m6000(var5)) {
            m6000(var5, var1, var2);
         }
      }
   }

   private static boolean m8000(float var0, float var1) {
      return Math.abs(var0 - var1) <= 0.001F;
   }

   static boolean m10000(rw.setting.C0059 var0, Rec0099 var1, float var2, float var3) {
      C0019 var4 = var0.m78000();
      C0347 var5 = var0.m42000();
      Rec0093 var6 = m12000(
         var4.m42000(),
         var4.m82000(),
         var4.m128000(),
         var4.m228000(),
         var4.m230000(),
         var1,
         var5.m48000(),
         var5.m22000(),
         Math.max(0.0F, var2),
         Math.max(0.0F, var3)
      );
      float var7 = var6.m8000() - var5.m58000();
      float var8 = var6.m6000() - var5.m8000();
      if (m8000(var7, 0.0F) && m8000(var8, 0.0F)) {
         return false;
      } else {
         m6000(var0, var7, var8);
         var0.m112000(1);
         return true;
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static Rec0093 m12000(Enum0044 var0, float var1, Enum0034 var2, boolean var3, boolean var4, Rec0099 var5, float var6, float var7, float var8, float var9) {
      Enum0044 var10 = var3 ? m16000(var0, var1, var5, var6, var7, var8, var9) : var0;
      float var11;
      float var12;
      switch (C0282.f1000[var10.ordinal()]) {
         case 1:
            var12 = var5.m14000() + var1;
            var11 = m14000(var2, var5.m10000(), var5.m4000(), var6);
            break;
         case 2:
            var12 = var5.m18000() - var1 - var7;
            var11 = m14000(var2, var5.m10000(), var5.m4000(), var6);
            break;
         case 3:
            var11 = var5.m16000() + var1;
            var12 = m14000(var2, var5.m18000(), var5.m8000(), var7);
            break;
         case 4:
            var11 = var5.m10000() - var1 - var6;
            var12 = m14000(var2, var5.m18000(), var5.m8000(), var7);
            break;
         default:
            throw new IllegalStateException("Unhandled side: " + var10);
      }

      if (var4) {
         var11 = m4000(var11, var6, var8);
         var12 = m4000(var12, var7, var9);
      }

      return new Rec0093(var11, var12, var10);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static float m14000(Enum0034 var0, float var1, float var2, float var3) {
      return switch (C0282.f2000[var0.ordinal()]) {
         case 1 -> var1;
         case 2 -> var1 + (var2 - var3) * 0.5F;
         case 3 -> var1 + var2 - var3;
         default -> throw new MatchException(null, null);
      };
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static Enum0044 m16000(Enum0044 var0, float var1, Rec0099 var2, float var3, float var4, float var5, float var6) {
      return switch (C0282.f1000[var0.ordinal()]) {
         case 1, 2 -> m2000(
            var0,
            Enum0044.f2000,
            Enum0044.f1000,
            var2.m14000() + var1,
            var2.m18000() - var1 - var4,
            var4,
            var2.m18000(),
            Math.max(0.0F, var6 - var2.m14000()),
            var6
         );
         case 3, 4 -> m2000(
            var0,
            Enum0044.f4000,
            Enum0044.f3000,
            var2.m16000() + var1,
            var2.m10000() - var1 - var3,
            var3,
            var2.m10000(),
            Math.max(0.0F, var5 - var2.m16000()),
            var5
         );
         default -> throw new MatchException(null, null);
      };
   }
}

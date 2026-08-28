package rw.core;

import rw.data.Rec0125;
import rw.data.Rec0131;
import rw.defs.Enum0033;
import rw.defs.Enum0034;
import rw.defs.Enum0035;
import rw.defs.Enum0038;
import rw.defs.Enum0039;
import rw.defs.Enum0040;
import rw.defs.Enum0046;
import rw.gui.C0019;

final class C0405 {
   static final float f1000 = 0.01F;
   static final int f2000 = 1000;

   static float m2000(C0019 var0, Enum0046 var1) {
      return var1 == Enum0046.f1000 ? var0.m112000().m16000() : var0.m112000().m10000();
   }

   static float m4000(C0019 var0) {
      return var0.m20000() == Enum0038.f2000 ? m30000(var0) * 2.0F : 0.0F;
   }

   static float m6000(float var0, float var1) {
      return C0259.m2000(var0, var1);
   }

   static float m8000(C0019 var0, Enum0046 var1, float var2) {
      Rec0125 var3 = m28000(var0, var1);
      float var4 = m22000(var0, var1, var2);
      return m50000(var0, var1, var3.m2000(var4));
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static float m10000(C0019 var0, Enum0046 var1, float var2) {
      Rec0125 var3 = m28000(var0, var1);
      float var4 = m22000(var0, var1, var2);

      float var5 = switch (C0389.f3000[var3.m20000().ordinal()]) {
         case 1 -> 0.0F;
         case 2 -> var3.m8000();
         case 3, 4 -> var3.m2000(Math.max(var4, var3.m14000()));
         default -> throw new MatchException(null, null);
      };
      return m50000(var0, var1, var5);
   }

   private C0405() {
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static float m12000(C0019 var0, Enum0046 var1) {
      float var2 = m16000(var0);

      return switch (C0389.f1000[var1.ordinal()]) {
         case 1 -> var0.m112000().m2000() + var2;
         case 2 -> var0.m112000().m6000() + var2;
         default -> throw new MatchException(null, null);
      };
   }

   static float m14000(C0019 var0, Enum0046 var1, float var2) {
      Rec0125 var3 = m28000(var0, var1);
      float var4 = var3.m16000(var2);
      float var5 = m50000(var0, var1, var4);
      return C0259.m8000(var2, 0.0F, var5);
   }

   static float m16000(C0019 var0) {
      return var0.m20000() == Enum0038.f2000 ? m30000(var0) : 0.0F;
   }

   static float m18000(C0019 var0, Enum0046 var1, float var2) {
      Rec0125 var3 = m28000(var0, var1);
      float var4 = m22000(var0, var1, var2);
      return m50000(var0, var1, m26000(var3.m36000(), var4));
   }

   static float m20000(C0019 var0, Enum0046 var1) {
      return m2000(var0, var1) + m4000(var0);
   }

   static float m22000(C0019 var0, Enum0046 var1, float var2) {
      float var3 = var0.m116000() == Enum0040.f1000 ? m20000(var0, var1) : 0.0F;
      return Math.max(0.0F, var2 - var3);
   }

   static float m24000(Enum0034 var0, float var1) {
      return m54000(var0, var1);
   }

   static float m26000(float var0, float var1) {
      return Float.isInfinite(var0) ? Float.POSITIVE_INFINITY : Math.max(var1, var0);
   }

   static Rec0125 m28000(C0019 var0, Enum0046 var1) {
      return var1 == Enum0046.f1000 ? var0.m32000() : var0.m220000();
   }

   static float m30000(C0019 var0) {
      return Math.max(0.0F, var0.m92000());
   }

   static boolean m32000(float var0, float var1) {
      return Math.abs(var0 - var1) < 0.01F;
   }

   static boolean m34000(Rec0131 var0) {
      return var0.m12000();
   }

   static boolean m36000(C0019 var0, Enum0046 var1) {
      return var0.m16000() == Enum0035.f1000 && var1 == Enum0046.f1000 || var0.m16000() == Enum0035.f2000 && var1 == Enum0046.f2000;
   }

   static boolean m38000(Rec0125 var0) {
      return var0.m20000() == Enum0039.f1000 || var0.m20000() == Enum0039.f2000;
   }

   static float m40000(int var0, float var1) {
      return var0 <= 1 ? 0.0F : (var0 - 1) * Math.max(0.0F, var1);
   }

   static float m42000(int var0, Rec0131 var1, float var2) {
      if (var0 <= 1) {
         return 0.0F;
      } else {
         return m34000(var1) ? Math.max(0.0F, var2) / (var0 - 1) : var1.m8000();
      }
   }

   static float m44000(int var0, Rec0131 var1) {
      return var0 > 1 && !m34000(var1) ? m40000(var0, var1.m8000()) : 0.0F;
   }

   static float m46000(C0412 var0, C0019 var1, Enum0046 var2) {
      float var3 = var0.m2000(var2);
      float var4 = m20000(var1, var2);
      float var5 = var2 == Enum0046.f1000 ? m48000(var1) : 0.0F;
      return Math.max(0.0F, var3 - var4 - var5);
   }

   static float m48000(C0019 var0) {
      return var0.m142000() && var0.m100000() == Enum0033.f3000 ? var0.m226000().m40000() : 0.0F;
   }

   static float m50000(C0019 var0, Enum0046 var1, float var2) {
      float var3 = var0.m116000() == Enum0040.f1000 ? m20000(var0, var1) : 0.0F;
      return Math.max(0.0F, var2 + var3);
   }

   static boolean m52000(rw.setting.C0059 var0) {
      return C0385.m4000(var0);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static float m54000(Enum0034 var0, float var1) {
      float var2 = Math.max(0.0F, var1);

      return switch (C0389.f2000[var0.ordinal()]) {
         case 1 -> 0.0F;
         case 2 -> var2 * 0.5F;
         case 3 -> var2;
         default -> throw new MatchException(null, null);
      };
   }

   static float m56000(C0019 var0, Enum0046 var1, float var2) {
      Rec0125 var3 = m28000(var0, var1);
      if (var3.m20000() == Enum0039.f3000) {
         return var3.m18000(var2);
      } else {
         float var4 = m22000(var0, var1, var2);
         return m50000(var0, var1, var3.m18000(var4));
      }
   }

   static float m58000(C0019 var0, Enum0046 var1) {
      return m50000(var0, var1, 0.0F);
   }
}

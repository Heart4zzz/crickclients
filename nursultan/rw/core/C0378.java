package rw.core;

import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import rw.data.Rec0066;
import rw.data.Rec0068;
import rw.data.Rec0070;
import rw.data.Rec0125;
import rw.data.Rec0126;
import rw.data.Rec0127;
import rw.data.Rec0130;
import rw.data.Rec0131;
import rw.defs.Enum0031;
import rw.defs.Enum0032;
import rw.defs.Enum0033;
import rw.defs.Enum0034;
import rw.defs.Enum0035;
import rw.defs.Enum0036;
import rw.defs.Enum0038;
import rw.defs.Enum0040;
import rw.defs.Enum0041;
import rw.defs.Enum0042;
import rw.defs.Enum0044;
import rw.gui.C0019;
import rw.setting.Rec0036;

final class C0378 {
   private C0378() {
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static void m2000(C0370 var0, Rec0130 var1, Enum0041 var2, Object var3) {
      switch (C0372.f1000[var2.ordinal()]) {
         case 1:
            var0.m84000(var1.m38000((Float)var3));
            break;
         case 2:
            var0.m84000(var1.m32000((Float)var3));
            break;
         case 3:
            var0.m84000(var1.m24000((Float)var3));
            break;
         case 4:
            var0.m84000(var1.m42000((Integer)var3));
            break;
         case 5:
            var0.m84000(var1.m30000((Integer)var3));
            break;
         case 6:
            var0.m84000(var1.m4000((Integer)var3));
            break;
         case 7:
            var0.m84000(var1.m26000((Integer)var3));
            break;
         case 8:
            var0.m84000(var1.m16000((Integer)var3));
            break;
         case 9:
            var0.m84000(var1.m44000((Integer)var3));
            break;
         default:
            m4000(var0, var2, var3);
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static void m4000(C0370 var0, Enum0041 var1, Object var2) {
      switch (C0372.f1000[var1.ordinal()]) {
         case 10:
            var0.m62000((Enum0035)var2);
            break;
         case 11:
            var0.m64000((Enum0034)var2);
            break;
         case 12:
            var0.m40000((Enum0034)var2);
            break;
         case 13:
            var0.m46000((Enum0040)var2);
            break;
         case 14:
            var0.m58000((Float)var2, null, null, null);
            break;
         case 15:
            var0.m58000(null, (Float)var2, null, null);
            break;
         case 16:
            var0.m58000(null, null, (Float)var2, null);
            break;
         case 17:
            var0.m58000(null, null, null, (Float)var2);
            break;
         case 18:
            var0.m94000((Rec0131)var2);
            break;
         case 19:
            var0.m86000((Rec0126)var2);
            break;
         case 20:
            var0.m88000((Float)var2);
            break;
         case 21:
            var0.m90000((Enum0038)var2);
            break;
         case 22:
            var0.m92000((Enum0032)var2);
            break;
         case 23:
            Rec0127 var3 = (Rec0127)var2;
            var0.m76000(var3.m6000());
            var0.m74000(var3.m4000());
            break;
         case 24:
            var0.m38000((Float)var2);
            break;
         case 25:
            var0.m6000((Float)var2);
            break;
         case 26:
            var0.m68000((String)var2);
            break;
         case 27:
            var0.m66000((Enum0044)var2);
            break;
         case 28:
            var0.m44000((Float)var2);
            break;
         case 29:
            var0.m4000((Enum0034)var2);
            break;
         case 30:
            var0.m16000((Boolean)var2);
            break;
         case 31:
            var0.m98000((Boolean)var2);
            break;
         case 32:
            var0.m72000((Rec0066)var2);
            break;
         case 33:
            var0.m42000((Rec0066)var2);
            break;
         case 34:
            var0.m26000((Float)var2);
            break;
         case 35:
            var0.m18000((Float)var2);
            break;
         case 36:
            var0.m78000((Enum0036)var2);
            break;
         case 37:
            var0.m80000((Enum0042)var2);
            break;
         case 38:
            var0.m82000((Enum0033)var2);
            break;
         case 39:
            var0.m70000((Rec0125)var2);
            break;
         case 40:
            var0.m32000((Rec0125)var2);
            break;
         case 41:
            var0.m34000((Boolean)var2);
            break;
         case 42:
            var0.m2000((Boolean)var2);
            break;
         case 43:
            var0.m28000((Boolean)var2);
            break;
         case 44:
            var0.m36000((Integer)var2);
            break;
         case 45:
            var0.m96000((Float)var2);
            break;
         case 46:
            var0.m10000((Float)var2);
            break;
         case 47:
            var0.m8000((Integer)var2);
            break;
         case 48:
            var0.m30000((Integer)var2);
            break;
         case 49:
            var0.m20000((Integer)var2);
            break;
         case 50:
            var0.m12000((Float)var2);
            break;
         case 51:
            var0.m56000((Rec0036)var2);
            break;
         case 52:
            var0.m50000((Enum0031)var2);
            break;
         case 53:
            var0.m100000((Integer)var2);
            break;
         case 54:
            var0.m14000((Float)var2);
            break;
         case 55:
            var0.m54000((Rec0070)var2);
            break;
         case 56:
            var0.m24000((Float)var2);
            break;
         case 57:
            var0.m22000((Float)var2);
            break;
         case 58:
            var0.m48000((Rec0068)var2);
            break;
         default:
            throw new IllegalArgumentException("Unsupported direct style field: " + var1);
      }
   }

   private static C0019 m6000(C0019 var0, C0370 var1) {
      C0019 var2 = var1.m60000();
      return var2.m34000(var0) ? var0 : var2;
   }

   static C0019 m8000(C0019 var0, Enum0041 var1, Object var2) {
      C0370 var3 = var0.m216000();
      m2000(var3, var0.m226000(), var1, Objects.requireNonNull(var2));
      return m6000(var0, var3);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static C0019 m10000(C0019 var0, Map<Enum0041, Object> var1) {
      if (var1 != null && !var1.isEmpty()) {
         C0370 var2 = var0.m216000();
         Rec0130 var3 = var0.m226000();
         float var4 = var3.m40000();
         float var5 = var3.m34000();
         float var6 = var3.m22000();
         int var7 = var3.m18000();
         int var8 = var3.m46000();
         int var9 = var3.m8000();
         int var10 = var3.m12000();
         int var11 = var3.m14000();
         int var12 = var3.m20000();
         boolean var13 = false;

         for (Entry var15 : var1.entrySet()) {
            Object var16 = Objects.requireNonNull(var15.getValue());
            switch (C0372.f1000[((Enum0041)var15.getKey()).ordinal()]) {
               case 1:
                  var4 = (Float)var16;
                  var13 = true;
                  break;
               case 2:
                  var5 = (Float)var16;
                  var13 = true;
                  break;
               case 3:
                  var6 = (Float)var16;
                  var13 = true;
                  break;
               case 4:
                  var7 = (Integer)var16;
                  var13 = true;
                  break;
               case 5:
                  var8 = (Integer)var16;
                  var13 = true;
                  break;
               case 6:
                  var9 = (Integer)var16;
                  var13 = true;
                  break;
               case 7:
                  var10 = (Integer)var16;
                  var13 = true;
                  break;
               case 8:
                  var11 = (Integer)var16;
                  var13 = true;
                  break;
               case 9:
                  var12 = (Integer)var16;
                  var13 = true;
                  break;
               default:
                  m4000(var2, (Enum0041)var15.getKey(), var16);
            }
         }

         if (var13) {
            var2.m84000(new Rec0130(var4, var5, var6, var7, var8, var9, var10, var11, var12));
         }

         return m6000(var0, var2);
      } else {
         return var0;
      }
   }
}

package rw.core;

import java.util.EnumMap;
import rw.api.Iface0192;
import rw.data.Rec0070;
import rw.data.Rec0076;
import rw.defs.Enum0011;
import rw.defs.Enum0019;
import rw.defs.StepStart;
import rw.setting.Rec0057;

public final class C0258 {
   private static void m2000(EnumMap<Enum0019, Iface0192> var0, Iface0192 var1) {
      var0.put(Enum0019.f13000, var1);
      var0.put(Enum0019.f14000, var1);
   }

   private C0258() {
   }

   private static void m4000(EnumMap<Enum0019, Iface0192> var0, Iface0192 var1) {
      var0.put(Enum0019.f11000, var1);
      var0.put(Enum0019.f12000, var1);
   }

   private static void m6000(EnumMap<Enum0019, Iface0192> var0, Iface0192 var1) {
      var0.put(Enum0019.f7000, var1);
      var0.put(Enum0019.f8000, var1);
      var0.put(Enum0019.f9000, var1);
      var0.put(Enum0019.f10000, var1);
   }

   public static Rec0070 m8000(float var0, StepStart var1) {
      EnumMap var2 = new EnumMap<>(Enum0019.class);
      Rec0076 var3 = new Rec0076(Math.max(0.0F, var0) / 1000.0F, var1);
      if (!var3.m4000()) {
         return Rec0070.f2000;
      } else {
         for (Enum0019 var7 : Enum0019.m8000()) {
            var2.put(var7, var3);
         }

         return new Rec0070(var2);
      }
   }

   public static Rec0070 m10000(Rec0057... var0) {
      if (var0 != null && var0.length != 0) {
         EnumMap var1 = new EnumMap<>(Enum0019.class);

         for (Rec0057 var5 : var0) {
            if (var5 != null && var5.m30000() != null && var5.m30000().m4000()) {
               Enum0019 var6 = var5.m34000();
               if (var6 == null && var5.m2000() == Enum0011.f2000) {
                  m6000(var1, var5.m30000());
               } else if (var6 == null && var5.m2000() == Enum0011.f3000) {
                  m4000(var1, var5.m30000());
               } else if (var6 == null && var5.m2000() == Enum0011.f4000) {
                  m2000(var1, var5.m30000());
               } else if (var6 != null) {
                  var1.put(var6, var5.m30000());
               }
            }
         }

         return new Rec0070(var1);
      } else {
         return Rec0070.f2000;
      }
   }
}

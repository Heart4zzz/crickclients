package rw.core;

import rw.defs.Enum0032;

public final class C0385 {
   public static boolean m2000(rw.setting.C0059 var0) {
      if (var0 == null) {
         return false;
      } else {
         Enum0032 var1 = var0.m78000().m76000();
         return var1 == Enum0032.f2000 || var1 == Enum0032.f3000;
      }
   }

   private C0385() {
   }

   public static boolean m4000(rw.setting.C0059 var0) {
      return var0 == null ? false : var0.m78000().m76000() == Enum0032.f1000;
   }

   public static boolean m6000(rw.setting.C0059 var0) {
      return var0 != null && var0.m78000().m76000() == Enum0032.f3000;
   }
}

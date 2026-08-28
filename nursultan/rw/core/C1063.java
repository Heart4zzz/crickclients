package rw.core;

import java.util.function.Consumer;
import rw.defs.Enum0026;
import rw.defs.Enum0032;
import rw.defs.Enum0034;
import rw.defs.Enum0044;
import rw.setting.C0031;

public class C1063 {
   public static Object[] f1000;
   private static float[] f2000;

   private static void m2000() {
      f1000 = new Object[]{500, 1000, 1001, 2000, 2001, 256};
   }

   private C1063() {
   }

   static {
      ntfClinit();
   }

   public static rw.setting.C0056 m20000() {
      return rw.setting.C0056.m130000().m160000(Enum0032.f2000).m78000(f2000[0], f2000[1]);
   }

   private static void m22000(Runnable var0) {
      if (var0 != null) {
         var0.run();
      }
   }

   public static C0031 m24000(String var0, int var1, Runnable var2) {
      return C0287.m26000(
         rw.setting.C0056.m130000().m160000(Enum0032.f3000).m206000().m168000(var1),
         var2x -> ((C0288)((C0288)((C0288)var2x.N(var0)).N(Enum0026.f4000, var1xx -> {
            m22000(var2);
            var1xx.m6000();
         })).N(Enum0026.f2000, Base0315::m6000)).N(Enum0026.f6000, var1xx -> {
            if (var1xx instanceof C0319 var2xx && var2xx.m6000() && var2xx.m8000() == 256) {
               m22000(var2);
               var1xx.m6000();
            }
         })
      );
   }

   public static C0031 m28000(rw.setting.C0056 var0, Consumer<C0288> var1) {
      return C0287.m26000(var0, var1x -> {
         m38000(var1x);
         var1.accept(var1x);
      });
   }

   public static rw.setting.C0056 m30000(String var0, float var1, int var2) {
      return rw.setting.C0056.m130000().m160000(Enum0032.f3000).m172000(var0).m150000(Enum0044.f2000, var1).m6000(Enum0034.f1000).m34000().m168000(var2);
   }

   private static void m38000(C0288 var0) {
      var0.N(Enum0026.f4000, Base0315::m6000);
      var0.N(Enum0026.f2000, Base0315::m6000);
   }

   private static void m40000() {
      f2000 = new float[]{0.0F, 0.0F};
   }
}

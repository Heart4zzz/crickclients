package rw.setting;

import java.util.List;
import rw.api.Iface0196;
import rw.api.Iface0197;
import rw.api.Iface0202;
import rw.core.Base1014;
import rw.core.C0093;
import rw.core.C0288;
import rw.core.C0318;
import rw.core.C1063;
import rw.data.Rec0125;
import rw.data.Rec0263;
import rw.data.Rec0272;
import rw.defs.Enum0026;
import rw.defs.Enum0032;

public class C0009 {
   private static float[] f1000;
   private static byte[] f2000;
   public static Object[] f3000;
   private static int[] f4000;
   private static byte[] f5000;
   private static boolean[] f6000;
   public static Object[] f7000;
   private static short[] f8000;
   private static boolean[] f9000;
   public static Object[] f10000;
   private static boolean[] f11000;
   private static String[] f12000;
   private static boolean[] f13000;
   private static short[] f14000;
   private static short[] f15000;
   private static byte[] f16000;
   private static float[] f17000;
   private static float[] f18000;
   private static float[] f19000;
   private static boolean[] f20000;
   private static byte[] f21000;
   private static float[] f22000;
   private static float[] f23000;
   private static boolean[] f24000;
   private static boolean[] f25000;
   private static float[] f26000;
   private static byte[] f27000;
   private static boolean[] f28000;

   private static void m6000() {
      f26000 = new float[]{0.0F, -1.0F, 1.0F, 0.0F, -1.0F, 0.0F};
      f23000 = new float[]{368.0F, 0.0F, 0.0F};
      f22000 = new float[]{1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F};
      f17000 = new float[]{Float.POSITIVE_INFINITY, 40.0F, 500.0F, 8.0F, 2.0F};
      f1000 = new float[]{4.0F, 0.0F, Float.POSITIVE_INFINITY};
      f18000 = new float[]{12.0F, 12.0F, 4.0F, 20.0F, 0.25F, 4.0F, 1.0F};
      f19000 = new float[]{12.0F, 1.0F, 0.0F, Float.POSITIVE_INFINITY};
   }

   private static float m8000(List<Base1014<?>> var0, int var1) {
      if (!((Base1014)var0.get(var1)).m28000()) {
         return f26000[1];
      } else if (m54000(var0, var1)) {
         return f26000[2];
      } else {
         return m30000(var0, var1) ? f26000[3] : f26000[4];
      }
   }

   private static void m12000() {
      f14000 = new short[]{4, 6, 6, 5, 0};
      f8000 = new short[]{1000, 7, 3, 1001, 1};
      f15000 = new short[]{2, 500, 400, 368};
   }

   private C0009() {
   }

   static {
      ntfClinit();
   }

   private static void m16000() {
      f9000 = new boolean[]{true, true};
      f6000 = new boolean[]{false, true, true, false, false, true};
      f20000 = new boolean[]{false, true, false, true, false, false, true};
      f13000 = new boolean[]{false, false};
      f25000 = new boolean[]{true, false};
      f11000 = new boolean[]{true, false, false, true, false, false, false};
      f24000 = new boolean[]{true, false, false, true, false, true};
      f28000 = new boolean[]{false, true, false};
   }

   private static void m22000() {
      f2000 = new byte[]{2, 2, 2};
      f16000 = new byte[]{2, 2, 2, 2, 3, 2, 4};
      f27000 = new byte[]{2, 2, 5, 6, 7, 6, 2};
      f21000 = new byte[]{4, 3, 12, 4, 4, 5, 2, 4};
      f5000 = new byte[]{4, 40, 2, 3, 8};
   }

   private static C0056 m28000(boolean var0) {
      if (var0) {
         return (C0056)f3000[f14000[1]];
      } else {
         C0056[] var10000 = new C0056[f2000[1]];
         var10000[f20000[0]] = (C0056)f3000[f14000[2]];
         var10000[f20000[1]] = C0056.m130000().m160000(Enum0032.f2000).m170000(f22000[2], f22000[3]);
         return C0056.m120000(var10000);
      }
   }

   private static boolean m30000(List<Base1014<?>> var0, int var1) {
      for (int var2 = var1 + f6000[1]; var2 < var0.size(); var2++) {
         if (!((Base1014)var0.get(var2)).m28000()) {
            return f6000[2];
         }
      }

      return f6000[3];
   }

   private C0031 m32000(Rec0272 var1, Iface0202 var2) {
      boolean var3 = var1.m6000().m2000();
      String var4 = "settingsAnchor" + System.identityHashCode(var1.m6000());
      return C1063.m28000(C0056.f1000, var4x -> {
         var4x.N(var4);
         if (var3) {
            var4x.y(C1063.m24000(f12000[0], f8000[0], () -> var1.m6000().m6000(f20000[4])));
            var4x.y(var2.m18000(f12000[1], (Iface0197<Rec0272>)f3000[f8000[1]], var1));
         }
      });
   }

   private static void m38000() {
      f12000 = new String[]{"settingsCatcher", "settingList", "updater", "settingsPanel", "settingsAnchor"};
   }

   private static C0056 m50000(float var0) {
      C0056[] var10000 = new C0056[f2000[2]];
      var10000[f20000[2]] = (C0056)f3000[f14000[3]];
      var10000[f20000[3]] = C0056.m130000().m50000(var0);
      return C0056.m120000(var10000);
   }

   private static void m52000(List<Base1014<?>> var0) {
      for (Base1014 var2 : var0) {
         var2.m18000();
      }
   }

   private static boolean m54000(List<Base1014<?>> var0, int var1) {
      for (int var2 = var1 + f9000[0]; var2 < var0.size(); var2++) {
         if (((Base1014)var0.get(var2)).m28000()) {
            return f9000[1];
         }
      }

      return f6000[0];
   }

   private static void m62000() {
      f4000 = new int[]{-16777216};
   }

   private static C0056 m66000(boolean var0) {
      C0056[] var10000 = new C0056[f2000[0]];
      var10000[f6000[4]] = (C0056)f3000[f14000[0]];
      var10000[f6000[5]] = C0056.m130000()
         .m178000(Rec0125.m26000(f26000[5], f23000[0]))
         .m90000(var0 ? Rec0125.m30000() : Rec0125.m32000(f23000[1], f23000[2]))
         .m50000(var0 ? f22000[0] : f22000[1]);
      return C0056.m120000(var10000);
   }

   private static void m74000(C0288 var0, Base1014<?> var1, float var2, Iface0196<Void> var3, Iface0202 var4) {
      String var5 = var1.m6000().m10000();
      var0.N(m66000(var1.m28000()), var4x -> {
         var4x.N("setting-row:" + var5);
         var4x.N(m28000(var1.m28000()), var4xx -> {
            var4xx.N(Enum0026.f2000, var2xxx -> {
               C0318 var3xxx = (C0318)var2xxx;
               if (var3xxx.m2000() == f16000[0]) {
                  var1.m16000();
                  var3.m4000();
                  var2xxx.m22000();
                  var2xxx.m6000();
               }
            });
            var4xx.y(var4.m18000(var5, (Iface0197<Rec0263>)C0093.f1000[f14000[4]], new Rec0263(var1, var3)));
         });
      });
      if (var2 >= f26000[0]) {
         var0.N(m50000(var2), var1x -> var1x.N("setting-divider:" + var5));
      }
   }

   private static void m80000() {
      f7000 = new Object[]{null, f12000[4], 4, 12, 4, 2};
      f10000 = new Object[]{4, 40, 500, 400};
      f3000 = new Object[]{368, null, null, null, null, null, null, null};
   }
}

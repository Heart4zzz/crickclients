package rw.setting;

import net.minecraft.client.renderer.item.SelectItemModel$UnbakedSwitch;
import rw.api.Iface0196;
import rw.api.Iface0197;
import rw.api.Iface0202;
import rw.core.C0075;
import rw.core.C0080;
import rw.core.C0090;
import rw.core.C0094;
import rw.core.C0096;
import rw.core.C0258;
import rw.core.C0287;
import rw.core.C0288;
import rw.core.NkNw;
import rw.data.Ilnotljq;
import rw.data.OlilOllt;
import rw.data.Rec0037;
import rw.data.Rec0076;
import rw.defs.Enum0019;
import rw.defs.Enum0026;
import rw.defs.Enum0055;
import rw.defs.Enum0086;

public class C0010 {
   private static float[] f1000;
   private static float[] f2000;
   private static short[] f3000;
   private static float[] f4000;
   private static boolean[] f5000;
   private static boolean[] f6000;
   private static short[] f7000;
   private static short[] f8000;
   private static String[] f9000;
   private static byte[] f10000;
   private static short[] f11000;
   private static float[] f12000;
   private static float[] f13000;
   public static Object[] f14000;
   private static float[] f15000;
   public static Object[] f16000;
   private static float[] f17000;
   private static String[] f18000;
   private static byte[] f19000;
   private static byte[] f20000;
   private static short[] f21000;
   private static boolean[] f22000;
   public static Object[] f23000;
   private static byte[] f24000;
   private static short[] f25000;

   private static void m2000() {
      f5000 = new boolean[]{false, true, false, true, false, true, false};
      f6000 = new boolean[]{true, false, true, false, true, false, true, false};
      f22000 = new boolean[]{true, false, true, false, true};
   }

   private C0010() {
   }

   static {
      ntfClinit();
   }

   private static void m16000() {
      f15000 = new float[]{1.0F, 0.5F, 659.0F, 1.0F};
      f2000 = new float[]{0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F};
      f1000 = new float[]{0.0F, 1.0F, 220.0F, 20.0F};
      f17000 = new float[]{1.0F, 0.2F, 4.0F};
      f4000 = new float[]{0.008333334F, 0.25F, 100.0F, 100.0F, 20.0F};
      f13000 = new float[]{8.0F, 4.0F, 100.0F, 659.0F, 20.0F};
      f12000 = new float[]{100.0F, 0.25F, 659.0F, 0.5F, 1.0F};
   }

   private static void m24000() {
      f21000 = new short[]{2, 3, 3};
      f8000 = new short[]{5, 6, 1, 4};
      f7000 = new short[]{0, 5};
      f3000 = new short[]{0, 6, 0, 0, 4};
      f25000 = new short[]{0, 4, 4, 0, 4, 0, 2};
      f11000 = new short[]{7, 659};
   }

   private C0031 m32000(Iface0196<Enum0086> var1, Iface0202 var2) {
      return C0287.m26000((C0056)f14000[f21000[0]], var2x -> {
         Object[] var10001 = new Object[f24000[4]];
         var10001[f6000[3]] = var2.m18000(f18000[3], (Iface0197<Iface0196>)C0090.f55000[f25000[5]], var1);
         var10001[f6000[4]] = C0287.m28000((C0056)rw.core.C0076.f5000[f25000[6]]);
         var10001[f10000[0]] = var2.m18000(f18000[4], (Iface0197<Iface0196>)f14000[f11000[0]], var1);
         var2x.N(var10001);
      });
   }

   private static void m36000() {
      f24000 = new byte[]{2, 2, 3, 2, 3};
      f10000 = new byte[]{2, 3, 3, 4, 2, 3, 4, 5};
      f19000 = new byte[]{2, 5, 6, 7, 6, 2, 5};
      f20000 = new byte[]{4, 4, 8, 2, 4, 3, 8};
   }

   private static String m40000(String var0, int var1, Enum0086 var2) {
      return var0 + "_" + var1 + "_" + var2.name();
   }

   private static C0031 m42000(Iface0196<Enum0086> var0, Iface0202 var1) {
      Iface0196 var2 = var1.m6000(f9000[0], f9000[1]);
      String var3 = (String)var2.m2000();
      if (var3 != null && !var3.isBlank()) {
         return m62000(var0, var1, var3);
      } else {
         Iface0196 var4 = var1.m24000(f9000[2], () -> Rec0037.m14000((Enum0086)var0.m2000()));
         Enum0086 var5 = (Enum0086)var0.m2000();
         Rec0037 var6 = (Rec0037)var4.m2000();
         if (var5 != var6.m16000()) {
            var6 = var6.m20000(var5);
            var4.m6000(var6);
         }

         Enum0086 var7 = var6.m16000();
         int var8 = var6.m22000();
         boolean var9 = var6.m8000();
         C0031 var10;
         float var11;
         if (var9) {
            Enum0086 var12 = var6.m2000();
            int var13 = Math.abs(var7.ordinal() - var12.ordinal());
            float var14 = Math.min(f15000[0], Math.max(f5000[0], var13 - f5000[1]) * f15000[1]);
            float var15 = f15000[2] * (f15000[3] + var14);
            int var16 = var6.m12000();
            var11 = var16 * var15;
            var10 = m46000(m40000(f9000[3], var8, var12), var12, -var16 * var15, f2000[0], f2000[1], f2000[2], var1, f9000[4], null, var8, f5000[2]);
         } else {
            var11 = f2000[3];
            var10 = null;
         }

         C0031 var17 = m46000(
            m40000(f9000[5], var8, var7), var7, f2000[4], f2000[5], var11, var9 ? f1000[0] : f1000[1], var1, f18000[0], var9 ? var4 : null, var8, f5000[3]
         );
         return C0287.m26000((C0056)f14000[f21000[1]], var3x -> {
            var3x.N("content:" + var7.name());
            if (var10 != null) {
               var3x.y(var10);
            }

            var3x.y(var17);
         });
      }
   }

   private static C0031 m44000(Iface0202 var0, Enum0086 var1, String var2) {
      String var3 = var2 + "tab:" + var1.name();
      Enum0055 var4 = var1.m38000();
      if (var4 != null) {
         return var0.m18000(var3, (Iface0197<Enum0055>)C0094.f2000[f7000[0]], var4);
      } else if (var1 == (Enum0086)Enum0086.f1000[f7000[1]]) {
         return var0.m18000(var3, (Iface0197)C0075.f1000[f3000[0]], null);
      } else {
         return var1 == (Enum0086)Enum0086.f1000[f3000[1]]
            ? var0.m18000(var3, (Iface0197)NkNw.f1000[f3000[2]], null)
            : var0.m18000(var3, (Iface0197)C0080.f1000[f3000[3]], null);
      }
   }

   private static C0031 m46000(
      String var0, Enum0086 var1, float var2, float var3, float var4, float var5, Iface0202 var6, String var7, Iface0196<Rec0037> var8, int var9, boolean var10
   ) {
      C0056[] var10000 = new C0056[f24000[0]];
      var10000[f5000[4]] = var10 ? (C0056)f14000[f8000[0]] : (C0056)f14000[f8000[1]];
      byte var10002 = f5000[5];
      C0056 var10003 = C0056.m130000().m56000(var2).m50000(var3);
      Rec0057[] var10004 = new Rec0057[f24000[1]];
      var10004[f5000[6]] = Rec0057.m14000((Ilnotljq)f23000[f8000[2]]);
      var10004[f6000[0]] = Rec0057.m18000((Rec0076)f23000[f8000[3]]);
      var10000[var10002] = var10003.m186000(C0258.m10000(var10004)).m110000(var2x -> var2x.m56000(var4).m50000(var5));
      C0056 var11 = C0056.m120000(var10000);
      return C0287.m26000(
         var11,
         var6x -> {
            var6x.N(var0);
            if (var8 != null) {
               var6x.N(
                  Enum0026.f15000,
                  var3xx -> {
                     SelectItemModel$UnbakedSwitch var4xx = (SelectItemModel$UnbakedSwitch)var3xx;
                     if (l1tInqq<"ubbasytf",-29347110,1417262402,1417262419,1417262403,-29347110,-29347110>(var4xx) == Enum0019.f14000
                        && l1tInqq<"zdjsxa",-29347110,1417262402,1417262404,1417262463,-29347110,-29347110>(var4xx)) {
                        var8.m8000(var2xxx -> var2xxx.m22000() == var9 && var2xxx.m16000() == var1 ? var2xxx.m24000() : var2xxx);
                     }
                  }
               );
            }

            var6x.y((C0056)f14000[f3000[4]]);
            var6x.y(m44000(var6, var1, var7));
            if (var1 != (Enum0086)Enum0086.f4000[f25000[0]]) {
               var6x.y((C0056)f14000[f25000[1]]);
            }
         }
      );
   }

   private static void m56000() {
      f23000 = new Object[]{null, null, 0.25F, null, null, 659};
      f16000 = new Object[]{4, 8, 4, 659.0F};
      f14000 = new Object[]{0.5F, 1.0F, null, null, null, null, null, null};
   }

   private static C0031 m62000(Iface0196<Enum0086> var0, Iface0202 var1, String var2) {
      return C0287.m26000((C0056)f14000[f21000[2]], var3 -> {
         C0288 var10000 = (C0288)var3.N(f18000[1]);
         Object[] var10001 = new Object[f24000[2]];
         var10001[f6000[1]] = C0287.m28000((C0056)f14000[f25000[2]]);
         var10001[f6000[2]] = var1.m18000(f18000[2], (Iface0197<OlilOllt>)C0096.f13000[f25000[3]], new OlilOllt(var2, (Enum0086)var0.m2000()));
         var10001[f24000[3]] = C0287.m28000((C0056)f14000[f25000[4]]);
         var10000.N(var10001);
      });
   }

   private static void m74000() {
      f9000 = new String[]{"nursultan:searchQuery", "", "contentTransition", "prev", "prev_", "new"};
      f18000 = new String[]{"", "content:search", "searchResults", "header", "container"};
   }
}

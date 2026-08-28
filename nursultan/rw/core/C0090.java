package rw.core;

import java.util.UUID;
import rw.NursultanClient;
import rw.api.Iface0196;
import rw.api.Iface0197;
import rw.api.Iface0202;
import rw.api.Iface0212;
import rw.data.ConfigFiles;
import rw.data.Rec0272;
import rw.defs.Enum0026;
import rw.defs.Enum0065;
import rw.defs.Enum0082;
import rw.defs.Enum0086;
import rw.setting.C0031;
import rw.setting.C0106;

public class C0090 {
   private static short[] f1000;
   private static String[] f2000;
   private static boolean[] f3000;
   private static float[] f4000;
   private static boolean[] f5000;
   private static float[] f6000;
   private static short[] f7000;
   private static boolean[] f8000;
   private static boolean[] f9000;
   private static boolean[] f10000;
   private static boolean[] f11000;
   private static String[] f12000;
   private static float[] f13000;
   private static float[] f14000;
   private static byte[] f15000;
   private static short[] f16000;
   private static float[] f17000;
   private static boolean[] f18000;
   private static boolean[] f19000;
   private static boolean[] f20000;
   private static String[] f21000;
   private static short[] f22000;
   private static long[] f23000;
   private static String[] f24000;
   private static String[] f25000;
   private static short[] f26000;
   private static boolean[] f27000;
   private static byte[] f28000;
   private static String[] f29000;
   private static short[] f30000;
   private static float[] f31000;
   public static Object[] f32000;
   private static boolean[] f33000;
   private static boolean[] f34000;
   private static byte[] f35000;
   private static byte[] f36000;
   private static boolean[] f37000;
   private static byte[] f38000;
   private static short[] f39000;
   private static byte[] f40000;
   private static byte[] f41000;
   private static float[] f42000;
   private static boolean[] f43000;
   private static byte[] f44000;
   public static Object[] f45000;
   private static byte[] f46000;
   private static boolean[] f47000;
   private static boolean[] f48000;
   private static boolean[] f49000;
   private static float[] f50000;
   private static byte[] f51000;
   public static Object[] f52000;
   private static String[] f53000;
   public static Object[] f54000;
   public static Object[] f55000;
   private static boolean[] f56000;
   private static float[] f57000;
   private static boolean[] f58000;
   private static int[] f59000;
   private static boolean[] f60000;

   private static void m14000() {
      f24000 = new String[]{"nursultan:clientSettingsOpened", "nursultan:searchQuery", "", "searchFocused"};
      f25000 = new String[]{
         "nursultan:accountModalOpened",
         "nursultan:deleteAccountsModalOpened",
         "config.create.sample-name",
         "presetActions",
         "importPresetButton",
         "importPresetIcon"
      };
      f12000 = new String[]{"icon:menu/import", "createPresetButton", "config.create.button"};
      f29000 = new String[]{"createPresetIcon", "icon:menu/plus", "accountActions", "deleteAccountsButton", "deleteAccountsIcon"};
      f21000 = new String[]{"icon:menu/delete", "addAccountButton", "account.create.button", "addAccountIcon"};
      f2000 = new String[]{"icon:menu/plus", "createSlot", "clientSettingsButton", "clientSettingsModal", "clientSettingsDots", "icon:menu/client-settings"};
      f53000 = new String[]{"searchField", "searchInput", "search.place-holder", "searchIcon", "icon:menu/search"};
   }

   private static void m18000() {
      f36000 = new byte[]{50, 3, 4};
      f46000 = new byte[]{5, 6, 2, 6};
      f28000 = new byte[]{7, 2, 2, 2, 3, 4, 2};
      f41000 = new byte[]{4, 2, 4, 2, 2, 16, 3, 3};
      f35000 = new byte[]{4, 2, 4, 2, 2};
      f44000 = new byte[]{2, 2, 16, 3};
      f15000 = new byte[]{3, 2, 3, 4, 2};
      f40000 = new byte[]{3, 5};
      f38000 = new byte[]{4, 2, 24, 3, 20, 8, 16};
      f51000 = new byte[]{2, 12, 5, 5, 6};
   }

   private C0090() {
   }

   static {
      ntfClinit();
   }

   private static void m32000() {
      f39000 = new short[]{1, 3, 0, 5, 1};
      f7000 = new short[]{2, 0, 1, 0, 1, 5};
      f26000 = new short[]{2, 2, 3, 5, 2, 3};
      f16000 = new short[]{2, 3};
      f22000 = new short[]{5, 2, 3, 2, 0, 5, 0};
      f30000 = new short[]{4, 4, 5, 0, 7, 6, 1};
      f1000 = new short[]{5, 4, 2, 1};
   }

   private static void m34000() {
      f23000 = new long[]{0L, 0L, 0L};
   }

   private static void m44000() {
      f59000 = new int[]{6579300, -7171438, -7171438, -7171438};
   }

   private static void m70000() {
      f3000 = new boolean[]{false, false, false};
      f43000 = new boolean[]{false, true, false, true, false, true};
      f8000 = new boolean[]{true, true};
      f5000 = new boolean[]{true, true, false};
      f19000 = new boolean[]{true, false, true, false, true, false};
      f9000 = new boolean[]{true, false, false, true};
      f58000 = new boolean[]{true, false, false, false};
      f37000 = new boolean[]{true, false, true, false, false, false, false};
      f56000 = new boolean[]{false, true, true, false};
      f10000 = new boolean[]{false, true, false, true};
      f11000 = new boolean[]{true, false, false, false};
      f27000 = new boolean[]{true, true};
      f20000 = new boolean[]{false, false, true, false, true, true, true, false};
      f48000 = new boolean[]{false, false, true, false, false};
      f34000 = new boolean[]{true, false, true};
      f33000 = new boolean[]{false, true, false, false, true, false, false};
      f60000 = new boolean[]{true, false, true, true, false, false, true, false};
      f49000 = new boolean[]{false, true};
      f47000 = new boolean[]{false, true, false};
      f18000 = new boolean[]{false, true, false, false, false, true};
   }

   private void m74000() {
      rw.setting.C0108 var1 = NursultanClient.m116000();
      if (var1.m40000() >= f36000[0]) {
         C0106.m32000(C1235.m36000(((Enum0082)Enum0082.f4000[f7000[5]]).m60000()));
      } else {
         String var2 = C1235.m36000(f25000[2]);

         String var3;
         byte[] var4;
         try {
            var3 = C1151.m24000(var2);
            var4 = C0865.m14000(NursultanClient.m88000().m152000());
            C1151.m20000(var4);
         } catch (C1139 var6) {
            C0106.m32000(C1235.m36000(var6.m10000().m60000()));
            return;
         }

         OlsmIikp var5 = new OlsmIikp(
            C0882.m16000(),
            f23000[0],
            var3,
            ((C0959)NursultanClient.f13000[f26000[0]]).m20000(),
            System.currentTimeMillis(),
            f23000[1],
            f23000[2],
            (Enum0065)Enum0065.f2000[f26000[1]],
            f43000[5],
            f8000[0],
            var4
         );
         var1.m54000(var5);
         NursultanClient.m30000().m38000(var5);
         this.m134000(var5.m32000());
      }
   }

   private static void m86000() {
      f31000 = new float[]{96.0F, 100.0F, 89.0F, 20.0F, 20.0F, 0.0F, 100.0F};
      f4000 = new float[]{12.0F, 44.0F, 44.0F, 1.0F};
      f42000 = new float[]{8.0F, 24.0F, 24.0F};
      f14000 = new float[]{44.0F, 12.0F, 0.0F, 0.0F, 44.0F, 16.0F};
      f57000 = new float[]{16.0F, 12.0F, 1.0F, 8.0F, 12.0F, 1.0F, 0.0F};
      f13000 = new float[]{0.0F, 0.0F, 16.0F, 16.0F};
      f50000 = new float[]{0.0F, Float.POSITIVE_INFINITY, 44.0F, 12.0F, 12.0F};
      f17000 = new float[]{8.0F, 1.0F, 8.0F, 20.0F};
      f6000 = new float[]{20.0F, 0.0F, Float.POSITIVE_INFINITY, 0.0F, 100.0F};
   }

   private C0031 m114000(boolean var1) {
      return C0287.m26000(var1 ? (rw.setting.C0056)f54000[f7000[3]] : (rw.setting.C0056)f54000[f7000[4]], var1x -> {
         var1x.N(f25000[3]);
         var1x.N((rw.setting.C0056)f45000[f26000[2]], var1xx -> {
            ((C0288)var1xx).N(f12000[1]);
            ((C0288)var1xx).N(Enum0026.f2000, Base0315::m6000);
            ((C0288)var1xx).N(var1xxx -> this.m74000());
            ((C0288)var1xx).L(var0 -> ((C0286)((C0286)var0).N(f29000[0])).m2000(f29000[1]).N((rw.setting.C0056)f54000[f16000[0]]));
            ((C0288)var1xx).N(C1235.m36000(f12000[2]), (rw.setting.C0056)f54000[f26000[5]]);
         });
         var1x.N((rw.setting.C0056)f32000[f26000[3]], var0 -> {
            ((C0288)var0).N(f25000[4]);
            ((C0288)var0).N(Enum0026.f2000, Base0315::m6000);
            ((C0288)var0).N(var0x -> NursultanClient.m32000().m8000());
            ((C0288)var0).L(var0x -> ((C0286)((C0286)var0x).N(f25000[5])).m2000(f12000[0]).N((rw.setting.C0056)f54000[f26000[4]]));
         });
      });
   }

   private C0031 m128000(Iface0196<Enum0086> var1, Iface0202 var2) {
      NursultanClient.m26000().m2000();
      Iface0196 var3 = var2.m6000(f24000[0], f3000[0]);
      Iface0196 var4 = var2.m6000(f24000[1], f24000[2]);
      Iface0196 var5 = var2.m20000(f24000[3], f3000[1]);
      Iface0196 var6 = var2.m6000(f25000[0], f3000[2]);
      Iface0196 var7 = var2.m6000(f25000[1], f43000[0]);
      boolean var8 = (Boolean)var5.m2000();
      boolean var9 = !var8 && ((String)var4.m2000()).isEmpty() ? f43000[2] : f43000[1];
      return C0287.m26000(
         (rw.setting.C0056)f32000[f39000[1]],
         var10 -> ((C0288)((C0288)var10.y(this.m132000((Enum0086)var1.m2000(), var6, var7)))
               .N(
                  var8 ? (rw.setting.C0056)f52000[f22000[6]] : (rw.setting.C0056)f54000[f30000[0]],
                  var3xx -> {
                     ((C0288)var3xx).N(f53000[0]);
                     ((C0288)var3xx).N(Enum0026.f2000, Base0315::m6000);
                     ((C0288)var3xx).L(
                        var1xxx -> ((C0286)((C0286)var1xxx).N(f53000[3]))
                           .m2000(f53000[4])
                           .N(var9 ? (rw.setting.C0056)f52000[f1000[2]] : (rw.setting.C0056)f52000[f1000[3]])
                     );
                     ((C0288)var3xx).u(var3xxx -> {
                        ((C0300)var3xxx).N(f53000[1]);
                        ((C0300)var3xxx).N((C0290)f55000[f30000[6]]);
                        ((C0300)var3xxx).m2000((String)var4.m2000());
                        ((C0300)var3xxx).N(var9 ? (rw.setting.C0056)f52000[f1000[0]] : (rw.setting.C0056)f52000[f1000[1]]);
                        ((C0300)var3xxx).m6000(C1235.m36000(f53000[2]));
                        ((C0300)var3xxx).N(Enum0026.f11000, var1xxxx -> var5.m6000(f19000[4]));
                        ((C0300)var3xxx).N(Enum0026.f12000, var1xxxx -> var5.m6000(f19000[3]));
                        ((C0300)var3xxx).N(Enum0026.f9000, var1xxxx -> {
                           C0310 var2xxxx = (C0310)var1xxxx;
                           var4.m6000(var2xxxx.m2000());
                        });
                     });
                  }
               ))
            .N(
               (rw.setting.C0056)f32000[f30000[1]],
               var2xx -> ((C0288)var2xx).N(
                  (rw.setting.C0056)f32000[f30000[2]],
                  var2xxx -> {
                     ((C0288)var2xxx).N(f2000[2]);
                     ((C0288)var2xxx).N(Enum0026.f2000, Base0315::m6000);
                     ((C0288)var2xxx).N(var1xxxx -> var3.m6000(f19000[2]));
                     ((C0288)var2xxx).L(
                        var1xxxx -> ((C0286)((C0286)var1xxxx).N(f2000[4]))
                           .m2000(f2000[5])
                           .N(var3.m2000() ? (rw.setting.C0056)f32000[f30000[4]] : (rw.setting.C0056)f32000[f30000[5]])
                     );
                     ((C0288)var2xxx).y(
                        var2.m18000(f2000[3], (Iface0197<Rec0272>)rw.setting.C0009.f7000[f30000[3]], new Rec0272(NursultanClient.m26000(), var3))
                     );
                  }
               )
            )
      );
   }

   private C0031 m132000(Enum0086 var1, Iface0196<Boolean> var2, Iface0196<Boolean> var3) {
      boolean var4 = var1 != (Enum0086)Enum0086.f4000[f39000[2]] && var1 != (Enum0086)Enum0086.f1000[f39000[3]] ? f43000[4] : f43000[3];
      return C0287.m26000(var4 ? (rw.setting.C0056)f45000[f39000[4]] : (rw.setting.C0056)f45000[f7000[0]], var4x -> {
         var4x.N(f2000[1]);
         var4x.y(this.m136000(var1 == (Enum0086)Enum0086.f4000[f22000[4]] ? f5000[1] : f5000[2], var2, var3));
         var4x.y(this.m114000(var1 == (Enum0086)Enum0086.f1000[f22000[5]] ? f19000[0] : f19000[1]));
      });
   }

   private void m134000(UUID var1) {
      C1002 var2 = NursultanClient.m10000().m62000(C1002.class);
      if (!var1.equals(var2.m4000())) {
         var2.m6000(var1);
         ConfigFiles.m54000(C1002.class);
      }
   }

   private C0031 m136000(boolean var1, Iface0196<Boolean> var2, Iface0196<Boolean> var3) {
      return C0287.m26000(var1 ? (rw.setting.C0056)f54000[f7000[1]] : (rw.setting.C0056)f54000[f7000[2]], var2x -> {
         var2x.N(f29000[2]);
         var2x.N((rw.setting.C0056)f45000[f16000[1]], var1xx -> {
            ((C0288)var1xx).N(f21000[1]);
            ((C0288)var1xx).N(Enum0026.f2000, Base0315::m6000);
            ((C0288)var1xx).N(var1xxx -> var2.m6000(f5000[0]));
            ((C0288)var1xx).L(var0xx -> ((C0286)((C0286)var0xx).N(f21000[3])).m2000(f2000[0]).N((rw.setting.C0056)f54000[f22000[3]]));
            ((C0288)var1xx).N(C1235.m36000(f21000[2]), (rw.setting.C0056)f54000[f22000[2]]);
         });
         var2x.N((rw.setting.C0056)f32000[f22000[0]], var1xx -> {
            ((C0288)var1xx).N(f29000[3]);
            ((C0288)var1xx).N(Enum0026.f2000, Base0315::m6000);
            ((C0288)var1xx).N(var1xxx -> var3.m6000(f8000[1]));
            ((C0288)var1xx).L(var0xx -> ((C0286)((C0286)var0xx).N(f29000[4])).m2000(f21000[0]).N((rw.setting.C0056)f54000[f22000[1]]));
         });
      });
   }

   public static Iface0212 m144000() {
      return (Iface0212)((C0290)f55000[f39000[0]]).m2000();
   }

   private static void m148000() {
      f55000 = new Object[]{null, null, 24, 20};
      f32000 = new Object[]{-177970076, 16, 12, null, null, null, null, null};
      f45000 = new Object[]{null, null, null, null, null};
      f54000 = new Object[]{null, null, null, null, null};
      f52000 = new Object[]{null, null, null, null, null, null};
   }
}

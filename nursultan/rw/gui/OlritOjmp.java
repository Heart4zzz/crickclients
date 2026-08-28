package rw.gui;

import java.util.regex.Pattern;
import rw.NursultanClient;
import rw.api.Iface0196;
import rw.api.Iface0202;
import rw.core.Base0315;
import rw.core.C0286;
import rw.core.C0287;
import rw.core.C0288;
import rw.core.C0297;
import rw.core.C0310;
import rw.core.C0319;
import rw.core.C0901;
import rw.core.C0926;
import rw.core.C1063;
import rw.core.C1235;
import rw.core.Noqodls;
import rw.core.OlIrtqjti;
import rw.core.OlkOtqs;
import rw.data.IltqIjstq;
import rw.data.Rec0303;
import rw.defs.Enum0026;
import rw.defs.Enum0085;
import rw.setting.C0031;
import rw.setting.C0056;

public class OlritOjmp {
   private static int[] f1000;
   public static Object[] f2000;
   private static float[] f3000;
   private static float[] f4000;
   private static boolean[] f5000;
   private static byte[] f6000;
   private static byte[] f7000;
   private static boolean[] f8000;
   private static byte[] f9000;
   public static Object[] f10000;
   private static boolean[] f11000;
   private static String[] f12000;
   private static int[] f13000;
   private static float[] f14000;
   private static int[] f15000;
   private static float[] f16000;
   private static boolean[] f17000;
   private static boolean[] f18000;
   public static Object[] f19000;
   private static String[] f20000;
   private static byte[] f21000;
   private static boolean[] f22000;
   private static float[] f23000;
   private static String[] f24000;
   public static Object[] f25000;
   private static boolean[] f26000;
   private static boolean[] f27000;
   private static byte[] f28000;
   private static float[] f29000;
   private static short[] f30000;
   private static float[] f31000;
   private static byte[] f32000;
   private static byte[] f33000;
   private static float[] f34000;
   private static boolean[] f35000;
   private static float[] f36000;
   private static float[] f37000;
   private static boolean[] f38000;
   private static byte[] f39000;
   private static boolean[] f40000;
   private static boolean[] f41000;
   private static boolean[] f42000;
   private static byte[] f43000;
   private static short[] f44000;
   private static float[] f45000;
   private static short[] f46000;
   public static Object[] f47000;
   private static short[] f48000;
   private static byte[] f49000;
   private static boolean[] f50000;
   private static boolean[] f51000;
   private static byte[] f52000;
   private static short[] f53000;
   private static byte[] f54000;
   public static Object[] f55000;
   public static Object[] f56000;
   private static String[] f57000;
   private static short[] f58000;
   private static String[] f59000;
   private static short[] f60000;
   private static byte[] f61000;
   private static float[] f62000;
   private static String[] f63000;

   private static void m10000() {
      f15000 = new int[]{-16777216, -16777216, -7171438};
      f1000 = new int[]{-7171438, -7171438};
      f13000 = new int[]{-7171438, -896990, -8406528, -16734993, -896990, -8406528, -16734993};
   }

   private static void m20000() {
      f45000 = new float[]{8.0F, 8.0F, 0.0F};
      f4000 = new float[]{0.0F, 0.0F, 0.0F};
      f62000 = new float[]{16.0F, 5.0F, 0.35F, 1.0F, 360.0F, 16.0F, 12.0F};
      f36000 = new float[]{1.0F, 12.0F, 20.0F, 0.25F, 100.0F, 16.0F};
      f16000 = new float[]{16.0F, 16.0F};
      f29000 = new float[]{16.0F, 100.0F, 44.0F, 8.0F, 0.0F, Float.POSITIVE_INFINITY};
      f31000 = new float[]{44.0F, 12.0F, 12.0F, 1.0F, 8.0F, 0.0F, Float.POSITIVE_INFINITY, 0.0F};
      f3000 = new float[]{100.0F, 100.0F, 44.0F};
      f37000 = new float[]{12.0F, 1.0F, 8.0F, 20.0F};
      f14000 = new float[]{20.0F, 44.0F};
      f34000 = new float[]{44.0F, 1.0F, 8.0F, 18.0F, 18.0F, 2.0F, 18.0F};
      f23000 = new float[]{8.0F, 2.0F};
   }

   private OlritOjmp() {
   }

   static {
      ntfClinit();
   }

   private static C0056 m26000(int var0) {
      return C0056.m130000().m78000(f45000[0], f45000[1]).m86000(var0);
   }

   private static void m30000() {
      f33000 = new byte[]{2, 2, 2, 20, 5, 2, 4};
      f61000 = new byte[]{5, 4, 6, 4, 7, 2};
      f39000 = new byte[]{16, 3, 2, 2, 2, 3};
      f54000 = new byte[]{2, 2, 2, 3, 3, 4, 2, 2};
      f9000 = new byte[]{3, 5, 2};
      f7000 = new byte[]{16, 3, 6, 2, 13, 3, 7};
      f21000 = new byte[]{2, 13};
      f28000 = new byte[]{3, 2, 3, 4, 5, 6, 6, 3};
      f32000 = new byte[]{4, 5, 2};
      f49000 = new byte[]{44, 7, 18};
      f52000 = new byte[]{8, 2, 2, 3};
      f43000 = new byte[]{4, 5, 6, 8};
      f6000 = new byte[]{3, 16, 4, 8, 7};
   }

   private static void m40000() {
      f48000 = new short[]{6, 4, 0, 6, 1, 4};
      f58000 = new short[]{5, 2};
      f44000 = new short[]{2, 5, 6, 3, 4, 7, 1, 5};
      f60000 = new short[]{0, 1, 1, 5, 0, 7, 6, 6};
      f53000 = new short[]{2, 1, 3, 0};
      f46000 = new short[]{257, 335, 2, 2, 256, 0, 0};
      f30000 = new short[]{1001, -29813, -18176, 256, 257, 335, 360, -18176};
   }

   private static C0031 m62000() {
      return C0287.m26000((C0056)f2000[f48000[4]], var0 -> {
         var0.N((C0056)f2000[f58000[1]], var0x -> {
            var0x.y((C0056)f2000[f44000[3]]);
            var0x.y((C0056)f2000[f44000[4]]);
         });
         var0.N((C0056)f2000[f44000[0]], var0x -> {
            var0x.y((C0056)f2000[f44000[1]]);
            var0x.y((C0056)f2000[f44000[2]]);
         });
      });
   }

   private static void m82000() {
      f51000 = new boolean[]{false, false, false, false, false, false, true};
      f50000 = new boolean[]{false, false, false, false, false, false};
      f27000 = new boolean[]{true, true, false, false, true};
      f18000 = new boolean[]{true, false, false};
      f40000 = new boolean[]{false, false, true, true};
      f11000 = new boolean[]{false, true};
      f17000 = new boolean[]{false, true, false, true};
      f41000 = new boolean[]{false, false};
      f38000 = new boolean[]{false, true, true};
      f35000 = new boolean[]{false, true};
      f5000 = new boolean[]{false, true};
      f26000 = new boolean[]{true, false};
      f8000 = new boolean[]{false, false, false, true};
      f22000 = new boolean[]{false, true, false};
      f42000 = new boolean[]{true, false, true, true, false, true, false, true};
   }

   private static C0031 m94000(Iface0196<String> var0, Iface0196<Boolean> var1) {
      return C0287.m26000((C0056)f55000[f48000[5]], var2 -> {
         var2.N(f63000[0]);
         var2.N(Enum0026.f2000, Base0315::m6000);
         var2.N(var2x -> {
            m110000(var0, var1);
            var2x.m6000();
         });
         var2.L(var0xx -> var0xx.m2000(f63000[1]).N((C0056)f55000[f58000[0]]));
      });
   }

   private static void m108000() {
      f56000 = new Object[]{null, f59000[4], null, 256, 257, 335};
      f47000 = new Object[]{360, 44};
      f10000 = new Object[]{18, 8, 2, -896990, -8406528, -16734993, -18176};
      f19000 = new Object[]{null, null, null, 16, null, null, null, null};
      f25000 = new Object[]{null, null, null, null};
      f55000 = new Object[]{null, null, null, null, null, null, null, null};
      f2000 = new Object[]{null, null, null, null, null, null, null};
   }

   private static void m110000(Iface0196<String> var0, Iface0196<Boolean> var1) {
      String var2 = ((String)var0.m2000()).trim();
      if (!var2.isEmpty()) {
         NursultanClient.m48000().m8000(new Noqodls(Rec0303.m18000(var2), f51000[2], System.currentTimeMillis()));
         var0.m6000(f20000[1]);
         var1.m6000(f51000[3]);
      }
   }

   private static String m118000(IltqIjstq var0) {
      return var0.m8000() != null ? C1235.m36000(var0.m8000()) : null;
   }

   private static void m126000(Iface0196<Boolean> var0) {
      if (NursultanClient.m82000().m72000()) {
         NursultanClient.m82000().m56000(new OlkOtqs());
      } else {
         C0901.m22000(C0901.m20000());
      }

      var0.m6000(f51000[4]);
   }

   private C0031 m128000(Void var1, Iface0202 var2) {
      Iface0196 var3 = var2.m6000(f57000[0], f51000[0]);
      if (!(Boolean)var3.m2000()) {
         return C0287.m24000(var0 -> ((C0288)var0.N(f59000[0])).N(C1063.m20000()));
      } else {
         OlIrtqjti var4 = var2.m28000((C0297<OlIrtqjti>)OlIrtqjti.f4000[f48000[0]]);
         Iface0196 var5 = var2.m20000(f57000[1], f57000[2]);
         IltqIjstq var6 = var2.m2000(f20000[0], C0926::m46000);
         if (var6.m6000() == (Enum0085)Enum0085.f6000[f48000[1]]) {
            C0926.m32000();
            var3.m6000(f51000[1]);
         }

         return C0287.m26000((C0056)f19000[f48000[2]], var4x -> {
            var4x.N(f63000[3]);
            var4x.N(Enum0026.f2000, Base0315::m6000);
            var4x.N(Enum0026.f4000, Base0315::m6000);
            var4x.N(Enum0026.f6000, var1xx -> {
               if (var1xx instanceof C0319 var2xx && var2xx.m6000() && var2xx.m8000() == f46000[4]) {
                  var3.m6000(f50000[1]);
                  var1xx.m6000();
               }
            });
            var4x.N((C0056)f19000[f44000[6]], var4xx -> {
               var4xx.N(f63000[4]);
               var4xx.N(Enum0026.f2000, Base0315::m6000);
               var4xx.N(Enum0026.f4000, Base0315::m6000);
               var4xx.N((C0056)f19000[f44000[7]], var1xxx -> {
                  var1xxx.N(C1235.m36000(f12000[2]), (C0056)f19000[f46000[3]]);
                  var1xxx.y(m136000(f12000[3], () -> var3.m6000(f50000[0])));
               });
               var4xx.N((C0056)f25000[f60000[0]], var2xxx -> {
                  var2xxx.N((C0056)f25000[f53000[1]], var2xxxx -> var2xxxx.u(var2xxxxx -> {
                     var2xxxxx.N(f12000[0]);
                     var2xxxxx.m2000((String)var5.m2000());
                     var2xxxxx.N(((String)var5.m2000()).isEmpty() ? (C0056)f25000[f53000[2]] : (C0056)f55000[f53000[3]]);
                     var2xxxxx.m6000(C1235.m36000(f12000[1]));
                     var2xxxxx.N(Enum0026.f9000, var1xxxxxx -> {
                        C0310 var2xxxxxx = (C0310)var1xxxxxx;
                        String var3xxx = var2xxxxxx.m2000();
                        if (!var3xxx.isEmpty() && !((Pattern)f56000[f46000[2]]).matcher(var3xxx).matches()) {
                           var1xxxxxx.m26000().m42000(var2xxxxxx.m4000());
                        } else {
                           var5.m6000(var3xxx);
                        }
                     });
                     var2xxxxx.N(Enum0026.f6000, var2xxxxxx -> {
                        if (var2xxxxxx instanceof C0319 var3xxx && var3xxx.m6000() && (var3xxx.m8000() == f46000[0] || var3xxx.m8000() == f46000[1])) {
                           m110000(var5, var3);
                           var2xxxxxx.m6000();
                        }
                     });
                  }));
                  var2xxx.y(m94000(var5, var3));
               });
               var4xx.N((C0056)f55000[f60000[1]], var2xxx -> {
                  var2xxx.N(f24000[1]);
                  var2xxx.N(Enum0026.f2000, Base0315::m6000);
                  var2xxx.N(var1xxxx -> m126000(var3));
                  var2xxx.L(var1xxxx -> {
                     C0286 var10000 = var1xxxx.m2000(f24000[3]);
                     C0056[] var10001 = new C0056[f33000[0]];
                     var10001[f51000[5]] = (C0056)f55000[f53000[0]];
                     var10001[f51000[6]] = C0056.m130000().m40000(var4.m6000());
                     var10000.N(C0056.m120000(var10001));
                  });
                  var2xxx.N(C1235.m36000(f24000[2]), (C0056)f55000[f60000[7]]);
               });
               var4xx.N((C0056)f55000[f60000[2]], var0xx -> {
                  var0xx.N(f63000[5]);
                  var0xx.N(Enum0026.f2000, Base0315::m6000);
                  var0xx.N(var0xxx -> C0926.m2000());
                  var0xx.y(m62000());
                  var0xx.N(C1235.m36000(f24000[0]), (C0056)f55000[f60000[6]]);
               });
               String var5x = m118000(var6);
               if (var5x != null) {
                  C0056 var6x = var6.m6000() == (Enum0085)Enum0085.f6000[f60000[3]] ? (C0056)f2000[f60000[4]] : (C0056)f55000[f60000[5]];
                  var4xx.N(var5x, var6x);
               }
            });
         });
      }
   }

   private static C0031 m136000(String var0, Runnable var1) {
      return C0287.m26000((C0056)f19000[f48000[3]], var2 -> {
         var2.N(var0);
         var2.N(Enum0026.f2000, Base0315::m6000);
         var2.N(var1xx -> {
            var1.run();
            var1xx.m6000();
         });
         var2.L(var0xx -> var0xx.m2000(f63000[2]).N((C0056)f19000[f44000[5]]));
      });
   }

   private static void m148000() {
      f57000 = new String[]{"nursultan:accountModalOpened", "accountNick", ""};
      f20000 = new String[]{"microsoftLogin", ""};
      f63000 = new String[]{"addGenerated", "icon:menu/plus", "icon:menu/xmark", "accountModalBlur", "accountModalPanel", "microsoftAccountButton"};
      f24000 = new String[]{"account.modal.microsoft", "generateAccountButton", "account.modal.generate", "icon:menu/sparkles"};
      f12000 = new String[]{"accountNickInput", "account.modal.nickname", "account.modal.title", "accountModalClose"};
      f59000 = new String[]{"accountModalHidden", "^[а-яА-Яa-zA-Z0-9_Ёё]{1,16}$", "account.modal.close", "account.modal.add", "nursultan:accountModalOpened"};
   }
}

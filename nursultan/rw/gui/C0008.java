package rw.gui;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import rw.NursultanClient;
import rw.api.Iface0196;
import rw.api.Iface0197;
import rw.api.Iface0202;
import rw.core.Base0315;
import rw.core.C0248;
import rw.core.C0287;
import rw.core.C0288;
import rw.core.C0297;
import rw.core.C0310;
import rw.core.C0319;
import rw.core.C1013;
import rw.core.C1058;
import rw.core.C1063;
import rw.core.C1235;
import rw.core.OlIrtqjti;
import rw.core.OlsmIikp;
import rw.data.OlkIrprsq;
import rw.data.Rec0032;
import rw.data.Rec0209;
import rw.data.Rec0253;
import rw.defs.Enum0026;
import rw.defs.Enum0068;
import rw.defs.OlmmOsl;
import rw.net.IlkmktOi;
import rw.setting.C0031;
import rw.setting.C0056;

public class C0008 {
   private static float[] f1000;
   private static boolean[] f2000;
   private static byte[] f3000;
   private static float[] f4000;
   public static Object[] f5000;
   private static float[] f6000;
   private static String[] f7000;
   private static short[] f8000;
   private static boolean[] f9000;
   private static String[] f10000;
   private static boolean[] f11000;
   private static byte[] f12000;
   private static String[] f13000;
   private static float[] f14000;
   public static Object[] f15000;
   private static int[] f16000;
   private static String[] f17000;
   private static String[] f18000;
   private static float[] f19000;
   private static float[] f20000;
   private static float[] f21000;
   private static long[] f22000;
   public static Object[] f23000;
   private static String[] f24000;
   private static float[] f25000;
   private static String[] f26000;
   private static byte[] f27000;
   private static short[] f28000;
   private static byte[] f29000;
   private static short[] f30000;
   private static short[] f31000;
   private static boolean[] f32000;
   private static short[] f33000;
   private static boolean[] f34000;
   private static boolean[] f35000;
   private static float[] f36000;
   private static boolean[] f37000;
   private static float[] f38000;
   private static boolean[] f39000;
   private static byte[] f40000;
   public static Object[] f41000;
   private static byte[] f42000;
   private static short[] f43000;
   private static byte[] f44000;
   private static boolean[] f45000;
   private static byte[] f46000;
   private static byte[] f47000;
   public static Object[] f48000;
   private static String[] f49000;
   public static Object[] f50000;
   private static byte[] f51000;
   private static byte[] f52000;
   private static String[] f53000;
   private static short[] f54000;
   private static short[] f55000;
   private static float[] f56000;
   public static Object[] f57000;
   private static byte[] f58000;
   private static byte[] f59000;
   private static short[] f60000;
   private static byte[] f61000;
   private static short[] f62000;
   private static boolean[] f63000;
   private static String[] f64000;
   private static short[] f65000;
   private static byte[] f66000;
   private static String[] f67000;
   private static boolean[] f68000;
   private static boolean[] f69000;
   private static boolean[] f70000;
   private static boolean[] f71000;

   private static boolean m16000(Rec0253 var0) {
      return var0 != null && var0.m18000() != f22000[4] ? f32000[6] : f37000[0];
   }

   private static void m22000() {
      f22000 = new long[]{0L, 0L, 86400000L, 0L, 0L, 86400000L};
   }

   private C0008() {
   }

   static {
      ntfClinit();
   }

   private static void m32000() {
      f6000 = new float[]{0.15F, 328.0F, -12.0F, 0.0F, 0.0F, 0.0F};
      f36000 = new float[]{0.0F, 16.0F};
      f1000 = new float[]{5.0F, 0.35F, 1.0F, 360.0F, 16.0F, 12.0F, 1.0F};
      f56000 = new float[]{12.0F, 20.0F, 0.25F, 100.0F, 16.0F};
      f20000 = new float[]{16.0F, 16.0F, 16.0F, 100.0F};
      f14000 = new float[]{6.0F, 100.0F};
      f19000 = new float[]{44.0F, 12.0F, 12.0F};
      f38000 = new float[]{1.0F, 8.0F, 12.0F};
      f21000 = new float[]{12.0F, 100.0F, 44.0F, 12.0F, 12.0F, 1.0F, 8.0F};
      f4000 = new float[]{0.0F, Float.POSITIVE_INFINITY, 0.0F, 100.0F};
      f25000 = new float[]{100.0F, 44.0F, 12.0F, 1.0F, 8.0F, 328.0F};
   }

   private static List<C1013> m36000(int var0) {
      ArrayList var1 = new ArrayList(((List)f50000[f31000[6]]).size());

      for (int var2 = f45000[4]; var2 < ((List)f50000[f33000[0]]).size(); var2++) {
         var1.add(new C1013(((Rec0032)((List)f50000[f33000[1]]).get(var2)).m6000(), var2 == var0 ? f45000[5] : f32000[0]));
      }

      return var1;
   }

   private static void m40000() {
      f45000 = new boolean[]{true, false, true, false, false, true};
      f32000 = new boolean[]{false, false, true, false, false, false, true};
      f37000 = new boolean[]{false, false, true, false};
      f2000 = new boolean[]{true, true};
      f70000 = new boolean[]{false, true, true, false, false, false, true, false};
      f11000 = new boolean[]{true, false, false, true, true, true};
      f63000 = new boolean[]{true, true, false, false, false, true, false, true};
      f34000 = new boolean[]{false, false, true, false};
      f71000 = new boolean[]{true, false, true, false};
      f35000 = new boolean[]{true, false, true, false, true};
      f68000 = new boolean[]{false, false, true, false, false, true, false, false};
      f69000 = new boolean[]{true, true, false};
      f9000 = new boolean[]{true, false, true, false, true};
      f39000 = new boolean[]{true, false, true, false, false};
   }

   private static void m44000() {
      f28000 = new short[]{6, 1, 2};
      f30000 = new short[]{0, 1};
      f31000 = new short[]{3, 7, 6, 2, 0, 2, 0};
      f33000 = new short[]{0, 0};
      f60000 = new short[]{0, 0, 0, 9999, 6, 3, 4, 5};
      f62000 = new short[]{1, 0, 0};
      f54000 = new short[]{1, 4, 2, 2, 5, 6};
      f43000 = new short[]{6, 6, 5, 5, 6, 0};
      f8000 = new short[]{1, 1, 4, 0, 0, 2};
      f65000 = new short[]{2, 3, 3, 256, 0, 1001, -29813};
      f55000 = new short[]{256, 360, -29813};
   }

   private static void m80000() {
      f41000 = new Object[]{null, f13000[2], 256, 360};
      f23000 = new Object[]{44, -29813, 12, f13000[3], 16, 12, 328.0F};
      f57000 = new Object[]{86400000L, null, null};
      f50000 = new Object[]{null, null, null, null};
      f15000 = new Object[]{16, null, null, null, null, null, null, null};
      f5000 = new Object[]{null, null, null, null, null, null, null};
      f48000 = new Object[]{null, null, null, null, null};
   }

   private static void m98000() {
      f16000 = new int[]{-16777216, -16777216, -7171438, -7171438, -7171438, -7171438, -7171438, -1720197};
   }

   private static C0056 m104000(OlIrtqjti var0) {
      C0056[] var10000 = new C0056[f3000[1]];
      var10000[f37000[3]] = C0056.m130000().m40000(var0.m6000());
      var10000[f2000[0]] = rw.setting.C0017.m22000(f3000[2], (OlmmOsl)OlmmOsl.f7000[f60000[5]]);
      return C0056.m120000(var10000);
   }

   private static String m108000(Rec0253 var0) {
      return m16000(var0)
         ? C1235.m36000(f7000[1])
            + " "
            + LocalDateTime.ofInstant(Instant.ofEpochMilli(var0.m18000()), ZoneId.systemDefault()).format((DateTimeFormatter)f57000[f31000[5]])
         : C1235.m36000(f17000[0]);
   }

   private static void m110000(OlsmIikp var0) {
      NursultanClient.m32000().m92000(var0.m16000(), f22000[3], f32000[2]);
   }

   private static int m112000(String var0) {
      String var1 = var0.trim();
      if (var1.isEmpty()) {
         return f32000[3];
      } else {
         try {
            int var2 = Integer.parseInt(var1);
            return var2 <= 0 ? f32000[4] : Math.min(var2, f60000[3]);
         } catch (NumberFormatException var3) {
            return f32000[5];
         }
      }
   }

   private static C0031 m128000(Iface0202 var0, Iface0196<Integer> var1, Iface0196<Boolean> var2) {
      C0056 var3 = var2.m2000() ? (C0056)f15000[f31000[1]] : (C0056)f15000[f31000[2]];
      return C0287.m26000(
         var3,
         var3x -> {
            var3x.N(f17000[4]);
            var3x.N(Enum0026.f2000, Base0315::m6000);
            var3x.N(m156000((Integer)var1.m2000()), (C0056)f5000[f62000[1]]);
            var3x.L(var0xx -> {
               var0xx.N(f26000[0]);
               var0xx.m2000(f26000[1]);
               var0xx.N((C0056)f5000[f54000[0]]);
            });
            var3x.N(var1xx -> {
               var2.m6000(f2000[1]);
               var1xx.m6000();
            });
            var3x.y(
               var0.m18000(
                  f17000[5],
                  (Iface0197<OlkIrprsq>)C1058.f6000[f62000[2]],
                  new OlkIrprsq(m36000((Integer)var1.m2000()), var2, var1xx -> m170000(var1, var1xx), f6000[1], f6000[2])
               )
            );
         }
      );
   }

   private static void m132000(Iface0202 var0, UUID var1) {
      var0.m16000("shareSeenGen:" + var1);
      var0.m16000("shareDuration:" + var1);
      var0.m16000("shareDurationOpen:" + var1);
      var0.m16000("shareActs:" + var1);
   }

   private static String m136000(Rec0253 var0) {
      return var0.m12000() == 0 ? String.valueOf(var0.m2000()) : var0.m2000() + " / " + var0.m12000();
   }

   private C0031 m142000(Void var1, Iface0202 var2) {
      Iface0196 var3 = var2.m6000(f10000[0], (UUID)null);
      UUID var4 = (UUID)var3.m2000();
      if (var4 == null) {
         return C0287.m24000(var0 -> ((C0288)var0.N(f53000[2])).N(C1063.m20000()));
      } else {
         OlsmIikp var5 = NursultanClient.m116000().m66000(var4).orElse(null);
         if (var5 != null && var5.m16000() > IItmnrqri<"viyg",-2028296227,-822152112,-822152177,-822152144,1953556734,-1841879680>()[0]) {
            boolean var6 = Boolean.TRUE.equals(var2.m2000(f10000[1], () -> NursultanClient.m82000().m72000()));
            if (!var6) {
               var3.m6000(null);
               return C0287.m24000(var0 -> ((C0288)var0.N(f53000[0])).N(C1063.m20000()));
            } else {
               OlIrtqjti var7 = var2.m28000((C0297<OlIrtqjti>)OlIrtqjti.f4000[f28000[0]]);
               IlkmktOi var8 = NursultanClient.m32000();
               long var9 = var5.m16000();
               Rec0253 var11 = var2.m2000("shareEntry:" + var4, () -> var8.m36000(var9));
               boolean var12 = var11 != null ? f45000[0] : f45000[1];
               Rec0209 var13 = var2.m2000(f10000[2], var8::m88000);
               Iface0196 var14 = var2.m20000("shareSeenGen:" + var4, var13.m20000());
               if (var13.m20000() > (Long)var14.m2000() && var13.m14000() == var9) {
                  var14.m6000(var13.m20000());
                  if (var13.m22000() == (Enum0068)Enum0068.f1000[f28000[1]] || var13.m22000() == (Enum0068)Enum0068.f1000[f28000[2]]) {
                     m132000(var2, var4);
                     var3.m6000(null);
                     return C0287.m24000(var0 -> ((C0288)var0.N(f24000[3])).N(C1063.m20000()));
                  }
               }

               Iface0196 var15 = var2.m20000("shareDuration:" + var4, ((List)f50000[f30000[0]]).size() - f45000[2]);
               Iface0196 var16 = var2.m20000("shareDurationOpen:" + var4, f45000[3]);
               Iface0196 var17 = var2.m20000("shareActs:" + var4, f7000[0]);
               return C0287.m26000((C0056)f50000[f30000[1]], var13x -> {
                  var13x.N(f49000[1]);
                  var13x.N(Enum0026.f2000, Base0315::m6000);
                  var13x.N(Enum0026.f4000, Base0315::m6000);
                  var13x.N(Enum0026.f6000, var1xx -> {
                     if (var1xx instanceof C0319 var2xx && var2xx.m6000() && var2xx.m8000() == f65000[3]) {
                        var3.m6000(null);
                        var1xx.m6000();
                     }
                  });
                  var13x.N((C0056)f50000[f54000[2]], var13xx -> {
                     var13xx.N(f49000[2]);
                     var13xx.N(Enum0026.f2000, Base0315::m6000);
                     var13xx.N(Enum0026.f4000, Base0315::m6000);
                     var13xx.N((C0056)f15000[f54000[3]], var2xxx -> {
                        var2xxx.N(C1235.m36000(var12 ? f24000[0] : f24000[1]), (C0056)f50000[f65000[2]]);
                        var2xxx.y(m166000(f24000[2], () -> var3.m6000(null)));
                     });
                     if (var12) {
                        var13xx.N((C0056)f15000[f54000[4]], var1xxx -> {
                           var1xxx.N(f64000[5]);
                           var1xxx.N(m108000(var11), (C0056)f48000[f8000[5]]);
                           var1xxx.N(C1235.m36000(f64000[6]) + " " + m136000(var11), (C0056)f48000[f65000[0]]);
                           if (var11.m24000()) {
                              var1xxx.N(C1235.m36000(f64000[7]), (C0056)f48000[f65000[1]]);
                           }
                        });
                        var13xx.N((C0056)f5000[f54000[5]], var5xxx -> {
                           var5xxx.N(f64000[3]);
                           var5xxx.N(Enum0026.f2000, Base0315::m6000);
                           var5xxx.N(var5xxxx -> {
                              var8.m86000(var11);
                              m132000(var2, var4);
                              var3.m6000(null);
                              var5xxxx.m6000();
                           });
                           var5xxx.N(C1235.m36000(f64000[4]), (C0056)f48000[f8000[4]]);
                        });
                        var13xx.N((C0056)f5000[f43000[0]], var3xxx -> {
                           var3xxx.N(f64000[1]);
                           var3xxx.N(Enum0026.f2000, Base0315::m6000);
                           var3xxx.N(var3xxxx -> {
                              var8.m54000(var9);
                              var3xxxx.m6000();
                           });
                           var3xxx.N(C1235.m36000(f64000[2]), (C0056)f48000[f8000[3]]);
                        });
                        var13xx.N((C0056)f5000[f43000[1]], var4xxx -> {
                           var4xxx.N(f67000[6]);
                           var4xxx.N(Enum0026.f2000, Base0315::m6000);
                           var4xxx.N(var4xxxx -> {
                              m184000(var5);
                              m132000(var2, var4);
                              var3.m6000(null);
                              var4xxxx.m6000();
                           });
                           var4xxx.N(C1235.m36000(f64000[0]), (C0056)f48000[f8000[2]]);
                        });
                     } else {
                        var13xx.N((C0056)f15000[f43000[2]], var3xxx -> {
                           var3xxx.N(f67000[4]);
                           var3xxx.N(C1235.m36000(f67000[5]), (C0056)f48000[f8000[1]]);
                           var3xxx.y(m128000(var2, var15, var16));
                        });
                        var13xx.N((C0056)f15000[f43000[3]], var1xxx -> {
                           var1xxx.N(f67000[2]);
                           var1xxx.N(C1235.m36000(f67000[3]), (C0056)f48000[f8000[0]]);
                           var1xxx.y(m146000(var17));
                        });
                        var13xx.N((C0056)f5000[f43000[4]], var6xxx -> {
                           var6xxx.N(f67000[0]);
                           var6xxx.N(Enum0026.f2000, Base0315::m6000);
                           var6xxx.N(var6xxxx -> {
                              m176000(var5, var15, var17);
                              m132000(var2, var4);
                              var3.m6000(null);
                              var6xxxx.m6000();
                           });
                           var6xxx.N(C1235.m36000(f67000[1]), (C0056)f48000[f43000[5]]);
                        });
                        var13xx.N(m182000(var7), var5xxx -> {
                           var5xxx.N(f18000[0]);
                           var5xxx.N(Enum0026.f2000, Base0315::m6000);
                           var5xxx.N(var4xxxx -> {
                              m110000(var5);
                              m132000(var2, var4);
                              var3.m6000(null);
                              var4xxxx.m6000();
                           });
                           var5xxx.N(C1235.m36000(f18000[1]), m104000(var7));
                        });
                     }
                  });
               });
            }
         } else {
            var3.m6000(null);
            return C0287.m24000(var0 -> ((C0288)var0.N(f53000[1])).N(C1063.m20000()));
         }
      }
   }

   private static C0031 m146000(Iface0196<String> var0) {
      return C0287.m26000((C0056)f5000[f31000[3]], var1 -> {
         var1.N(f17000[1]);
         var1.u(var1x -> {
            var1x.N(f17000[2]);
            var1x.m2000((String)var0.m2000());
            var1x.N(((String)var0.m2000()).isEmpty() ? (C0056)f5000[f60000[6]] : (C0056)f5000[f60000[7]]);
            var1x.m6000(C1235.m36000(f17000[3]));
            var1x.N(Enum0026.f9000, var1xx -> {
               C0310 var2 = (C0310)var1xx;
               String var3 = var2.m2000();
               if (((Pattern)f57000[f62000[0]]).matcher(var3).matches()) {
                  var0.m6000(var3);
               } else {
                  var1xx.m26000().m42000(var2.m4000());
               }
            });
         });
      });
   }

   private static void m150000() {
      f3000 = new byte[]{2, 2, 16, 2, 7};
      f59000 = new byte[]{30, 2, 2, 20, 5, 3, 2, 3};
      f52000 = new byte[]{4, 5, 6, 2};
      f44000 = new byte[]{6, 2, 7, 2};
      f47000 = new byte[]{16, 3};
      f51000 = new byte[]{2, 2, 16, 3, 3, 2, 3, 4};
      f58000 = new byte[]{2, 3};
      f29000 = new byte[]{5, 6, 2, 16, 3};
      f46000 = new byte[]{2, 13, 3, 2, 14};
      f42000 = new byte[]{3, 2, 2, 14, 3, 3};
      f12000 = new byte[]{2, 16, 3};
      f27000 = new byte[]{4, 4, 2, 3, 7, 44, 2, 12};
      f40000 = new byte[]{3, 4, 16};
      f61000 = new byte[]{5, 12, 6, 3, 4, 8};
      f66000 = new byte[]{16, 7, 5};
   }

   private static String m156000(int var0) {
      return C1235.m36000("entry." + ((Rec0032)((List)f50000[f31000[4]]).get(var0)).m6000());
   }

   private static C0031 m166000(String var0, Runnable var1) {
      return C0287.m26000((C0056)f15000[f31000[0]], var2 -> {
         var2.N(var0);
         var2.N(Enum0026.f2000, Base0315::m6000);
         var2.N(var1xx -> {
            var1.run();
            var1xx.m6000();
         });
         var2.L(var0xx -> var0xx.m2000(f49000[0]).N((C0056)f15000[f54000[1]]));
      });
   }

   private static void m170000(Iface0196<Integer> var0, C1013 var1) {
      for (int var2 = f32000[1]; var2 < ((List)f50000[f60000[0]]).size(); var2++) {
         if (var1.m22000().m10000().equals("entry." + ((Rec0032)((List)f50000[f60000[1]]).get(var2)).m6000())) {
            var0.m6000(var2);
            return;
         }
      }
   }

   private static void m176000(OlsmIikp var0, Iface0196<Integer> var1, Iface0196<String> var2) {
      int var3 = ((Rec0032)((List)f50000[f60000[2]]).get((Integer)var1.m2000())).m4000();
      long var4 = var3 == 0 ? f22000[1] : System.currentTimeMillis() + var3 * f22000[2];
      NursultanClient.m32000().m92000(var0.m16000(), var4, m112000((String)var2.m2000()));
   }

   private static C0056 m182000(OlIrtqjti var0) {
      C0056[] var10000 = new C0056[f3000[0]];
      var10000[f37000[1]] = (C0056)f5000[f60000[4]];
      var10000[f37000[2]] = C0056.m130000().m86000(C0248.m14000(var0.m6000(), f6000[0])).m72000(var0.m6000());
      return C0056.m120000(var10000);
   }

   private static void m184000(OlsmIikp var0) {
      NursultanClient.m32000().m60000(var0.m16000());
   }

   private static void m192000() {
      f10000 = new String[]{"nursultan:shareModalTarget", "shareModalConnected", "shareSignal"};
      f7000 = new String[]{"", "share.modal.expires"};
      f17000 = new String[]{
         "share.modal.forever", "shareActivationsField", "shareActivationsInput", "share.modal.unlimited", "shareDurationField", "shareDurationList"
      };
      f26000 = new String[]{"shareDurationChevron", "icon:menu/angles"};
      f49000 = new String[]{"icon:menu/xmark", "shareModalBlur", "shareModalPanel"};
      f18000 = new String[]{"shareCopyOnceButton", "share.modal.copy-once"};
      f67000 = new String[]{
         "shareCopyLinkButton",
         "share.modal.copy-link",
         "shareLimitGroup",
         "share.modal.limit",
         "shareDurationGroup",
         "share.modal.duration",
         "shareDeleteButton"
      };
      f64000 = new String[]{
         "share.modal.delete-link",
         "shareRefreshButton",
         "share.modal.refresh",
         "shareCopyExistingButton",
         "share.modal.copy",
         "shareInfoGroup",
         "share.modal.used",
         "share.modal.stale-hint"
      };
      f24000 = new String[]{"share.modal.title-shared", "share.modal.title", "shareModalClose", "shareModalHidden"};
      f53000 = new String[]{
         "shareModalHidden", "shareModalHidden", "shareModalHidden", "^[0-9]{0,4}$", "HH:mm dd.MM.yyyy", "share-1-day", "share-7-days", "share-30-days"
      };
      f13000 = new String[]{"share-forever", "share.modal.close", "nursultan:shareModalTarget", "icon:menu/angles"};
   }
}

package rw.setting;

import rw.GuiWidget;
import rw.NursultanClient;
import rw.api.Iface0196;
import rw.api.Iface0197;
import rw.api.Iface0202;
import rw.api.Iface0212;
import rw.core.Base0315;
import rw.core.C0097;
import rw.core.C0286;
import rw.core.C0287;
import rw.core.C0288;
import rw.core.C0297;
import rw.core.C0306;
import rw.core.C0318;
import rw.core.C1059;
import rw.core.C1235;
import rw.core.OlIrtqjti;
import rw.data.IlpimlpIt;
import rw.data.Rec0107;
import rw.data.Rec0264;
import rw.data.Rec0272;
import rw.data.Rec0274;
import rw.defs.Enum0026;

public class C0015 {
   private static byte[] f1000;
   private static short[] f2000;
   private static byte[] f3000;
   private static boolean[] f4000;
   public static Object[] f5000;
   public static Object[] f6000;
   private static String[] f7000;
   private static short[] f8000;
   private static float[] f9000;
   private static boolean[] f10000;
   public static Object[] f11000;
   private static int[] f12000;
   private static boolean[] f13000;
   private static short[] f14000;
   private static boolean[] f15000;
   private static boolean[] f16000;
   private static byte[] f17000;
   private static float[] f18000;
   private static byte[] f19000;
   private static short[] f20000;
   private static boolean[] f21000;
   private static boolean[] f22000;
   private static boolean[] f23000;
   private static short[] f24000;
   private static byte[] f25000;
   private static boolean[] f26000;
   private static boolean[] f27000;
   private static boolean[] f28000;
   private static String[] f29000;
   private static boolean[] f30000;
   private static short[] f31000;
   private static boolean[] f32000;
   public static Object[] f33000;
   private static boolean[] f34000;
   private static short[] f35000;
   private static float[] f36000;
   public static Object[] f37000;
   private static byte[] f38000;
   private static boolean[] f39000;
   private static byte[] f40000;
   private static byte[] f41000;
   private static byte[] f42000;

   private static void m2000() {
      f24000 = new short[]{6, 0, 1};
      f14000 = new short[]{5, 6};
      f20000 = new short[]{1, 2, 0, 7};
      f2000 = new short[]{7, 0, 0, 6, 4};
      f31000 = new short[]{5, 0, 0};
      f8000 = new short[]{5, 3, 4, 0};
      f35000 = new short[]{2, 0, 0, 2, 0};
   }

   private static void m12000() {
      f7000 = new String[]{"opened", "bindOpened", "tooltipShown", "nursultan:clientSettingsOpened", "nursultan:openModuleSettings", "", "", "tooltipDelay"};
      f29000 = new String[]{"switch", "icon:menu/dots", "icon:menu/bind", "module.keyboard.icon"};
   }

   private C0015() {
   }

   static {
      ntfClinit();
   }

   private static void m16000() {
      f40000 = new byte[]{2, 2, 2, 2, 2, 4, 4, 5};
      f42000 = new byte[]{6, 2, 6, 20, 3, 7};
      f41000 = new byte[]{2, 7, 2, 7, 2, 2, 2};
      f19000 = new byte[]{3, 2, 3, 4, 2, 3};
      f38000 = new byte[]{5, 6, 7, 2, 2};
      f3000 = new byte[]{4, 2, 2, 2, 3, 2, 2};
      f25000 = new byte[]{4, 5, 6, 7, 2, 3, 2};
      f1000 = new byte[]{8, 20, 24, 2, 24, 3, 20};
      f17000 = new byte[]{8, 8, 3};
   }

   private static void m22000() {
      f12000 = new int[]{-7171438, -7171438, -7171438};
   }

   private static void m32000() {
      f18000 = new float[]{0.5F, 1.0F, 100.0F, 66.0F, 20.0F, 20.0F, 20.0F, 20.0F};
      f9000 = new float[]{0.0F, 20.0F, 100.0F, 24.0F};
      f36000 = new float[]{24.0F, 100.0F, 0.0F, 0.0F, 0.0F, 0.5F};
   }

   private C0031 m60000(GuiWidget var1, Iface0202 var2) {
      OlIrtqjti var3 = var2.m28000((C0297<OlIrtqjti>)OlIrtqjti.f4000[f24000[0]]);
      Iface0196 var4 = var2.m20000(f7000[0], f15000[0]);
      Iface0196 var5 = var2.m20000(f7000[1], f15000[1]);
      Iface0196 var6 = var2.m20000(f7000[2], f15000[2]);
      Iface0196 var7 = var2.m6000(f7000[3], f15000[3]);
      Iface0196 var8 = var2.m6000(f7000[4], f7000[5]);
      if ((Boolean)var4.m2000() && !var1.m42000().equals(var8.m2000())) {
         var8.m6000(var1.m42000());
      } else if (!(Boolean)var4.m2000() && var1.m42000().equals(var8.m2000())) {
         var8.m6000(f7000[6]);
      }

      rw.core.C0095 var9 = var2.m4000(f7000[7], () -> new rw.core.C0095(f18000[0]));
      var9.m28000(() -> var6.m6000(f28000[0]));
      String var10 = C1235.m40000(var1.m10000());
      boolean var11 = !var10.equals(var1.m10000().m10000()) ? f15000[4] : f4000[0];
      boolean var12 = var2.m2000("moduleEnabled:" + var1.m42000(), var1::m30000);
      C0056 var13 = var12 ? (C0056)f37000[f24000[1]] : (C0056)f37000[f24000[2]];
      return C0287.m26000(
         (C0056)f11000[f14000[0]],
         var13x -> {
            var13x.N("m" + var1.m42000());
            var13x.N(Enum0026.f2000, var4xx -> {
               C0318 var5xx = (C0318)var4xx;
               if (var5xx.m2000() == f40000[2]) {
                  var5.m6000(f23000[2]);
                  var9.m20000();
                  var6.m6000(f23000[3]);
                  var4xx.m22000();
                  var4xx.m6000();
               } else if (var5xx.m2000() == f23000[4]) {
                  var4.m6000(f23000[5]);
                  var9.m20000();
                  var6.m6000(f23000[6]);
               }
            });
            if (var11) {
               var13x.N(
                  Enum0026.f13000,
                  var5xx -> {
                     C0306 var6xx = (C0306)var5xx;
                     if (!m84000(var5xx.m26000(), var6xx.m2000())) {
                        if (!(Boolean)var4.m2000()
                           && !(Boolean)var5.m2000()
                           && !(Boolean)var7.m2000()
                           && ((String)var8.m2000()).isEmpty()
                           && NursultanClient.m26000().m50000()) {
                           var9.m12000();
                        }
                     }
                  },
                  Rec0107.m12000()
               );
               var13x.N(Enum0026.f14000, var2xx -> {
                  C0306 var3xx = (C0306)var2xx;
                  if (!m84000(var2xx.m26000(), var3xx.m2000())) {
                     var9.m20000();
                     var6.m6000(f23000[1]);
                  }
               }, Rec0107.m12000());
            }

            var13x.N(var1.m2000(), var13);
            var13x.N((C0056)f33000[f14000[1]], var8xx -> {
               ((C0288)var8xx).N((C0056)f37000[f20000[3]], var7xxx -> {
                  ((C0288)var7xxx).N("keyboard" + var1.m42000());
                  ((C0288)var7xxx).N(Enum0026.f2000, Base0315::m6000);
                  ((C0288)var7xxx).N(var3xxxx -> {
                     var5.m6000(f22000[6]);
                     var9.m20000();
                     var6.m6000(f23000[0]);
                     var3xxxx.m6000();
                  });
                  ((C0288)var7xxx).L(var4xxxx -> {
                     ((C0286)var4xxxx).N("keyboardIcon" + var1.m42000());
                     ((C0286)var4xxxx).m2000(f29000[2]);
                     C0056 var5xxxx = var5.m2000() ? ((C0097)f33000[f8000[0]]).m8000(var3) : (var12 ? (C0056)f33000[f8000[1]] : (C0056)f33000[f8000[2]]);
                     C0056[] var10001 = new C0056[f40000[1]];
                     var10001[f22000[4]] = var5xxxx;
                     var10001[f22000[5]] = (C0056)f33000[f8000[3]];
                     ((C0286)var4xxxx).N(C0056.m120000(var10001));
                  });
                  ((C0288)var7xxx).y(var2.m18000("bindModal" + var1.m42000(), (Iface0197<Rec0274>)C0007.f26000[f31000[2]], new Rec0274(var1, var5)));
               });
               if (!var1.w().isEmpty()) {
                  ((C0288)var8xx).N((C0056)f33000[f2000[0]], var7xxx -> {
                     ((C0288)var7xxx).N(var3xxxx -> {
                        var4.m6000(f22000[2]);
                        var9.m20000();
                        var6.m6000(f22000[3]);
                     });
                     ((C0288)var7xxx).L(var4xxxx -> {
                        ((C0286)var4xxxx).N("dots" + var1.m42000());
                        ((C0286)var4xxxx).m2000(f29000[1]);
                        C0056 var5xxxx = var4.m2000() ? ((C0097)f37000[f2000[3]]).m8000(var3) : (var12 ? (C0056)f37000[f2000[4]] : (C0056)f37000[f31000[0]]);
                        C0056[] var10001 = new C0056[f40000[0]];
                        var10001[f22000[0]] = var5xxxx;
                        var10001[f22000[1]] = (C0056)f5000[f31000[1]];
                        ((C0286)var4xxxx).N(C0056.m120000(var10001));
                     });
                     ((C0288)var7xxx).y(var2.m18000("modal" + var1.m42000(), (Iface0197<Rec0272>)C0009.f7000[f2000[2]], new Rec0272(var1, var4)));
                  });
               }

               ((C0288)var8xx).y(var2.m18000(f29000[0], (Iface0197<IlpimlpIt>)C1059.f11000[f2000[1]], new IlpimlpIt(var12, var1::m46000)));
            });
            boolean var14 = var11
                  && var6.m2000()
                  && !var4.m2000()
                  && !var5.m2000()
                  && !var7.m2000()
                  && ((String)var8.m2000()).isEmpty()
                  && NursultanClient.m26000().m50000()
               ? f34000[1]
               : f34000[2];
            var13x.N(
               (C0056)f5000[f20000[0]],
               var4xx -> {
                  ((C0288)var4xx).N((C0056)f5000[f20000[1]], var1xxx -> ((C0288)var1xxx).N("tooltipAnchor" + var1.m42000()));
                  if (var14) {
                     ((C0288)var4xx).y(
                        var2.m18000(
                           "tooltipContent" + var1.m42000(),
                           (Iface0197<Rec0264>)rw.core.C0091.f19000[f20000[2]],
                           new Rec0264(var1, var10, "tooltipAnchor" + var1.m42000())
                        )
                     );
                  }
               }
            );
         }
      );
   }

   private static void m70000() {
      f6000 = new Object[]{null, null, 0.5F};
      f11000 = new Object[]{20, 24, 24, 20, null, null, null, null};
      f37000 = new Object[]{null, null, null, null, null, null, null, null};
      f33000 = new Object[]{null, null, null, null, null, null, null, null};
      f5000 = new Object[]{null, null, null};
   }

   private static boolean m84000(Iface0212 var0, Iface0212 var1) {
      for (Iface0212 var2 = var1; var2 != null; var2 = var2.m8000()) {
         if (var2 == var0) {
            return f4000[1];
         }
      }

      return f34000[0];
   }

   private static void m98000() {
      f15000 = new boolean[]{false, false, false, false, true};
      f4000 = new boolean[]{false, true};
      f34000 = new boolean[]{false, true, false};
      f22000 = new boolean[]{false, true, true, false, false, true, true};
      f23000 = new boolean[]{false, false, true, false, true, true, false};
      f28000 = new boolean[]{true, false};
      f27000 = new boolean[]{true, false, true, false, false, true, true, false};
      f39000 = new boolean[]{false, false, true, false, true, false};
      f32000 = new boolean[]{false, false, true, true, true, false};
      f10000 = new boolean[]{false, false};
      f13000 = new boolean[]{true, false, true};
      f30000 = new boolean[]{false, false, true, false, false, false, true, false};
      f26000 = new boolean[]{true, false, true, true};
      f21000 = new boolean[]{false, true, false, false, true};
      f16000 = new boolean[]{false, true, false, true};
   }
}

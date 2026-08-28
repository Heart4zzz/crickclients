package rw.setting;

import rw.NursultanClient;
import rw.api.Iface0196;
import rw.api.Iface0197;
import rw.api.Iface0202;
import rw.core.C0081;
import rw.core.C0097;
import rw.core.C0286;
import rw.core.C0287;
import rw.core.C0288;
import rw.core.C0297;
import rw.core.C0959;
import rw.core.C1235;
import rw.core.OlIrtqjti;
import rw.data.Rec0261;
import rw.data.Rec0282;
import rw.defs.Enum0086;

public class C0014 {
   private static float[] f1000;
   private static float[] f2000;
   private static short[] f3000;
   public static Object[] f4000;
   private static short[] f5000;
   private static String[] f6000;
   private static boolean[] f7000;
   private static short[] f8000;
   private static String[] f9000;
   private static String[] f10000;
   private static byte[] f11000;
   private static byte[] f12000;
   private static short[] f13000;
   private static short[] f14000;
   private static byte[] f15000;
   private static String[] f16000;
   private static short[] f17000;
   private static boolean[] f18000;

   private static void m2000() {
      f17000 = new short[]{6, 1, 2, 2, 2, 0};
      f3000 = new short[]{2, 3, 3, 2, 5};
      f8000 = new short[]{2, 0, 4, 6};
      f5000 = new short[]{4, 6};
      f14000 = new short[]{5, 6, 0};
      f13000 = new short[]{0, 1, 2, 3, 4, 4};
   }

   private static void m10000() {
      f18000 = new boolean[]{false, true, false, true, false, true, false, true};
      f7000 = new boolean[]{false, true};
   }

   private C0014() {
   }

   static {
      ntfClinit();
   }

   private static Rec0282 m22000() {
      int var0 = ((C0959)NursultanClient.f13000[f17000[2]]).m30000();
      String var1 = var0 > 0 ? "glid:" + var0 : f10000[0];
      return new Rec0282(var1, ((C0959)NursultanClient.f13000[f17000[3]]).m20000(), ((C0959)NursultanClient.f13000[f17000[4]]).m32000());
   }

   private static void m50000() {
      f4000 = new Object[]{null, null, null, null, null, null, null};
   }

   private static void m52000() {
      f12000 = new byte[]{2, 4};
      f11000 = new byte[]{2, 3, 3, 2, 5, 2};
      f15000 = new byte[]{3, 4, 2, 3, 4, 5, 6, 7};
   }

   private static C0031 m76000(Iface0202 var0, Iface0196<Enum0086> var1, String var2, String var3, Enum0086 var4) {
      return var0.m18000(var3, (Iface0197<Rec0261>)rw.core.C0092.f11000[f17000[5]], new Rec0261(var2, var3, var4, var1));
   }

   private C0031 m80000(Iface0196<Enum0086> var1, Iface0202 var2) {
      OlIrtqjti var3 = var2.m28000((C0297<OlIrtqjti>)OlIrtqjti.f4000[f17000[0]]);
      Rec0282 var4 = m22000();
      return C0287.m26000(
         (C0056)f4000[f17000[1]],
         var4x -> {
            Object[] var10001 = new Object[f12000[0]];
            var10001[f18000[0]] = C0287.m26000(
               (C0056)f4000[f3000[0]],
               var4xx -> {
                  Object[] var10001x = new Object[f12000[1]];
                  var10001x[f18000[2]] = C0287.m26000(
                     (C0056)f4000[f3000[2]],
                     var1xxx -> var1xxx.L(var1xxxx -> ((C0286)((C0286)var1xxxx).N(f9000[4])).m2000(f9000[5]).N(((C0097)f4000[f13000[5]]).m8000(var3)))
                  );
                  var10001x[f18000[3]] = C0287.m28000((C0056)rw.core.C0076.f5000[f3000[3]]);
                  var10001x[f11000[0]] = C0287.m26000((C0056)f4000[f3000[4]], var2xxx -> {
                     var2xxx.N(C1235.m36000(f10000[2]), (C0056)rw.core.C0076.f5000[f8000[2]]);
                     var2xxx.N((C0056)f4000[f8000[3]], var2xxxx -> {
                        Object[] var10001xx = new Object[f11000[4]];
                        var10001xx[f18000[6]] = m76000(var2, var1, f6000[2], f6000[3], (Enum0086)Enum0086.f1000[f13000[0]]);
                        var10001xx[f18000[7]] = m76000(var2, var1, f6000[4], f6000[5], (Enum0086)Enum0086.f1000[f13000[1]]);
                        var10001xx[f11000[5]] = m76000(var2, var1, f6000[6], f6000[7], (Enum0086)Enum0086.f1000[f13000[2]]);
                        var10001xx[f15000[0]] = m76000(var2, var1, f9000[0], f9000[1], (Enum0086)Enum0086.f1000[f13000[3]]);
                        var10001xx[f15000[1]] = m76000(var2, var1, f9000[2], f9000[3], (Enum0086)Enum0086.f1000[f13000[4]]);
                        ((C0288)var2xxxx).N(var10001xx);
                     });
                     var2xxx.N(C1235.m36000(f10000[3]), (C0056)rw.core.C0076.f5000[f5000[0]]);
                     var2xxx.N((C0056)f4000[f5000[1]], var2xxxx -> {
                        Object[] var10001xx = new Object[f11000[2]];
                        var10001xx[f18000[4]] = m76000(var2, var1, f16000[0], f16000[1], (Enum0086)Enum0086.f1000[f14000[0]]);
                        var10001xx[f18000[5]] = m76000(var2, var1, f16000[2], f16000[3], (Enum0086)Enum0086.f1000[f14000[1]]);
                        var10001xx[f11000[3]] = m76000(var2, var1, f6000[0], f6000[1], (Enum0086)Enum0086.f4000[f14000[2]]);
                        ((C0288)var2xxxx).N(var10001xx);
                     });
                  });
                  var10001x[f11000[1]] = C0287.m28000((C0056)rw.core.C0076.f5000[f8000[0]]);
                  var4xx.N(var10001x);
                  var4xx.y(var2.m18000(f10000[1], (Iface0197<Rec0282>)C0081.f3000[f8000[1]], var4));
               }
            );
            var10001[f18000[1]] = C0287.m28000((C0056)rw.core.C0076.f5000[f3000[1]]);
            var4x.N(var10001);
         }
      );
   }

   private static void m82000() {
      f10000 = new String[]{"icons/unknown.png", "avatar", "tab.features", "tab.manager"};
      f16000 = new String[]{"category.configs", "presets", "category.autobuy", "autobuy"};
      f6000 = new String[]{"category.accounts", "accounts", "category.combat", "combat", "category.movement", "movement", "category.visual", "visuals"};
      f9000 = new String[]{"category.player", "player", "category.misc", "misc", "logo", "icon:menu/nursultan"};
   }

   private static void m86000() {
      f1000 = new float[]{52.0F, 38.0F, 270.0F, 100.0F, 269.0F, 100.0F, 100.0F, 89.0F};
      f2000 = new float[]{100.0F, 100.0F, 30.0F, 22.0F, 100.0F, 6.0F, 33.0F, 9.0F};
   }
}

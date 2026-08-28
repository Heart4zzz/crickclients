package rw.setting;

import rw.GuiWidget;
import rw.api.Iface0196;
import rw.api.Iface0197;
import rw.api.Iface0202;
import rw.core.C0078;
import rw.core.C0287;
import rw.core.C0288;
import rw.core.C1046;
import rw.core.C1047;
import rw.core.C1059;
import rw.core.C1063;
import rw.core.C1235;
import rw.data.IlpimlpIt;
import rw.data.Rec0125;
import rw.data.Rec0266;
import rw.data.Rec0270;
import rw.data.Rec0274;
import rw.data.Rec0277;
import rw.data.Rec0312;
import rw.defs.BootstrapMethods;
import rw.defs.Enum0032;
import rw.defs.IlIijjrn;
import rw.gui.PgUp;

public class C0007 {
   private static boolean[] f1000;
   private static float[] f2000;
   private static byte[] f3000;
   private static String[] f4000;
   private static float[] f5000;
   private static boolean[] f6000;
   private static short[] f7000;
   private static float[] f8000;
   private static short[] f9000;
   private static byte[] f10000;
   private static short[] f11000;
   public static Object[] f12000;
   private static byte[] f13000;
   private static String[] f14000;
   private static String[] f15000;
   private static boolean[] f16000;
   private static boolean[] f17000;
   private static boolean[] f18000;
   private static float[] f19000;
   public static Object[] f20000;
   private static short[] f21000;
   private static boolean[] f22000;
   private static boolean[] f23000;
   private static byte[] f24000;
   private static int[] f25000;
   public static Object[] f26000;
   private static short[] f27000;

   private static void m2000() {
      f25000 = new int[]{-16777216};
   }

   private static void m8000() {
      f2000 = new float[]{0.0F, 5.0F, 3.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F};
      f8000 = new float[]{0.0F, 0.0F, 0.0F, 240.0F, 4.0F, 20.0F, 0.25F};
      f5000 = new float[]{1.0F, 12.0F, 0.0F, Float.POSITIVE_INFINITY, 12.0F};
      f19000 = new float[]{12.0F, 3.0F, 0.0F, Float.POSITIVE_INFINITY, 0.0F, Float.POSITIVE_INFINITY};
   }

   private C0007() {
   }

   static {
      ntfClinit();
   }

   private static void m20000() {
      f26000 = new Object[]{null, 240, 12, 3, 5, null};
      f12000 = new Object[]{null, null, null};
      f20000 = new Object[]{null, null, f4000[3], null, null, null, null, null};
   }

   private static void m32000() {
      f1000 = new boolean[]{true, false};
      f16000 = new boolean[]{false, true, false};
      f22000 = new boolean[]{true, true, false};
      f23000 = new boolean[]{false, true, false};
      f17000 = new boolean[]{true, false, true};
      f18000 = new boolean[]{false, false, false, false, false, true, false, true};
      f6000 = new boolean[]{false, true, false, false, false, true, false, true};
   }

   private static void m40000() {
      f11000 = new short[]{3, 1001, 4, 5, 6, 7, 7, 0};
      f21000 = new short[]{1, 2, 1, 0, 0, 0, 2, 3};
      f7000 = new short[]{2, 3, 2, 3, 2, 3, 0, 1};
      f9000 = new short[]{0, 0, 1, 4, 0, 5};
      f27000 = new short[]{4, 0, 5, 5, 4, 0, 1000, 240};
   }

   private static C0056 m42000(boolean var0) {
      C0056[] var10000 = new C0056[f13000[2]];
      var10000[f23000[0]] = (C0056)f20000[f11000[4]];
      var10000[f23000[1]] = C0056.m130000().m90000(var0 ? Rec0125.m30000() : Rec0125.m32000(f2000[3], f2000[4])).m50000(var0 ? f2000[5] : f2000[6]);
      return C0056.m120000(var10000);
   }

   private C0031 m62000(Rec0274 var1, String var2, Iface0202 var3) {
      GuiWidget var4 = var1.m4000();
      Iface0196 var5 = var3.m24000(f14000[0], null);
      boolean var6 = !var4.m54000().m14000() ? f1000[0] : f1000[1];
      C0056[] var10000 = new C0056[f13000[0]];
      var10000[f16000[0]] = (C0056)f20000[f11000[0]];
      var10000[f16000[1]] = C1063.m30000(var2, f2000[0], f11000[1]);
      C0056 var7 = C0056.m120000(var10000);
      var10000 = new C0056[f13000[1]];
      var10000[f16000[2]] = (C0056)f20000[f11000[2]];
      var10000[f22000[0]] = C0056.m130000().m18000(var6 ? f2000[1] : f2000[2]);
      C0056 var8 = C0056.m120000(var10000);
      return C0287.m26000(
         var7,
         var7x -> ((C0288)var7x.N(f14000[3]))
            .N(
               var8,
               var6xx -> {
                  var6xx.N(
                     (C0056)C0078.f1000[f21000[7]],
                     var3xxx -> {
                        Iface0196 var4xxx = var3.m20000("active" + var4.m42000(), f18000[1]);
                        var3xxx.N(C1235.m40000((Rec0312)f26000[f27000[2]]), var4xxx.m2000() ? (C0056)C0078.f1000[f27000[3]] : (C0056)C0078.f1000[f27000[4]]);
                        var3xxx.y(
                           var3.m18000(
                              "hotkey" + var4.m42000(),
                              (Iface0197<Rec0270>)C0134.f9000[f27000[5]],
                              new Rec0270(var4.m54000().m36000(), var4.m54000().m16000(), (var2xxxx, var3xxxx) -> {
                                 var4.m44000(var2xxxx, var3xxxx, var4.m54000().m18000(), var4.m54000().m54000());
                                 var5.m4000();
                              }, var4xxx)
                           )
                        );
                     }
                  );
                  var6xx.y((C0056)rw.core.C0076.f5000[f7000[0]]);
                  var6xx.N((C0056)C0078.f1000[f7000[1]], var3xxx -> {
                     var3xxx.N(C1235.m40000((Rec0312)f12000[f9000[4]]), var4.m54000().m54000() ? (C0056)C0078.f1000[f9000[5]] : (C0056)C0078.f1000[f27000[0]]);
                     var3xxx.y(var3.m18000(f15000[2], (Iface0197<IlpimlpIt>)C1059.f11000[f27000[1]], new IlpimlpIt(var4.m54000().m54000(), var2xxxx -> {
                        var4.m44000(var4.m54000().m36000(), var4.m54000().m16000(), var4.m54000().m18000(), var2xxxx);
                        var5.m4000();
                     })));
                  });
                  var6xx.y((C0056)rw.core.C0076.f5000[f7000[2]]);
                  var6xx.N((C0056)C0078.f1000[f7000[3]], var4xxx -> {
                     var4xxx.N(C1235.m40000((Rec0312)f12000[f9000[2]]), (C0056)C0078.f1000[f9000[3]]);
                     var4xxx.y(this.m64000(var4, var5, var3));
                  });
                  var6xx.N(
                     m42000(var6),
                     var5xxx -> {
                        var5xxx.N(f15000[0]);
                        var5xxx.N(
                           m86000(var6),
                           var4xxxx -> {
                              var4xxxx.y((C0056)rw.core.C0076.f5000[f7000[4]]);
                              var4xxxx.N(
                                 (C0056)C0078.f1000[f7000[5]],
                                 var4xxxxx -> var4xxxxx.y(
                                    var3.m18000(f15000[1], (Iface0197<Rec0277>)C1047.f6000[f7000[6]], new Rec0277((Rec0312)f20000[f7000[7]], () -> {
                                       var4.m44000((PgUp)PgUp.f4000[f9000[0]], f17000[1], (BootstrapMethods)BootstrapMethods.f3000[f9000[1]], f17000[2]);
                                       var5.m4000();
                                       var1.m6000().m6000(f18000[0]);
                                    }))
                                 )
                              );
                           }
                        );
                     }
                  );
               }
            )
      );
   }

   private C0031 m64000(GuiWidget var1, Iface0196<Void> var2, Iface0202 var3) {
      return C0287.m26000(
         (C0056)f20000[f11000[3]],
         var4 -> {
            var4.y(
               var3.m18000(
                  IIOOnq<"pvnvg",2065780600,-1462966800,-1462966838,-1462966819,112752570,969798829>()[1],
                  (Iface0197<Rec0266>)C1046.f17000[f11000[7]],
                  this.m90000(var1, (BootstrapMethods)BootstrapMethods.f3000[f21000[0]], (Rec0312)f12000[f21000[1]], (IlIijjrn)IlIijjrn.f4000[f21000[2]], var2)
               )
            );
            var4.y(
               var3.m18000(
                  f14000[2],
                  (Iface0197<Rec0266>)C1046.f17000[f21000[3]],
                  this.m90000(var1, (BootstrapMethods)BootstrapMethods.f3000[f21000[4]], (Rec0312)f20000[f21000[5]], (IlIijjrn)IlIijjrn.f4000[f21000[6]], var2)
               )
            );
         }
      );
   }

   private C0031 m74000(Rec0274 var1, Iface0202 var2) {
      boolean var3 = var1.m6000().m2000();
      String var4 = "bindAnchor" + System.identityHashCode(var1.m6000());
      return C1063.m28000(C0056.f1000, var5 -> {
         var5.N(var4);
         if (var3) {
            var5.y(C1063.m24000(f15000[3], f27000[6], () -> var1.m6000().m6000(f18000[2])));
            var5.y(this.m62000(var1, var4, var2));
         }
      });
   }

   private static C0056 m86000(boolean var0) {
      if (var0) {
         return (C0056)f20000[f11000[5]];
      } else {
         C0056[] var10000 = new C0056[f13000[3]];
         var10000[f23000[2]] = (C0056)f20000[f11000[6]];
         var10000[f17000[0]] = C0056.m130000().m160000(Enum0032.f2000).m170000(f2000[7], f8000[0]);
         return C0056.m120000(var10000);
      }
   }

   private Rec0266 m90000(GuiWidget var1, BootstrapMethods var2, Rec0312 var3, IlIijjrn var4, Iface0196<Void> var5) {
      return new Rec0266(C1235.m40000(var3), var1.m54000().m18000() == var2 ? f22000[1] : f22000[2], () -> {
         var1.m44000(var1.m54000().m36000(), var1.m54000().m16000(), var2, var1.m54000().m54000());
         var5.m4000();
      }, var4);
   }

   private static void m96000() {
      f13000 = new byte[]{2, 2, 2, 2, 5};
      f10000 = new byte[]{2, 3, 4, 5};
      f24000 = new byte[]{2, 6, 7, 6, 2, 12};
      f3000 = new byte[]{3, 3, 4, 5, 3, 8, 2};
   }

   private static void m104000() {
      f14000 = new String[]{"updater", "type-hold", "type-toggle", "bindPanel"};
      f15000 = new String[]{"removeSection", "remove", "visible", "bindCatcher", "bind.hotkey", "bind.visible", "bind.type"};
      f4000 = new String[]{"bind.hold", "bind.toggle", "bind.remove", "bindAnchor"};
   }
}

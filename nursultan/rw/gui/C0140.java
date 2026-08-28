package rw.gui;

import KDFzREm.NNNAB;
import KDFzREm.NNNG;
import KDFzREm.NNNwS;
import KDFzREm.NNNwz;
import KDFzREm.NNtL;
import KDFzREm.NNuU;
import KDFzREm.NQo;
import KDFzREm.Nbp;
import KDFzREm.Nbx;
import KDFzREm.NcB;
import KDFzREm.NjL;
import KDFzREm.pz;
import KDFzREm.qZ;
import com.mojang.blaze3d.systems.RenderSystem;
import rw.NursultanClient;
import rw.api.Iface0202;
import rw.api.Iface0639;
import rw.api.Iface0643;
import rw.core.C0077;
import rw.core.C0259;
import rw.core.C0286;
import rw.core.C0287;
import rw.core.C0288;
import rw.core.C0296;
import rw.core.C0297;
import rw.core.C0299;
import rw.core.C0805;
import rw.core.C0806;
import rw.core.C0830;
import rw.core.C0876;
import rw.core.C0989;
import rw.core.C1054;
import rw.core.C1119;
import rw.core.C1124;
import rw.core.C1140;
import rw.core.C1176;
import rw.core.OlIrtqjti;
import rw.data.Oljjtpnom;
import rw.data.Rec0125;
import rw.defs.OlmmOsl;
import rw.setting.C0031;
import rw.setting.C0056;

@Iface0639(
   u = "targetInfo",
   i = 200.0F,
   N = 40.0F
)
public class C0140 extends DragOffset {
   private static short[] f1000;
   private static byte[] f2000;
   private static short[] f3000;
   private static String[] f4000;
   private static boolean[] f5000;
   private static boolean[] f6000;
   public static Object[] f7000;
   private static String[] f8000;
   private static byte[] f9000;
   private static boolean[] f10000;
   private static byte[] f11000;
   private static float[] f12000;
   private static boolean[] f13000;
   private static boolean[] f14000;
   private static short[] f15000;
   private static String[] f16000;
   private static boolean[] f17000;
   private static short[] f18000;
   private static boolean[] f19000;
   private static String[] f20000;
   private static short[] f21000;
   private static short[] f22000;
   private static float[] f23000;
   private static byte[] f24000;
   private static boolean[] f25000;
   private static float[] f26000;
   private static byte[] f27000;
   private static byte[] f28000;
   private static short[] f29000;
   public static Object[] f30000;
   private static float[] f31000;
   private static float[] f32000;
   private static byte[] f33000;
   public static Object[] f34000;
   private static float[] f35000;
   public static Object[] f36000;
   private static float[] f37000;
   private static short[] f38000;
   private static short[] f39000;
   public static Object[] f40000;
   public static Object[] f41000;
   private static float[] f42000;
   private static boolean[] f43000;
   private static boolean[] f44000;
   private static int[] f45000;
   private static boolean[] f46000;
   private static short[] f47000;
   public static Object[] f48000;
   public static Object[] f49000;
   private static float[] f50000;
   private static boolean[] f51000;
   private static short[] f52000;
   private static byte[] f53000;
   private static short[] f54000;
   private static String[] f55000;
   private static short[] f56000;
   private static boolean[] f57000;
   private static boolean[] f58000;
   private static float[] f59000;
   private static byte[] f60000;
   private static short[] f61000;
   private static float[] f62000;
   private static boolean[] f63000;
   private static float[] f64000;
   private static float[] f65000;
   private static byte[] f66000;
   private static byte[] f67000;
   private static String[] f68000;
   private static String[] f69000;
   public static Object[] f70000;
   private static byte[] f71000;
   private static String[] f72000;
   private static byte[] f73000;
   private static boolean[] f74000;
   private static String[] f75000;
   private static String[] f76000;
   private static byte[] f77000;
   public static Object[] f78000;
   private static float[] f79000;
   private static byte[] f80000;
   public static Object[] f81000;
   private static short[] f82000;
   private static long[] f83000;
   private static String[] f84000;
   private static boolean[] f85000;
   private static float[] f86000;
   private static float[] f87000;
   private static short[] f88000;
   private static byte[] f89000;
   private static short[] f90000;
   private static boolean[] f91000;
   private static boolean[] f92000;
   public static Object[] f93000;
   public static Object[] f94000;
   private static boolean[] f95000;
   private static byte[] f96000;
   private static byte[] f97000;
   private static short[] f98000;
   private static boolean[] f99000;
   private static float[] f100000;
   private static String[] f101000;
   private static byte[] f102000;
   private static byte[] f103000;
   public static Object[] f104000;
   private static short[] f105000;
   private static float[] f106000;
   private static float[] f107000;
   private static boolean[] f108000;
   private static byte[] f109000;
   private static float[] f110000;
   private static float[] f111000;
   private static float[] f112000;
   private static byte[] f113000;
   private static byte[] f114000;
   private static short[] f115000;
   private static byte[] f116000;
   private static short[] f117000;

   private static Integer m2000() {
      if ((NNNwS)((NNuU)f104000[f54000[6]]).T[f105000[0]] == null) {
         return Integer.valueOf(f73000[0]);
      } else {
         NjL var0 = m72000();
         return var0 != null ? var0.method_5628() : f73000[1];
      }
   }

   private static C0031 m16000(C1119 var0) {
      return C0287.m26000((C0056)f36000[f88000[2]], var1 -> {
         var1.N(f69000[2]);
         if (var0.m2000()) {
            var1.y(m98000(var0));
         }

         var1.y(m46000(var0));
      });
   }

   private static C0031 m26000() {
      return C0287.m26000((C0056)f41000[f82000[5]], var0 -> {
         var0.N(f101000[0]);
         var0.y(m204000());
      });
   }

   private static Boolean m30000() {
      return (Boolean)NursultanClient.m88000().m64000().m6000().i();
   }

   private static boolean m32000(String var0) {
      return NursultanClient.m42000().m80000(var0, f107000[4], (OlmmOsl)OlmmOsl.f7000[f29000[1]]) > ((Integer)f34000[f98000[0]]).intValue()
         ? f63000[4]
         : f63000[5];
   }

   private static void m34000() {
      f104000 = new Object[]{null, null, 32, 6, 38, 3.0F, 16, 2};
      f40000 = new Object[]{13, 4};
      f70000 = new Object[]{1, 24, 14, 14, 536870911, 58, 1};
      f78000 = new Object[]{14, 2, -16777216};
      f94000 = new Object[]{58, 20.0F, -855648256, 106, 132};
      f34000 = new Object[]{249, 119, 119, 95, f101000[5], f101000[6]};
      f93000 = new Object[]{f101000[7], f75000[0]};
      f49000 = new Object[]{f75000[1], null, null, 14, 14.0F, null, null, null};
      f41000 = new Object[]{null, null, null, null};
      f30000 = new Object[]{null, null};
      f48000 = new Object[]{null, null, null, null, null, null, null, null};
      f81000 = new Object[]{null, null, null, null, null, null, null, null};
      f36000 = new Object[]{null, null, null, null, null, null};
      f7000 = new Object[]{f75000[2], f75000[3], f75000[4], null};
   }

   public C0140() {
      super(C0140::m28000);
   }

   static {
      ntfClinit();
   }

   private static Boolean m40000() {
      return NursultanClient.m88000().m52000().m34000();
   }

   private static C0031 m42000() {
      return C0287.m26000((C0056)f48000[f3000[5]], var0 -> {
         var0.N(f16000[0]);

         for (int var1 = f5000[0]; var1 < ((Nbx[])f104000[f39000[4]]).length; var1++) {
            Nbx var2 = ((Nbx[])f104000[f39000[5]])[var1];
            String var3 = "targetInfoSlot" + var1;
            NQo var4 = ((NjL)f7000[f39000[6]]).method_6118(var2);
            var0.y(m172000(var3, var4));
         }
      });
   }

   private static C0031 m46000(C1119 var0) {
      String var1 = var0.m22000();
      float var2 = var0.m32000();
      boolean var3 = var0.m2000();
      float var4 = var0.m20000() * f111000[5] * (f111000[6] - var2);
      C0056 var6;
      if (var3) {
         C0056[] var10000 = new C0056[f96000[0]];
         var10000[f43000[2]] = (C0056)f36000[f88000[3]];
         var10000[f91000[0]] = C0056.m130000().m56000(var4);
         var6 = C0056.m120000(var10000);
      } else {
         var6 = (C0056)f36000[f88000[4]];
      }

      C0056 var5 = var6;
      return C0287.m26000(var5, var5x -> {
         var5x.N(f69000[1]);

         for (int var6x = f6000[3]; var6x < var1.length(); var6x++) {
            int var7 = var6x;
            char var8 = var1.charAt(var7);
            String var9 = "targetInfoHpCell" + var7;
            float var10 = NursultanClient.m42000().m80000(String.valueOf(var8), f62000[4], (OlmmOsl)OlmmOsl.f7000[f90000[3]]);
            C0056[] var10000x = new C0056[f9000[1]];
            var10000x[f6000[4]] = (C0056)f36000[f39000[0]];
            var10000x[f46000[0]] = C0056.m130000().m178000(Rec0125.m24000(var10));
            C0056 var11 = C0056.m120000(var10000x);
            boolean var12 = !var3 && var0.m8000(var7) ? f46000[1] : f46000[2];
            float var13 = !var3 && !var12 ? f87000[0] : var2;
            var5x.N(var11, var8x -> {
               var8x.N(var9);
               if (var12) {
                  var8x.y(m174000(var9 + "-old", var0.m46000().charAt(var7), -var0.m20000() * f87000[1] * var2, f87000[2] - var2));
               }

               var8x.y(m174000(var9 + "-cur", var8, var12 ? var4 : f87000[3], var13));
            });
         }
      });
   }

   private static Boolean m54000() {
      return (Boolean)NursultanClient.m88000().m64000().m4000().i();
   }

   private static C0031 m58000() {
      String var0 = ((NjL)f7000[f56000[2]]).method_5477().getString();
      boolean var1 = m32000(var0);
      return C0287.m26000((C0056)f48000[f56000[3]], var2 -> {
         var2.N(f20000[0]);
         if (var1) {
            var2.N(var0xx -> ((C0288)var0xx.N(f20000[2])).N(m200000()));
         } else {
            var2.y(var1xx -> ((C0296)var1xx.N(f20000[1])).m2000(var0).N((C0056)f81000[f38000[4]]));
         }

         var2.y(m42000());
      });
   }

   private static void m6000() {
      f68000 = new String[]{"targetInfoTarget", "targetInfoHealth", "targetInfoArmorDetails", "targetInfoAbsorption"};
      f4000 = new String[]{"targetInfoAbsorptionEnabled", "targetInfoHideSkin", "targetInfoHealth", "?"};
      f72000 = new String[]{"targetInfoHpText", "targetInfoAbsorption", "u_projection"};
      f84000 = new String[]{"u_view", "u_size", "u_thickness", "u_hp_progress", "u_abs_progress", "u_color", "u_abs_color"};
      f8000 = new String[]{"u_track_color", "u_projection", "u_view", "u_size", "u_radius"};
      f76000 = new String[]{"texture_in", "targetInfoHpLineOld"};
      f69000 = new String[]{"targetInfoHpLineOldText", "targetInfoHpLine", "targetInfoHpClip", "targetInfoRing", "icon:hud/x"};
      f16000 = new String[]{
         "targetInfoItems",
         "targetInfoCanvasOverlay",
         "targetInfoRingCanvasArea",
         "targetInfoRingCanvasBox",
         "targetInfoRingCanvas",
         "targetInfoCenterCanvasCol",
         "targetInfoNameCanvas"
      };
      f55000 = new String[]{"targetInfoItemsSpacer", "targetInfoDividerSpacer", "targetInfoHeadCanvasArea", "targetInfoHeadCanvasBox", "targetInfoHeadCanvas"};
      f20000 = new String[]{
         "targetInfoCenter", "targetInfoName", "targetInfoNamePlaceholder", "targetInfoRingArea", "targetInfoHead", "targetInfoHeadIcon", "icon:hud/target"
      };
      f101000 = new String[]{
         "targetInfoHeadArea",
         "targetInfoWindow",
         "targetInfoDivider",
         "dummy",
         "minecraft",
         "targetInfoHeadCanvas",
         "targetInfoRingCanvas",
         "targetInfoNameCanvas"
      };
      f75000 = new String[]{"targetInfoWindow", "targetInfoSlot", "targetInfoHealth", "targetInfoAbsorption", "targetInfoHpText"};
   }

   private static void m66000() {
      f96000 = new byte[]{2, 2, 2, 2, -1, -1, 32};
      f73000 = new byte[]{-1, -1};
      f9000 = new byte[]{32, 2, 2, 6, 2};
      f89000 = new byte[]{3, 4, 5};
      f102000 = new byte[]{4, 2, 2, 16, 2};
      f28000 = new byte[]{3, 3, 26, 4, 4, 116, 4};
      f11000 = new byte[]{13, 2, 2};
      f27000 = new byte[]{24, 3, 2, 2, 4};
      f113000 = new byte[]{6, 5, 2, 4, 6, 6, 2, 4};
      f2000 = new byte[]{5, 7, 2, 4, 6};
      f109000 = new byte[]{2, 2, 2, 3, 3, 2, 3, 2};
      f60000 = new byte[]{4, 5};
      f24000 = new byte[]{6, 7, 3, 2, 2, 14, 4, 2};
      f67000 = new byte[]{3, 4, 5, 6, 7};
      f53000 = new byte[]{2, 14, 4};
      f97000 = new byte[]{2, 3, 4, 5, 8};
      f103000 = new byte[]{2, 32, 3, 6, 4, 38};
      f33000 = new byte[]{5, 6, 16, 7, 2, 2, 13};
      f71000 = new byte[]{4, 7, 24, 2, 14};
      f114000 = new byte[]{3, 14, 4, 5, 58, 6};
      f80000 = new byte[]{3, 14, 2, 2, 5, 58, 2};
      f116000 = new byte[]{3, 4, 6, 2, 3, 4};
      f77000 = new byte[]{5, 2, 8, 3, 14};
      f66000 = new byte[]{4, 4, 2, 8, 8, 6, 4, 2};
   }

   private static Long m70000() {
      return (NjL)f7000[f54000[3]] == null
         ? f83000[0]
         : (long)((NjL)f7000[f54000[4]]).method_5628() << f96000[6] | Float.floatToIntBits(((NjL)f7000[f54000[5]]).method_6032()) & f83000[1];
   }

   private static NjL m72000() {
      TargetEsp var0 = NursultanClient.m88000().m94000();
      if (var0.m16000()) {
         return var0.m8000();
      } else if (Huddumped.m40000()) {
         return (NNNwS)((NNuU)f104000[f115000[0]]).T[f115000[1]];
      } else {
         TargetInfo var1 = NursultanClient.m88000().m64000();
         if ((Boolean)var1.m2000().i()) {
            NcB var2 = C1176.m30000(
               (NNNwS)((NNuU)f104000[f115000[2]]).T[f115000[3]],
               C0989.m4000(),
               ((NNNwS)((NNuU)f104000[f115000[4]]).T[f1000[0]]).method_55755(),
               f85000[4],
               C1140.m50000()
                  .and(var0x -> var0x instanceof NjL)
                  .and(var0x -> var0x.method_5864() != Nbp.B ? f6000[1] : f6000[2])
                  .and(var0x -> !((Iface0643)var0x).dataManager().m6000().m10000() ? f85000[5] : f6000[0])
            );
            if (var2 != null) {
               return (NjL)((NNtL)var2).L();
            }
         }

         return null;
      }
   }

   private static void m8000() {
      f83000 = new long[]{-1L, 4294967295L, -1L, 4294967295L, 180L, 180L};
   }

   private static void m78000() {
      f107000 = new float[]{1.0F, 5.0F, 0.0F, 20.0F, 14.0F};
      f111000 = new float[]{14.0F, 14.0F, 0.0F, 1.0F, 14.0F, 14.0F, 1.0F, 14.0F};
      f64000 = new float[]{0.0F, 1.0F, 0.0F, 0.0F};
      f42000 = new float[]{1.0F, 1.0F, 6.0F};
      f12000 = new float[]{32.0F, 3.0F, 38.0F, 0.0F, 0.0F, 1.0F};
      f86000 = new float[]{1.0F, 255.0F};
      f112000 = new float[]{255.0F, 255.0F, 255.0F, 255.0F};
      f59000 = new float[]{255.0F, 255.0F, 255.0F, 255.0F};
      f62000 = new float[]{255.0F, 255.0F, 255.0F, 1.0F, 14.0F};
      f87000 = new float[]{1.0F, 14.0F, 1.0F, 0.0F, 1.0F, 12.0F, 80.0F};
      f100000 = new float[]{58.0F, 100.0F};
      f79000 = new float[]{13.0F, -1.0F};
      f35000 = new float[]{32.0F, 32.0F, 100.0F, 100.0F, 0.0F, Float.POSITIVE_INFINITY, 100.0F};
      f26000 = new float[]{13.0F, 4.0F, 16.0F};
      f50000 = new float[]{2.0F, 16.0F, 16.0F, 0.0F};
      f106000 = new float[]{0.0F, 16.0F, 16.0F, 1.0F, 13.0F, 14.0F, 2.0F, 0.0F};
      f37000 = new float[]{0.0F, 8.0F, 8.0F};
      f65000 = new float[]{32.0F, 32.0F, 8.0F, 1.0F};
      f23000 = new float[]{58.0F, 58.0F, 38.0F, 38.0F, 0.0F, 0.0F, 100.0F};
      f110000 = new float[]{100.0F, 0.0F, 0.0F, 1.0F, 100.0F};
      f31000 = new float[]{16.0F, 999.0F, 0.0F, 0.0F};
      f32000 = new float[]{100.0F, 0.0F, 0.0F, 3.0F, 20.0F, 14.0F};
   }

   private static Long m84000() {
      return (NjL)f7000[f105000[1]] == null
         ? f83000[2]
         : (long)((NjL)f7000[f105000[2]]).method_5628() << f9000[0] | Float.floatToIntBits(((NjL)f7000[f105000[3]]).method_6067()) & f83000[3];
   }

   private static void m10000() {
      f13000 = new boolean[]{false, true, false};
      f63000 = new boolean[]{true, false, true, false, true, false};
      f43000 = new boolean[]{false, true, false};
      f91000 = new boolean[]{true, false, true};
      f85000 = new boolean[]{false, true, false, true, false, true};
      f6000 = new boolean[]{false, true, false, false, false};
      f46000 = new boolean[]{true, true, false, false, true};
      f5000 = new boolean[]{false, false, false, true};
      f17000 = new boolean[]{true, false, false, false, true, true};
      f92000 = new boolean[]{true, true, false, true, true, true};
      f58000 = new boolean[]{false, true};
      f99000 = new boolean[]{false, false, true, true, false, true, false};
      f19000 = new boolean[]{true, false, true, false, true};
      f74000 = new boolean[]{false, false, false};
      f95000 = new boolean[]{false, false, true, false, true, false, false};
      f25000 = new boolean[]{true, false, false};
      f10000 = new boolean[]{false, true, true, false, true, false, true, true};
      f14000 = new boolean[]{false, true};
      f108000 = new boolean[]{false, true};
      f44000 = new boolean[]{false, false, true, false, false};
      f51000 = new boolean[]{false, false, false, true};
      f57000 = new boolean[]{false, false, false, false, true, false, false, true};
   }

   private static void m88000() {
      f45000 = new int[]{16777215, 16766976, -7171438, -16777216};
   }

   private static C0031 m98000(C1119 var0) {
      float var1 = var0.m32000();
      C0056[] var10000 = new C0056[f96000[1]];
      var10000[f91000[1]] = (C0056)f36000[f88000[5]];
      var10000[f91000[2]] = C0056.m130000().m56000(-var0.m20000() * f111000[7] * var1);
      C0056 var2 = C0056.m120000(var10000);
      return C0287.m26000(var2, var2x -> {
         var2x.N(f76000[1]);
         var2x.y(var2xx -> ((C0296)var2xx.N(f69000[0])).m2000(var0.m46000()).N(m134000(f62000[3] - var1)));
      });
   }

   public boolean m14000() {
      return NursultanClient.m88000().m64000().U();
   }

   private static void m102000(C0288 var0, String var1, NQo var2) {
      int var3 = var2.c();
      if (var3 > f43000[1]) {
         String var4 = Integer.toString(var3);
         var0.N((C0056)f48000[f88000[0]], var2x -> {
            var2x.N(var1 + "-count");
            var2x.y(var2xx -> ((C0296)var2xx.N(var1 + "-count-text")).m2000(var4).N((C0056)f81000[f39000[1]]));
         });
      }
   }

   private static C0031 m104000(C1119 var0) {
      return C0287.m26000((C0056)f81000[f88000[1]], var1 -> {
         var1.N(f69000[3]);
         var1.y(m16000(var0));
      });
   }

   private static C0031 m120000(OlIrtqjti var0, float var1, float var2) {
      int var3 = var0.m6000();
      boolean var4 = m128000((NjL)f7000[f117000[0]]) != null ? f63000[2] : f63000[3];
      String var5 = ((NjL)f7000[f117000[1]]).method_5477().getString();
      boolean var6 = m32000(var5);
      return C0287.m26000(
         (C0056)f81000[f29000[0]],
         var6x -> {
            var6x.N(f16000[1]);
            var6x.N(
               (C0056)f41000[f39000[7]],
               var1xx -> {
                  var1xx.N(f55000[2]);
                  var1xx.N(
                     (C0056)f30000[f38000[2]],
                     var1xxx -> {
                        var1xxx.N(f55000[3]);
                        if (var4) {
                           var1xxx.y(
                              ((C0299)((C0299)C0287.m36000().N(f55000[4])).N((C0056)f30000[f38000[3]]))
                                 .m4000(var0xxxx -> m166000(var0xxxx.m14000(), var0xxxx.m12000(), var0xxxx.m2000(), var0xxxx.m10000()))
                                 .m2000()
                           );
                        }
                     }
                  );
               }
            );
            var6x.N(var0xx -> ((C0288)var0xx.N(f55000[1])).N((C0056)f81000[f38000[1]]));
            var6x.N(
               (C0056)f48000[f21000[0]],
               var2xx -> {
                  var2xx.N(f16000[5]);
                  if (var6) {
                     var2xx.y(
                        ((C0299)((C0299)C0287.m36000().N(f16000[6])).N(m200000()))
                           .m4000(var1xxx -> m188000(var5, var1xxx.m14000(), var1xxx.m12000(), var1xxx.m2000(), var1xxx.m10000()))
                           .m2000()
                     );
                     var2xx.N(var0xxx -> ((C0288)var0xxx.N(f55000[0])).N((C0056)f36000[f38000[0]]));
                  }
               }
            );
            var6x.N(
               (C0056)f81000[f21000[1]],
               var3xx -> {
                  var3xx.N(f16000[2]);
                  var3xx.N(
                     (C0056)f81000[f21000[2]],
                     var3xxx -> {
                        var3xxx.N(f16000[3]);
                        var3xxx.y(
                           ((C0299)((C0299)C0287.m36000().N(f16000[4])).N((C0056)f81000[f21000[3]]))
                              .m4000(var3xxxx -> m162000(var3xxxx.m14000(), var3xxxx.m12000(), var3xxxx.m2000(), var3xxxx.m10000(), var3, var1, var2))
                              .m2000()
                        );
                     }
                  );
               }
            );
         }
      );
   }

   private static NNNG m128000(NjL var0) {
      if (m40000()) {
         return null;
      } else if (var0 instanceof NNNwz var1) {
         NNNAB var2 = var1.Z();
         return var2 != null ? var2.N().y() : null;
      } else {
         return null;
      }
   }

   private static C0056 m134000(float var0) {
      if (var0 >= f64000[1]) {
         return (C0056)f36000[f47000[1]];
      } else {
         C0056[] var10000 = new C0056[f96000[3]];
         var10000[f85000[2]] = (C0056)f36000[f47000[2]];
         var10000[f85000[3]] = C0056.m130000().m40000(C0876.m30000((Integer)C0077.f1000[f47000[3]], var0));
         return C0056.m120000(var10000);
      }
   }

   private static void m148000(C0288 var0, String var1, NQo var2) {
      if (var2.m()) {
         int var3 = var2.s();
         if (var3 > 0) {
            float var4 = f111000[3] - (float)var2.P() / var3;
            int var5 = Math.max(f43000[0], Math.round(var4 * f111000[4]));
            int var6 = C0876.m60000(var4);
            var0.N((C0056)f48000[f15000[1]], var3x -> {
               var3x.N(var1 + "-damageBg");
               if (var5 > 0) {
                  C0056 var4x = C0056.m130000().m78000(var5, f87000[4]).m86000(var6);
                  var3x.N(var2xx -> ((C0288)var2xx.N(var1 + "-damageBar")).N(var4x));
               }
            });
         }
      }
   }

   public boolean m20000() {
      if ((NNNwS)((NNuU)f104000[f18000[0]]).T[f18000[1]] == null) {
         Object var6 = null;
         f7000[f18000[2]] = var6;
         return f13000[0];
      } else {
         NjL var1 = m72000();
         if (var1 != null) {
            f7000[f18000[3]] = var1;
            return f13000[1];
         } else {
            return f13000[2];
         }
      }
   }

   private static void m162000(float var0, float var1, float var2, float var3, int var4, float var5, float var6) {
      if ((NjL)f7000[f54000[0]] != null) {
         float var7 = f12000[1] * (var2 / f12000[2]);
         C0806.m32000((C0830)f49000[f54000[1]], var0, var1, var2, var3, f12000[3], f12000[4], f12000[5], f86000[0], f96000[5]);
         ((C0805)f41000[f54000[2]])
            .m32000(
               var6x -> {
                  var6x.m66000(f72000[2]).m18000(IlkOns.m10000());
                  var6x.m66000(f84000[0]).m18000(RenderSystem.getModelViewMatrix());
                  var6x.m106000(f84000[1]).m18000(var2, var3);
                  var6x.m32000(f84000[2]).m20000(var7);
                  var6x.m32000(f84000[3]).m20000(var5);
                  var6x.m32000(f84000[4]).m20000(var6);
                  var6x.m94000(f84000[5])
                     .m18000(C0876.m28000(var4) / f86000[1], C0876.m58000(var4) / f112000[0], C0876.m20000(var4) / f112000[1], C0876.m46000(var4) / f112000[2]);
                  var6x.m94000(f84000[6])
                     .m18000(
                        C0876.m28000((Integer)f94000[f1000[1]]) / f112000[3],
                        C0876.m58000((Integer)f94000[f1000[2]]) / f59000[0],
                        C0876.m20000((Integer)f94000[f1000[3]]) / f59000[1],
                        C0876.m46000((Integer)f94000[f1000[4]]) / f59000[2]
                     );
                  var6x.m94000(f8000[0])
                     .m18000(
                        C0876.m28000((Integer)f70000[f1000[5]]) / f59000[3],
                        C0876.m58000((Integer)f70000[f90000[0]]) / f62000[0],
                        C0876.m20000((Integer)f70000[f90000[1]]) / f62000[1],
                        C0876.m46000((Integer)f70000[f90000[2]]) / f62000[2]
                     );
               }
            );
      }
   }

   private static void m166000(float var0, float var1, float var2, float var3) {
      if ((NjL)f7000[f61000[0]] != null) {
         NNNG var4 = m128000((NjL)f7000[f61000[1]]);
         if (var4 != null) {
            qZ var5 = ((NNuU)f104000[f61000[2]]).NO().y(var4);
            if (var5.method_68004() instanceof pz var6) {
               int var9 = var6.N();
               C0806.m32000((C0830)f49000[f61000[3]], var0, var1, var2, var3, f64000[2], f64000[3], f42000[0], f42000[1], f96000[4]);
               float var8 = f42000[2] * (var2 / f12000[0]);
               ((C0805)f49000[f61000[4]]).m32000(var4x -> {
                  var4x.m66000(f8000[1]).m18000(IlkOns.m10000());
                  var4x.m66000(f8000[2]).m18000(RenderSystem.getModelViewMatrix());
                  var4x.m106000(f8000[3]).m18000(var2, var3);
                  var4x.m32000(f8000[4]).m20000(var8);
                  var4x.m10000(f76000[0]).m8000(var9);
               });
            }
         }
      }
   }

   private static C0031 m172000(String var0, NQo var1) {
      return C0287.m26000((C0056)f48000[f15000[0]], var2 -> {
         var2.N(var0);
         if (var1.R()) {
            var2.L(var1xx -> ((C0286)var1xx.N(var0 + "-x")).m2000(f69000[4]).N((C0056)f48000[f39000[3]]));
         } else {
            Oljjtpnom var3 = NursultanClient.m66000().m70000(var1);
            if (var3.m4000()) {
               C0056[] var10000 = new C0056[f9000[2]];
               var10000[f46000[3]] = (C0056)f48000[f39000[2]];
               var10000[f46000[4]] = C0056.m130000().m114000(var3.m22000(), var3.m28000(), var3.m30000(), var3.m14000());
               C0056 var4 = C0056.m120000(var10000);
               var2.L(var2x -> ((C0286)var2x.N(var0 + "-icon")).m2000(NursultanClient.m66000().m42000()).N(var4));
            }

            if (m54000()) {
               m148000(var2, var0, var1);
               m102000(var2, var0, var1);
            }
         }
      });
   }

   private static C0031 m174000(String var0, char var1, float var2, float var3) {
      C0056 var10000;
      if (var2 == f64000[0]) {
         var10000 = (C0056)f36000[f88000[6]];
      } else {
         C0056[] var5 = new C0056[f96000[2]];
         var5[f85000[0]] = (C0056)f36000[f47000[0]];
         var5[f85000[1]] = C0056.m130000().m56000(var2);
         var10000 = C0056.m120000(var5);
      }

      C0056 var4 = var10000;
      return C0287.m26000(var4, var3x -> {
         var3x.N(var0);
         var3x.y(var3xx -> ((C0296)var3xx.N(var0 + "-text")).m2000(String.valueOf(var1)).N(m134000(var3)));
      });
   }

   private static C0031 m28000(Void var0, Iface0202 var1) {
      OlIrtqjti var2 = var1.m28000((C0297<OlIrtqjti>)OlIrtqjti.f4000[f52000[0]]);
      var1.m2000(f68000[0], C0140::m2000);
      var1.m2000(f68000[1], C0140::m70000);
      var1.m2000(f68000[2], C0140::m54000);
      var1.m2000(f68000[3], C0140::m84000);
      var1.m2000(f4000[0], C0140::m30000);
      var1.m2000(f4000[1], C0140::m40000);
      if ((NjL)f7000[f52000[1]] == null) {
         return C0287.m24000(var0x -> ((C0288)var0x.N(f101000[3])).N((C0056)DragOffset.f16000[f22000[1]]));
      } else {
         float var3 = ((NjL)f7000[f52000[2]]).method_6032();
         float var4 = Math.max(((NjL)f7000[f52000[3]]).method_6063(), f107000[0]);
         float var5 = C0259.m4000(var3 / var4);
         C1124 var6 = var1.m4000(f4000[2], C1124::new);
         var6.m22000((NjL)f7000[f52000[4]], var5);
         float var7 = var6.m12000();
         String var8 = var3 > ((NjL)f7000[f82000[0]]).method_6063() * f107000[1] ? f4000[3] : Integer.toString((int)Math.ceil(var3));
         C1119 var9 = var1.m4000(f72000[0], C1119::new);
         var9.m42000((NjL)f7000[f82000[1]], var8, var3);
         float var10 = m30000() ? ((NjL)f7000[f82000[2]]).method_6067() : f107000[2];
         C1124 var11 = var1.m4000(f72000[1], C1124::new);
         var11.m22000((NjL)f7000[f82000[3]], var10 / f107000[3]);
         float var12 = var11.m12000();
         return C0287.m26000((C0056)f41000[f82000[4]], var4x -> {
            var4x.N(f101000[1]);
            var4x.y(m26000());
            var4x.N(var0xx -> ((C0288)var0xx.N(f101000[2])).N((C0056)f41000[f22000[0]]));
            var4x.y(m58000());
            var4x.y(m186000(var9));
            var4x.y(m120000(var2, var7, var12));
         });
      }
   }

   private static C0031 m186000(C1119 var0) {
      return C0287.m26000((C0056)f81000[f56000[1]], var1 -> {
         var1.N(f20000[3]);
         var1.y(m104000(var0));
      });
   }

   private static void m188000(String var0, float var1, float var2, float var3, float var4) {
      C1054.m46000(
         var0,
         (Integer)C0077.f1000[f3000[0]],
         f111000[1],
         (OlmmOsl)OlmmOsl.f7000[f3000[1]],
         ((Integer)f34000[f3000[2]]).intValue(),
         f111000[2],
         ((Integer)f34000[f3000[3]]).intValue(),
         ((Integer)f34000[f3000[4]]).intValue(),
         var1,
         var2,
         var3,
         var4
      );
   }

   private static C0056 m200000() {
      float var0 = NursultanClient.m42000().m52000(f111000[0], (OlmmOsl)OlmmOsl.f7000[f98000[1]]);
      return C0056.m130000().m178000(Rec0125.m24000(((Integer)f34000[f98000[2]]).intValue())).m90000(Rec0125.m24000(var0));
   }

   private static C0031 m204000() {
      boolean var0 = m128000((NjL)f7000[f82000[6]]) != null ? f63000[0] : f63000[1];
      return C0287.m26000((C0056)f30000[f56000[0]], var1 -> {
         var1.N(f20000[4]);
         if (!var0) {
            var1.L(var0xx -> ((C0286)var0xx.N(f20000[5])).m2000(f20000[6]).N((C0056)f48000[f38000[5]]));
         }
      });
   }

   private static void m208000() {
      f18000 = new short[]{0, 4, 3, 3};
      f52000 = new short[]{6, 3, 3, 3, 3};
      f82000 = new short[]{3, 3, 3, 3, 1, 2, 3};
      f56000 = new short[]{0, 3, 3, 0};
      f117000 = new short[]{3, 3};
      f29000 = new short[]{6, 4};
      f98000 = new short[]{3, 4, 1};
      f3000 = new short[]{0, 4, 1, 3, 2, 1};
      f15000 = new short[]{2, 4};
      f88000 = new short[]{5, 4, 2, 3, 3, 3, 5};
      f47000 = new short[]{5, 1, 1, 0};
      f61000 = new short[]{3, 3, 0, 5, 7};
      f54000 = new short[]{3, 6, 0, 3, 3, 3, 0};
      f105000 = new short[]{4, 3, 3, 3};
      f115000 = new short[]{0, 4, 0, 4, 0};
      f1000 = new short[]{4, 2, 2, 2, 2, 4};
      f90000 = new short[]{4, 4, 4, 4};
      f39000 = new short[]{4, 1, 3, 6, 1, 1, 3, 2};
      f21000 = new short[]{0, 3, 4, 5};
      f38000 = new short[]{0, 7, 0, 1, 2, 7};
      f22000 = new short[]{3, 3, 255, 999, 999};
   }
}

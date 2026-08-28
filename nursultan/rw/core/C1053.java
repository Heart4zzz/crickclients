package rw.core;

import rw.api.Iface0197;
import rw.api.Iface0202;
import rw.data.OlkIrprsq;
import rw.data.Rec0258;
import rw.defs.OlmmOsl;
import rw.gui.ThemeManager;
import rw.setting.C0031;

public class C1053 {
   private static short[] f1000;
   private static boolean[] f2000;
   public static Object[] f3000;
   public static Object[] f4000;
   private static int[] f5000;
   private static byte[] f6000;
   private static float[] f7000;
   private static String[] f8000;
   public static Object[] f9000;
   private static byte[] f10000;
   private static boolean[] f11000;
   private static short[] f12000;
   private static boolean[] f13000;
   private static byte[] f14000;
   private static float[] f15000;
   private static byte[] f16000;
   private static float[] f17000;

   private static void m4000() {
      f3000 = new Object[f6000[(1 | -1) >>> 31]];
      f3000[f11000[(0 | -0) >>> 31]] = Integer.valueOf(f1000[0]);
      f3000[f6000[2]] = Integer.valueOf(f6000[3]);
      f3000[f10000[(0 | -0) >>> 31]] = Integer.valueOf(f10000[1]);
      f4000 = new Object[f10000[2]];
      f4000[f11000[(1 | -1) >>> 31]] = Integer.valueOf(f11000[2]);
      f4000[f11000[3]] = Integer.valueOf(f10000[3]);
      f4000[f10000[4]] = Integer.valueOf(f10000[5]);
      f4000[f10000[6]] = Integer.valueOf(f10000[7]);
      f4000[f14000[(0 | -0) >>> 31]] = Integer.valueOf(f1000[1]);
      f4000[f14000[(1 | -1) >>> 31]] = Integer.valueOf(f14000[2]);
      f4000[f14000[3]] = Integer.valueOf(f14000[4]);
      f4000[f14000[5]] = f8000[5];
      f9000 = new Object[f14000[6]];
   }

   private static void m12000() {
      short[] var128 = new short[8];
      f12000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f12000[(1 | -1) >>> 31] = 3;
      f12000[2] = (short)((0 | -0) >>> 31);
      f12000[3] = 2;
      f12000[4] = (short)((1 | -1) >>> 31);
      f12000[5] = 3;
      f12000[6] = 4;
      f12000[7] = 3;
      short[] var129 = new short[2];
      f1000[(0 | -0) >>> 31] = 150;
      f1000[(1 | -1) >>> 31] = 134;
   }

   private C1053() {
   }

   static {
      ntfClinit();
   }

   private static void m14000() {
      boolean[] var128 = new boolean[8];
      f2000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[2] = (boolean)((1 | -1) >>> 31);
      f2000[3] = (boolean)((0 | -0) >>> 31);
      f2000[4] = (boolean)((1 | -1) >>> 31);
      f2000[5] = (boolean)((1 | -1) >>> 31);
      f2000[6] = (boolean)((0 | -0) >>> 31);
      f2000[7] = (boolean)((1 | -1) >>> 31);
      boolean[] var129 = new boolean[5];
      f13000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f13000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f13000[2] = (boolean)((0 | -0) >>> 31);
      f13000[3] = (boolean)((0 | -0) >>> 31);
      f13000[4] = (boolean)((1 | -1) >>> 31);
      boolean[] var130 = new boolean[4];
      f11000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f11000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f11000[2] = (boolean)((1 | -1) >>> 31);
      f11000[3] = (boolean)((1 | -1) >>> 31);
   }

   private static void m22000() {
      byte[] var128 = new byte[8];
      f16000[(0 | -0) >>> 31] = 2;
      f16000[(1 | -1) >>> 31] = 2;
      f16000[2] = 14;
      f16000[3] = 3;
      f16000[4] = 3;
      f16000[5] = 2;
      f16000[6] = 14;
      f16000[7] = 3;
      byte[] var129 = new byte[4];
      f6000[(0 | -0) >>> 31] = 4;
      f6000[(1 | -1) >>> 31] = 4;
      f6000[2] = 2;
      f6000[3] = 30;
      byte[] var130 = new byte[8];
      f10000[(0 | -0) >>> 31] = 3;
      f10000[(1 | -1) >>> 31] = 8;
      f10000[2] = 8;
      f10000[3] = 8;
      f10000[4] = 2;
      f10000[5] = 30;
      f10000[6] = 3;
      f10000[7] = 112;
      byte[] var131 = new byte[7];
      f14000[(0 | -0) >>> 31] = 4;
      f14000[(1 | -1) >>> 31] = 5;
      f14000[2] = 12;
      f14000[3] = 6;
      f14000[4] = 14;
      f14000[5] = 7;
      f14000[6] = 5;
   }

   private static void m28000() {
      int[] var128 = new int[3];
      f5000[(0 | -0) >>> 31] = -7171438;
      f5000[(1 | -1) >>> 31] = -7171438;
      f5000[2] = -7171438;
   }

   private C0031 m32000(Rec0258 var1, Iface0202 var2) {
      String var3 = C1235.m40000(var1.m10000().m22000());
      boolean var4 = m44000(var3);
      return C0287.m26000(
         (rw.setting.C0056)f9000[f12000[0]],
         var4x -> {
            var4x.y(var2xx -> {
               var2xx.N(f8000[4]);
               var2xx.m2000(var3);
               var2xx.N(var4 ? (rw.setting.C0056)f9000[f12000[6]] : (rw.setting.C0056)f9000[f12000[7]]);
            });
            var4x.i(
               var2xx -> {
                  var2xx.N(f8000[3]);
                  var2xx.N((rw.setting.C0056)f9000[f12000[4]]);
                  if (var4) {
                     var2xx.m4000(
                        var1xxx -> C1054.m46000(
                           var3,
                           f5000[0],
                           f15000[2],
                           (OlmmOsl)OlmmOsl.f7000[f12000[5]],
                           f15000[3],
                           f15000[4],
                           f15000[5],
                           f15000[6],
                           var1xxx.m14000(),
                           var1xxx.m12000(),
                           var1xxx.m2000(),
                           var1xxx.m10000()
                        )
                     );
                  }
               }
            );
            var4x.L(var0x -> {
               var0x.N(f8000[1]);
               var0x.m2000(f8000[2]);
               var0x.N((rw.setting.C0056)f9000[f12000[3]]);
            });
            var4x.N(var1xx -> var1.m6000().m6000(f2000[2]));
            var4x.y(var2.m18000(f8000[0], (Iface0197<OlkIrprsq>)C1058.f6000[f12000[2]], new OlkIrprsq(var1.m2000(), var1.m6000(), var1.m8000())));
         }
      );
   }

   private static void m40000() {
      f8000 = new String[6];
      f8000[(0 | -0) >>> 31] = "entryList";
      f8000[(1 | -1) >>> 31] = "selectableCheckIcon";
      f8000[2] = "icon:menu/angles";
      f8000[3] = "selectableSelectedFadeCanvas";
      f8000[4] = "selectableSelectedText";
      f8000[5] = "icon:menu/angles";
   }

   private static boolean m44000(String var0) {
      return ThemeManager.m90000(var0, f15000[0], (OlmmOsl)OlmmOsl.f7000[f12000[1]]) > f15000[1] ? f2000[0] : f2000[1];
   }

   private static void m52000() {
      float[] var128 = new float[8];
      f15000[(0 | -0) >>> 31] = Float.intBitsToFloat(1096810496);
      f15000[(1 | -1) >>> 31] = Float.intBitsToFloat(1120927744);
      f15000[2] = Float.intBitsToFloat(1096810496);
      f15000[3] = Float.intBitsToFloat(1125515264);
      f15000[4] = Float.intBitsToFloat(1090519040);
      f15000[5] = Float.intBitsToFloat(1121976320);
      f15000[6] = Float.intBitsToFloat(1124466688);
      f15000[7] = Float.intBitsToFloat(1125515264);
      float[] var129 = new float[4];
      f7000[(0 | -0) >>> 31] = Float.intBitsToFloat(1106247680);
      f7000[(1 | -1) >>> 31] = Float.intBitsToFloat(1065353216);
      f7000[2] = Float.intBitsToFloat(1090519040);
      f7000[3] = Float.intBitsToFloat(1090519040);
      float[] var130 = new float[8];
      f17000[(0 | -0) >>> 31] = Float.intBitsToFloat(1090519040);
      f17000[(1 | -1) >>> 31] = Float.intBitsToFloat(-1056964608);
      f17000[2] = Float.intBitsToFloat(1125515264);
      f17000[3] = Float.intBitsToFloat(1106247680);
      f17000[4] = Float.intBitsToFloat(1123287040);
      f17000[5] = Float.intBitsToFloat(1091567616);
      f17000[6] = Float.intBitsToFloat(1094713344);
      f17000[7] = Float.intBitsToFloat(1094713344);
   }
}

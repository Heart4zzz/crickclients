package rw.core;

import java.util.stream.Collectors;
import rw.api.Iface0197;
import rw.api.Iface0202;
import rw.data.Rec0262;
import rw.defs.OlmmOsl;
import rw.gui.ThemeManager;
import rw.setting.C0031;

public class OljItsi {
   private static byte[] f1000;
   public static Object[] f2000;
   private static byte[] f3000;
   public static Object[] f4000;
   private static String[] f5000;
   private static int[] f6000;
   private static float[] f7000;
   private static boolean[] f8000;
   private static short[] f9000;
   private static float[] f10000;
   private static boolean[] f11000;
   private static byte[] f12000;
   public static Object[] f13000;
   private static byte[] f14000;
   private static float[] f15000;
   private static byte[] f16000;
   private static boolean[] f17000;
   private static short[] f18000;
   private static String[] f19000;
   private static boolean[] f20000;

   private static void m6000() {
      byte[] var128 = new byte[6];
      f1000[(0 | -0) >>> 31] = 2;
      f1000[(1 | -1) >>> 31] = 3;
      f1000[2] = 2;
      f1000[3] = 14;
      f1000[4] = 3;
      f1000[5] = 4;
      byte[] var129 = new byte[4];
      f3000[(0 | -0) >>> 31] = 2;
      f3000[(1 | -1) >>> 31] = 14;
      f3000[2] = 3;
      f3000[3] = 5;
      byte[] var130 = new byte[4];
      f12000[(0 | -0) >>> 31] = 7;
      f12000[(1 | -1) >>> 31] = 2;
      f12000[2] = 3;
      f12000[3] = 30;
      byte[] var131 = new byte[7];
      f14000[(0 | -0) >>> 31] = 4;
      f14000[(1 | -1) >>> 31] = 8;
      f14000[2] = 5;
      f14000[3] = 6;
      f14000[4] = 8;
      f14000[5] = 5;
      f14000[6] = 30;
      byte[] var132 = new byte[7];
      f16000[(0 | -0) >>> 31] = 112;
      f16000[(1 | -1) >>> 31] = 2;
      f16000[2] = 3;
      f16000[3] = 12;
      f16000[4] = 4;
      f16000[5] = 14;
      f16000[6] = 6;
   }

   private static void m10000() {
      float[] var128 = new float[6];
      f15000[(0 | -0) >>> 31] = Float.intBitsToFloat(1096810496);
      f15000[(1 | -1) >>> 31] = Float.intBitsToFloat(1120927744);
      f15000[2] = Float.intBitsToFloat(1096810496);
      f15000[3] = Float.intBitsToFloat(1125515264);
      f15000[4] = Float.intBitsToFloat(1090519040);
      f15000[5] = Float.intBitsToFloat(1121976320);
      float[] var129 = new float[6];
      f7000[(0 | -0) >>> 31] = Float.intBitsToFloat(1124466688);
      f7000[(1 | -1) >>> 31] = Float.intBitsToFloat(1125515264);
      f7000[2] = Float.intBitsToFloat(1106247680);
      f7000[3] = Float.intBitsToFloat(1065353216);
      f7000[4] = Float.intBitsToFloat(1090519040);
      f7000[5] = Float.intBitsToFloat(1090519040);
      float[] var130 = new float[8];
      f10000[(0 | -0) >>> 31] = Float.intBitsToFloat(1090519040);
      f10000[(1 | -1) >>> 31] = Float.intBitsToFloat(-1056964608);
      f10000[2] = Float.intBitsToFloat(1125515264);
      f10000[3] = Float.intBitsToFloat(1106247680);
      f10000[4] = Float.intBitsToFloat(1123287040);
      f10000[5] = Float.intBitsToFloat(1091567616);
      f10000[6] = Float.intBitsToFloat(1094713344);
      f10000[7] = Float.intBitsToFloat(1094713344);
   }

   private OljItsi() {
   }

   static {
      ntfClinit();
   }

   private static boolean m16000(String var0) {
      return ThemeManager.m90000(var0, f15000[0], (OlmmOsl)OlmmOsl.f7000[f9000[1]]) > f15000[1] ? f20000[0] : f20000[1];
   }

   private static void m22000() {
      short[] var128 = new short[4];
      f9000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f9000[(1 | -1) >>> 31] = 3;
      f9000[2] = (short)((0 | -0) >>> 31);
      f9000[3] = 3;
      short[] var129 = new short[6];
      f18000[(0 | -0) >>> 31] = 2;
      f18000[(1 | -1) >>> 31] = 3;
      f18000[2] = 5;
      f18000[3] = 4;
      f18000[4] = 150;
      f18000[5] = 134;
   }

   private static void m28000() {
      boolean[] var128 = new boolean[4];
      f20000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f20000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f20000[2] = (boolean)((1 | -1) >>> 31);
      f20000[3] = (boolean)((0 | -0) >>> 31);
      boolean[] var129 = new boolean[2];
      f8000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f8000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      boolean[] var130 = new boolean[5];
      f17000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f17000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f17000[2] = (boolean)((1 | -1) >>> 31);
      f17000[3] = (boolean)((0 | -0) >>> 31);
      f17000[4] = (boolean)((0 | -0) >>> 31);
      boolean[] var131 = new boolean[6];
      f11000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f11000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f11000[2] = (boolean)((1 | -1) >>> 31);
      f11000[3] = (boolean)((0 | -0) >>> 31);
      f11000[4] = (boolean)((1 | -1) >>> 31);
      f11000[5] = (boolean)((0 | -0) >>> 31);
   }

   private static void m34000() {
      f2000 = new Object[f12000[(0 | -0) >>> 31]];
      f2000[f11000[(1 | -1) >>> 31]] = f19000[(1 | -1) >>> 31];
      f2000[f12000[(1 | -1) >>> 31]] = Integer.valueOf(f18000[4]);
      f2000[f12000[2]] = Integer.valueOf(f12000[3]);
      f2000[f14000[(0 | -0) >>> 31]] = Integer.valueOf(f14000[1]);
      f2000[f14000[2]] = Integer.valueOf(f11000[2]);
      f2000[f14000[3]] = Integer.valueOf(f14000[4]);
      f13000 = new Object[f14000[5]];
      f13000[f11000[3]] = Integer.valueOf(f14000[6]);
      f13000[f11000[4]] = Integer.valueOf(f16000[0]);
      f13000[f16000[(1 | -1) >>> 31]] = Integer.valueOf(f18000[5]);
      f13000[f16000[2]] = Integer.valueOf(f16000[3]);
      f13000[f16000[4]] = Integer.valueOf(f16000[5]);
      f4000 = new Object[f16000[6]];
      f4000[f11000[5]] = f19000[2];
   }

   private C0031 m40000(Rec0262 var1, Iface0202 var2) {
      String var3 = m60000(var1);
      boolean var4 = m16000(var3);
      return C0287.m26000(
         (rw.setting.C0056)f4000[f9000[0]],
         var4x -> {
            var4x.y(var2xx -> {
               var2xx.N(f19000[0]);
               var2xx.m2000(var3);
               var2xx.N(var4 ? (rw.setting.C0056)f4000[f18000[2]] : (rw.setting.C0056)f4000[f18000[3]]);
            });
            var4x.i(
               var2xx -> {
                  var2xx.N(f5000[5]);
                  var2xx.N((rw.setting.C0056)f4000[f18000[0]]);
                  if (var4) {
                     var2xx.m4000(
                        var1xxx -> C1054.m46000(
                           var3,
                           f6000[0],
                           f15000[2],
                           (OlmmOsl)OlmmOsl.f7000[f18000[1]],
                           f15000[3],
                           f15000[4],
                           f15000[5],
                           f7000[0],
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
               var0x.N(f5000[3]);
               var0x.m2000(f5000[4]);
               var0x.N((rw.setting.C0056)f4000[f9000[3]]);
            });
            var4x.N(var1xx -> var1.m2000().m6000(f20000[2]));
            var4x.y(var2.m18000(f5000[2], (Iface0197<Rec0262>)C1052.f11000[f9000[2]], var1));
         }
      );
   }

   private static void m42000() {
      f5000 = new String[6];
      f5000[(0 | -0) >>> 31] = ", ";
      f5000[(1 | -1) >>> 31] = "—";
      f5000[2] = "comboList";
      f5000[3] = "comboCheckIcon";
      f5000[4] = "icon:menu/angles";
      f5000[5] = "comboSelectedFadeCanvas";
      f19000 = new String[3];
      f19000[(0 | -0) >>> 31] = "comboSelectedText";
      f19000[(1 | -1) >>> 31] = "—";
      f19000[2] = "icon:menu/angles";
   }

   private static String m60000(Rec0262 var0) {
      String var1 = var0.m8000().stream().filter(C1013::m14000).map(var0x -> C1235.m40000(var0x.m22000())).collect(Collectors.joining(f5000[0]));
      return var1.isEmpty() ? f5000[1] : var1;
   }

   private static void m64000() {
      int[] var128 = new int[3];
      f6000[(0 | -0) >>> 31] = -7171438;
      f6000[(1 | -1) >>> 31] = -7171438;
      f6000[2] = -7171438;
   }
}

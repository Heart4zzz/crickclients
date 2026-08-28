package rw.setting;

import java.awt.Color;
import java.util.LinkedList;
import java.util.OptionalInt;
import rw.NursultanClient;
import rw.api.Iface0196;
import rw.api.Iface0202;
import rw.core.C0077;
import rw.core.C0248;
import rw.core.C0287;
import rw.core.C0299;
import rw.core.C0300;
import rw.core.C0310;
import rw.core.C0318;
import rw.core.C0876;
import rw.core.C1048;
import rw.core.C1051;
import rw.core.C1056;
import rw.core.C1063;
import rw.core.C1070;
import rw.data.Rec0279;
import rw.defs.Enum0026;
import rw.defs.Enum0032;
import rw.defs.Enum0040;

public class EyEa {
   private static float[] f1000;
   private static float[] f2000;
   private static byte[] f3000;
   public static Object[] f4000;
   private static byte[] f5000;
   private static short[] f6000;
   private static byte[] f7000;
   private static boolean[] f8000;
   private static boolean[] f9000;
   private static float[] f10000;
   private static String[] f11000;
   private static float[] f12000;
   public static Object[] f13000;
   private static short[] f14000;
   private static boolean[] f15000;
   private static float[] f16000;
   private static float[] f17000;
   public static Object[] f18000;
   private static boolean[] f19000;
   private static String[] f20000;
   private static short[] f21000;
   private static float[] f22000;
   private static short[] f23000;
   private static float[] f24000;
   private static byte[] f25000;
   private static short[] f26000;
   private static byte[] f27000;
   private static float[] f28000;
   private static float[] f29000;
   private static int[] f30000;
   private static byte[] f31000;
   private static float[] f32000;
   private static float[] f33000;
   private static byte[] f34000;
   private static boolean[] f35000;
   private static float[] f36000;
   private static float[] f37000;
   private static float[] f38000;
   private static boolean[] f39000;
   private static float[] f40000;
   private static float[] f41000;
   private static float[] f42000;
   public static Object[] f43000;
   private static float[] f44000;
   private static boolean[] f45000;
   private static byte[] f46000;
   private static boolean[] f47000;
   public static Object[] f48000;
   private static float[] f49000;
   public static Object[] f50000;
   private static byte[] f51000;
   private static boolean[] f52000;
   private static String[] f53000;
   private static short[] f54000;
   private static float[] f55000;
   private static String[] f56000;
   private static boolean[] f57000;
   private static boolean[] f58000;
   private static float[] f59000;
   private static byte[] f60000;
   private static byte[] f61000;
   private static boolean[] f62000;
   private static boolean[] f63000;
   private static boolean[] f64000;
   private static boolean[] f65000;
   private static float[] f66000;
   private static short[] f67000;
   private static byte[] f68000;
   private static byte[] f69000;
   public static Object[] f70000;
   private static float[] f71000;
   private static float[] f72000;
   private static float[] f73000;
   private static float[] f74000;

   private static OptionalInt m10000(String var0) {
      String var1 = var0.trim();
      if (var1.endsWith(f56000[4])) {
         var1 = var1.substring(f35000[3], var1.length() - f19000[0]);
      }

      if (!var1.isEmpty() && var1.chars().allMatch(Character::isDigit)) {
         try {
            int var2 = Math.clamp((long)Integer.parseInt(var1), f19000[1], f68000[2]);
            return OptionalInt.of(Math.round(var2 * f72000[4] / f37000[0]));
         } catch (NumberFormatException var3) {
            return OptionalInt.empty();
         }
      } else {
         return OptionalInt.empty();
      }
   }

   private static void m12000() {
      float[] var128 = new float[5];
      f55000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f55000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
      f55000[2] = Float.intBitsToFloat(1092616192);
      f55000[3] = Float.intBitsToFloat(1092616192);
      f55000[4] = Float.intBitsToFloat(1086324736);
      float[] var129 = new float[7];
      f59000[(0 | -0) >>> 31] = Float.intBitsToFloat(1036831949);
      f59000[(1 | -1) >>> 31] = Float.intBitsToFloat(1065353216);
      f59000[2] = Float.intBitsToFloat(1176255488);
      f59000[3] = Float.intBitsToFloat(1090519040);
      f59000[4] = Float.intBitsToFloat(1096810496);
      f59000[5] = Float.intBitsToFloat(-1073741824);
      f59000[6] = Float.intBitsToFloat(1086324736);
      float[] var130 = new float[3];
      f49000[(0 | -0) >>> 31] = Float.intBitsToFloat(1036831949);
      f49000[(1 | -1) >>> 31] = Float.intBitsToFloat(1073741824);
      f49000[2] = Float.intBitsToFloat(1176255488);
      float[] var131 = new float[3];
      f29000[(0 | -0) >>> 31] = Float.intBitsToFloat(1096810496);
      f29000[(1 | -1) >>> 31] = Float.intBitsToFloat(1096810496);
      f29000[2] = Float.intBitsToFloat(-1073741824);
      float[] var132 = new float[6];
      f40000[(0 | -0) >>> 31] = Float.intBitsToFloat(1086324736);
      f40000[(1 | -1) >>> 31] = Float.intBitsToFloat(1036831949);
      f40000[2] = Float.intBitsToFloat(1176255488);
      f40000[3] = Float.intBitsToFloat(0);
      f40000[4] = Float.intBitsToFloat(1092616192);
      f40000[5] = Float.intBitsToFloat(0);
      float[] var133 = new float[7];
      f42000[(0 | -0) >>> 31] = Float.intBitsToFloat(1092616192);
      f42000[(1 | -1) >>> 31] = Float.intBitsToFloat(1084227584);
      f42000[2] = Float.intBitsToFloat(0);
      f42000[3] = Float.intBitsToFloat(1084227584);
      f42000[4] = Float.intBitsToFloat(0);
      f42000[5] = Float.intBitsToFloat(1065353216);
      f42000[6] = Float.intBitsToFloat(1132396544);
      float[] var134 = new float[5];
      f36000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f36000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
      f36000[2] = Float.intBitsToFloat(0);
      f36000[3] = Float.intBitsToFloat(1065353216);
      f36000[4] = Float.intBitsToFloat(1065353216);
      float[] var135 = new float[5];
      f71000[(0 | -0) >>> 31] = Float.intBitsToFloat(1065353216);
      f71000[(1 | -1) >>> 31] = Float.intBitsToFloat(1065353216);
      f71000[2] = Float.intBitsToFloat(1065353216);
      f71000[3] = Float.intBitsToFloat(1056964608);
      f71000[4] = Float.intBitsToFloat(1056964608);
      float[] var136 = new float[5];
      f72000[(0 | -0) >>> 31] = Float.intBitsToFloat(1056964608);
      f72000[(1 | -1) >>> 31] = Float.intBitsToFloat(1065353216);
      f72000[2] = Float.intBitsToFloat(1056964608);
      f72000[3] = Float.intBitsToFloat(0);
      f72000[4] = Float.intBitsToFloat(1132396544);
      float[] var137 = new float[4];
      f37000[(0 | -0) >>> 31] = Float.intBitsToFloat(1120403456);
      f37000[(1 | -1) >>> 31] = Float.intBitsToFloat(1131282432);
      f37000[2] = Float.intBitsToFloat(1127219200);
      f37000[3] = Float.intBitsToFloat(0);
      float[] var138 = new float[6];
      f38000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f38000[(1 | -1) >>> 31] = Float.intBitsToFloat(1065353216);
      f38000[2] = Float.intBitsToFloat(0);
      f38000[3] = Float.intBitsToFloat(0);
      f38000[4] = Float.intBitsToFloat(1073741824);
      f38000[5] = Float.intBitsToFloat(1065353216);
      float[] var139 = new float[2];
      f2000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f2000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
      float[] var140 = new float[5];
      f33000[(0 | -0) >>> 31] = Float.intBitsToFloat(1065353216);
      f33000[(1 | -1) >>> 31] = Float.intBitsToFloat(1120403456);
      f33000[2] = Float.intBitsToFloat(1132396544);
      f33000[3] = Float.intBitsToFloat(1132396544);
      f33000[4] = Float.intBitsToFloat(1065353216);
      float[] var141 = new float[4];
      f32000[(0 | -0) >>> 31] = Float.intBitsToFloat(1065353216);
      f32000[(1 | -1) >>> 31] = Float.intBitsToFloat(1132396544);
      f32000[2] = Float.intBitsToFloat(0);
      f32000[3] = Float.intBitsToFloat(0);
      float[] var142 = new float[3];
      f74000[(0 | -0) >>> 31] = Float.intBitsToFloat(1065353216);
      f74000[(1 | -1) >>> 31] = Float.intBitsToFloat(1065353216);
      f74000[2] = Float.intBitsToFloat(0);
      float[] var143 = new float[4];
      f1000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f1000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
      f1000[2] = Float.intBitsToFloat(0);
      f1000[3] = Float.intBitsToFloat(0);
      float[] var144 = new float[8];
      f22000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f22000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
      f22000[2] = Float.intBitsToFloat(0);
      f22000[3] = Float.intBitsToFloat(0);
      f22000[4] = Float.intBitsToFloat(1090519040);
      f22000[5] = Float.intBitsToFloat(1101004800);
      f22000[6] = Float.intBitsToFloat(1103626240);
      f22000[7] = Float.intBitsToFloat(1065353216);
      float[] var145 = new float[3];
      f24000[(0 | -0) >>> 31] = Float.intBitsToFloat(1097859072);
      f24000[(1 | -1) >>> 31] = Float.intBitsToFloat(1090519040);
      f24000[2] = Float.intBitsToFloat(1065353216);
      float[] var146 = new float[2];
      f28000[(0 | -0) >>> 31] = Float.intBitsToFloat(1131937792);
      f28000[(1 | -1) >>> 31] = Float.intBitsToFloat(1127874560);
      float[] var147 = new float[2];
      f17000[(0 | -0) >>> 31] = Float.intBitsToFloat(1120403456);
      f17000[(1 | -1) >>> 31] = Float.intBitsToFloat(1086324736);
      float[] var148 = new float[3];
      f12000[(0 | -0) >>> 31] = Float.intBitsToFloat(1120403456);
      f12000[(1 | -1) >>> 31] = Float.intBitsToFloat(1096810496);
      f12000[2] = Float.intBitsToFloat(1120403456);
      float[] var149 = new float[3];
      f66000[(0 | -0) >>> 31] = Float.intBitsToFloat(1092616192);
      f66000[(1 | -1) >>> 31] = Float.intBitsToFloat(1176255488);
      f66000[2] = Float.intBitsToFloat(1120403456);
      float[] var150 = new float[5];
      f16000[(0 | -0) >>> 31] = Float.intBitsToFloat(1092616192);
      f16000[(1 | -1) >>> 31] = Float.intBitsToFloat(1176255488);
      f16000[2] = Float.intBitsToFloat(1120403456);
      f16000[3] = Float.intBitsToFloat(1086324736);
      f16000[4] = Float.intBitsToFloat(1107296256);
      float[] var151 = new float[4];
      f73000[(0 | -0) >>> 31] = Float.intBitsToFloat(1107296256);
      f73000[(1 | -1) >>> 31] = Float.intBitsToFloat(1065353216);
      f73000[2] = Float.intBitsToFloat(1090519040);
      f73000[3] = Float.intBitsToFloat(1098907648);
      float[] var152 = new float[4];
      f41000[(0 | -0) >>> 31] = Float.intBitsToFloat(1098907648);
      f41000[(1 | -1) >>> 31] = Float.intBitsToFloat(1107296256);
      f41000[2] = Float.intBitsToFloat(1065353216);
      f41000[3] = Float.intBitsToFloat(1090519040);
      float[] var153 = new float[8];
      f44000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f44000[(1 | -1) >>> 31] = Float.intBitsToFloat(2139095040);
      f44000[2] = Float.intBitsToFloat(1113063424);
      f44000[3] = Float.intBitsToFloat(1103101952);
      f44000[4] = Float.intBitsToFloat(1090519040);
      f44000[5] = Float.intBitsToFloat(1103101952);
      f44000[6] = Float.intBitsToFloat(1103101952);
      f44000[7] = Float.intBitsToFloat(1065353216);
      float[] var154 = new float[6];
      f10000[(0 | -0) >>> 31] = Float.intBitsToFloat(1176255488);
      f10000[(1 | -1) >>> 31] = Float.intBitsToFloat(-1056964608);
      f10000[2] = Float.intBitsToFloat(0);
      f10000[3] = Float.intBitsToFloat(0);
      f10000[4] = Float.intBitsToFloat(1056964608);
      f10000[5] = Float.intBitsToFloat(1056964608);
   }

   private static float m20000(int var0) {
      return f6000[2] - var0 - f38000[2];
   }

   private static void m26000() {
      byte[] var128 = new byte[5];
      f27000[(0 | -0) >>> 31] = -1;
      f27000[(1 | -1) >>> 31] = 8;
      f27000[2] = -1;
      f27000[3] = 14;
      f27000[4] = -1;
      byte[] var129 = new byte[5];
      f7000[(0 | -0) >>> 31] = 8;
      f7000[(1 | -1) >>> 31] = 14;
      f7000[2] = 2;
      f7000[3] = 2;
      f7000[4] = 2;
      byte[] var130 = new byte[7];
      f69000[(0 | -0) >>> 31] = 8;
      f69000[(1 | -1) >>> 31] = 6;
      f69000[2] = 6;
      f69000[3] = 16;
      f69000[4] = 48;
      f69000[5] = 57;
      f69000[6] = 97;
      byte[] var131 = new byte[2];
      f5000[(0 | -0) >>> 31] = 102;
      f5000[(1 | -1) >>> 31] = 65;
      byte[] var132 = new byte[6];
      f68000[(0 | -0) >>> 31] = 70;
      f68000[(1 | -1) >>> 31] = 3;
      f68000[2] = 100;
      f68000[3] = 3;
      f68000[4] = 2;
      f68000[5] = 2;
      byte[] var133 = new byte[3];
      f60000[(0 | -0) >>> 31] = 2;
      f60000[(1 | -1) >>> 31] = 2;
      f60000[2] = 3;
      byte[] var134 = new byte[8];
      f61000[(0 | -0) >>> 31] = 4;
      f61000[(1 | -1) >>> 31] = 2;
      f61000[2] = 3;
      f61000[3] = 4;
      f61000[4] = 2;
      f61000[5] = 2;
      f61000[6] = 2;
      f61000[7] = 2;
      byte[] var135 = new byte[8];
      f25000[(0 | -0) >>> 31] = 14;
      f25000[(1 | -1) >>> 31] = 3;
      f25000[2] = 2;
      f25000[3] = 2;
      f25000[4] = 2;
      f25000[5] = 3;
      f25000[6] = 2;
      f25000[7] = 4;
      byte[] var136 = new byte[6];
      f51000[(0 | -0) >>> 31] = 5;
      f51000[(1 | -1) >>> 31] = 6;
      f51000[2] = 8;
      f51000[3] = 8;
      f51000[4] = 2;
      f51000[5] = 3;
      byte[] var137 = new byte[4];
      f34000[(0 | -0) >>> 31] = 4;
      f34000[(1 | -1) >>> 31] = 10;
      f34000[2] = 5;
      f34000[3] = 10;
      byte[] var138 = new byte[6];
      f31000[(0 | -0) >>> 31] = 6;
      f31000[(1 | -1) >>> 31] = 32;
      f31000[2] = 7;
      f31000[3] = 54;
      f31000[4] = 2;
      f31000[5] = 8;
      byte[] var139 = new byte[5];
      f46000[(0 | -0) >>> 31] = 14;
      f46000[(1 | -1) >>> 31] = 3;
      f46000[2] = 14;
      f46000[3] = 2;
      f46000[4] = -2;
      byte[] var140 = new byte[7];
      f3000[(0 | -0) >>> 31] = 5;
      f3000[(1 | -1) >>> 31] = 8;
      f3000[2] = 2;
      f3000[3] = 5;
      f3000[4] = 3;
      f3000[5] = 8;
      f3000[6] = 7;
   }

   private static boolean m32000(String var0) {
      if (!var0.isEmpty() && !var0.equals(f56000[0])) {
         String var1 = var0.startsWith(f56000[1]) ? var0.substring(f52000[4]) : var0;
         return var1.length() <= f69000[1] && var1.chars().allMatch(EyEa::m100000) ? f52000[5] : f52000[6];
      } else {
         return f52000[3];
      }
   }

   private EyEa() {
   }

   static {
      ntfClinit();
   }

   private static void m40000() {
      boolean[] var128 = new boolean[4];
      f62000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f62000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f62000[2] = (boolean)((0 | -0) >>> 31);
      f62000[3] = (boolean)((0 | -0) >>> 31);
      boolean[] var129 = new boolean[6];
      f45000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f45000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f45000[2] = (boolean)((1 | -1) >>> 31);
      f45000[3] = (boolean)((1 | -1) >>> 31);
      f45000[4] = (boolean)((0 | -0) >>> 31);
      f45000[5] = (boolean)((1 | -1) >>> 31);
      boolean[] var130 = new boolean[7];
      f52000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f52000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f52000[2] = (boolean)((1 | -1) >>> 31);
      f52000[3] = (boolean)((1 | -1) >>> 31);
      f52000[4] = (boolean)((1 | -1) >>> 31);
      f52000[5] = (boolean)((1 | -1) >>> 31);
      f52000[6] = (boolean)((0 | -0) >>> 31);
      boolean[] var131 = new boolean[4];
      f8000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f8000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f8000[2] = (boolean)((0 | -0) >>> 31);
      f8000[3] = (boolean)((0 | -0) >>> 31);
      boolean[] var132 = new boolean[4];
      f35000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f35000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f35000[2] = (boolean)((0 | -0) >>> 31);
      f35000[3] = (boolean)((0 | -0) >>> 31);
      boolean[] var133 = new boolean[8];
      f19000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f19000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f19000[2] = (boolean)((0 | -0) >>> 31);
      f19000[3] = (boolean)((1 | -1) >>> 31);
      f19000[4] = (boolean)((0 | -0) >>> 31);
      f19000[5] = (boolean)((0 | -0) >>> 31);
      f19000[6] = (boolean)((1 | -1) >>> 31);
      f19000[7] = (boolean)((0 | -0) >>> 31);
      boolean[] var134 = new boolean[8];
      f15000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f15000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f15000[2] = (boolean)((1 | -1) >>> 31);
      f15000[3] = (boolean)((0 | -0) >>> 31);
      f15000[4] = (boolean)((1 | -1) >>> 31);
      f15000[5] = (boolean)((0 | -0) >>> 31);
      f15000[6] = (boolean)((1 | -1) >>> 31);
      f15000[7] = (boolean)((0 | -0) >>> 31);
      boolean[] var135 = new boolean[3];
      f47000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f47000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f47000[2] = (boolean)((0 | -0) >>> 31);
      boolean[] var136 = new boolean[2];
      f65000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f65000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      boolean[] var137 = new boolean[3];
      f39000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f39000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f39000[2] = (boolean)((0 | -0) >>> 31);
      boolean[] var138 = new boolean[8];
      f64000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f64000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f64000[2] = (boolean)((0 | -0) >>> 31);
      f64000[3] = (boolean)((1 | -1) >>> 31);
      f64000[4] = (boolean)((1 | -1) >>> 31);
      f64000[5] = (boolean)((0 | -0) >>> 31);
      f64000[6] = (boolean)((1 | -1) >>> 31);
      f64000[7] = (boolean)((0 | -0) >>> 31);
      boolean[] var139 = new boolean[7];
      f63000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f63000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f63000[2] = (boolean)((1 | -1) >>> 31);
      f63000[3] = (boolean)((0 | -0) >>> 31);
      f63000[4] = (boolean)((1 | -1) >>> 31);
      f63000[5] = (boolean)((1 | -1) >>> 31);
      f63000[6] = (boolean)((0 | -0) >>> 31);
      boolean[] var140 = new boolean[6];
      f9000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f9000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f9000[2] = (boolean)((1 | -1) >>> 31);
      f9000[3] = (boolean)((1 | -1) >>> 31);
      f9000[4] = (boolean)((0 | -0) >>> 31);
      f9000[5] = (boolean)((0 | -0) >>> 31);
      boolean[] var141 = new boolean[2];
      f58000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f58000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      boolean[] var142 = new boolean[7];
      f57000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f57000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f57000[2] = (boolean)((0 | -0) >>> 31);
      f57000[3] = (boolean)((1 | -1) >>> 31);
      f57000[4] = (boolean)((0 | -0) >>> 31);
      f57000[5] = (boolean)((0 | -0) >>> 31);
      f57000[6] = (boolean)((1 | -1) >>> 31);
   }

   private static float m42000(int var0) {
      return C0876.m46000(var0) / f33000[3];
   }

   private static OptionalInt m44000(String var0) {
      String var1 = var0.trim();
      if (var1.startsWith(f56000[2])) {
         var1 = var1.substring(f8000[0]);
      }

      if (var1.length() == f69000[2] && m32000(var1)) {
         try {
            return OptionalInt.of(f30000[3] | Integer.parseInt(var1, f69000[3]));
         } catch (NumberFormatException var3) {
            return OptionalInt.empty();
         }
      } else {
         return OptionalInt.empty();
      }
   }

   private static float m48000() {
      return f37000[1];
   }

   private static float m50000() {
      return f37000[2];
   }

   private static String m70000(int var0) {
      String var10000 = f56000[5];
      Object[] var10001 = new Object[f68000[3]];
      var10001[f19000[2]] = C0876.m28000(var0);
      var10001[f19000[3]] = C0876.m58000(var0);
      var10001[f68000[4]] = C0876.m20000(var0);
      return String.format(var10000, var10001);
   }

   private static void m82000(int var0) {
      ((LinkedList)f70000[f23000[0]]).removeFirstOccurrence(var0);
      ((LinkedList)f70000[f23000[1]]).addFirst(var0);

      while (((LinkedList)f70000[f6000[0]]).size() > f69000[0]) {
         ((LinkedList)f70000[f6000[1]]).removeLast();
      }
   }

   private static String m86000(int var0) {
      return Math.round(C0876.m46000(var0) * f33000[1] / f33000[2]) + "%";
   }

   private static boolean m88000(String var0) {
      String var1 = var0.endsWith(f56000[3]) ? var0.substring(f8000[3], var0.length() - f35000[0]) : var0;
      return !var1.isEmpty() && (var1.length() > f68000[1] || !var1.chars().allMatch(Character::isDigit)) ? f35000[2] : f35000[1];
   }

   private static float m90000(int var0) {
      return Color.RGBtoHSB(C0876.m28000(var0), C0876.m58000(var0), C0876.m20000(var0), null)[f19000[4]];
   }

   private static void m94000() {
      int[] var128 = new int[7];
      f30000[(0 | -0) >>> 31] = -16777216;
      f30000[(1 | -1) >>> 31] = -16777216;
      f30000[2] = -16777216;
      f30000[3] = -16777216;
      f30000[4] = -7171438;
      f30000[5] = -16119286;
      f30000[6] = -7171438;
   }

   private static boolean m100000(int var0) {
      return (var0 < f69000[4] || var0 > f69000[5]) && (var0 < f69000[6] || var0 > f5000[0]) && (var0 < f5000[1] || var0 > f68000[0]) ? f8000[2] : f8000[1];
   }

   private static float m104000(Rec0279 var0) {
      return var0.m2000() ? f72000[0] : f72000[1];
   }

   private static int m110000(float var0, int var1) {
      return C0876.m70000(Color.HSBtoRGB(var0, f33000[4], f32000[0]), var1);
   }

   private static void m112000() {
      short[] var128 = new short[2];
      f67000[(0 | -0) >>> 31] = 5;
      f67000[(1 | -1) >>> 31] = 255;
      short[] var129 = new short[2];
      f23000[(0 | -0) >>> 31] = 3;
      f23000[(1 | -1) >>> 31] = 3;
      short[] var130 = new short[5];
      f6000[(0 | -0) >>> 31] = 3;
      f6000[(1 | -1) >>> 31] = 3;
      f6000[2] = 248;
      f6000[3] = 6;
      f6000[4] = 2000;
      short[] var131 = new short[5];
      f21000[(0 | -0) >>> 31] = 4;
      f21000[(1 | -1) >>> 31] = 2001;
      f21000[2] = (short)((0 | -0) >>> 31);
      f21000[3] = (short)((1 | -1) >>> 31);
      f21000[4] = (short)((0 | -0) >>> 31);
      short[] var132 = new short[4];
      f54000[(0 | -0) >>> 31] = 3;
      f54000[(1 | -1) >>> 31] = 3;
      f54000[2] = 3;
      f54000[3] = 4;
      short[] var133 = new short[6];
      f14000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f14000[(1 | -1) >>> 31] = 2;
      f14000[2] = (short)((1 | -1) >>> 31);
      f14000[3] = 2;
      f14000[4] = (short)((0 | -0) >>> 31);
      f14000[5] = 2;
      short[] var134 = new short[7];
      f26000[(0 | -0) >>> 31] = 2;
      f26000[(1 | -1) >>> 31] = 4;
      f26000[2] = 3;
      f26000[3] = (short)((0 | -0) >>> 31);
      f26000[4] = (short)((0 | -0) >>> 31);
      f26000[5] = 248;
      f26000[6] = 186;
   }

   private static void m114000(
      Rec0279 var0, Iface0196<Float> var1, Iface0196<Float> var2, Iface0196<Float> var3, Iface0196<String> var4, Iface0196<String> var5, int var6
   ) {
      int var7 = m238000(var0, C0876.m70000(var6, C0876.m46000(var0.m10000())));
      m150000(var0, var7, var1, var2, var3);
      m160000(var0, var7, var4, var5);
   }

   private static void m136000(Rec0279 var0, Iface0196<Float> var1, Iface0196<String> var2, Iface0196<String> var3, C0318 var4) {
      float var5 = m162000(var4, f7000[1]);
      var1.m6000(var5);
      m160000(var0, C0876.m70000(var0.m10000(), Math.round(var5 * f42000[6])), var2, var3);
   }

   private static int m138000(float var0, float var1, float var2) {
      return C0876.m70000(Color.HSBtoRGB(var0, var1, var2), f67000[1]);
   }

   private static void m146000(Rec0279 var0, Iface0196<Float> var1, Iface0196<String> var2, Iface0196<String> var3, String var4) {
      m10000(var4).ifPresentOrElse(var4x -> {
         var1.m6000(var4x / f32000[1]);
         m160000(var0, C0876.m70000(var0.m10000(), var4x), var2, var3);
      }, () -> var3.m6000(m86000(var0.m10000())));
   }

   public static void m150000(Rec0279 var0, int var1, Iface0196<Float> var2, Iface0196<Float> var3, Iface0196<Float> var4) {
      float[] var5 = Color.RGBtoHSB(C0876.m28000(var1), C0876.m58000(var1), C0876.m20000(var1), null);
      float var6 = m104000(var0);
      float var7 = m190000(var0);
      float var8 = Math.min(var5[f45000[3]], var6) / var6;
      float var9 = Math.max(var5[f7000[2]], var7);
      var2.m6000(var5[f45000[4]]);
      var3.m6000(var8 * m48000());
      var4.m6000((f71000[1] - var9) / (f71000[2] - var7) * m50000());
   }

   private static void m152000(int var0, Iface0196<String> var1, Iface0196<String> var2) {
      var1.m6000(m70000(var0));
      var2.m6000(m86000(var0));
   }

   private static void m156000(
      Rec0279 var0,
      Iface0196<C1056> var1,
      Iface0196<Boolean> var2,
      Iface0196<Float> var3,
      Iface0196<Float> var4,
      Iface0196<Float> var5,
      Iface0196<String> var6,
      Iface0196<String> var7
   ) {
      m184000(var1, var2);
      C1056 var8 = new C1056(var0, var1, var2, var3, var4, var5, var6, var7);
      var1.m6000(var8);
      var2.m6000(f52000[2]);
      NursultanClient.m8000().m32000(var8);
   }

   public static void m160000(Rec0279 var0, int var1, Iface0196<String> var2, Iface0196<String> var3) {
      var1 = m238000(var0, var1);
      var0.m6000().accept(var1);
      m152000(var1, var2, var3);
   }

   private static float m162000(C0318 var0, int var1) {
      float var2 = var0.m8000() - var0.z().m18000().m14000() - f38000[3] - var1 / f38000[4];
      float var3 = Math.max(f38000[5], var0.z().m18000().m12000() - var1 - f2000[0]);
      return Math.clamp(var2 / var3, f2000[1], f33000[0]);
   }

   private static C0056 m164000(int var0, float var1) {
      return C0056.m130000()
         .m78000(f59000[3], f59000[4])
         .m160000(Enum0032.f2000)
         .m66000(m220000(var1, f27000[1]))
         .m104000(f59000[5])
         .m60000(f59000[6])
         .m16000(C0248.m14000(f30000[1], f49000[0]))
         .m86000(m110000(var1, C0876.m46000(var0)))
         .m70000(f49000[1])
         .m72000(f27000[2])
         .m30000(f49000[2]);
   }

   private static void m166000(
      Rec0279 var0, Iface0196<Float> var1, Iface0196<Float> var2, Iface0196<Float> var3, Iface0196<String> var4, Iface0196<String> var5, C0310 var6
   ) {
      String var7 = var6.m2000().trim();
      if (!m32000(var7)) {
         var6.z().m42000(var6.m4000());
         var4.m6000(var6.m4000());
      } else {
         var4.m6000(var7);
         m44000(var7).ifPresent(var6x -> m114000(var0, var1, var2, var3, var4, var5, var6x));
      }
   }

   private C0031 m172000(Rec0279 var1, Iface0202 var2) {
      Iface0196 var3 = var2.m20000(f20000[0], f62000[0]);
      Iface0196 var4 = var2.m20000(f20000[1], f62000[1]);
      Iface0196 var5 = var2.m20000(f20000[2], f62000[2]);
      Iface0196 var6 = var2.m20000(f20000[3], f62000[3]);
      Iface0196 var7 = var2.m20000(f20000[4], (C1056)null);
      Iface0196 var8 = var2.m20000(f20000[5], m90000(var1.m10000()));
      Iface0196 var9 = var2.m20000(f20000[6], m42000(var1.m10000()));
      Iface0196 var10 = var2.m20000(f20000[7], f55000[0]);
      Iface0196 var11 = var2.m20000(f53000[0], f55000[1]);
      Iface0196 var12 = var2.m20000(f53000[1], f45000[0]);
      Iface0196 var13 = var2.m20000(f53000[2], m70000(var1.m10000()));
      Iface0196 var14 = var2.m20000(f53000[3], m86000(var1.m10000()));
      boolean var15 = var1.m12000().m2000();
      if (!var15) {
         if ((Boolean)var12.m2000()) {
            var12.m6000(f45000[1]);
         }
      } else if (!(Boolean)var12.m2000()) {
         m150000(var1, var1.m10000(), var8, var10, var11);
         var9.m6000(m42000(var1.m10000()));
         m152000(var1.m10000(), var13, var14);
         var12.m6000(f45000[2]);
      }

      String var16 = "colorPickerAnchor" + System.identityHashCode(var1.m12000());
      return C1063.m28000(
         (C0056)f4000[f67000[0]],
         var14x -> {
            var14x.N(f56000[6]);
            var14x.N((C0056)f4000[f6000[3]], var1xx -> var1xx.N(var16));
            if (var15) {
               var14x.y(C1063.m24000(f11000[0], f6000[4], () -> {
                  m82000(var1.m10000());
                  var3.m6000(f47000[1]);
                  var4.m6000(f47000[2]);
                  var5.m6000(f65000[0]);
                  m184000(var7, var6);
                  var1.m12000().m6000(f65000[1]);
               }));
               C0056[] var10001 = new C0056[f68000[5]];
               var10001[f19000[5]] = (C0056)f70000[f21000[0]];
               var10001[f19000[6]] = C1063.m30000(var16, f32000[2], f21000[1]);
               var14x.N(
                  C0056.m120000(var10001),
                  var12xx -> {
                     var12xx.N(f11000[1]);
                     var12xx.N(
                        (C0056)f18000[f21000[2]],
                        var7xxx -> {
                           var7xxx.N(Enum0026.f2000, var7xxxx -> {
                              C0318 var8xxx = (C0318)var7xxxx;
                              if (var8xxx.m2000() == 0) {
                                 var3.m6000(f47000[0]);
                                 m234000(var1, (Float)var8.m2000(), var10, var11, var13, var14, var8xxx);
                              }
                           });
                           var7xxx.N(Enum0026.f1000, var7xxxx -> {
                              if ((Boolean)var3.m2000()) {
                                 m234000(var1, (Float)var8.m2000(), var10, var11, var13, var14, (C0318)var7xxxx);
                              }
                           });
                           var7xxx.N(Enum0026.f3000, var7xxxx -> {
                              C0318 var8xxx = (C0318)var7xxxx;
                              if (var8xxx.m2000() == 0) {
                                 var3.m6000(f15000[7]);
                                 m234000(var1, (Float)var8.m2000(), var10, var11, var13, var14, var8xxx);
                              }
                           });
                           var7xxx.i(
                              var2xxxx -> ((C0299)var2xxxx.N((C0056)f18000[f26000[3]]))
                                 .m4000(
                                    var2xxxxx -> C1051.m36000(
                                       m138000((Float)var8.m2000(), f32000[3], f74000[0]),
                                       m138000((Float)var8.m2000(), m104000(var1), f74000[1]),
                                       m138000((Float)var8.m2000(), f74000[2], m190000(var1)),
                                       m138000((Float)var8.m2000(), m104000(var1), m190000(var1)),
                                       var2xxxxx.m14000(),
                                       var2xxxxx.m12000(),
                                       var2xxxxx.m2000(),
                                       var2xxxxx.m10000()
                                    )
                                 )
                           );
                           var7xxx.y(m222000(var1.m10000(), (Float)var10.m2000(), (Float)var11.m2000()));
                        }
                     );
                     var12xx.N(
                        (C0056)f18000[f21000[3]],
                        var9xxx -> {
                           var9xxx.N(
                              (C0056)f18000[f14000[5]],
                              var7xxxx -> {
                                 var7xxxx.N(Enum0026.f2000, var7xxxxx -> {
                                    C0318 var8xxxx = (C0318)var7xxxxx;
                                    if (var8xxxx.m2000() == 0) {
                                       var4.m6000(f15000[6]);
                                       m208000(var1, var8, var10, var11, var13, var14, var8xxxx);
                                    }
                                 });
                                 var7xxxx.N(Enum0026.f1000, var7xxxxx -> {
                                    if ((Boolean)var4.m2000()) {
                                       m208000(var1, var8, var10, var11, var13, var14, (C0318)var7xxxxx);
                                    }
                                 });
                                 var7xxxx.N(Enum0026.f3000, var7xxxxx -> {
                                    C0318 var8xxxx = (C0318)var7xxxxx;
                                    if (var8xxxx.m2000() == 0) {
                                       var4.m6000(f15000[5]);
                                       m208000(var1, var8, var10, var11, var13, var14, var8xxxx);
                                    }
                                 });
                                 var7xxxx.i(
                                    var0xxxx -> ((C0299)var0xxxx.N((C0056)f18000[f26000[2]]))
                                       .m4000(var0xxxxx -> C1048.m28000(var0xxxxx.m14000(), var0xxxxx.m12000(), var0xxxxx.m2000(), var0xxxxx.m10000()))
                                 );
                                 var7xxxx.y(m164000(var1.m10000(), (Float)var8.m2000()));
                              }
                           );
                           var9xxx.N(
                              var1.m8000(),
                              () -> C0287.m26000(
                                 (C0056)f18000[f26000[0]],
                                 var5xxxx -> {
                                    var5xxxx.N(Enum0026.f2000, var5xxxxx -> {
                                       C0318 var6xxxx = (C0318)var5xxxxx;
                                       if (var6xxxx.m2000() == 0) {
                                          var5.m6000(f15000[4]);
                                          m136000(var1, var9, var13, var14, var6xxxx);
                                       }
                                    });
                                    var5xxxx.N(Enum0026.f1000, var5xxxxx -> {
                                       if ((Boolean)var5.m2000()) {
                                          m136000(var1, var9, var13, var14, (C0318)var5xxxxx);
                                       }
                                    });
                                    var5xxxx.N(Enum0026.f3000, var5xxxxx -> {
                                       C0318 var6xxxx = (C0318)var5xxxxx;
                                       if (var6xxxx.m2000() == 0) {
                                          var5.m6000(f15000[3]);
                                          m136000(var1, var9, var13, var14, var6xxxx);
                                       }
                                    });
                                    var5xxxx.i(
                                       var1xxxxxx -> ((C0299)var1xxxxxx.N((C0056)f18000[f26000[1]]))
                                          .m4000(
                                             var1xxxxxxx -> C1070.m32000(
                                                var1.m10000(), var1xxxxxxx.m14000(), var1xxxxxxx.m12000(), var1xxxxxxx.m2000(), var1xxxxxxx.m10000()
                                             )
                                          )
                                    );
                                    var5xxxx.y(m212000((Float)var9.m2000()));
                                 }
                              )
                           );
                        }
                     );
                     var12xx.N(
                        (C0056)f50000[f21000[4]],
                        var9xxx -> {
                           var9xxx.N((C0056)f50000[f14000[0]], var8xxxx -> {
                              var8xxxx.L(var1xxxxx -> {
                                 var1xxxxx.N(f11000[4]);
                                 var1xxxxx.m2000(f11000[5]);
                                 C0056[] var10001x = new C0056[f60000[1]];
                                 var10001x[f15000[1]] = (C0056)f50000[f14000[3]];
                                 var10001x[f15000[2]] = C0056.m130000().m40000(var6.m2000() ? (Integer)C0077.f1000[f14000[4]] : f30000[4]);
                                 var1xxxxx.N(C0056.m120000(var10001x));
                              });
                              var8xxxx.N(var8xxxxx -> m156000(var1, var7, var6, var8, var10, var11, var13, var14));
                           });
                           var9xxx.u(var6xxxx -> {
                              var6xxxx.N(f11000[3]);
                              var6xxxx.m2000((String)var13.m2000());
                              var6xxxx.N((C0056)f4000[f14000[2]]);
                              var6xxxx.N(Enum0026.f9000, var6xxxxx -> m166000(var1, var8, var10, var11, var13, var14, (C0310)var6xxxxx));
                              var6xxxx.N(Enum0026.f10000, var6xxxxx -> m216000(var1, var8, var10, var11, var13, var14, var6xxxxx.m26000().m12000()));
                              var6xxxx.N(Enum0026.f12000, var6xxxxx -> m216000(var1, var8, var10, var11, var13, var14, var6xxxxx.m26000().m12000()));
                           });
                           var9xxx.N(
                              var1.m8000(),
                              () -> ((C0300)((C0300)((C0300)((C0300)((C0300)C0287.m6000().N(f11000[2])).m2000((String)var14.m2000()).N((C0056)f4000[f14000[1]]))
                                          .N(Enum0026.f9000, var1xxxxx -> m232000(var14, (C0310)var1xxxxx)))
                                       .N(Enum0026.f10000, var4xxxx -> m146000(var1, var9, var13, var14, var4xxxx.m26000().m12000())))
                                    .N(Enum0026.f12000, var4xxxx -> m146000(var1, var9, var13, var14, var4xxxx.m26000().m12000())))
                                 .m2000()
                           );
                        }
                     );
                     if (!((LinkedList)f70000[f54000[0]]).isEmpty()) {
                        var12xx.N((C0056)f4000[f54000[1]], var7xxx -> {
                           for (int var9xxx : (LinkedList)f70000[f54000[2]]) {
                              C0056[] var10001x = new C0056[f60000[0]];
                              var10001x[f19000[7]] = (C0056)f4000[f54000[3]];
                              var10001x[f15000[0]] = C0056.m130000().m86000(var9xxx);
                              var7xxx.N(
                                 C0056.m120000(var10001x), var8xxx -> var8xxx.N(var8xxxx -> m176000(var1, var9xxx, var8, var9, var10, var11, var13, var14))
                              );
                           }
                        });
                     }
                  }
               );
            }
         }
      );
   }

   private static void m176000(
      Rec0279 var0,
      int var1,
      Iface0196<Float> var2,
      Iface0196<Float> var3,
      Iface0196<Float> var4,
      Iface0196<Float> var5,
      Iface0196<String> var6,
      Iface0196<String> var7
   ) {
      if (!var0.m8000()) {
         var1 = C0876.m70000(var1, C0876.m46000(var0.m10000()));
      }

      var1 = m238000(var0, var1);
      m150000(var0, var1, var2, var4, var5);
      var3.m6000(m42000(var1));
      m160000(var0, var1, var6, var7);
   }

   private static void m184000(Iface0196<C1056> var0, Iface0196<Boolean> var1) {
      C1056 var2 = (C1056)var0.m2000();
      if (var2 != null) {
         var2.m54000();
      }
   }

   private static void m188000(Rec0279 var0, float var1, float var2, float var3, float var4, float var5, Iface0196<String> var6, Iface0196<String> var7) {
      float var8 = (var4 <= f36000[0] ? f36000[1] : var2 / var4) * m104000(var0);
      float var9 = m190000(var0);
      float var10 = var5 <= f36000[2] ? f36000[3] : f36000[4] - var3 / var5 * (f71000[0] - var9);
      int var11 = Color.HSBtoRGB(var1, var8, var10);
      m160000(var0, C0876.m70000(var11, C0876.m46000(var0.m10000())), var6, var7);
   }

   private static float m190000(Rec0279 var0) {
      return var0.m2000() ? f72000[2] : f72000[3];
   }

   private static void m206000() {
      f13000 = new Object[f51000[2]];
      f13000[f58000[(1 | -1) >>> 31]] = Integer.valueOf(f51000[3]);
      f13000[f51000[4]] = Integer.valueOf(f26000[5]);
      f13000[f51000[5]] = Integer.valueOf(f26000[6]);
      f13000[f34000[(0 | -0) >>> 31]] = Integer.valueOf(f34000[(1 | -1) >>> 31]);
      f13000[f34000[2]] = Integer.valueOf(f34000[3]);
      f13000[f31000[(0 | -0) >>> 31]] = Integer.valueOf(f31000[(1 | -1) >>> 31]);
      f13000[f31000[2]] = Integer.valueOf(f31000[3]);
      f43000 = new Object[f31000[4]];
      f43000[f57000[(0 | -0) >>> 31]] = Integer.valueOf(f31000[5]);
      f43000[f57000[(1 | -1) >>> 31]] = Integer.valueOf(f46000[(0 | -0) >>> 31]);
      f48000 = new Object[f46000[(1 | -1) >>> 31]];
      f48000[f57000[2]] = Integer.valueOf(f46000[2]);
      f48000[f57000[3]] = Integer.valueOf(f57000[4]);
      f48000[f46000[3]] = Integer.valueOf(f46000[4]);
      f70000 = new Object[f3000[(0 | -0) >>> 31]];
      f70000[f57000[5]] = Integer.valueOf(f3000[(1 | -1) >>> 31]);
      f70000[f57000[6]] = f10000[4];
      f70000[f3000[2]] = f10000[5];
      f18000 = new Object[f3000[3]];
      f50000 = new Object[f3000[4]];
      f4000 = new Object[f3000[5]];
      f4000[f3000[6]] = f11000[6];
   }

   private static void m208000(
      Rec0279 var0, Iface0196<Float> var1, Iface0196<Float> var2, Iface0196<Float> var3, Iface0196<String> var4, Iface0196<String> var5, C0318 var6
   ) {
      float var7 = Math.min(m162000(var6, f7000[0]), Math.nextDown(f42000[5]));
      var1.m6000(var7);
      m188000(var0, var7, (Float)var2.m2000(), (Float)var3.m2000(), m48000(), m50000(), var4, var5);
   }

   private static C0056 m212000(float var0) {
      return C0056.m130000()
         .m78000(f29000[0], f29000[1])
         .m160000(Enum0032.f2000)
         .m66000(m220000(var0, f27000[3]))
         .m104000(f29000[2])
         .m60000(f40000[0])
         .m16000(C0248.m14000(f30000[2], f40000[1]))
         .m86000(f27000[4])
         .m30000(f40000[2]);
   }

   private static void m216000(
      Rec0279 var0, Iface0196<Float> var1, Iface0196<Float> var2, Iface0196<Float> var3, Iface0196<String> var4, Iface0196<String> var5, String var6
   ) {
      m44000(var6).ifPresentOrElse(var6x -> m114000(var0, var1, var2, var3, var4, var5, var6x), () -> var4.m6000(m70000(var0.m10000())));
   }

   private static float m220000(float var0, int var1) {
      return f37000[3] + Math.clamp(var0, f38000[0], f38000[1]) * m20000(var1);
   }

   private static C0056 m222000(int var0, float var1, float var2) {
      return C0056.m130000()
         .m78000(f55000[2], f55000[3])
         .m160000(Enum0032.f2000)
         .m66000(var1)
         .m104000(var2)
         .m86000(var0)
         .m60000(f55000[4])
         .m16000(C0248.m14000(f30000[0], f59000[0]))
         .m70000(f59000[1])
         .m72000(f27000[0])
         .m30000(f59000[2])
         .m196000(Enum0040.f2000);
   }

   private static void m232000(Iface0196<String> var0, C0310 var1) {
      String var2 = var1.m2000().trim();
      if (!m88000(var2)) {
         var1.z().m42000(var1.m4000());
         var0.m6000(var1.m4000());
      } else {
         var0.m6000(var2);
      }
   }

   private static void m234000(
      Rec0279 var0, float var1, Iface0196<Float> var2, Iface0196<Float> var3, Iface0196<String> var4, Iface0196<String> var5, C0318 var6
   ) {
      float var7 = Math.max(f40000[3], var6.z().m18000().m12000() - f40000[4]);
      float var8 = Math.max(f40000[5], var6.z().m18000().m10000() - f42000[0]);
      var2.m6000(Math.clamp(var6.m8000() - var6.z().m18000().m14000() - f42000[1], f42000[2], var7));
      var3.m6000(Math.clamp(var6.m6000() - var6.z().m18000().m2000() - f42000[3], f42000[4], var8));
      m188000(var0, var1, (Float)var2.m2000(), (Float)var3.m2000(), var7, var8, var4, var5);
   }

   private static int m238000(Rec0279 var0, int var1) {
      if (!var0.m2000()) {
         return var1;
      } else {
         float[] var2 = Color.RGBtoHSB(C0876.m28000(var1), C0876.m58000(var1), C0876.m20000(var1), null);
         float var3 = Math.min(var2[f45000[5]], f71000[3]);
         float var4 = Math.max(var2[f7000[3]], f71000[4]);
         return var3 == var2[f52000[0]] && var4 == var2[f7000[4]] ? var1 : C0876.m70000(Color.HSBtoRGB(var2[f52000[1]], var3, var4), C0876.m46000(var1));
      }
   }

   private static void m254000() {
      f20000 = new String[8];
      f20000[(0 | -0) >>> 31] = "gradientDragging";
      f20000[(1 | -1) >>> 31] = "hueDragging";
      f20000[2] = "alphaDragging";
      f20000[3] = "pipetteActive";
      f20000[4] = "pipetteListener";
      f20000[5] = "selectedHue";
      f20000[6] = "selectedAlpha";
      f20000[7] = "gradientSelectorX";
      f53000 = new String[4];
      f53000[(0 | -0) >>> 31] = "gradientSelectorY";
      f53000[(1 | -1) >>> 31] = "gradientSyncedOnOpen";
      f53000[2] = "hexInput";
      f53000[3] = "alphaInput";
      f56000 = new String[7];
      f56000[(0 | -0) >>> 31] = "#";
      f56000[(1 | -1) >>> 31] = "#";
      f56000[2] = "#";
      f56000[3] = "%";
      f56000[4] = "%";
      f56000[5] = "#%02X%02X%02X";
      f56000[6] = "colorPickerMount";
      f11000 = new String[7];
      f11000[(0 | -0) >>> 31] = "colorPickerCatcher";
      f11000[(1 | -1) >>> 31] = "colorPickerPanel";
      f11000[2] = "alphaColorInput";
      f11000[3] = "hexColorInput";
      f11000[4] = "eye-dropper";
      f11000[5] = "icon:menu/eye-dropper";
      f11000[6] = "colorPickerAnchor";
   }
}

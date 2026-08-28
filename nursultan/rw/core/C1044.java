package rw.core;

import rw.api.Iface0202;
import rw.data.IlpimlpIt;
import rw.setting.C0031;

public class C1044 {
   private static float[] f1000;
   private static byte[] f2000;
   private static short[] f3000;
   private static float[] f4000;
   private static byte[] f5000;
   private static int[] f6000;
   public static Object[] f7000;
   private static byte[] f8000;
   private static boolean[] f9000;
   public static Object[] f10000;
   public static Object[] f11000;
   private static boolean[] f12000;
   public static Object[] f13000;
   private static boolean[] f14000;
   private static byte[] f15000;
   private static byte[] f16000;
   private static boolean[] f17000;
   private static boolean[] f18000;
   private static byte[] f19000;

   private static void m2000() {
      float[] var128 = new float[8];
      f1000[(0 | -0) >>> 31] = Float.intBitsToFloat(1058642330);
      f1000[(1 | -1) >>> 31] = Float.intBitsToFloat(1073741824);
      f1000[2] = Float.intBitsToFloat(1140457472);
      f1000[3] = Float.intBitsToFloat(1107820544);
      f1000[4] = Float.intBitsToFloat(1065353216);
      f1000[5] = Float.intBitsToFloat(1056964608);
      f1000[6] = Float.intBitsToFloat(1073741824);
      f1000[7] = Float.intBitsToFloat(1007192201);
      float[] var129 = new float[8];
      f4000[(0 | -0) >>> 31] = Float.intBitsToFloat(1176255488);
      f4000[(1 | -1) >>> 31] = Float.intBitsToFloat(1065353216);
      f4000[2] = Float.intBitsToFloat(1073741824);
      f4000[3] = Float.intBitsToFloat(1073741824);
      f4000[4] = Float.intBitsToFloat(1084227584);
      f4000[5] = Float.intBitsToFloat(1041865114);
      f4000[6] = Float.intBitsToFloat(1176255488);
      f4000[7] = Float.intBitsToFloat(1058642330);
   }

   private C1044() {
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      short[] var128 = new short[8];
      f3000[(0 | -0) >>> 31] = 6;
      f3000[(1 | -1) >>> 31] = 4;
      f3000[2] = (short)((1 | -1) >>> 31);
      f3000[3] = 2;
      f3000[4] = (short)((0 | -0) >>> 31);
      f3000[5] = 3;
      f3000[6] = 4;
      f3000[7] = 2;
   }

   private static void m14000() {
      byte[] var128 = new byte[4];
      f15000[(0 | -0) >>> 31] = 2;
      f15000[(1 | -1) >>> 31] = 2;
      f15000[2] = 2;
      f15000[3] = 52;
      byte[] var129 = new byte[5];
      f8000[(0 | -0) >>> 31] = 2;
      f8000[(1 | -1) >>> 31] = 24;
      f8000[2] = 28;
      f8000[3] = 4;
      f8000[4] = 2;
      byte[] var130 = new byte[3];
      f19000[(0 | -0) >>> 31] = 2;
      f19000[(1 | -1) >>> 31] = 2;
      f19000[2] = 3;
      byte[] var131 = new byte[6];
      f2000[(0 | -0) >>> 31] = 2;
      f2000[(1 | -1) >>> 31] = 2;
      f2000[2] = 3;
      f2000[3] = 3;
      f2000[4] = 4;
      f2000[5] = 2;
      byte[] var132 = new byte[4];
      f16000[(0 | -0) >>> 31] = 3;
      f16000[(1 | -1) >>> 31] = 3;
      f16000[2] = 2;
      f16000[3] = 3;
      byte[] var133 = new byte[8];
      f5000[(0 | -0) >>> 31] = 4;
      f5000[(1 | -1) >>> 31] = 3;
      f5000[2] = 2;
      f5000[3] = 2;
      f5000[4] = 2;
      f5000[5] = 5;
      f5000[6] = 2;
      f5000[7] = 5;
   }

   private static void m16000() {
      boolean[] var128 = new boolean[6];
      f14000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f14000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f14000[2] = (boolean)((0 | -0) >>> 31);
      f14000[3] = (boolean)((1 | -1) >>> 31);
      f14000[4] = (boolean)((1 | -1) >>> 31);
      f14000[5] = (boolean)((0 | -0) >>> 31);
      boolean[] var129 = new boolean[6];
      f17000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f17000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f17000[2] = (boolean)((0 | -0) >>> 31);
      f17000[3] = (boolean)((0 | -0) >>> 31);
      f17000[4] = (boolean)((1 | -1) >>> 31);
      f17000[5] = (boolean)((0 | -0) >>> 31);
      boolean[] var130 = new boolean[7];
      f12000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f12000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f12000[2] = (boolean)((1 | -1) >>> 31);
      f12000[3] = (boolean)((0 | -0) >>> 31);
      f12000[4] = (boolean)((1 | -1) >>> 31);
      f12000[5] = (boolean)((0 | -0) >>> 31);
      f12000[6] = (boolean)((1 | -1) >>> 31);
      boolean[] var131 = new boolean[6];
      f9000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f9000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f9000[2] = (boolean)((0 | -0) >>> 31);
      f9000[3] = (boolean)((1 | -1) >>> 31);
      f9000[4] = (boolean)((1 | -1) >>> 31);
      f9000[5] = (boolean)((0 | -0) >>> 31);
      boolean[] var132 = new boolean[8];
      f18000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f18000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f18000[2] = (boolean)((1 | -1) >>> 31);
      f18000[3] = (boolean)((0 | -0) >>> 31);
      f18000[4] = (boolean)((0 | -0) >>> 31);
      f18000[5] = (boolean)((1 | -1) >>> 31);
      f18000[6] = (boolean)((0 | -0) >>> 31);
      f18000[7] = (boolean)((0 | -0) >>> 31);
   }

   private C0031 m28000(IlpimlpIt var1, Iface0202 var2) {
      OlIrtqjti var3 = var2.m28000((C0297<OlIrtqjti>)OlIrtqjti.f4000[f3000[0]]);
      boolean var4 = var1.m6000();
      rw.setting.C0056[] var10000 = new rw.setting.C0056[f15000[1]];
      var10000[f14000[0]] = (rw.setting.C0056)f7000[f3000[1]];
      var10000[f14000[1]] = var4 ? ((C0097)f11000[f3000[2]]).m8000(var3) : (rw.setting.C0056)f11000[f3000[3]];
      rw.setting.C0056 var5 = rw.setting.C0056.m120000(var10000);
      var10000 = new rw.setting.C0056[f15000[2]];
      var10000[f14000[2]] = (rw.setting.C0056)f11000[f3000[4]];
      var10000[f14000[3]] = var4 ? ((C0097)f11000[f3000[5]]).m8000(var3) : (rw.setting.C0056)f11000[f3000[6]];
      rw.setting.C0056 var6 = rw.setting.C0056.m120000(var10000);
      return C0287.m26000(var5, var3x -> {
         var3x.N(var2xx -> var1.m4000().accept(!var4 ? f14000[4] : f14000[5]));
         var3x.y(var6);
      });
   }

   private static void m32000() {
      f13000 = new Object[f5000[(1 | -1) >>> 31]];
      f13000[f9000[4]] = f4000[7];
      f13000[f5000[2]] = Integer.valueOf(f9000[5]);
      f10000 = new Object[f5000[3]];
      f10000[f18000[(0 | -0) >>> 31]] = Integer.valueOf(f18000[(1 | -1) >>> 31]);
      f10000[f18000[2]] = Integer.valueOf(f5000[4]);
      f7000 = new Object[f5000[5]];
      f7000[f18000[3]] = Integer.valueOf(f18000[4]);
      f7000[f18000[5]] = Integer.valueOf(f18000[6]);
      f7000[f5000[6]] = Integer.valueOf(f18000[7]);
      f11000 = new Object[f5000[7]];
   }

   private static int m34000(int var0) {
      return Math.round(var0 * f1000[0] / f1000[1]) * f15000[0];
   }

   private static void m36000() {
      int[] var128 = new int[2];
      f6000[(0 | -0) >>> 31] = -16777216;
      f6000[(1 | -1) >>> 31] = -14869219;
   }
}

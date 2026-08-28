package rw.core;

import rw.api.Iface0202;
import rw.data.Rec0259;
import rw.defs.Enum0026;
import rw.setting.C0031;

public class VpFa {
   public static Object[] f1000;
   private static int[] f2000;
   private static float[] f3000;
   private static byte[] f4000;
   private static boolean[] f5000;
   private static byte[] f6000;
   private static short[] f7000;
   private static boolean[] f8000;

   private static void m2000() {
      float[] var128 = new float[6];
      f3000[(0 | -0) >>> 31] = Float.intBitsToFloat(1101004800);
      f3000[(1 | -1) >>> 31] = Float.intBitsToFloat(1101004800);
      f3000[2] = Float.intBitsToFloat(1094713344);
      f3000[3] = Float.intBitsToFloat(1090519040);
      f3000[4] = Float.intBitsToFloat(1065353216);
      f3000[5] = Float.intBitsToFloat(1090519040);
   }

   private VpFa() {
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f1000 = new Object[f6000[5]];
      f1000[f5000[4]] = Integer.valueOf(f6000[6]);
   }

   private static void m10000() {
      boolean[] var128 = new boolean[4];
      f8000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f8000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f8000[2] = (boolean)((1 | -1) >>> 31);
      f8000[3] = (boolean)((0 | -0) >>> 31);
      boolean[] var129 = new boolean[5];
      f5000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f5000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f5000[2] = (boolean)((0 | -0) >>> 31);
      f5000[3] = (boolean)((1 | -1) >>> 31);
      f5000[4] = (boolean)((1 | -1) >>> 31);
   }

   private static void m16000() {
      short[] var128 = new short[3];
      f7000[(0 | -0) >>> 31] = 2;
      f7000[(1 | -1) >>> 31] = 4;
      f7000[2] = 3;
   }

   private static void m18000() {
      byte[] var128 = new byte[4];
      f4000[(0 | -0) >>> 31] = 2;
      f4000[(1 | -1) >>> 31] = 2;
      f4000[2] = 16;
      f4000[3] = 3;
      byte[] var129 = new byte[7];
      f6000[(0 | -0) >>> 31] = 3;
      f6000[(1 | -1) >>> 31] = 2;
      f6000[2] = 16;
      f6000[3] = 3;
      f6000[4] = 4;
      f6000[5] = 5;
      f6000[6] = 20;
   }

   private C0031 m22000(Rec0259 var1, Iface0202 var2) {
      return C0287.m26000((rw.setting.C0056)f1000[f7000[0]], var1x -> {
         var1x.N(Enum0026.f2000, Base0315::m6000);
         if (!var1.m2000()) {
            var1x.N(var1xx -> var1.m6000().run());
         }

         var1x.L(var1xx -> {
            var1xx.m2000(var1.m8000());
            var1xx.N(rw.setting.C0056.m130000().m78000(f3000[0], f3000[1]).m40000(var1.m10000()));
         });
         if (var1.m12000() != null && !var1.m12000().isEmpty()) {
            var1x.N(var1.m12000(), var1.m2000() ? (rw.setting.C0056)f1000[f7000[1]] : (rw.setting.C0056)f1000[f7000[2]]);
         }
      });
   }

   private static void m32000() {
      int[] var128 = new int[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = -7171438;
   }
}

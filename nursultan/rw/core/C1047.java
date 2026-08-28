package rw.core;

import rw.api.Iface0202;
import rw.data.Rec0277;
import rw.setting.C0031;

public class C1047 {
   private static byte[] f1000;
   private static float[] f2000;
   private static boolean[] f3000;
   private static int[] f4000;
   private static short[] f5000;
   public static Object[] f6000;

   private static void m2000() {
      short[] var128 = new short[2];
      f5000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f5000[(1 | -1) >>> 31] = 2;
   }

   private C1047() {
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      int[] var128 = new int[(1 | -1) >>> 31];
      f4000[(0 | -0) >>> 31] = -7171438;
   }

   private static void m12000() {
      float[] var128 = new float[5];
      f2000[(0 | -0) >>> 31] = Float.intBitsToFloat(1120403456);
      f2000[(1 | -1) >>> 31] = Float.intBitsToFloat(1107820544);
      f2000[2] = Float.intBitsToFloat(2139095040);
      f2000[3] = Float.intBitsToFloat(1065353216);
      f2000[4] = Float.intBitsToFloat(1090519040);
   }

   private static void m16000() {
      byte[] var128 = new byte[5];
      f1000[(0 | -0) >>> 31] = 2;
      f1000[(1 | -1) >>> 31] = 14;
      f1000[2] = 3;
      f1000[3] = 2;
      f1000[4] = 3;
   }

   private C0031 m20000(Rec0277 var1, Iface0202 var2) {
      return C0287.m26000((rw.setting.C0056)f6000[f5000[0]], var1x -> {
         var1x.N(var1xx -> var1.m6000().run());
         var1x.N(C1235.m40000(var1.m4000()), (rw.setting.C0056)f6000[f5000[1]]);
      });
   }

   private static void m22000() {
      boolean[] var128 = new boolean[6];
      f3000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f3000[2] = (boolean)((1 | -1) >>> 31);
      f3000[3] = (boolean)((1 | -1) >>> 31);
      f3000[4] = (boolean)((0 | -0) >>> 31);
      f3000[5] = (boolean)((1 | -1) >>> 31);
   }

   private static void m30000() {
      f6000 = new Object[f1000[4]];
   }
}

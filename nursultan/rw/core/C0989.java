package rw.core;

import KDFzREm.NNNYO;
import KDFzREm.NNNwS;
import KDFzREm.NNWE;
import KDFzREm.NNde;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import KDFzREm.NbK;
import rw.NursultanClient;

public class C0989 {
   private static short[] f1000;
   private static float[] f2000;
   private static String[] f3000;
   public static Object[] f4000;
   private static boolean[] f5000;

   public static C0983 m4000() {
      NuZz var0 = NursultanClient.m72000();
      return !var0.m32000() ? m28000() : new C0983(var0.m8000(), var0.m52000());
   }

   private static void m6000() {
      f4000 = new Object[f5000[1]];
   }

   private C0989() {
      throw new UnsupportedOperationException(f3000[0]);
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      boolean[] var128 = new boolean[2];
      f5000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f5000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   private static void m10000() {
      short[] var128 = new short[6];
      f1000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = 5;
      f1000[2] = (short)((0 | -0) >>> 31);
      f1000[3] = 4;
      f1000[4] = (short)((0 | -0) >>> 31);
      f1000[5] = 4;
   }

   private static void m16000() {
      float[] var128 = new float[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = Float.intBitsToFloat(1119092736);
   }

   public static C0983 m20000() {
      NNde var0 = ((NNNYO)((NNuU)f4000[f1000[0]]).i[f1000[1]]).s();
      return new C0983(var0.R(), var0.i());
   }

   public static C0983 m22000(NbK var0) {
      return new C0983(var0.method_36454(), var0.method_36455());
   }

   public static C0983 m26000(C0983 var0, NXi var1) {
      return m30000(var1).m44000(var0);
   }

   public static C0983 m28000() {
      return m22000((NNNwS)((NNuU)f4000[f1000[2]]).T[f1000[3]]);
   }

   public static C0983 m30000(NXi var0) {
      NXi var1 = var0.u(((NNNwS)((NNuU)f4000[f1000[4]]).T[f1000[5]]).method_33571());
      return new C0983(NNWE.R(C1183.m22000(NNWE.u(var1.Z, var1.M)) - f2000[0]), -C1183.m22000(NNWE.u(var1.B, Math.hypot(var1.M, var1.Z))));
   }

   private static void m34000() {
      f3000 = new String[(1 | -1) >>> 31];
      f3000[(0 | -0) >>> 31] = "This is a utility class and cannot be instantiated";
   }
}

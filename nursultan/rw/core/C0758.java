package rw.core;

import KDFzREm.NHS;
import KDFzREm.NNNwS;
import KDFzREm.NNWE;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import KDFzREm.NbK;

public class C0758 {
   private static double[] f1000;
   private static double[] f2000;
   private static short[] f3000;
   private static boolean[] f4000;
   private static byte[] f5000;
   public static Object[] f6000;

   private static void m2000() {
      short[] var128 = new short[2];
      f3000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = 4;
   }

   public static NHS m6000(NbK var0) {
      return var0.method_5829();
   }

   private C0758() {
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      double[] var128 = new double[8];
      f2000[(0 | -0) >>> 31] = Double.longBitsToDouble(4585925428558828667L);
      f2000[(1 | -1) >>> 31] = Double.longBitsToDouble(0L);
      f2000[2] = Double.longBitsToDouble(4593311331947716280L);
      f2000[3] = Double.longBitsToDouble(4585925428558828667L);
      f2000[4] = Double.longBitsToDouble(0L);
      f2000[5] = Double.longBitsToDouble(4593311331947716280L);
      f2000[6] = Double.longBitsToDouble(4581421828931458171L);
      f2000[7] = Double.longBitsToDouble(0L);
      double[] var129 = new double[6];
      f1000[(0 | -0) >>> 31] = Double.longBitsToDouble(4585925428558828667L);
      f1000[(1 | -1) >>> 31] = Double.longBitsToDouble(4611686018427387904L);
      f1000[2] = Double.longBitsToDouble(4611686018427387904L);
      f1000[3] = Double.longBitsToDouble(4611686018427387904L);
      f1000[4] = Double.longBitsToDouble(4585925428558828667L);
      f1000[5] = Double.longBitsToDouble(4581421828931458171L);
   }

   public static NHS m12000(NbK var0) {
      NHS var1 = m6000(var0);
      double var2 = Math.min(f2000[0], Math.max(f2000[1], (var1.u - var1.N) * f2000[2]));
      double var4 = Math.min(f2000[3], Math.max(f2000[4], (var1.R - var1.L) * f2000[5]));
      double var6 = Math.min(f2000[6], Math.max(f2000[7], (var1.i - var1.y) * f1000[0]));
      return !(var1.u - var1.N <= var2 * f1000[1]) && !(var1.i - var1.y <= var6 * f1000[2]) && !(var1.R - var1.L <= var4 * f1000[3])
         ? new NHS(var1.N + var2, var1.y + var6, var1.L + var4, var1.u - var2, var1.i - var6, var1.R - var4)
         : var1;
   }

   private static void m14000() {
      boolean[] var128 = new boolean[2];
      f4000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   private static void m18000() {
      f6000 = new Object[f5000[(0 | -0) >>> 31]];
      f6000[f4000[(0 | -0) >>> 31]] = f1000[4];
      f6000[f4000[(1 | -1) >>> 31]] = f1000[5];
   }

   public static NXi m20000(NbK var0) {
      return m6000(var0).R();
   }

   public static NXi m22000(NbK var0, NXi var1) {
      NHS var2 = m6000(var0);
      return new NXi(NNWE.N(var1.M, var2.N, var2.u), NNWE.N(var1.B, var2.y, var2.i), NNWE.N(var1.Z, var2.L, var2.R));
   }

   public static NXi m28000(NbK var0, NXi var1) {
      NHS var2 = m6000(var0);
      return new NXi(NNWE.N(var1.M, var2.N, var2.u), NNWE.N(var1.B, var2.y, var2.i), NNWE.N(var1.Z, var2.L, var2.R));
   }

   public static NXi m30000(NbK var0) {
      return m28000(var0, ((NNNwS)((NNuU)C0768.f1000[f3000[0]]).T[f3000[1]]).method_33571());
   }

   private static void m32000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f5000[(0 | -0) >>> 31] = 2;
   }
}

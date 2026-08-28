package rw.core;

import KDFzREm.NNiz;
import KDFzREm.NNuU;

public class C0877 {
   private static double[] f1000;
   private static boolean[] f2000;
   private static String[] f3000;
   public static Object[] f4000;
   private static double[] f5000;
   private static short[] f6000;

   private static double m2000(double var0) {
      double var2 = var0 * f1000[3] + f1000[4];
      return var2 * var2 * var2 * f1000[5] * f1000[6];
   }

   private static void m4000() {
      f4000 = new Object[f2000[1]];
   }

   private C0877() {
      throw new UnsupportedOperationException(f3000[0]);
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      short[] var128 = new short[6];
      f6000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f6000[(1 | -1) >>> 31] = 7;
      f6000[2] = (short)((0 | -0) >>> 31);
      f6000[3] = 7;
      f6000[4] = (short)((0 | -0) >>> 31);
      f6000[5] = 7;
   }

   private static void m12000() {
      boolean[] var128 = new boolean[2];
      f2000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   public static double m16000(double var0) {
      double var2 = (Double)((NNiz)((NNuU)f4000[f6000[2]]).i[f6000[3]]).u().method_41753() * f1000[0] + f1000[1];
      double var4 = var2 * var2 * var2;
      double var6 = var4 * f1000[2];
      return var0 * var6;
   }

   private static void m18000() {
      f3000 = new String[(1 | -1) >>> 31];
      f3000[(0 | -0) >>> 31] = "This is a utility class and cannot be instantiated";
   }

   public static float m22000(float var0, float var1, double var2) {
      double var4 = m2000(var2);
      return var1 - (float)((var1 - var0) % var4);
   }

   public static double m26000(double var0) {
      double var2 = (Double)((NNiz)((NNuU)f4000[f6000[0]]).i[f6000[1]]).u().method_41753();
      double var4 = var2 * f5000[0] + f5000[1];
      return var0 / (f5000[2] * var4 * var4 * var4);
   }

   private static void m28000() {
      double[] var128 = new double[3];
      f5000[(0 | -0) >>> 31] = Double.longBitsToDouble(4603579539098121011L);
      f5000[(1 | -1) >>> 31] = Double.longBitsToDouble(4596373779694328218L);
      f5000[2] = Double.longBitsToDouble(4620693217682128896L);
      double[] var129 = new double[7];
      f1000[(0 | -0) >>> 31] = Double.longBitsToDouble(4603579539312869376L);
      f1000[(1 | -1) >>> 31] = Double.longBitsToDouble(4596373779801702400L);
      f1000[2] = Double.longBitsToDouble(4620693217682128896L);
      f1000[3] = Double.longBitsToDouble(4603579539312869376L);
      f1000[4] = Double.longBitsToDouble(4596373779801702400L);
      f1000[5] = Double.longBitsToDouble(4620693217682128896L);
      f1000[6] = Double.longBitsToDouble(4594572339843380019L);
   }

   public static float m34000(float var0, float var1) {
      return m22000(var0, var1, (Double)((NNiz)((NNuU)f4000[f6000[4]]).i[f6000[5]]).u().method_41753());
   }
}

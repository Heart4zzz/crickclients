package rw.core;

import KDFzREm.NNWE;
import java.util.concurrent.ThreadLocalRandom;

public class C1183 {
   private static double[] f1000;
   private static float[] f2000;
   private static boolean[] f3000;
   private static String[] f4000;
   private static double[] f5000;

   public static double m2000(double var0, double var2) {
      double var4 = Math.max(f1000[1], var2 - var0);
      double var6 = m34000(var0 + var4 * f1000[2], var4 * f1000[3], var4 * f1000[4]);
      return NNWE.N(var6, var0, var2);
   }

   private static void m4000() {
      boolean[] var128 = new boolean[(1 | -1) >>> 31];
      f3000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   private C1183() {
      throw new UnsupportedOperationException(f4000[0]);
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      f4000 = new String[(1 | -1) >>> 31];
      f4000[(0 | -0) >>> 31] = "This is a utility class and cannot be instantiated";
   }

   public static float m12000(float var0) {
      return (float)ThreadLocalRandom.current().nextGaussian() * var0;
   }

   private static void m16000() {
      float[] var128 = new float[4];
      f2000[(0 | -0) >>> 31] = Float.intBitsToFloat(1120403456);
      f2000[(1 | -1) >>> 31] = Float.intBitsToFloat(1120403456);
      f2000[2] = Float.intBitsToFloat(1016003125);
      f2000[3] = Float.intBitsToFloat(1113927392);
   }

   public static float m18000(float var0, float var1) {
      return var0 + (var1 - var0) * ThreadLocalRandom.current().nextFloat();
   }

   public static double m20000(double var0, double var2) {
      return var0 * Math.exp(var2 * ThreadLocalRandom.current().nextGaussian());
   }

   public static float m22000(double var0) {
      return (float)var0 * f2000[3];
   }

   public static int m24000(int var0, int var1) {
      return ThreadLocalRandom.current().nextInt(var1 - var0 + f3000[0]) + var0;
   }

   public static double m28000(double var0, double var2) {
      double var4 = Math.round(var0 / var2) * var2;
      return Math.round(var4 * f5000[0]) / f5000[1];
   }

   public static float m32000(float var0, float var1) {
      float var2 = Math.round(var0 / var1) * var1;
      return Math.round(var2 * f2000[0]) / f2000[1];
   }

   public static double m34000(double var0, double var2, double var4) {
      double var6 = var0 + var2 * ThreadLocalRandom.current().nextGaussian();
      double var8 = -var4 * Math.log(f1000[0] - ThreadLocalRandom.current().nextDouble());
      return var6 + var8;
   }

   private static void m36000() {
      double[] var128 = new double[2];
      f5000[(0 | -0) >>> 31] = Double.longBitsToDouble(4636737291354636288L);
      f5000[(1 | -1) >>> 31] = Double.longBitsToDouble(4636737291354636288L);
      double[] var129 = new double[7];
      f1000[(0 | -0) >>> 31] = Double.longBitsToDouble(4607182418800017408L);
      f1000[(1 | -1) >>> 31] = Double.longBitsToDouble(0L);
      f1000[2] = Double.longBitsToDouble(4597094355634707497L);
      f1000[3] = Double.longBitsToDouble(4593311331947716280L);
      f1000[4] = Double.longBitsToDouble(4599796515411129795L);
      f1000[5] = Double.longBitsToDouble(4652007308841189376L);
      f1000[6] = Double.longBitsToDouble(4652007308841189376L);
   }

   public static float m40000(float var0) {
      return var0 * f2000[2];
   }

   public static double m42000(double var0) {
      return Math.round(var0 * f1000[5]) / f1000[6];
   }
}

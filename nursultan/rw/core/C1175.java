package rw.core;

import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNWE;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import KDFzREm.NjL;
import KDFzREm.NjZ;
import rw.api.Iface0641;

public class C1175 {
   private static boolean[] f1000;
   public static Object[] f2000;
   private static double[] f3000;
   private static float[] f4000;
   private static String[] f5000;
   private static short[] f6000;
   private static boolean[] f7000;
   private static boolean[] f8000;

   private static void m2000() {
      double[] var128 = new double[8];
      f3000[(0 | -0) >>> 31] = Double.longBitsToDouble(0L);
      f3000[(1 | -1) >>> 31] = Double.longBitsToDouble(0L);
      f3000[2] = Double.longBitsToDouble(0L);
      f3000[3] = Double.longBitsToDouble(0L);
      f3000[4] = Double.longBitsToDouble(4607182418800017408L);
      f3000[5] = Double.longBitsToDouble(0L);
      f3000[6] = Double.longBitsToDouble(4607182418800017408L);
      f3000[7] = Double.longBitsToDouble(4607002274986721280L);
   }

   private static boolean m4000(Iface0641 var0) {
      return var0.m10000() && !var0.m2000() && var0.m4000() - var0.m8000() > f3000[0] ? f7000[0] : f7000[1];
   }

   private static void m8000() {
      float[] var128 = new float[2];
      f4000[(0 | -0) >>> 31] = Float.intBitsToFloat(1063843267);
      f4000[(1 | -1) >>> 31] = Float.intBitsToFloat(1063843267);
   }

   private C1175() {
      throw new UnsupportedOperationException(f5000[0]);
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      short[] var128 = new short[6];
      f6000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f6000[(1 | -1) >>> 31] = 4;
      f6000[2] = (short)((0 | -0) >>> 31);
      f6000[3] = 4;
      f6000[4] = (short)((0 | -0) >>> 31);
      f6000[5] = 3;
   }

   private static void m12000() {
      boolean[] var128 = new boolean[2];
      f7000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f7000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      boolean[] var129 = new boolean[6];
      f1000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[2] = (boolean)((1 | -1) >>> 31);
      f1000[3] = (boolean)((0 | -0) >>> 31);
      f1000[4] = (boolean)((1 | -1) >>> 31);
      f1000[5] = (boolean)((0 | -0) >>> 31);
      boolean[] var130 = new boolean[6];
      f8000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f8000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f8000[2] = (boolean)((1 | -1) >>> 31);
      f8000[3] = (boolean)((0 | -0) >>> 31);
      f8000[4] = (boolean)((0 | -0) >>> 31);
      f8000[5] = (boolean)((1 | -1) >>> 31);
   }

   private static NXi m16000(Iface0641 var0) {
      return var0.m6000().method_18796(new NXi(var0.m12000().M, var0.m12000().B, var0.m12000().Z), NjZ.field_6308);
   }

   private static void m18000(Iface0641 var0) {
      NjL var1 = var0.m6000();
      float var2 = ((NNNZg)((NNuU)f2000[f6000[4]]).T[f6000[5]]).method_8320(var1.method_23314()).i().Z();
      float var3 = var0.m18000() ? var2 * f4000[0] : f4000[1];
      NXi var4 = var0.m12000();
      var0.m16000(new NXi(var4.M * var3, (var4.B - var1.method_61426()) * f3000[7], var4.Z * var3));
   }

   private static void m22000() {
      f5000 = new String[(1 | -1) >>> 31];
      f5000[(0 | -0) >>> 31] = "This is a utility class and cannot be instantiated";
   }

   private static void m24000(Iface0641 var0) {
      var0.m16000(new NXi(var0.m12000().M, var0.m6000().method_6106(), var0.m12000().Z));
   }

   public static NXi m26000() {
      return ((Iface0641)((NNNwS)((NNuU)f2000[f6000[2]]).T[f6000[3]])).m12000();
   }

   public static void m30000(Iface0641 var0) {
      if (m4000(var0)) {
         m24000(var0);
      }

      NXi var1 = m16000(var0);
      NXi var2 = m36000(var0, var1);
      m34000(var0, var1, var2);
      m18000(var0);
   }

   private static void m34000(Iface0641 var0, NXi var1, NXi var2) {
      boolean var3 = !NNWE.y(var1.M, var2.M) ? f1000[0] : f1000[1];
      boolean var4 = !NNWE.y(var1.Z, var2.Z) ? f1000[2] : f1000[3];
      boolean var5 = !var3 && !var4 ? f1000[5] : f1000[4];
      boolean var6 = var1.B != var2.B ? f8000[0] : f8000[1];
      boolean var7 = var6 && var1.B < f3000[1] ? f8000[2] : f8000[3];
      if (var5) {
         NXi var8 = var0.m12000();
         var0.m16000(new NXi(var3 ? f3000[2] : var8.M, var8.B, var4 ? f3000[3] : var8.Z));
      }

      if (var6) {
         var0.m16000(var0.m12000().u(f3000[4], f3000[5], f3000[6]));
      }

      var0.m14000(var7);
   }

   private static NXi m36000(Iface0641 var0, NXi var1) {
      return var0.m6000().method_17835(var1);
   }

   public static boolean m42000() {
      return ((Iface0641)((NNNwS)((NNuU)f2000[f6000[0]]).T[f6000[1]])).m18000();
   }

   private static void m48000() {
      f2000 = new Object[f8000[5]];
   }
}

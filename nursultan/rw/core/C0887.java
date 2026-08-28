package rw.core;

import KDFzREm.NHS;
import KDFzREm.NNGd;
import KDFzREm.NNNZZ;
import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNWE;
import KDFzREm.NNcO;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import KDFzREm.NbI;
import rw.api.Iface0647;
import rw.gui.TickRateSync;

public class C0887 {
   private static boolean[] f1000;
   private static short[] f2000;
   private static boolean[] f3000;
   private static String[] f4000;
   private static short[] f5000;
   private static double[] f6000;
   private static short[] f7000;
   private static double[] f8000;
   private static short[] f9000;
   private static short[] f10000;
   private static float[] f11000;
   private static short[] f12000;
   public static Object[] f13000;

   public static boolean m2000() {
      return m30000(f11000[6]);
   }

   private static void m6000() {
      double[] var128 = new double[6];
      f8000[(0 | -0) >>> 31] = Double.longBitsToDouble(0L);
      f8000[(1 | -1) >>> 31] = Double.longBitsToDouble(0L);
      f8000[2] = Double.longBitsToDouble(4591149604126578442L);
      f8000[3] = Double.longBitsToDouble(0L);
      f8000[4] = Double.longBitsToDouble(0L);
      f8000[5] = Double.longBitsToDouble(4591870180066957722L);
      double[] var129 = new double[7];
      f6000[(0 | -0) >>> 31] = Double.longBitsToDouble(0L);
      f6000[(1 | -1) >>> 31] = Double.longBitsToDouble(0L);
      f6000[2] = Double.longBitsToDouble(4603579539098121011L);
      f6000[3] = Double.longBitsToDouble(0L);
      f6000[4] = Double.longBitsToDouble(0L);
      f6000[5] = Double.longBitsToDouble(0L);
      f6000[6] = Double.longBitsToDouble(0L);
   }

   private C0887() {
      throw new UnsupportedOperationException(f4000[0]);
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      boolean[] var128 = new boolean[8];
      f1000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[2] = (boolean)((1 | -1) >>> 31);
      f1000[3] = (boolean)((0 | -0) >>> 31);
      f1000[4] = (boolean)((0 | -0) >>> 31);
      f1000[5] = (boolean)((1 | -1) >>> 31);
      f1000[6] = (boolean)((0 | -0) >>> 31);
      f1000[7] = (boolean)((0 | -0) >>> 31);
      boolean[] var129 = new boolean[7];
      f3000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[2] = (boolean)((0 | -0) >>> 31);
      f3000[3] = (boolean)((1 | -1) >>> 31);
      f3000[4] = (boolean)((0 | -0) >>> 31);
      f3000[5] = (boolean)((0 | -0) >>> 31);
      f3000[6] = (boolean)((1 | -1) >>> 31);
   }

   private static void m12000() {
      short[] var128 = new short[7];
      f7000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f7000[(1 | -1) >>> 31] = 4;
      f7000[2] = (short)((0 | -0) >>> 31);
      f7000[3] = 4;
      f7000[4] = (short)((1 | -1) >>> 31);
      f7000[5] = (short)((0 | -0) >>> 31);
      f7000[6] = 2;
      short[] var129 = new short[8];
      f12000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f12000[(1 | -1) >>> 31] = 4;
      f12000[2] = (short)((0 | -0) >>> 31);
      f12000[3] = 4;
      f12000[4] = (short)((0 | -0) >>> 31);
      f12000[5] = 4;
      f12000[6] = (short)((0 | -0) >>> 31);
      f12000[7] = 4;
      short[] var130 = new short[7];
      f10000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f10000[(1 | -1) >>> 31] = 4;
      f10000[2] = (short)((0 | -0) >>> 31);
      f10000[3] = 4;
      f10000[4] = (short)((0 | -0) >>> 31);
      f10000[5] = 4;
      f10000[6] = (short)((0 | -0) >>> 31);
      short[] var131 = new short[5];
      f9000[(0 | -0) >>> 31] = 4;
      f9000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f9000[2] = 3;
      f9000[3] = (short)((0 | -0) >>> 31);
      f9000[4] = 4;
      short[] var132 = new short[8];
      f5000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f5000[(1 | -1) >>> 31] = 4;
      f5000[2] = (short)((0 | -0) >>> 31);
      f5000[3] = 4;
      f5000[4] = (short)((0 | -0) >>> 31);
      f5000[5] = 4;
      f5000[6] = (short)((0 | -0) >>> 31);
      f5000[7] = 4;
      short[] var133 = new short[4];
      f2000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = 4;
      f2000[2] = (short)((0 | -0) >>> 31);
      f2000[3] = 3;
   }

   private static void m14000() {
      f13000 = new Object[f3000[6]];
   }

   private static void m18000() {
      float[] var128 = new float[7];
      f11000[(0 | -0) >>> 31] = Float.intBitsToFloat(1065353216);
      f11000[(1 | -1) >>> 31] = Float.intBitsToFloat(1101004800);
      f11000[2] = Float.intBitsToFloat(1101004800);
      f11000[3] = Float.intBitsToFloat(0);
      f11000[4] = Float.intBitsToFloat(1065353216);
      f11000[5] = Float.intBitsToFloat(1063675494);
      f11000[6] = Float.intBitsToFloat(1056964608);
   }

   public static boolean m24000() {
      if (!((NNNwS)((NNuU)f13000[f12000[2]]).T[f12000[3]]).method_6059(NbI.d)
         && !((NNNwS)((NNuU)f13000[f12000[4]]).T[f12000[5]]).method_6059(NbI.P)
         && ((NNNwS)((NNuU)f13000[f12000[6]]).T[f12000[7]]).field_17046 == NXi.L
         && !((NNNwS)((NNuU)f13000[f10000[0]]).T[f10000[1]]).method_5765()
         && !C1187.m36000()
         && !((NNNwS)((NNuU)f13000[f10000[2]]).T[f10000[3]]).method_6101()) {
         NHS var0 = ((NNNwS)((NNuU)f13000[f10000[4]]).T[f10000[5]]).method_5829().L(f8000[1], f8000[2], f8000[3]).u(f8000[4], f8000[5], f6000[0]);
         if (((NNNwS)((NNuU)f13000[f10000[6]]).T[f9000[0]]).method_24828()
            && ((NNNZg)((NNuU)f13000[f9000[1]]).T[f9000[2]]).method_8600((NNNwS)((NNuU)f13000[f9000[3]]).T[f9000[4]], var0).iterator().hasNext()) {
            return f3000[0];
         } else if (((NNNwS)((NNuU)f13000[f5000[0]]).T[f5000[1]]).method_24828()
            && ((NNNwS)((NNuU)f13000[f5000[2]]).T[f5000[3]]).method_18376() == NNGd.field_18079) {
            return f3000[1];
         } else if (((NNNwS)((NNuU)f13000[f5000[4]]).T[f5000[5]]).method_31549().y) {
            return f3000[2];
         } else {
            NHS var1 = ((NNNwS)((NNuU)f13000[f5000[6]]).T[f5000[7]]).method_5829();
            double var2 = ((NNNwS)((NNuU)f13000[f2000[0]]).T[f2000[1]]).method_5681() ? f6000[1] : f6000[2];
            var1 = var1.N(f6000[3], var2, f6000[4]).u(f6000[5], var2, f6000[6]);
            return !((NNNZg)((NNuU)f13000[f2000[2]]).T[f2000[3]]).u(var1) ? f3000[3] : f3000[4];
         }
      } else {
         return f1000[7];
      }
   }

   public static boolean m26000(boolean var0) {
      if (!var0) {
         return f1000[4];
      } else {
         return ((NNNwS)((NNuU)f13000[f12000[0]]).T[f12000[1]]).field_6017 == f8000[0] ? f1000[5] : f1000[6];
      }
   }

   public static boolean m30000(float var0) {
      float var1 = TickRateSync.m2000();
      float var2 = f11000[0] / (float)((NNNwS)((NNuU)f13000[f7000[0]]).T[f7000[1]]).method_45325(NNcO.R) * f11000[1];
      float var3 = ((Integer)((NNNwS)((NNuU)f13000[f7000[2]]).T[f7000[3]]).fields_3212a028292fd3c078969e3ee4c71d9e8[f7000[4]]).intValue() + var0;
      float var4 = var2 * (f11000[2] / var1);
      return NNWE.N(var3 / var4, f11000[3], f11000[4]) <= f11000[5] ? f1000[0] : f1000[1];
   }

   public static boolean m32000(int var0) {
      return m36000() < var0 ? f1000[2] : f1000[3];
   }

   public static int m36000() {
      return ((Iface0647)((NNNZZ)((NNuU)f13000[f7000[5]]).T[f7000[6]])).m2000();
   }

   private static void m40000() {
      f4000 = new String[(1 | -1) >>> 31];
      f4000[(0 | -0) >>> 31] = "This is a utility class and cannot be instantiated";
   }
}

package rw.core;

import KDFzREm.NNWE;
import KDFzREm.NNiz;
import KDFzREm.NNuU;
import KDFzREm.NXi;

public class C0070 {
   private static short[] f1000;
   private static double[] f2000;

   private static void m2000() {
      double[] var128 = new double[5];
      f2000[(0 | -0) >>> 31] = Double.longBitsToDouble(4585204852618449388L);
      f2000[(1 | -1) >>> 31] = Double.longBitsToDouble(4603579539098121011L);
      f2000[2] = Double.longBitsToDouble(4596373779694328218L);
      f2000[3] = Double.longBitsToDouble(4620693217682128896L);
      f2000[4] = Double.longBitsToDouble(4594572339843380019L);
   }

   private C0070() {
   }

   static {
      ntfClinit();
   }

   private static void m4000() {
      short[] var128 = new short[5];
      f1000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[2] = 7;
      f1000[3] = (short)((0 | -0) >>> 31);
      f1000[4] = 7;
   }

   public static float m12000(float var0, float var1) {
      return NNWE.R(var1 - var0);
   }

   public static C0983 m14000(NXi var0) {
      return C0989.m30000(var0);
   }

   public static double m16000() {
      if ((NNuU)C0768.f1000[f1000[0]] != null && (NNiz)((NNuU)C0768.f1000[f1000[1]]).i[f1000[2]] != null) {
         double var0 = (Double)((NNiz)((NNuU)C0768.f1000[f1000[3]]).i[f1000[4]]).u().method_41753() * f2000[1] + f2000[2];
         return var0 * var0 * var0 * f2000[3] * f2000[4];
      } else {
         return f2000[0];
      }
   }
}

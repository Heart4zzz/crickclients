package rw.core;

import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NQa;
import KDFzREm.NQo;
import KDFzREm.NXi;
import KDFzREm.NYk;
import KDFzREm.Nwn;
import java.util.Map;

public class C1007 {
   private static boolean[] f1000;
   private static short[] f2000;
   private static boolean[] f3000;
   private static short[] f4000;
   private static int[] f5000;
   public static Object[] f6000;
   private static String[] f7000;
   private static float[] f8000;
   private static byte[] f9000;
   private static double[] f10000;
   private static boolean[] f11000;

   private static void m2000() {
      float[] var128 = new float[(1 | -1) >>> 31];
      f8000[(0 | -0) >>> 31] = Float.intBitsToFloat(1065353216);
   }

   private static boolean m4000(Nwn var0) {
      NQo var1 = Ollimp<"vejaogig",22203058,203863763,203863806,203863761,1784670956,-1014492060>(var0);
      return var1.N(var0) != 0 && !var1.N(NQa.lo) ? f3000[4] : f3000[5];
   }

   private static void m8000() {
      int[] var128 = new int[3];
      f5000[(0 | -0) >>> 31] = 72000;
      f5000[(1 | -1) >>> 31] = 72000;
      f5000[2] = 72000;
   }

   private C1007() {
      throw new UnsupportedOperationException(f7000[0]);
   }

   static {
      ntfClinit();
   }

   private static void m14000() {
      byte[] var128 = new byte[3];
      f9000[(0 | -0) >>> 31] = 2;
      f9000[(1 | -1) >>> 31] = 3;
      f9000[2] = 4;
   }

   private static void m16000() {
      f7000 = new String[(1 | -1) >>> 31];
      f7000[(0 | -0) >>> 31] = "This is a utility class and cannot be instantiated";
   }

   private static void m18000() {
      double[] var128 = new double[2];
      f10000[(0 | -0) >>> 31] = Double.longBitsToDouble(0L);
      f10000[(1 | -1) >>> 31] = Double.longBitsToDouble(0L);
   }

   private static void m24000() {
      boolean[] var128 = new boolean[4];
      f1000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[2] = (boolean)((0 | -0) >>> 31);
      f1000[3] = (boolean)((1 | -1) >>> 31);
      boolean[] var129 = new boolean[7];
      f3000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f3000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[2] = (boolean)((1 | -1) >>> 31);
      f3000[3] = (boolean)((0 | -0) >>> 31);
      f3000[4] = (boolean)((1 | -1) >>> 31);
      f3000[5] = (boolean)((0 | -0) >>> 31);
      f3000[6] = (boolean)((0 | -0) >>> 31);
      boolean[] var130 = new boolean[2];
      f11000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f11000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   private static void m26000() {
      short[] var128 = new short[5];
      f4000[(0 | -0) >>> 31] = 2;
      f4000[(1 | -1) >>> 31] = 3;
      f4000[2] = 2;
      f4000[3] = 3;
      f4000[4] = 2;
      short[] var129 = new short[5];
      f2000[(0 | -0) >>> 31] = 4;
      f2000[(1 | -1) >>> 31] = 3;
      f2000[2] = (short)((0 | -0) >>> 31);
      f2000[3] = (short)((1 | -1) >>> 31);
      f2000[4] = 3;
   }

   private static boolean m30000(Nwn var0) {
      return (var0.method_6047().N(NQa.lo) || var0.method_6079().N(NQa.lo)) && !m4000(var0) ? f3000[2] : f3000[3];
   }

   public static boolean m32000(Nwn var0, NXi var1, boolean var2) {
      boolean var3 = var2 ? var0.method_6039() : (var0.method_6115() && var0.method_6030().N(NQa.lo) ? f1000[0] : f1000[1]);
      if (!var3) {
         return f1000[2];
      } else if (var1 == null) {
         return f1000[3];
      } else {
         NXi var4 = var0.method_5828(f8000[0]);
         NXi var5 = var1.N(var0.method_73189()).u();
         NXi var6 = new NXi(var5.M, f10000[0], var5.Z);
         return var6.y(var4) < f10000[1] ? f3000[0] : f3000[1];
      }
   }

   public static void m34000() {
      if ((NNNZg)((NNuU)f6000[f4000[0]]).T[f4000[1]] != null) {
         for (Nwn var1 : ((NNNZg)((NNuU)f6000[f4000[2]]).T[f4000[3]]).method_18456()) {
            if (var1 != (NNNwS)((NNuU)f6000[f4000[4]]).T[f2000[0]]) {
               int var2 = ((Map)f6000[f2000[1]]).getOrDefault(var1, f5000[0]);
               if (var1.method_6115() && m30000(var1)) {
                  NQo var7 = var1.method_5998(var1.method_6058());
                  var1.fields_9212a028292fd3c078969e3ee4c71d9e8[f2000[2]] = var7;
                  Integer var8 = var2;
                  var1.fields_9212a028292fd3c078969e3ee4c71d9e8[f2000[3]] = var8;
                  var2--;
               } else {
                  var2 = f5000[1];
               }

               ((Map)f6000[f2000[4]]).put(var1, var2);
            }
         }
      }
   }

   public static boolean m42000(Nwn var0) {
      return var0.method_59958().B() instanceof NYk;
   }

   public static boolean m44000(Nwn var0, boolean var1) {
      return m32000(var0, null, var1);
   }

   private static void m46000() {
      f6000 = new Object[f9000[2]];
      f6000[f3000[6]] = f11000[0];
      f6000[f11000[(1 | -1) >>> 31]] = f5000[2];
   }
}

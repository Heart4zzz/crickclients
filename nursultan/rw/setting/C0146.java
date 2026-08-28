package rw.setting;

import KDFzREm.NNNzb;
import KDFzREm.NNuU;

public class C0146 {
   private static boolean[] f1000;
   public static Object[] f2000;
   private static String[] f3000;

   private static void m4000() {
      f3000 = new String[2];
      f3000[(0 | -0) >>> 31] = "localhost";
      f3000[(1 | -1) >>> 31] = "localhost";
   }

   private C0146() {
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      boolean[] var128 = new boolean[2];
      f1000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
   }

   private static void m8000() {
      f2000 = new Object[f1000[(0 | -0) >>> 31]];
      f2000[f1000[(1 | -1) >>> 31]] = f3000[(1 | -1) >>> 31];
   }

   public static String m10000() {
      return NNuU.Nq().Ny().L();
   }

   public static String m18000() {
      NNNzb var0 = NNuU.Nq().yN();
      return var0 == null ? f3000[0] : var0.y;
   }
}

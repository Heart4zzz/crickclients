package rw.core;

import KDFzREm.NAN;
import KDFzREm.NAd;
import KDFzREm.NNag;
import rw.api.Iface0605;

public class C0884 implements Iface0605 {
   private static String[] f1000;
   public static Object[] f2000;
   private static boolean[] f3000;

   private static void m4000() {
      boolean[] var128 = new boolean[3];
      f3000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f3000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[2] = (boolean)((1 | -1) >>> 31);
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f1000 = new String[(1 | -1) >>> 31];
      f1000[(0 | -0) >>> 31] = "[IRC] ";
   }

   private static void m10000() {
      f2000 = new Object[f3000[2]];
   }

   public NNag m12000() {
      return NAN.y(f1000[0]).y(NAd.N.N(f3000[0]));
   }
}

package rw.core;

import KDFzREm.NAN;
import KDFzREm.NNag;
import rw.api.Iface0605;

public class C0874 implements Iface0605 {
   private static String[] f1000;
   private static boolean[] f2000;
   public static Object[] f3000;
   private static byte[] f4000;
   private static short[] f5000;

   private static void m2000() {
      f3000 = new Object[f2000[1]];
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      byte[] var128 = new byte[2];
      f4000[(0 | -0) >>> 31] = 80;
      f4000[(1 | -1) >>> 31] = 100;
   }

   private static void m12000() {
      short[] var128 = new short[2];
      f5000[(0 | -0) >>> 31] = 220;
      f5000[(1 | -1) >>> 31] = 255;
   }

   private static void m14000() {
      boolean[] var128 = new boolean[2];
      f2000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   public NNag m20000() {
      return NAN.y(f1000[0]).y(C0876.m34000(f4000[0], f5000[0], f4000[1], f5000[1]));
   }

   private static void m24000() {
      f1000 = new String[(1 | -1) >>> 31];
      f1000[(0 | -0) >>> 31] = "\ud83d\udd27・";
   }
}

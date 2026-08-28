package rw.core;

import rw.api.Iface0202;
import rw.data.Rec0234;

public class C1055 {
   public static Object[] f1000;
   private static String[] f2000;
   private static float[] f3000;
   private static boolean[] f4000;

   private static void m4000() {
      f2000 = new String[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = "modalFade";
   }

   private C1055() {
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f1000 = new Object[f4000[2]];
      f1000[f4000[3]] = f3000[(1 | -1) >>> 31];
   }

   private static void m10000() {
      float[] var128 = new float[2];
      f3000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f3000[(1 | -1) >>> 31] = Float.intBitsToFloat(1043878380);
   }

   private static void m14000() {
      boolean[] var128 = new boolean[4];
      f4000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[2] = (boolean)((1 | -1) >>> 31);
      f4000[3] = (boolean)((0 | -0) >>> 31);
   }

   public static Rec0234 m20000(Iface0202 var0, boolean var1) {
      C1049 var2 = var0.m4000(f2000[0], C1049::new);
      var2.m20000(var1);
      return new Rec0234(var2.m4000(), !var1 && !(var2.m8000() > f3000[0]) ? f4000[1] : f4000[0]);
   }
}

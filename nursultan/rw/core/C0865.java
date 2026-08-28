package rw.core;

import rw.GuiWidget;

public class C0865 {
   private static String[] f1000;
   private static boolean[] f2000;
   public static Object[] f3000;
   private static byte[] f4000;

   private static void m4000() {
      f1000 = new String[(1 | -1) >>> 31];
      f1000[(0 | -0) >>> 31] = "No serializer for CURRENT_FORMAT=1";
   }

   private C0865() {
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f4000[(0 | -0) >>> 31] = 2;
   }

   private static void m10000() {
      f3000 = new Object[f4000[(0 | -0) >>> 31]];
      f3000[f2000[(1 | -1) >>> 31]] = Integer.valueOf(f2000[2]);
      f3000[f2000[3]] = Integer.valueOf(f2000[4]);
   }

   public static byte[] m14000(Iterable<GuiWidget> var0) {
      switch (f2000[0]) {
         case true:
            return new C0895().m38000(var0);
         default:
            throw new IllegalStateException(f1000[0]);
      }
   }

   private static void m20000() {
      boolean[] var128 = new boolean[5];
      f2000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[2] = (boolean)((1 | -1) >>> 31);
      f2000[3] = (boolean)((1 | -1) >>> 31);
      f2000[4] = (boolean)((1 | -1) >>> 31);
   }
}

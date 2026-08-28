package rw.core;

import java.net.SocketException;
import java.util.Locale;

public class C0590 {
   private static boolean[] f1000;
   private static String[] f2000;

   private C0590() {
   }

   static {
      ntfClinit();
   }

   private static void m2000() {
      boolean[] var128 = new boolean[3];
      f1000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f1000[2] = (boolean)((0 | -0) >>> 31);
   }

   private static void m6000() {
      f2000 = new String[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = "connection reset";
   }

   public static boolean m8000(Throwable var0) {
      if (!(var0 instanceof SocketException var1)) {
         return f1000[0];
      } else {
         String var2 = var1.getMessage();
         return var2 != null && var2.toLowerCase(Locale.ROOT).contains(f2000[0]) ? f1000[1] : f1000[2];
      }
   }
}

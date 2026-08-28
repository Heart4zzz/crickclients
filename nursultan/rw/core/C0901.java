package rw.core;

import java.util.Locale;
import org.apache.commons.lang3.RandomStringUtils;
import rw.NursultanClient;
import rw.data.Rec0303;

public class C0901 {
   private static boolean[] f1000;
   private static String[] f2000;
   public static Object[] f3000;
   private static byte[] f4000;

   private static void m4000() {
      byte[] var128 = new byte[2];
      f4000[(0 | -0) >>> 31] = 10;
      f4000[(1 | -1) >>> 31] = 15;
   }

   private C0901() {
      throw new UnsupportedOperationException(f2000[0]);
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f2000 = new String[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = "This is a utility class and cannot be instantiated";
   }

   private static void m8000() {
      f3000 = new Object[f1000[3]];
   }

   private static void m12000() {
      boolean[] var128 = new boolean[4];
      f1000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[2] = (boolean)((0 | -0) >>> 31);
      f1000[3] = (boolean)((1 | -1) >>> 31);
   }

   public static String m20000() {
      String var0 = RandomStringUtils.insecure().nextAlphabetic(f4000[0], f4000[1]).toLowerCase(Locale.ENGLISH);
      StringBuilder var1 = new StringBuilder();
      char[] var2 = var0.toCharArray();

      for (int var3 = f1000[1]; var3 < var2.length; var3++) {
         char var4 = var2[var3];
         if (var3 == 0) {
            var1.append(Character.toUpperCase(var4));
         } else {
            var1.append(var4);
         }
      }

      return var1.toString();
   }

   public static void m22000(String var0) {
      NursultanClient.m48000().m8000(new Noqodls(Rec0303.m22000(var0), f1000[0], System.currentTimeMillis()));
   }
}

package rw.core;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import rw.data.Rec0223;

public class OlnpItr {
   private static boolean[] f1000;
   private static short[] f2000;
   public static Object[] f3000;
   private static String[] f4000;

   private static void m4000() {
      short[] var128 = new short[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
   }

   private OlnpItr() {
      throw new UnsupportedOperationException(f4000[0]);
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f3000 = new Object[f1000[1]];
   }

   private static void m10000() {
      boolean[] var128 = new boolean[2];
      f1000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   public static List<Rec0223> m16000(String var0, int var1) {
      if (var1 != 0 && var0 != null && !var0.isBlank()) {
         String var2 = var0.trim().toLowerCase();
         ArrayList var3 = new ArrayList();

         for (Base1005 var5 : (List)f3000[f2000[0]]) {
            var5.m26000(var2, var1, var3);
         }

         var3.sort(Comparator.comparingInt(Rec0223::m2000).reversed());
         return var3;
      } else {
         return List.of();
      }
   }

   private static void m20000() {
      f4000 = new String[(1 | -1) >>> 31];
      f4000[(0 | -0) >>> 31] = "This is a utility class and cannot be instantiated";
   }
}

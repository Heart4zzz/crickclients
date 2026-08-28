package rw.core;

import KDFzREm.NAN;
import KDFzREm.NAd;
import KDFzREm.NNNCu;
import KDFzREm.NNag;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import rw.api.Iface0618;
import rw.data.Rec0220;
import rw.data.Rec0221;

public class C0949 {
   private static boolean[] f1000;
   private static String[] f2000;
   private static boolean[] f3000;
   private static boolean[] f4000;

   public static NNag m4000(NAN var0, Pattern var1, NAN var2) {
      return m54000(var0, (var1x, var2x) -> m36000(var1x, var1, var2x), var2, f1000[4], f3000[0]);
   }

   public static NNag m6000(NAN var0, String var1, NAN var2) {
      return m54000(var0, (var1x, var2x) -> m32000(var1x, var1, var2x), var2, f1000[0], f1000[1]);
   }

   private C0949() {
      throw new UnsupportedOperationException(f2000[0]);
   }

   static {
      ntfClinit();
   }

   public static NNag m14000(NAN var0, String var1, NAN var2) {
      return m54000(var0, (var1x, var2x) -> m32000(var1x, var1, var2x), var2, f4000[2], f4000[3]);
   }

   public static NNag m16000(NAN var0, Pattern var1, NAN var2) {
      return m54000(var0, (var1x, var2x) -> m36000(var1x, var1, var2x), var2, f4000[4], f4000[5]);
   }

   private static void m20000() {
      boolean[] var128 = new boolean[8];
      f4000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[2] = (boolean)((0 | -0) >>> 31);
      f4000[3] = (boolean)((0 | -0) >>> 31);
      f4000[4] = (boolean)((1 | -1) >>> 31);
      f4000[5] = (boolean)((0 | -0) >>> 31);
      f4000[6] = (boolean)((0 | -0) >>> 31);
      f4000[7] = (boolean)((0 | -0) >>> 31);
      boolean[] var129 = new boolean[5];
      f1000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f1000[2] = (boolean)((0 | -0) >>> 31);
      f1000[3] = (boolean)((1 | -1) >>> 31);
      f1000[4] = (boolean)((1 | -1) >>> 31);
      boolean[] var130 = new boolean[7];
      f3000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f3000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[2] = (boolean)((1 | -1) >>> 31);
      f3000[3] = (boolean)((0 | -0) >>> 31);
      f3000[4] = (boolean)((0 | -0) >>> 31);
      f3000[5] = (boolean)((0 | -0) >>> 31);
      f3000[6] = (boolean)((0 | -0) >>> 31);
   }

   public static NNag m22000(NAN var0, String var1) {
      return m14000(var0, var1, NAN.i());
   }

   public static NNag m28000(NAN var0, Pattern var1, NAN var2) {
      return m54000(var0, (var1x, var2x) -> m36000(var1x, var1, var2x), var2, f4000[6], f4000[7]);
   }

   public static NNag m30000(NAN var0, String var1, NAN var2) {
      return m54000(var0, (var1x, var2x) -> m32000(var1x, var1, var2x), var2, f4000[0], f4000[1]);
   }

   private static List<Rec0221> m32000(String var0, String var1, boolean var2) {
      ArrayList var3 = new ArrayList();
      if (var1.isEmpty()) {
         return var3;
      } else {
         String var4 = var1.toLowerCase(Locale.ROOT);
         String var5 = var0.toLowerCase(Locale.ROOT);
         int var6 = f3000[3];

         while (true) {
            int var7 = var5.indexOf(var4, var6);
            if (var7 < 0) {
               break;
            }

            int var8 = var7 + var4.length();
            var3.add(new Rec0221(var7, var8));
            if (!var2) {
               break;
            }

            var6 = var8;
         }

         return var3;
      }
   }

   public static NNag m34000(NAN var0, Pattern var1) {
      return m28000(var0, var1, NAN.i());
   }

   private static List<Rec0221> m36000(String var0, Pattern var1, boolean var2) {
      ArrayList var3 = new ArrayList();
      Matcher var4 = var1.matcher(var0);

      while (var4.find()) {
         var3.add(new Rec0221(var4.start(), var4.end()));
         if (!var2) {
            break;
         }
      }

      return var3;
   }

   private static void m38000(NNag var0, List<Rec0220> var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = f3000[5];

         for (Rec0220 var6 : var1) {
            int var8 = var4 + var6.f2000.length();
            if (var8 <= var2) {
               var4 = var8;
            } else {
               if (var4 >= var3) {
                  break;
               }

               int var9 = Math.max(var2, var4) - var4;
               int var10 = Math.min(var3, var8) - var4;
               if (var9 < var10) {
                  var0.y(NAN.y(var6.f2000.substring(var9, var10)).y(var6.f1000));
               }

               var4 = var8;
            }
         }
      }
   }

   private static NAd m40000(List<Rec0220> var0, int var1) {
      int var2 = f3000[6];

      for (Rec0220 var4 : var0) {
         int var5 = var2 + var4.f2000.length();
         if (var1 < var5) {
            return var4.f1000;
         }

         var2 = var5;
      }

      return NAd.N;
   }

   private static NNag m42000(List<Rec0220> var0, int var1, List<Rec0221> var2, NAN var3, boolean var4) {
      NNag var5 = NAN.i();
      int var6 = f3000[4];

      for (Rec0221 var8 : var2) {
         if (var8.f1000 > var6) {
            m38000(var5, var0, var6, var8.f1000);
         }

         if (!var3.getString().isEmpty()) {
            NNag var9 = var3.L();
            if (var4) {
               NAd var10 = m40000(var0, var8.f1000);
               var9.y(var10);
               if (!var3.method_10866().B()) {
                  var9.L(var3.method_10866());
               }
            }

            var5.y(var9);
         }

         var6 = var8.f2000;
      }

      if (var6 < var1) {
         m38000(var5, var0, var6, var1);
      }

      return var5;
   }

   public static NNag m44000(NAN var0, Pattern var1, NAN var2) {
      return m54000(var0, (var1x, var2x) -> m36000(var1x, var1, var2x), var2, f3000[1], f3000[2]);
   }

   private static void m46000() {
      f2000 = new String[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = "This is a utility class and cannot be instantiated";
   }

   public static NNag m50000(NAN var0, String var1, NAN var2) {
      return m54000(var0, (var1x, var2x) -> m32000(var1x, var1, var2x), var2, f1000[2], f1000[3]);
   }

   public static NNag m52000(NAN var0, String var1) {
      return m30000(var0, var1, NAN.i());
   }

   private static NNag m54000(NAN var0, Iface0618 var1, NAN var2, boolean var3, boolean var4) {
      ArrayList var5 = new ArrayList();
      m64000(var0, var5);
      StringBuilder var6 = new StringBuilder();

      for (Rec0220 var8 : var5) {
         var6.append(var8.f2000);
      }

      String var9 = var6.toString();
      List var10 = var1.m2000(var9, var3);
      return var10.isEmpty() ? var0.L() : m42000(var5, var9.length(), var10, var2, var4);
   }

   public static NNag m62000(NAN var0, Pattern var1) {
      return m16000(var0, var1, NAN.i());
   }

   private static void m64000(NAN var0, List<Rec0220> var1) {
      if (var0.method_10851() instanceof NNNCu var2) {
         String var5 = var2.comp_737();
         if (var5 != null && !var5.isEmpty()) {
            var1.add(new Rec0220(var5, var0.method_10866()));
         }
      }

      for (NAN var6 : var0.method_10855()) {
         m64000(var6, var1);
      }
   }
}

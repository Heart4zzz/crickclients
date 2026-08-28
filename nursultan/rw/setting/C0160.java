package rw.setting;

import KDFzREm.NAC;
import KDFzREm.NAN;
import KDFzREm.NCc;
import KDFzREm.NCs;
import KDFzREm.NNBM;
import KDFzREm.NNNBF;
import KDFzREm.NNNFv;
import KDFzREm.NNNZg;
import KDFzREm.NNNZr;
import KDFzREm.NNNwS;
import KDFzREm.NNNzb;
import KDFzREm.NNuU;
import KDFzREm.NSy;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import rw.api.Iface0646;
import rw.api.Iface0655;
import rw.core.C1142;
import rw.defs.Enum0091;

public class C0160 {
   private static byte[] f1000;
   private static short[] f2000;
   private static short[] f3000;
   private static String[] f4000;
   private static boolean[] f5000;
   private static byte[] f6000;
   private static String[] f7000;
   private static boolean[] f8000;
   private static short[] f9000;
   private static short[] f10000;
   private static byte[] f11000;
   private static short[] f12000;
   public static Object[] f13000;
   private static short[] f14000;
   private static short[] f15000;
   private static boolean[] f16000;
   private static short[] f17000;
   private static String[] f18000;
   private static String[] f19000;
   private static short[] f20000;
   private static boolean[] f21000;

   public static String m6000() {
      if ((NNNZg)((NNuU)f13000[f12000[1]]).T[f12000[2]] != null && (NNNwS)((NNuU)f13000[f12000[3]]).T[f14000[0]] != null) {
         NNNzb var0 = ((NNuU)f13000[f14000[1]]).yN();
         if (var0 == null) {
            return f4000[3];
         } else {
            String var1 = var0.y.split(f7000[0])[f8000[4]];
            if (var1.matches(f7000[1])) {
               return var1.toLowerCase();
            } else {
               String[] var2 = var1.split(f7000[2]);
               return var2.length >= f6000[0] ? var2[var2.length - f6000[1]].toLowerCase() : f18000[0];
            }
         }
      } else {
         return f4000[2];
      }
   }

   public static int m8000() {
      NCs var0 = m84000();
      if (var0 == null) {
         return f1000[0];
      } else {
         Matcher var1 = ((Pattern)f13000[f15000[3]]).matcher(var0.i().getString());
         if (var1.find()) {
            String var2 = var1.group(f1000[1]);
            return Integer.parseInt(var2);
         } else {
            return f1000[2];
         }
      }
   }

   private C0160() {
      throw new UnsupportedOperationException(f18000[1]);
   }

   static {
      ntfClinit();
   }

   public static boolean m18000() {
      if ((NNNwS)((NNuU)f13000[f10000[1]]).T[f17000[0]] != null && ((NNNwS)((NNuU)f13000[f17000[1]]).T[f20000[0]]).method_5476() != null) {
         String[] var10000 = new String[f16000[4]];
         var10000[f16000[5]] = f19000[1];
         return m68000(var10000);
      } else {
         return f16000[3];
      }
   }

   private static void m22000() {
      f13000 = new Object[f6000[6]];
      f13000[f8000[7]] = f18000[4];
      f13000[f6000[7]] = f18000[5];
      f13000[f11000[(0 | -0) >>> 31]] = f18000[6];
   }

   public static boolean m24000() {
      if ((NNNwS)((NNuU)f13000[f20000[1]]).T[f20000[2]] != null && ((NNNwS)((NNuU)f13000[f20000[3]]).T[f20000[4]]).method_5476() != null) {
         String[] var10000 = new String[f16000[7]];
         var10000[f21000[0]] = f19000[2];
         return !m54000(var10000) ? f21000[1] : ((NNNwS)((NNuU)f13000[f20000[5]]).T[f20000[6]]).method_5476().getString().contains(f19000[3]);
      } else {
         return f16000[6];
      }
   }

   private static void m40000() {
      short[] var128 = new short[6];
      f2000[(0 | -0) >>> 31] = 4;
      f2000[(1 | -1) >>> 31] = 4;
      f2000[2] = 4;
      f2000[3] = 4;
      f2000[4] = 4;
      f2000[5] = 4;
      short[] var129 = new short[6];
      f15000[(0 | -0) >>> 31] = 3;
      f15000[(1 | -1) >>> 31] = 4;
      f15000[2] = 4;
      f15000[3] = 2;
      f15000[4] = 4;
      f15000[5] = 4;
      short[] var130 = new short[2];
      f10000[(0 | -0) >>> 31] = 4;
      f10000[(1 | -1) >>> 31] = 4;
      short[] var131 = new short[2];
      f17000[(0 | -0) >>> 31] = 4;
      f17000[(1 | -1) >>> 31] = 4;
      short[] var132 = new short[7];
      f20000[(0 | -0) >>> 31] = 4;
      f20000[(1 | -1) >>> 31] = 4;
      f20000[2] = 4;
      f20000[3] = 4;
      f20000[4] = 4;
      f20000[5] = 4;
      f20000[6] = 4;
      short[] var133 = new short[4];
      f3000[(0 | -0) >>> 31] = 4;
      f3000[(1 | -1) >>> 31] = 3;
      f3000[2] = (short)((0 | -0) >>> 31);
      f3000[3] = 4;
      short[] var134 = new short[4];
      f12000[(0 | -0) >>> 31] = 6;
      f12000[(1 | -1) >>> 31] = 4;
      f12000[2] = 3;
      f12000[3] = 4;
      short[] var135 = new short[8];
      f14000[(0 | -0) >>> 31] = 4;
      f14000[(1 | -1) >>> 31] = 4;
      f14000[2] = 4;
      f14000[3] = 4;
      f14000[4] = 4;
      f14000[5] = 3;
      f14000[6] = 4;
      f14000[7] = 3;
      short[] var136 = new short[2];
      f9000[(0 | -0) >>> 31] = 4;
      f9000[(1 | -1) >>> 31] = 4;
   }

   private static void m44000() {
      f19000 = new String[5];
      f19000[(0 | -0) >>> 31] = "/";
      f19000[(1 | -1) >>> 31] = "наш сайт: reallyworld.ru";
      f19000[2] = "⚡";
      f19000[3] = "⚡";
      f19000[4] = "Монет:";
      f4000 = new String[4];
      f4000[(0 | -0) >>> 31] = "[,.]";
      f4000[(1 | -1) >>> 31] = m46000("");
      f4000[2] = "localhost";
      f4000[3] = "localhost";
      f7000 = new String[3];
      f7000[(0 | -0) >>> 31] = ":";
      f7000[(1 | -1) >>> 31] = "\\d{1,3}(\\.\\d{1,3}){3}";
      f7000[2] = "\\.";
      f18000 = new String[7];
      f18000[(0 | -0) >>> 31] = "localhost";
      f18000[(1 | -1) >>> 31] = "This is a utility class and cannot be instantiated";
      f18000[2] = ":\\s*(\\d+)";
      f18000[3] = "(?i).*?(анархия)-(\\d+)";
      f18000[4] = "\\d{1,3}(\\.\\d{1,3}){3}";
      f18000[5] = "localhost";
      f18000[6] = "⚡";
   }

   public static int m52000() {
      NNNBF var0 = ((NNuU)f13000[f2000[2]]).NE();
      if ((NNNwS)((NNuU)f13000[f2000[3]]).T[f2000[4]] != null && (NNNZg)((NNuU)f13000[f2000[5]]).T[f15000[0]] != null && var0 != null) {
         NNNZr var1 = var0.N(((NNNwS)((NNuU)f13000[f15000[1]]).T[f15000[2]]).method_7334().id());
         return var1 != null ? var1.R() : f16000[2];
      } else {
         return f16000[1];
      }
   }

   public static boolean m54000(String... var0) {
      if (var0.length == 0) {
         return f5000[1];
      } else {
         NCs var1 = m84000();
         if (var1 == null) {
            return f8000[0];
         } else {
            String[] var2 = var0;
            int var3 = var0.length;

            for (int var4 = f8000[1]; var4 < var3; var4++) {
               String var5 = var2[var4];
               if (var1.i().getString().trim().toLowerCase().contains(var5.toLowerCase())) {
                  return f8000[2];
               }
            }

            return f8000[3];
         }
      }
   }

   public static Optional<Long> m56000() {
      if (!m24000()) {
         return Optional.empty();
      } else {
         for (NCc var1 : ((NNNZg)((NNuU)f13000[f3000[0]]).T[f3000[1]]).method_8428().i()) {
            if (var1.R().getString().contains(f19000[4])) {
               Matcher var2 = ((Pattern)f13000[f3000[2]]).matcher(var1.R().getString().replaceAll(f4000[0], f4000[1]));
               if (var2.find()) {
                  return Optional.of(Long.parseLong(var2.group(f21000[2])));
               }
            }
         }

         return Optional.empty();
      }
   }

   private static void m62000() {
      byte[] var128 = new byte[3];
      f1000[(0 | -0) >>> 31] = -1;
      f1000[(1 | -1) >>> 31] = 2;
      f1000[2] = -1;
      byte[] var129 = new byte[8];
      f6000[(0 | -0) >>> 31] = 2;
      f6000[(1 | -1) >>> 31] = 2;
      f6000[2] = 3;
      f6000[3] = 64;
      f6000[4] = 2;
      f6000[5] = 4;
      f6000[6] = 7;
      f6000[7] = 3;
      byte[] var130 = new byte[(1 | -1) >>> 31];
      f11000[(0 | -0) >>> 31] = 5;
   }

   public static boolean m68000(String... var0) {
      if (var0.length == 0) {
         return f21000[3];
      } else {
         NAN var1 = ((NNBM)((NNuU)f13000[f3000[3]]).i[f12000[0]]).Z().y;
         if (var1 == null) {
            return f21000[4];
         } else {
            String[] var2 = var0;
            int var3 = var0.length;

            for (int var4 = f21000[5]; var4 < var3; var4++) {
               String var5 = var2[var4];
               if (var1.getString().trim().toLowerCase().contains(var5.toLowerCase())) {
                  return f21000[6];
               }
            }

            return f5000[0];
         }
      }
   }

   public static void m70000(String var0) {
      if (var0.startsWith(f19000[0])) {
         ((NNuU)f13000[f2000[0]]).NE().u(var0.substring(f16000[0]));
      } else {
         ((NNuU)f13000[f2000[1]]).NE().L(var0);
      }
   }

   public static Enum0091 m72000() {
      return ((C1142)((Iface0655)((NNNwS)((NNuU)f13000[f15000[4]]).T[f15000[5]])).dataManager()).m18000().m10000();
   }

   public static void m74000(NAC<?> var0) {
      ((Iface0646)((NNuU)f13000[f10000[0]]).NE().M()).sendPacketSilent(var0);
   }

   private static void m76000() {
      boolean[] var128 = new boolean[8];
      f16000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f16000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f16000[2] = (boolean)((0 | -0) >>> 31);
      f16000[3] = (boolean)((0 | -0) >>> 31);
      f16000[4] = (boolean)((1 | -1) >>> 31);
      f16000[5] = (boolean)((0 | -0) >>> 31);
      f16000[6] = (boolean)((0 | -0) >>> 31);
      f16000[7] = (boolean)((1 | -1) >>> 31);
      boolean[] var129 = new boolean[7];
      f21000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f21000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f21000[2] = (boolean)((1 | -1) >>> 31);
      f21000[3] = (boolean)((0 | -0) >>> 31);
      f21000[4] = (boolean)((0 | -0) >>> 31);
      f21000[5] = (boolean)((0 | -0) >>> 31);
      f21000[6] = (boolean)((1 | -1) >>> 31);
      boolean[] var130 = new boolean[2];
      f5000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f5000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      boolean[] var131 = new boolean[8];
      f8000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f8000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f8000[2] = (boolean)((1 | -1) >>> 31);
      f8000[3] = (boolean)((0 | -0) >>> 31);
      f8000[4] = (boolean)((0 | -0) >>> 31);
      f8000[5] = (boolean)((1 | -1) >>> 31);
      f8000[6] = (boolean)((0 | -0) >>> 31);
      f8000[7] = (boolean)((1 | -1) >>> 31);
   }

   public static NCs m84000() {
      if ((NNNwS)((NNuU)f13000[f14000[2]]).T[f14000[3]] != null && (NNNZg)((NNuU)f13000[f14000[4]]).T[f14000[5]] != null) {
         NSy var0 = ((NNNZg)((NNuU)f13000[f14000[6]]).T[f14000[7]]).method_8428();
         NCs var1 = null;
         NCc var2 = var0.y(((NNNwS)((NNuU)f13000[f9000[0]]).T[f9000[1]]).method_5820());
         if (var2 != null) {
            int var3 = var2.P().y();
            if (var3 >= 0) {
               var1 = var0.N(NNNFv.values()[f6000[2] + var3]);
            }
         }

         return var1 != null ? var1 : var0.N(NNNFv.values()[f8000[5]]);
      } else {
         return null;
      }
   }
}

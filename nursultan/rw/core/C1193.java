package rw.core;

import KDFzREm.NAN;
import KDFzREm.NKi;
import KDFzREm.NNNG;
import KDFzREm.NNNNRZ;
import KDFzREm.NNNNiX;
import KDFzREm.NNNNug;
import KDFzREm.NNNNur;
import KDFzREm.NNNNux;
import KDFzREm.NNNbw;
import KDFzREm.NNNqL;
import KDFzREm.NNNqi;
import KDFzREm.NNNwS;
import KDFzREm.NNpQ;
import KDFzREm.NNuU;
import KDFzREm.NOl;
import KDFzREm.NQo;
import KDFzREm.NYO;
import KDFzREm.Nal;
import KDFzREm.NbQ;
import KDFzREm.Nbw;
import KDFzREm.Nbx;
import KDFzREm.NgZ;
import KDFzREm.Ngs;
import KDFzREm.ON;
import KDFzREm.gs;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C1193 {
   private static String[] f1000;
   private static byte[] f2000;
   public static Object[] f3000;
   private static boolean[] f4000;
   private static short[] f5000;
   private static boolean[] f6000;
   private static float[] f7000;
   private static boolean[] f8000;
   private static boolean[] f9000;
   private static boolean[] f10000;

   public static List<NAN> m6000(NQo var0) {
      NNNNur var1 = (NNNNur)var0.y().method_58694(NNNNRZ.W);
      return var1 == null ? Collections.emptyList() : var1.N().stream().filter(var0x -> !var0x.getString().isBlank() ? f9000[1] : f9000[2]).toList();
   }

   private static void m8000() {
      f3000 = new Object[f4000[5]];
   }

   public static float m10000(NQo var0) {
      return (float)(var0.s() - var0.P()) / var0.s() * f7000[0];
   }

   private C1193() {
      throw new UnsupportedOperationException(f1000[0]);
   }

   static {
      ntfClinit();
   }

   public static NOl m12000(NQo var0) {
      return (NOl)var0.a_(NNNNRZ.h, NOl.N);
   }

   public static int m14000(NQo var0) {
      int var1 = f10000[0];
      var1 = m54000(var1, NNNqL.B.N(var0.B()));
      return m54000(var1, m60000(var0.w() != null ? var0.w().getString() : (!var0.k().getString().isEmpty() ? var0.k().getString() : var0.B().z())));
   }

   private static void m16000() {
      short[] var128 = new short[6];
      f5000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f5000[(1 | -1) >>> 31] = 4;
      f5000[2] = (short)((0 | -0) >>> 31);
      f5000[3] = 4;
      f5000[4] = (short)((0 | -0) >>> 31);
      f5000[5] = 4;
   }

   public static List<NQo> m18000(NQo var0) {
      if (!m32000(var0)) {
         return Collections.emptyList();
      } else {
         NNNNux var1 = (NNNNux)var0.y().method_58694(NNNNRZ.NG);
         if (var1 == null) {
            return Collections.emptyList();
         } else {
            return var1.y().allMatch(NQo::R) ? Collections.emptyList() : var1.y().toList();
         }
      }
   }

   public static boolean m22000(NQo var0) {
      return var0.B().R().N(NNNNRZ.d);
   }

   public static int m24000(NQo var0) {
      ON var1 = (ON)var0.method_58694(NNNNRZ.w);
      return var1 != null ? var1.N() : f6000[4];
   }

   public static boolean m26000(NQo var0) {
      return !var0.y().N(NNNNRZ.O) && !var0.y().N(NNNNRZ.g) ? f8000[3] : f8000[2];
   }

   private static void m30000() {
      f1000 = new String[(1 | -1) >>> 31];
      f1000[(0 | -0) >>> 31] = "This is a utility class and cannot be instantiated";
   }

   public static boolean m32000(NQo var0) {
      return var0.B() instanceof NYO var1 && var1.L() instanceof Nal ? f6000[0] : f6000[1];
   }

   private static void m38000() {
      float[] var128 = new float[3];
      f7000[(0 | -0) >>> 31] = Float.intBitsToFloat(1120403456);
      f7000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
      f7000[2] = Float.intBitsToFloat(0);
   }

   public static List<String> m40000(NQo var0) {
      NNNNur var1 = (NNNNur)var0.y().method_58694(NNNNRZ.W);
      return var1 == null
         ? Collections.emptyList()
         : var1.N().stream().<String>map(NAN::getString).filter(var0x -> !var0x.isBlank() ? f4000[0] : f4000[1]).toList();
   }

   public static int m42000(NQo var0, NNpQ<NgZ> var1) {
      NNNbw var2 = m44000(var1);
      return var2 == null ? f8000[1] : Ngs.N(var2, var0);
   }

   public static NNNbw<NgZ> m44000(NNpQ<NgZ> var0) {
      return (NNNbw<NgZ>)((NNNwS)((NNuU)f3000[f5000[0]]).T[f5000[1]]).method_56673().N(NNNqi.yR).N(var0).orElse(null);
   }

   public static boolean m46000(NQo var0, Nbx var1) {
      gs var2 = (gs)var0.method_58694(NNNNRZ.o);
      return var2 != null && var2.y() == var1 ? f6000[2] : f6000[3];
   }

   @SafeVarargs
   public static boolean m50000(NQo var0, NNNbw<Nbw>... var1) {
      NOl var2 = m12000(var0);
      return Arrays.stream(var1).allMatch(var1x -> {
         for (NbQ var3 : var2.N()) {
            if (var3.L().N(var1x)) {
               return f4000[2];
            }
         }

         return f4000[3];
      });
   }

   private static void m52000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = 31;
   }

   private static int m54000(int var0, int var1) {
      return var0 * f2000[0] + var1;
   }

   public static int m56000(NQo var0) {
      if (var0.R()) {
         return f10000[4];
      } else {
         float var1 = f7000[1];
         if ((NNNwS)((NNuU)f3000[f5000[2]]).T[f5000[3]] != null) {
            var1 = ((NNNwS)((NNuU)f3000[f5000[4]]).T[f5000[5]]).method_7357().N(var0, f7000[2]);
         }

         int var2 = m72000(var0);
         var2 = m54000(var2, var0.c());
         var2 = m54000(var2, Float.floatToIntBits(var1));
         return m54000(var2, var0.P());
      }
   }

   private static int m60000(Object var0) {
      return var0 == null ? f9000[0] : var0.hashCode();
   }

   public static boolean m64000(NQo var0, String var1) {
      if (var0.R()) {
         return f6000[5];
      } else {
         NNNNug var2 = (NNNNug)var0.y().method_58694(NNNNRZ.y);
         return var2 == null ? f8000[0] : var2.y().y(var1);
      }
   }

   public static NKi m66000(String var0) {
      return (NKi)NNNqL.i.N(NNNG.y(var0));
   }

   private static void m70000() {
      boolean[] var128 = new boolean[6];
      f6000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f6000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f6000[2] = (boolean)((1 | -1) >>> 31);
      f6000[3] = (boolean)((0 | -0) >>> 31);
      f6000[4] = (boolean)((0 | -0) >>> 31);
      f6000[5] = (boolean)((0 | -0) >>> 31);
      boolean[] var129 = new boolean[4];
      f8000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f8000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f8000[2] = (boolean)((1 | -1) >>> 31);
      f8000[3] = (boolean)((0 | -0) >>> 31);
      boolean[] var130 = new boolean[5];
      f10000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f10000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f10000[2] = (boolean)((1 | -1) >>> 31);
      f10000[3] = (boolean)((0 | -0) >>> 31);
      f10000[4] = (boolean)((0 | -0) >>> 31);
      boolean[] var131 = new boolean[3];
      f9000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f9000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f9000[2] = (boolean)((0 | -0) >>> 31);
      boolean[] var132 = new boolean[6];
      f4000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[2] = (boolean)((1 | -1) >>> 31);
      f4000[3] = (boolean)((0 | -0) >>> 31);
      f4000[4] = (boolean)((0 | -0) >>> 31);
      f4000[5] = (boolean)((1 | -1) >>> 31);
   }

   public static int m72000(NQo var0) {
      NNNNiX var1 = var0.y();
      int var2 = f10000[1];
      var2 = m54000(var2, NNNqL.B.N(var0.B()));
      var2 = m54000(var2, m60000(var1.method_58694(NNNNRZ.E)));
      var2 = m54000(var2, m60000(var1.method_58694(NNNNRZ.j)));
      var2 = m54000(var2, m60000(var1.method_58694(NNNNRZ.F)));
      var2 = m54000(var2, m60000(var1.method_58694(NNNNRZ.Nn)));
      var2 = m54000(var2, m60000(var1.method_58694(NNNNRZ.y)));
      var2 = m54000(var2, m60000(var1.method_58694(NNNNRZ.Nv)));
      var2 = m54000(var2, m60000(var1.method_58694(NNNNRZ.Nu)));
      var2 = m54000(var2, m60000(var1.method_58694(NNNNRZ.Nt)));
      var2 = m54000(var2, m60000(var1.method_58694(NNNNRZ.h)));
      var2 = m54000(var2, m60000(var1.method_58694(NNNNRZ.Nb)));
      var2 = m54000(var2, m60000(var1.method_58694(NNNNRZ.f)));
      var2 = m54000(var2, m60000(var1.method_58694(NNNNRZ.C)));
      var2 = m54000(var2, m60000(var1.method_58694(NNNNRZ.S)));
      var2 = m54000(var2, m60000(var1.method_58694(NNNNRZ.A)));
      var2 = m54000(var2, m60000(var1.method_58694(NNNNRZ.NZ)));
      var2 = m54000(var2, m60000(var1.method_58694(NNNNRZ.NP)));
      var2 = m54000(var2, m60000(var1.method_58694(NNNNRZ.x)));
      var2 = m54000(var2, m60000(var1.method_58694(NNNNRZ.D)));
      var2 = m54000(var2, m60000(var1.method_58694(NNNNRZ.Ns)));
      var2 = m54000(var2, m60000(var1.method_58694(NNNNRZ.NR)));
      var2 = m54000(var2, m60000(var1.method_58694(NNNNRZ.NM)));
      return m54000(var2, m60000(Integer.valueOf(var0.Q() ? f10000[2] : f10000[3])));
   }
}

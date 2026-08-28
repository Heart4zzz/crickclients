package rw.core;

import KDFzREm.NCU;
import KDFzREm.NCa;
import KDFzREm.NHS;
import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNPy;
import KDFzREm.NNWE;
import KDFzREm.NNnC;
import KDFzREm.NNnS;
import KDFzREm.NNnf;
import KDFzREm.NNtL;
import KDFzREm.NNty;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import KDFzREm.NbK;
import KDFzREm.NcB;
import KDFzREm.NcZ;
import KDFzREm.Ned;
import KDFzREm.Nef;
import KDFzREm.NgI;
import KDFzREm.Nwp;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import rw.NursultanClient;
import rw.module.Module005;

public class C1176 {
   private static short[] f1000;
   private static short[] f2000;
   private static double[] f3000;
   private static boolean[] f4000;
   private static short[] f5000;
   private static short[] f6000;
   public static Object[] f7000;
   private static String[] f8000;
   private static short[] f9000;
   private static float[] f10000;
   private static short[] f11000;
   private static boolean[] f12000;

   private static void m2000() {
      f7000 = new Object[f4000[6]];
   }

   private C1176() {
      throw new UnsupportedOperationException(f8000[0]);
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      float[] var128 = new float[6];
      f10000[(0 | -0) >>> 31] = Float.intBitsToFloat(1065353216);
      f10000[(1 | -1) >>> 31] = Float.intBitsToFloat(1065353216);
      f10000[2] = Float.intBitsToFloat(1065353216);
      f10000[3] = Float.intBitsToFloat(1065353216);
      f10000[4] = Float.intBitsToFloat(1065353216);
      f10000[5] = Float.intBitsToFloat(1065353216);
   }

   private static void m12000() {
      f8000 = new String[(1 | -1) >>> 31];
      f8000[(0 | -0) >>> 31] = "This is a utility class and cannot be instantiated";
   }

   public static Optional<NXi> m14000(NXi var0, NXi var1, NbK var2) {
      NHS var3 = var2.method_5829().M(var2.method_5871());
      return var3.u(var0) ? Optional.of(var0) : var3.y(var0, var1);
   }

   private static void m20000() {
      boolean[] var128 = new boolean[3];
      f12000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f12000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f12000[2] = (boolean)((1 | -1) >>> 31);
      boolean[] var129 = new boolean[7];
      f4000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[2] = (boolean)((0 | -0) >>> 31);
      f4000[3] = (boolean)((0 | -0) >>> 31);
      f4000[4] = (boolean)((1 | -1) >>> 31);
      f4000[5] = (boolean)((0 | -0) >>> 31);
      f4000[6] = (boolean)((1 | -1) >>> 31);
   }

   private static NNtL m22000(NbK var0, Predicate<NbK> var1, NXi var2, NXi var3, double var4, double var6) {
      NXi var8 = var3.y(var2.M * var4, var2.B * var4, var2.Z * var4);
      float var9 = f10000[4];
      NHS var10 = var0.method_5829().y(var2.L(var4)).L(var9, var9, var9);
      return Nwp.N(var0, var3, var8, var10, var1, var6);
   }

   public static boolean m26000(NXi var0, NXi var1, NHS var2) {
      return var2.u(var0) ? f4000[1] : var2.y(var0, var1).isEmpty();
   }

   public static NNty m28000(NNnf var0) {
      return m34000(var0, (var0x, var1) -> f4000[4]);
   }

   public static NcB m30000(NbK var0, C0983 var1, double var2, boolean var4, Predicate<NbK> var5) {
      return m52000(var0, var1.m38000(), var1.m68000(), var2, var4, var5);
   }

   public static NcB m32000(NbK var0, double var1, boolean var3, Predicate<NbK> var4) {
      return m58000(var0, var0.method_5828(f10000[0]), var1, var3, var4);
   }

   public static NNty m34000(NNnf var0, BiPredicate<NCa, Ned> var1) {
      return (NNty)NgI.N(var0.y(), var0.N(), var0, (var1x, var2) -> {
         NCa var3 = ((NNNZg)((NNuU)f7000[f11000[7]]).T[f5000[0]]).method_8320(var2);
         NNPy var4 = ((NNNZg)((NNuU)f7000[f5000[1]]).T[f9000[0]]).method_8316(var2);
         NXi var5 = var1x.y();
         NXi var6 = var1x.N();
         boolean var7 = var1.test(var3, var2);
         Module005 var8 = Module005.m16000(var3, var2);
         NursultanClient.m8000().m12000(var8);
         if (var8.y()) {
            var7 = f4000[3];
         }

         NCU var9 = var1x.N(var3, (NNNZg)((NNuU)f7000[f9000[1]]).T[f9000[2]], var2);
         NNty var10 = ((NNNZg)((NNuU)f7000[f9000[3]]).T[f9000[4]]).N(var5, var6, var2, var9, var3);
         NCU var11 = var1x.N(var4, (NNNZg)((NNuU)f7000[f9000[5]]).T[f9000[6]], var2);
         NNty var12 = var11.method_1092(var5, var6, var2);
         double var13 = var10 == null ? f3000[0] : var5.M(var10.y());
         double var15 = var12 == null ? f3000[1] : var5.M(var12.y());
         return var13 <= var15 && var7 ? var10 : var12;
      }, var0x -> {
         NXi var1x = var0x.y().u(var0x.N());
         return NNty.N(var0x.N(), Nef.N(var1x.M, var1x.B, var1x.Z), Ned.method_49638(var0x.N()));
      });
   }

   public static boolean m40000(C0983 var0, double var1, NNnS var3, NNnC var4) {
      NXi var5 = ((NNNwS)((NNuU)f7000[f6000[4]]).T[f6000[5]]).method_5631(var0.m68000(), var0.m38000());
      NXi var6 = ((NNNwS)((NNuU)f7000[f6000[6]]).T[f1000[0]]).method_33571();
      NXi var7 = var5.L(var1).i(var6);
      return ((NNNZg)((NNuU)f7000[f1000[1]]).T[f1000[2]]).N(new NNnf(var6, var7, var3, var4, (NNNwS)((NNuU)f7000[f2000[0]]).T[f2000[1]])).N() == NcZ.field_1333
         ? f12000[2]
         : f4000[0];
   }

   private static NNtL m42000(NbK var0, Predicate<NbK> var1, NXi var2, double var3, double var5) {
      return m22000(var0, var1, var0.method_5828(f10000[5]), var2, var3, var5);
   }

   public static boolean m46000(NXi var0, NXi var1, NNnS var2, NNnC var3) {
      return m28000(new NNnf(var0, var1, var2, var3, (NNNwS)((NNuU)f7000[f6000[2]]).T[f6000[3]])).N() == NcZ.field_1333 ? f12000[0] : f12000[1];
   }

   private static void m48000() {
      double[] var128 = new double[2];
      f3000[(0 | -0) >>> 31] = Double.longBitsToDouble(9218868437227405311L);
      f3000[(1 | -1) >>> 31] = Double.longBitsToDouble(9218868437227405311L);
   }

   public static boolean m50000(NXi var0, NNnS var1, NNnC var2) {
      return m46000(((NNNwS)((NNuU)f7000[f6000[0]]).T[f6000[1]]).method_33571(), var0, var1, var2);
   }

   public static NcB m52000(NbK var0, float var1, float var2, double var3, boolean var5, Predicate<NbK> var6) {
      return m58000(var0, var0.method_5631(var2, var1), var3, var5, var6);
   }

   public static boolean m54000(NXi var0, NXi var1, NbK var2) {
      return m26000(var0, var1, var2.method_5829().M(var2.method_5871()));
   }

   private static NcB m56000(NcB var0, NXi var1, double var2) {
      NXi var4 = var0.y();
      if (!var4.N(var1, var2)) {
         NXi var5 = var0.y();
         Nef var6 = Nef.N(var5.M - var1.M, var5.B - var1.B, var5.Z - var1.Z);
         return NNty.N(var5, var6, Ned.method_49638(var5));
      } else {
         return var0;
      }
   }

   public static NcB m58000(NbK var0, NXi var1, double var2, boolean var4, Predicate<NbK> var5) {
      return m68000(var0, var0.method_5836(f10000[1]), var1, var2, var4, var5);
   }

   public static boolean m60000(C0983 var0, double var1, NbK var3) {
      NXi var4 = ((NNNwS)((NNuU)f7000[f2000[2]]).T[f11000[0]]).method_5631(var0.m68000(), var0.m38000());
      NXi var5 = ((NNNwS)((NNuU)f7000[f11000[1]]).T[f11000[2]]).method_33571();
      NXi var6 = var4.L(var1);
      return m54000(var5, var5.i(var6), var3);
   }

   public static boolean m62000(C0983 var0, double var1, NHS var3) {
      NXi var4 = ((NNNwS)((NNuU)f7000[f11000[3]]).T[f11000[4]]).method_5631(var0.m68000(), var0.m38000());
      NXi var5 = ((NNNwS)((NNuU)f7000[f11000[5]]).T[f11000[6]]).method_33571();
      NXi var6 = var4.L(var1);
      return m26000(var5, var5.i(var6), var3);
   }

   private static NcB m66000(NbK var0, double var1, Predicate<NbK> var3) {
      double var4 = var1;
      double var6 = NNWE.E(var1);
      NXi var8 = var0.method_5836(f10000[2]);
      NcB var9 = var0.method_5745(var1, f10000[3], f4000[2]);
      double var10 = var9.y().M(var8);
      if (var9.N() != NcZ.field_1333) {
         var6 = var10;
         var4 = Math.sqrt(var10);
      }

      NNtL var12 = m42000(var0, var3, var8, var4, var6);
      return var12 != null && var12.y().M(var8) < var10 ? m56000(var12, var8, var1) : m56000(var9, var8, var1);
   }

   public static NcB m68000(NbK var0, NXi var1, NXi var2, double var3, boolean var5, Predicate<NbK> var6) {
      if (var5) {
         return m66000(var0, var3, var6);
      } else {
         double var7 = NNWE.E(var3);
         NNtL var9 = m22000(var0, var6, var2, var1, var3, var7);
         return var9 == null ? null : m56000(var9, var1, var3);
      }
   }

   private static void m72000() {
      short[] var128 = new short[7];
      f6000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f6000[(1 | -1) >>> 31] = 4;
      f6000[2] = (short)((0 | -0) >>> 31);
      f6000[3] = 4;
      f6000[4] = (short)((0 | -0) >>> 31);
      f6000[5] = 4;
      f6000[6] = (short)((0 | -0) >>> 31);
      short[] var129 = new short[3];
      f1000[(0 | -0) >>> 31] = 4;
      f1000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[2] = 3;
      short[] var130 = new short[3];
      f2000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = 4;
      f2000[2] = (short)((0 | -0) >>> 31);
      short[] var131 = new short[8];
      f11000[(0 | -0) >>> 31] = 4;
      f11000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f11000[2] = 4;
      f11000[3] = (short)((0 | -0) >>> 31);
      f11000[4] = 4;
      f11000[5] = (short)((0 | -0) >>> 31);
      f11000[6] = 4;
      f11000[7] = (short)((0 | -0) >>> 31);
      short[] var132 = new short[2];
      f5000[(0 | -0) >>> 31] = 3;
      f5000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      short[] var133 = new short[7];
      f9000[(0 | -0) >>> 31] = 3;
      f9000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f9000[2] = 3;
      f9000[3] = (short)((0 | -0) >>> 31);
      f9000[4] = 3;
      f9000[5] = (short)((0 | -0) >>> 31);
      f9000[6] = 3;
   }
}

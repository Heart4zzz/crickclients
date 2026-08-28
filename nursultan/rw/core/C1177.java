package rw.core;

import KDFzREm.NHS;
import KDFzREm.NNNwS;
import KDFzREm.NNWE;
import KDFzREm.NNnC;
import KDFzREm.NNnS;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import KDFzREm.NbK;
import KDFzREm.NcV;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class C1177 {
   private static boolean[] f1000;
   private static boolean[] f2000;
   private static boolean[] f3000;
   private static boolean[] f4000;
   private static boolean[] f5000;
   private static boolean[] f6000;
   private static boolean[] f7000;
   private static double[] f8000;
   public static Object[] f9000;
   private static boolean[] f10000;
   private static boolean[] f11000;
   private static boolean[] f12000;
   private static byte[] f13000;
   private static double[] f14000;
   private static double[] f15000;
   private static String[] f16000;
   private static boolean[] f17000;
   private static boolean[] f18000;
   private static boolean[] f19000;
   private static boolean[] f20000;
   private static boolean[] f21000;
   private static short[] f22000;
   private static double[] f23000;
   private static boolean[] f24000;
   private static boolean[] f25000;
   private static boolean[] f26000;
   private static byte[] f27000;
   private static double[] f28000;
   private static byte[] f29000;
   private static boolean[] f30000;
   private static boolean[] f31000;
   private static boolean[] f32000;

   private static void m2000() {
      byte[] var128 = new byte[7];
      f13000[(0 | -0) >>> 31] = 10;
      f13000[(1 | -1) >>> 31] = 10;
      f13000[2] = 10;
      f13000[3] = 2;
      f13000[4] = 2;
      f13000[5] = 2;
      f13000[6] = 2;
      byte[] var129 = new byte[7];
      f27000[(0 | -0) >>> 31] = 4;
      f27000[(1 | -1) >>> 31] = 2;
      f27000[2] = 4;
      f27000[3] = 2;
      f27000[4] = 2;
      f27000[5] = 2;
      f27000[6] = 2;
      byte[] var130 = new byte[6];
      f29000[(0 | -0) >>> 31] = 3;
      f29000[(1 | -1) >>> 31] = 2;
      f29000[2] = 2;
      f29000[3] = 2;
      f29000[4] = 8;
      f29000[5] = 2;
   }

   private C1177() {
      throw new UnsupportedOperationException(f16000[0]);
   }

   static {
      ntfClinit();
   }

   private static void m14000() {
      short[] var128 = new short[8];
      f22000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f22000[(1 | -1) >>> 31] = 4;
      f22000[2] = (short)((0 | -0) >>> 31);
      f22000[3] = 4;
      f22000[4] = (short)((0 | -0) >>> 31);
      f22000[5] = 4;
      f22000[6] = (short)((0 | -0) >>> 31);
      f22000[7] = 4;
   }

   private static void m20000() {
      f9000 = new Object[f29000[5]];
      f9000[f12000[4]] = f15000[5];
   }

   private static void m26000() {
      f16000 = new String[(1 | -1) >>> 31];
      f16000[(0 | -0) >>> 31] = "This is a utility class and cannot be instantiated";
   }

   public static NXi m30000(NbK var0, boolean var1, double var2) {
      return m44000(var0, C0989.m28000(), var1, var2, var0x -> var0x.B(f15000[4]));
   }

   private static double m32000(C0983 var0, NXi var1) {
      NcV var2 = C0989.m26000(var0, var1).m4000();
      return var2.z * var2.z + var2.U * var2.U;
   }

   private static NXi m36000(NXi var0, NXi var1, NXi var2, double var3) {
      NXi var5 = var1.u(var0);
      double var6 = var5.y(var5);
      if (var6 < f14000[5]) {
         return var1;
      } else {
         NXi var8 = var0.u(var2);
         double var9 = f28000[0] * var8.y(var5);
         double var11 = var8.y(var8) - var3 * var3;
         double var13 = var9 * var9 - f28000[1] * var6 * var11;
         if (var13 < f28000[2]) {
            return var1;
         } else {
            double var15 = (-var9 - Math.sqrt(var13)) / (f28000[3] * var6);
            return var0.i(var5.L(NNWE.N(var15, f28000[4], f28000[5])));
         }
      }
   }

   private static void m38000(List<NXi> var0, NbK var1, NXi var2, double var3) {
      NXi var5 = ((NNNwS)((NNuU)f9000[f22000[4]]).T[f22000[5]]).method_33571();
      NXi var6 = C0989.m30000(var2).m28000().L(var3).i(var5);
      if (!C1176.m54000(var5, var6, var1)) {
         var0.add(var2);
      }
   }

   private static void m40000() {
      double[] var128 = new double[4];
      f23000[(0 | -0) >>> 31] = Double.longBitsToDouble(4576918229304087675L);
      f23000[(1 | -1) >>> 31] = Double.longBitsToDouble(4587366580439587226L);
      f23000[2] = Double.longBitsToDouble(4587366580439587226L);
      f23000[3] = Double.longBitsToDouble(4547007122018943789L);
      double[] var129 = new double[6];
      f14000[(0 | -0) >>> 31] = Double.longBitsToDouble(4517329193108106637L);
      f14000[(1 | -1) >>> 31] = Double.longBitsToDouble(0L);
      f14000[2] = Double.longBitsToDouble(9218868437227405311L);
      f14000[3] = Double.longBitsToDouble(4587366580439587226L);
      f14000[4] = Double.longBitsToDouble(0L);
      f14000[5] = Double.longBitsToDouble(4472406533629990549L);
      double[] var130 = new double[8];
      f28000[(0 | -0) >>> 31] = Double.longBitsToDouble(4611686018427387904L);
      f28000[(1 | -1) >>> 31] = Double.longBitsToDouble(4616189618054758400L);
      f28000[2] = Double.longBitsToDouble(0L);
      f28000[3] = Double.longBitsToDouble(4611686018427387904L);
      f28000[4] = Double.longBitsToDouble(0L);
      f28000[5] = Double.longBitsToDouble(4607182418800017408L);
      f28000[6] = Double.longBitsToDouble(4587366580439587226L);
      f28000[7] = Double.longBitsToDouble(4611686018427387904L);
      double[] var131 = new double[3];
      f8000[(0 | -0) >>> 31] = Double.longBitsToDouble(4603741974828149072L);
      f8000[(1 | -1) >>> 31] = Double.longBitsToDouble(0L);
      f8000[2] = Double.longBitsToDouble(4607182418800017408L);
      double[] var132 = new double[6];
      f15000[(0 | -0) >>> 31] = Double.longBitsToDouble(4602678819172646912L);
      f15000[(1 | -1) >>> 31] = Double.longBitsToDouble(4576918229304087675L);
      f15000[2] = Double.longBitsToDouble(4576918229304087675L);
      f15000[3] = Double.longBitsToDouble(4576918229304087675L);
      f15000[4] = Double.longBitsToDouble(4576918229304087675L);
      f15000[5] = Double.longBitsToDouble(4587366580439587226L);
   }

   private static void m42000(List<NXi> var0, NXi var1, NHS var2, int var3, double var4, double var6) {
      double[] var8;
      double[] var9;
      if (var3 == 0) {
         var8 = m54000(var2.y, var2.i);
         var9 = m54000(var2.L, var2.R);
      } else if (var3 == f18000[7]) {
         var8 = m54000(var2.N, var2.u);
         var9 = m54000(var2.L, var2.R);
      } else {
         var8 = m54000(var2.N, var2.u);
         var9 = m54000(var2.y, var2.i);
      }

      byte var10 = f27000[0];

      for (int var11 = f4000[0]; var11 < var10; var11++) {
         double var12 = var8[f4000[1]] + (var8[f4000[2]] - var8[f2000[0]]) * var11 / (var10 - f2000[1]);

         for (int var14 = f2000[2]; var14 < var10; var14++) {
            double var15 = var9[f2000[3]] + (var9[f2000[4]] - var9[f2000[5]]) * var14 / (var10 - f2000[6]);
            NXi var17 = m62000(var3, var4, var12, var15);
            NXi var18 = m66000(var17, var1, var3, var4, var8, var9, var6);
            m76000(var0, var1, var18);
         }
      }
   }

   public static NXi m44000(NbK var0, C0983 var1, boolean var2, double var3, Function<NHS, NHS> var5) {
      ArrayList var6 = new ArrayList();
      NHS var7 = (NHS)var5.apply(var0.method_5829());
      byte var8 = f13000[0];
      byte var9 = f13000[1];
      byte var10 = f13000[2];
      double var11 = var7.L() / var8;
      double var13 = var7.y() / var9;
      double var15 = var7.u() / var10;
      NXi var17 = ((NNNwS)((NNuU)f9000[f22000[2]]).T[f22000[3]]).method_33571();
      double var18 = var17.L();
      double var20 = var17.N();
      double var22 = var17.y();
      boolean var24 = var20 >= var7.N && var20 < var7.u && var18 >= var7.L && var18 < var7.R ? f20000[0] : f20000[1];
      boolean var25 = !var24 && !(var18 > var7.R) ? f3000[0] : f20000[2];
      boolean var26 = !var24 && !(var18 < var7.L) ? f3000[2] : f3000[1];
      boolean var27 = !var24 && !(var20 > var7.u) ? f3000[4] : f3000[3];
      boolean var28 = !var24 && !(var20 < var7.N) ? f5000[0] : f3000[5];
      boolean var29 = !var24 && !(var22 > var7.i) ? f5000[2] : f5000[1];
      boolean var30 = !var24 && !(var22 < var7.y) ? f5000[4] : f5000[3];

      for (int var31 = f5000[5]; var31 <= var8; var31++) {
         double var32 = var7.y + var31 * var11;
         m38000(var6, var0, new NXi(var0.method_23317(), var32, var0.method_23321()), var3);

         for (int var34 = f5000[6]; var34 <= var9; var34++) {
            double var35 = var7.N + var34 * var13;
            if (var25) {
               NXi var37 = new NXi(var35, var32, var7.R);
               m38000(var6, var0, var37, var3);
            }

            if (var26) {
               NXi var43 = new NXi(var35, var32, var7.L);
               m38000(var6, var0, var43, var3);
            }
         }

         for (int var40 = f1000[0]; var40 <= var10; var40++) {
            double var41 = var7.L + var40 * var15;
            if (var27) {
               NXi var44 = new NXi(var7.u, var32, var41);
               m38000(var6, var0, var44, var3);
            }

            if (var28) {
               NXi var45 = new NXi(var7.N, var32, var41);
               m38000(var6, var0, var45, var3);
            }
         }
      }

      for (int var38 = f1000[1]; var38 <= var10; var38++) {
         for (int var39 = f1000[2]; var39 <= var9; var39++) {
            double var33 = var7.N + var39 * var13;
            double var42 = var7.L + var38 * var15;
            if (var30) {
               m38000(var6, var0, new NXi(var33, var7.y, var42), var3);
            }

            if (var29) {
               m38000(var6, var0, new NXi(var33, var7.i, var42), var3);
            }
         }
      }

      return m72000(var6, var1, var0.method_33571(), var2);
   }

   public static NXi m48000(NbK var0, double var1) {
      return m56000(var0, C0989.m28000(), var1, var0x -> var0x.B(f15000[2]));
   }

   private static NXi m50000(C0983 var0, NXi var1, NXi var2) {
      NXi var3 = var2.u(var1);
      double var4 = f8000[0];
      double var6 = f8000[1];
      double var8 = f8000[2];
      double var10 = var8 - var4 * (var8 - var6);
      double var12 = var6 + var4 * (var8 - var6);
      double var14 = m32000(var0, var1.i(var3.L(var10)));
      double var16 = m32000(var0, var1.i(var3.L(var12)));

      for (int var18 = f21000[4]; var18 < f29000[4]; var18++) {
         if (var14 < var16) {
            var8 = var12;
            var12 = var10;
            var16 = var14;
            var10 = var8 - var4 * (var8 - var6);
            var14 = m32000(var0, var1.i(var3.L(var10)));
         } else {
            var6 = var10;
            var10 = var12;
            var14 = var16;
            var12 = var6 + var4 * (var8 - var6);
            var16 = m32000(var0, var1.i(var3.L(var12)));
         }
      }

      NXi var25 = var1.i(var3.L((var6 + var8) * f15000[0]));
      double var19 = m32000(var0, var25);
      double var21 = m32000(var0, var1);
      if (var21 < var19) {
         var19 = var21;
         var25 = var1;
      }

      double var23 = m32000(var0, var2);
      if (var23 < var19) {
         var25 = var2;
      }

      return var25;
   }

   public static NXi m52000(NHS var0) {
      NXi var1 = ((NNNwS)((NNuU)f9000[f22000[0]]).T[f22000[1]]).method_33571();
      return new NXi(NNWE.N(var1.M, var0.N, var0.u), NNWE.N(var1.B, var0.y, var0.i), NNWE.N(var1.Z, var0.L, var0.R));
   }

   private static double[] m54000(double var0, double var2) {
      double var4 = Math.min(f28000[6], (var2 - var0) / f28000[7]);
      double[] var10000 = new double[f29000[3]];
      var10000[f21000[2]] = var0 + var4;
      var10000[f21000[3]] = var2 - var4;
      return var10000;
   }

   public static NXi m56000(NbK var0, C0983 var1, double var2, Function<NHS, NHS> var4) {
      NHS var5 = (NHS)var4.apply(var0.method_5829());
      NXi var6 = ((NNNwS)((NNuU)f9000[f22000[6]]).T[f22000[7]]).method_33571();
      double var7 = var6.N();
      double var9 = var6.y();
      double var11 = var6.L();
      boolean var13 = var7 >= var5.N && var7 < var5.u && var11 >= var5.L && var11 < var5.R ? f1000[3] : f25000[0];
      boolean var14 = !var13 && !(var7 > var5.u) ? f25000[2] : f25000[1];
      boolean var15 = !var13 && !(var7 < var5.N) ? f25000[4] : f25000[3];
      boolean var16 = !var13 && !(var9 > var5.i) ? f25000[6] : f25000[5];
      boolean var17 = !var13 && !(var9 < var5.y) ? f11000[0] : f25000[7];
      boolean var18 = !var13 && !(var11 > var5.R) ? f26000[0] : f11000[1];
      boolean var19 = !var13 && !(var11 < var5.L) ? f26000[2] : f26000[1];
      ArrayList var20 = new ArrayList();
      if (var14) {
         m60000(var20, var6, var1, var5, f26000[3], var5.u, var2);
      }

      if (var15) {
         m60000(var20, var6, var1, var5, f18000[0], var5.N, var2);
      }

      if (var16) {
         m60000(var20, var6, var1, var5, f18000[1], var5.i, var2);
      }

      if (var17) {
         m60000(var20, var6, var1, var5, f18000[2], var5.y, var2);
      }

      if (var18) {
         m60000(var20, var6, var1, var5, f13000[3], var5.R, var2);
      }

      if (var19) {
         m60000(var20, var6, var1, var5, f13000[4], var5.L, var2);
      }

      if (var20.isEmpty()) {
         if (var14) {
            m42000(var20, var6, var5, f18000[3], var5.u, var2);
         }

         if (var15) {
            m42000(var20, var6, var5, f18000[4], var5.N, var2);
         }

         if (var16) {
            m42000(var20, var6, var5, f18000[5], var5.i, var2);
         }

         if (var17) {
            m42000(var20, var6, var5, f18000[6], var5.y, var2);
         }

         if (var18) {
            m42000(var20, var6, var5, f13000[5], var5.R, var2);
         }

         if (var19) {
            m42000(var20, var6, var5, f13000[6], var5.L, var2);
         }
      }

      double var21 = (var2 - f23000[1]) * (var2 - f23000[2]) + f23000[3];
      return var20.stream()
         .min(Comparator.<NXi>comparingInt(var3 -> var3.M(var6) <= var21 ? f21000[5] : f12000[0]).thenComparingDouble(var1x -> m32000(var1, var1x)))
         .orElseGet(() -> m52000(var5));
   }

   private static void m60000(List<NXi> var0, NXi var1, C0983 var2, NHS var3, int var4, double var5, double var7) {
      NXi var9 = m70000(var1, var2, var3, var4, var5, var7);
      m76000(var0, var1, var9);
   }

   private static NXi m62000(int var0, double var1, double var3, double var5) {
      if (var0 == 0) {
         return new NXi(var1, var3, var5);
      } else {
         return var0 == f21000[1] ? new NXi(var3, var1, var5) : new NXi(var3, var5, var1);
      }
   }

   public static NXi m64000(NbK var0, C0983 var1, boolean var2, double var3) {
      return m44000(var0, var1, var2, var3, var0x -> var0x.B(f15000[3]));
   }

   private static NXi m66000(NXi var0, NXi var1, int var2, double var3, double[] var5, double[] var6, double var7) {
      double var9 = var7 - f14000[3];
      double var11 = var2 == 0 ? var1.M : (var2 == f24000[2] ? var1.B : var1.Z);
      double var13 = var3 - var11;
      double var15 = var2 == 0 ? var1.B : var1.M;
      double var17 = var2 == f29000[2] ? var1.B : var1.Z;
      NXi var19 = m62000(var2, var3, var15, var17);
      NXi var20 = m62000(var2, var3, NNWE.N(var15, var5[f24000[3]], var5[f24000[4]]), NNWE.N(var17, var6[f24000[5]], var6[f21000[0]]));
      double var21 = var9 * var9 - var13 * var13;
      if (var21 <= f14000[4]) {
         return var20;
      } else if (var0.M(var19) <= var21) {
         return var0;
      } else {
         return var20.M(var19) > var21 ? var20 : m36000(var0, var20, var19, Math.sqrt(var21));
      }
   }

   private static NXi m70000(NXi var0, C0983 var1, NHS var2, int var3, double var4, double var6) {
      double[] var8;
      double[] var9;
      if (var3 == 0) {
         var8 = m54000(var2.y, var2.i);
         var9 = m54000(var2.L, var2.R);
      } else if (var3 == f2000[7]) {
         var8 = m54000(var2.N, var2.u);
         var9 = m54000(var2.L, var2.R);
      } else {
         var8 = m54000(var2.N, var2.u);
         var9 = m54000(var2.y, var2.i);
      }

      NXi var10 = var1.m28000();
      NXi var11 = null;
      double var12 = var3 == 0 ? var10.M : (var3 == f32000[0] ? var10.B : var10.Z);
      if (Math.abs(var12) > f14000[0]) {
         double var14 = var3 == 0 ? var0.M : (var3 == f32000[1] ? var0.B : var0.Z);
         double var16 = (var4 - var14) / var12;
         if (var16 >= f14000[1]) {
            NXi var18 = var0.i(var10.L(var16));
            double var19 = var3 == 0 ? var18.B : var18.M;
            double var21 = var3 == f27000[1] ? var18.B : var18.Z;
            if (var19 >= var8[f32000[2]] && var19 <= var8[f32000[3]] && var21 >= var9[f32000[4]] && var21 <= var9[f32000[5]]) {
               var11 = var18;
            }
         }
      }

      if (var11 == null) {
         NXi var28 = m62000(var3, var4, var8[f7000[0]], var9[f7000[1]]);
         NXi var15 = m62000(var3, var4, var8[f30000[0]], var9[f30000[1]]);
         NXi var29 = m62000(var3, var4, var8[f30000[2]], var9[f30000[3]]);
         NXi var17 = m62000(var3, var4, var8[f30000[4]], var9[f17000[0]]);
         NXi[][] var10000 = new NXi[f27000[2]][];
         byte var10002 = f17000[1];
         NXi[] var10003 = new NXi[f27000[3]];
         var10003[f19000[0]] = var28;
         var10003[f19000[1]] = var15;
         var10000[var10002] = var10003;
         var10002 = f19000[2];
         var10003 = new NXi[f27000[4]];
         var10003[f6000[0]] = var15;
         var10003[f6000[1]] = var29;
         var10000[var10002] = var10003;
         var10002 = f27000[5];
         var10003 = new NXi[f27000[6]];
         var10003[f6000[2]] = var29;
         var10003[f10000[0]] = var17;
         var10000[var10002] = var10003;
         var10002 = f29000[0];
         var10003 = new NXi[f29000[1]];
         var10003[f10000[1]] = var17;
         var10003[f31000[0]] = var28;
         var10000[var10002] = var10003;
         NXi[][] var30 = var10000;
         var11 = var28;
         double var31 = f14000[2];
         NXi[][] var32 = var30;
         int var22 = var30.length;

         for (int var23 = f31000[1]; var23 < var22; var23++) {
            NXi[] var24 = var32[var23];
            NXi var25 = m50000(var1, var24[f24000[0]], var24[f24000[1]]);
            double var26 = m32000(var1, var25);
            if (var26 < var31) {
               var31 = var26;
               var11 = var25;
            }
         }
      }

      return m66000(var11, var0, var3, var4, var8, var9, var6);
   }

   private static NXi m72000(List<NXi> var0, C0983 var1, NXi var2, boolean var3) {
      return var0.stream()
         .filter(var1x -> var3 && !C1176.m50000(var1x, NNnS.field_17559, NNnC.field_1348) ? f12000[2] : f12000[1])
         .min(Comparator.<NXi>comparingDouble(var1x -> {
            double var2x = var1x.M - var2.M;
            double var4 = var1x.Z - var2.Z;
            return var2x * var2x + var4 * var4;
         }).thenComparing(var1x -> {
            NcV var2x = C0989.m26000(var1, var1x).m4000();
            return Math.hypot(var2x.z, var2x.U);
         }))
         .orElse(var2);
   }

   public static NXi m74000(NbK var0, C0983 var1, double var2) {
      return m56000(var0, var1, var2, var0x -> var0x.B(f15000[1]));
   }

   private static void m76000(List<NXi> var0, NXi var1, NXi var2) {
      if (C1176.m46000(var1, var2, NNnS.field_17559, NNnC.field_1348)) {
         var0.add(var2);
      }
   }

   public static NXi m80000(NbK var0) {
      return m52000(var0.method_5829().B(f23000[0]));
   }

   private static void m88000() {
      boolean[] var128 = new boolean[3];
      f20000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f20000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f20000[2] = (boolean)((1 | -1) >>> 31);
      boolean[] var129 = new boolean[6];
      f3000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f3000[2] = (boolean)((0 | -0) >>> 31);
      f3000[3] = (boolean)((1 | -1) >>> 31);
      f3000[4] = (boolean)((0 | -0) >>> 31);
      f3000[5] = (boolean)((1 | -1) >>> 31);
      boolean[] var130 = new boolean[7];
      f5000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f5000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f5000[2] = (boolean)((0 | -0) >>> 31);
      f5000[3] = (boolean)((1 | -1) >>> 31);
      f5000[4] = (boolean)((0 | -0) >>> 31);
      f5000[5] = (boolean)((0 | -0) >>> 31);
      f5000[6] = (boolean)((0 | -0) >>> 31);
      boolean[] var131 = new boolean[4];
      f1000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[2] = (boolean)((0 | -0) >>> 31);
      f1000[3] = (boolean)((1 | -1) >>> 31);
      boolean[] var132 = new boolean[8];
      f25000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f25000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f25000[2] = (boolean)((0 | -0) >>> 31);
      f25000[3] = (boolean)((1 | -1) >>> 31);
      f25000[4] = (boolean)((0 | -0) >>> 31);
      f25000[5] = (boolean)((1 | -1) >>> 31);
      f25000[6] = (boolean)((0 | -0) >>> 31);
      f25000[7] = (boolean)((1 | -1) >>> 31);
      boolean[] var133 = new boolean[2];
      f11000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f11000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      boolean[] var134 = new boolean[4];
      f26000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f26000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f26000[2] = (boolean)((0 | -0) >>> 31);
      f26000[3] = (boolean)((0 | -0) >>> 31);
      boolean[] var135 = new boolean[8];
      f18000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f18000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f18000[2] = (boolean)((1 | -1) >>> 31);
      f18000[3] = (boolean)((0 | -0) >>> 31);
      f18000[4] = (boolean)((0 | -0) >>> 31);
      f18000[5] = (boolean)((1 | -1) >>> 31);
      f18000[6] = (boolean)((1 | -1) >>> 31);
      f18000[7] = (boolean)((1 | -1) >>> 31);
      boolean[] var136 = new boolean[3];
      f4000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[2] = (boolean)((1 | -1) >>> 31);
      boolean[] var137 = new boolean[8];
      f2000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f2000[2] = (boolean)((0 | -0) >>> 31);
      f2000[3] = (boolean)((0 | -0) >>> 31);
      f2000[4] = (boolean)((1 | -1) >>> 31);
      f2000[5] = (boolean)((0 | -0) >>> 31);
      f2000[6] = (boolean)((1 | -1) >>> 31);
      f2000[7] = (boolean)((1 | -1) >>> 31);
      boolean[] var138 = new boolean[6];
      f32000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f32000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f32000[2] = (boolean)((0 | -0) >>> 31);
      f32000[3] = (boolean)((1 | -1) >>> 31);
      f32000[4] = (boolean)((0 | -0) >>> 31);
      f32000[5] = (boolean)((1 | -1) >>> 31);
      boolean[] var139 = new boolean[2];
      f7000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f7000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      boolean[] var140 = new boolean[5];
      f30000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f30000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f30000[2] = (boolean)((1 | -1) >>> 31);
      f30000[3] = (boolean)((1 | -1) >>> 31);
      f30000[4] = (boolean)((0 | -0) >>> 31);
      boolean[] var141 = new boolean[2];
      f17000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f17000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      boolean[] var142 = new boolean[3];
      f19000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f19000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f19000[2] = (boolean)((1 | -1) >>> 31);
      boolean[] var143 = new boolean[3];
      f6000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f6000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f6000[2] = (boolean)((0 | -0) >>> 31);
      boolean[] var144 = new boolean[2];
      f10000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f10000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      boolean[] var145 = new boolean[2];
      f31000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f31000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      boolean[] var146 = new boolean[6];
      f24000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f24000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f24000[2] = (boolean)((1 | -1) >>> 31);
      f24000[3] = (boolean)((0 | -0) >>> 31);
      f24000[4] = (boolean)((1 | -1) >>> 31);
      f24000[5] = (boolean)((0 | -0) >>> 31);
      boolean[] var147 = new boolean[6];
      f21000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f21000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f21000[2] = (boolean)((0 | -0) >>> 31);
      f21000[3] = (boolean)((1 | -1) >>> 31);
      f21000[4] = (boolean)((0 | -0) >>> 31);
      f21000[5] = (boolean)((0 | -0) >>> 31);
      boolean[] var148 = new boolean[5];
      f12000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f12000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f12000[2] = (boolean)((0 | -0) >>> 31);
      f12000[3] = (boolean)((0 | -0) >>> 31);
      f12000[4] = (boolean)((1 | -1) >>> 31);
   }
}

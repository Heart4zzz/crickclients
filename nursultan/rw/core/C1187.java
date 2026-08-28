package rw.core;

import KDFzREm.NNNZZ;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NQa;
import KDFzREm.NbL;
import KDFzREm.Nbx;
import KDFzREm.Nkq;
import java.util.function.BiConsumer;
import rw.NursultanClient;

public class C1187 {
   private static short[] f1000;
   private static boolean[] f2000;
   private static short[] f3000;
   private static short[] f4000;
   private static byte[] f5000;
   private static short[] f6000;
   private static boolean[] f7000;
   private static String[] f8000;
   public static Object[] f9000;
   private static boolean[] f10000;

   private static void m4000() {
      boolean[] var128 = new boolean[3];
      f10000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f10000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f10000[2] = (boolean)((0 | -0) >>> 31);
      boolean[] var129 = new boolean[6];
      f7000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f7000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f7000[2] = (boolean)((1 | -1) >>> 31);
      f7000[3] = (boolean)((0 | -0) >>> 31);
      f7000[4] = (boolean)((1 | -1) >>> 31);
      f7000[5] = (boolean)((0 | -0) >>> 31);
      boolean[] var130 = new boolean[5];
      f2000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f2000[2] = (boolean)((0 | -0) >>> 31);
      f2000[3] = (boolean)((0 | -0) >>> 31);
      f2000[4] = (boolean)((1 | -1) >>> 31);
   }

   private static void m6000() {
      byte[] var128 = new byte[6];
      f5000[(0 | -0) >>> 31] = 36;
      f5000[(1 | -1) >>> 31] = 40;
      f5000[2] = 40;
      f5000[3] = 8;
      f5000[4] = 36;
      f5000[5] = 40;
   }

   private C1187() {
      throw new UnsupportedOperationException(f8000[0]);
   }

   static {
      ntfClinit();
   }

   private static int m8000() {
      return ((NNNwS)((NNuU)f9000[f3000[1]]).T[f3000[2]]).method_31548().N() % f5000[3] + f2000[0];
   }

   private static void m10000() {
      f9000 = new Object[f2000[4]];
   }

   private static boolean m12000() {
      return ((NNNwS)((NNuU)f9000[f3000[3]]).T[f3000[4]]).method_6115() && ((NNNwS)((NNuU)f9000[f3000[5]]).T[f3000[6]]).method_6058() == NbL.field_5808
         ? f2000[1]
         : f2000[2];
   }

   private static void m16000() {
      short[] var128 = new short[5];
      f4000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = 4;
      f4000[2] = (short)((0 | -0) >>> 31);
      f4000[3] = 4;
      f4000[4] = (short)((0 | -0) >>> 31);
      short[] var129 = new short[3];
      f1000[(0 | -0) >>> 31] = 2;
      f1000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[2] = 4;
      short[] var130 = new short[3];
      f6000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f6000[(1 | -1) >>> 31] = 4;
      f6000[2] = (short)((0 | -0) >>> 31);
      short[] var131 = new short[7];
      f3000[(0 | -0) >>> 31] = 4;
      f3000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[2] = 4;
      f3000[3] = (short)((0 | -0) >>> 31);
      f3000[4] = 4;
      f3000[5] = (short)((0 | -0) >>> 31);
      f3000[6] = 4;
   }

   public static void m20000(Runnable var0, BiConsumer<Integer, Integer> var1, int var2) {
      boolean var3 = m12000();
      int var4 = var3 ? f5000[2] : m8000();
      NursultanClient.m60000().m38000(f10000[1], var2, var4, Nkq.field_7791).m26000(var5 -> {
         if (var3) {
            m40000(NbL.field_5810, var0);
         } else {
            C0892.m44000(var4);
            m40000(NbL.field_5808, var0);
            NursultanClient.m36000().m36000(C0892::m4000);
         }

         var1.accept(var2, var4);
      }).m24000();
   }

   public static boolean m22000() {
      return ((NNNwS)((NNuU)f9000[f6000[0]]).T[f6000[1]]).method_6118(Nbx.field_6174).B() == NQa.sT ? f7000[2] : f7000[3];
   }

   public static boolean m30000(Runnable var0) {
      NbL[] var1 = NbL.values();
      int var2 = var1.length;

      for (int var3 = f10000[2]; var3 < var2; var3++) {
         NbL var4 = var1[var3];
         if (((NNNwS)((NNuU)f9000[f4000[2]]).T[f4000[3]]).method_5998(var4).B() == NQa.GJ) {
            m40000(var4, var0);
            return f7000[0];
         }
      }

      return f7000[1];
   }

   public static void m32000(Runnable var0, BiConsumer<Integer, Integer> var1, int var2) {
      if (m12000()) {
         NursultanClient.m60000().m38000(f10000[0], var2 + f5000[0], f5000[1], Nkq.field_7791).m26000(var3 -> {
            m40000(NbL.field_5810, var0);
            var1.accept(var2 + f5000[4], Integer.valueOf(f5000[5]));
         }).m24000();
      } else {
         C0892.m44000(var2);
         m40000(NbL.field_5808, var0);
         NursultanClient.m36000().m36000(C0892::m4000);
      }
   }

   public static boolean m36000() {
      return m22000() && ((NNNwS)((NNuU)f9000[f6000[2]]).T[f3000[0]]).method_6128() ? f7000[4] : f7000[5];
   }

   public static void m40000(NbL var0, Runnable var1) {
      ((NNNZZ)((NNuU)f9000[f4000[4]]).T[f1000[0]]).N((NNNwS)((NNuU)f9000[f1000[1]]).T[f1000[2]], var0);
      var1.run();
   }

   public static void m42000(Runnable var0, BiConsumer<Integer, Integer> var1) {
      if (m22000() && ((NNNwS)((NNuU)f9000[f4000[0]]).T[f4000[1]]).method_6128()) {
         if (!m30000(var0)) {
            int var2 = IljlItp.m52000(NQa.GJ);
            if (IljlItp.m32000(var2)) {
               m32000(var0, var1, var2);
            } else if (!IljlItp.m36000(var2)) {
               m20000(var0, var1, var2);
            }
         }
      }
   }

   private static void m46000() {
      f8000 = new String[(1 | -1) >>> 31];
      f8000[(0 | -0) >>> 31] = "This is a utility class and cannot be instantiated";
   }
}

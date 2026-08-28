package rw.core;

import KDFzREm.NNNNPM;
import KDFzREm.NNNZZ;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.Nww;
import java.util.Objects;
import org.apache.logging.log4j.Logger;
import rw.NursultanClient;

public class C0892 {
   private static short[] f1000;
   public static Object[] f2000;
   private static short[] f3000;
   private static short[] f4000;
   private static short[] f5000;
   private static short[] f6000;
   private static String[] f7000;
   private static short[] f8000;
   private static short[] f9000;
   private static short[] f10000;
   private static short[] f11000;
   private static short[] f12000;

   public static void m2000(int var0) {
      Objects.requireNonNull((NNNwS)((NNuU)f2000[1]).T[4]);
      Nww var1 = ((NNNwS)((NNuU)f2000[1]).T[4]).method_31548();
      var1.N(NNNNPM.N(var0, var1.N(), Nww.L()));
   }

   public static void m4000() {
      m34000();
      m30000();
   }

   public static void m8000() {
      Integer var4 = -1;
      f2000[2] = var4;
   }

   private C0892() {
      throw new UnsupportedOperationException(f7000[1]);
   }

   static {
      ntfClinit();
   }

   private static void m12000() {
      f7000 = new String[]{"Invalid slot", "This is a utility class and cannot be instantiated"};
   }

   public static void m18000(int var0) {
      m38000(var0);
      m30000();
   }

   public static void m20000() {
      if (!IljlItp.m36000((Integer)f2000[2])) {
         Boolean var4 = true;
         f2000[3] = var4;
      }
   }

   private static void m22000() {
      f2000 = new Object[]{null, null, -1, false, false};
   }

   private static boolean m26000(int var0) {
      if (!IljlItp.m32000(var0)) {
         IllegalArgumentException var1 = new IllegalArgumentException(f7000[0]);
         ((Logger)f2000[0]).error(var1, var1);
         return (boolean)1;
      } else {
         return (boolean)0;
      }
   }

   private static void m28000() {
      f4000 = new short[]{1, 4, 1, 4, 2, 2};
      f9000 = new short[]{4, 1, 4, 1, 4, 4, 1};
      f10000 = new short[]{4, 2};
      f11000 = new short[]{1, 4};
      f6000 = new short[]{2, 2, 3, 4};
      f3000 = new short[]{4, 3, 3, 1};
      f12000 = new short[]{4, 2};
      f1000 = new short[]{1, 4, 2};
      f5000 = new short[]{2, 1, 4, 1, 4, 1, 2};
      f8000 = new short[]{1, 2, 0};
   }

   public static void m30000() {
      Objects.requireNonNull((NNNZZ)((NNuU)f2000[1]).T[2]);
      ((NNNZZ)((NNuU)f2000[1]).T[2]).i();
   }

   public static void m32000(int var0) {
      Objects.requireNonNull((NNNwS)((NNuU)f2000[1]).T[4]);
      if (!m26000(var0)) {
         Nww var1 = ((NNNwS)((NNuU)f2000[1]).T[4]).method_31548();
         if (IljlItp.m36000((Integer)f2000[2])) {
            Integer var6 = var1.N();
            f2000[2] = var6;
         }

         var1.N(var0);
         Boolean var7 = true;
         f2000[4] = var7;
      }
   }

   public static void m34000() {
      Objects.requireNonNull((NNNwS)((NNuU)f2000[1]).T[4]);
      if (!IljlItp.m36000((Integer)f2000[2])) {
         ((NNNwS)((NNuU)f2000[f11000[0]]).T[f11000[1]]).method_31548().N((Integer)f2000[2]);
         m8000();
      }
   }

   public static void m38000(int var0) {
      Objects.requireNonNull((NNNwS)((NNuU)f2000[1]).T[4]);
      if (!m26000(var0)) {
         ((NNNwS)((NNuU)f2000[1]).T[4]).method_31548().N(var0);
         Boolean var5 = true;
         f2000[4] = var5;
      }
   }

   public static void m44000(int var0) {
      m32000(var0);
      m30000();
   }

   public static void m48000() {
      NursultanClient.m36000().m36000(C0892::m30000);
   }

   public static void m52000() {
      if ((Boolean)f2000[4]) {
         Boolean var4 = false;
         f2000[4] = var4;
      } else if ((Boolean)f2000[3]) {
         Boolean var5 = false;
         f2000[3] = var5;
         if ((NNNwS)((NNuU)f2000[1]).T[4] != null && !IljlItp.m36000((Integer)f2000[2])) {
            ((NNNwS)((NNuU)f2000[1]).T[4]).method_31548().N((Integer)f2000[2]);
            m8000();
         }
      }
   }

   public static void m54000(int var0) {
      m2000(var0);
      m30000();
   }
}

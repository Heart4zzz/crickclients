package rw.core;

import KDFzREm.NcB;
import KDFzREm.NkL;

public class C0910 {
   private static short[] f1000;
   private static byte[] f2000;
   private static boolean[] f3000;
   public Object[] f4000;
   public static Object[] f5000;

   private static void m4000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = 2;
   }

   private static void m6000() {
      boolean[] var128 = new boolean[2];
      f3000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   public C0910() {
      this.m24000();
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f5000 = new Object[f3000[1]];
   }

   private static void m12000() {
      short[] var128 = new short[7];
      f1000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[2] = (short)((0 | -0) >>> 31);
      f1000[3] = (short)((1 | -1) >>> 31);
      f1000[4] = (short)((0 | -0) >>> 31);
      f1000[5] = (short)((0 | -0) >>> 31);
      f1000[6] = (short)((1 | -1) >>> 31);
   }

   public NkL m16000() {
      return (NkL)this.f4000[f1000[5]];
   }

   public static C0910 m18000(NkL var0, NcB var1) {
      ((C0910)f5000[f1000[0]]).f4000[f1000[1]] = var0;
      ((C0910)f5000[f1000[2]]).f4000[f1000[3]] = var1;
      return (C0910)f5000[f1000[4]];
   }

   public NcB m22000() {
      return (NcB)this.f4000[f1000[6]];
   }

   private void m24000() {
      if (this.f4000 == null) {
         this.f4000 = new Object[f2000[0]];
         Object[] var1 = this.f4000;
      }
   }
}

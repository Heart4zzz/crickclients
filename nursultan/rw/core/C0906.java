package rw.core;

import KDFzREm.NCa;
import KDFzREm.Ned;

public class C0906 {
   private static boolean[] f1000;
   private static short[] f2000;
   private static byte[] f3000;
   public Object[] f4000;
   public static Object[] f5000;

   private static void m4000() {
      short[] var128 = new short[7];
      f2000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[2] = (short)((0 | -0) >>> 31);
      f2000[3] = (short)((1 | -1) >>> 31);
      f2000[4] = (short)((0 | -0) >>> 31);
      f2000[5] = (short)((0 | -0) >>> 31);
      f2000[6] = (short)((1 | -1) >>> 31);
   }

   private static void m6000() {
      f5000 = new Object[f1000[1]];
   }

   public C0906() {
      this.m24000();
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      boolean[] var128 = new boolean[2];
      f1000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   private static void m12000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f3000[(0 | -0) >>> 31] = 2;
   }

   public Ned m16000() {
      return (Ned)this.f4000[f2000[5]];
   }

   public static C0906 m18000(Ned var0, NCa var1) {
      ((C0906)f5000[f2000[0]]).f4000[f2000[1]] = var0;
      ((C0906)f5000[f2000[2]]).f4000[f2000[3]] = var1;
      return (C0906)f5000[f2000[4]];
   }

   public NCa m20000() {
      return (NCa)this.f4000[f2000[6]];
   }

   private void m24000() {
      if (this.f4000 == null) {
         this.f4000 = new Object[f3000[0]];
         Object[] var1 = this.f4000;
      }
   }
}

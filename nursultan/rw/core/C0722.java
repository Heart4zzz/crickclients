package rw.core;

import KDFzREm.NbQ;
import rw.defs.Enum0053;

public class C0722 {
   public Object[] f1000;
   private static boolean[] f2000;
   public static Object[] f3000;
   private static byte[] f4000;
   private static short[] f5000;

   private static void m4000() {
      f3000 = new Object[f2000[1]];
   }

   private static void m6000() {
      boolean[] var128 = new boolean[2];
      f2000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   public C0722() {
      this.m8000();
   }

   static {
      ntfClinit();
   }

   private void m8000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[f4000[0]];
         Object[] var1 = this.f1000;
      }
   }

   private static void m12000() {
      short[] var128 = new short[7];
      f5000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f5000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f5000[2] = (short)((0 | -0) >>> 31);
      f5000[3] = (short)((1 | -1) >>> 31);
      f5000[4] = (short)((0 | -0) >>> 31);
      f5000[5] = (short)((0 | -0) >>> 31);
      f5000[6] = (short)((1 | -1) >>> 31);
   }

   public Enum0053 m16000() {
      return (Enum0053)this.f1000[f5000[6]];
   }

   public NbQ m18000() {
      return (NbQ)this.f1000[f5000[5]];
   }

   public static C0722 m22000(NbQ var0, Enum0053 var1) {
      ((C0722)f3000[f5000[0]]).f1000[f5000[1]] = var0;
      ((C0722)f3000[f5000[2]]).f1000[f5000[3]] = var1;
      return (C0722)f3000[f5000[4]];
   }

   private static void m24000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f4000[(0 | -0) >>> 31] = 2;
   }
}

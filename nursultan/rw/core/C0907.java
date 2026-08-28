package rw.core;

import KDFzREm.NAN;
import KDFzREm.NQo;
import java.util.List;

public class C0907 {
   private static short[] f1000;
   private static byte[] f2000;
   public Object[] f3000;
   private static short[] f4000;
   public static Object[] f5000;
   private static boolean[] f6000;

   private static void m4000() {
      short[] var128 = new short[4];
      f1000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[2] = (short)((0 | -0) >>> 31);
      f1000[3] = (short)((1 | -1) >>> 31);
      short[] var129 = new short[5];
      f4000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f4000[2] = (short)((1 | -1) >>> 31);
      f4000[3] = (short)((0 | -0) >>> 31);
      f4000[4] = (short)((1 | -1) >>> 31);
   }

   private static void m6000() {
      boolean[] var128 = new boolean[2];
      f6000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f6000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   public C0907() {
      this.m28000();
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = 2;
   }

   private static void m12000() {
      f5000 = new Object[f6000[1]];
   }

   public NQo m14000() {
      return (NQo)this.f3000[f4000[2]];
   }

   public C0907 m18000(List<NAN> var1) {
      this.f3000[f4000[3]] = var1;
      return this;
   }

   public C0907 m22000(NQo var1) {
      this.f3000[f4000[4]] = var1;
      return this;
   }

   public List<NAN> m24000() {
      return (List<NAN>)this.f3000[f4000[1]];
   }

   public static C0907 m26000(List<NAN> var0, NQo var1) {
      ((C0907)f5000[f1000[0]]).f3000[f1000[1]] = var0;
      ((C0907)f5000[f1000[2]]).f3000[f1000[3]] = var1;
      return (C0907)f5000[f4000[0]];
   }

   private void m28000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[f2000[0]];
         Object[] var1 = this.f3000;
      }
   }
}

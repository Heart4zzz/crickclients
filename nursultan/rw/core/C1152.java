package rw.core;

import rw.api.Iface0649;

public class C1152 implements Iface0649 {
   public Object[] f1000;
   private static short[] f2000;
   private static boolean[] f3000;
   private static byte[] f4000;

   private void m2000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[f4000[0]];
         Object[] var1 = this.f1000;
      }
   }

   public C1158<Boolean> m6000() {
      return (C1158<Boolean>)this.f1000[f2000[4]];
   }

   public C1152() {
      this.m2000();
      C1158 var5 = new C1158<>(f3000[0]);
      this.f1000[f2000[0]] = var5;
      C1158 var6 = new C1158<>(f3000[1]);
      this.f1000[f2000[1]] = var6;
      C1158 var7 = new C1158<>(f3000[2]);
      this.f1000[f2000[2]] = var7;
      C1158 var8 = new C1158<>(Integer.valueOf(f3000[3]));
      this.f1000[f2000[3]] = var8;
   }

   static {
      ntfClinit();
   }

   public C1158<Boolean> m8000() {
      return (C1158<Boolean>)this.f1000[f2000[6]];
   }

   public C1158<Boolean> m10000() {
      return (C1158<Boolean>)this.f1000[f2000[5]];
   }

   private static void m12000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f4000[(0 | -0) >>> 31] = 4;
   }

   private static void m16000() {
      short[] var128 = new short[8];
      f2000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f2000[2] = 2;
      f2000[3] = 3;
      f2000[4] = (short)((0 | -0) >>> 31);
      f2000[5] = (short)((1 | -1) >>> 31);
      f2000[6] = 2;
      f2000[7] = 3;
   }

   private static void m18000() {
      boolean[] var128 = new boolean[4];
      f3000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[2] = (boolean)((0 | -0) >>> 31);
      f3000[3] = (boolean)((0 | -0) >>> 31);
   }

   public C1158<Integer> m22000() {
      return (C1158<Integer>)this.f1000[f2000[7]];
   }
}

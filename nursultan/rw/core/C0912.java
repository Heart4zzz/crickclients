package rw.core;

import rw.data.IltrpOnqk;
import rw.defs.OlinIqIk;

public class C0912 {
   private static short[] f1000;
   private static short[] f2000;
   private static byte[] f3000;
   public Object[] f4000;
   private static short[] f5000;
   private static boolean[] f6000;
   public static Object[] f7000;

   public IltrpOnqk[] m2000() {
      return (IltrpOnqk[])this.f4000[f1000[5]];
   }

   private static void m6000() {
      f7000 = new Object[f6000[3]];
   }

   private C0912() {
      this.m10000();
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      short[] var128 = new short[4];
      f2000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[2] = (short)((0 | -0) >>> 31);
      f2000[3] = (short)((0 | -0) >>> 31);
      short[] var129 = new short[5];
      f5000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f5000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f5000[2] = (short)((0 | -0) >>> 31);
      f5000[3] = (short)((1 | -1) >>> 31);
      f5000[4] = (short)((0 | -0) >>> 31);
      short[] var130 = new short[6];
      f1000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f1000[2] = (short)((0 | -0) >>> 31);
      f1000[3] = (short)((1 | -1) >>> 31);
      f1000[4] = (short)((0 | -0) >>> 31);
      f1000[5] = (short)((1 | -1) >>> 31);
   }

   private void m10000() {
      if (this.f4000 == null) {
         this.f4000 = new Object[f3000[0]];
         Object[] var1 = this.f4000;
      }
   }

   private static void m12000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f3000[(0 | -0) >>> 31] = 2;
   }

   public OlinIqIk m16000() {
      return (OlinIqIk)this.f4000[f1000[4]];
   }

   public boolean m18000() {
      return (IltrpOnqk[])this.f4000[f1000[3]] != null ? f6000[0] : f6000[1];
   }

   public static C0912 m22000(IltrpOnqk[] var0) {
      C0912 var10000 = (C0912)f7000[f2000[0]];
      OlinIqIk var5 = (OlinIqIk)OlinIqIk.f3000[f2000[1]];
      var10000.f4000[f2000[2]] = var5;
      ((C0912)f7000[f2000[3]]).f4000[f5000[0]] = var0;
      return (C0912)f7000[f5000[1]];
   }

   public static C0912 m26000() {
      C0912 var10000 = (C0912)f7000[f5000[2]];
      OlinIqIk var4 = (OlinIqIk)OlinIqIk.f3000[f5000[3]];
      var10000.f4000[f5000[4]] = var4;
      var10000 = (C0912)f7000[f1000[0]];
      Object var5 = null;
      var10000.f4000[f1000[1]] = var5;
      return (C0912)f7000[f1000[2]];
   }

   private static void m28000() {
      boolean[] var128 = new boolean[4];
      f6000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f6000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f6000[2] = (boolean)((0 | -0) >>> 31);
      f6000[3] = (boolean)((1 | -1) >>> 31);
   }
}

package rw.core;

import org.joml.Vector3d;

public class C1160 extends C1152 {
   private static double[] f1000;
   private static byte[] f2000;
   private static short[] f3000;
   private static boolean[] f4000;
   public Object[] f5000;
   private static double[] f6000;

   public C1158<Vector3d> m2000() {
      this.m6000();
      return (C1158<Vector3d>)this.f5000[f3000[4]];
   }

   public C1160() {
      this.m6000();
      C1158 var5 = new C1158<>(new Vector3d(f1000[0], f1000[1], f1000[2]));
      this.f5000[f3000[0]] = var5;
      C1158 var6 = new C1158<>(new Vector3d(f1000[3], f1000[4], f6000[0]));
      this.f5000[f3000[1]] = var6;
      C1158 var7 = new C1158<>(new Vector3d(f6000[1], f6000[2], f6000[3]));
      this.f5000[f3000[2]] = var7;
      C1158 var8 = new C1158<>(f4000[0]);
      this.f5000[f3000[3]] = var8;
   }

   static {
      ntfClinit();
   }

   private static void m4000() {
      double[] var128 = new double[5];
      f1000[(0 | -0) >>> 31] = Double.longBitsToDouble(0L);
      f1000[(1 | -1) >>> 31] = Double.longBitsToDouble(0L);
      f1000[2] = Double.longBitsToDouble(0L);
      f1000[3] = Double.longBitsToDouble(0L);
      f1000[4] = Double.longBitsToDouble(0L);
      double[] var129 = new double[4];
      f6000[(0 | -0) >>> 31] = Double.longBitsToDouble(0L);
      f6000[(1 | -1) >>> 31] = Double.longBitsToDouble(0L);
      f6000[2] = Double.longBitsToDouble(0L);
      f6000[3] = Double.longBitsToDouble(0L);
   }

   private void m6000() {
      if (this.f5000 == null) {
         this.f5000 = new Object[f2000[0]];
         Object[] var1 = this.f5000;
      }
   }

   private static void m8000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = 4;
   }

   public C1158<Vector3d> m12000() {
      this.m6000();
      return (C1158<Vector3d>)this.f5000[f3000[6]];
   }

   public C1158<Boolean> m14000() {
      this.m6000();
      return (C1158<Boolean>)this.f5000[f3000[7]];
   }

   private static void m16000() {
      boolean[] var128 = new boolean[(1 | -1) >>> 31];
      f4000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
   }

   public C1158<Vector3d> m18000() {
      this.m6000();
      return (C1158<Vector3d>)this.f5000[f3000[5]];
   }

   private static void m22000() {
      short[] var128 = new short[8];
      f3000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f3000[2] = 2;
      f3000[3] = 3;
      f3000[4] = (short)((0 | -0) >>> 31);
      f3000[5] = (short)((1 | -1) >>> 31);
      f3000[6] = 2;
      f3000[7] = 3;
   }
}

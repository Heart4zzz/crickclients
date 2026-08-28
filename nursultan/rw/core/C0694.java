package rw.core;

import org.joml.Vector4f;

public class C0694 {
   public static Object[] f1000;
   private static short[] f2000;
   private static byte[] f3000;
   public Object[] f4000;
   private static boolean[] f5000;
   private static short[] f6000;

   private static void m2000() {
      short[] var128 = new short[7];
      f2000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[2] = (short)((0 | -0) >>> 31);
      f2000[3] = (short)((1 | -1) >>> 31);
      f2000[4] = (short)((0 | -0) >>> 31);
      f2000[5] = (short)((0 | -0) >>> 31);
      f2000[6] = (short)((1 | -1) >>> 31);
      short[] var129 = new short[2];
      f6000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f6000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
   }

   private static void m6000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f3000[(0 | -0) >>> 31] = 2;
   }

   public C0694() {
      this.m10000();
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f1000 = new Object[f5000[1]];
   }

   private void m10000() {
      if (this.f4000 == null) {
         this.f4000 = new Object[f3000[0]];
         Object[] var1 = this.f4000;
      }
   }

   public Vector4f m14000() {
      return (Vector4f)this.f4000[f6000[0]];
   }

   public C0694 m18000(Vector4f var1) {
      this.f4000[f2000[6]] = var1;
      return this;
   }

   public Vector4f m22000() {
      return (Vector4f)this.f4000[f6000[1]];
   }

   public static C0694 m24000(Vector4f var0, Vector4f var1) {
      ((C0694)f1000[f2000[0]]).f4000[f2000[1]] = var0;
      ((C0694)f1000[f2000[2]]).f4000[f2000[3]] = var1;
      return (C0694)f1000[f2000[4]];
   }

   public C0694 m26000(Vector4f var1) {
      this.f4000[f2000[5]] = var1;
      return this;
   }

   private static void m30000() {
      boolean[] var128 = new boolean[2];
      f5000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f5000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }
}

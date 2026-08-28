package rw.core;

import KDFzREm.NNIo;
import KDFzREm.NNNNEg;
import KDFzREm.NNde;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;

public class C0138 {
   private static short[] f1000;
   private static boolean[] f2000;
   private static short[] f3000;
   private static short[] f4000;
   public static Object[] f5000;
   public Object[] f6000;
   private static byte[] f7000;
   private static short[] f8000;
   private static short[] f9000;

   public NNIo m2000() {
      return (NNIo)this.f6000[f9000[2]];
   }

   private static void m6000() {
      byte[] var128 = new byte[2];
      f7000[(0 | -0) >>> 31] = 16;
      f7000[(1 | -1) >>> 31] = 6;
   }

   public C0138() {
      this.m8000();
      Matrix4fStack var5 = new Matrix4fStack(f7000[0]);
      this.f6000[f4000[0]] = var5;
   }

   static {
      ntfClinit();
   }

   private void m8000() {
      if (this.f6000 == null) {
         this.f6000 = new Object[f7000[1]];
         Object[] var1 = this.f6000;
      }
   }

   private static void m10000() {
      short[] var128 = new short[2];
      f4000[(0 | -0) >>> 31] = 5;
      f4000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      short[] var129 = new short[4];
      f3000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[2] = (short)((1 | -1) >>> 31);
      f3000[3] = (short)((0 | -0) >>> 31);
      short[] var130 = new short[3];
      f8000[(0 | -0) >>> 31] = 2;
      f8000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f8000[2] = 3;
      short[] var131 = new short[5];
      f1000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = 4;
      f1000[2] = (short)((0 | -0) >>> 31);
      f1000[3] = (short)((0 | -0) >>> 31);
      f1000[4] = (short)((1 | -1) >>> 31);
      short[] var132 = new short[4];
      f9000[(0 | -0) >>> 31] = 2;
      f9000[(1 | -1) >>> 31] = 3;
      f9000[2] = 4;
      f9000[3] = 5;
   }

   public Matrix4f m12000() {
      return (Matrix4f)this.f6000[f1000[4]];
   }

   private static void m14000() {
      f5000 = new Object[f2000[1]];
   }

   private static void m16000() {
      boolean[] var128 = new boolean[2];
      f2000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   public NNNNEg m20000() {
      return (NNNNEg)this.f6000[f9000[0]];
   }

   public NNde m24000() {
      return (NNde)this.f6000[f9000[1]];
   }

   public Matrix4f m26000() {
      return (Matrix4f)this.f6000[f1000[3]];
   }

   public static C0138 m28000(Matrix4f var0, Matrix4f var1, NNNNEg var2, NNde var3, NNIo var4) {
      ((C0138)f5000[f4000[1]]).f6000[f3000[0]] = var1;
      ((C0138)f5000[f3000[1]]).f6000[f3000[2]] = var0;
      ((C0138)f5000[f3000[3]]).f6000[f8000[0]] = var2;
      ((C0138)f5000[f8000[1]]).f6000[f8000[2]] = var3;
      ((C0138)f5000[f1000[0]]).f6000[f1000[1]] = var4;
      return (C0138)f5000[f1000[2]];
   }

   public Matrix4fStack m36000() {
      return (Matrix4fStack)this.f6000[f9000[3]];
   }
}

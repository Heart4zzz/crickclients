package rw.core;

import KDFzREm.NNNNEg;
import org.joml.Matrix4f;

public class OllkkkIrq {
   private static short[] f1000;
   public Object[] f2000;
   public static Object[] f3000;
   private static boolean[] f4000;
   private static byte[] f5000;

   public NNNNEg m4000() {
      return (NNNNEg)this.f2000[f1000[5]];
   }

   private void m6000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[f5000[0]];
         Object[] var1 = this.f2000;
      }
   }

   public OllkkkIrq() {
      this.m6000();
      Matrix4f var5 = new Matrix4f();
      this.f2000[f1000[0]] = var5;
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      short[] var128 = new short[6];
      f1000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[2] = (short)((0 | -0) >>> 31);
      f1000[3] = (short)((1 | -1) >>> 31);
      f1000[4] = (short)((0 | -0) >>> 31);
      f1000[5] = (short)((1 | -1) >>> 31);
   }

   private static void m10000() {
      f3000 = new Object[f4000[1]];
   }

   private static void m14000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f5000[(0 | -0) >>> 31] = 2;
   }

   public Matrix4f m18000() {
      return (Matrix4f)this.f2000[f1000[4]];
   }

   public void m20000(Matrix4f var1, Matrix4f var2, NNNNEg var3) {
      ((Matrix4f)this.f2000[f1000[2]]).set(var1).mul(var2).invert();
      this.f2000[f1000[3]] = var3;
   }

   public static OllkkkIrq m22000() {
      return (OllkkkIrq)f3000[f1000[1]];
   }

   private static void m26000() {
      boolean[] var128 = new boolean[2];
      f4000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }
}

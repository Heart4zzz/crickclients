package rw.core;

import rw.defs.Enum0091;

public class C1142 extends C1152 {
   public Object[] f1000;
   private static boolean[] f2000;
   private static byte[] f3000;
   private static float[] f4000;
   private static short[] f5000;
   private static short[] f6000;

   public C1158<Float> m2000() {
      this.m8000();
      return (C1158<Float>)this.f1000[f5000[6]];
   }

   public C1142() {
      this.m8000();
      C1158 var5 = new C1158<>(f4000[0]);
      this.f1000[f5000[0]] = var5;
      C1158 var6 = new C1158<>(f4000[1]);
      this.f1000[f5000[1]] = var6;
      C1158 var7 = new C1158<>((Enum0091)Enum0091.f9000[f5000[2]]);
      this.f1000[f5000[3]] = var7;
      C1158 var8 = new C1158<>(new IliIjtsr(null, f2000[0]));
      this.f1000[f5000[4]] = var8;
   }

   static {
      ntfClinit();
   }

   private static void m4000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f3000[(0 | -0) >>> 31] = 4;
   }

   private static void m6000() {
      boolean[] var128 = new boolean[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
   }

   private void m8000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[f3000[0]];
         Object[] var1 = this.f1000;
      }
   }

   @Override
   public C1158<Float> m10000() {
      this.m8000();
      return (C1158<Float>)this.f1000[f5000[5]];
   }

   public C1158<IliIjtsr> m14000() {
      this.m8000();
      return (C1158<IliIjtsr>)this.f1000[f6000[1]];
   }

   private static void m16000() {
      float[] var128 = new float[2];
      f4000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f4000[(1 | -1) >>> 31] = Float.intBitsToFloat(1017370378);
   }

   public C1158<Enum0091> m18000() {
      this.m8000();
      return (C1158<Enum0091>)this.f1000[f6000[0]];
   }

   private static void m20000() {
      short[] var128 = new short[7];
      f5000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f5000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f5000[2] = 3;
      f5000[3] = 2;
      f5000[4] = 3;
      f5000[5] = (short)((0 | -0) >>> 31);
      f5000[6] = (short)((1 | -1) >>> 31);
      short[] var129 = new short[2];
      f6000[(0 | -0) >>> 31] = 2;
      f6000[(1 | -1) >>> 31] = 3;
   }
}

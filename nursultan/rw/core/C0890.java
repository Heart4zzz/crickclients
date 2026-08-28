package rw.core;

import KDFzREm.NAN;
import KDFzREm.NNBK;
import KDFzREm.NNNG;
import KDFzREm.NNda;
import KDFzREm.NNdc;
import KDFzREm.XD;

public class C0890 extends NNdc {
   private static String[] f1000;
   private static boolean[] f2000;
   private static byte[] f3000;
   private static short[] f4000;
   public Object[] f5000;
   private static float[] f6000;

   private static void m2000() {
      byte[] var128 = new byte[3];
      f3000[(0 | -0) >>> 31] = 16;
      f3000[(1 | -1) >>> 31] = 16;
      f3000[2] = -1;
   }

   public C0890(int var1, int var2, int var3, int var4, NNNG var5, NNda var6) {
      super(var1, var2, var3, var4, NAN.y(f1000[0]), var6, field_40754);
      this.m18000();
      this.f5000[f4000[0]] = var5;
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      boolean[] var128 = new boolean[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   private static void m8000() {
      short[] var128 = new short[2];
      f4000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
   }

   private static void m14000() {
      float[] var128 = new float[2];
      f6000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f6000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
   }

   private void m18000() {
      this.f5000 = new Object[f2000[0]];
   }

   private static void m24000() {
      f1000 = new String[(1 | -1) >>> 31];
      f1000[(0 | -0) >>> 31] = m20000("");
   }

   public void method_75752(NNBK var1, int var2, int var3, float var4) {
      this.m18000();
      var1.N(
         XD.Na,
         (NNNG)this.f5000[f4000[1]],
         this.method_46426(),
         this.method_46427(),
         f6000[0],
         f6000[1],
         this.field_22758,
         this.field_22759,
         f3000[0],
         f3000[1],
         f3000[2]
      );
   }
}

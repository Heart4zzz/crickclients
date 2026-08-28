package rw.core;

import KDFzREm.NNNZg;
import KDFzREm.NNNbh;
import KDFzREm.NNtJ;

public class C0511 extends NNNbh {
   private static byte[] f1000;
   private static float[] f2000;

   public C0511(NNNZg var1, double var2, double var4, double var6, double var8, NNtJ var10) {
      super(var1, var2, var4, var6, var8, var10);
      this.field_3847 = f1000[0];
      this.field_17867 = f2000[0];
      this.method_74306(var10);
   }

   static {
      ntfClinit();
   }

   private static void m4000() {
      float[] var128 = new float[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = Float.intBitsToFloat(1069547520);
   }

   private static void m6000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f1000[(0 | -0) >>> 31] = 16;
   }
}

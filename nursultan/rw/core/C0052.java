package rw.core;

import KDFzREm.NNWE;
import KDFzREm.NXi;
import java.util.concurrent.ThreadLocalRandom;

public class C0052 {
   private static float[] f1000;

   private C0052() {
   }

   static {
      ntfClinit();
   }

   private static void m4000() {
      f1000 = new float[]{(float) (Math.PI / 180.0), (float) (Math.PI / 180.0)};
   }

   public static NXi m6000(float var0, float var1) {
      float var2 = var0 * f1000[0];
      float var3 = -var1 * f1000[1];
      float var4 = NNWE.P(var3);
      float var5 = NNWE.m(var3);
      float var6 = NNWE.P(var2);
      float var7 = NNWE.m(var2);
      return new NXi(var5 * var6, -var7, var4 * var6);
   }

   public static float m8000(double var0, double var2) {
      return var2 <= var0 ? (float)var0 : (float)(var0 + (var2 - var0) * ThreadLocalRandom.current().nextDouble());
   }
}

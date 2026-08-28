package rw.core;

import KDFzREm.NNIo;
import KDFzREm.NNNJZ;
import rw.gui.SwingAnimations;

public class C0942 extends Base0940 {
   private static float[] f1000;

   public C0942(SwingAnimations var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   static {
      ntfClinit();
   }

   private static void m2000() {
      f1000 = new float[]{0.1F, 0.0F, -0.2F, 0.5F, -0.4F, -0.82F, -80.0F, -80.0F};
   }

   public void m8000(NNIo var1, int var2, float var3, float var4, float var5, float var6, float var7) {
      var1.N(var2 * f1000[0], f1000[1], f1000[2]);
      var1.N(var2 * f1000[3], f1000[4], f1000[5]);
      var1.N(NNNJZ.u.N(var2 * 90));
      var1.N(NNNJZ.R.N(var2 * -60));
      var1.N(var2 == -1 ? NNNJZ.N.N(var2 * (f1000[6] - var5 * var3)) : NNNJZ.y.N(var2 * (f1000[7] - var5 * var3)));
   }
}

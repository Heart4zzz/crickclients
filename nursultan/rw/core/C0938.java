package rw.core;

import KDFzREm.NNIo;
import KDFzREm.NNNJZ;
import KDFzREm.NNWE;
import rw.gui.SwingAnimations;

public class C0938 extends Base0940 {
   private static float[] f1000;
   private static float[] f2000;

   public C0938(SwingAnimations var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   static {
      ntfClinit();
   }

   private static void m2000() {
      f2000 = new float[]{(float) Math.PI, (float) Math.PI, 0.56F, -0.52F, -0.72F, 45.0F};
      f1000 = new float[]{-20.0F, -20.0F, -45.0F};
   }

   @Override
   public void m6000(NNIo var1, int var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = NNWE.m(var6 * var6 * f2000[0]);
      float var9 = NNWE.m(NNWE.N(var6) * f2000[1]);
      var1.N(var2 * f2000[2], f2000[3], f2000[4]);
      var1.N(NNNJZ.u.N(var2 * (f2000[5] + var8 * f1000[0])));
      var1.N(NNNJZ.R.N(var2 * var9 * f1000[1]));
      var1.N(NNNJZ.y.N(var9 * -var5));
      var1.N(NNNJZ.u.N(var2 * f1000[2]));
   }
}

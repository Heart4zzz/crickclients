package rw.core;

import KDFzREm.NNIo;
import KDFzREm.NNNJZ;
import KDFzREm.NNWE;
import rw.gui.SwingAnimations;

public class C0944 extends Base0940 {
   private static boolean[] f1000;
   private static float[] f2000;
   private static float[] f3000;
   private static float[] f4000;
   private static float[] f5000;

   public C0944(SwingAnimations var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   static {
      ntfClinit();
   }

   private static void m2000() {
      f1000 = new boolean[]{false};
   }

   private static void m4000() {
      f3000 = new float[]{-0.4F, (float) Math.PI, 0.2F};
      f5000 = new float[]{(float) (Math.PI * 2), -0.2F, (float) Math.PI, 0.56F};
      f2000 = new float[]{-0.52F, -0.72F, (float) Math.PI, (float) Math.PI, 45.0F};
      f4000 = new float[]{-20.0F, -20.0F, -80.0F, -45.0F};
   }

   public boolean m8000() {
      return (boolean)0;
   }

   public void m12000(NNIo var1, int var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = f3000[0] * NNWE.m(NNWE.N(var6) * f3000[1]);
      float var9 = f3000[2] * NNWE.m(NNWE.N(var6) * f5000[0]);
      float var10 = f5000[1] * NNWE.m(var6 * f5000[2]);
      var1.N(var2 * var8, var9, var10);
      var1.N(var2 * f5000[3], f2000[0], f2000[1]);
      float var11 = NNWE.m(var6 * var6 * f2000[2]);
      float var12 = NNWE.m(NNWE.N(var6) * f2000[3]);
      var1.N(NNNJZ.u.N(var2 * (f2000[4] + var11 * f4000[0])));
      var1.N(NNNJZ.R.N(var2 * (var12 * f4000[1])));
      var1.N(NNNJZ.y.N(var12 * f4000[2]));
      var1.N(NNNJZ.u.N(var2 * f4000[3]));
   }
}

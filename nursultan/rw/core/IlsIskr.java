package rw.core;

import KDFzREm.NNIo;
import KDFzREm.NNNJZ;
import KDFzREm.NNuU;
import rw.NursultanClient;
import rw.gui.SwingAnimations;

public class IlsIskr extends Base0940 {
   private static float[] f1000;

   public IlsIskr(SwingAnimations var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   static {
      ntfClinit();
   }

   private static void m2000() {
      f1000 = new float[]{0.56F, -0.52F, -0.72F, 25.0F, 360.0F};
   }

   public void m8000(NNIo var1, int var2, float var3, float var4, float var5, float var6, float var7) {
      var1.N(var2 * f1000[0], f1000[1], f1000[2]);
      if ((Boolean)((SwingAnimations)this.N[0]).m12000().i()) {
         float var8 = NursultanClient.m74000().m10000() + NNuU.Nq().NK().N(true);
         float var9 = var8 * f1000[3] / var4;
         var1.N(NNNJZ.N.N(var9));
      } else {
         var1.N(NNNJZ.N.N(var6 * f1000[4]));
      }
   }
}

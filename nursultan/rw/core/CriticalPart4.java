package rw.core;

import KDFzREm.NNNYO;
import KDFzREm.NNNwS;
import KDFzREm.NNde;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import rw.gui.Critical;

public class CriticalPart4 extends OuFz {
   private static float[] f1000;
   private static double[] f2000;
   private static float[] f3000;
   private static double[] f4000;

   private static void m4000() {
      f1000 = new float[]{-90.0F, 90.0F, 3.0F, 30.0F, -2.0F, 15.0F};
      f3000 = new float[]{2.0F, 3.0F, 30.0F};
   }

   public CriticalPart4(Critical var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   static {
      ntfClinit();
   }

   private static void m2000() {
      f2000 = new double[]{0.5, 0.25};
      f4000 = new double[]{0.9, 0.25, 0.01, 0.5, 0.25, 0.9, 0.995, 0.01F};
   }

   public void m10000(Object var1) {
      if (var1 instanceof C0721) {
         if (((NNNwS)((NNuU)this.N[0]).T[4]).field_6012 % 4 == 0) {
            NNde var2 = ((NNNYO)((NNuU)this.N[0]).i[5]).s();
            float var3 = var2.R();

            for (int var4 = 0; var4 < 20; var4++) {
               float var5 = C1183.m40000(var3 + C1183.m18000(f1000[0], f1000[1]));
               double var6 = -Math.sin(var5);
               double var8 = Math.cos(var5);
               double var10 = var6 * C1183.m18000(f1000[2], f1000[3]);
               double var12 = C1183.m18000(f1000[4], f1000[5]) - f3000[0];
               double var14 = var8 * C1183.m18000(f3000[1], f3000[2]);
               NXi var16 = var2.y().y(var10, var12, var14);
               NXi var17 = new NXi(
                  (Math.random() * f2000[0] - f2000[1]) * f4000[0], Math.random() * f4000[1] * f4000[2], (Math.random() * f4000[3] - f4000[4]) * f4000[5]
               );
               IlmmjsIlp var18 = new IlmmjsIlp(C1183.m24000(40, 70), this.N());
               var18.m80000((boolean)1);
               var18.m70000(var16);
               var18.m58000(var17);
               var18.m60000(f4000[6]);
               var18.m64000(f4000[7]);
               this.N(var18);
            }
         }
      }
   }
}

package rw.core;

import KDFzREm.NCj;
import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNWE;
import KDFzREm.NNrm;
import KDFzREm.NNuU;
import KDFzREm.NbK;
import rw.api.Iface0643;
import rw.gui.Critical;
import rw.module.AutoAccept;

public class C0847 extends OuFz {
   private static float[] f1000;
   private static float[] f2000;
   private static double[] f3000;
   private static float[] f4000;

   private static void m2000() {
      f1000 = new float[]{2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.8F};
      f4000 = new float[]{1.5F, 0.6F, 0.2F, 0.6F};
      f2000 = new float[]{0.3F, 0.2F, 0.1F, 0.2F, 0.4F, 0.3F, 0.2F};
   }

   public C0847(Critical var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   static {
      ntfClinit();
   }

   public void m10000(Object var1) {
      switch (var1) {
         case AutoAccept var4:
            if (var4.m6000() instanceof NCj var18 && var18.N() == 35) {
               NbK var20 = var18.N((NNNZg)((NNuU)this.N[0]).T[3]);
               if (var20 != (NNNwS)((NNuU)this.N[0]).T[4] && var20 != null) {
                  ((Iface0643)var20).dataManager().m22000().m12000(40);
               }
            }
            break;
         case C0721 var5:
            label44: {
               NNrm var6 = ((NNNwS)((NNuU)this.N[0]).T[4]).method_59922();

               for (NbK var8 : ((NNNZg)((NNuU)this.N[0]).T[3]).M()) {
                  C1158 var9 = ((Iface0643)var8).dataManager().m22000();
                  if ((Integer)var9.m10000() > 0) {
                     for (int var10 = 0; var10 < 16; var10++) {
                        double var11 = var6.z() * f1000[0] - f1000[1];
                        double var13 = var6.z() * f1000[2] - f1000[3];
                        double var15 = var6.z() * f1000[4] - f1000[5];
                        if (!(NNWE.E(var11) + NNWE.E(var13) + NNWE.E(var15) > f3000[0])) {
                           IlmmjsIlp var17 = new IlmmjsIlp(C1183.m24000(60, 72), this.m12000(var6));
                           var17.m48000(C1183.m18000(f1000[6], f4000[0]));
                           var17.m76000(var11, var13 + f3000[1], var15);
                           var17.m50000(
                              var8.method_23316(var11 / f3000[2]), var8.method_23323(f3000[3] + var13 / f3000[4]), var8.method_23324(var15 / f3000[5])
                           );
                           var17.m60000(f3000[6]);
                           var17.m64000(f3000[7]);
                           this.N(var17);
                        }
                     }

                     var9.m12000((Integer)var9.m10000() - 1);
                  }
               }
               break label44;
            }
         default:
      }
   }

   private int m12000(NNrm var1) {
      return var1.y(4) == 0
         ? C0876.m54000(f4000[1] + var1.z() * f4000[2], f4000[3] + var1.z() * f2000[0], var1.z() * f2000[1])
         : C0876.m54000(f2000[2] + var1.z() * f2000[3], f2000[4] + var1.z() * f2000[5], var1.z() * f2000[6]);
   }

   private static void m16000() {
      f3000 = new double[]{1.0, 0.2, 4.0, 0.5, 4.0, 4.0, 0.6, 1.0};
   }
}

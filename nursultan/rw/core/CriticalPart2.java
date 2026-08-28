package rw.core;

import KDFzREm.NNNZg;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import KDFzREm.NbK;
import KDFzREm.Nfm;
import rw.gui.Critical;
import rw.module.AutoAccept;

public class CriticalPart2 extends OuFz {
   private static double[] f1000;
   private static double[] f2000;

   public CriticalPart2(Critical var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   static {
      ntfClinit();
   }

   private static void m2000() {
      f1000 = new double[]{0.5, 0.6};
      f2000 = new double[]{0.2, 0.1, 0.5, 0.6, 4.0, 4.0, 0.998, 0.7};
   }

   public void m6000(Object var1) {
      if (var1 instanceof AutoAccept var2 && var2.m6000() instanceof Nfm var3 && var3.y() == 4) {
         NbK var9 = ((NNNZg)((NNuU)this.N[0]).T[3]).method_8469(var3.N());
         if (var9 != null) {
            for (int var5 = 0; var5 < 50; var5++) {
               NXi var6 = new NXi((Math.random() - f1000[0]) * f1000[1], Math.random() * f2000[0] + f2000[1], (Math.random() - f2000[2]) * f2000[3]);
               NXi var7 = new NXi(
                  var9.method_23316(var6.M / f2000[4]), var9.method_23318() + var9.method_17682() * Math.random(), var9.method_23324(var6.Z / f2000[5])
               );
               IlmmjsIlp var8 = new IlmmjsIlp(C1183.m24000(20, 30), this.N());
               var8.m70000(var7);
               var8.m58000(var6);
               var8.m60000(f2000[6]);
               var8.m64000(f2000[7]);
               this.N(var8);
            }
         }
      }
   }
}

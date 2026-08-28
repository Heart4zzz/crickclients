package rw.core;

import KDFzREm.NNNZg;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import KDFzREm.NbK;
import KDFzREm.NkN;
import KDFzREm.Nky;
import rw.gui.Critical;

public class CriticalPart extends OuFz {
   private static double[] f1000;

   public CriticalPart(Critical var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   static {
      ntfClinit();
   }

   private static void m2000() {
      f1000 = new double[]{0.5, 0.3, 0.5, 0.2, 0.5, 0.3, 0.95, 0.02};
   }

   public void m6000(Object var1) {
      if (var1 instanceof C0721) {
         for (NbK var3 : ((NNNZg)((NNuU)this.N[0]).T[3]).M()) {
            if ((var3 instanceof Nky || var3 instanceof NkN) && this.m10000(var3)) {
               for (int var4 = 0; var4 < 5; var4++) {
                  NXi var5 = new NXi((Math.random() - f1000[0]) * f1000[1], (Math.random() - f1000[2]) * f1000[3], (Math.random() - f1000[4]) * f1000[5]);
                  IlmmjsIlp var6 = new IlmmjsIlp(C1183.m24000(20, 40), this.N());
                  var6.m80000((boolean)1);
                  var6.m70000(var3.method_73189());
                  var6.m58000(var5);
                  var6.m60000(f1000[6]);
                  var6.m64000(f1000[7]);
                  this.N(var6);
               }
            }
         }
      }
   }

   private boolean m10000(NbK var1) {
      if (var1.field_6012 <= 0) {
         return (boolean)0;
      } else {
         return (boolean)(var1.field_6038 == var1.method_23317() && var1.field_5971 == var1.method_23318() && var1.field_5989 == var1.method_23321() ? 0 : 1);
      }
   }
}

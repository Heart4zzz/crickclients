package rw.core;

import KDFzREm.NHS;
import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import KDFzREm.NbI;
import KDFzREm.NjL;
import rw.NursultanClient;
import rw.gui.AttackAura;

public class C0757 {
   private static byte[] f1000;
   public static Object[] f2000;
   private static float[] f3000;
   private static double[] f4000;
   private static double[] f5000;

   private static void m2000() {
      f2000 = new Object[]{-0.008, 0.018F, 0.08F};
   }

   private static void m6000() {
      f1000 = new byte[]{2, 3, 2};
   }

   C0757() {
   }

   static {
      ntfClinit();
   }

   private static void m16000() {
      f3000 = new float[]{0.018F, 0.08F, 0.018F, 0.08F};
   }

   private static void m18000() {
      f5000 = new double[]{-0.008, 0.0, 0.001};
      f4000 = new double[]{0.0, 0.0, 0.08, 0.98, -0.008, -0.008};
   }

   private boolean m22000(boolean var1, float var2, double var3) {
      return (boolean)(!var1 && var3 < f4000[4] && var2 + f3000[0] >= f3000[1] ? 1 : 0);
   }

   public boolean m24000(C0768 var1, NjL var2) {
      AttackAura var3 = NursultanClient.m88000().m30000();
      if (var3 == null || ((C1013)var3.f34000[3]).m14000()) {
         return (boolean)1;
      } else if ((NNNwS)((NNuU)C0768.f1000[0]).T[4] != null && (NNNZg)((NNuU)C0768.f1000[0]).T[3] != null && var2 != null && !this.m32000()) {
         return (boolean)(!this.m22000(false, (float)((NNNwS)((NNuU)C0768.f1000[0]).T[4]).field_6017, ((NNNwS)((NNuU)C0768.f1000[0]).T[4]).method_18798().B)
               && !this.m30000()
            ? 0
            : 1);
      } else {
         return (boolean)0;
      }
   }

   private boolean m30000() {
      NXi var1 = ((NNNwS)((NNuU)C0768.f1000[0]).T[4]).method_18798();
      if (var1.B >= f5000[0]) {
         return (boolean)0;
      } else {
         NHS var2 = ((NNNwS)((NNuU)C0768.f1000[0]).T[4]).method_5829();
         float var3 = (float)((NNNwS)((NNuU)C0768.f1000[0]).T[4]).field_6017;
         double var4 = var1.B;

         for (int var6 = 0; var6 < 2; var6++) {
            var2 = var2.u(f5000[1], var4 - f5000[2], f4000[0]);
            if (!((NNNZg)((NNuU)C0768.f1000[0]).T[3]).method_8600((NNNwS)((NNuU)C0768.f1000[0]).T[4], var2).iterator().hasNext()) {
               return (boolean)0;
            }

            var3 += (float)Math.max(f4000[1], -var4);
            if (this.m22000(false, var3, var4)) {
               return (boolean)1;
            }

            var4 = (var4 - f4000[2]) * f4000[3];
         }

         return (boolean)0;
      }
   }

   private boolean m32000() {
      return (boolean)(!((NNNwS)((NNuU)C0768.f1000[0]).T[4]).method_6101()
            && !((NNNwS)((NNuU)C0768.f1000[0]).T[4]).method_5799()
            && !((NNNwS)((NNuU)C0768.f1000[0]).T[4]).method_5681()
            && !((NNNwS)((NNuU)C0768.f1000[0]).T[4]).method_5771()
            && !((NNNwS)((NNuU)C0768.f1000[0]).T[4]).method_5765()
            && ((NNNwS)((NNuU)C0768.f1000[0]).T[4]).field_17046 == NXi.L
            && !((NNNwS)((NNuU)C0768.f1000[0]).T[4]).method_6059(NbI.d)
            && !((NNNwS)((NNuU)C0768.f1000[0]).T[4]).method_6059(NbI.P)
         ? 0
         : 1);
   }
}

package rw.gui;

import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.C1181;
import rw.defs.Enum0055;
import rw.defs.Enum0058;
import rw.module.AttackAura_x_x;

@AnnotationDefault(
   L = "AvoidCollision",
   y = Enum0055.PLAYER,
   u = Enum0058.DEVELOPMENT,
   N = Enum0070.BASE
)
public class AvoidCollision extends GuiWidget {
   private static double[] f1000;
   private static float[] f2000;

   private static void m4000() {
      f2000 = new float[]{0.3F};
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f1000 = new double[]{0.0};
   }

   @Iface0642
   public void m2000(AttackAura_x_x var1) {
      float var2 = f2000[0];

      for (short var3 = -180; var3 <= 180; var3 += 90) {
         double var4 = -Math.sin(Math.toRadians(var3)) * var2;
         double var6 = Math.cos(Math.toRadians(var3)) * var2;
         if (((NNNZg)((NNuU)this.y[0]).T[3])
            .method_8600((NNNwS)((NNuU)this.y[0]).T[4], ((NNNwS)((NNuU)this.y[0]).T[4]).method_5829().u(var4, f1000[0], var6))
            .iterator()
            .hasNext()) {
            var1.m16000((boolean)1);
            C1181.m52000(var1, var3 + 180);
            break;
         }
      }
   }
}

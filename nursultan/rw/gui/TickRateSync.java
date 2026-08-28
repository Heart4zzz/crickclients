package rw.gui;

import rw.GuiWidget;
import rw.NursultanClient;
import rw.api.AnnotationDefault;
import rw.defs.Enum0055;

@AnnotationDefault(
   L = "TickRateSync",
   y = Enum0055.MISC,
   N = Enum0070.BASE
)
public class TickRateSync extends GuiWidget {
   private static float[] f1000;

   private static void m2000() {
      f1000 = new float[]{20.0F};
   }

   static {
      ntfClinit();
   }

   public static float m2000() {
      TickRateSync var0 = NursultanClient.m88000().m112000();
      return var0.U() ? NursultanClient.m78000().m24000() : f1000[0];
   }
}

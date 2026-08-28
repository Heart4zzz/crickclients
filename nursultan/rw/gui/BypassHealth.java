package rw.gui;

import rw.GuiWidget;
import rw.NursultanClient;
import rw.api.AnnotationDefault;
import rw.defs.Enum0055;

@AnnotationDefault(
   L = "BypassHealth",
   y = Enum0055.MISC,
   N = Enum0070.BASE
)
public class BypassHealth extends GuiWidget {
   static {
      ntfClinit();
   }

   public static boolean m2000() {
      return NursultanClient.m88000().m88000().U();
   }
}

package rw.gui;

import rw.GuiWidget;
import rw.NursultanClient;
import rw.api.AnnotationDefault;
import rw.defs.Enum0055;

@AnnotationDefault(
   L = "Inventory",
   y = Enum0055.VISUAL,
   N = Enum0070.INTERFACE
)
public class Inventory extends GuiWidget {
   static {
      ntfClinit();
   }

   public boolean m2000() {
      NursultanClient.m42000().m64000();
      return super.m12000();
   }

   public boolean m4000() {
      NursultanClient.m42000().m64000();
      return super.m14000();
   }
}

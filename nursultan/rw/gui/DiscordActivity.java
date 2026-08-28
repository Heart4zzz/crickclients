package rw.gui;

import rw.GuiWidget;
import rw.NursultanClient;
import rw.api.AnnotationDefault;
import rw.defs.Enum0055;

@AnnotationDefault(
   L = "DiscordActivity",
   y = Enum0055.MISC,
   N = Enum0070.CLIENT
)
public class DiscordActivity extends GuiWidget {
   static {
      ntfClinit();
   }

   public boolean m2000() {
      NursultanClient.m108000().m48000();
      return super.m12000();
   }

   public boolean m4000() {
      NursultanClient.m108000().m40000();
      return super.m14000();
   }
}

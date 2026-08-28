package rw.gui;

import rw.GuiWidget;
import rw.NursultanClient;
import rw.api.AnnotationDefault;
import rw.core.OlijtlOl;
import rw.defs.Enum0055;

@AnnotationDefault(
   L = "IRC",
   y = Enum0055.MISC,
   N = Enum0070.CLIENT
)
public class C0084 extends GuiWidget {
   static {
      ntfClinit();
   }

   public void m2000() {
      super.m6000();
      NursultanClient.m82000().m56000(OlijtlOl.m4000());
   }
}

package rw.gui;

import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.defs.Enum0055;
import rw.defs.Enum0081;
import rw.module.AttackAura_x_x;

@AnnotationDefault(
   L = "AutoJump",
   y = Enum0055.MOVEMENT,
   N = Enum0070.TOOLS
)
public class AutoJump extends GuiWidget {
   static {
      ntfClinit();
   }

   @Iface0642(
      y = Enum0081.AFTER_ALL
   )
   public void m2000(AttackAura_x_x var1) {
      var1.m22000((boolean)1);
   }
}

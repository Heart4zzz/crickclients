package rw.gui;

import KDFzREm.NNNG;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.C0714;
import rw.defs.Enum0055;
import rw.setting.C0161;

@AnnotationDefault(
   L = "CustomCape",
   y = Enum0055.MISC,
   N = Enum0070.CLIENT
)
public class CustomCape extends GuiWidget {
   public Object[] f1000;
   private static String[] f2000;

   private void m4000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }

   public CustomCape() {
      this.m4000();
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f2000 = new String[]{"textures/capes/cape.png"};
   }

   @Iface0642
   public void m2000(C0714 var1) {
      this.m4000();
      if (var1.m14000() == (NNNwS)((NNuU)this.y[0]).T[4]) {
         if ((NNNG)this.f1000[0] == null) {
            NNNG var6 = C0161.m38000(f2000[0]);
            this.f1000[0] = var6;
         }

         var1.m20000((NNNG)this.f1000[0]);
      }
   }
}

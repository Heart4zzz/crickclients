package rw.gui;

import KDFzREm.NGa;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NQa;
import KDFzREm.NbL;
import KDFzREm.wY;
import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.C0721;
import rw.defs.Enum0055;

@AnnotationDefault(
   L = "AutoFish",
   y = Enum0055.PLAYER,
   N = Enum0070.AUTO
)
public class AutoFish extends GuiWidget {
   public Object[] f1000;

   public AutoFish() {
      this.m4000();
      Integer var5 = 0;
      this.f1000[0] = var5;
   }

   static {
      ntfClinit();
   }

   private void m4000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
         var1[0] = 0;
      }
   }

   private void m2000(NbL var1, int var2) {
      this.m4000();
      if ((Integer)this.f1000[0] < 0) {
         wY.N(var1);
         Integer var7 = var2;
         this.f1000[0] = var7;
      }
   }

   @Iface0642
   public void m4000(C0721 var1) {
      this.m4000();

      for (NbL var5 : NbL.values()) {
         if (((NNNwS)((NNuU)this.y[0]).T[4]).method_5998(var5).N(NQa.jr)) {
            NGa var6 = (NGa)((NNNwS)((NNuU)this.y[0]).T[4]).fields_57fa3311b0e9d3e9b883d09222919bf5a[2];
            Integer var11 = (Integer)this.f1000[0] - 1;
            this.f1000[0] = var11;
            if (var6 == null) {
               this.m2000(var5, 30);
               return;
            }

            if (!var6.N) {
               return;
            }

            this.m2000(var5, 10);
            break;
         }
      }
   }
}

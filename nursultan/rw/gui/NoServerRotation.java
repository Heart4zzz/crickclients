package rw.gui;

import KDFzREm.Id;
import KDFzREm.NAC;
import KDFzREm.NNNwS;
import KDFzREm.NNWE;
import KDFzREm.NNuU;
import KDFzREm.NSd;
import KDFzREm.NSl;
import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.data.Rec0179;
import rw.defs.Enum0055;

@AnnotationDefault(
   L = "NoServerRotation",
   y = Enum0055.PLAYER,
   N = Enum0070.BASE
)
public class NoServerRotation extends GuiWidget {
   private static float[] f1000;
   public Object[] f2000;

   private void m4000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[2];
         Object[] var1 = this.f2000;
         var1[0] = f1000[0];
         var1[1] = f1000[1];
      }
   }

   public NoServerRotation() {
      this.m4000();
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f1000 = new float[]{0.0F, 0.0F};
   }

   @Iface0642
   public void m2000(rw.module.AutoAccept var1) {
      this.m4000();
      NNNwS var2 = (NNNwS)((NNuU)this.y[0]).T[4];
      if (var2 != null && this.m6000(var1.m6000())) {
         Float var7 = var2.method_36454();
         this.f2000[0] = var7;
         Float var8 = var2.method_36455();
         this.f2000[1] = var8;
      }
   }

   @Iface0642
   public void m4000(Rec0179 var1) {
      if (this.m6000(var1.m4000())) {
         ((NNuU)this.y[0]).execute(() -> {
            this.m4000();
            if ((NNNwS)((NNuU)this.y[0]).T[4] != null) {
               NNNwS var10000 = (NNNwS)((NNuU)this.y[0]).T[4];
               Float var5 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_36454();
               var10000.R[1] = var5;
               var10000 = (NNNwS)((NNuU)this.y[0]).T[4];
               Float var6 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_36455();
               var10000.R[2] = var6;
               ((NNNwS)((NNuU)this.y[0]).T[4]).method_36456(NNWE.R((Float)this.f2000[0]));
               ((NNNwS)((NNuU)this.y[0]).T[4]).method_36457((Float)this.f2000[1]);
               ((NNNwS)((NNuU)this.y[0]).T[4]).method_63614();
            }
         });
      }
   }

   private boolean m6000(NAC<?> var1) {
      return (boolean)(!(var1 instanceof NSd) && !(var1 instanceof Id) && !(var1 instanceof NSl) ? 0 : 1);
   }
}

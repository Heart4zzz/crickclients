package rw.gui;

import KDFzREm.NNNZZ;
import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NQo;
import KDFzREm.NbL;
import KDFzREm.wY;
import rw.GuiWidget;
import rw.NursultanClient;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.C0916;
import rw.core.C0988;
import rw.core.C1193;
import rw.defs.Enum0055;
import rw.setting.C0122;

@AnnotationDefault(
   L = "AutoEat",
   y = Enum0055.PLAYER,
   N = Enum0070.AUTO
)
public class AutoEat extends GuiWidget {
   private static String[] f1000;
   public Object[] f2000;
   private static float[] f3000;

   private static void m4000() {
      f1000 = new String[]{"value"};
   }

   private boolean m2000() {
      this.m8000();
      return (boolean)(((NNNwS)((NNuU)this.y[0]).T[4]).method_7344().N() < ((C0988)this.f2000[0]).i() ? 1 : 0);
   }

   public AutoEat() {
      this.m8000();
      C0988 var5 = C0122.m12000(this, f1000[0], f3000[0], f3000[1], f3000[2], f3000[3]);
      this.f2000[0] = var5;
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f3000 = new float[]{18.0F, 0.0F, 20.0F, 1.0F};
   }

   private boolean m6000() {
      if (NursultanClient.m60000().m16000()) {
         return (boolean)0;
      } else if (((NNNZZ)((NNuU)this.y[0]).T[2]).E() || ((NNNwS)((NNuU)this.y[0]).T[4]).n()) {
         return (boolean)0;
      } else {
         return (boolean)(!((NNNwS)((NNuU)this.y[0]).T[4]).method_6115() && ((NNuU)this.y[0]).M[4] == 0 ? this.m2000() : 0);
      }
   }

   private void m8000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[2];
         Object[] var1 = this.f2000;
         var1[1] = false;
      }
   }

   private boolean m8000(NQo var1) {
      return (boolean)(var1 != null && !var1.R() ? C1193.m22000(var1) : 0);
   }

   @Iface0642
   public void m10000(rw.module.QuickUse var1) {
      this.m8000();
      if ((NNNwS)((NNuU)this.y[0]).T[4] != null) {
         Boolean var6 = (Boolean)this.f2000[1] && this.m2000() && this.m8000(((NNNwS)((NNuU)this.y[0]).T[4]).method_6030());
         this.f2000[1] = var6;
         if ((Boolean)this.f2000[1]) {
            var1.N();
         }
      }
   }

   @Iface0642
   public void m12000(C0916 var1) {
      this.m8000();
      if ((NNNwS)((NNuU)this.y[0]).T[4] != null) {
         if (this.m6000()) {
            for (NbL var5 : NbL.values()) {
               NQo var6 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_5998(var5);
               if (!var6.N(((NNNZg)((NNuU)this.y[0]).T[3]).method_45162())) {
                  return;
               }

               if (this.m8000(var6)) {
                  wY.N(var5);
                  NNuU var10000 = (NNuU)this.y[0];
                  Integer var11 = 4;
                  var10000.M[4] = var11;
                  Boolean var12 = true;
                  this.f2000[1] = var12;
                  break;
               }
            }
         }
      }
   }
}

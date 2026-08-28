package rw.gui;

import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import java.util.List;
import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.api.Iface0648;
import rw.core.Base1099;
import rw.core.C0916;
import rw.core.C1003;
import rw.core.C1091;
import rw.core.OljOitkn;
import rw.data.Rec0288;
import rw.defs.Enum0055;
import rw.defs.Enum0081;
import rw.module.AttackAura_x_x;
import rw.setting.C0122;
import rw.setting.IlIsmni;

@AnnotationDefault(
   L = "NoDelay",
   y = Enum0055.PLAYER,
   N = Enum0070.BASE
)
public class NoDelay extends GuiWidget {
   private static String[] f1000;
   public Object[] f2000;

   private static void m4000() {
      f1000 = new String[]{"block-breaking", "delays", "right-click", "jump-delay"};
   }

   public NoDelay() {
      this.m8000();
      IlIsmni var5 = new IlIsmni(this, f1000[0], false);
      this.f2000[0] = var5;
      C1003 var6 = C0122.m4000(
         this,
         f1000[1],
         new C1091(this, f1000[2], false, var1 -> {
            if (var1 instanceof C0916 && (NNNwS)((NNuU)this.y[0]).T[4] != null) {
               NNuU var10000 = (NNuU)this.y[0];
               Integer var6x = 0;
               var10000.M[4] = var6x;
            }
         }),
         new C1091(
            this,
            f1000[3],
            true,
            var1 -> {
               if (var1 instanceof AttackAura_x_x var2
                  && (NNNwS)((NNuU)this.y[0]).T[4] != null
                  && var2.m6000()
                  && (Integer)((NNNwS)((NNuU)this.y[0]).T[4]).fields_17fa3311b0e9d3e9b883d09222919bf5a[1] == 0) {
                  Rec0288 var3 = OljOitkn.m32000(var2.m28000(), 0);
                  if (var3.m16000() > 1) {
                     var2.m22000((boolean)0);
                  }
               }
            }
         ),
         (IlIsmni)this.f2000[0]
      );
      this.f2000[1] = var6;
      ((C1003)this.f2000[1]).m2000().forEach(var1 -> {
         if (var1 instanceof Iface0648 var2) {
            var2.m2000(this);
         }
      });
   }

   static {
      ntfClinit();
   }

   private void m8000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[2];
         Object[] var1 = this.f2000;
      }
   }

   @Iface0642
   public void m8000(C0916 var1) {
      this.m8000();
      ((List)((C1003)this.f2000[1]).i()).forEach(var1x -> ((Base1099)var1x).y(var1));
   }

   @Iface0642(
      y = Enum0081.AFTER_ALL
   )
   public void m12000(AttackAura_x_x var1) {
      this.m8000();
      ((List)((C1003)this.f2000[1]).i()).forEach(var1x -> var1x.y(var1));
   }
}

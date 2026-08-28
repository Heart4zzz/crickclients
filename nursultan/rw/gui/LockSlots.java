package rw.gui;

import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NYj;
import KDFzREm.NkG;
import KDFzREm.NkS;
import KDFzREm.Nkq;
import KDFzREm.Nww;
import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.C0991;
import rw.core.C1003;
import rw.core.C1013;
import rw.defs.Enum0055;
import rw.module.ShulkerPreview_x;
import rw.setting.C0122;

@AnnotationDefault(
   L = "LockSlots",
   y = Enum0055.PLAYER,
   N = Enum0070.BASE
)
public class LockSlots extends GuiWidget {
   private static String[] f1000;
   public Object[] f2000;
   private static String[] f3000;

   private void m4000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[2];
         Object[] var1 = this.f2000;
      }
   }

   public LockSlots() {
      this.m4000();
      C1003 var5 = C0122.m4000(
         this,
         f1000[0],
         new C1013(f1000[1], true),
         new C1013(f1000[2], true),
         new C1013(f1000[3], true),
         new C1013(f1000[4], true),
         new C1013(f1000[5], true),
         new C1013(f1000[6], true),
         new C1013(f1000[7], true),
         new C1013(f3000[0], true),
         new C1013(f3000[1], true)
      );
      this.f2000[0] = var5;
      C0991 var6 = C0122.m26000(this, f3000[2], false);
      this.f2000[1] = var6;
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f1000 = new String[]{"slots", "_1", "_2", "_3", "_4", "_5", "_6", "_7"};
      f3000 = new String[]{"_8", "_9", "from-inventory"};
   }

   private boolean m14000(int var1) {
      this.m4000();
      return (boolean)(Nww.L(var1) && ((C1013)((C1003)this.f2000[0]).m2000().get(var1)).m14000() ? 1 : 0);
   }

   @Iface0642
   public void m18000(rw.module.LockSlots var1) {
      if (this.m14000(var1.m4000())) {
         var1.N();
      }
   }

   @Iface0642
   public void m20000(ShulkerPreview_x var1) {
      this.m4000();
      if (var1.m6000() == Nkq.field_7795 || var1.m6000() == Nkq.field_7790 && var1.m8000() == -999) {
         if ((Boolean)((C0991)this.f2000[1]).i()) {
            var1.N();
         } else {
            if ((NNNwS)((NNuU)this.y[0]).T[4] != null
               && this.m14000(
                  m22000(
                     var1.m2000(),
                     ((NNNwS)((NNuU)this.y[0]).T[4]).method_31548(),
                     (NkS)((NNNwS)((NNuU)this.y[0]).T[4]).fields_07fa3311b0e9d3e9b883d09222919bf5a[2]
                  )
               )) {
               var1.N();
            }
         }
      }
   }

   private static int m22000(NYj var0, Nww var1, NkG var2) {
      if (var0 != null && var0.L == var1) {
         int var3 = var0.B();
         if (Nww.L(var3)) {
            return var3;
         } else if (var2 != null && var0.u >= 0 && var0.u < var2.T.size()) {
            NYj var4 = (NYj)var2.T.get(var0.u);
            if (var4.L != var1) {
               return -1;
            } else {
               int var5 = var4.B();
               return Nww.L(var5) ? var5 : -1;
            }
         } else {
            return -1;
         }
      } else {
         return -1;
      }
   }
}

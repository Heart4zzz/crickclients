package rw.gui;

import KDFzREm.NNNZg;
import KDFzREm.NNNwz;
import KDFzREm.NNtL;
import KDFzREm.NNuU;
import KDFzREm.NbL;
import KDFzREm.wY;
import java.util.List;
import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.Base0788;
import rw.core.C0721;
import rw.core.C0796;
import rw.core.C0991;
import rw.core.C1003;
import rw.core.C1140;
import rw.core.FbDr;
import rw.data.Rec0199;
import rw.defs.Enum0055;
import rw.setting.C0071;
import rw.setting.C0122;

@AnnotationDefault(
   L = "ItemRelease",
   y = Enum0055.COMBAT,
   N = Enum0070.BASE
)
public class ItemRelease extends GuiWidget {
   public Object[] f1000;
   private static String[] f2000;

   private void m4000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[2];
         Object[] var1 = this.f1000;
      }
   }

   public ItemRelease() {
      this.m4000();
      C1003 var5 = C0122.m4000(this, f2000[0], new C0796(this, f2000[1], true), new FbDr(this, f2000[2], true));
      this.f1000[0] = var5;
      C0991 var6 = C0122.m26000(this, f2000[3], false);
      this.f1000[1] = var6;
   }

   static {
      ntfClinit();
   }

   private void m8000() {
      for (NNNwz var2 : ((NNNZg)((NNuU)this.y[0]).T[3]).method_18456()) {
         if (var2 instanceof C0071 var3) {
            wY.N(var3);
         }
      }
   }

   private void m10000() {
      for (NNNwz var2 : ((NNNZg)((NNuU)this.y[0]).T[3]).method_18456()) {
         if (var2 instanceof C0071 var3) {
            wY.y(var3);
         }
      }
   }

   private static void m12000() {
      f2000 = new String[]{"items", "trident", "crossbow", "hit-only"};
   }

   @Iface0642
   public void m2000(C0721 var1) {
      this.m4000();

      for (Base0788 var3 : (List)((C1003)this.f1000[0]).i()) {
         for (NbL var7 : NbL.values()) {
            if (var3.test((NNuU)this.y[0], var7) && this.m4000(var3, var7)) {
               var3.m2000((NNuU)this.y[0], var7);
            }
         }
      }
   }

   private boolean m4000(Base0788 var1, NbL var2) {
      this.m4000();
      if (!(Boolean)((C0991)this.f1000[1]).i()) {
         return (boolean)1;
      } else {
         this.m8000();
         boolean var3 = var1.m4000((NNuU)this.y[0], var2, this::m6000);
         this.m10000();
         return var3;
      }
   }

   private boolean m6000(Rec0199 var1) {
      return var1.m8000() instanceof NNtL var2 && !C1140.m32000().test(var2.L()) ? 1 : 0;
   }
}

package rw.gui;

import KDFzREm.NAC;
import KDFzREm.NNNNWI;
import KDFzREm.NNNwS;
import KDFzREm.NNiz;
import KDFzREm.NNuU;
import KDFzREm.NhY;
import KDFzREm.gB;
import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.C1181;
import rw.defs.Enum0055;
import rw.module.AttackAura_x_x;
import rw.setting.C0160;

@AnnotationDefault(
   L = "AirStuck",
   y = Enum0055.MOVEMENT,
   N = Enum0070.TOOLS
)
public class AirStuck extends GuiWidget {
   public Object[] f1000;

   private gB m2000() {
      NNiz var1 = (NNiz)((NNuU)this.y[0]).i[7];
      return new gB(var1.n.R(), var1.G.R(), var1.t.R(), var1.l.R(), var1.d.R(), var1.w.R(), var1.k.R());
   }

   private void m2000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
         var1[0] = 0;
      }
   }

   public AirStuck() {
      this.m2000();
   }

   static {
      ntfClinit();
   }

   public boolean m4000() {
      this.m2000();
      Integer var5 = 0;
      this.f1000[0] = var5;
      return (boolean)1;
   }

   public boolean m6000() {
      this.m12000(this.m2000());
      return (boolean)1;
   }

   private boolean m4000() {
      this.m2000();
      return (boolean)(this.f1000[0] >= 1 ? 1 : 0);
   }

   @Iface0642
   public void m6000(rw.module.AttackAura var1) {
      this.m2000();
      if (this.m4000()) {
         var1.N();
      }

      Integer var6 = (Integer)this.f1000[0] + 1;
      this.f1000[0] = var6;
   }

   @Iface0642
   public void m8000(AttackAura_x_x var1) {
      C1181.m50000(var1);
   }

   @Iface0642
   public void m10000(rw.module.Blink var1) {
      NAC var2 = var1.m2000();
      int var3 = !(var2 instanceof NhY) && !(var2 instanceof NNNNWI) ? 0 : 1;
      if (this.m4000() && var3 != 0) {
         var1.N();
      }
   }

   private void m12000(gB var1) {
      if ((NNNwS)((NNuU)this.y[0]).T[4] != null && !var1.equals((gB)((NNNwS)((NNuU)this.y[0]).T[4]).L[2])) {
         C0160.m74000(new NhY(var1));
         ((NNNwS)((NNuU)this.y[0]).T[4]).L[2] = var1;
      }
   }

   @Iface0642
   public void m14000(rw.module.AirStuck var1) {
      if (this.m4000()) {
         var1.N();
      }
   }
}

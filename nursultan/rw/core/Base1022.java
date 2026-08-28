package rw.core;

import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NQo;
import rw.GuiWidget;
import rw.api.Iface0606;
import rw.api.Iface0622;
import rw.api.Iface0653;
import rw.gui.PgUp;
import rw.module.OlpnniIl;

public abstract class Base1022<T extends GuiWidget & Iface0622> implements Iface0653 {
   public Object[] f1000;

   public abstract Iface0606 m2000();

   private void m4000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[3];
         Object[] var1 = this.f1000;
      }
   }

   public Base1022(T var1, String var2) {
      this.m4000();
      NNuU var7 = NNuU.Nq();
      this.f1000[0] = var7;
      this.f1000[1] = var1;
      C1006 var9 = rw.setting.C0122.m14000(var1, var2, (PgUp)PgUp.f4000[0]);
      this.f1000[2] = var9;
   }

   static {
      ntfClinit();
   }

   public abstract String m8000();

   public void m10000(Object var1) {
      if (var1 instanceof OlpnniIl var2) {
         if (var2.y((PgUp)((C1006)this.f1000[2]).i(), ((C1006)this.f1000[2]).m2000())) {
            if (((GuiWidget)this.f1000[1]).m30000() && (NNNwS)((NNuU)this.f1000[0]).T[4] != null && (NNNZg)((NNuU)this.f1000[0]).T[3] != null) {
               ((Iface0622)((GuiWidget)this.f1000[1])).m2000(this.m2000());
            }
         }
      }
   }

   public abstract NQo m14000();

   public abstract String m18000();
}

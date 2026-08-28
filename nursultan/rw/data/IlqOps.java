package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.GuiWidget;
import rw.api.Iface0578;
import rw.api.Iface0608;
import rw.core.C1198;

public non-sealed record IlqOps() implements Iface0608 {
   public GuiWidget f1000;

   public GuiWidget m2000() {
      return this.f1000;
   }

   public IlqOps(GuiWidget var1) {
      this.f1000 = var1;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",IlqOps,"module",IlqOps::f1000>(this, var1);
   }

   public Iface0578 m6000() {
      return new C1198(this);
   }
}

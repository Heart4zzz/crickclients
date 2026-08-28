package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.GuiWidget;
import rw.api.Iface0196;

public record Rec0274() {
   public Iface0196<Boolean> f1000;
   public GuiWidget f2000;

   public Rec0274(GuiWidget var1, Iface0196<Boolean> var2) {
      this.f2000 = var1;
      this.f1000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0274,"module;opened",Rec0274::f2000,Rec0274::f1000>(this, var1);
   }

   public GuiWidget m4000() {
      return this.f2000;
   }

   public Iface0196<Boolean> m6000() {
      return this.f1000;
   }
}

package rw.data;

import java.lang.runtime.ObjectMethods;
import java.util.List;
import rw.GuiWidget;
import rw.api.Iface0196;
import rw.gui.Enum0070;

public record Rec0260() {
   public Enum0070 f1000;
   public List<GuiWidget> f2000;
   public Iface0196<Boolean> f3000;

   public Iface0196<Boolean> m2000() {
      return this.f3000;
   }

   public Rec0260(Iface0196<Boolean> var1, Enum0070 var2, List<GuiWidget> var3) {
      this.f3000 = var1;
      this.f1000 = var2;
      this.f2000 = var3;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0260,"expanded;subCategory;modules",Rec0260::f3000,Rec0260::f1000,Rec0260::f2000>(this, var1);
   }

   public Enum0070 m6000() {
      return this.f1000;
   }

   public List<GuiWidget> m8000() {
      return this.f2000;
   }
}

package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.GuiWidget;

public record Rec0264() {
   public GuiWidget f1000;
   public String f2000;
   public String f3000;

   public GuiWidget m2000() {
      return this.f1000;
   }

   public Rec0264(GuiWidget var1, String var2, String var3) {
      this.f1000 = var1;
      this.f3000 = var2;
      this.f2000 = var3;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0264,"module;description;anchorKey",Rec0264::f1000,Rec0264::f3000,Rec0264::f2000>(this, var1);
   }

   public String m6000() {
      return this.f3000;
   }

   public String m8000() {
      return this.f2000;
   }
}

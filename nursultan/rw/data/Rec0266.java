package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.defs.IlIijjrn;

public record Rec0266() {
   public IlIijjrn f1000;
   public Runnable f2000;
   public boolean f3000;
   public String f4000;

   public String m2000() {
      return this.f4000;
   }

   public Rec0266(String var1, boolean var2, Runnable var3, IlIijjrn var4) {
      this.f4000 = var1;
      this.f3000 = var2;
      this.f2000 = var3;
      this.f1000 = var4;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0266,"label;active;onClick;segment",Rec0266::f4000,Rec0266::f3000,Rec0266::f2000,Rec0266::f1000>(this, var1);
   }

   public boolean m6000() {
      return this.f3000;
   }

   public IlIijjrn m8000() {
      return this.f1000;
   }

   public Runnable m10000() {
      return this.f2000;
   }
}

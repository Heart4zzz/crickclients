package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.core.OlsmIikp;

public record Rec0035() {
   public OlsmIikp f1000;
   public boolean f2000;

   public Rec0035(OlsmIikp var1, boolean var2) {
      this.f1000 = var1;
      this.f2000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0035,"preset;last",Rec0035::f1000,Rec0035::f2000>(this, var1);
   }

   public boolean m4000() {
      return this.f2000;
   }

   public OlsmIikp m6000() {
      return this.f1000;
   }
}

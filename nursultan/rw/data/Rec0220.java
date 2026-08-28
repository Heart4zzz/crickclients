package rw.data;

import KDFzREm.NAd;
import java.lang.runtime.ObjectMethods;

public record Rec0220() {
   public NAd f1000;
   public String f2000;

   Rec0220(String var1, NAd var2) {
      this.f2000 = var1;
      this.f1000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0220,"text;style",Rec0220::f2000,Rec0220::f1000>(this, var1);
   }

   public NAd m4000() {
      return this.f1000;
   }

   public String m6000() {
      return this.f2000;
   }
}

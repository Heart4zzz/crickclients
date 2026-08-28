package rw.data;

import KDFzREm.NjL;
import java.lang.runtime.ObjectMethods;

public record Rec0203() {
   public int f1000;
   public NjL f2000;

   Rec0203(NjL var1, int var2) {
      this.f2000 = var1;
      this.f1000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0203,"living;confirmTick",Rec0203::f2000,Rec0203::f1000>(this, var1);
   }

   public NjL m4000() {
      return this.f2000;
   }

   public int m6000() {
      return this.f1000;
   }
}

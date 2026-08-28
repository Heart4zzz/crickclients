package rw.data;

import KDFzREm.NCU;
import KDFzREm.Ned;
import java.lang.runtime.ObjectMethods;

public record Rec0181() {
   public NCU f1000;
   public Ned f2000;

   public Rec0181(Ned var1, NCU var2) {
      this.f2000 = var1;
      this.f1000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0181,"blockPos;voxelShape",Rec0181::f2000,Rec0181::f1000>(this, var1);
   }

   public Ned m4000() {
      return this.f2000;
   }

   public NCU m6000() {
      return this.f1000;
   }
}

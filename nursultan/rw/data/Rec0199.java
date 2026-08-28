package rw.data;

import KDFzREm.NXi;
import KDFzREm.NbK;
import KDFzREm.NcB;
import java.lang.runtime.ObjectMethods;

public record Rec0199() {
   public NXi f1000;
   public NcB f2000;
   public int f3000;
   public NbK f4000;

   public int m2000() {
      return this.f3000;
   }

   public Rec0199(NXi var1, NcB var2, int var3, NbK var4) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
      this.f4000 = var4;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0199,"position;hitResult;remainingTicks;entity",Rec0199::f1000,Rec0199::f2000,Rec0199::f3000,Rec0199::f4000>(
         this, var1
      );
   }

   public NbK m6000() {
      return this.f4000;
   }

   public NcB m8000() {
      return this.f2000;
   }

   public NXi m10000() {
      return this.f1000;
   }
}

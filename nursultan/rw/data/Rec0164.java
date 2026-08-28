package rw.data;

import KDFzREm.NXi;
import java.lang.runtime.ObjectMethods;

record Rec0164() {
   final NXi f1000;
   private final int f2000;
   private final float f3000;

   public float m2000() {
      return this.f3000;
   }

   Rec0164(NXi var1, int var2, float var3) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0164,"pos;color;size",Rec0164::f1000,Rec0164::f2000,Rec0164::f3000>(this, var1);
   }

   public int m6000() {
      return this.f2000;
   }

   public NXi m8000() {
      return this.f1000;
   }
}

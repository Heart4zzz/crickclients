package rw.data;

import KDFzREm.NXi;
import java.lang.runtime.ObjectMethods;

record Rec0163() {
   private final NXi f1000;
   private final NXi f2000;
   private final int f3000;
   private final float f4000;

   public int m2000() {
      return this.f3000;
   }

   Rec0163(NXi var1, NXi var2, int var3, float var4) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
      this.f4000 = var4;
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0163,"start;end;color;width",Rec0163::f1000,Rec0163::f2000,Rec0163::f3000,Rec0163::f4000>(this, var1);
   }

   public float m6000() {
      return this.f4000;
   }

   public NXi m8000() {
      return this.f2000;
   }

   public NXi m10000() {
      return this.f1000;
   }
}

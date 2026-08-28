package rw.data;

import KDFzREm.NXi;
import java.lang.runtime.ObjectMethods;

public record Rec0185() {
   public boolean f1000;
   public boolean f2000;
   private static boolean[] f3000;
   public NXi f4000;

   public NXi m2000() {
      return this.f4000;
   }

   public Rec0185(NXi var1, boolean var2) {
      this(var1, var2, f3000[0]);
   }

   public Rec0185(NXi var1, boolean var2, boolean var3) {
      this.f4000 = var1;
      this.f1000 = var2;
      this.f2000 = var3;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0185,"point;detached;pullback",Rec0185::f4000,Rec0185::f1000,Rec0185::f2000>(this, var1);
   }

   private static void m6000() {
      boolean[] var128 = new boolean[(1 | -1) >>> 31];
      f3000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
   }

   public boolean m8000() {
      return this.f1000;
   }

   public boolean m12000() {
      return this.f2000;
   }
}

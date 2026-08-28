package rw.data;

import java.lang.runtime.ObjectMethods;

record Rec0086() {
   private final Rec0083 f1000;
   private final int f2000;
   private final long[] f3000;

   public long[] m2000() {
      return this.f3000;
   }

   Rec0086(Rec0083 var1, int var2, long[] var3) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0086,"axis;index;defaults",Rec0086::f1000,Rec0086::f2000,Rec0086::f3000>(this, var1);
   }

   public int m6000() {
      return this.f2000;
   }

   public Rec0083 m8000() {
      return this.f1000;
   }
}

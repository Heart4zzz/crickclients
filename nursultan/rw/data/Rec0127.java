package rw.data;

import java.lang.runtime.ObjectMethods;

public record Rec0127() {
   private final boolean f1000;
   private final int f2000;

   public Rec0127(boolean var1, int var2) {
      this.f1000 = var1;
      this.f2000 = var2;
   }

   public final boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0127,"auto;value",Rec0127::f1000,Rec0127::f2000>(this, var1);
   }

   public int m4000() {
      return this.f2000;
   }

   public boolean m6000() {
      return this.f1000;
   }
}

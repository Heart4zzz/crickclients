package rw.data;

import java.lang.runtime.ObjectMethods;

public record Rec0124() {
   private final int f1000;
   private final int f2000;
   private final int f3000;
   private final int f4000;

   public int m2000() {
      return this.f1000;
   }

   public Rec0124(int var1, int var2, int var3, int var4) {
      if (var1 < 0) {
         throw new IllegalArgumentException("x must be >= 0");
      } else if (var2 < 0) {
         throw new IllegalArgumentException("y must be >= 0");
      } else if (var3 <= 0) {
         throw new IllegalArgumentException("width must be > 0");
      } else if (var4 <= 0) {
         throw new IllegalArgumentException("height must be > 0");
      } else {
         this.f1000 = var1;
         this.f2000 = var2;
         this.f3000 = var3;
         this.f4000 = var4;
      }
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0124,"x;y;width;height",Rec0124::f1000,Rec0124::f2000,Rec0124::f3000,Rec0124::f4000>(this, var1);
   }

   public int m6000() {
      return this.f3000;
   }

   public int m8000() {
      return this.f2000;
   }

   public int m10000() {
      return this.f2000 + this.f4000;
   }

   public int m12000() {
      return this.f1000 + this.f3000;
   }

   public int m14000() {
      return this.f4000;
   }
}

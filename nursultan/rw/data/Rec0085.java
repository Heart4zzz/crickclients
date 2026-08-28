package rw.data;

import java.lang.runtime.ObjectMethods;

public record Rec0085() {
   private final float[] f1000;
   private final int f2000;
   private final int f3000;
   private final int f4000;
   private final double f5000;

   public int m2000() {
      return this.f3000;
   }

   public Rec0085(float[] var1, int var2, int var3, int var4, double var5) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
      this.f4000 = var4;
      this.f5000 = var5;
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0085,"pixels;width;height;channels;advance",Rec0085::f1000,Rec0085::f2000,Rec0085::f3000,Rec0085::f4000,Rec0085::f5000>(
         this, var1
      );
   }

   public double m6000() {
      return this.f5000;
   }

   public int m8000() {
      return this.f4000;
   }

   public int m10000() {
      return this.f2000;
   }

   public float m12000(int var1, int var2, int var3) {
      return this.f1000[(var2 * this.f2000 + var1) * this.f4000 + var3];
   }

   public float[] m14000() {
      return this.f1000;
   }
}

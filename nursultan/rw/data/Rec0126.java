package rw.data;

import java.lang.runtime.ObjectMethods;

public record Rec0126() {
   private final float f1000;
   private final float f2000;
   private final float f3000;
   private final float f4000;
   public static final Rec0126 f5000;

   public boolean m2000() {
      return Float.compare(this.f1000, this.f2000) == 0 && Float.compare(this.f2000, this.f3000) == 0 && Float.compare(this.f3000, this.f4000) == 0;
   }

   public float m4000() {
      return this.f4000;
   }

   public Rec0126(float var1, float var2, float var3, float var4) {
      var1 = m14000(var1);
      var2 = m14000(var2);
      var3 = m14000(var3);
      var4 = m14000(var4);
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
      this.f4000 = var4;
   }

   public final boolean m6000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0126,"topLeft;topRight;bottomRight;bottomLeft",Rec0126::f1000,Rec0126::f2000,Rec0126::f3000,Rec0126::f4000>(
         this, var1
      );
   }

   public float m8000() {
      return this.f2000;
   }

   public float m10000() {
      return this.f1000;
   }

   public boolean m12000() {
      return this.m18000() > 0.0F;
   }

   private static float m14000(float var0) {
      return !Float.isFinite(var0) ? 0.0F : Math.max(0.0F, var0);
   }

   public static Rec0126 m16000(float var0) {
      float var1 = m14000(var0);
      return new Rec0126(var1, var1, var1, var1);
   }

   public float m18000() {
      return Math.max(Math.max(this.f1000, this.f2000), Math.max(this.f3000, this.f4000));
   }

   public float m20000() {
      return this.f3000;
   }
}

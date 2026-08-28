package rw.data;

import java.lang.runtime.ObjectMethods;

public record Rec0236() {
   public float f1000;
   public float f2000;
   public float f3000;
   public float f4000;
   private static float[] f5000;

   public float m2000() {
      return this.f3000;
   }

   private static void m4000() {
      f5000 = new float[]{0.0F, 0.0F};
   }

   public Rec0236(float var1, float var2, float var3, float var4) {
      this.f3000 = var1;
      this.f4000 = var2;
      this.f2000 = var3;
      this.f1000 = var4;
   }

   static {
      ntfClinit();
   }

   public boolean m6000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0236,"minX;minY;maxX;maxY",Rec0236::f3000,Rec0236::f4000,Rec0236::f2000,Rec0236::f1000>(this, var1);
   }

   public float m8000() {
      return this.f2000 - this.f3000;
   }

   public float m10000() {
      return this.f4000;
   }

   public float m12000() {
      return this.f2000;
   }

   public float m14000() {
      return this.f1000;
   }

   public Rec0236 m16000(Rec0236 var1) {
      float var2 = Math.max(this.f3000, var1.f3000);
      float var3 = Math.max(this.f4000, var1.f4000);
      float var4 = Math.min(this.f2000, var1.f2000);
      float var5 = Math.min(this.f1000, var1.f1000);
      return !(var4 - var2 <= f5000[0]) && !(var5 - var3 <= f5000[1]) ? new Rec0236(var2, var3, var4, var5) : null;
   }

   public float m20000() {
      return this.f1000 - this.f4000;
   }
}

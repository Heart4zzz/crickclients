package rw.data;

import java.lang.runtime.ObjectMethods;

public record Rec0020() {
   private static float[] f1000;
   public float f2000;
   public float f3000;
   public boolean f4000;
   private static boolean[] f5000;

   public boolean m2000() {
      return this.f4000;
   }

   public Rec0020(boolean var1, float var2, float var3) {
      this.f4000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0020,"active;multiplier;envelope",Rec0020::f4000,Rec0020::f2000,Rec0020::f3000>(this, var1);
   }

   private static void m6000() {
      float[] var128 = new float[2];
      f1000[(0 | -0) >>> 31] = Float.intBitsToFloat(1065353216);
      f1000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
   }

   public float m8000() {
      return this.f3000;
   }

   public static Rec0020 m10000() {
      return new Rec0020(f5000[0], f1000[0], f1000[1]);
   }

   public float m16000() {
      return this.f2000;
   }

   private static void m22000() {
      boolean[] var128 = new boolean[(1 | -1) >>> 31];
      f5000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
   }
}

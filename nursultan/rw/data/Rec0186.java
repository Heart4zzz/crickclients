package rw.data;

import java.lang.runtime.ObjectMethods;

public record Rec0186() {
   public float f1000;
   public boolean f2000;
   private static boolean[] f3000;
   private static float[] f4000;
   public float f5000;
   public boolean f6000;

   public boolean m2000() {
      return this.f2000;
   }

   private static void m4000() {
      boolean[] var128 = new boolean[2];
      f3000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
   }

   public Rec0186(boolean var1, float var2, float var3, boolean var4) {
      this.f6000 = var1;
      this.f1000 = var2;
      this.f5000 = var3;
      this.f2000 = var4;
   }

   static {
      ntfClinit();
   }

   public boolean m6000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0186,"active;yawOffset;pitchOffset;releaseAim",Rec0186::f6000,Rec0186::f1000,Rec0186::f5000,Rec0186::f2000>(
         this, var1
      );
   }

   public float m8000() {
      return this.f5000;
   }

   public static Rec0186 m10000() {
      return new Rec0186(f3000[0], f4000[0], f4000[1], f3000[1]);
   }

   public float m14000() {
      return this.f1000;
   }

   public boolean m16000() {
      return this.f6000;
   }

   private static void m22000() {
      float[] var128 = new float[2];
      f4000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f4000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
   }
}

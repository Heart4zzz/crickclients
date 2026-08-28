package rw.data;

import java.lang.runtime.ObjectMethods;

public record OllisOr() {
   private static boolean[] f1000;
   private static float[] f2000;
   public float f3000;
   public float f4000;
   public boolean f5000;
   public float f6000;
   public boolean f7000;
   public float f8000;
   public float f9000;
   public float f10000;
   public float f11000;

   public float m2000() {
      return this.f4000;
   }

   public float m4000() {
      return this.f6000;
   }

   public OllisOr(boolean var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, boolean var9) {
      this.f5000 = var1;
      this.f9000 = var2;
      this.f6000 = var3;
      this.f4000 = var4;
      this.f3000 = var5;
      this.f8000 = var6;
      this.f11000 = var7;
      this.f10000 = var8;
      this.f7000 = var9;
   }

   static {
      ntfClinit();
   }

   public boolean m6000(Object var1) {
      return ObjectMethods.bootstrap<"equals",OllisOr,"active;yawMultiplier;pitchMultiplier;acceleration;yawShare;pitchShare;yawOffset;pitchOffset;angularOffset",OllisOr::f5000,OllisOr::f9000,OllisOr::f6000,OllisOr::f4000,OllisOr::f3000,OllisOr::f8000,OllisOr::f11000,OllisOr::f10000,OllisOr::f7000>(
         this, var1
      );
   }

   public float m8000() {
      return this.f8000;
   }

   public static OllisOr m10000() {
      return new OllisOr(f1000[0], f2000[0], f2000[1], f2000[2], f2000[3], f2000[4], f2000[5], f2000[6], f1000[1]);
   }

   public float m12000() {
      return this.f9000;
   }

   private static void m14000() {
      boolean[] var128 = new boolean[2];
      f1000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
   }

   public float m16000() {
      return this.f10000;
   }

   public float m18000() {
      return this.f3000;
   }

   public boolean m20000() {
      return this.f5000;
   }

   private static void m24000() {
      float[] var128 = new float[7];
      f2000[(0 | -0) >>> 31] = Float.intBitsToFloat(1065353216);
      f2000[(1 | -1) >>> 31] = Float.intBitsToFloat(1065353216);
      f2000[2] = Float.intBitsToFloat(0);
      f2000[3] = Float.intBitsToFloat(0);
      f2000[4] = Float.intBitsToFloat(0);
      f2000[5] = Float.intBitsToFloat(0);
      f2000[6] = Float.intBitsToFloat(0);
   }

   public boolean m28000() {
      return this.f7000;
   }

   public float m30000() {
      return this.f11000;
   }
}

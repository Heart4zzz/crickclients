package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.core.C0983;

public record OlmOqsqkk() {
   public float f1000;
   private static boolean[] f2000;
   public boolean f3000;
   public boolean f4000;
   public float f5000;
   public boolean f6000;
   public boolean f7000;
   public boolean f8000;
   private static float[] f9000;
   public boolean f10000;
   public boolean f11000;
   public C0983 f12000;
   public float f13000;

   public boolean m2000() {
      return this.f8000;
   }

   public boolean m4000() {
      return this.f7000;
   }

   public OlmOqsqkk(
      C0983 var1, float var2, float var3, boolean var4, boolean var5, boolean var6, boolean var7, boolean var8, float var9, boolean var10, boolean var11
   ) {
      this.f12000 = var1;
      this.f5000 = var2;
      this.f13000 = var3;
      this.f7000 = var4;
      this.f4000 = var5;
      this.f6000 = var6;
      this.f8000 = var7;
      this.f3000 = var8;
      this.f1000 = var9;
      this.f11000 = var10;
      this.f10000 = var11;
   }

   public OlmOqsqkk(C0983 var1, float var2, float var3, boolean var4, boolean var5, boolean var6) {
      this(var1, var2, var3, var4, var5, var6, f2000[0], f2000[1], f9000[0], f2000[2], f2000[3]);
   }

   static {
      ntfClinit();
   }

   public boolean m6000(Object var1) {
      return ObjectMethods.bootstrap<"equals",OlmOqsqkk,"rotation;yawSpeed;pitchSpeed;holdPitch;detachedAim;fastCorrection;overflight;closeRange;closeFactor;overlapRange;constrainedSpace",OlmOqsqkk::f12000,OlmOqsqkk::f5000,OlmOqsqkk::f13000,OlmOqsqkk::f7000,OlmOqsqkk::f4000,OlmOqsqkk::f6000,OlmOqsqkk::f8000,OlmOqsqkk::f3000,OlmOqsqkk::f1000,OlmOqsqkk::f11000,OlmOqsqkk::f10000>(
         this, var1
      );
   }

   public C0983 m8000() {
      return this.f12000;
   }

   public float m10000() {
      return this.f1000;
   }

   public boolean m12000() {
      return this.f10000;
   }

   public boolean m14000() {
      return this.f11000;
   }

   public boolean m16000() {
      return this.f6000;
   }

   public float m18000() {
      return this.f5000;
   }

   public float m22000() {
      return this.f13000;
   }

   private static void m24000() {
      float[] var128 = new float[(1 | -1) >>> 31];
      f9000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
   }

   public boolean m26000() {
      return this.f3000;
   }

   private static void m32000() {
      boolean[] var128 = new boolean[4];
      f2000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[2] = (boolean)((0 | -0) >>> 31);
      f2000[3] = (boolean)((0 | -0) >>> 31);
   }

   public boolean m34000() {
      return this.f4000;
   }
}

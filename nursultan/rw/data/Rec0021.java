package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.core.C0983;

public record Rec0021() {
   public float f1000;
   private static float[] f2000;
   public float f3000;
   public float f4000;
   public boolean f5000;
   public float f6000;
   public C0983 f7000;
   private static boolean[] f8000;

   public float m2000() {
      return this.f1000;
   }

   private static void m4000() {
      float[] var128 = new float[2];
      f2000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f2000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
   }

   public Rec0021(C0983 var1, float var2, float var3, float var4, float var5, boolean var6) {
      this.f7000 = var1;
      this.f6000 = var2;
      this.f1000 = var3;
      this.f3000 = var4;
      this.f4000 = var5;
      this.f5000 = var6;
   }

   static {
      ntfClinit();
   }

   public boolean m6000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0021,"rotation;yawOffset;pitchOffset;yawSpeed;pitchSpeed;active",Rec0021::f7000,Rec0021::f6000,Rec0021::f1000,Rec0021::f3000,Rec0021::f4000,Rec0021::f5000>(
         this, var1
      );
   }

   private static void m8000() {
      boolean[] var128 = new boolean[(1 | -1) >>> 31];
      f8000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
   }

   public C0983 m10000() {
      return this.f7000;
   }

   public float m12000() {
      return this.f3000;
   }

   public boolean m16000() {
      return this.f5000;
   }

   public static Rec0021 m18000(C0983 var0, float var1, float var2) {
      return new Rec0021(var0, f2000[0], f2000[1], var1, var2, f8000[0]);
   }

   public float m22000() {
      return this.f6000;
   }

   public float m24000() {
      return this.f4000;
   }
}

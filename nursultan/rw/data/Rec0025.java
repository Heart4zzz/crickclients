package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.core.C0983;

public record Rec0025() {
   public float f1000;
   public boolean f2000;
   public C0983 f3000;
   private static boolean[] f4000;
   public float f5000;

   public boolean m2000() {
      return this.f2000;
   }

   public Rec0025(C0983 var1, float var2, float var3, boolean var4) {
      this.f3000 = var1;
      this.f1000 = var2;
      this.f5000 = var3;
      this.f2000 = var4;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0025,"rotation;yawSpeed;pitchSpeed;active",Rec0025::f3000,Rec0025::f1000,Rec0025::f5000,Rec0025::f2000>(
         this, var1
      );
   }

   private static void m6000() {
      boolean[] var128 = new boolean[(1 | -1) >>> 31];
      f4000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
   }

   public float m8000() {
      return this.f5000;
   }

   public C0983 m10000() {
      return this.f3000;
   }

   public float m12000() {
      return this.f1000;
   }

   public static Rec0025 m16000(C0983 var0, float var1, float var2) {
      return new Rec0025(var0, var1, var2, f4000[0]);
   }
}

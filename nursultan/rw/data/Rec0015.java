package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.core.C0983;

public record Rec0015() {
   public C0983 f1000;
   public float f2000;
   private static boolean[] f3000;
   public float f4000;
   public boolean f5000;

   public float m2000() {
      return this.f2000;
   }

   public Rec0015(C0983 var1, float var2, float var3, boolean var4) {
      this.f1000 = var1;
      this.f4000 = var2;
      this.f2000 = var3;
      this.f5000 = var4;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0015,"rotation;yawSpeed;pitchSpeed;active",Rec0015::f1000,Rec0015::f4000,Rec0015::f2000,Rec0015::f5000>(
         this, var1
      );
   }

   private static void m6000() {
      boolean[] var128 = new boolean[(1 | -1) >>> 31];
      f3000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
   }

   public boolean m8000() {
      return this.f5000;
   }

   public float m10000() {
      return this.f4000;
   }

   public C0983 m14000() {
      return this.f1000;
   }

   public static Rec0015 m16000(C0983 var0, float var1, float var2) {
      return new Rec0015(var0, var1, var2, f3000[0]);
   }
}

package rw.data;

import KDFzREm.NXi;
import java.lang.runtime.ObjectMethods;
import rw.core.C0837;

public record Rec0204() {
   public NXi f1000;
   public C0837 f2000;
   public float f3000;
   public NXi f4000;
   private static float[] f5000;

   public NXi m2000() {
      return this.f1000;
   }

   public Rec0204(NXi var1, NXi var2, C0837 var3) {
      this(var1, var2, var3, f5000[0]);
   }

   public Rec0204(NXi var1, NXi var2, C0837 var3, float var4) {
      this.f4000 = var1;
      this.f1000 = var2;
      this.f2000 = var3;
      this.f3000 = var4;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0204,"origin;velocity;entityPrediction;landingRadius",Rec0204::f4000,Rec0204::f1000,Rec0204::f2000,Rec0204::f3000>(
         this, var1
      );
   }

   public NXi m6000() {
      return this.f4000;
   }

   public float m8000() {
      return this.f3000;
   }

   public Rec0202 m10000() {
      return this.m12000().m22000(null, this.f4000, this.f1000);
   }

   public C0837 m12000() {
      return this.f2000;
   }

   private static void m16000() {
      float[] var128 = new float[(1 | -1) >>> 31];
      f5000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
   }
}

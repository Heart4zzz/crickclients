package rw.data;

import java.lang.runtime.ObjectMethods;

public record Rec0200() {
   private static float[] f1000;
   private static float[] f2000;
   public double f3000;
   public float f4000;
   public static Object[] f5000;
   public float f6000;
   private static double[] f7000;

   public double m2000() {
      return ool0q<"rwdfoqhj",-1432837621,1082670212,1082670208,1082670209,-950758416,-876179736>(this);
   }

   private static void m6000() {
      f7000 = new double[]{0.05, 0.05, 0.03, 0.05, 0.03, 0.0};
   }

   public Rec0200(double var1, float var3, float var4) {
      this.f3000 = var1;
      this.f6000 = var3;
      this.f4000 = var4;
   }

   static {
      ntfClinit();
   }

   public boolean m8000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0200,"gravity;airDrag;waterDrag",Rec0200::f3000,Rec0200::f6000,Rec0200::f4000>(this, var1);
   }

   private static void m14000() {
      f2000 = new float[]{0.99F, 0.6F, 0.99F, 0.99F};
      f1000 = new float[]{0.99F, 0.8F, 0.99F, 0.8F, 0.99F, 0.8F, 1.0F, 0.8F};
   }

   private static void m16000() {
      f5000 = new Object[]{null, null, null, null, null, null};
   }

   public float m20000() {
      return this.f4000;
   }

   public float m28000() {
      return this.f6000;
   }
}

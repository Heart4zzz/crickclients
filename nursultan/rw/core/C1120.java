package rw.core;

public class C1120 {
   public Object[] f1000;
   private static float[] f2000;

   private void m2000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[3];
         Object[] var1 = this.f1000;
         var1[2] = f2000[0];
      }
   }

   C1120() {
      this.m2000();
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      f2000 = new float[]{0.0F};
   }
}

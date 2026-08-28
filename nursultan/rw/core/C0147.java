package rw.core;

public class C0147 {
   public Object[] f1000;
   private static float[] f2000;
   public static Object[] f3000;

   public C0147() {
      this.m10000();
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f3000 = new Object[]{null};
   }

   private void m10000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
         var1[0] = f2000[1];
      }
   }

   public float m16000() {
      return (Float)this.f1000[0];
   }

   public void m20000(float var1) {
      Float var6 = var1;
      this.f1000[0] = var6;
   }

   public static C0147 m22000() {
      C0147 var10000 = (C0147)f3000[0];
      Float var4 = f2000[0];
      var10000.f1000[0] = var4;
      return (C0147)f3000[0];
   }

   private static void m24000() {
      f2000 = new float[]{1.0F, 0.0F};
   }
}

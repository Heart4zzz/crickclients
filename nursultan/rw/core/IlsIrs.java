package rw.core;

public class IlsIrs extends C1013 {
   private static float[] f1000;
   public Object[] f2000;

   private static void m4000() {
      f1000 = new float[]{0.0F};
   }

   public IlsIrs(String var1, boolean var2, float var3) {
      super(var1, var2);
      this.m6000();
      Float var8 = var3;
      this.f2000[0] = var8;
   }

   static {
      ntfClinit();
   }

   private void m6000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[1];
         Object[] var1 = this.f2000;
         var1[0] = f1000[0];
      }
   }

   public float m2000() {
      this.m6000();
      return (Float)this.f2000[0];
   }
}

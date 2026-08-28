package rw.core;

import java.util.Objects;

public class C0979 {
   public Object[] f1000;
   private static String[] f2000;
   private static float[] f3000;

   public float m2000() {
      return (Float)this.f1000[1];
   }

   private static void m6000() {
      f2000 = new String[]{"Invalid range: min (%f) cannot be greater than max (%f)", "The range [%f, %f] is outside the valid range [%f, %f]"};
   }

   public C0979(float var1, float var2) {
      this.m12000();
      Float var7 = var1;
      this.f1000[0] = var7;
      Float var8 = var2;
      this.f1000[1] = var8;
      this.m24000();
   }

   static {
      ntfClinit();
   }

   public boolean m8000(Object var1) {
      if (!(var1 instanceof C0979 var2)) {
         return (boolean)0;
      } else {
         return (boolean)(Float.compare((Float)this.f1000[0], (Float)var2.f1000[0]) == 0 && Float.compare((Float)this.f1000[1], (Float)var2.f1000[1]) == 0
            ? 1
            : 0);
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash((Float)this.f1000[0], (Float)this.f1000[1]);
   }

   private void m12000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[2];
         Object[] var1 = this.f1000;
         var1[0] = f3000[0];
         var1[1] = f3000[1];
      }
   }

   private static void m18000() {
      f3000 = new float[]{0.0F, 0.0F};
   }

   public C0979 m22000(float var1) {
      Float var6 = var1;
      this.f1000[1] = var6;
      return this;
   }

   public void m24000() {
      if ((Float)this.f1000[0] > (Float)this.f1000[1]) {
         throw new IllegalArgumentException(String.format(f2000[0], (Float)this.f1000[0], (Float)this.f1000[1]));
      }
   }

   public void m30000(C0979 var1) {
      this.m24000();
      if ((Float)this.f1000[0] < (Float)var1.f1000[0] || (Float)this.f1000[1] > (Float)var1.f1000[1]) {
         throw new IllegalArgumentException(String.format(f2000[1], (Float)this.f1000[0], (Float)this.f1000[1], (Float)var1.f1000[0], (Float)var1.f1000[1]));
      }
   }

   public float m32000() {
      return (Float)this.f1000[0];
   }

   public C0979 m38000(float var1) {
      Float var6 = var1;
      this.f1000[0] = var6;
      return this;
   }
}

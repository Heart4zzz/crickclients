package rw.core;

import rw.data.Rec0108;

final class C0333 {
   private boolean f1000;
   private boolean f2000;
   private float f3000;
   private float f4000;
   private float f5000;
   private float f6000;
   private float f7000;
   private int f8000;

   private boolean m2000(Rec0108 var1, float var2) {
      if (this.f2000 == (var1 == null)) {
         return true;
      } else {
         return var1 != null && this.m8000(var1) ? true : !m6000(this.f7000, var2);
      }
   }

   private void m4000(Rec0108 var1, float var2) {
      this.f1000 = true;
      this.f2000 = var1 != null;
      if (var1 != null) {
         this.f3000 = var1.m10000();
         this.f4000 = var1.m2000();
         this.f5000 = var1.m8000();
         this.f6000 = var1.m6000();
      }

      this.f7000 = var2;
   }

   private static boolean m6000(float var0, float var1) {
      return Float.floatToIntBits(var0) == Float.floatToIntBits(var1);
   }

   private boolean m8000(Rec0108 var1) {
      return !m6000(this.f3000, var1.m10000()) || !m6000(this.f4000, var1.m2000()) || !m6000(this.f5000, var1.m8000()) || !m6000(this.f6000, var1.m6000());
   }

   int m10000(Rec0108 var1, float var2) {
      if (!this.f1000 || this.m2000(var1, var2)) {
         this.m4000(var1, var2);
         this.f8000++;
      }

      return this.f8000;
   }
}

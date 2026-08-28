package rw.core;

import rw.defs.Enum0046;

final class C0412 {
   float f1000;
   float f2000;
   float f3000;
   float f4000;
   float f5000;
   float f6000;
   float f7000;
   float f8000;
   String f9000;
   private boolean f10000;
   private boolean f11000;
   int f12000 = -1;

   float m2000(Enum0046 var1) {
      return var1 == Enum0046.f1000 ? this.f1000 : this.f2000;
   }

   void m4000(Enum0046 var1, float var2) {
      if (var1 == Enum0046.f1000) {
         this.f5000 = Math.max(0.0F, var2);
      } else {
         this.f6000 = Math.max(0.0F, var2);
      }
   }

   void m6000(Enum0046 var1) {
      float var2 = this.m2000(var1);
      this.m4000(var1, Math.min(var2, this.m22000(var1)));
      float var3 = this.m24000(var1) ? var2 : Math.min(var2, this.m12000(var1));
      this.m10000(var1, var3);
   }

   float m8000(Enum0046 var1) {
      return var1 == Enum0046.f1000 ? this.f3000 : this.f4000;
   }

   void m10000(Enum0046 var1, float var2) {
      if (var1 == Enum0046.f1000) {
         this.f7000 = Math.max(0.0F, var2);
      } else {
         this.f8000 = Math.max(0.0F, var2);
      }
   }

   float m12000(Enum0046 var1) {
      return var1 == Enum0046.f1000 ? this.f7000 : this.f8000;
   }

   void m14000(Enum0046 var1, float var2) {
      if (var1 == Enum0046.f1000) {
         this.f3000 = Math.max(0.0F, var2);
      } else {
         this.f4000 = Math.max(0.0F, var2);
      }
   }

   void m16000() {
      this.f1000 = 0.0F;
      this.f2000 = 0.0F;
      this.f3000 = 0.0F;
      this.f4000 = 0.0F;
      this.f5000 = 0.0F;
      this.f6000 = 0.0F;
      this.f7000 = 0.0F;
      this.f8000 = 0.0F;
      this.f9000 = null;
      this.f10000 = false;
      this.f11000 = false;
   }

   void m18000(Enum0046 var1, boolean var2) {
      if (var1 == Enum0046.f1000) {
         this.f10000 = var2;
      } else {
         this.f11000 = var2;
      }
   }

   void m20000(Enum0046 var1, float var2) {
      if (var1 == Enum0046.f1000) {
         this.f1000 = Math.max(0.0F, var2);
      } else {
         this.f2000 = Math.max(0.0F, var2);
      }
   }

   float m22000(Enum0046 var1) {
      return var1 == Enum0046.f1000 ? this.f5000 : this.f6000;
   }

   private boolean m24000(Enum0046 var1) {
      return var1 == Enum0046.f1000 ? this.f10000 : this.f11000;
   }
}

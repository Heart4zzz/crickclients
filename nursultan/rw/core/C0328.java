package rw.core;

import rw.data.Rec0119;

final class C0328 {
   private boolean f1000 = true;
   private float f2000;
   private float f3000;
   private float f4000;
   private float f5000;

   private void m2000(float var1, float var2, float var3, float var4) {
      if (!(var3 <= var1) && !(var4 <= var2)) {
         if (this.f1000) {
            this.f2000 = var1;
            this.f3000 = var2;
            this.f4000 = var3;
            this.f5000 = var4;
            this.f1000 = false;
         } else {
            this.f2000 = Math.min(this.f2000, var1);
            this.f3000 = Math.min(this.f3000, var2);
            this.f4000 = Math.max(this.f4000, var3);
            this.f5000 = Math.max(this.f5000, var4);
         }
      }
   }

   Rec0119 m4000() {
      return this.f1000 ? new Rec0119(0.0F, 0.0F, 0.0F, 0.0F) : new Rec0119(this.f2000, this.f3000, this.f4000 - this.f2000, this.f5000 - this.f3000);
   }

   void m6000(float var1, float var2, float var3, float var4) {
      if (!this.f1000) {
         this.f2000 = Math.max(this.f2000, var1);
         this.f3000 = Math.max(this.f3000, var2);
         this.f4000 = Math.min(this.f4000, var3);
         this.f5000 = Math.min(this.f5000, var4);
         if (this.f4000 <= this.f2000 || this.f5000 <= this.f3000) {
            this.f1000 = true;
         }
      }
   }

   boolean m8000() {
      return this.f1000;
   }

   void m10000() {
      this.f1000 = true;
      this.f2000 = 0.0F;
      this.f3000 = 0.0F;
      this.f4000 = 0.0F;
      this.f5000 = 0.0F;
   }

   void m12000(float var1, float var2, float var3, float var4) {
      if (Float.isFinite(var1) && Float.isFinite(var2) && Float.isFinite(var3) && Float.isFinite(var4)) {
         if (!(var3 <= 0.0F) && !(var4 <= 0.0F)) {
            this.m2000(var1, var2, var1 + var3, var2 + var4);
         }
      }
   }

   void m14000(C0328 var1) {
      if (!var1.f1000) {
         this.m2000(var1.f2000, var1.f3000, var1.f4000, var1.f5000);
      }
   }

   void m16000(float var1, float var2) {
      if (!this.f1000 && (var1 != 0.0F || var2 != 0.0F)) {
         this.f2000 += var1;
         this.f3000 += var2;
         this.f4000 += var1;
         this.f5000 += var2;
      }
   }
}

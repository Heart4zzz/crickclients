package rw.core;

import rw.data.Rec0096;

final class C0363 {
   private Rec0096 f1000;
   private int f2000;
   private int f3000;
   private int f4000;
   private boolean f5000;

   void m2000(Rec0096 var1, int var2, int var3, int var4) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
      this.f4000 = var4;
      this.f5000 = true;
   }

   Rec0096 m4000() {
      return this.f1000;
   }

   boolean m6000(int var1, int var2, int var3) {
      return this.f5000 && this.f2000 == var1 && this.f3000 == var2 && this.f4000 == var3;
   }
}

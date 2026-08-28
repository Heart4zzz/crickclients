package rw.core;

import rw.data.Rec0118;

final class C0335 {
   private Rec0118 f1000 = Rec0118.f3000;
   private boolean f2000;
   private int f3000;

   int m2000(Rec0118 var1) {
      Rec0118 var2 = var1 == null ? Rec0118.f3000 : var1;
      if (!this.f2000 || !this.f1000.m2000(var2)) {
         this.f1000 = var2;
         this.f2000 = true;
         this.f3000++;
      }

      return this.f3000;
   }
}

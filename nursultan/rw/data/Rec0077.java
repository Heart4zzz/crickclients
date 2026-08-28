package rw.data;

import java.lang.runtime.ObjectMethods;

record Rec0077() {
   private final int[] f1000;

   Rec0077(int[] var1) {
      this.f1000 = var1;
   }

   public final boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0077,"glyphs",Rec0077::f1000>(this, var1);
   }

   boolean m4000(int var1) {
      int var2 = 0;
      int var3 = this.f1000.length - 1;

      while (var2 <= var3) {
         int var4 = var2 + var3 >>> 1;
         if (this.f1000[var4] < var1) {
            var2 = var4 + 1;
         } else {
            if (this.f1000[var4] <= var1) {
               return true;
            }

            var3 = var4 - 1;
         }
      }

      return false;
   }

   public int[] m6000() {
      return this.f1000;
   }
}

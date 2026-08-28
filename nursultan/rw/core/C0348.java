package rw.core;

final class C0348 {
   private C0348() {
   }

   static int m2000(int var0) {
      if (var0 <= 1) {
         return 1;
      } else if (var0 > 1073741824) {
         throw new IllegalArgumentException("value is too large for power-of-two rounding: " + var0);
      } else {
         return Integer.highestOneBit(var0 - 1) << 1;
      }
   }
}

package net.minecraft.client.gui.font.providers;

record UnihexProvider$IntContents() {
   private final int[] N;
   private final int[] y;
   private final int[] L;

   UnihexProvider$IntContents(int[] var1, int[] var2, int[] var3) {
      this.N = var1;
      this.y = var2;
      this.L = var3;
   }

   int bitWidth(int var1) {
      int var2 = 0;
      int var3 = this.N.length - 1;

      while (var2 <= var3) {
         int var4 = var2 + var3 >>> 1;
         if (var1 < this.N[var4]) {
            var3 = var4 - 1;
         } else {
            if (var1 <= this.y[var4]) {
               return this.L[var4];
            }

            var2 = var4 + 1;
         }
      }

      return 0;
   }
}

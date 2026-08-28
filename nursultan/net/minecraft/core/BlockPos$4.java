package net.minecraft.core;

import KDFzREm.Ned;
import KDFzREm.Neo;
import com.google.common.collect.AbstractIterator;

class BlockPos$4 extends AbstractIterator<Ned> {
   private final Neo M;
   private int B;

   BlockPos$4(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
      this.i = var5;
      this.R = var6;
      this.M = new Neo();
   }

   protected Ned N() {
      if (this.B == this.N) {
         return (Ned)this.endOfData();
      } else {
         int var1 = this.B % this.y;
         int var2 = this.B / this.y;
         int var3 = var2 % this.L;
         int var4 = var2 / this.L;
         this.B++;
         return this.M.N(this.u + var1, this.i + var3, this.R + var4);
      }
   }
}

package net.minecraft.core;

import KDFzREm.NNGK;
import KDFzREm.NNtT;
import java.util.Spliterators.AbstractSpliterator;
import java.util.function.Consumer;

class SectionPos$1 extends AbstractSpliterator<NNGK> {
   final NNtT N;

   @Override
   public boolean tryAdvance(Consumer<? super NNGK> var1) {
      if (this.N.N()) {
         var1.accept(new NNGK(this.N.y(), this.N.L(), this.N.u()));
         return true;
      } else {
         return false;
      }
   }

   SectionPos$1(long var1, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      super(var1, var3);
      this.y = var4;
      this.L = var5;
      this.u = var6;
      this.i = var7;
      this.R = var8;
      this.M = var9;
      this.N = new NNtT(this.y, this.L, this.u, this.i, this.R, this.M);
   }
}

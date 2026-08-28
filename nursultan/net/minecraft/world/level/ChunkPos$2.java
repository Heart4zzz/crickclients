package net.minecraft.world.level;

import KDFzREm.Ngq;
import java.util.Spliterators.AbstractSpliterator;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

class ChunkPos$2 extends AbstractSpliterator<Ngq> {
   @Nullable
   private Ngq i;

   @Override
   public boolean tryAdvance(Consumer<? super Ngq> var1) {
      if (this.i == null) {
         this.i = this.N;
      } else {
         int var2 = this.i.B;
         int var3 = this.i.Z;
         if (var2 == this.y.B) {
            if (var3 == this.y.Z) {
               return false;
            }

            this.i = new Ngq(this.N.B, var3 + this.L);
         } else {
            this.i = new Ngq(var2 + this.u, var3);
         }
      }

      var1.accept(this.i);
      return true;
   }

   ChunkPos$2(long var1, int var3, Ngq var4, Ngq var5, int var6, int var7) {
      super(var1, var3);
      this.N = var4;
      this.y = var5;
      this.L = var6;
      this.u = var7;
   }
}

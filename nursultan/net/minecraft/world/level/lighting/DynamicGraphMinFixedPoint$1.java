package net.minecraft.world.level.lighting;

import KDFzREm.NNWV;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;

class DynamicGraphMinFixedPoint$1 extends Long2ByteOpenHashMap {
   DynamicGraphMinFixedPoint$1(NNWV var1, int var2, float var3, int var4) {
      super(var2, var3);
      this.y = var1;
      this.val$minMapSize = var4;
   }

   protected void rehash(int var1) {
      if (var1 > this.val$minMapSize) {
         super.rehash(var1);
      }
   }
}

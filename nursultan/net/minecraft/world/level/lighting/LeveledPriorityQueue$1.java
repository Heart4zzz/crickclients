package net.minecraft.world.level.lighting;

import KDFzREm.NNNXP;
import it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet;

class LeveledPriorityQueue$1 extends LongLinkedOpenHashSet {
   LeveledPriorityQueue$1(NNNXP var1, int var2, float var3, int var4) {
      super(var2, var3);
      this.y = var1;
      this.val$minSize = var4;
   }

   protected void rehash(int var1) {
      if (var1 > this.val$minSize) {
         super.rehash(var1);
      }
   }
}

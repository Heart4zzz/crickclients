package net.minecraft.world.level;

import KDFzREm.NjB;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

class LocalMobCapCalculator$MobCounts {
   private final Object2IntMap<NjB> counts = new Object2IntOpenHashMap(NjB.values().length);

   public boolean y(NjB var1) {
      return this.counts.getOrDefault(var1, 0) < var1.y();
   }

   public void N(NjB var1) {
      this.counts.computeInt(var1, (var0, var1x) -> var1x == null ? 1 : var1x + 1);
   }
}

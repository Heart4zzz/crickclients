package net.minecraft.world.level.entity;

import KDFzREm.NBf;
import KDFzREm.NZu;
import KDFzREm.NZy;
import KDFzREm.NbK;
import rw.api.Iface0515;

class UniquelyIdentifyable implements NZy {
   UniquelyIdentifyable(NZu var1, NbK var2) {
      this.y = var1;
      this.N = var2;
   }

   public <T> void N(NBf<T> var1, Iface0515<T> var2) {
      this.y.N(var1).m12000(this.N.method_5667(), var2);
   }
}

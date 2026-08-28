package net.minecraft.world.entity.ai.goal;

import KDFzREm.NGI;
import KDFzREm.NjD;
import KDFzREm.Njx;
import java.util.EnumSet;

class Goal$Flag extends Njx {
   public Goal$Flag(NGI var1) {
      this.N = var1;
      this.N(EnumSet.of(NjD.field_18405, NjD.field_18407, NjD.field_18406));
   }

   public boolean N() {
      return this.N.m() > 0;
   }
}

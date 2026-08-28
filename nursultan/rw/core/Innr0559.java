package rw.core;

import KDFzREm.NNhE;
import KDFzREm.NNrm;
import net.minecraft.world.entity.AgeableMob$AgeableMobGroupData;

public class Innr0559 extends AgeableMob$AgeableMobGroupData {
   public final NNhE[] f1000;

   public Innr0559(NNhE... var1) {
      super(false);
      this.f1000 = var1;
   }

   public NNhE m2000(NNrm var1) {
      return this.f1000[var1.y(this.f1000.length)];
   }
}

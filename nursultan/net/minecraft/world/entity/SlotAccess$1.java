package net.minecraft.world.entity;

import KDFzREm.NNSO;
import KDFzREm.NQo;
import java.util.function.Consumer;
import java.util.function.Supplier;

class SlotAccess$1 implements NNSO {
   SlotAccess$1(Supplier var1, Consumer var2) {
      this.val$getter = var1;
      this.val$setter = var2;
   }

   public NQo N() {
      return (NQo)this.val$getter.get();
   }

   public boolean N(NQo var1) {
      this.val$setter.accept(var1);
      return true;
   }
}

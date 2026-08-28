package net.minecraft.world.inventory;

import KDFzREm.NNni;

class DataSlot$2 extends NNni {
   DataSlot$2(int[] var1, int var2) {
      this.val$storage = var1;
      this.val$index = var2;
   }

   public int val$index() {
      return this.val$storage[this.val$index];
   }

   public void set(int var1) {
      this.val$storage[this.val$index] = var1;
   }
}

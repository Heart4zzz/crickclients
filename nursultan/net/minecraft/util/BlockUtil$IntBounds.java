package net.minecraft.util;

public class BlockUtil$IntBounds {
   public final int N;
   public final int y;

   public BlockUtil$IntBounds(int var1, int var2) {
      this.N = var1;
      this.y = var2;
   }

   @Override
   public String toString() {
      return "IntBounds{min=" + this.N + ", max=" + this.y + "}";
   }
}

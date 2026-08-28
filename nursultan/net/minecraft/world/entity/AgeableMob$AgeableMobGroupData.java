package net.minecraft.world.entity;

import KDFzREm.NjU;

public class AgeableMob$AgeableMobGroupData implements NjU {
   private int groupSize;
   private final boolean shouldSpawnBaby;
   private final float babySpawnChance;

   public boolean babySpawnChance() {
      return this.shouldSpawnBaby;
   }

   public AgeableMob$AgeableMobGroupData(boolean var1, float var2) {
      this.shouldSpawnBaby = var1;
      this.babySpawnChance = var2;
   }

   public AgeableMob$AgeableMobGroupData(float var1) {
      this(true, var1);
   }

   public AgeableMob$AgeableMobGroupData(boolean var1) {
      this(var1, 0.05F);
   }

   public float getBabySpawnChance() {
      return this.babySpawnChance;
   }

   public void increaseGroupSizeByOne() {
      this.groupSize++;
   }

   public int getGroupSize() {
      return this.groupSize;
   }
}

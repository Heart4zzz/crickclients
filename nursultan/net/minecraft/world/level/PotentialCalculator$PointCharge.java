package net.minecraft.world.level;

import KDFzREm.Ned;

class PotentialCalculator$PointCharge {
   private final Ned N;
   private final double charge;

   public PotentialCalculator$PointCharge(Ned var1, double var2) {
      this.N = var1;
      this.charge = var2;
   }

   public double N(Ned var1) {
      double var2 = this.N.method_10262(var1);
      return var2 == 0.0 ? Double.POSITIVE_INFINITY : this.charge / Math.sqrt(var2);
   }
}

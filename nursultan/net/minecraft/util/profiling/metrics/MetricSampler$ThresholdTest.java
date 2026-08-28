package net.minecraft.util.profiling.metrics;

import KDFzREm.NNNyB;

public class MetricSampler$ThresholdTest implements NNNyB {
   private final float N;
   private double y = Double.MIN_VALUE;

   public MetricSampler$ThresholdTest(float var1) {
      this.N = var1;
   }

   public boolean test(double var1) {
      boolean var3;
      if (this.y != Double.MIN_VALUE && !(var1 <= this.y)) {
         var3 = (var1 - this.y) / this.y >= this.N;
      } else {
         var3 = false;
      }

      this.y = var1;
      return var3;
   }
}

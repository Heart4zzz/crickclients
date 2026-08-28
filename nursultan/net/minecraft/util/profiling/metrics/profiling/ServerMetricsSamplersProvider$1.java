package net.minecraft.util.profiling.metrics.profiling;

import com.google.common.base.Ticker;
import java.util.function.LongSupplier;

class ServerMetricsSamplersProvider$1 extends Ticker {
   ServerMetricsSamplersProvider$1(LongSupplier var1) {
      this.val$timeSource = var1;
   }

   public long read() {
      return this.val$timeSource.getAsLong();
   }
}

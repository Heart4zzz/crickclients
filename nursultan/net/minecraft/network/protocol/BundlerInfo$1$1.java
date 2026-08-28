package net.minecraft.network.protocol;

import KDFzREm.NAC;
import KDFzREm.NNNVP;
import KDFzREm.NNNVT;
import java.util.ArrayList;
import java.util.List;
import org.jspecify.annotations.Nullable;

class BundlerInfo$1$1 implements NNNVT {
   private final List<NAC<? super T>> bundlePackets;

   BundlerInfo$1$1(NNNVP var1) {
      this.N = var1;
      this.bundlePackets = new ArrayList<>();
   }

   @Nullable
   public NAC<?> N(NAC<?> var1) {
      if (var1 == this.N.L) {
         return (NAC<?>)this.N.u.apply(this.bundlePackets);
      } else if (this.bundlePackets.size() >= 4096) {
         throw new IllegalStateException("Too many packets in a bundle");
      } else {
         this.bundlePackets.add(var1);
         return null;
      }
   }
}

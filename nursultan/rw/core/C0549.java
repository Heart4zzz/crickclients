package rw.core;

import KDFzREm.NNGK;
import KDFzREm.NNdq;
import KDFzREm.NNfp;
import com.google.common.collect.AbstractIterator;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import java.util.BitSet;
import java.util.Optional;
import net.caffeinemc.mods.lithium.common.util.Pos.SectionYCoord;

class C0549 extends AbstractIterator<R> {
   private int f1000;

   C0549(NNdq var1, BitSet var2, Long2ObjectMap var3, int var4, NNfp var5, int var6) {
      this.f2000 = var2;
      this.f3000 = var3;
      this.f4000 = var4;
      this.f5000 = var5;
      this.f6000 = var6;
      this.f1000 = this.f2000.nextSetBit(0);
   }

   protected R computeNext() {
      while (this.f1000 >= 0) {
         Optional var1 = (Optional)this.f3000.get(NNGK.y(this.f4000, SectionYCoord.fromSectionIndex(this.f5000, this.f1000), this.f6000));
         this.f1000 = this.f2000.nextSetBit(this.f1000 + 1);
         if (var1.isPresent()) {
            return (R)var1.get();
         }
      }

      return (R)this.endOfData();
   }
}

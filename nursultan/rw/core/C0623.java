package rw.core;

import KDFzREm.NhL;
import KDFzREm.NhU;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import java.util.function.IntConsumer;
import net.caffeinemc.mods.lithium.common.world.section.RandomTickingSectionDataHelper.LithiumBlockCounter;

class C0623 implements IntConsumer {
   int f1000;

   C0623(NhU var1, IntConsumer var2, LithiumBlockCounter var3, Int2IntOpenHashMap var4, NhL var5) {
      this.f2000 = var2;
      this.f3000 = var3;
      this.f4000 = var4;
      this.f5000 = var5;
      this.f1000 = 0;
   }

   public void m2000(int var1) {
      this.f2000.accept(var1);
      this.f1000++;
      if (this.f1000 % 248 == 0 || this.f1000 == 4096) {
         this.f3000.finishedCountingMinisection(this.f4000, this.f5000);
      }
   }
}

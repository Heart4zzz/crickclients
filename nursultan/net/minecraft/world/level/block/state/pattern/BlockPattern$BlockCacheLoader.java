package net.minecraft.world.level.block.state.pattern;

import KDFzREm.NNgC;
import KDFzREm.NSM;
import KDFzREm.Ned;
import com.google.common.cache.CacheLoader;

class BlockPattern$BlockCacheLoader extends CacheLoader<Ned, NSM> {
   private final NNgC N;
   private final boolean loadChunks;

   public BlockPattern$BlockCacheLoader(NNgC var1, boolean var2) {
      this.N = var1;
      this.loadChunks = var2;
   }

   public NSM N(Ned var1) {
      return new NSM(this.N, var1, this.loadChunks);
   }
}

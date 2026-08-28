package net.minecraft.world.level.chunk.storage;

import KDFzREm.NNNEh;
import KDFzREm.Ngq;
import KDFzREm.Nhe;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

class RegionFile$ChunkBuffer extends ByteArrayOutputStream {
   private final Ngq y;

   public RegionFile$ChunkBuffer(Nhe var1, Ngq var2) {
      super(8096);
      this.N = var1;
      super.write(0);
      super.write(0);
      super.write(0);
      super.write(0);
      super.write(var1.L.y());
      this.y = var2;
   }

   @Override
   public void close() throws IOException {
      ByteBuffer var1 = ByteBuffer.wrap(this.buf, 0, this.count);
      int var2 = this.count - 5 + 1;
      NNNEh.M.y(this.N.y, this.y, this.N.L, var2);
      var1.putInt(0, var2);
      this.N.N(this.y, var1);
   }
}

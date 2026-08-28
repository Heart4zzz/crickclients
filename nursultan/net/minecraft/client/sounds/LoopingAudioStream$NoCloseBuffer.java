package net.minecraft.client.sounds;

import java.io.FilterInputStream;
import java.io.InputStream;

class LoopingAudioStream$NoCloseBuffer extends FilterInputStream {
   LoopingAudioStream$NoCloseBuffer(InputStream var1) {
      super(var1);
   }

   @Override
   public void close() {
   }
}

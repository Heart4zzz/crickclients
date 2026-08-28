package com.mojang.blaze3d.platform;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import org.jspecify.annotations.Nullable;
import org.lwjgl.stb.STBIWriteCallback;

class NativeImage$WriteCallback extends STBIWriteCallback {
   private final WritableByteChannel output;
   @Nullable
   private IOException exception;

   public void invoke(long var1, long var3, int var5) {
      ByteBuffer var6 = getData(var3, var5);

      try {
         this.output.write(var6);
      } catch (IOException var8) {
         this.exception = var8;
      }
   }

   NativeImage$WriteCallback(WritableByteChannel var1) {
      this.output = var1;
   }

   public void throwIfException() throws IOException {
      if (this.exception != null) {
         throw this.exception;
      }
   }
}

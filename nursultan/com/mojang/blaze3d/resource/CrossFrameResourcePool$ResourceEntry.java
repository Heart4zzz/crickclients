package com.mojang.blaze3d.resource;

import KDFzREm.NNNNPL;

public final class CrossFrameResourcePool$ResourceEntry<T> implements AutoCloseable {
   final NNNNPL<T> N;
   final T value;
   int framesToLive;

   CrossFrameResourcePool$ResourceEntry(NNNNPL<T> var1, T var2, int var3) {
      this.N = var1;
      this.value = (T)var2;
      this.framesToLive = var3;
   }

   @Override
   public void close() {
      this.N.N(this.value);
   }
}

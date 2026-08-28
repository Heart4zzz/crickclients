package com.mojang.blaze3d.framegraph;

import KDFzREm.NNNNma;
import KDFzREm.NNNNmp;

class FrameGraphBuilder$ExternalResource<T> extends NNNNmp<T> {
   private final T resource;

   public FrameGraphBuilder$ExternalResource(String var1, NNNNma var2, T var3) {
      super(var1, var2);
      this.resource = (T)var3;
   }

   public T get() {
      return this.resource;
   }
}

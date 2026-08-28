package net.minecraft.network.syncher;

import KDFzREm.NNNu;

public interface EntityDataSerializer<T> extends NNNu<T> {
   default T copy(T var1) {
      return (T)var1;
   }
}

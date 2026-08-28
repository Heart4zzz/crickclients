package net.minecraft.client.multiplayer;

import KDFzREm.NNNFa;
import KDFzREm.NNNFf;
import KDFzREm.NNYH;
import org.jspecify.annotations.Nullable;

class ClientConfigurationPacketListenerImpl$2 extends NNNFa {
   ClientConfigurationPacketListenerImpl$2(NNNFf var1) {
      super(var1);
   }

   public void N(String var1, @Nullable NNYH var2) {
      NNNFf.N.warn("Commands are not supported in configuration phase, trying to run '{}'", var1);
   }
}

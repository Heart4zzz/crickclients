package rw.core;

import KDFzREm.NNNZT;
import KDFzREm.NNNZt;
import com.viaversion.viafabricplus.base.bedrock.NetherNetInetSocketAddress;
import dev.kastle.netty.channel.nethernet.config.NetherNetAddress;
import java.net.InetSocketAddress;

class C0458 implements NNNZT {
   public int m2000() {
      return 0;
   }

   C0458(NNNZt var1, NetherNetAddress var2) {
      this.f1000 = var2;
   }

   public InetSocketAddress m4000() {
      return new NetherNetInetSocketAddress(this.f1000);
   }

   public String m6000() {
      return this.f1000.getNetworkId();
   }

   public String m8000() {
      return this.f1000.getNetworkId();
   }
}

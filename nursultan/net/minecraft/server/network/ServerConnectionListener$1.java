package net.minecraft.server.network;

import KDFzREm.NAx;
import KDFzREm.NFU;
import KDFzREm.NNAc;
import KDFzREm.NNMG;
import KDFzREm.NNMU;
import KDFzREm.NNMm;
import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.timeout.ReadTimeoutHandler;

class ServerConnectionListener$1 extends ChannelInitializer<Channel> {
   ServerConnectionListener$1(NNMm var1) {
      this.N = var1;
   }

   protected void initChannel(Channel var1) {
      try {
         var1.config().setOption(ChannelOption.TCP_NODELAY, true);
      } catch (ChannelException var5) {
      }

      ChannelPipeline var2 = var1.pipeline().addLast("timeout", new ReadTimeoutHandler(30));
      if (this.N.N.A()) {
         var2.addLast("legacy_query", new NNMU(this.N.u()));
      }

      NFU.method_48311(var2, NAx.field_11941, false, null);
      int var3 = this.N.N.U();
      Object var4 = var3 > 0 ? new NNAc(var3) : new NFU(NAx.field_11941);
      this.N.L.add(var4);
      var4.method_53859(var2);
      var4.method_52912(new NNMG(this.N.N, (NFU)var4));
   }
}

package net.minecraft.network.protocol;

import KDFzREm.NAx;
import KDFzREm.NFU;
import KDFzREm.NNMT;
import KDFzREm.NNMW;
import KDFzREm.NNMm;
import KDFzREm.NlM;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;

class PacketFlow extends ChannelInitializer<Channel> {
   PacketFlow(NNMm var1) {
      this.N = var1;
   }

   protected void initChannel(Channel var1) {
      NFU var2 = new NFU(NAx.field_11941);
      var2.method_52912(new NNMW(this.N.N, var2));
      this.N.L.add(var2);
      ChannelPipeline var3 = var1.pipeline();
      NFU.method_52911(var3, NAx.field_11941);
      if (NlM.NK > 0) {
         var3.addLast("latency", new NNMT(NlM.NK, NlM.NV));
      }

      var2.method_53859(var3);
   }
}

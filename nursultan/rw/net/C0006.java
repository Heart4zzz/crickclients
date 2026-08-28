package rw.net;

import KDFzREm.NAx;
import KDFzREm.NFU;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;

class C0006 extends ChannelInitializer<Channel> {
   C0006(NFU var1) {
      this.f1000 = var1;
   }

   protected void initChannel(Channel var1) {
      ChannelPipeline var2 = var1.pipeline();
      NFU.method_52911(var2, NAx.field_11942);
      this.f1000.method_53859(var2);
   }
}

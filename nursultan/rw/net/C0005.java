package rw.net;

import KDFzREm.NFU;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelPromise;

class C0005 extends ChannelOutboundHandlerAdapter {
   C0005(NFU var1) {
   }

   public void m2000(ChannelHandlerContext var1, Object var2, ChannelPromise var3) throws Exception {
      super.write(var1, var2, var3);
   }
}

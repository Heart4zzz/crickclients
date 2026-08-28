package net.minecraft.server.jsonrpc;

import KDFzREm.NiR;
import KDFzREm.NiS;
import KDFzREm.Nix;
import KDFzREm.NuJ;
import KDFzREm.Nug;
import KDFzREm.Nuj;
import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;
import io.netty.handler.ssl.SslContext;

class ManagementServer$1 extends ChannelInitializer<Channel> {
   ManagementServer$1(NuJ var1, SslContext var2, NiR var3, Nug var4) {
      this.u = var1;
      this.val$sslContext = var2;
      this.y = var3;
      this.L = var4;
   }

   protected void initChannel(Channel var1) {
      try {
         var1.config().setOption(ChannelOption.TCP_NODELAY, true);
      } catch (ChannelException var3) {
      }

      ChannelPipeline var2 = var1.pipeline();
      if (this.val$sslContext != null) {
         var2.addLast(new ChannelHandler[]{this.val$sslContext.newHandler(var1.alloc())});
      }

      var2.addLast(new ChannelHandler[]{new HttpServerCodec()})
         .addLast(new ChannelHandler[]{new HttpObjectAggregator(65536)})
         .addLast(new ChannelHandler[]{this.u.N})
         .addLast(new ChannelHandler[]{new WebSocketServerProtocolHandler("/")})
         .addLast(new ChannelHandler[]{new Nix()})
         .addLast(new ChannelHandler[]{new NiS()})
         .addLast(new ChannelHandler[]{new Nuj(var1, this.u, this.y, this.L)});
   }
}

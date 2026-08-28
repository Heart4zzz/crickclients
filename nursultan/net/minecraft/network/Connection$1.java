package net.minecraft.network;

import KDFzREm.NAN;
import KDFzREm.NAx;
import KDFzREm.NFU;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.proxy.Socks4ProxyHandler;
import io.netty.handler.proxy.Socks5ProxyHandler;
import io.netty.handler.timeout.ReadTimeoutHandler;
import java.net.InetSocketAddress;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.fiw.proxyserver.Proxy;
import ru.fiw.proxyserver.ProxyServer;
import ru.fiw.proxyserver.Proxy.ProxyType;

class Connection$1 extends ChannelInitializer<Channel> {
   Connection$1(NFU var1) {
      this.N = var1;
   }

   private void y(Channel var1, CallbackInfo var2) {
      ProtocolTranslator.injectViaPipeline(this.N, var1);
   }

   private void N(Channel var1, CallbackInfo var2) {
      Proxy var3 = ProxyServer.proxy;
      if (ProxyServer.proxyEnabled) {
         ProxyServer.lastUsedProxy = var3;
         if (var3.type == ProxyType.SOCKS5) {
            var1.pipeline()
               .addFirst(
                  new ChannelHandler[]{
                     new Socks5ProxyHandler(
                        new InetSocketAddress(var3.getIp(), var3.getPort()),
                        var3.username.isEmpty() ? null : var3.username,
                        var3.password.isEmpty() ? null : var3.password
                     )
                  }
               );
         } else {
            var1.pipeline()
               .addFirst(
                  new ChannelHandler[]{
                     new Socks4ProxyHandler(new InetSocketAddress(var3.getIp(), var3.getPort()), var3.username.isEmpty() ? null : var3.username)
                  }
               );
         }
      } else {
         ProxyServer.lastUsedProxy = new Proxy();
      }

      ProxyServer.proxyMenuButton.method_25355(NAN.y("Proxy: " + ProxyServer.getLastUsedProxyIp()));
   }

   protected void initChannel(Channel var1) {
      this.N(var1, null);

      try {
         var1.config().setOption(ChannelOption.TCP_NODELAY, true);
      } catch (ChannelException var3) {
      }

      ChannelPipeline var2 = var1.pipeline().addLast("timeout", new ReadTimeoutHandler(30));
      NFU.method_48311(var2, NAx.field_11942, false, this.N.field_45955);
      this.N.method_53859(var2);
      this.y(var1, null);
   }
}

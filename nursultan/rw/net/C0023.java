package rw.net;

import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.codec.http.DefaultHttpHeaders;
import io.netty.handler.codec.http.HttpClientCodec;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandler;
import io.netty.handler.codec.http.websocketx.WebSocketFrameAggregator;
import io.netty.handler.codec.http.websocketx.WebSocketVersion;
import java.util.function.Consumer;
import java.util.function.Supplier;
import rw.defs.IlmOnqm;

public class C0023 extends ChannelInitializer<Channel> {
   private static String[] f1000;
   public static Object[] f2000;
   private static String[] f3000;
   public Object[] f4000;

   private void m10000() {
      if (this.f4000 == null) {
         this.f4000 = new Object[5];
         Object[] var1 = this.f4000;
      }
   }

   public C0023(SocketClient var1, C0025 var2, Supplier<IlpOks> var3, Consumer<IlpOks> var4, Runnable var5) {
      this.m10000();
      this.f4000[0] = var1;
      this.f4000[1] = var2;
      this.f4000[2] = var3;
      this.f4000[3] = var4;
      this.f4000[4] = var5;
   }

   static {
      ntfClinit();
   }

   private static void m34000() {
      f2000 = new Object[]{4194304, 65536};
   }

   private static void m42000() {
      f3000 = new String[]{"http_codec", "http_aggregator", "ws_protocol", "ws_frame_aggregator"};
      f1000 = new String[]{"ws_frame_to_buf", "decoder", "ws_buf_to_frame", "encoder", "packet_handler"};
   }

   public void initChannel(Channel var1) {
      IlpOks var2 = (IlpOks)((Supplier)this.f4000[2]).get();
      ((Consumer)this.f4000[3]).accept(var2);
      ChannelPipeline var3 = var1.pipeline();
      if (((SocketClient)this.f4000[0]).m16000() && !((C0025)this.f4000[1]).m20000(var3, var1, (SocketClient)this.f4000[0])) {
         ((Runnable)this.f4000[4]).run();
      } else {
         var3.addLast(f3000[0], new HttpClientCodec())
            .addLast(f3000[1], new HttpObjectAggregator(65536))
            .addLast(
               f3000[2],
               new WebSocketClientProtocolHandler(((SocketClient)this.f4000[0]).m6000(), WebSocketVersion.V13, null, false, new DefaultHttpHeaders(), 4194304)
            )
            .addLast(f3000[3], new WebSocketFrameAggregator(4194304))
            .addLast(f1000[0], new C0012())
            .addLast(f1000[1], new C0004((IlmOnqm)IlmOnqm.f2000[0]))
            .addLast(f1000[2], new C0003())
            .addLast(f1000[3], new OlqIrpt((IlmOnqm)IlmOnqm.f2000[1]))
            .addLast(f1000[4], var2);
         var2.m44000(var1);
      }
   }
}

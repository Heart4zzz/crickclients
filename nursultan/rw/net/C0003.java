package rw.net;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
import java.util.List;

public class C0003 extends MessageToMessageEncoder<ByteBuf> {
   static {
      ntfClinit();
   }

   public void m4000(ChannelHandlerContext var1, ByteBuf var2, List<Object> var3) {
      var3.add(new BinaryWebSocketFrame(var2.retain()));
   }
}

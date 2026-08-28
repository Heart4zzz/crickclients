package rw.net;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.CorruptedFrameException;
import io.netty.handler.codec.MessageToMessageDecoder;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
import io.netty.handler.codec.http.websocketx.WebSocketFrame;
import java.util.List;

public class C0012 extends MessageToMessageDecoder<WebSocketFrame> {
   private static String[] f1000;

   static {
      ntfClinit();
   }

   private static void m8000() {
      f1000 = new String[]{"Only binary websocket frames are supported"};
   }

   public void m10000(ChannelHandlerContext var1, WebSocketFrame var2, List<Object> var3) {
      if (var2 instanceof BinaryWebSocketFrame var4) {
         var3.add(var4.content().retain());
      } else {
         throw new CorruptedFrameException(f1000[0]);
      }
   }
}

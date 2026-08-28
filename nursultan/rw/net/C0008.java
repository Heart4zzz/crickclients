package rw.net;

import KDFzREm.NAC;
import KDFzREm.NNNNNu;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelPromise;
import io.netty.handler.codec.EncoderException;
import io.netty.util.ReferenceCountUtil;

public class C0008 extends ChannelOutboundHandlerAdapter {
   public void m2000(ChannelHandlerContext var1, Object var2, ChannelPromise var3) throws Exception {
      if (var2 instanceof NAC) {
         ReferenceCountUtil.release(var2);
         throw new EncoderException("Pipeline has no outbound protocol configured, can't process packet " + var2);
      } else {
         if (var2 instanceof NNNNNu var4) {
            try {
               var4.run(var1);
            } finally {
               ReferenceCountUtil.release(var2);
            }

            var3.setSuccess();
         } else {
            var1.write(var2, var3);
         }
      }
   }
}

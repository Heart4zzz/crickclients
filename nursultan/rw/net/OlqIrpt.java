package rw.net;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import io.netty.util.AttributeKey;
import io.netty.util.internal.logging.InternalLogger;
import java.io.IOException;
import rw.defs.IlmOnqm;

public class OlqIrpt extends MessageToByteEncoder<PacketHandlers<?>> {
   private static String[] f1000;
   public static Object[] f2000;
   public Object[] f3000;

   private void m4000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[1];
         Object[] var1 = this.f3000;
      }
   }

   public OlqIrpt(IlmOnqm var1) {
      this.m4000();
      this.f3000[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f1000 = new String[]{"Can't serialize unregistered packet", "Dropping {} for peer protocol version {}"};
   }

   private static void m18000() {
      f2000 = new Object[]{null};
   }

   private static int m24000(ChannelHandlerContext var0) {
      Short var1 = (Short)var0.channel().attr((AttributeKey)Enum0031.f3000[3]).get();
      return var1 != null ? var1 : 16;
   }

   public void m30000(ChannelHandlerContext var1, PacketHandlers<?> var2, ByteBuf var3) throws Exception {
      Enum0031 var4 = (Enum0031)var1.channel().attr((AttributeKey)Enum0031.f3000[2]).get();
      if (var4 == null) {
         throw new IllegalStateException("ProtocolType unknown: " + var2);
      } else {
         Integer var5 = var4.m28000((IlmOnqm)this.f3000[0], var2);
         if (var5 == null) {
            throw new IOException(f1000[0]);
         } else {
            int var6 = m24000(var1);
            if (!var4.m30000((IlmOnqm)this.f3000[0], var2, var6)) {
               ((InternalLogger)f2000[0]).debug(f1000[1], var2.getClass().getSimpleName(), var6);
            } else {
               C0030.m28000(var3, var5);
               var2.m4000(new PacketBuf(var3, (short)var6));
            }
         }
      }
   }
}

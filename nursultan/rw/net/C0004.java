package rw.net;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.util.AttributeKey;
import io.netty.util.internal.logging.InternalLogger;
import java.util.List;
import rw.defs.IlmOnqm;

public class C0004 extends ByteToMessageDecoder {
   public Object[] f1000;
   private static String[] f2000;
   public static Object[] f3000;

   private static void m2000() {
      f2000 = new String[]{
         "ProtocolType unknown for inbound frame",
         "Skipping unsupported packet id {} ({}/{}, protocol version {})",
         "Packet {}/{} ({}) left {} extra bytes, skipping tail",
         "Failed to decode packet id {} ({}/{}, protocol version {}), skipping frame"
      };
   }

   public C0004(IlmOnqm var1) {
      this.m18000();
      this.f1000[0] = var1;
   }

   static {
      ntfClinit();
   }

   public void m8000(ChannelHandlerContext var1, ByteBuf var2, List<Object> var3) {
      if (var2.isReadable()) {
         Enum0031 var4 = (Enum0031)var1.channel().attr((AttributeKey)Enum0031.f3000[2]).get();
         if (var4 == null) {
            throw new IllegalStateException(f2000[0]);
         } else {
            int var5 = m26000(var1);
            int var6 = -1;

            try {
               var6 = C0030.m20000(var2);
               PacketHandlers var7 = var4.m42000((IlmOnqm)this.f1000[0], var6, var5);
               if (var7 == null) {
                  ((InternalLogger)f3000[0]).warn(f2000[1], new Object[]{var6, var4.name(), (IlmOnqm)this.f1000[0], var5});
                  var2.skipBytes(var2.readableBytes());
                  return;
               }

               var7.m2000(new PacketBuf(var2, (short)var5));
               int var8 = var2.readableBytes();
               if (var8 > 0) {
                  ((InternalLogger)f3000[0]).warn(f2000[2], new Object[]{var4.name(), var6, var7.getClass().getSimpleName(), var8});
                  var2.skipBytes(var8);
               }

               var3.add(var7);
            } catch (Exception var9) {
               ((InternalLogger)f3000[0]).error(f2000[3], new Object[]{var6, var4.name(), (IlmOnqm)this.f1000[0], var5, var9});
               var2.skipBytes(var2.readableBytes());
            }
         }
      }
   }

   private void m18000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }

   private static int m26000(ChannelHandlerContext var0) {
      Short var1 = (Short)var0.channel().attr((AttributeKey)Enum0031.f3000[3]).get();
      return var1 != null ? var1 : 16;
   }

   private static void m34000() {
      f3000 = new Object[]{null};
   }
}

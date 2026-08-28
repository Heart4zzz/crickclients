package rw.net;

import io.netty.channel.Channel;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandler.ClientHandshakeStateEvent;
import io.netty.util.AttributeKey;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.logging.log4j.Logger;
import rw.NursultanClient;
import rw.api.Iface0032;
import rw.api.Iface0033;
import rw.core.C0590;
import rw.core.C0959;
import rw.core.C1204;
import rw.data.IlsitkOq;
import rw.data.Rec0219;
import rw.data.Rec0302;

public class IlpOks extends SimpleChannelInboundHandler<PacketHandlers<Iface0033>> {
   private static long[] f1000;
   private static short[] f2000;
   private static short[] f3000;
   public static Object[] f4000;
   private static String[] f5000;
   private static short[] f6000;
   private static short[] f7000;
   private static short[] f8000;
   private static short[] f9000;
   private static short[] f10000;
   private static short[] f11000;
   private static short[] f12000;
   private static short[] f13000;
   private static short[] f14000;
   public Object[] f15000;

   public boolean m2000(Channel var1) {
      return (boolean)(var1 != null && var1.isActive() ? 1 : 0);
   }

   private void m6000(PacketHandlers<?> var1, ChannelFutureListener var2) {
      Channel var3 = (Channel)this.f15000[2];
      if (this.m2000(var3)) {
         if (var3.eventLoop().inEventLoop()) {
            this.m40000(var1, var2);
         } else {
            var3.eventLoop().execute(() -> this.m40000(var1, var2));
         }
      }
   }

   public void m8000() {
      Channel var1 = (Channel)this.f15000[2];
      if (var1 != null) {
         var1.config().setAutoRead((boolean)0);
      }
   }

   private static void m12000() {
      f13000 = new short[]{2, 1, 3};
      f3000 = new short[]{5, 3, 3};
      f12000 = new short[]{3, 0};
      f7000 = new short[]{0, 0, 2, 2};
      f14000 = new short[]{2, 3, 2, 2, 5, 2};
      f8000 = new short[]{2, 2};
      f11000 = new short[]{1, 5, 5, 0};
      f10000 = new short[]{2, 2, 2, 3, 4};
      f2000 = new short[]{4, 4, 4, 0, 0, 5, 1};
      f9000 = new short[]{0, 4, 2, 2};
      f6000 = new short[]{2, 2, 2, 0, 0, 2};
   }

   public IlpOks(SocketConnector var1) {
      this.m26000();
      AtomicBoolean var6 = new AtomicBoolean(false);
      this.f15000[0] = var6;
      C0029 var7 = new C0029(new IlsitkOq(() -> (Channel)this.f15000[2], this::m6000, 32, this::m74000, var0 -> ((Logger)f4000[0]).error(f5000[5], var0)));
      this.f15000[5] = var7;
      this.f15000[1] = var1;
   }

   static {
      ntfClinit();
   }

   private static void m16000() {
      f4000 = new Object[]{null, 32};
   }

   private static void m22000() {
      f5000 = new String[]{
         "Error while receiving packet: {}",
         "Connection reset: {}",
         "Exception in pipeline (channel open={}): {}",
         "Pending packets queue overflow ({}), dropping {} and closing connection",
         "Auth packet write failed",
         "Error while draining pending packet"
      };
   }

   private void m24000() {
      if ((ScheduledFuture)this.f15000[4] != null && !((ScheduledFuture)this.f15000[4]).isCancelled()) {
         ((ScheduledFuture)this.f15000[4]).cancel((boolean)0);
         Object var5 = null;
         this.f15000[4] = var5;
      }
   }

   private void m26000() {
      if (this.f15000 == null) {
         this.f15000 = new Object[6];
         Object[] var1 = this.f15000;
      }
   }

   private static void m28000() {
      f1000 = new long[]{0L, 1L};
   }

   public void m30000() {
      Channel var1 = (Channel)this.f15000[2];
      if (this.m2000(var1)) {
         this.m8000();
         var1.close();
      }
   }

   private void m40000(PacketHandlers<?> var1, ChannelFutureListener var2) {
      Channel var3 = (Channel)this.f15000[2];
      if (this.m2000(var3)) {
         if (var2 != null) {
            var3.writeAndFlush(var1).addListener(var2);
         } else {
            var3.writeAndFlush(var1);
         }
      }
   }

   public boolean m42000() {
      Channel var1 = (Channel)this.f15000[2];
      return (boolean)(var1 != null
            && var1.hasAttr((AttributeKey)Enum0031.f3000[2])
            && var1.attr((AttributeKey)Enum0031.f3000[2]).get() == (Enum0031)Enum0031.f3000[1]
         ? 1
         : 0);
   }

   public void m44000(Channel var1) {
      this.f15000[2] = var1;
      Rec0219 var7 = new Rec0219((SocketConnector)this.f15000[1], this);
      this.f15000[3] = var7;
   }

   private void m50000() {
      Iface0033 var2 = (Iface0033)this.f15000[3];
      if (var2 instanceof Iface0032 var1) {
         var1.m2000();
      }
   }

   public void m56000(ChannelHandlerContext var1, PacketHandlers<Iface0033> var2) {
      Iface0033 var3 = (Iface0033)this.f15000[3];
      if (this.m2000(var1.channel()) && var3 != null && var3.m4000()) {
         try {
            var2.m6000(var3);
         } catch (Exception var5) {
            ((Logger)f4000[0]).error(f5000[0], var2, var5);
         }
      }
   }

   public void m58000(PacketHandlers<?> var1) {
      this.m78000(var1, null);
   }

   public void m64000(Enum0031 var1) {
      Channel var2 = (Channel)this.f15000[2];
      if (var2 != null) {
         var2.attr((AttributeKey)Enum0031.f3000[2]).set(var1);
         var2.config().setAutoRead((boolean)1);
         ((C0029)this.f15000[5]).m22000(var1);
      }
   }

   public <T extends Iface0033> void m66000(T var1) {
      this.f15000[3] = var1;
   }

   public void m68000(Channel var1) {
      if (((AtomicBoolean)this.f15000[0]).compareAndSet(false, true)) {
         this.f15000[2] = var1;
         var1.eventLoop()
            .execute(
               () -> {
                  if (this.m2000(var1)) {
                     this.m64000((Enum0031)Enum0031.f3000[f9000[0]]);
                     io.netty.util.concurrent.ScheduledFuture var7 = var1.eventLoop().scheduleWithFixedDelay(this::m50000, 0L, 1L, TimeUnit.SECONDS);
                     this.f15000[f9000[1]] = var7;
                     C1204 var2 = new C1204(
                        (short)16,
                        (byte)2,
                        NursultanClient.m14000().m34000().m32000(),
                        ((C0959)NursultanClient.f13000[f9000[2]]).m20000(),
                        ((C0959)NursultanClient.f13000[f9000[3]]).m8000(),
                        ((C0959)NursultanClient.f13000[2]).m22000().m12000(),
                        ((C0959)NursultanClient.f13000[2]).m42000(),
                        ((C0959)NursultanClient.f13000[2]).m16000()
                     );
                     var1.writeAndFlush(var2).addListener(var0 -> {
                        if (!var0.isSuccess()) {
                           ((Logger)f4000[0]).error(f5000[4], var0.cause());
                        }
                     });
                  }
               }
            );
      }
   }

   public void m70000(PacketHandlers<?> var1, Enum0031 var2, ChannelFutureListener var3) {
      ((C0029)this.f15000[5]).m30000(var1, var2, var3);
   }

   private void m74000(Rec0302 var1) {
      ((Logger)f4000[0]).warn(f5000[3], 32, var1.m8000().getClass().getSimpleName());
      this.m30000();
   }

   public boolean m76000() {
      return this.m2000((Channel)this.f15000[2]);
   }

   public void m78000(PacketHandlers<?> var1, ChannelFutureListener var2) {
      ((C0029)this.f15000[5]).m30000(var1, Enum0031.m36000(var1), var2);
   }

   public void exceptionCaught(ChannelHandlerContext var1, Throwable var2) {
      if (C0590.m8000(var2)) {
         ((Logger)f4000[0]).debug(f5000[1], var2.getMessage());
         var1.close();
      } else {
         ((Logger)f4000[0]).error(f5000[2], this.m2000(var1.channel()), var2.getMessage(), var2);
         if (this.m2000(var1.channel())) {
            this.m30000();
         }
      }
   }

   public void userEventTriggered(ChannelHandlerContext var1, Object var2) throws Exception {
      if (var2 == ClientHandshakeStateEvent.HANDSHAKE_COMPLETE) {
         this.m68000(var1.channel());
      } else {
         super.userEventTriggered(var1, var2);
      }
   }

   public void channelInactive(ChannelHandlerContext var1) throws Exception {
      this.m24000();
      ((C0029)this.f15000[5]).m28000();
      Iface0033 var2 = (Iface0033)this.f15000[3];
      if (var2 != null) {
         var2.m2000(var1.channel());
         Object var7 = null;
         this.f15000[3] = var7;
      }

      super.channelInactive(var1);
   }
}

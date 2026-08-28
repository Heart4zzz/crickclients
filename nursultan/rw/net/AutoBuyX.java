package rw.net;

import KDFzREm.NNuU;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import java.io.File;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.logging.log4j.Logger;
import rw.core.C1188;
import rw.core.C1235;
import rw.setting.C0106;

public class AutoBuyX {
   public static Object[] f1000;
   private static String[] f2000;
   public Object[] f3000;
   private static String[] f4000;
   private static String[] f5000;
   private static String[] f6000;

   public void m6000() {
      if (((AtomicBoolean)this.f3000[0]).get()) {
         ((Logger)f1000[0]).warn(f6000[0]);
      } else {
         Thread var1 = new Thread(
            () -> {
               NioEventLoopGroup var9 = new NioEventLoopGroup();
               this.f3000[1] = var9;

               try {
                  int var1x = m18000();
                  URI var2 = new URI("ws://127.0.0.1:" + var1x + "/autobuy");
                  Bootstrap var3 = new Bootstrap();
                  ((Bootstrap)((Bootstrap)((Bootstrap)var3.group((EventLoopGroup)this.f3000[1])).channel(NioSocketChannel.class))
                        .option(ChannelOption.TCP_NODELAY, true))
                     .handler(new AutoBuyXPart(this, var2));
                  Channel var10 = var3.connect(var2.getHost(), var2.getPort()).sync().channel();
                  this.f3000[2] = var10;
                  ((Channel)this.f3000[2]).closeFuture().sync();
               } catch (Exception var13) {
                  C0106.m32000(C1188.m16000(f5000[1], var13.getMessage()));
                  ((Logger)f1000[0]).error(f5000[2], var13.getMessage(), var13);
               } finally {
                  ((AtomicBoolean)this.f3000[0]).set((boolean)0);
                  if ((EventLoopGroup)this.f3000[1] != null) {
                     ((EventLoopGroup)this.f3000[1]).shutdownGracefully();
                  }
               }
            },
            f6000[1]
         );
         var1.setDaemon((boolean)1);
         var1.start();
      }
   }

   private static void m8000() {
      f6000 = new String[]{"AutoBuy client already connected", "AutoBuy-WebSocket-Client", "AutoBuy client is not connected - stop has been skipped"};
      f2000 = new String[]{"auto-buy-error", "AutoBuy error during stop: {}"};
      f4000 = new String[]{
         "auto-buy-error",
         "Not connected to server, and trying to send packet",
         "Not connected to server, and trying to send packet: {}",
         "auto-buy-error",
         "Channel is not active, and trying to send packet",
         "Channel is not active, and trying to send packet: {}",
         "port.tmp",
         "auto-buy-port-file-empty"
      };
      f5000 = new String[]{"auto-buy-port-file-empty", "auto-buy-error", "AutoBuy error during start: {}"};
   }

   public AutoBuyX() {
      this.m56000();
      AtomicBoolean var5 = new AtomicBoolean(false);
      this.f3000[0] = var5;
   }

   static {
      ntfClinit();
   }

   private static int m18000() throws Exception {
      File var0 = (File)NNuU.Nq().l[1];
      Path var1 = var0.toPath().resolve(f4000[6]);
      if (!Files.exists(var1)) {
         throw new IllegalStateException(C1235.m36000(f4000[7]));
      } else {
         String var2 = Files.readString(var1).trim();
         if (var2.isBlank()) {
            throw new IllegalStateException(C1235.m36000(f5000[0]));
         } else {
            return Integer.parseInt(var2);
         }
      }
   }

   private static void m36000() {
      f1000 = new Object[]{null};
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void m46000() {
      if (!((AtomicBoolean)this.f3000[0]).get()) {
         ((Logger)f1000[0]).warn(f6000[2]);
      } else {
         boolean var5 = false /* VF: Semaphore variable */;

         label64: {
            try {
               var5 = true;
               if ((Channel)this.f3000[2] != null && ((Channel)this.f3000[2]).isOpen()) {
                  ((Channel)this.f3000[2]).close();
               }

               if ((EventLoopGroup)this.f3000[1] != null) {
                  ((EventLoopGroup)this.f3000[1]).shutdownGracefully();
                  var5 = false;
               } else {
                  var5 = false;
               }
               break label64;
            } catch (Exception var6) {
               C0106.m32000(C1188.m16000(f2000[0], var6.getMessage()));
               ((Logger)f1000[0]).error(f2000[1], var6.getMessage(), var6);
               var5 = false;
            } finally {
               if (var5) {
                  ((AtomicBoolean)this.f3000[0]).set((boolean)0);
               }
            }

            ((AtomicBoolean)this.f3000[0]).set((boolean)0);
            return;
         }

         ((AtomicBoolean)this.f3000[0]).set((boolean)0);
      }
   }

   public boolean m52000() {
      return (boolean)(((AtomicBoolean)this.f3000[0]).get()
            && (Channel)this.f3000[2] != null
            && ((Channel)this.f3000[2]).isOpen()
            && ((Channel)this.f3000[2]).isActive()
         ? 0
         : 1);
   }

   private void m56000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[3];
         Object[] var1 = this.f3000;
      }
   }

   public AtomicBoolean m58000() {
      return (AtomicBoolean)this.f3000[0];
   }

   public void m62000(String var1) {
      if (this.m52000()) {
         C0106.m32000(C1188.m16000(f4000[0], f4000[1]));
         ((Logger)f1000[0]).error(f4000[2], var1);
      } else {
         Channel var2 = (Channel)this.f3000[2];
         if (var2 != null && var2.isActive()) {
            var2.writeAndFlush(new TextWebSocketFrame(var1));
         } else {
            C0106.m32000(C1188.m16000(f4000[3], f4000[4]));
            ((Logger)f1000[0]).error(f4000[5], var1);
         }
      }
   }
}

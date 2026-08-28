package rw.net;

import KDFzREm.NNWi;
import KDFzREm.NNuU;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.util.concurrent.GlobalEventExecutor;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.logging.log4j.Logger;
import rw.core.C1188;
import rw.core.C1235;
import rw.setting.C0106;

public class Auto {
   private static String[] f1000;
   private static boolean[] f2000;
   private static boolean[] f3000;
   public Object[] f4000;
   private static boolean[] f5000;
   private static boolean[] f6000;
   private static String[] f7000;
   private static boolean[] f8000;
   private static String[] f9000;
   public static Object[] f10000;

   public boolean m2000() {
      return (boolean)(this.m64000() && !((ChannelGroup)this.f4000[0]).isEmpty() ? 1 : 0);
   }

   public Auto() {
      this.m54000();
      DefaultChannelGroup var5 = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);
      this.f4000[0] = var5;
      AtomicBoolean var6 = new AtomicBoolean(false);
      this.f4000[1] = var6;
   }

   static {
      ntfClinit();
   }

   private static void m16000() {
      f8000 = new boolean[]{false, true, false, true};
      f6000 = new boolean[]{false, false, true, true, true, false, true, false};
      f5000 = new boolean[]{false, false, false, false, false, true, true, false};
      f3000 = new boolean[]{true, true, true, false, false, false, true, false};
      f2000 = new boolean[]{false, false, false, false, true};
   }

   private static void m22000() {
      f9000 = new String[]{
         "AutoBuy server is already running on port {}",
         "AutoBuy server is not running - stop has been skipped",
         "AutoBuy server stopped",
         "auto-buy-error",
         "AutoBuy server error during stop: {}",
         "AutoBuy server is already running - start has been skipped",
         "AutoBuy-WebSocket-Server"
      };
      f7000 = new String[]{"port.tmp", "Failed to write port to file: {}", "auto-buy-error"};
      f1000 = new String[]{
         "127.0.0.1",
         "auto-buy-server-started",
         "AutoBuy server started on port: {}",
         "AutoBuy server interrupted: {}",
         "auto-buy-server-error",
         "AutoBuy server error during start: {}"
      };
   }

   public void m28000() {
      if (!((AtomicBoolean)this.f4000[1]).compareAndSet(true, false)) {
         ((Logger)f10000[0]).warn(f9000[1]);
      } else {
         ((Logger)f10000[0]).info(f9000[2]);

         try {
            if ((Channel)this.f4000[5] != null && ((Channel)this.f4000[5]).isOpen()) {
               ((Channel)this.f4000[5]).close();
            }

            if ((EventLoopGroup)this.f4000[3] != null) {
               ((EventLoopGroup)this.f4000[3]).shutdownGracefully();
            }

            if ((EventLoopGroup)this.f4000[4] != null) {
               ((EventLoopGroup)this.f4000[4]).shutdownGracefully();
            }
         } catch (Exception var2) {
            C0106.m32000(C1188.m16000(f9000[3], var2.getMessage()));
            ((Logger)f10000[0]).error(f9000[4], var2.getMessage(), var2);
         }
      }
   }

   private static void m36000() {
      f10000 = new Object[]{null};
   }

   public void m46000() {
      if (!((AtomicBoolean)this.f4000[1]).compareAndSet(false, true)) {
         ((Logger)f10000[0]).warn(f9000[5]);
      } else {
         Thread var1 = new Thread(
            () -> {
               NioEventLoopGroup var8 = new NioEventLoopGroup(f3000[0]);
               this.f4000[3] = var8;
               NioEventLoopGroup var9 = new NioEventLoopGroup();
               this.f4000[4] = var9;
               boolean var14 = false /* VF: Semaphore variable */;

               label103: {
                  label104: {
                     try {
                        var14 = true;
                        ServerBootstrap var1x = new ServerBootstrap();
                        ((ServerBootstrap)((ServerBootstrap)var1x.group((EventLoopGroup)this.f4000[3], (EventLoopGroup)this.f4000[4])
                                 .channel(NioServerSocketChannel.class))
                              .option(ChannelOption.SO_BACKLOG, 16))
                           .childOption(ChannelOption.SO_KEEPALIVE, f3000[1])
                           .childHandler(new AutoPart(this));
                        ChannelFuture var2 = var1x.bind(f1000[0], (Integer)this.f4000[2]).sync();
                        Channel var10 = var2.channel();
                        this.f4000[5] = var10;
                        String var22 = f1000[1];
                        Object[] var23 = new Object[f3000[2]];
                        var23[f3000[3]] = (Integer)this.f4000[2];
                        C0106.m32000(C1188.m16000(var22, var23));
                        ((Logger)f10000[0]).info(f1000[2], (Integer)this.f4000[2]);
                        ((Channel)this.f4000[5]).closeFuture().sync();
                        var14 = false;
                        break label103;
                     } catch (InterruptedException var15) {
                        ((Logger)f10000[0]).error(f1000[3], var15.getMessage(), var15);
                        var14 = false;
                     } catch (Exception var16) {
                        String var10000 = f1000[4];
                        Object[] var10001 = new Object[f3000[6]];
                        var10001[f3000[7]] = var16.getMessage();
                        C0106.m32000(C1188.m16000(var10000, var10001));
                        ((Logger)f10000[0]).error(f1000[5], var16.getMessage(), var16);
                        var14 = false;
                        break label104;
                     } finally {
                        if (var14) {
                           ((AtomicBoolean)this.f4000[1]).set((boolean)0);
                           if ((EventLoopGroup)this.f4000[3] != null) {
                              ((EventLoopGroup)this.f4000[3]).shutdownGracefully();
                           }

                           if ((EventLoopGroup)this.f4000[4] != null) {
                              ((EventLoopGroup)this.f4000[4]).shutdownGracefully();
                           }
                        }
                     }

                     ((AtomicBoolean)this.f4000[1]).set(f3000[5]);
                     if ((EventLoopGroup)this.f4000[3] != null) {
                        ((EventLoopGroup)this.f4000[3]).shutdownGracefully();
                     }

                     if ((EventLoopGroup)this.f4000[4] != null) {
                        ((EventLoopGroup)this.f4000[4]).shutdownGracefully();
                     }

                     return;
                  }

                  ((AtomicBoolean)this.f4000[1]).set((boolean)0);
                  if ((EventLoopGroup)this.f4000[3] != null) {
                     ((EventLoopGroup)this.f4000[3]).shutdownGracefully();
                  }

                  if ((EventLoopGroup)this.f4000[4] != null) {
                     ((EventLoopGroup)this.f4000[4]).shutdownGracefully();
                  }

                  return;
               }

               ((AtomicBoolean)this.f4000[1]).set(f3000[4]);
               if ((EventLoopGroup)this.f4000[3] != null) {
                  ((EventLoopGroup)this.f4000[3]).shutdownGracefully();
               }

               if ((EventLoopGroup)this.f4000[4] != null) {
                  ((EventLoopGroup)this.f4000[4]).shutdownGracefully();
               }
            },
            f9000[6]
         );
         var1.setDaemon((boolean)1);
         var1.start();
      }
   }

   public void m52000() {
      if (this.m64000()) {
         ((Logger)f10000[0]).warn(f9000[0], (Integer)this.f4000[2]);
      } else {
         try {
            Integer var6 = NNWi.N();
            this.f4000[2] = var6;
            m60000((Integer)this.f4000[2]);
         } catch (IOException var7) {
            C0106.m32000(var7.getMessage());
            return;
         }

         this.m46000();
      }
   }

   private void m54000() {
      if (this.f4000 == null) {
         this.f4000 = new Object[6];
         Object[] var1 = this.f4000;
         var1[2] = 0;
      }
   }

   public void m58000(Channel var1, String var2) {
      if (var1 != null && var1.isActive()) {
         var1.writeAndFlush(new TextWebSocketFrame(var2));
      }
   }

   private static void m60000(int var0) throws IOException {
      try {
         File var1 = (File)NNuU.Nq().l[1];
         Path var2 = var1.toPath().resolve(f7000[0]);
         if (!Files.exists(var2)) {
            Files.createFile(var2);
         }

         Path var3 = var2.getParent();
         if (var3 != null && !Files.exists(var3)) {
            Files.createDirectories(var3);
         }

         Files.writeString(var2, Integer.toString(var0), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE);
      } catch (IOException var4) {
         ((Logger)f10000[0]).error(f7000[1], var4.getMessage(), var4);
         throw new IOException(C1235.m36000(f7000[2]).formatted(var4.getMessage()));
      }
   }

   public void m62000(String var1) {
      ((ChannelGroup)this.f4000[0]).forEach(var2 -> this.m58000(var2, var1));
   }

   public boolean m64000() {
      return (boolean)(((AtomicBoolean)this.f4000[1]).get()
            && (Channel)this.f4000[5] != null
            && ((Channel)this.f4000[5]).isOpen()
            && ((Channel)this.f4000[5]).isActive()
         ? 1
         : 0);
   }
}

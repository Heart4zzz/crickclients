package rw.net;

import io.netty.channel.Channel;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.ssl.SslHandler;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import org.apache.logging.log4j.Logger;

public class C0025 {
   private static String[] f1000;
   public static Object[] f2000;

   static {
      ntfClinit();
   }

   private static void m10000() {
      f2000 = new Object[]{null};
   }

   public boolean m20000(ChannelPipeline var1, Channel var2, SocketClient var3) {
      try {
         SSLEngine var4 = C0028.m16000().newEngine(var2.alloc(), var3.m8000(), var3.m32000());
         SSLParameters var5 = var4.getSSLParameters();
         var5.setEndpointIdentificationAlgorithm(f1000[0]);
         var4.setSSLParameters(var5);
         var4.setUseClientMode((boolean)1);
         SslHandler var6 = new SslHandler(var4);
         var1.addFirst(f1000[1], var6);
         var6.handshakeFuture().addListener(var0 -> {
            if (!var0.isSuccess()) {
               ((Logger)f2000[0]).error(f1000[3], var0.cause());
            }
         });
         return (boolean)1;
      } catch (Exception var7) {
         ((Logger)f2000[0]).error(f1000[2], var7);
         return (boolean)0;
      }
   }

   private static void m26000() {
      f1000 = new String[]{"HTTPS", "ssl", "Failed to initialize SSL context", "SSL handshake FAILED"};
   }
}

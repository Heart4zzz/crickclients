package rw.net;

import io.netty.handler.ssl.ApplicationProtocolConfig;
import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslContextBuilder;
import io.netty.handler.ssl.ApplicationProtocolConfig.Protocol;
import io.netty.handler.ssl.ApplicationProtocolConfig.SelectedListenerFailureBehavior;
import io.netty.handler.ssl.ApplicationProtocolConfig.SelectorFailureBehavior;
import rw.setting.C0155;

public class C0028 {
   private static String[] f1000;

   private C0028() {
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      f1000 = new String[]{"TLSv1.3", "TLSv1.2", "http/1.1"};
   }

   public static SslContext m16000() throws Exception {
      return SslContextBuilder.forClient()
         .protocols(new String[]{f1000[0], f1000[1]})
         .trustManager(C0155.m20000())
         .applicationProtocolConfig(
            new ApplicationProtocolConfig(Protocol.ALPN, SelectorFailureBehavior.NO_ADVERTISE, SelectedListenerFailureBehavior.ACCEPT, new String[]{f1000[2]})
         )
         .build();
   }
}

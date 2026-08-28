package rw.net;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.codec.http.HttpClientCodec;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandler;
import io.netty.handler.codec.http.websocketx.WebSocketVersion;
import java.net.URI;

public class AutoBuyXPart extends ChannelInitializer<Channel> {
   private static int[] f1000;
   private static byte[] f2000;
   private static short[] f3000;
   private static boolean[] f4000;
   public Object[] f5000;
   private static boolean[] f6000;

   private static void m4000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = 2;
   }

   public AutoBuyXPart(AutoBuyX var1, URI var2) {
      this.m8000();
      this.f5000[f3000[0]] = var1;
      this.f5000[f3000[1]] = var2;
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      short[] var128 = new short[4];
      f3000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f3000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[2] = (short)((0 | -0) >>> 31);
      f3000[3] = (short)((1 | -1) >>> 31);
   }

   private void m8000() {
      if (this.f5000 == null) {
         this.f5000 = new Object[f2000[0]];
         Object[] var1 = this.f5000;
      }
   }

   private static void m12000() {
      int[] var128 = new int[2];
      f1000[(0 | -0) >>> 31] = 65536;
      f1000[(1 | -1) >>> 31] = 65536;
   }

   private static void m18000() {
      boolean[] var128 = new boolean[8];
      f6000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f6000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f6000[2] = (boolean)((1 | -1) >>> 31);
      f6000[3] = (boolean)((0 | -0) >>> 31);
      f6000[4] = (boolean)((1 | -1) >>> 31);
      f6000[5] = (boolean)((0 | -0) >>> 31);
      f6000[6] = (boolean)((0 | -0) >>> 31);
      f6000[7] = (boolean)((1 | -1) >>> 31);
      boolean[] var129 = new boolean[(1 | -1) >>> 31];
      f4000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
   }

   public void initChannel(Channel var1) {
      ChannelPipeline var2 = var1.pipeline();
      ChannelHandler[] var10001 = new ChannelHandler[f6000[0]];
      var10001[f6000[1]] = new HttpClientCodec();
      var2.addLast(var10001);
      var10001 = new ChannelHandler[f6000[2]];
      var10001[f6000[3]] = new HttpObjectAggregator(f1000[0]);
      var2.addLast(var10001);
      var10001 = new ChannelHandler[f6000[4]];
      var10001[f6000[5]] = new WebSocketClientProtocolHandler((URI)this.f5000[f3000[2]], WebSocketVersion.V13, null, f6000[6], null, f1000[1]);
      var2.addLast(var10001);
      var10001 = new ChannelHandler[f6000[7]];
      var10001[f4000[0]] = new AutoBuyXPartPart((AutoBuyX)this.f5000[f3000[3]]);
      var2.addLast(var10001);
   }
}

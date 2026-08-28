package rw.net;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.group.ChannelGroup;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;

public class AutoPart extends ChannelInitializer<Channel> {
   private static boolean[] f1000;
   private static int[] f2000;
   public Object[] f3000;
   private static boolean[] f4000;
   private static short[] f5000;
   private static String[] f6000;

   private static void m2000() {
      f6000 = new String[(1 | -1) >>> 31];
      f6000[(0 | -0) >>> 31] = "/autobuy";
   }

   public AutoPart(Auto var1) {
      this.m12000();
      this.f3000[f5000[0]] = var1;
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      short[] var128 = new short[3];
      f5000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f5000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f5000[2] = (short)((0 | -0) >>> 31);
   }

   private static void m8000() {
      int[] var128 = new int[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = 65536;
   }

   private void m12000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[f4000[7]];
         Object[] var1 = this.f3000;
      }
   }

   private static void m20000() {
      boolean[] var128 = new boolean[2];
      f1000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      boolean[] var129 = new boolean[8];
      f4000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[2] = (boolean)((1 | -1) >>> 31);
      f4000[3] = (boolean)((0 | -0) >>> 31);
      f4000[4] = (boolean)((1 | -1) >>> 31);
      f4000[5] = (boolean)((1 | -1) >>> 31);
      f4000[6] = (boolean)((0 | -0) >>> 31);
      f4000[7] = (boolean)((1 | -1) >>> 31);
   }

   public void initChannel(Channel var1) {
      ChannelPipeline var2 = var1.pipeline();
      ChannelHandler[] var10001 = new ChannelHandler[f1000[0]];
      var10001[f1000[1]] = new HttpServerCodec();
      var2.addLast(var10001);
      var10001 = new ChannelHandler[f4000[0]];
      var10001[f4000[1]] = new HttpObjectAggregator(f2000[0]);
      var2.addLast(var10001);
      var10001 = new ChannelHandler[f4000[2]];
      var10001[f4000[3]] = new WebSocketServerProtocolHandler(f6000[0], null, f4000[4]);
      var2.addLast(var10001);
      var10001 = new ChannelHandler[f4000[5]];
      var10001[f4000[6]] = new IlspimrIs((ChannelGroup)((Auto)this.f3000[f5000[1]]).f4000[f5000[2]]);
      var2.addLast(var10001);
   }
}

package rw.net;

import KDFzREm.NNuU;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import org.apache.logging.log4j.Logger;
import rw.NursultanClient;
import rw.core.C1188;
import rw.data.Rec0217;
import rw.setting.C0106;

public class IlspimrIs extends SimpleChannelInboundHandler<TextWebSocketFrame> {
   private static short[] f1000;
   private static String[] f2000;
   public Object[] f3000;
   public static Object[] f4000;
   private static boolean[] f5000;

   private static void m2000() {
      f2000 = new String[2];
      f2000[(0 | -0) >>> 31] = "auto-buy-c2s-connected";
      f2000[(1 | -1) >>> 31] = "auto-buy-c2s-disconnected";
   }

   public IlspimrIs(ChannelGroup var1) {
      this.m22000();
      this.f3000[f1000[0]] = var1;
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      short[] var128 = new short[4];
      f1000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[2] = (short)((0 | -0) >>> 31);
      f1000[3] = (short)((0 | -0) >>> 31);
   }

   private static void m12000() {
      f4000 = new Object[f5000[6]];
   }

   private static void m16000() {
      boolean[] var128 = new boolean[7];
      f5000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f5000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f5000[2] = (boolean)((1 | -1) >>> 31);
      f5000[3] = (boolean)((0 | -0) >>> 31);
      f5000[4] = (boolean)((0 | -0) >>> 31);
      f5000[5] = (boolean)((1 | -1) >>> 31);
      f5000[6] = (boolean)((1 | -1) >>> 31);
   }

   public void m20000(ChannelHandlerContext var1, TextWebSocketFrame var2) {
      String var3 = var2.text();
      NNuU.Nq().execute(() -> NursultanClient.m8000().m12000(new Rec0217(var3)));
   }

   private void m22000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[f5000[5]];
         Object[] var1 = this.f3000;
      }
   }

   public void handlerRemoved(ChannelHandlerContext var1) {
      Channel var2 = var1.channel();
      ((ChannelGroup)this.f3000[f1000[2]]).remove(var2);
      String var10000 = f2000[1];
      Object[] var10001 = new Object[f5000[2]];
      var10001[f5000[3]] = var2.remoteAddress();
      C0106.m32000(C1188.m16000(var10000, var10001));
   }

   public void exceptionCaught(ChannelHandlerContext var1, Throwable var2) {
      ((Logger)f4000[f1000[3]]).error(var2, var2);
      var1.close();
   }

   public void handlerAdded(ChannelHandlerContext var1) {
      Channel var2 = var1.channel();
      ((ChannelGroup)this.f3000[f1000[1]]).add(var2);
      String var10000 = f2000[0];
      Object[] var10001 = new Object[f5000[0]];
      var10001[f5000[1]] = var2.remoteAddress();
      C0106.m32000(C1188.m16000(var10000, var10001));
   }
}
